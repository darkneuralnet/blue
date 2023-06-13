.class Lzendesk/support/guide/ViewArticleActionHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/core/ActionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;
    }
.end annotation


# static fields
.field private static final HC_PATH_ELEMENT_ARTICLE:Ljava/lang/String; = "articles"

.field private static final HC_PATH_ELEMENT_HC:Ljava/lang/String; = "hc"

.field private static final HC_PATH_ELEMENT_NAME_SEPARATOR:Ljava/lang/String; = "-"

.field private static final HELP_CENTER_ARTICLE_ID:Ljava/lang/String; = "help_center_article_id"

.field private static final HELP_CENTER_ARTICLE_TITLE:Ljava/lang/String; = "help_center_article_title"

.field static final HELP_CENTER_VIEW_ARTICLE:Ljava/lang/String; = "help_center_view_article"

.field private static final LOG_TAG:Ljava/lang/String; = "ViewArticleActionHandle"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static data(JLjava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "help_center_article_id"

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "help_center_article_title"

    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public canHandle(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lzendesk/support/guide/ViewArticleActionHandler;->parse(Lokhttp3/HttpUrl;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->isValid()Z

    move-result p1

    return p1
.end method

.method public getActionDescription()Lzendesk/core/ActionDescription;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPriority()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public handle(Ljava/util/Map;Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "ViewArticleActionHandle"

    const-string v0, "Property map is null, cannot open article."

    invoke-static {p2, v0, p1}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "help_center_view_article"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LlS5;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, v0}, Lzendesk/support/guide/ViewArticleActionHandler;->parse(Lokhttp3/HttpUrl;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->isValid()Z

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-static {v0}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->access$000(Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "help_center_article_id"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->access$000(Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-class v2, Ldx0;

    invoke-static {p1, v2}, LEx0;->f(Ljava/util/Map;Ljava/lang/Class;)Ldx0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ldx0;->getConfigurations()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    invoke-static {v0, v1}, Lzendesk/support/guide/ViewArticleActivity;->builder(J)Lzendesk/support/guide/ArticleConfiguration$Builder;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lzendesk/support/guide/ArticleConfiguration$Builder;->show(Landroid/content/Context;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public parse(Lokhttp3/HttpUrl;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;
    .locals 6

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->pathSegments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    const-string v2, "help_center_view_article"

    if-lt v0, v1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "articles"

    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const-string v1, "hc"

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v0, 0x2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_2

    invoke-static {v2}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->invalid(Ljava/lang/String;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1

    :cond_2
    add-int/2addr v0, v1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljm0;->h([Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v2}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->invalid(Ljava/lang/String;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1

    :cond_3
    :try_start_0
    aget-object v3, v0, v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v4, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    array-length p1, v0

    if-le p1, v1, :cond_5

    array-length p1, v0

    :goto_0
    if-ge v1, p1, :cond_4

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_5
    const-string p1, ""

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lzendesk/support/guide/ViewArticleActionHandler;->data(JLjava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v2, p1}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->valid(Ljava/lang/String;Ljava/util/Map;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1

    :catch_0
    invoke-static {v2}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->invalid(Ljava/lang/String;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    invoke-static {v2}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->invalid(Ljava/lang/String;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_3
    invoke-static {v2}, Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;->invalid(Ljava/lang/String;)Lzendesk/support/guide/ViewArticleActionHandler$ActionPayload;

    move-result-object p1

    return-object p1
.end method

.method public updateSettings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lyi2;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
