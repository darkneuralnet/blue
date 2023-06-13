.class public LKy5$b;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
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

    iput-object p1, p0, LKy5$b;->b:LKy5;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LKy5;LKy5$a;)V
    .locals 0

    invoke-direct {p0, p1}, LKy5$b;-><init>(LKy5;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1, p2}, LKy5$b;->d(Lcom/facebook/share/model/ShareContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1}, LKy5$b;->e(Lcom/facebook/share/model/ShareContent;)LSh;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LKy5$d;->c:LKy5$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/model/ShareContent;Z)Z
    .locals 0

    instance-of p2, p1, Lcom/facebook/share/model/ShareCameraEffectContent;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LKy5;->n(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Lcom/facebook/share/model/ShareContent;)LSh;
    .locals 3

    invoke-static {p1}, LJy5;->w(Lcom/facebook/share/model/ShareContent;)V

    iget-object v0, p0, LKy5$b;->b:LKy5;

    invoke-virtual {v0}, LKy5;->e()LSh;

    move-result-object v0

    iget-object v1, p0, LKy5$b;->b:LKy5;

    invoke-virtual {v1}, LKy5;->w()Z

    move-result v1

    new-instance v2, LKy5$b$a;

    invoke-direct {v2, p0, v0, p1, v1}, LKy5$b$a;-><init>(LKy5$b;LSh;Lcom/facebook/share/model/ShareContent;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LKy5;->q(Ljava/lang/Class;)Lp31;

    move-result-object p1

    invoke-static {v0, v2, p1}, LC31;->i(LSh;LC31$a;Lp31;)V

    return-object v0
.end method
