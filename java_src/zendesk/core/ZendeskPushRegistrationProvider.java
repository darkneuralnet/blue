package zendesk.core;

import java.io.IOException;
import java.util.Locale;
import p000.ON4;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    private static final String LOG_TAG = "PushRegistrationProvider";
    private static final ON4.InterfaceC5984b<PushRegistrationResponseWrapper, String> PUSH_RESPONSE_EXTRACTOR = new ON4.InterfaceC5984b<PushRegistrationResponseWrapper, String>() { // from class: zendesk.core.ZendeskPushRegistrationProvider.4
        @Override // p000.ON4.InterfaceC5984b
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !C44504lS5.m27273b(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    private final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    private final Locale locale;
    private final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    /* loaded from: classes8.dex */
    public enum TokenType {
        Identifier(null),
        UrbanAirshipChannelId("urban_airship_channel_id");
        
        final String name;

        TokenType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager;
        this.settingsProvider = settingsProvider;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale;
    }

    private boolean checkForStoredPushRegistration(String str, AbstractC44415lI6<String> abstractC44415lI6) {
        if (!C44504lS5.m27273b(str)) {
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("Invalid identifier provided."));
            }
            C33694Ix2.m101447l(LOG_TAG, "Invalid identifier provided.", new Object[0]);
            return true;
        } else if (this.pushIdStorage.hasRegisteredDeviceId() && str.equals(this.pushIdStorage.getRegisteredDeviceId())) {
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onSuccess(str);
            }
            C33694Ix2.m101457b(LOG_TAG, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        } else {
            if (this.pushIdStorage.hasRegisteredDeviceId()) {
                this.pushIdStorage.removeRegisteredDeviceId();
                C33694Ix2.m101457b(LOG_TAG, "Removing stored push registration response because a new one has been provided.", new Object[0]);
            }
            return false;
        }
    }

    private void getAuthTypeAndRequest(final String str, final TokenType tokenType, final AbstractC44415lI6<String> abstractC44415lI6) {
        if (checkForStoredPushRegistration(str, abstractC44415lI6)) {
            return;
        }
        this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(abstractC44415lI6) { // from class: zendesk.core.ZendeskPushRegistrationProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(CoreSettings coreSettings) {
                AuthenticationType authentication = coreSettings.getAuthentication();
                if (authentication == null) {
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onError(new C49968ug1("Authentication type is null."));
                        return;
                    }
                    return;
                }
                ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                PushRegistrationRequest pushRegistrationRequest = zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, tokenType);
                if (ZendeskPushRegistrationProvider.this.hasNoStoredAccessToken()) {
                    ZendeskPushRegistrationProvider.this.storePendingPushRegistrationRequest(pushRegistrationRequest, abstractC44415lI6);
                } else {
                    ZendeskPushRegistrationProvider.this.sendPushRegistrationRequest(pushRegistrationRequest, abstractC44415lI6);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PushRegistrationRequest getPushRegistrationRequest(String str, Locale locale, AuthenticationType authenticationType, TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(C32272Cv2.m111342d(locale));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNoStoredAccessToken() {
        return this.identityManager.getStoredAccessTokenAsBearerToken() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, final AbstractC44415lI6<String> abstractC44415lI6) {
        this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).mo1284E0(new ON4(new PassThroughErrorZendeskCallback<String>(abstractC44415lI6) { // from class: zendesk.core.ZendeskPushRegistrationProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.onSuccessfulRegistration(str);
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storePendingPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, AbstractC44415lI6<String> abstractC44415lI6) {
        this.pushIdStorage.storePushRegistrationRequest(pushRegistrationRequest);
        if (abstractC44415lI6 != null) {
            abstractC44415lI6.onSuccess(pushRegistrationRequest.getIdentifier());
        }
    }

    @Override // zendesk.core.PushRegistrationProvider
    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasRegisteredDeviceId();
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithDeviceIdentifier(String str, AbstractC44415lI6<String> abstractC44415lI6) {
        getAuthTypeAndRequest(str, TokenType.Identifier, abstractC44415lI6);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithUAChannelId(String str, AbstractC44415lI6<String> abstractC44415lI6) {
        getAuthTypeAndRequest(str, TokenType.UrbanAirshipChannelId, abstractC44415lI6);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void unregisterDevice(final AbstractC44415lI6<Void> abstractC44415lI6) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).mo1284E0(new ON4(new PassThroughErrorZendeskCallback<Void>(abstractC44415lI6) { // from class: zendesk.core.ZendeskPushRegistrationProvider.2
                @Override // zendesk.core.PassThroughErrorZendeskCallback, p000.AbstractC44415lI6
                public void onSuccess(Void r3) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onSuccess(r3);
                    }
                }
            }));
        }
    }

    @Override // zendesk.core.PushRegistrationProviderInternal
    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            HM4<PushRegistrationResponseWrapper> execute = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).execute();
            if (execute.m103944a() == null || execute.m103944a().getRegistrationResponse() == null) {
                return "";
            }
            String identifier = execute.m103944a().getRegistrationResponse().getIdentifier();
            onSuccessfulRegistration(identifier);
            return identifier;
        } catch (IOException e) {
            C33694Ix2.m101455d(LOG_TAG, "Push registration request failed.", e, new Object[0]);
            return "";
        }
    }
}
