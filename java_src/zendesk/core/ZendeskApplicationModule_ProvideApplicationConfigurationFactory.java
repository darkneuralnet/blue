package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements InterfaceC48812sj1<ApplicationConfiguration> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        return (ApplicationConfiguration) C51679xZ3.m5002e(zendeskApplicationModule.provideApplicationConfiguration());
    }

    @Override // p000.Y94
    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}
