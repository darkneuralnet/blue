package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideModule_ProvidesSettingsProviderFactory implements InterfaceC48812sj1<HelpCenterSettingsProvider> {
    private final GuideModule module;

    public GuideModule_ProvidesSettingsProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesSettingsProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesSettingsProviderFactory(guideModule);
    }

    public static HelpCenterSettingsProvider providesSettingsProvider(GuideModule guideModule) {
        return (HelpCenterSettingsProvider) C51679xZ3.m5002e(guideModule.providesSettingsProvider());
    }

    @Override // p000.Y94
    public HelpCenterSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
