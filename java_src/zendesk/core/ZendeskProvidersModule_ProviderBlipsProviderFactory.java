package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements InterfaceC48812sj1<BlipsProvider> {
    private final Y94<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(Y94<ZendeskBlipsProvider> y94) {
        this.zendeskBlipsProvider = y94;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(Y94<ZendeskBlipsProvider> y94) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(y94);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        return (BlipsProvider) C51679xZ3.m5002e(ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj));
    }

    @Override // p000.Y94
    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}
