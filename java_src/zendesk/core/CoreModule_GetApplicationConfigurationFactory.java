package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetApplicationConfigurationFactory implements InterfaceC48812sj1<ApplicationConfiguration> {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationConfigurationFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration getApplicationConfiguration(CoreModule coreModule) {
        return (ApplicationConfiguration) C51679xZ3.m5002e(coreModule.getApplicationConfiguration());
    }

    @Override // p000.Y94
    public ApplicationConfiguration get() {
        return getApplicationConfiguration(this.module);
    }
}
