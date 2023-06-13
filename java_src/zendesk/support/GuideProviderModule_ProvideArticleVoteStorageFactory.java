package zendesk.support;

import zendesk.core.SessionStorage;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideArticleVoteStorageFactory implements InterfaceC48812sj1<ArticleVoteStorage> {
    private final Y94<SessionStorage> baseStorageProvider;

    public GuideProviderModule_ProvideArticleVoteStorageFactory(Y94<SessionStorage> y94) {
        this.baseStorageProvider = y94;
    }

    public static GuideProviderModule_ProvideArticleVoteStorageFactory create(Y94<SessionStorage> y94) {
        return new GuideProviderModule_ProvideArticleVoteStorageFactory(y94);
    }

    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return (ArticleVoteStorage) C51679xZ3.m5002e(GuideProviderModule.provideArticleVoteStorage(sessionStorage));
    }

    @Override // p000.Y94
    public ArticleVoteStorage get() {
        return provideArticleVoteStorage(this.baseStorageProvider.get());
    }
}
