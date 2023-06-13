package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public enum Zendesk {
    INSTANCE;
    
    private static final String LOG_TAG = "Zendesk";
    private ActionHandlerRegistry actionHandlerRegistry = new ZendeskActionHandlerRegistry();
    private ZendeskShadow zendeskShadow;

    Zendesk() {
    }

    public static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null && C44504lS5.m27272c(str, str2, str3)) {
            return true;
        }
        C33694Ix2.m101454e(LOG_TAG, String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", context, Boolean.valueOf(C44504lS5.m27273b(str)), Boolean.valueOf(C44504lS5.m27273b(str2)), Boolean.valueOf(C44504lS5.m27273b(str3))), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        if (!isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, "Cannot get CoreModule before SDK has been initialized. init() must be called before coreModule().", new Object[0]);
            return null;
        }
        return this.zendeskShadow.coreModule();
    }

    public Identity getIdentity() {
        if (!isInitialized()) {
            return null;
        }
        return this.zendeskShadow.getIdentity();
    }

    public void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        } else if (getIdentity() == null) {
            C33694Ix2.m101454e(LOG_TAG, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        } else {
            return this.zendeskShadow.providers();
        }
    }

    public void reset() {
        if (isInitialized()) {
            this.zendeskShadow.reset();
            this.zendeskShadow = null;
            C33694Ix2.m101452g(LOG_TAG, "Tearing down Zendesk", new Object[0]);
            return;
        }
        C33694Ix2.m101452g(LOG_TAG, "Cant reset, Zendesk is uninitialized", new Object[0]);
    }

    public void setIdentity(Identity identity) {
        if (!isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
        } else {
            this.zendeskShadow.setIdentity(identity);
        }
    }

    public void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        ZendeskShadow zendeskShadow = this.zendeskShadow;
        boolean z = zendeskShadow != null;
        if (z) {
            zendeskShadow.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow2 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow2.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow2;
    }
}
