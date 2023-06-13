package zendesk.support;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public interface HelpCenterService {
    @KF0("/api/v2/help_center/votes/{vote_id}.json")
    InterfaceC51431x80<Void> deleteVote(@InterfaceC39678dJ3("vote_id") Long l);

    @AD3("/api/v2/help_center/articles/{article_id}/down.json")
    InterfaceC51431x80<ArticleVoteResponse> downvoteArticle(@InterfaceC39678dJ3("article_id") Long l, @InterfaceC6404PY String str);

    @NA1("/hc/api/mobile/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    InterfaceC51431x80<ArticleResponse> getArticle(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("article_id") Long l, @InterfaceC37017Xc4("include") String str2);

    @NA1("/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    InterfaceC51431x80<ArticlesListResponse> getArticles(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("id") Long l, @InterfaceC37017Xc4("label_names") String str2, @InterfaceC37017Xc4("include") String str3, @InterfaceC37017Xc4("per_page") int i);

    @NA1("/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    InterfaceC51431x80<AttachmentResponse> getAttachments(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("article_id") Long l, @InterfaceC39678dJ3("attachment_type") String str2);

    @NA1("/api/v2/help_center/{locale}/categories.json?per_page=1000")
    InterfaceC51431x80<CategoriesResponse> getCategories(@InterfaceC39678dJ3("locale") String str);

    @NA1("/api/v2/help_center/{locale}/categories/{category_id}.json")
    InterfaceC51431x80<CategoryResponse> getCategoryById(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("category_id") Long l);

    @NA1("/hc/api/mobile/{locale}/article_tree.json")
    InterfaceC51431x80<HelpResponse> getHelp(@InterfaceC39678dJ3("locale") String str, @InterfaceC37017Xc4("category_ids") String str2, @InterfaceC37017Xc4("section_ids") String str3, @InterfaceC37017Xc4("include") String str4, @InterfaceC37017Xc4("limit") int i, @InterfaceC37017Xc4("article_labels") String str5, @InterfaceC37017Xc4("per_page") int i2, @InterfaceC37017Xc4("sort_by") String str6, @InterfaceC37017Xc4("sort_order") String str7);

    @NA1("/api/v2/help_center/{locale}/sections/{section_id}.json")
    InterfaceC51431x80<SectionResponse> getSectionById(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("section_id") Long l);

    @NA1("/api/v2/help_center/{locale}/categories/{id}/sections.json")
    InterfaceC51431x80<SectionsResponse> getSections(@InterfaceC39678dJ3("locale") String str, @InterfaceC39678dJ3("id") Long l, @InterfaceC37017Xc4("per_page") int i);

    @NA1("/api/mobile/help_center/search/deflect.json?respect_sanitization_settings=true")
    InterfaceC51431x80<Object> getSuggestedArticles(@InterfaceC37017Xc4("query") String str, @InterfaceC37017Xc4("locale") String str2, @InterfaceC37017Xc4("label_names") String str3, @InterfaceC37017Xc4("category") Long l, @InterfaceC37017Xc4("section") Long l2);

    @NA1("/api/v2/help_center/{locale}/articles.json?respect_sanitization_settings=true")
    InterfaceC51431x80<ArticlesListResponse> listArticles(@InterfaceC39678dJ3("locale") String str, @InterfaceC37017Xc4("label_names") String str2, @InterfaceC37017Xc4("include") String str3, @InterfaceC37017Xc4("sort_by") String str4, @InterfaceC37017Xc4("sort_order") String str5, @InterfaceC37017Xc4("page") Integer num, @InterfaceC37017Xc4("per_page") Integer num2);

    @NA1("/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    InterfaceC51431x80<ArticlesSearchResponse> searchArticles(@InterfaceC37017Xc4("query") String str, @InterfaceC37017Xc4("locale") String str2, @InterfaceC37017Xc4("include") String str3, @InterfaceC37017Xc4("label_names") String str4, @InterfaceC37017Xc4("category") String str5, @InterfaceC37017Xc4("section") String str6, @InterfaceC37017Xc4("page") Integer num, @InterfaceC37017Xc4("per_page") Integer num2);

    @AD3("/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    InterfaceC51431x80<Void> submitRecordArticleView(@InterfaceC39678dJ3("article_id") Long l, @InterfaceC39678dJ3("locale") String str, @InterfaceC6404PY RecordArticleViewRequest recordArticleViewRequest);

    @AD3("/api/v2/help_center/articles/{article_id}/up.json")
    InterfaceC51431x80<ArticleVoteResponse> upvoteArticle(@InterfaceC39678dJ3("article_id") Long l, @InterfaceC6404PY String str);
}
