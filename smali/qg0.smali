.class public Lqg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltg0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsg0;)V
    .locals 1

    invoke-virtual {p0, p1}, Lqg0;->n(Lsg0;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lqg0;->c(Lsg0;F)V

    return-void
.end method

.method public b(Lsg0;)F
    .locals 0

    invoke-interface {p1}, Lsg0;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public c(Lsg0;F)V
    .locals 3

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object v0

    invoke-interface {p1}, Lsg0;->b()Z

    move-result v1

    invoke-interface {p1}, Lsg0;->e()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, LXb5;->g(FZZ)V

    invoke-virtual {p0, p1}, Lqg0;->g(Lsg0;)V

    return-void
.end method

.method public d(Lsg0;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object p1

    invoke-virtual {p1, p2}, LXb5;->h(F)V

    return-void
.end method

.method public e(Lsg0;)F
    .locals 1

    invoke-virtual {p0, p1}, Lqg0;->k(Lsg0;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public f(Lsg0;)V
    .locals 1

    invoke-virtual {p0, p1}, Lqg0;->n(Lsg0;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lqg0;->c(Lsg0;F)V

    return-void
.end method

.method public g(Lsg0;)V
    .locals 4

    invoke-interface {p1}, Lsg0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0, v0}, Lsg0;->a(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lqg0;->n(Lsg0;)F

    move-result v0

    invoke-virtual {p0, p1}, Lqg0;->k(Lsg0;)F

    move-result v1

    invoke-interface {p1}, Lsg0;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, LYb5;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, Lsg0;->e()Z

    move-result v3

    invoke-static {v0, v1, v3}, LYb5;->b(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, Lsg0;->a(IIII)V

    return-void
.end method

.method public h(Lsg0;)F
    .locals 1

    invoke-virtual {p0, p1}, Lqg0;->k(Lsg0;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public i(Lsg0;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 0

    new-instance p2, LXb5;

    invoke-direct {p2, p3, p4}, LXb5;-><init>(Landroid/content/res/ColorStateList;F)V

    invoke-interface {p1, p2}, Lsg0;->c(Landroid/graphics/drawable/Drawable;)V

    invoke-interface {p1}, Lsg0;->f()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p2, p5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1, p6}, Lqg0;->c(Lsg0;F)V

    return-void
.end method

.method public j(Lsg0;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object p1

    invoke-virtual {p1, p2}, LXb5;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public k(Lsg0;)F
    .locals 0

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object p1

    invoke-virtual {p1}, LXb5;->d()F

    move-result p1

    return p1
.end method

.method public l(Lsg0;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object p1

    invoke-virtual {p1}, LXb5;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public m(Lsg0;F)V
    .locals 0

    invoke-interface {p1}, Lsg0;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public n(Lsg0;)F
    .locals 0

    invoke-virtual {p0, p1}, Lqg0;->p(Lsg0;)LXb5;

    move-result-object p1

    invoke-virtual {p1}, LXb5;->c()F

    move-result p1

    return p1
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public final p(Lsg0;)LXb5;
    .locals 0

    invoke-interface {p1}, Lsg0;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, LXb5;

    return-object p1
.end method
