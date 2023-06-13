.class public LXq2$b;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXq2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljj1<",
        "Lcom/facebook/share/internal/LikeContent;",
        "Ljava/lang/Object;",
        ">.a;"
    }
.end annotation


# instance fields
.field public final synthetic b:LXq2;


# direct methods
.method public constructor <init>(LXq2;)V
    .locals 0

    iput-object p1, p0, LXq2$b;->b:LXq2;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LXq2;LWq2;)V
    .locals 0

    invoke-direct {p0, p1}, LXq2$b;-><init>(LXq2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1, p2}, LXq2$b;->d(Lcom/facebook/share/internal/LikeContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, LXq2$b;->e(Lcom/facebook/share/internal/LikeContent;)LSh;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/share/internal/LikeContent;Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e(Lcom/facebook/share/internal/LikeContent;)LSh;
    .locals 2

    iget-object v0, p0, LXq2$b;->b:LXq2;

    invoke-virtual {v0}, LXq2;->e()LSh;

    move-result-object v0

    invoke-static {p1}, LXq2;->l(Lcom/facebook/share/internal/LikeContent;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {}, LXq2;->m()Lp31;

    move-result-object v1

    invoke-static {v0, p1, v1}, LC31;->l(LSh;Landroid/os/Bundle;Lp31;)V

    return-object v0
.end method
