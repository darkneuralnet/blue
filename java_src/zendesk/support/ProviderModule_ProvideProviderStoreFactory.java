package zendesk.support;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideProviderStoreFactory implements InterfaceC48812sj1<ProviderStore> {
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final Y94<RequestProvider> requestProvider;
    private final Y94<UploadProvider> uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, Y94<HelpCenterProvider> y94, Y94<RequestProvider> y942, Y94<UploadProvider> y943) {
        this.module = providerModule;
        this.helpCenterProvider = y94;
        this.requestProvider = y942;
        this.uploadProvider = y943;
    }

    public static ProviderModule_ProvideProviderStoreFactory create(ProviderModule providerModule, Y94<HelpCenterProvider> y94, Y94<RequestProvider> y942, Y94<UploadProvider> y943) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, y94, y942, y943);
    }

    public static ProviderStore provideProviderStore(ProviderModule providerModule, HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        return (ProviderStore) C51679xZ3.m5002e(providerModule.provideProviderStore(helpCenterProvider, requestProvider, uploadProvider));
    }

    @Override // p000.Y94
    public ProviderStore get() {
        return provideProviderStore(this.module, this.helpCenterProvider.get(), this.requestProvider.get(), this.uploadProvider.get());
    }
}
