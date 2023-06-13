.class public LKy5$c;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljj1<",
        "Lcom/facebook/share/model/ShareContent;",
        "Ljava/lang/Object;",
        ">.a;"
    }
.end annotation


# instance fields
.field public final synthetic b:LKy5;


# direct methods
.method public constructor <init>(LKy5;)V
    .locals 0

    iput-object p1, p0, LKy5$c;->b:LKy5;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LKy5;LKy5$a;)V
    .locals 0

    invoke-direct {p0, p1}, LKy5$c;-><init>(LKy5;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1, p2}, LKy5$c;->d(Lcom/facebook/share/model/ShareContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1}, LKy5$c;->e(Lcom/facebook/share/model/ShareContent;)LSh;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LKy5$d;->e:LKy5$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/model/ShareContent;Z)Z
    .locals 0

    instance-of p2, p1, Lcom/facebook/share/model/ShareLinkContent;

    if-nez p2, :cond_1

    instance-of p1, p1, Lcom/facebook/share/internal/ShareFeedContent;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public e(Lcom/facebook/share/model/ShareContent;)LSh;
    .locals 3

    iget-object v0, p0, LKy5$c;->b:LKy5;

    invoke-static {v0}, LKy5;->m(LKy5;)Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LKy5$d;->e:LKy5$d;

    invoke-static {v0, v1, p1, v2}, LKy5;->p(LKy5;Landroid/content/Context;Lcom/facebook/share/model/ShareContent;LKy5$d;)V

    iget-object v0, p0, LKy5$c;->b:LKy5;

    invoke-virtual {v0}, LKy5;->e()LSh;

    move-result-object v0

    instance-of v1, p1, Lcom/facebook/share/model/ShareLinkContent;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/facebook/share/model/ShareLinkContent;

    invoke-static {p1}, LJy5;->y(Lcom/facebook/share/model/ShareContent;)V

    invoke-static {p1}, LYz6;->f(Lcom/facebook/share/model/ShareLinkContent;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/facebook/share/internal/ShareFeedContent;

    invoke-static {p1}, LYz6;->e(Lcom/facebook/share/internal/ShareFeedContent;)Landroid/os/Bundle;

    move-result-object p1

    :goto_0
    const-string v1, "feed"

    invoke-static {v0, v1, p1}, LC31;->k(LSh;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
