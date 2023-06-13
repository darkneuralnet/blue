package zendesk.support;
/* loaded from: classes8.dex */
public interface ArticleVoteStorage {
    ArticleVote getStoredArticleVote(Long l);

    void removeStoredArticleVote(Long l);

    void storeArticleVote(Long l, ArticleVote articleVote);
}
