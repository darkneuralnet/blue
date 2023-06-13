package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideZendeskLocaleConverterFactory implements InterfaceC48812sj1<ZendeskLocaleConverter> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideZendeskLocaleConverterFactory INSTANCE = new GuideProviderModule_ProvideZendeskLocaleConverterFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideZendeskLocaleConverterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return (ZendeskLocaleConverter) C51679xZ3.m5002e(GuideProviderModule.provideZendeskLocaleConverter());
    }

    @Override // p000.Y94
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter();
    }
}
