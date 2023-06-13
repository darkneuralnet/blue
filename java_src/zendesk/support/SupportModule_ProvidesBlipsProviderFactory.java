package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportModule_ProvidesBlipsProviderFactory implements InterfaceC48812sj1<SupportBlipsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesBlipsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }

    public static SupportBlipsProvider providesBlipsProvider(SupportModule supportModule) {
        return (SupportBlipsProvider) C51679xZ3.m5002e(supportModule.providesBlipsProvider());
    }

    @Override // p000.Y94
    public SupportBlipsProvider get() {
        return providesBlipsProvider(this.module);
    }
}
