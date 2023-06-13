.class public LDB6$h;
.super LDB6$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public m:LD32;


# direct methods
.method public constructor <init>(LDB6;LDB6$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$g;-><init>(LDB6;LDB6$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, LDB6$h;->m:LD32;

    iget-object p1, p2, LDB6$h;->m:LD32;

    iput-object p1, p0, LDB6$h;->m:LD32;

    return-void
.end method

.method public constructor <init>(LDB6;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$g;-><init>(LDB6;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LDB6$h;->m:LD32;

    return-void
.end method


# virtual methods
.method public b()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object v0

    return-object v0
.end method

.method public c()LDB6;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object v0

    return-object v0
.end method

.method public final j()LD32;
    .locals 4

    iget-object v0, p0, LDB6$h;->m:LD32;

    if-nez v0, :cond_0

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, LD32;->b(IIII)LD32;

    move-result-object v0

    iput-object v0, p0, LDB6$h;->m:LD32;

    :cond_0
    iget-object v0, p0, LDB6$h;->m:LD32;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public u(LD32;)V
    .locals 0

    iput-object p1, p0, LDB6$h;->m:LD32;

    return-void
.end method
