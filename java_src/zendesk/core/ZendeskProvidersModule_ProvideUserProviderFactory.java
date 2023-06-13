package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideUserProviderFactory implements InterfaceC48812sj1<UserProvider> {
    private final Y94<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(Y94<UserService> y94) {
        this.userServiceProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(Y94<UserService> y94) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(y94);
    }

    public static UserProvider provideUserProvider(Object obj) {
        return (UserProvider) C51679xZ3.m5002e(ZendeskProvidersModule.provideUserProvider((UserService) obj));
    }

    @Override // p000.Y94
    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}
