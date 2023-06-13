package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideZendeskHelpCenterServiceFactory implements InterfaceC48812sj1<ZendeskHelpCenterService> {
    private final Y94<HelpCenterService> helpCenterServiceProvider;
    private final Y94<ZendeskLocaleConverter> localeConverterProvider;

    public GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(Y94<HelpCenterService> y94, Y94<ZendeskLocaleConverter> y942) {
        this.helpCenterServiceProvider = y94;
        this.localeConverterProvider = y942;
    }

    public static GuideProviderModule_ProvideZendeskHelpCenterServiceFactory create(Y94<HelpCenterService> y94, Y94<ZendeskLocaleConverter> y942) {
        return new GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(y94, y942);
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(Object obj, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (ZendeskHelpCenterService) C51679xZ3.m5002e(GuideProviderModule.provideZendeskHelpCenterService((HelpCenterService) obj, zendeskLocaleConverter));
    }

    @Override // p000.Y94
    public ZendeskHelpCenterService get() {
        return provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), this.localeConverterProvider.get());
    }
}
