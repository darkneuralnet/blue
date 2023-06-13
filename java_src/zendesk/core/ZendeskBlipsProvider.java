package zendesk.core;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskBlipsProvider implements BlipsProvider, BlipsCoreProvider {
    static final String ACTION_CORE_INIT = "init";
    static final String ACTION_CORE_PUSH_OFF = "PushOff";
    static final String ACTION_CORE_PUSH_ON = "PushOn";
    static final String BLIPS_CORE_CATEGORY = "CoreSDK";
    private static final String BLIP_VALUE_STRING = "payload";
    private static final String CHANNEL_CORE_SDK = "core_sdk";
    private static final String CODE_FIELD_NAME_STRING = "code";
    private static final String CODE_VALUE_JAVA_STRING = "java";
    private static final String CORE_VERSION_STRING = "4.0.7";
    private static final String DEVICE_INFO_FIELD_STRING = "device";
    private static final String LOG_TAG = "ZendeskBlipsProvider";
    private final String appId;
    private final BlipsService blipsService;
    private final CoreSettingsStorage coreSettingsStorage;
    private final DeviceInfo deviceInfo;
    private final Executor executor;
    private final IdentityManager identityManager;
    private final Serializer serializer;

    public ZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, String str, CoreSettingsStorage coreSettingsStorage, Executor executor) {
        this.blipsService = blipsService;
        this.deviceInfo = deviceInfo;
        this.serializer = serializer;
        this.identityManager = identityManager;
        this.appId = str;
        this.coreSettingsStorage = coreSettingsStorage;
        this.executor = executor;
    }

    private Map<String, Object> addDeviceInfoToValue(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(DEVICE_INFO_FIELD_STRING, this.deviceInfo.getInfo());
        if (map != null && !map.isEmpty()) {
            hashMap.put(BLIP_VALUE_STRING, map);
        }
        return hashMap;
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void coreInitialized() {
        HashMap hashMap = new HashMap();
        hashMap.put("code", CODE_VALUE_JAVA_STRING);
        sendBlip(new UserAction("4.0.7", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_INIT, null, hashMap), BlipsGroup.REQUIRED);
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void corePushDisabled(Long l) {
        sendBlip(BlipsGroup.REQUIRED, new UserAction("4.0.7", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_PUSH_OFF), l);
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void corePushEnabled() {
        sendBlip(new UserAction("4.0.7", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_PUSH_ON), BlipsGroup.REQUIRED);
    }

    public BlipsRequest createBlipsRequest(UserAction userAction, String str, String str2, Long l) {
        return BlipsRequest.buildUserAction(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, userAction.getVersion(), userAction.getChannel(), userAction.getCategory(), userAction.getAction(), userAction.getLabel(), addDeviceInfoToValue(userAction.getValue()));
    }

    public void dispatchBlip(final BlipsRequest blipsRequest) {
        this.executor.execute(new Runnable() { // from class: zendesk.core.ZendeskBlipsProvider.1
            @Override // java.lang.Runnable
            public void run() {
                ZendeskBlipsProvider.this.blipsService.send(ZendeskBlipsProvider.this.serializer.serialize(blipsRequest)).mo1284E0(new ON4(new AbstractC44415lI6<Void>() { // from class: zendesk.core.ZendeskBlipsProvider.1.1
                    @Override // p000.AbstractC44415lI6
                    public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                        C33694Ix2.m101457b(ZendeskBlipsProvider.LOG_TAG, "Unable to send Blip | Error: %s", interfaceC48782sg1.mo9891c());
                    }

                    @Override // p000.AbstractC44415lI6
                    public void onSuccess(Void r1) {
                    }
                }));
            }
        });
    }

    @Override // zendesk.core.BlipsProvider
    public void sendBlip(UserAction userAction, BlipsGroup blipsGroup) {
        sendBlip(blipsGroup, userAction, this.identityManager.getUserId());
    }

    public void sendBlip(BlipsGroup blipsGroup, UserAction userAction, Long l) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C44504lS5.m27273b(userAction.getChannel())) {
            dispatchBlip(createBlipsRequest(userAction, this.identityManager.getBlipsUuid(), this.appId, l));
        }
    }

    public BlipsRequest createBlipsRequest(PageView pageView, String str, String str2, Long l) {
        return BlipsRequest.buildPageView(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, pageView.getVersion(), pageView.getChannel(), pageView.getUrl(), pageView.getNavigatorLanguage(), pageView.getPageTitle(), pageView.getPageId(), pageView.getPageLocale(), addDeviceInfoToValue(pageView.getValue()));
    }

    @Override // zendesk.core.BlipsProvider
    public void sendBlip(PageView pageView, BlipsGroup blipsGroup) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C44504lS5.m27273b(pageView.getChannel())) {
            dispatchBlip(createBlipsRequest(pageView, this.identityManager.getBlipsUuid(), this.appId, this.identityManager.getUserId()));
        }
    }
}
