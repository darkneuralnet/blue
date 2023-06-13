package zendesk.support;

import zendesk.core.RestServiceProvider;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideGuideModuleFactory implements InterfaceC48812sj1<GuideModule> {
    private final Y94<ArticleVoteStorage> articleVoteStorageProvider;
    private final Y94<HelpCenterBlipsProvider> blipsProvider;
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final GuideProviderModule module;
    private final Y94<RestServiceProvider> restServiceProvider;
    private final Y94<HelpCenterSettingsProvider> settingsProvider;

    public GuideProviderModule_ProvideGuideModuleFactory(GuideProviderModule guideProviderModule, Y94<HelpCenterProvider> y94, Y94<HelpCenterSettingsProvider> y942, Y94<HelpCenterBlipsProvider> y943, Y94<ArticleVoteStorage> y944, Y94<RestServiceProvider> y945) {
        this.module = guideProviderModule;
        this.helpCenterProvider = y94;
        this.settingsProvider = y942;
        this.blipsProvider = y943;
        this.articleVoteStorageProvider = y944;
        this.restServiceProvider = y945;
    }

    public static GuideProviderModule_ProvideGuideModuleFactory create(GuideProviderModule guideProviderModule, Y94<HelpCenterProvider> y94, Y94<HelpCenterSettingsProvider> y942, Y94<HelpCenterBlipsProvider> y943, Y94<ArticleVoteStorage> y944, Y94<RestServiceProvider> y945) {
        return new GuideProviderModule_ProvideGuideModuleFactory(guideProviderModule, y94, y942, y943, y944, y945);
    }

    public static GuideModule provideGuideModule(GuideProviderModule guideProviderModule, HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        return (GuideModule) C51679xZ3.m5002e(guideProviderModule.provideGuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, articleVoteStorage, restServiceProvider));
    }

    @Override // p000.Y94
    public GuideModule get() {
        return provideGuideModule(this.module, this.helpCenterProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.articleVoteStorageProvider.get(), this.restServiceProvider.get());
    }
}
