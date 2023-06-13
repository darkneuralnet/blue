package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideModule_ProvidesHelpCenterProviderFactory implements InterfaceC48812sj1<HelpCenterProvider> {
    private final GuideModule module;

    public GuideModule_ProvidesHelpCenterProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesHelpCenterProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesHelpCenterProviderFactory(guideModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(GuideModule guideModule) {
        return (HelpCenterProvider) C51679xZ3.m5002e(guideModule.providesHelpCenterProvider());
    }

    @Override // p000.Y94
    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}
