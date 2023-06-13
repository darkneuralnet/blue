package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideModule_ProvidesArticleVoteStorageFactory implements InterfaceC48812sj1<ArticleVoteStorage> {
    private final GuideModule module;

    public GuideModule_ProvidesArticleVoteStorageFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesArticleVoteStorageFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesArticleVoteStorageFactory(guideModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(GuideModule guideModule) {
        return (ArticleVoteStorage) C51679xZ3.m5002e(guideModule.providesArticleVoteStorage());
    }

    @Override // p000.Y94
    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
