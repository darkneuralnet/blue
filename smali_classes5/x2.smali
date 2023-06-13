.class public Lx2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008#\u0010$J&\u0010\t\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\r\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J&\u0010\u0012\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R*\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@PX\u0096.\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR*\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u001d8\u0016@PX\u0096.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lx2;",
        "Landroid/webkit/WebViewClient;",
        "Landroid/webkit/WebView;",
        "view",
        "",
        "url",
        "Landroid/graphics/Bitmap;",
        "favicon",
        "",
        "onPageStarted",
        "onPageFinished",
        "",
        "isReload",
        "doUpdateVisitedHistory",
        "Landroid/webkit/WebResourceRequest;",
        "request",
        "Landroid/webkit/WebResourceError;",
        "error",
        "onReceivedError",
        "shouldOverrideUrlLoading",
        "LBA6;",
        "<set-?>",
        "a",
        "LBA6;",
        "b",
        "()LBA6;",
        "d",
        "(LBA6;)V",
        "state",
        "LvA6;",
        "LvA6;",
        "()LvA6;",
        "c",
        "(LvA6;)V",
        "navigator",
        "<init>",
        "()V",
        "web_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public a:LBA6;

.field public b:LvA6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LvA6;
    .locals 1

    iget-object v0, p0, Lx2;->b:LvA6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()LBA6;
    .locals 1

    iget-object v0, p0, Lx2;->a:LBA6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "state"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public c(LvA6;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx2;->b:LvA6;

    return-void
.end method

.method public d(LBA6;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx2;->a:LBA6;

    return-void
.end method

.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    const/4 p1, 0x2

    const/4 p3, 0x0

    const-string v0, "data:text/html"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p1, p3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p1}, LBA6;->a()LVz6;

    move-result-object p1

    invoke-virtual {p1}, LVz6;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p3

    invoke-virtual {p3}, LBA6;->a()LVz6;

    move-result-object p3

    invoke-static {p3, p2}, LuA6;->j(LVz6;Ljava/lang/String;)LVz6$b;

    move-result-object p2

    invoke-virtual {p1, p2}, LBA6;->d(LVz6;)V

    :cond_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p2

    sget-object v0, LNt2$a;->a:LNt2$a;

    invoke-virtual {p2, v0}, LBA6;->e(LNt2;)V

    invoke-virtual {p0}, Lx2;->a()LvA6;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-virtual {p2, v1}, LvA6;->d(Z)V

    invoke-virtual {p0}, Lx2;->a()LvA6;

    move-result-object p2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    :cond_1
    invoke-virtual {p2, v0}, LvA6;->e(Z)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    new-instance p2, LNt2$c;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, LNt2$c;-><init>(F)V

    invoke-virtual {p1, p2}, LBA6;->e(LNt2;)V

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p1}, LBA6;->b()LMM5;

    move-result-object p1

    invoke-virtual {p1}, LMM5;->clear()V

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LBA6;->g(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p1, p2}, LBA6;->f(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p1}, LBA6;->b()LMM5;

    move-result-object p1

    new-instance v0, LpA6;

    invoke-direct {v0, p2, p3}, LpA6;-><init>(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    invoke-virtual {p1, v0}, LMM5;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object p1

    invoke-virtual {p0}, Lx2;->b()LBA6;

    move-result-object v0

    invoke-virtual {v0}, LBA6;->a()LVz6;

    move-result-object v0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "it.url.toString()"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2}, LuA6;->j(LVz6;Ljava/lang/String;)LVz6$b;

    move-result-object p2

    invoke-virtual {p1, p2}, LBA6;->d(LVz6;)V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
