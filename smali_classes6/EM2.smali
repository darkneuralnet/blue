.class public LEM2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Landroid/graphics/drawable/Drawable;

.field public static final z:D


# instance fields
.field public final a:Lcom/google/android/material/card/MaterialCardView;

.field public final b:Landroid/graphics/Rect;

.field public final c:LPM2;

.field public final d:LPM2;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Liy5;

.field public n:Landroid/content/res/ColorStateList;

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:Landroid/graphics/drawable/LayerDrawable;

.field public q:LPM2;

.field public r:LPM2;

.field public s:Z

.field public t:Z

.field public u:Landroid/animation/ValueAnimator;

.field public final v:Landroid/animation/TimeInterpolator;

.field public final w:I

.field public final x:I

.field public y:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    sput-wide v0, LEM2;->z:D

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, LEM2;->A:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/card/MaterialCardView;Landroid/util/AttributeSet;II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LEM2;->b:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-boolean v0, p0, LEM2;->s:Z

    const/4 v0, 0x0

    iput v0, p0, LEM2;->y:F

    iput-object p1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    new-instance v1, LPM2;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p2, p3, p4}, LPM2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v1, p0, LEM2;->c:LPM2;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {v1, p4}, LPM2;->P(Landroid/content/Context;)V

    const p4, -0xbbbbbc

    invoke-virtual {v1, p4}, LPM2;->g0(I)V

    invoke-virtual {v1}, LPM2;->E()Liy5;

    move-result-object p4

    invoke-virtual {p4}, Liy5;->v()Liy5$b;

    move-result-object p4

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, LXl4;->CardView:[I

    sget v3, Lul4;->CardView:I

    invoke-virtual {v1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, LXl4;->CardView_cardCornerRadius:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p4, p3}, Liy5$b;->o(F)Liy5$b;

    :cond_0
    new-instance p3, LPM2;

    invoke-direct {p3}, LPM2;-><init>()V

    iput-object p3, p0, LEM2;->d:LPM2;

    invoke-virtual {p4}, Liy5$b;->m()Liy5;

    move-result-object p3

    invoke-virtual {p0, p3}, LEM2;->L(Liy5;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Luf4;->motionEasingLinearInterpolator:I

    sget-object v0, Lpf;->a:Landroid/animation/TimeInterpolator;

    invoke-static {p3, p4, v0}, LaW2;->g(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p3

    iput-object p3, p0, LEM2;->v:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Luf4;->motionDurationShort2:I

    const/16 v0, 0x12c

    invoke-static {p3, p4, v0}, LaW2;->f(Landroid/content/Context;II)I

    move-result p3

    iput p3, p0, LEM2;->w:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, Luf4;->motionDurationShort1:I

    invoke-static {p1, p3, v0}, LaW2;->f(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, LEM2;->x:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(LEM2;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0, p1}, LEM2;->u(Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private synthetic u(Landroid/animation/ValueAnimator;)V
    .locals 2

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iget-object v1, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iput p1, p0, LEM2;->y:F

    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    iput-boolean p1, p0, LEM2;->t:Z

    return-void
.end method

.method public B(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LEM2;->C(ZZ)V

    return-void
.end method

.method public C(ZZ)V
    .locals 1

    iget-object v0, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LEM2;->b(Z)V

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    const/16 p2, 0xff

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput p1, p0, LEM2;->y:F

    :cond_3
    :goto_2
    return-void
.end method

.method public D(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, LEM2;->l:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, LP61;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p1}, Lcom/google/android/material/card/MaterialCardView;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, LEM2;->B(Z)V

    goto :goto_0

    :cond_0
    sget-object p1, LEM2;->A:Landroid/graphics/drawable/Drawable;

    iput-object p1, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    :goto_0
    iget-object p1, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    if-eqz p1, :cond_1

    sget v0, LJi4;->mtrl_card_checked_layer_id:I

    iget-object v1, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/LayerDrawable;->setDrawableByLayerId(ILandroid/graphics/drawable/Drawable;)Z

    :cond_1
    return-void
.end method

.method public E(I)V
    .locals 1

    iput p1, p0, LEM2;->g:I

    iget-object p1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, p1, v0}, LEM2;->w(II)V

    return-void
.end method

.method public F(I)V
    .locals 0

    iput p1, p0, LEM2;->e:I

    return-void
.end method

.method public G(I)V
    .locals 0

    iput p1, p0, LEM2;->f:I

    return-void
.end method

.method public H(Landroid/content/res/ColorStateList;)V
    .locals 1

    iput-object p1, p0, LEM2;->l:Landroid/content/res/ColorStateList;

    iget-object v0, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LP61;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public I(F)V
    .locals 1

    iget-object v0, p0, LEM2;->m:Liy5;

    invoke-virtual {v0, p1}, Liy5;->w(F)Liy5;

    move-result-object p1

    invoke-virtual {p0, p1}, LEM2;->L(Liy5;)V

    iget-object p1, p0, LEM2;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-virtual {p0}, LEM2;->Q()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LEM2;->P()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, LEM2;->S()V

    :cond_1
    invoke-virtual {p0}, LEM2;->Q()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LEM2;->V()V

    :cond_2
    return-void
.end method

.method public J(F)V
    .locals 1

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {v0, p1}, LPM2;->b0(F)V

    iget-object v0, p0, LEM2;->d:LPM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LPM2;->b0(F)V

    :cond_0
    iget-object v0, p0, LEM2;->r:LPM2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LPM2;->b0(F)V

    :cond_1
    return-void
.end method

.method public K(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LEM2;->W()V

    return-void
.end method

.method public L(Liy5;)V
    .locals 2

    iput-object p1, p0, LEM2;->m:Liy5;

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {v0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {v0}, LPM2;->S()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, LPM2;->f0(Z)V

    iget-object v0, p0, LEM2;->d:LPM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    :cond_0
    iget-object v0, p0, LEM2;->r:LPM2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    :cond_1
    iget-object v0, p0, LEM2;->q:LPM2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    :cond_2
    return-void
.end method

.method public M(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LEM2;->n:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LEM2;->n:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LEM2;->X()V

    return-void
.end method

.method public N(I)V
    .locals 1

    iget v0, p0, LEM2;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, LEM2;->h:I

    invoke-virtual {p0}, LEM2;->X()V

    return-void
.end method

.method public O(IIII)V
    .locals 1

    iget-object v0, p0, LEM2;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, LEM2;->S()V

    return-void
.end method

.method public final P()Z
    .locals 1

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LEM2;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LEM2;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public R()V
    .locals 2

    iget-object v0, p0, LEM2;->i:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1}, Landroid/view/View;->isClickable()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LEM2;->n()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LEM2;->d:LPM2;

    :goto_0
    iput-object v1, p0, LEM2;->i:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v1}, LEM2;->U(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public S()V
    .locals 6

    invoke-virtual {p0}, LEM2;->P()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LEM2;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, LEM2;->c()F

    move-result v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p0}, LEM2;->o()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v2, p0, LEM2;->b:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v3, v0

    iget v4, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v4, v0

    iget v5, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v0

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/google/android/material/card/MaterialCardView;->x(IIII)V

    return-void
.end method

.method public T()V
    .locals 2

    iget-object v0, p0, LEM2;->c:LPM2;

    iget-object v1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->i()F

    move-result v1

    invoke-virtual {v0, v1}, LPM2;->Z(F)V

    return-void
.end method

.method public final U(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/InsetDrawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/DrawableWrapper;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0, p1}, LEM2;->p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public V()V
    .locals 2

    invoke-virtual {p0}, LEM2;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v1, p0, LEM2;->c:LPM2;

    invoke-virtual {p0, v1}, LEM2;->p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->y(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v1, p0, LEM2;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, LEM2;->p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final W()V
    .locals 2

    sget-boolean v0, Lzb5;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LEM2;->q:LPM2;

    if-eqz v0, :cond_1

    iget-object v1, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public X()V
    .locals 3

    iget-object v0, p0, LEM2;->d:LPM2;

    iget v1, p0, LEM2;->h:I

    int-to-float v1, v1

    iget-object v2, p0, LEM2;->n:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1, v2}, LPM2;->j0(FLandroid/content/res/ColorStateList;)V

    return-void
.end method

.method public b(Z)V
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget v2, p0, LEM2;->y:F

    sub-float/2addr v0, v2

    goto :goto_1

    :cond_1
    iget v0, p0, LEM2;->y:F

    :goto_1
    iget-object v2, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v2, 0x0

    iput-object v2, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    :cond_2
    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    iget v4, p0, LEM2;->y:F

    aput v4, v2, v3

    const/4 v3, 0x1

    aput v1, v2, v3

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    new-instance v2, LDM2;

    invoke-direct {v2, p0}, LDM2;-><init>(LEM2;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v1, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    iget-object v2, p0, LEM2;->v:Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_3

    iget p1, p0, LEM2;->w:I

    goto :goto_2

    :cond_3
    iget p1, p0, LEM2;->x:I

    :goto_2
    int-to-float p1, p1

    mul-float/2addr p1, v0

    float-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, LEM2;->u:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final c()F
    .locals 4

    iget-object v0, p0, LEM2;->m:Liy5;

    invoke-virtual {v0}, Liy5;->q()LQC0;

    move-result-object v0

    iget-object v1, p0, LEM2;->c:LPM2;

    invoke-virtual {v1}, LPM2;->I()F

    move-result v1

    invoke-virtual {p0, v0, v1}, LEM2;->d(LQC0;F)F

    move-result v0

    iget-object v1, p0, LEM2;->m:Liy5;

    invoke-virtual {v1}, Liy5;->s()LQC0;

    move-result-object v1

    iget-object v2, p0, LEM2;->c:LPM2;

    invoke-virtual {v2}, LPM2;->J()F

    move-result v2

    invoke-virtual {p0, v1, v2}, LEM2;->d(LQC0;F)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v1, p0, LEM2;->m:Liy5;

    invoke-virtual {v1}, Liy5;->k()LQC0;

    move-result-object v1

    iget-object v2, p0, LEM2;->c:LPM2;

    invoke-virtual {v2}, LPM2;->t()F

    move-result v2

    invoke-virtual {p0, v1, v2}, LEM2;->d(LQC0;F)F

    move-result v1

    iget-object v2, p0, LEM2;->m:Liy5;

    invoke-virtual {v2}, Liy5;->i()LQC0;

    move-result-object v2

    iget-object v3, p0, LEM2;->c:LPM2;

    invoke-virtual {v3}, LPM2;->s()F

    move-result v3

    invoke-virtual {p0, v2, v3}, LEM2;->d(LQC0;F)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public final d(LQC0;F)F
    .locals 4

    instance-of v0, p1, Ldc5;

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sget-wide v2, LEM2;->z:D

    sub-double/2addr v0, v2

    float-to-double p1, p2

    mul-double/2addr v0, p1

    double-to-float p1, v0

    return p1

    :cond_0
    instance-of p1, p1, LEF0;

    if-eqz p1, :cond_1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p2, p1

    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final e()F
    .locals 2

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->n()F

    move-result v0

    invoke-virtual {p0}, LEM2;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LEM2;->c()F

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method public final f()F
    .locals 2

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->n()F

    move-result v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, LEM2;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LEM2;->c()F

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {v0}, LPM2;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()Landroid/graphics/drawable/Drawable;
    .locals 4

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    invoke-virtual {p0}, LEM2;->j()LPM2;

    move-result-object v1

    iput-object v1, p0, LEM2;->q:LPM2;

    iget-object v2, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const v3, 0x10100a7

    aput v3, v1, v2

    iget-object v2, p0, LEM2;->q:LPM2;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public final i()Landroid/graphics/drawable/Drawable;
    .locals 4

    sget-boolean v0, Lzb5;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LEM2;->j()LPM2;

    move-result-object v0

    iput-object v0, p0, LEM2;->r:LPM2;

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    const/4 v2, 0x0

    iget-object v3, p0, LEM2;->r:LPM2;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, LEM2;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final j()LPM2;
    .locals 2

    new-instance v0, LPM2;

    iget-object v1, p0, LEM2;->m:Liy5;

    invoke-direct {v0, v1}, LPM2;-><init>(Liy5;)V

    return-object v0
.end method

.method public k()V
    .locals 7

    iget-object v0, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/lit8 v6, v1, -0x1

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v2, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public l()LPM2;
    .locals 1

    iget-object v0, p0, LEM2;->c:LPM2;

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, LEM2;->g:I

    return v0
.end method

.method public final n()Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LEM2;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    iget-object v3, p0, LEM2;->o:Landroid/graphics/drawable/Drawable;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, LEM2;->d:LPM2;

    aput-object v3, v1, v2

    iget-object v2, p0, LEM2;->j:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    sget v1, LJi4;->mtrl_card_checked_layer_id:I

    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    :cond_1
    iget-object v0, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    return-object v0
.end method

.method public final o()F
    .locals 4

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sget-wide v2, LEM2;->z:D

    sub-double/2addr v0, v2

    iget-object v2, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v2}, Lcom/google/android/material/card/MaterialCardView;->u()F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LEM2;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p0}, LEM2;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    move v7, v0

    move v6, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v6, v0

    move v7, v6

    :goto_0
    new-instance v0, LEM2$a;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, v6

    move v5, v7

    invoke-direct/range {v1 .. v7}, LEM2$a;-><init>(LEM2;Landroid/graphics/drawable/Drawable;IIII)V

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, LEM2;->s:Z

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, LEM2;->t:Z

    return v0
.end method

.method public final s()Z
    .locals 2

    iget v0, p0, LEM2;->g:I

    const/16 v1, 0x50

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t()Z
    .locals 2

    iget v0, p0, LEM2;->g:I

    const v1, 0x800005

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v(Landroid/content/res/TypedArray;)V
    .locals 3

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LXl4;->MaterialCardView_strokeColor:I

    invoke-static {v0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LEM2;->n:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LEM2;->n:Landroid/content/res/ColorStateList;

    :cond_0
    sget v0, LXl4;->MaterialCardView_strokeWidth:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, LEM2;->h:I

    sget v0, LXl4;->MaterialCardView_android_checkable:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, LEM2;->t:Z

    iget-object v2, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLongClickable(Z)V

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, LXl4;->MaterialCardView_checkedIconTint:I

    invoke-static {v0, p1, v2}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LEM2;->l:Landroid/content/res/ColorStateList;

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, LXl4;->MaterialCardView_checkedIcon:I

    invoke-static {v0, p1, v2}, LNM2;->e(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, LEM2;->D(Landroid/graphics/drawable/Drawable;)V

    sget v0, LXl4;->MaterialCardView_checkedIconSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    invoke-virtual {p0, v0}, LEM2;->G(I)V

    sget v0, LXl4;->MaterialCardView_checkedIconMargin:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    invoke-virtual {p0, v0}, LEM2;->F(I)V

    sget v0, LXl4;->MaterialCardView_checkedIconGravity:I

    const v1, 0x800035

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, LEM2;->g:I

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LXl4;->MaterialCardView_rippleColor:I

    invoke-static {v0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_1

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    sget v1, Luf4;->colorControlHighlight:I

    invoke-static {v0, v1}, LHM2;->d(Landroid/view/View;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LEM2;->k:Landroid/content/res/ColorStateList;

    :cond_1
    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LXl4;->MaterialCardView_cardForegroundColor:I

    invoke-static {v0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, LEM2;->z(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, LEM2;->W()V

    invoke-virtual {p0}, LEM2;->T()V

    invoke-virtual {p0}, LEM2;->X()V

    iget-object p1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {p0, v0}, LEM2;->p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/card/MaterialCardView;->y(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LEM2;->n()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, LEM2;->d:LPM2;

    :goto_0
    iput-object p1, p0, LEM2;->i:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0, p1}, LEM2;->p(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public w(II)V
    .locals 10

    iget-object v0, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_6

    iget-object v0, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LEM2;->f()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    invoke-virtual {p0}, LEM2;->e()F

    move-result v2

    mul-float/2addr v2, v1

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, LEM2;->t()Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, p0, LEM2;->e:I

    sub-int v2, p1, v2

    iget v3, p0, LEM2;->f:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    goto :goto_1

    :cond_1
    iget v2, p0, LEM2;->e:I

    :goto_1
    invoke-virtual {p0}, LEM2;->s()Z

    move-result v3

    if-eqz v3, :cond_2

    iget v3, p0, LEM2;->e:I

    goto :goto_2

    :cond_2
    iget v3, p0, LEM2;->e:I

    sub-int v3, p2, v3

    iget v4, p0, LEM2;->f:I

    sub-int/2addr v3, v4

    sub-int/2addr v3, v0

    :goto_2
    move v9, v3

    invoke-virtual {p0}, LEM2;->t()Z

    move-result v3

    if-eqz v3, :cond_3

    iget p1, p0, LEM2;->e:I

    goto :goto_3

    :cond_3
    iget v3, p0, LEM2;->e:I

    sub-int/2addr p1, v3

    iget v3, p0, LEM2;->f:I

    sub-int/2addr p1, v3

    sub-int/2addr p1, v1

    :goto_3
    invoke-virtual {p0}, LEM2;->s()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, LEM2;->e:I

    sub-int/2addr p2, v1

    iget v1, p0, LEM2;->f:I

    sub-int/2addr p2, v1

    sub-int/2addr p2, v0

    goto :goto_4

    :cond_4
    iget p2, p0, LEM2;->e:I

    :goto_4
    move v7, p2

    iget-object p2, p0, LEM2;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-static {p2}, Lbq6;->D(Landroid/view/View;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    move v6, p1

    move v8, v2

    goto :goto_5

    :cond_5
    move v8, p1

    move v6, v2

    :goto_5
    iget-object v4, p0, LEM2;->p:Landroid/graphics/drawable/LayerDrawable;

    const/4 v5, 0x2

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    :cond_6
    return-void
.end method

.method public x(Z)V
    .locals 0

    iput-boolean p1, p0, LEM2;->s:Z

    return-void
.end method

.method public y(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LEM2;->c:LPM2;

    invoke-virtual {v0, p1}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public z(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LEM2;->d:LPM2;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    return-void
.end method
