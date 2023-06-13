package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements InterfaceC48812sj1<AccessProvider> {
    private final Y94<AccessService> accessServiceProvider;
    private final Y94<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(Y94<IdentityManager> y94, Y94<AccessService> y942) {
        this.identityManagerProvider = y94;
        this.accessServiceProvider = y942;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(Y94<IdentityManager> y94, Y94<AccessService> y942) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(y94, y942);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        return (AccessProvider) C51679xZ3.m5002e(ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2));
    }

    @Override // p000.Y94
    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}
