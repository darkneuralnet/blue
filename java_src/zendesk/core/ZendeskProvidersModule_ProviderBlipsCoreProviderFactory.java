package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements InterfaceC48812sj1<BlipsCoreProvider> {
    private final Y94<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(Y94<ZendeskBlipsProvider> y94) {
        this.zendeskBlipsProvider = y94;
    }

    public static ZendeskProvidersModule_ProviderBlipsCoreProviderFactory create(Y94<ZendeskBlipsProvider> y94) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(y94);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(Object obj) {
        return (BlipsCoreProvider) C51679xZ3.m5002e(ZendeskProvidersModule.providerBlipsCoreProvider((ZendeskBlipsProvider) obj));
    }

    @Override // p000.Y94
    public BlipsCoreProvider get() {
        return providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
    }
}
