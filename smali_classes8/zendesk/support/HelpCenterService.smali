.class interface abstract Lzendesk/support/HelpCenterService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract deleteVote(Ljava/lang/Long;)Lx80;
    .param p1    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "vote_id"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "/api/v2/help_center/votes/{vote_id}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lx80<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract downvoteArticle(Ljava/lang/Long;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "article_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v2/help_center/articles/{article_id}/down.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/ArticleVoteResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getArticle(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "article_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "include"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/hc/api/mobile/{locale}/articles/{article_id}.json?respect_sanitization_settings=true"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/ArticleResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getArticles(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;I)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "label_names"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "include"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LXc4;
            value = "per_page"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lx80<",
            "Lzendesk/support/ArticlesListResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAttachments(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "article_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "attachment_type"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/AttachmentResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCategories(Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/categories.json?per_page=1000"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/CategoriesResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCategoryById(Ljava/lang/String;Ljava/lang/Long;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "category_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/categories/{category_id}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ")",
            "Lx80<",
            "Lzendesk/support/CategoryResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHelp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "category_ids"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "section_ids"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "include"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LXc4;
            value = "limit"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "article_labels"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime LXc4;
            value = "per_page"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "sort_by"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "sort_order"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/hc/api/mobile/{locale}/article_tree.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/HelpResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSectionById(Ljava/lang/String;Ljava/lang/Long;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "section_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/sections/{section_id}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ")",
            "Lx80<",
            "Lzendesk/support/SectionResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSections(Ljava/lang/String;Ljava/lang/Long;I)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "id"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LXc4;
            value = "per_page"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/categories/{id}/sections.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "I)",
            "Lx80<",
            "Lzendesk/support/SectionsResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSuggestedArticles(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "query"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "locale"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "label_names"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Long;
        .annotation runtime LXc4;
            value = "category"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation runtime LXc4;
            value = "section"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/mobile/help_center/search/deflect.json?respect_sanitization_settings=true"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")",
            "Lx80<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract listArticles(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "label_names"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "include"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "sort_by"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "sort_order"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime LXc4;
            value = "page"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime LXc4;
            value = "per_page"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/{locale}/articles.json?respect_sanitization_settings=true"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lx80<",
            "Lzendesk/support/ArticlesListResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract searchArticles(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "query"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "locale"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "include"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "label_names"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "category"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "section"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime LXc4;
            value = "page"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LXc4;
            value = "per_page"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lx80<",
            "Lzendesk/support/ArticlesSearchResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract submitRecordArticleView(Ljava/lang/Long;Ljava/lang/String;Lzendesk/support/RecordArticleViewRequest;)Lx80;
    .param p1    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "article_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "locale"
        .end annotation
    .end param
    .param p3    # Lzendesk/support/RecordArticleViewRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lzendesk/support/RecordArticleViewRequest;",
            ")",
            "Lx80<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract upvoteArticle(Ljava/lang/Long;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/Long;
        .annotation runtime LdJ3;
            value = "article_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v2/help_center/articles/{article_id}/up.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/support/ArticleVoteResponse;",
            ">;"
        }
    .end annotation
.end method
