.class Lzendesk/support/guide/HelpModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/guide/HelpMvp$Model;


# instance fields
.field private provider:Lzendesk/support/HelpCenterProvider;


# direct methods
.method public constructor <init>(Lzendesk/support/HelpCenterProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/guide/HelpModel;->provider:Lzendesk/support/HelpCenterProvider;

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/guide/HelpModel;Lzendesk/support/Article;)Lzendesk/support/ArticleItem;
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/HelpModel;->convertArticle(Lzendesk/support/Article;)Lzendesk/support/ArticleItem;

    move-result-object p0

    return-object p0
.end method

.method private convertArticle(Lzendesk/support/Article;)Lzendesk/support/ArticleItem;
    .locals 3

    new-instance v0, Lzendesk/support/ArticleItem;

    invoke-virtual {p1}, Lzendesk/support/Article;->getId()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1}, Lzendesk/support/Article;->getSectionId()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lzendesk/support/Article;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lzendesk/support/ArticleItem;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getArticles(Ljava/util/List;Ljava/util/List;[Ljava/lang/String;LlI6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;[",
            "Ljava/lang/String;",
            "LlI6<",
            "Ljava/util/List<",
            "Lzendesk/support/HelpItem;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/guide/HelpModel;->provider:Lzendesk/support/HelpCenterProvider;

    new-instance v1, Lzendesk/support/HelpRequest$Builder;

    invoke-direct {v1}, Lzendesk/support/HelpRequest$Builder;-><init>()V

    invoke-virtual {v1, p1}, Lzendesk/support/HelpRequest$Builder;->withCategoryIds(Ljava/util/List;)Lzendesk/support/HelpRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lzendesk/support/HelpRequest$Builder;->withSectionIds(Ljava/util/List;)Lzendesk/support/HelpRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lzendesk/support/HelpRequest$Builder;->withLabelNames([Ljava/lang/String;)Lzendesk/support/HelpRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/HelpRequest$Builder;->includeCategories()Lzendesk/support/HelpRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/HelpRequest$Builder;->includeSections()Lzendesk/support/HelpRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/HelpRequest$Builder;->build()Lzendesk/support/HelpRequest;

    move-result-object p1

    invoke-interface {v0, p1, p4}, Lzendesk/support/HelpCenterProvider;->getHelp(Lzendesk/support/HelpRequest;LlI6;)V

    return-void
.end method

.method public getArticlesForSection(Lzendesk/support/SectionItem;[Ljava/lang/String;LlI6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/SectionItem;",
            "[",
            "Ljava/lang/String;",
            "LlI6<",
            "Ljava/util/List<",
            "Lzendesk/support/ArticleItem;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lzendesk/support/SectionItem;->getId()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzendesk/support/guide/HelpModel;->provider:Lzendesk/support/HelpCenterProvider;

    invoke-virtual {p1}, Lzendesk/support/SectionItem;->getId()Ljava/lang/Long;

    move-result-object p1

    invoke-static {p2}, LlS5;->g([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lzendesk/support/guide/HelpModel$1;

    invoke-direct {v1, p0, p3}, Lzendesk/support/guide/HelpModel$1;-><init>(Lzendesk/support/guide/HelpModel;LlI6;)V

    invoke-interface {v0, p1, p2, v1}, Lzendesk/support/HelpCenterProvider;->getArticles(Ljava/lang/Long;Ljava/lang/String;LlI6;)V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Lug1;

    const-string p2, "SectionItem or its ID was null, cannot load more articles."

    invoke-direct {p1, p2}, Lug1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, LlI6;->onError(Lsg1;)V

    return-void
.end method
