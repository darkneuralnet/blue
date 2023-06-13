package zendesk.core;

import android.content.Context;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private static final String LOG_TAG = "ZendeskSdkSettingsProvi";
    static final int SDK_SETTINGS_MAX_AGE_HOURS = 1;
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    private final CoreSettingsStorage coreSettingsStorage;
    private final Serializer serializer;
    private final SdkSettingsService settingsService;
    private final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    public ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, String str, Context context) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage;
        this.coreSettingsStorage = coreSettingsStorage;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.serializer = serializer;
        this.zendeskLocaleConverter = zendeskLocaleConverter;
        this.applicationId = str;
        this.context = context;
    }

    private void getSettingsInternal(Locale locale, AbstractC44415lI6<Map<String, AbstractC52360yi2>> abstractC44415lI6) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).mo1284E0(new ON4(abstractC44415lI6));
    }

    public CoreSettings extractCoreSettings(Map<String, AbstractC52360yi2> map) {
        AbstractC52360yi2 abstractC52360yi2;
        if (map == null) {
            abstractC52360yi2 = null;
        } else {
            abstractC52360yi2 = map.get("core");
        }
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(abstractC52360yi2, CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public BlipsSettings getBlipsSettings() {
        return this.coreSettingsStorage.getBlipsSettings();
    }

    @Override // zendesk.core.SettingsProvider
    public void getCoreSettings(final AbstractC44415lI6<CoreSettings> abstractC44415lI6) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new AbstractC44415lI6<Map<String, AbstractC52360yi2>>() { // from class: zendesk.core.ZendeskSettingsProvider.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(Map<String, AbstractC52360yi2> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (abstractC44415lI6 != null) {
                        abstractC44415lI6.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (abstractC44415lI6 != null) {
            abstractC44415lI6.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    @Override // zendesk.core.SettingsProvider
    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final AbstractC44415lI6<SettingsPack<E>> abstractC44415lI6) {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onSuccess(new SettingsPack<>(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
                this.actionHandlerRegistry.updateSettings(this.settingsStorage.getRawSettings());
                return;
            }
            return;
        }
        getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new AbstractC44415lI6<Map<String, AbstractC52360yi2>>() { // from class: zendesk.core.ZendeskSettingsProvider.2
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                if (abstractC44415lI6 == null) {
                    return;
                }
                if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                    abstractC44415lI6.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                    return;
                }
                abstractC44415lI6.onError(interfaceC48782sg1);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Map<String, AbstractC52360yi2> map) {
                ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                if (abstractC44415lI6 != null) {
                    abstractC44415lI6.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                }
            }
        });
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, AbstractC52360yi2> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0L), null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    private Map<String, AbstractC52360yi2> getSettingsInternal(Locale locale) {
        try {
            HM4<Map<String, AbstractC52360yi2>> execute = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).execute();
            if (execute.m103944a() != null) {
                return new HashMap(execute.m103944a());
            }
            return new HashMap(0);
        } catch (IOException unused) {
            C33694Ix2.m101454e(LOG_TAG, "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}
