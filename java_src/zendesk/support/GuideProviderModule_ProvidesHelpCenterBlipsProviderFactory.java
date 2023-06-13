package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory implements InterfaceC48812sj1<HelpCenterBlipsProvider> {
    private final Y94<BlipsProvider> blipsProvider;
    private final Y94<Locale> localeProvider;
    private final GuideProviderModule module;

    public GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(GuideProviderModule guideProviderModule, Y94<BlipsProvider> y94, Y94<Locale> y942) {
        this.module = guideProviderModule;
        this.blipsProvider = y94;
        this.localeProvider = y942;
    }

    public static GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory create(GuideProviderModule guideProviderModule, Y94<BlipsProvider> y94, Y94<Locale> y942) {
        return new GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(guideProviderModule, y94, y942);
    }

    public static HelpCenterBlipsProvider providesHelpCenterBlipsProvider(GuideProviderModule guideProviderModule, BlipsProvider blipsProvider, Locale locale) {
        return (HelpCenterBlipsProvider) C51679xZ3.m5002e(guideProviderModule.providesHelpCenterBlipsProvider(blipsProvider, locale));
    }

    @Override // p000.Y94
    public HelpCenterBlipsProvider get() {
        return providesHelpCenterBlipsProvider(this.module, this.blipsProvider.get(), this.localeProvider.get());
    }
}
