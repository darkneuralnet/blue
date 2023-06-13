package zendesk.support;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideUploadProviderFactory implements InterfaceC48812sj1<UploadProvider> {
    private final ProviderModule module;
    private final Y94<ZendeskUploadService> uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, Y94<ZendeskUploadService> y94) {
        this.module = providerModule;
        this.uploadServiceProvider = y94;
    }

    public static ProviderModule_ProvideUploadProviderFactory create(ProviderModule providerModule, Y94<ZendeskUploadService> y94) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, y94);
    }

    public static UploadProvider provideUploadProvider(ProviderModule providerModule, Object obj) {
        return (UploadProvider) C51679xZ3.m5002e(providerModule.provideUploadProvider((ZendeskUploadService) obj));
    }

    @Override // p000.Y94
    public UploadProvider get() {
        return provideUploadProvider(this.module, this.uploadServiceProvider.get());
    }
}
