.class public LpJ6;
.super LvE;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LvE;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Landroid/view/View;F)V
    .locals 8

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-gez v0, :cond_0

    cmpg-float v0, p2, v1

    if-gtz v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    sub-float v3, v1, v3

    const v4, 0x3f59999a    # 0.85f

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sub-float/2addr v1, v3

    mul-float v5, v0, v1

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    mul-float/2addr v1, v2

    div-float/2addr v1, v6

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float/2addr v0, v7

    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotY(F)V

    mul-float/2addr v2, v7

    invoke-virtual {p1, v2}, Landroid/view/View;->setPivotX(F)V

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-gez p2, :cond_1

    div-float/2addr v5, v6

    sub-float/2addr v1, v5

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_0

    :cond_1
    neg-float p2, v1

    div-float/2addr v5, v6

    add-float/2addr p2, v5

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setScaleY(F)V

    sub-float/2addr v3, v4

    const p2, 0x3e199998    # 0.14999998f

    div-float/2addr v3, p2

    mul-float/2addr v3, v7

    add-float/2addr v3, v7

    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    return-void
.end method
