.class public final Lco/bird/android/widget/cropper/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/RectF;

.field public final b:Landroid/graphics/RectF;

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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/cropper/d;->b:Landroid/graphics/RectF;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lco/bird/android/widget/cropper/d;->k:F

    iput v0, p0, Lco/bird/android/widget/cropper/d;->l:F

    return-void
.end method

.method public static l(FFFFFF)Z
    .locals 0

    cmpl-float p2, p0, p2

    if-lez p2, :cond_0

    cmpg-float p0, p0, p4

    if-gez p0, :cond_0

    cmpl-float p0, p1, p3

    if-lez p0, :cond_0

    cmpg-float p0, p1, p5

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static m(FFFFF)Z
    .locals 0

    sub-float/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p4

    if-gtz p0, :cond_0

    sub-float/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p4

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(FFFFFF)Z
    .locals 0

    cmpl-float p2, p0, p2

    if-lez p2, :cond_0

    cmpg-float p0, p0, p3

    if-gez p0, :cond_0

    sub-float/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p5

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static o(FFFFFF)Z
    .locals 0

    sub-float/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p5

    if-gtz p0, :cond_0

    cmpl-float p0, p1, p3

    if-lez p0, :cond_0

    cmpg-float p0, p1, p4

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/d;->u()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public b()F
    .locals 3

    iget v0, p0, Lco/bird/android/widget/cropper/d;->f:F

    iget v1, p0, Lco/bird/android/widget/cropper/d;->j:F

    iget v2, p0, Lco/bird/android/widget/cropper/d;->l:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public c()F
    .locals 3

    iget v0, p0, Lco/bird/android/widget/cropper/d;->e:F

    iget v1, p0, Lco/bird/android/widget/cropper/d;->i:F

    iget v2, p0, Lco/bird/android/widget/cropper/d;->k:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public d()F
    .locals 3

    iget v0, p0, Lco/bird/android/widget/cropper/d;->d:F

    iget v1, p0, Lco/bird/android/widget/cropper/d;->h:F

    iget v2, p0, Lco/bird/android/widget/cropper/d;->l:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public e()F
    .locals 3

    iget v0, p0, Lco/bird/android/widget/cropper/d;->c:F

    iget v1, p0, Lco/bird/android/widget/cropper/d;->g:F

    iget v2, p0, Lco/bird/android/widget/cropper/d;->k:F

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public f(FFFLco/bird/android/widget/cropper/CropImageView$c;)Lco/bird/android/widget/cropper/e;
    .locals 1

    sget-object v0, Lco/bird/android/widget/cropper/CropImageView$c;->c:Lco/bird/android/widget/cropper/CropImageView$c;

    if-ne p4, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/cropper/d;->g(FF)Lco/bird/android/widget/cropper/e$b;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/widget/cropper/d;->i(FFF)Lco/bird/android/widget/cropper/e$b;

    move-result-object p3

    :goto_0
    if-eqz p3, :cond_1

    new-instance p4, Lco/bird/android/widget/cropper/e;

    invoke-direct {p4, p3, p0, p1, p2}, Lco/bird/android/widget/cropper/e;-><init>(Lco/bird/android/widget/cropper/e$b;Lco/bird/android/widget/cropper/d;FF)V

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    return-object p4
.end method

.method public final g(FF)Lco/bird/android/widget/cropper/e$b;
    .locals 6

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float v4, v3, v0

    const/high16 v5, 0x40a00000    # 5.0f

    mul-float/2addr v0, v5

    add-float/2addr v3, v0

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v1

    iget-object v1, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float v2, v1, v0

    mul-float/2addr v0, v5

    add-float/2addr v1, v0

    cmpg-float v0, p1, v4

    if-gez v0, :cond_2

    cmpg-float p1, p2, v2

    if-gez p1, :cond_0

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->b:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_0
    cmpg-float p1, p2, v1

    if-gez p1, :cond_1

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->f:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/widget/cropper/e$b;->d:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_2
    cmpg-float p1, p1, v3

    if-gez p1, :cond_5

    cmpg-float p1, p2, v2

    if-gez p1, :cond_3

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->g:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_3
    cmpg-float p1, p2, v1

    if-gez p1, :cond_4

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->j:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_4
    sget-object p1, Lco/bird/android/widget/cropper/e$b;->i:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_5
    cmpg-float p1, p2, v2

    if-gez p1, :cond_6

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->c:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_6
    cmpg-float p1, p2, v1

    if-gez p1, :cond_7

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->h:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_7
    sget-object p1, Lco/bird/android/widget/cropper/e$b;->e:Lco/bird/android/widget/cropper/e$b;

    :goto_0
    return-object p1
.end method

.method public h()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->b:Landroid/graphics/RectF;

    iget-object v1, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->b:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final i(FFF)Lco/bird/android/widget/cropper/e$b;
    .locals 7

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-static {p1, p2, v1, v0, p3}, Lco/bird/android/widget/cropper/d;->m(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->b:Lco/bird/android/widget/cropper/e$b;

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-static {p1, p2, v1, v0, p3}, Lco/bird/android/widget/cropper/d;->m(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->c:Lco/bird/android/widget/cropper/e$b;

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {p1, p2, v1, v0, p3}, Lco/bird/android/widget/cropper/d;->m(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->d:Lco/bird/android/widget/cropper/e$b;

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {p1, p2, v1, v0, p3}, Lco/bird/android/widget/cropper/d;->m(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->e:Lco/bird/android/widget/cropper/e$b;

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    iget v4, v0, Landroid/graphics/RectF;->top:F

    iget v5, v0, Landroid/graphics/RectF;->right:F

    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    move v1, p1

    move v2, p2

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/d;->l(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/d;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->j:Lco/bird/android/widget/cropper/e$b;

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v5, v0, Landroid/graphics/RectF;->top:F

    move v1, p1

    move v2, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/d;->n(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->g:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    move v1, p1

    move v2, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/d;->n(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->i:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    iget v4, v0, Landroid/graphics/RectF;->top:F

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    move v1, p1

    move v2, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/d;->o(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->f:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->right:F

    iget v4, v0, Landroid/graphics/RectF;->top:F

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    move v1, p1

    move v2, p2

    move v6, p3

    invoke-static/range {v1 .. v6}, Lco/bird/android/widget/cropper/d;->o(FFFFFF)Z

    move-result p3

    if-eqz p3, :cond_8

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->h:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_8
    iget-object p3, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    iget v2, p3, Landroid/graphics/RectF;->left:F

    iget v3, p3, Landroid/graphics/RectF;->top:F

    iget v4, p3, Landroid/graphics/RectF;->right:F

    iget v5, p3, Landroid/graphics/RectF;->bottom:F

    move v0, p1

    move v1, p2

    invoke-static/range {v0 .. v5}, Lco/bird/android/widget/cropper/d;->l(FFFFFF)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/d;->a()Z

    move-result p1

    if-nez p1, :cond_9

    sget-object p1, Lco/bird/android/widget/cropper/e$b;->j:Lco/bird/android/widget/cropper/e$b;

    goto :goto_0

    :cond_9
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/d;->l:F

    return v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/d;->k:F

    return v0
.end method

.method public p(FFFF)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/cropper/d;->e:F

    iput p2, p0, Lco/bird/android/widget/cropper/d;->f:F

    iput p3, p0, Lco/bird/android/widget/cropper/d;->k:F

    iput p4, p0, Lco/bird/android/widget/cropper/d;->l:F

    return-void
.end method

.method public q(Lco/bird/android/widget/cropper/CropImageOptions;)V
    .locals 1

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->y:I

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/d;->c:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->z:I

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/d;->d:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->A:I

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/d;->g:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->B:I

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/d;->h:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->C:I

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/cropper/d;->i:F

    iget p1, p1, Lco/bird/android/widget/cropper/CropImageOptions;->D:I

    int-to-float p1, p1

    iput p1, p0, Lco/bird/android/widget/cropper/d;->j:F

    return-void
.end method

.method public r(II)V
    .locals 0

    int-to-float p1, p1

    iput p1, p0, Lco/bird/android/widget/cropper/d;->i:F

    int-to-float p1, p2

    iput p1, p0, Lco/bird/android/widget/cropper/d;->j:F

    return-void
.end method

.method public s(II)V
    .locals 0

    int-to-float p1, p1

    iput p1, p0, Lco/bird/android/widget/cropper/d;->g:F

    int-to-float p1, p2

    iput p1, p0, Lco/bird/android/widget/cropper/d;->h:F

    return-void
.end method

.method public t(Landroid/graphics/RectF;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    return-void
.end method

.method public u()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
