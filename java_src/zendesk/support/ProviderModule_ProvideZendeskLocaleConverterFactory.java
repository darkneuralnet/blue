package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideZendeskLocaleConverterFactory implements InterfaceC48812sj1<ZendeskLocaleConverter> {
    private final ProviderModule module;

    public ProviderModule_ProvideZendeskLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideZendeskLocaleConverterFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideZendeskLocaleConverterFactory(providerModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ProviderModule providerModule) {
        return (ZendeskLocaleConverter) C51679xZ3.m5002e(providerModule.provideZendeskLocaleConverter());
    }

    @Override // p000.Y94
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
