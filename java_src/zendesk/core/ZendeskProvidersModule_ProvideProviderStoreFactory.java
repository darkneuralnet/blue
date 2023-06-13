package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements InterfaceC48812sj1<ProviderStore> {
    private final Y94<PushRegistrationProvider> pushRegistrationProvider;
    private final Y94<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(Y94<UserProvider> y94, Y94<PushRegistrationProvider> y942) {
        this.userProvider = y94;
        this.pushRegistrationProvider = y942;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(Y94<UserProvider> y94, Y94<PushRegistrationProvider> y942) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(y94, y942);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return (ProviderStore) C51679xZ3.m5002e(ZendeskProvidersModule.provideProviderStore(userProvider, pushRegistrationProvider));
    }

    @Override // p000.Y94
    public ProviderStore get() {
        return provideProviderStore(this.userProvider.get(), this.pushRegistrationProvider.get());
    }
}
