package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideAuthProviderFactory implements InterfaceC48812sj1<AuthenticationProvider> {
    private final Y94<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(Y94<IdentityManager> y94) {
        this.identityManagerProvider = y94;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(Y94<IdentityManager> y94) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(y94);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        return (AuthenticationProvider) C51679xZ3.m5002e(ZendeskStorageModule.provideAuthProvider((IdentityManager) obj));
    }

    @Override // p000.Y94
    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}
