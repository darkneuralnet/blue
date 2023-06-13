package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetBlipsProviderFactory implements InterfaceC48812sj1<BlipsProvider> {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        return (BlipsProvider) C51679xZ3.m5002e(coreModule.getBlipsProvider());
    }

    @Override // p000.Y94
    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}
