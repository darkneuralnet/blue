.class public Landroidx/transition/Explode;
.super Landroidx/transition/Visibility;
.source "SourceFile"


# static fields
.field public static final S:Landroid/animation/TimeInterpolator;

.field public static final T:Landroid/animation/TimeInterpolator;


# instance fields
.field public R:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Explode;->S:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Explode;->T:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/transition/Explode;->R:[I

    new-instance v0, LHj0;

    invoke-direct {v0}, LHj0;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->v0(LL96;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/transition/Explode;->R:[I

    new-instance p1, LHj0;

    invoke-direct {p1}, LHj0;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/transition/Transition;->v0(LL96;)V

    return-void
.end method

.method private A0(LN96;)V
    .locals 5

    iget-object v0, p1, LN96;->b:Landroid/view/View;

    iget-object v1, p0, Landroidx/transition/Explode;->R:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v1, p0, Landroidx/transition/Explode;->R:[I

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v1

    iget-object p1, p1, LN96;->a:Ljava/util/Map;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, v2, v1, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v0, "android:explode:screenBounds"

    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static K0(FF)F
    .locals 0

    mul-float/2addr p0, p0

    mul-float/2addr p1, p1

    add-float/2addr p0, p1

    float-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static L0(Landroid/view/View;II)F
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    sub-int/2addr p0, p2

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    int-to-float p1, p1

    int-to-float p0, p0

    invoke-static {p1, p0}, Landroidx/transition/Explode;->K0(FF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public G0(Landroid/view/ViewGroup;Landroid/view/View;LN96;LN96;)Landroid/animation/Animator;
    .locals 10

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p3, p4, LN96;->a:Ljava/util/Map;

    const-string v0, "android:explode:screenBounds"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    iget-object v0, p0, Landroidx/transition/Explode;->R:[I

    invoke-virtual {p0, p1, p3, v0}, Landroidx/transition/Explode;->M0(Landroid/view/View;Landroid/graphics/Rect;[I)V

    iget-object p1, p0, Landroidx/transition/Explode;->R:[I

    const/4 v0, 0x0

    aget v0, p1, v0

    int-to-float v0, v0

    add-float v4, v6, v0

    const/4 v0, 0x1

    aget p1, p1, v0

    int-to-float p1, p1

    add-float v5, v7, p1

    iget v2, p3, Landroid/graphics/Rect;->left:I

    iget v3, p3, Landroid/graphics/Rect;->top:I

    sget-object v8, Landroidx/transition/Explode;->S:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p4

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Landroidx/transition/e;->a(Landroid/view/View;LN96;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public I0(Landroid/view/ViewGroup;Landroid/view/View;LN96;LN96;)Landroid/animation/Animator;
    .locals 10

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p4, p3, LN96;->a:Ljava/util/Map;

    const-string v0, "android:explode:screenBounds"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/graphics/Rect;

    iget v2, p4, Landroid/graphics/Rect;->left:I

    iget v3, p4, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    iget-object v0, p3, LN96;->b:Landroid/view/View;

    sget v1, LUg4;->transition_position:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    aget v7, v0, v6

    iget v8, p4, Landroid/graphics/Rect;->left:I

    sub-int v8, v7, v8

    int-to-float v8, v8

    add-float/2addr v8, v4

    aget v0, v0, v1

    iget v9, p4, Landroid/graphics/Rect;->top:I

    sub-int v9, v0, v9

    int-to-float v9, v9

    add-float/2addr v9, v5

    invoke-virtual {p4, v7, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    goto :goto_0

    :cond_1
    move v8, v4

    move v9, v5

    :goto_0
    iget-object v0, p0, Landroidx/transition/Explode;->R:[I

    invoke-virtual {p0, p1, p4, v0}, Landroidx/transition/Explode;->M0(Landroid/view/View;Landroid/graphics/Rect;[I)V

    iget-object p1, p0, Landroidx/transition/Explode;->R:[I

    aget p4, p1, v6

    int-to-float p4, p4

    add-float v6, v8, p4

    aget p1, p1, v1

    int-to-float p1, p1

    add-float v7, v9, p1

    sget-object v8, Landroidx/transition/Explode;->T:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p3

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Landroidx/transition/e;->a(Landroid/view/View;LN96;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public final M0(Landroid/view/View;Landroid/graphics/Rect;[I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/transition/Explode;->R:[I

    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v2, v0, Landroidx/transition/Explode;->R:[I

    const/4 v3, 0x0

    aget v4, v2, v3

    const/4 v5, 0x1

    aget v2, v2, v5

    invoke-virtual {p0}, Landroidx/transition/Transition;->A()Landroid/graphics/Rect;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v6, v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationX()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationY()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Landroid/graphics/Rect;->centerX()I

    move-result v7

    invoke-virtual {v6}, Landroid/graphics/Rect;->centerY()I

    move-result v6

    move v14, v7

    move v7, v6

    move v6, v14

    :goto_0
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->centerX()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->centerY()I

    move-result v9

    sub-int/2addr v8, v6

    int-to-float v8, v8

    sub-int/2addr v9, v7

    int-to-float v9, v9

    const/4 v10, 0x0

    cmpl-float v11, v8, v10

    if-nez v11, :cond_1

    cmpl-float v10, v9, v10

    if-nez v10, :cond_1

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v8

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    mul-double/2addr v8, v10

    double-to-float v8, v8

    const/high16 v9, 0x3f800000    # 1.0f

    sub-float/2addr v8, v9

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v12

    mul-double/2addr v12, v10

    double-to-float v10, v12

    sub-float v9, v10, v9

    :cond_1
    invoke-static {v8, v9}, Landroidx/transition/Explode;->K0(FF)F

    move-result v10

    div-float/2addr v8, v10

    div-float/2addr v9, v10

    sub-int/2addr v6, v4

    sub-int/2addr v7, v2

    invoke-static {v1, v6, v7}, Landroidx/transition/Explode;->L0(Landroid/view/View;II)F

    move-result v1

    mul-float/2addr v8, v1

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v2

    aput v2, p3, v3

    mul-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    aput v1, p3, v5

    return-void
.end method

.method public k(LN96;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/transition/Visibility;->k(LN96;)V

    invoke-direct {p0, p1}, Landroidx/transition/Explode;->A0(LN96;)V

    return-void
.end method

.method public n(LN96;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/transition/Visibility;->n(LN96;)V

    invoke-direct {p0, p1}, Landroidx/transition/Explode;->A0(LN96;)V

    return-void
.end method
