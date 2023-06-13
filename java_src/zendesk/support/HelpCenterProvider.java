package zendesk.support;

import java.util.List;
import java.util.Locale;
/* loaded from: classes8.dex */
public interface HelpCenterProvider {
    void deleteVote(Long l, AbstractC44415lI6<Void> abstractC44415lI6);

    void downvoteArticle(Long l, AbstractC44415lI6<ArticleVote> abstractC44415lI6);

    void getArticle(Long l, AbstractC44415lI6<Article> abstractC44415lI6);

    void getArticles(Long l, String str, AbstractC44415lI6<List<Article>> abstractC44415lI6);

    void getArticles(Long l, AbstractC44415lI6<List<Article>> abstractC44415lI6);

    void getAttachments(Long l, AttachmentType attachmentType, AbstractC44415lI6<List<HelpCenterAttachment>> abstractC44415lI6);

    void getCategories(AbstractC44415lI6<List<Category>> abstractC44415lI6);

    void getCategory(Long l, AbstractC44415lI6<Category> abstractC44415lI6);

    void getHelp(HelpRequest helpRequest, AbstractC44415lI6<List<HelpItem>> abstractC44415lI6);

    void getSection(Long l, AbstractC44415lI6<Section> abstractC44415lI6);

    void getSections(Long l, AbstractC44415lI6<List<Section>> abstractC44415lI6);

    void getSuggestedArticles(SuggestedArticleSearch suggestedArticleSearch, AbstractC44415lI6<Object> abstractC44415lI6);

    void listArticles(ListArticleQuery listArticleQuery, AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6);

    void listArticlesFlat(ListArticleQuery listArticleQuery, AbstractC44415lI6<List<FlatArticle>> abstractC44415lI6);

    void searchArticles(HelpCenterSearch helpCenterSearch, AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6);

    void submitRecordArticleView(Article article, Locale locale, AbstractC44415lI6<Void> abstractC44415lI6);

    void upvoteArticle(Long l, AbstractC44415lI6<ArticleVote> abstractC44415lI6);
}
