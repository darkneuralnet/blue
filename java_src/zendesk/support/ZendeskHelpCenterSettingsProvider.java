package zendesk.support;

import java.util.Locale;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskHelpCenterSettingsProvider implements HelpCenterSettingsProvider {
    private static final String HELP_CENTER_KEY = "help_center";
    private static final String LOG_TAG = "HelpCenterSettingsProvider";
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    private final SettingsProvider sdkSettingsProvider;

    public ZendeskHelpCenterSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            String locale = helpCenterSettings.getLocale();
            String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
            if (!helpCenterLocaleString.equals(locale)) {
                C33694Ix2.m101447l(LOG_TAG, "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
            }
        }
    }

    @Override // zendesk.support.HelpCenterSettingsProvider
    public void getSettings(final AbstractC44415lI6<HelpCenterSettings> abstractC44415lI6) {
        this.sdkSettingsProvider.getSettingsForSdk(HELP_CENTER_KEY, HelpCenterSettings.class, new AbstractC44415lI6<SettingsPack<HelpCenterSettings>>() { // from class: zendesk.support.ZendeskHelpCenterSettingsProvider.1
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                if (abstractC44415lI6 != null) {
                    C33694Ix2.m101457b(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Returning default Help Center Settings.", new Object[0]);
                    abstractC44415lI6.onSuccess(HelpCenterSettings.defaultSettings());
                }
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
                ZendeskHelpCenterSettingsProvider.this.logIfLocaleNotAvailable(settingsPack.getSettings());
                C33694Ix2.m101457b(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Successfully retrieved Help Center Settings", new Object[0]);
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(settingsPack.getSettings());
                }
            }
        });
    }
}
