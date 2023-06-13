package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements InterfaceC48812sj1<AccessService> {
    private final Y94<MN4> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(Y94<MN4> y94) {
        this.retrofitProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(Y94<MN4> y94) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(y94);
    }

    public static AccessService provideAccessService(MN4 mn4) {
        return (AccessService) C51679xZ3.m5002e(ZendeskProvidersModule.provideAccessService(mn4));
    }

    @Override // p000.Y94
    public AccessService get() {
        return provideAccessService(this.retrofitProvider.get());
    }
}
