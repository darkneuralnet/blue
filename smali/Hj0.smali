.class public LHj0;
.super LCu6;
.source "SourceFile"


# instance fields
.field public b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LCu6;-><init>()V

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, LHj0;->b:F

    return-void
.end method

.method public static h(FFFF)F
    .locals 0

    sub-float/2addr p2, p0

    sub-float/2addr p3, p1

    mul-float/2addr p2, p2

    mul-float/2addr p3, p3

    add-float/2addr p2, p3

    float-to-double p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method


# virtual methods
.method public c(Landroid/view/ViewGroup;Landroidx/transition/Transition;LN96;LN96;)J
    .locals 8

    const-wide/16 v0, 0x0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-wide v0

    :cond_0
    const/4 v2, 0x1

    if-eqz p4, :cond_2

    invoke-virtual {p0, p3}, LCu6;->e(LN96;)I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object p3, p4

    move p4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p4, -0x1

    :goto_1
    invoke-virtual {p0, p3}, LCu6;->f(LN96;)I

    move-result v3

    invoke-virtual {p0, p3}, LCu6;->g(LN96;)I

    move-result p3

    invoke-virtual {p2}, Landroidx/transition/Transition;->A()Landroid/graphics/Rect;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x2

    new-array v5, v4, [I

    invoke-virtual {p1, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v6, 0x0

    aget v6, v5, v6

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v7

    div-int/2addr v7, v4

    add-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v7

    add-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    div-int/2addr v5, v4

    add-int/2addr v2, v5

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v4

    add-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v4

    move v2, v6

    :goto_2
    int-to-float v3, v3

    int-to-float p3, p3

    int-to-float v2, v2

    int-to-float v4, v4

    invoke-static {v3, p3, v2, v4}, LHj0;->h(FFFF)F

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v3, 0x0

    invoke-static {v3, v3, v2, p1}, LHj0;->h(FFFF)F

    move-result p1

    div-float/2addr p3, p1

    invoke-virtual {p2}, Landroidx/transition/Transition;->z()J

    move-result-wide p1

    cmp-long v0, p1, v0

    if-gez v0, :cond_4

    const-wide/16 p1, 0x12c

    :cond_4
    int-to-long v0, p4

    mul-long/2addr p1, v0

    long-to-float p1, p1

    iget p2, p0, LHj0;->b:F

    div-float/2addr p1, p2

    mul-float/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method
