.class public LXq2$a;
.super Ljj1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXq2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
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

    iput-object p1, p0, LXq2$a;->b:LXq2;

    invoke-direct {p0, p1}, Ljj1$a;-><init>(Ljj1;)V

    return-void
.end method

.method public synthetic constructor <init>(LXq2;LWq2;)V
    .locals 0

    invoke-direct {p0, p1}, LXq2$a;-><init>(LXq2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1, p2}, LXq2$a;->d(Lcom/facebook/share/internal/LikeContent;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)LSh;
    .locals 0

    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, LXq2$a;->e(Lcom/facebook/share/internal/LikeContent;)LSh;

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

    iget-object v0, p0, LXq2$a;->b:LXq2;

    invoke-virtual {v0}, LXq2;->e()LSh;

    move-result-object v0

    new-instance v1, LXq2$a$a;

    invoke-direct {v1, p0, p1}, LXq2$a$a;-><init>(LXq2$a;Lcom/facebook/share/internal/LikeContent;)V

    invoke-static {}, LXq2;->m()Lp31;

    move-result-object p1

    invoke-static {v0, v1, p1}, LC31;->i(LSh;LC31$a;Lp31;)V

    return-object v0
.end method
