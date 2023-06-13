package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements InterfaceC48812sj1<ZendeskLocaleConverter> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        return (ZendeskLocaleConverter) C51679xZ3.m5002e(zendeskApplicationModule.provideZendeskLocaleConverter());
    }

    @Override // p000.Y94
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
