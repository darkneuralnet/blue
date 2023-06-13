.class public LKy5$e;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
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

    iput-object p1, p0, LKy5$e;->b:LKy5;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LKy5;LKy5$a;)V
    .locals 0

    invoke-direct {p0, p1}, LKy5$e;-><init>(LKy5;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1, p2}, LKy5$e;->d(Lcom/facebook/share/model/ShareContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1}, LKy5$e;->e(Lcom/facebook/share/model/ShareContent;)LSh;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LKy5$d;->c:LKy5$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/model/ShareContent;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    instance-of v1, p1, Lcom/facebook/share/model/ShareCameraEffectContent;

    if-nez v1, :cond_4

    instance-of v1, p1, Lcom/facebook/share/model/ShareStoryContent;

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareContent;->g()Lcom/facebook/share/model/ShareHashtag;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object p2, LLy5;->g:LLy5;

    invoke-static {p2}, LC31;->a(Lp31;)Z

    move-result p2

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    instance-of v2, p1, Lcom/facebook/share/model/ShareLinkContent;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Lcom/facebook/share/model/ShareLinkContent;

    invoke-virtual {v2}, Lcom/facebook/share/model/ShareLinkContent;->l()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, LLy5;->h:LLy5;

    invoke-static {v2}, LC31;->a(Lp31;)Z

    move-result v2

    and-int/2addr p2, v2

    goto :goto_1

    :cond_2
    move p2, v1

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LKy5;->n(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v0, v1

    :cond_4
    :goto_2
    return v0
.end method

.method public e(Lcom/facebook/share/model/ShareContent;)LSh;
    .locals 3

    iget-object v0, p0, LKy5$e;->b:LKy5;

    invoke-static {v0}, LKy5;->o(LKy5;)Landroid/app/Activity;

    move-result-object v1

    sget-object v2, LKy5$d;->c:LKy5$d;

    invoke-static {v0, v1, p1, v2}, LKy5;->p(LKy5;Landroid/content/Context;Lcom/facebook/share/model/ShareContent;LKy5$d;)V

    invoke-static {p1}, LJy5;->w(Lcom/facebook/share/model/ShareContent;)V

    iget-object v0, p0, LKy5$e;->b:LKy5;

    invoke-virtual {v0}, LKy5;->e()LSh;

    move-result-object v0

    iget-object v1, p0, LKy5$e;->b:LKy5;

    invoke-virtual {v1}, LKy5;->w()Z

    move-result v1

    new-instance v2, LKy5$e$a;

    invoke-direct {v2, p0, v0, p1, v1}, LKy5$e$a;-><init>(LKy5$e;LSh;Lcom/facebook/share/model/ShareContent;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LKy5;->q(Ljava/lang/Class;)Lp31;

    move-result-object p1

    invoke-static {v0, v2, p1}, LC31;->i(LSh;LC31$a;Lp31;)V

    return-object v0
.end method
