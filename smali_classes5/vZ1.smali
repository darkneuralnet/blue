.class public final LvZ1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\"\u0010#J\u0008\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\u0007\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010\u000e\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0008\u0010\u0011\u001a\u00020\u0002H\u0007J\u0008\u0010\u0012\u001a\u00020\u0002H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8G\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LvZ1;",
        "",
        "",
        "requestImmediateDataFlush",
        "",
        "eventName",
        "propertiesJSON",
        "logCustomEventWithJSON",
        "productId",
        "",
        "price",
        "currencyCode",
        "",
        "quantity",
        "logPurchaseWithJSON",
        "buttonId",
        "logButtonClick",
        "logClick",
        "requestPushPermission",
        "Ls20;",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LyO1;",
        "b",
        "LyO1;",
        "inAppMessage",
        "LCZ1;",
        "c",
        "LCZ1;",
        "getUser",
        "()LCZ1;",
        "user",
        "<init>",
        "(Landroid/content/Context;LyO1;)V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LyO1;

.field public final c:LCZ1;


# direct methods
.method public constructor <init>(Landroid/content/Context;LyO1;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvZ1;->a:Landroid/content/Context;

    iput-object p2, p0, LvZ1;->b:LyO1;

    new-instance p2, LCZ1;

    invoke-direct {p2, p1}, LCZ1;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, LvZ1;->c:LCZ1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ls20;
    .locals 9

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "undefined"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ls20;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ls20;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    const/4 v5, 0x0

    new-instance v6, LvZ1$a;

    invoke-direct {v6, p1}, LvZ1$a;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getUser()LCZ1;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, LvZ1;->c:LCZ1;

    return-object v0
.end method

.method public final logButtonClick(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LvZ1;->b:LyO1;

    invoke-interface {v0, p1}, LyO1;->d0(Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method public final logClick()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, LvZ1;->b:LyO1;

    invoke-interface {v0}, LwO1;->logClick()Z

    return-void
.end method

.method public final logCustomEventWithJSON(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-virtual {p0, p2}, LvZ1;->a(Ljava/lang/String;)Ls20;

    move-result-object p2

    iget-object v0, p0, LvZ1;->a:Landroid/content/Context;

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Ls20;)V

    return-void
.end method

.method public final logPurchaseWithJSON(Ljava/lang/String;DLjava/lang/String;ILjava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-virtual {p0, p6}, LvZ1;->a(Ljava/lang/String;)Ls20;

    move-result-object v5

    iget-object p6, p0, LvZ1;->a:Landroid/content/Context;

    invoke-static {p6}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    new-instance v3, Ljava/math/BigDecimal;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v3, p2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    move-object v2, p4

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/appboy/Appboy;->logPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V

    return-void
.end method

.method public final requestImmediateDataFlush()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, LvZ1;->a:Landroid/content/Context;

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->requestImmediateDataFlush()V

    return-void
.end method

.method public final requestPushPermission()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, LdR3;->d(Landroid/app/Activity;)V

    return-void
.end method
