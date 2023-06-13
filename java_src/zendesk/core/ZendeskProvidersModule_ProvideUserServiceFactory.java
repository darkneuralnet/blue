package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideUserServiceFactory implements InterfaceC48812sj1<UserService> {
    private final Y94<MN4> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(Y94<MN4> y94) {
        this.retrofitProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(Y94<MN4> y94) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(y94);
    }

    public static UserService provideUserService(MN4 mn4) {
        return (UserService) C51679xZ3.m5002e(ZendeskProvidersModule.provideUserService(mn4));
    }

    @Override // p000.Y94
    public UserService get() {
        return provideUserService(this.retrofitProvider.get());
    }
}
