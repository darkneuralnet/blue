.class public LnT2$b;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnT2;
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
.field public final synthetic b:LnT2;


# direct methods
.method public constructor <init>(LnT2;)V
    .locals 0

    iput-object p1, p0, LnT2$b;->b:LnT2;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LnT2;LnT2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LnT2$b;-><init>(LnT2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1, p2}, LnT2$b;->d(Lcom/facebook/share/model/ShareContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/ShareContent;

    invoke-virtual {p0, p1}, LnT2$b;->e(Lcom/facebook/share/model/ShareContent;)LSh;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/share/model/ShareContent;Z)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LnT2;->o(Ljava/lang/Class;)Z

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

    invoke-static {p1}, LJy5;->v(Lcom/facebook/share/model/ShareContent;)V

    iget-object v0, p0, LnT2$b;->b:LnT2;

    invoke-virtual {v0}, LnT2;->e()LSh;

    move-result-object v0

    iget-object v1, p0, LnT2$b;->b:LnT2;

    invoke-virtual {v1}, LnT2;->q()Z

    move-result v1

    iget-object v2, p0, LnT2$b;->b:LnT2;

    invoke-static {v2}, LnT2;->l(LnT2;)Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, p1, v0}, LnT2;->m(Landroid/content/Context;Lcom/facebook/share/model/ShareContent;LSh;)V

    new-instance v2, LnT2$b$a;

    invoke-direct {v2, p0, v0, p1, v1}, LnT2$b$a;-><init>(LnT2$b;LSh;Lcom/facebook/share/model/ShareContent;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LnT2;->n(Ljava/lang/Class;)Lp31;

    move-result-object p1

    invoke-static {v0, v2, p1}, LC31;->i(LSh;LC31$a;Lp31;)V

    return-object v0
.end method
