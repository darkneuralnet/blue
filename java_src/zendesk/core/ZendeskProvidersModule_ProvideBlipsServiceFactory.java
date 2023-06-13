package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements InterfaceC48812sj1<BlipsService> {
    private final Y94<MN4> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(Y94<MN4> y94) {
        this.retrofitProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(Y94<MN4> y94) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(y94);
    }

    public static BlipsService provideBlipsService(MN4 mn4) {
        return (BlipsService) C51679xZ3.m5002e(ZendeskProvidersModule.provideBlipsService(mn4));
    }

    @Override // p000.Y94
    public BlipsService get() {
        return provideBlipsService(this.retrofitProvider.get());
    }
}
