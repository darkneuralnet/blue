.class public LDB6$d;
.super LDB6$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LDB6$f;-><init>()V

    invoke-static {}, LMB6;->a()V

    invoke-static {}, LKB6;->a()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 0

    invoke-direct {p0, p1}, LDB6$f;-><init>(LDB6;)V

    invoke-virtual {p1}, LDB6;->x()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, LMB6;->a()V

    invoke-static {p1}, LLB6;->a(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LMB6;->a()V

    invoke-static {}, LKB6;->a()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LDB6;
    .locals 2

    invoke-virtual {p0}, LDB6$f;->a()V

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LJB6;->a(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object v0

    iget-object v1, p0, LDB6$f;->b:[LD32;

    invoke-virtual {v0, v1}, LDB6;->t([LD32;)V

    return-object v0
.end method

.method public d(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LHB6;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LGB6;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public f(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LIB6;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public g(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LFB6;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public h(LD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LEB6;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
