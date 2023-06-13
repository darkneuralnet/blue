package zendesk.support;

import java.util.Locale;
import zendesk.core.AuthenticationType;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskSupportSettingsProvider implements SupportSettingsProvider {
    private static final String HELP_CENTER_KEY = "help_center";
    private static final String LOG_TAG = "ZendeskSettingsProvider";
    static final String SUPPORT_KEY = "support";
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    private final SettingsProvider sdkSettingsProvider;

    /* loaded from: classes8.dex */
    public class LoadSupportSettings extends AbstractC44415lI6<SettingsPack<SupportSettings>> {
        private final AbstractC44415lI6<SupportSdkSettings> callback;

        /* loaded from: classes8.dex */
        public class LoadHelpCenterSettings extends AbstractC44415lI6<SettingsPack<HelpCenterSettings>> {
            private final AbstractC44415lI6<SupportSdkSettings> callback;
            private final SettingsPack<SupportSettings> supportSettingsPack;

            public LoadHelpCenterSettings(AbstractC44415lI6<SupportSdkSettings> abstractC44415lI6, SettingsPack<SupportSettings> settingsPack) {
                this.callback = abstractC44415lI6;
                this.supportSettingsPack = settingsPack;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                if (this.callback != null) {
                    C33694Ix2.m101457b(ZendeskSupportSettingsProvider.LOG_TAG, "Returning default Help Center Settings.", new Object[0]);
                    this.callback.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), HelpCenterSettings.defaultSettings(), this.supportSettingsPack.getCoreSettings().getAuthentication()));
                }
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
                HelpCenterSettings settings = settingsPack.getSettings();
                AuthenticationType authentication = settingsPack.getCoreSettings().getAuthentication();
                LoadSupportSettings.this.logIfLocaleNotAvailable(settings);
                C33694Ix2.m101457b(ZendeskSupportSettingsProvider.LOG_TAG, "Successfully retrieved Settings", new Object[0]);
                AbstractC44415lI6<SupportSdkSettings> abstractC44415lI6 = this.callback;
                if (abstractC44415lI6 != null) {
                    abstractC44415lI6.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), settings, authentication));
                }
            }
        }

        public LoadSupportSettings(AbstractC44415lI6<SupportSdkSettings> abstractC44415lI6) {
            this.callback = abstractC44415lI6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
            if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
                String locale = helpCenterSettings.getLocale();
                String helpCenterLocaleString = ZendeskSupportSettingsProvider.this.localeConverter.toHelpCenterLocaleString(ZendeskSupportSettingsProvider.this.deviceLocale);
                if (!helpCenterLocaleString.equals(locale)) {
                    C33694Ix2.m101447l(ZendeskSupportSettingsProvider.LOG_TAG, "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
                }
            }
        }

        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            if (this.callback != null) {
                C33694Ix2.m101457b(ZendeskSupportSettingsProvider.LOG_TAG, "Returning default Support Settings.", new Object[0]);
                this.callback.onSuccess(new SupportSdkSettings(SupportSettings.defaultSettings(), HelpCenterSettings.defaultSettings(), null));
            }
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(SettingsPack<SupportSettings> settingsPack) {
            ZendeskSupportSettingsProvider.this.sdkSettingsProvider.getSettingsForSdk(ZendeskSupportSettingsProvider.HELP_CENTER_KEY, HelpCenterSettings.class, new LoadHelpCenterSettings(this.callback, settingsPack));
        }
    }

    public ZendeskSupportSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    @Override // zendesk.support.SupportSettingsProvider
    public void getSettings(AbstractC44415lI6<SupportSdkSettings> abstractC44415lI6) {
        this.sdkSettingsProvider.getSettingsForSdk(SUPPORT_KEY, SupportSettings.class, new LoadSupportSettings(abstractC44415lI6));
    }
}
