.class public LDB6$j;
.super LDB6$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public n:LD32;

.field public o:LD32;

.field public p:LD32;


# direct methods
.method public constructor <init>(LDB6;LDB6$j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$i;-><init>(LDB6;LDB6$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, LDB6$j;->n:LD32;

    iput-object p1, p0, LDB6$j;->o:LD32;

    iput-object p1, p0, LDB6$j;->p:LD32;

    return-void
.end method

.method public constructor <init>(LDB6;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$i;-><init>(LDB6;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LDB6$j;->n:LD32;

    iput-object p1, p0, LDB6$j;->o:LD32;

    iput-object p1, p0, LDB6$j;->p:LD32;

    return-void
.end method


# virtual methods
.method public i()LD32;
    .locals 1

    iget-object v0, p0, LDB6$j;->o:LD32;

    if-nez v0, :cond_0

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LSB6;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object v0

    iput-object v0, p0, LDB6$j;->o:LD32;

    :cond_0
    iget-object v0, p0, LDB6$j;->o:LD32;

    return-object v0
.end method

.method public k()LD32;
    .locals 1

    iget-object v0, p0, LDB6$j;->n:LD32;

    if-nez v0, :cond_0

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LQB6;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object v0

    iput-object v0, p0, LDB6$j;->n:LD32;

    :cond_0
    iget-object v0, p0, LDB6$j;->n:LD32;

    return-object v0
.end method

.method public m()LD32;
    .locals 1

    iget-object v0, p0, LDB6$j;->p:LD32;

    if-nez v0, :cond_0

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LRB6;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object v0

    iput-object v0, p0, LDB6$j;->p:LD32;

    :cond_0
    iget-object v0, p0, LDB6$j;->p:LD32;

    return-object v0
.end method

.method public n(IIII)LDB6;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LTB6;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object p1

    return-object p1
.end method

.method public u(LD32;)V
    .locals 0

    return-void
.end method
