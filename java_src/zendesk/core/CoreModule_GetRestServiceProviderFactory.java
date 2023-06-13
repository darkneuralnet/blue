package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetRestServiceProviderFactory implements InterfaceC48812sj1<RestServiceProvider> {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetRestServiceProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public static RestServiceProvider getRestServiceProvider(CoreModule coreModule) {
        return (RestServiceProvider) C51679xZ3.m5002e(coreModule.getRestServiceProvider());
    }

    @Override // p000.Y94
    public RestServiceProvider get() {
        return getRestServiceProvider(this.module);
    }
}
