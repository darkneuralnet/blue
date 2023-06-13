package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportModule_ProvidesUploadProviderFactory implements InterfaceC48812sj1<UploadProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesUploadProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }

    public static UploadProvider providesUploadProvider(SupportModule supportModule) {
        return (UploadProvider) C51679xZ3.m5002e(supportModule.providesUploadProvider());
    }

    @Override // p000.Y94
    public UploadProvider get() {
        return providesUploadProvider(this.module);
    }
}
