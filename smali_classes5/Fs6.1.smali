.class public LFs6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public b:Landroid/graphics/RectF;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:[F

.field public p:Landroid/graphics/Matrix;

.field public final q:[F


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LFs6;->a:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput v0, p0, LFs6;->c:F

    iput v0, p0, LFs6;->d:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, LFs6;->e:F

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    iput v2, p0, LFs6;->f:F

    iput v1, p0, LFs6;->g:F

    iput v2, p0, LFs6;->h:F

    iput v1, p0, LFs6;->i:F

    iput v1, p0, LFs6;->j:F

    iput v0, p0, LFs6;->k:F

    iput v0, p0, LFs6;->l:F

    iput v0, p0, LFs6;->m:F

    iput v0, p0, LFs6;->n:F

    const/16 v0, 0x9

    new-array v1, v0, [F

    iput-object v1, p0, LFs6;->o:[F

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, LFs6;->p:Landroid/graphics/Matrix;

    new-array v0, v0, [F

    iput-object v0, p0, LFs6;->q:[F

    return-void
.end method


# virtual methods
.method public A(F)Z
    .locals 2

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr p1, v1

    cmpl-float p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public B(F)Z
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public C(F)Z
    .locals 1

    invoke-virtual {p0, p1}, LFs6;->z(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LFs6;->A(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D(F)Z
    .locals 1

    invoke-virtual {p0, p1}, LFs6;->B(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LFs6;->y(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V
    .locals 9

    iget-object v0, p0, LFs6;->q:[F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, LFs6;->q:[F

    const/4 v1, 0x2

    aget v2, v0, v1

    const/4 v3, 0x0

    aget v4, v0, v3

    const/4 v5, 0x5

    aget v6, v0, v5

    const/4 v7, 0x4

    aget v0, v0, v7

    iget v8, p0, LFs6;->g:F

    invoke-static {v8, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget v8, p0, LFs6;->h:F

    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iput v4, p0, LFs6;->i:F

    iget v4, p0, LFs6;->e:F

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v4, p0, LFs6;->f:F

    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, LFs6;->j:F

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move p2, v0

    :goto_0
    neg-float v0, v0

    iget v4, p0, LFs6;->i:F

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v4, v8

    mul-float/2addr v0, v4

    iget v4, p0, LFs6;->m:F

    sub-float/2addr v0, v4

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v2, p0, LFs6;->m:F

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, LFs6;->k:F

    iget v0, p0, LFs6;->j:F

    sub-float/2addr v0, v8

    mul-float/2addr p2, v0

    iget v0, p0, LFs6;->n:F

    add-float/2addr p2, v0

    invoke-static {v6, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iget v0, p0, LFs6;->n:F

    neg-float v0, v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, LFs6;->l:F

    iget-object v0, p0, LFs6;->q:[F

    iget v2, p0, LFs6;->k:F

    aput v2, v0, v1

    iget v1, p0, LFs6;->i:F

    aput v1, v0, v3

    aput p2, v0, v5

    iget p2, p0, LFs6;->j:F

    aput p2, v0, v7

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    return-void
.end method

.method public F()F
    .locals 2

    iget v0, p0, LFs6;->d:F

    iget-object v1, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public G()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    return v0
.end method

.method public H()F
    .locals 2

    iget v0, p0, LFs6;->c:F

    iget-object v1, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public I()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    return v0
.end method

.method public J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, LFs6;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, v0, v1}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_0
    iget-object p2, p0, LFs6;->a:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-object p1
.end method

.method public K(FFFF)V
    .locals 2

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v1, p0, LFs6;->c:F

    sub-float/2addr v1, p3

    iget p3, p0, LFs6;->d:F

    sub-float/2addr p3, p4

    invoke-virtual {v0, p1, p2, v1, p3}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public L(FF)V
    .locals 4

    invoke-virtual {p0}, LFs6;->G()F

    move-result v0

    invoke-virtual {p0}, LFs6;->I()F

    move-result v1

    invoke-virtual {p0}, LFs6;->H()F

    move-result v2

    invoke-virtual {p0}, LFs6;->F()F

    move-result v3

    iput p2, p0, LFs6;->d:F

    iput p1, p0, LFs6;->c:F

    invoke-virtual {p0, v0, v1, v2, v3}, LFs6;->K(FFFF)V

    return-void
.end method

.method public M(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, LFs6;->m:F

    return-void
.end method

.method public N(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, LFs6;->n:F

    return-void
.end method

.method public O(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    :cond_0
    iput p1, p0, LFs6;->h:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public P(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    :cond_0
    iput p1, p0, LFs6;->f:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public Q(FF)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    const p2, 0x7f7fffff    # Float.MAX_VALUE

    :cond_1
    iput p1, p0, LFs6;->g:F

    iput p2, p0, LFs6;->h:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object p2, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public R(FF)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    const p2, 0x7f7fffff    # Float.MAX_VALUE

    :cond_1
    iput p1, p0, LFs6;->e:F

    iput p2, p0, LFs6;->f:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object p2, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public S(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    iput p1, p0, LFs6;->g:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public T(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    iput p1, p0, LFs6;->e:F

    iget-object p1, p0, LFs6;->a:Landroid/graphics/Matrix;

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, LFs6;->E(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    return-void
.end method

.method public U(FFFFLandroid/graphics/Matrix;)V
    .locals 1

    invoke-virtual {p5}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, LFs6;->a:Landroid/graphics/Matrix;

    invoke-virtual {p5, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    invoke-virtual {p5, p1, p2, p3, p4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    return-void
.end method

.method public a()Z
    .locals 2

    iget v0, p0, LFs6;->i:F

    iget v1, p0, LFs6;->h:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, LFs6;->j:F

    iget v1, p0, LFs6;->f:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Z
    .locals 2

    iget v0, p0, LFs6;->i:F

    iget v1, p0, LFs6;->g:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, LFs6;->j:F

    iget v1, p0, LFs6;->e:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e([FLandroid/view/View;)V
    .locals 4

    iget-object v0, p0, LFs6;->p:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, LFs6;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    const/4 v1, 0x0

    aget v1, p1, v1

    invoke-virtual {p0}, LFs6;->G()F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x1

    aget p1, p1, v2

    invoke-virtual {p0}, LFs6;->I()F

    move-result v3

    sub-float/2addr p1, v3

    neg-float v1, v1

    neg-float p1, p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {p0, v0, p2, v2}, LFs6;->J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    return-void
.end method

.method public f()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    return v0
.end method

.method public g()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    return v0
.end method

.method public h()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    return v0
.end method

.method public i()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    return v0
.end method

.method public j()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    return v0
.end method

.method public k()F
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    return v0
.end method

.method public l()F
    .locals 1

    iget v0, p0, LFs6;->d:F

    return v0
.end method

.method public m()F
    .locals 1

    iget v0, p0, LFs6;->c:F

    return v0
.end method

.method public n()LPE2;
    .locals 2

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-static {v0, v1}, LPE2;->c(FF)LPE2;

    move-result-object v0

    return-object v0
.end method

.method public o()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    return-object v0
.end method

.method public p()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, LFs6;->a:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public q()F
    .locals 1

    iget v0, p0, LFs6;->i:F

    return v0
.end method

.method public r()F
    .locals 1

    iget v0, p0, LFs6;->j:F

    return v0
.end method

.method public s()F
    .locals 2

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, LFs6;->b:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 2

    iget v0, p0, LFs6;->m:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p0, LFs6;->n:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u()Z
    .locals 1

    invoke-virtual {p0}, LFs6;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFs6;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v()Z
    .locals 2

    iget v0, p0, LFs6;->i:F

    iget v1, p0, LFs6;->g:F

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()Z
    .locals 2

    iget v0, p0, LFs6;->j:F

    iget v1, p0, LFs6;->e:F

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x(FF)Z
    .locals 0

    invoke-virtual {p0, p1}, LFs6;->C(F)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, LFs6;->D(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public y(F)Z
    .locals 1

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public z(F)Z
    .locals 2

    iget-object v0, p0, LFs6;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr p1, v1

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
