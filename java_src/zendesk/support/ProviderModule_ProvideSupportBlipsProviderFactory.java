package zendesk.support;

import zendesk.core.BlipsProvider;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideSupportBlipsProviderFactory implements InterfaceC48812sj1<SupportBlipsProvider> {
    private final Y94<BlipsProvider> blipsProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, Y94<BlipsProvider> y94) {
        this.module = providerModule;
        this.blipsProvider = y94;
    }

    public static ProviderModule_ProvideSupportBlipsProviderFactory create(ProviderModule providerModule, Y94<BlipsProvider> y94) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, y94);
    }

    public static SupportBlipsProvider provideSupportBlipsProvider(ProviderModule providerModule, BlipsProvider blipsProvider) {
        return (SupportBlipsProvider) C51679xZ3.m5002e(providerModule.provideSupportBlipsProvider(blipsProvider));
    }

    @Override // p000.Y94
    public SupportBlipsProvider get() {
        return provideSupportBlipsProvider(this.module, this.blipsProvider.get());
    }
}
