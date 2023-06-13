package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideHelpCenterProviderFactory implements InterfaceC48812sj1<HelpCenterProvider> {
    private final Y94<HelpCenterBlipsProvider> blipsProvider;
    private final Y94<ZendeskHelpCenterService> helpCenterServiceProvider;
    private final Y94<HelpCenterSessionCache> helpCenterSessionCacheProvider;
    private final GuideProviderModule module;
    private final Y94<HelpCenterSettingsProvider> settingsProvider;

    public GuideProviderModule_ProvideHelpCenterProviderFactory(GuideProviderModule guideProviderModule, Y94<HelpCenterSettingsProvider> y94, Y94<HelpCenterBlipsProvider> y942, Y94<ZendeskHelpCenterService> y943, Y94<HelpCenterSessionCache> y944) {
        this.module = guideProviderModule;
        this.settingsProvider = y94;
        this.blipsProvider = y942;
        this.helpCenterServiceProvider = y943;
        this.helpCenterSessionCacheProvider = y944;
    }

    public static GuideProviderModule_ProvideHelpCenterProviderFactory create(GuideProviderModule guideProviderModule, Y94<HelpCenterSettingsProvider> y94, Y94<HelpCenterBlipsProvider> y942, Y94<ZendeskHelpCenterService> y943, Y94<HelpCenterSessionCache> y944) {
        return new GuideProviderModule_ProvideHelpCenterProviderFactory(guideProviderModule, y94, y942, y943, y944);
    }

    public static HelpCenterProvider provideHelpCenterProvider(GuideProviderModule guideProviderModule, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, Object obj, Object obj2) {
        return (HelpCenterProvider) C51679xZ3.m5002e(guideProviderModule.provideHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, (ZendeskHelpCenterService) obj, (HelpCenterSessionCache) obj2));
    }

    @Override // p000.Y94
    public HelpCenterProvider get() {
        return provideHelpCenterProvider(this.module, this.settingsProvider.get(), this.blipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get());
    }
}
