.class Lzendesk/support/guide/ViewArticleActivity$2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/guide/ViewArticleActivity;->setupRequestInterceptor()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/guide/ViewArticleActivity;


# direct methods
.method public constructor <init>(Lzendesk/support/guide/ViewArticleActivity;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 8

    iget-object v0, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    iget-object v0, v0, Lzendesk/support/guide/ViewArticleActivity;->applicationConfiguration:Lzendesk/core/ApplicationConfiguration;

    invoke-virtual {v0}, Lzendesk/core/ApplicationConfiguration;->getZendeskUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->d(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "ViewArticleActivity"

    const/4 v3, 0x0

    if-nez v1, :cond_6

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    sget-object v0, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    invoke-virtual {v0}, Lzendesk/core/Zendesk;->getIdentity()Lzendesk/core/Identity;

    move-result-object v0

    invoke-static {p2}, Lzendesk/core/UrlHelper;->isGuideRequest(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    instance-of v0, v0, Lzendesk/core/AnonymousIdentity;

    if-eqz v0, :cond_1

    const-string v0, "Will not intercept request because it is anonymous guide request"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    :try_start_0
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v0, p2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p2

    iget-object v0, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    iget-object v0, v0, Lzendesk/support/guide/ViewArticleActivity;->okHttpClient:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, p2}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->execute(Lokhttp3/Call;)Lokhttp3/Response;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lokhttp3/Response;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lokhttp3/MediaType;->type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LlS5;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lokhttp3/MediaType;->subtype()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LlS5;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%s/%s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p2}, Lokhttp3/MediaType;->type()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-virtual {p2}, Lokhttp3/MediaType;->subtype()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-static {v1, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :cond_2
    move-object v1, p1

    :goto_0
    :try_start_2
    invoke-virtual {p2}, Lokhttp3/MediaType;->charset()Ljava/nio/charset/Charset;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_3
    move-object p2, p1

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :cond_4
    move-object p2, p1

    move-object v1, p2

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception p2

    move-object v1, p1

    goto :goto_3

    :cond_5
    move-object p2, p1

    move-object v1, p2

    :goto_2
    move-object v0, p1

    move-object p1, p2

    goto :goto_4

    :catch_2
    move-exception p2

    move-object v0, p1

    move-object v1, v0

    :goto_3
    const-string v4, "Exception encountered when trying to intercept request"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v4, p2, v3}, LIx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_4
    new-instance p2, Landroid/webkit/WebResourceResponse;

    invoke-direct {p2, v1, p1, v0}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p2

    :cond_6
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Will not intercept request because the url is not hosted by Zendesk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    iget-object v0, v0, Lzendesk/support/guide/ViewArticleActivity;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    invoke-interface {v0, p2}, Lzendesk/core/ActionHandlerRegistry;->handlerByAction(Ljava/lang/String;)Lzendesk/core/ActionHandler;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "help_center_view_article"

    invoke-interface {p1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    iget-object v2, p2, Lzendesk/support/guide/ViewArticleActivity;->configurationHelper:LBx0;

    invoke-static {p2}, Lzendesk/support/guide/ViewArticleActivity;->access$000(Lzendesk/support/guide/ViewArticleActivity;)Lzendesk/support/guide/ArticleConfiguration;

    move-result-object p2

    invoke-virtual {v2, p1, p2}, LBx0;->d(Ljava/util/Map;Ldx0;)V

    iget-object p2, p0, Lzendesk/support/guide/ViewArticleActivity$2;->this$0:Lzendesk/support/guide/ViewArticleActivity;

    invoke-interface {v0, p1, p2}, Lzendesk/core/ActionHandler;->handle(Ljava/util/Map;Landroid/content/Context;)V

    return v1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No browser available to open url: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/Object;

    const-string v1, "ViewArticleActivity"

    invoke-static {v1, p1, v0}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return p2
.end method
