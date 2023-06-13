package zendesk.support;

import dagger.MembersInjector;
/* loaded from: classes8.dex */
public final class Guide_MembersInjector implements MembersInjector<Guide> {
    private final Y94<HelpCenterBlipsProvider> blipsProvider;
    private final Y94<GuideModule> guideModuleProvider;

    public Guide_MembersInjector(Y94<GuideModule> y94, Y94<HelpCenterBlipsProvider> y942) {
        this.guideModuleProvider = y94;
        this.blipsProvider = y942;
    }

    public static MembersInjector<Guide> create(Y94<GuideModule> y94, Y94<HelpCenterBlipsProvider> y942) {
        return new Guide_MembersInjector(y94, y942);
    }

    public static void injectBlipsProvider(Guide guide, HelpCenterBlipsProvider helpCenterBlipsProvider) {
        guide.blipsProvider = helpCenterBlipsProvider;
    }

    public static void injectGuideModule(Guide guide, GuideModule guideModule) {
        guide.guideModule = guideModule;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(Guide guide) {
        injectGuideModule(guide, this.guideModuleProvider.get());
        injectBlipsProvider(guide, this.blipsProvider.get());
    }
}
