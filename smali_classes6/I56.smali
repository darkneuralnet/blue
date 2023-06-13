.class public LI56;
.super LPM2;
.source "SourceFile"

# interfaces
.implements Lb16$b;


# static fields
.field public static final W:I

.field public static final X:I


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public final B:Landroid/content/Context;

.field public final C:Landroid/graphics/Paint$FontMetrics;

.field public final D:Lb16;

.field public final E:Landroid/view/View$OnLayoutChangeListener;

.field public final F:Landroid/graphics/Rect;

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public P:I

.field public Q:F

.field public R:F

.field public final S:F

.field public T:F

.field public U:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Lul4;->Widget_MaterialComponents_Tooltip:I

    sput v0, LI56;->W:I

    sget v0, Luf4;->tooltipStyle:I

    sput v0, LI56;->X:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LPM2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p2, Landroid/graphics/Paint$FontMetrics;

    invoke-direct {p2}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    iput-object p2, p0, LI56;->C:Landroid/graphics/Paint$FontMetrics;

    new-instance p2, Lb16;

    invoke-direct {p2, p0}, Lb16;-><init>(Lb16$b;)V

    iput-object p2, p0, LI56;->D:Lb16;

    new-instance p3, LI56$a;

    invoke-direct {p3, p0}, LI56$a;-><init>(LI56;)V

    iput-object p3, p0, LI56;->E:Landroid/view/View$OnLayoutChangeListener;

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, LI56;->F:Landroid/graphics/Rect;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, LI56;->Q:F

    iput p3, p0, LI56;->R:F

    const/high16 p4, 0x3f000000    # 0.5f

    iput p4, p0, LI56;->S:F

    iput p4, p0, LI56;->T:F

    iput p3, p0, LI56;->U:F

    iput-object p1, p0, LI56;->B:Landroid/content/Context;

    invoke-virtual {p2}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object p3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p3, Landroid/text/TextPaint;->density:F

    invoke-virtual {p2}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object p1

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method

.method public static synthetic p0(LI56;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, LI56;->D0(Landroid/view/View;)V

    return-void
.end method

.method public static t0(Landroid/content/Context;Landroid/util/AttributeSet;II)LI56;
    .locals 1

    new-instance v0, LI56;

    invoke-direct {v0, p0, p1, p2, p3}, LI56;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {v0, p1, p2, p3}, LI56;->y0(Landroid/util/AttributeSet;II)V

    return-object v0
.end method


# virtual methods
.method public A0(F)V
    .locals 3

    const v0, 0x3f99999a    # 1.2f

    iput v0, p0, LI56;->T:F

    iput p1, p0, LI56;->Q:F

    iput p1, p0, LI56;->R:F

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, 0x3e428f5c    # 0.19f

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v0, p1}, Lpf;->b(FFFFF)F

    move-result p1

    iput p1, p0, LI56;->U:F

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    return-void
.end method

.method public B0(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LI56;->A:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, LI56;->A:Ljava/lang/CharSequence;

    iget-object p1, p0, LI56;->D:Lb16;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb16;->i(Z)V

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public C0(LN06;)V
    .locals 2

    iget-object v0, p0, LI56;->D:Lb16;

    iget-object v1, p0, LI56;->B:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lb16;->h(LN06;Landroid/content/Context;)V

    return-void
.end method

.method public final D0(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, LI56;->P:I

    iget-object v0, p0, LI56;->F:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    return-void
.end method

.method public a()V
    .locals 0

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, LI56;->q0()F

    move-result v0

    iget v1, p0, LI56;->K:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    iget v3, p0, LI56;->K:I

    int-to-double v3, v3

    sub-double/2addr v1, v3

    neg-double v1, v1

    double-to-float v1, v1

    iget v2, p0, LI56;->Q:F

    iget v3, p0, LI56;->R:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    iget v7, p0, LI56;->T:F

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->scale(FFFF)V

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, LPM2;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, LI56;->w0(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 2

    iget-object v0, p0, LI56;->D:Lb16;

    invoke-virtual {v0}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    iget v1, p0, LI56;->I:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 2

    iget v0, p0, LI56;->G:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, LI56;->x0()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, LI56;->H:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    invoke-super {p0, p1}, LPM2;->onBoundsChange(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, LPM2;->E()Liy5;

    move-result-object p1

    invoke-virtual {p1}, Liy5;->v()Liy5$b;

    move-result-object p1

    invoke-virtual {p0}, LI56;->u0()LL91;

    move-result-object v0

    invoke-virtual {p1, v0}, Liy5$b;->s(LL91;)Liy5$b;

    move-result-object p1

    invoke-virtual {p1}, Liy5$b;->m()Liy5;

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 0

    invoke-super {p0, p1}, LPM2;->onStateChange([I)Z

    move-result p1

    return p1
.end method

.method public final q0()F
    .locals 2

    iget-object v0, p0, LI56;->F:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->P:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->J:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, LI56;->F:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->P:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->J:I

    sub-int/2addr v0, v1

    :goto_0
    int-to-float v0, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LI56;->F:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->P:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->J:I

    add-int/2addr v0, v1

    if-lez v0, :cond_1

    iget-object v0, p0, LI56;->F:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->P:I

    sub-int/2addr v0, v1

    iget v1, p0, LI56;->J:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final r0()F
    .locals 2

    iget-object v0, p0, LI56;->D:Lb16;

    invoke-virtual {v0}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p0, LI56;->C:Landroid/graphics/Paint$FontMetrics;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    iget-object v0, p0, LI56;->C:Landroid/graphics/Paint$FontMetrics;

    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v1, v0

    return v1
.end method

.method public final s0(Landroid/graphics/Rect;)F
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, LI56;->r0()F

    move-result v0

    sub-float/2addr p1, v0

    return p1
.end method

.method public final u0()LL91;
    .locals 7

    invoke-virtual {p0}, LI56;->q0()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-double v1, v1

    iget v3, p0, LI56;->K:I

    int-to-double v3, v3

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    sub-double/2addr v1, v3

    double-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    neg-float v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    new-instance v1, LEe3;

    new-instance v2, LiM2;

    iget v3, p0, LI56;->K:I

    int-to-float v3, v3

    invoke-direct {v2, v3}, LiM2;-><init>(F)V

    invoke-direct {v1, v2, v0}, LEe3;-><init>(LL91;F)V

    return-object v1
.end method

.method public v0(Landroid/view/View;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LI56;->E:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final w0(Landroid/graphics/Canvas;)V
    .locals 11

    iget-object v0, p0, LI56;->A:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, LI56;->s0(Landroid/graphics/Rect;)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, LI56;->D:Lb16;

    invoke-virtual {v2}, Lb16;->d()LN06;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LI56;->D:Lb16;

    invoke-virtual {v2}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    iput-object v3, v2, Landroid/text/TextPaint;->drawableState:[I

    iget-object v2, p0, LI56;->D:Lb16;

    iget-object v3, p0, LI56;->B:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lb16;->j(Landroid/content/Context;)V

    iget-object v2, p0, LI56;->D:Lb16;

    invoke-virtual {v2}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object v2

    iget v3, p0, LI56;->U:F

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_1
    iget-object v5, p0, LI56;->A:Ljava/lang/CharSequence;

    const/4 v6, 0x0

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v8, v0

    int-to-float v9, v1

    iget-object v0, p0, LI56;->D:Lb16;

    invoke-virtual {v0}, Lb16;->e()Landroid/text/TextPaint;

    move-result-object v10

    move-object v4, p1

    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final x0()F
    .locals 2

    iget-object v0, p0, LI56;->A:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v1, p0, LI56;->D:Lb16;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lb16;->f(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public final y0(Landroid/util/AttributeSet;II)V
    .locals 7

    iget-object v0, p0, LI56;->B:Landroid/content/Context;

    sget-object v2, LXl4;->Tooltip:[I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-static/range {v0 .. v5}, Lo36;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p1

    iget-object p2, p0, LI56;->B:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, LPf4;->mtrl_tooltip_arrowSize:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, LI56;->K:I

    invoke-virtual {p0}, LPM2;->E()Liy5;

    move-result-object p2

    invoke-virtual {p2}, Liy5;->v()Liy5$b;

    move-result-object p2

    invoke-virtual {p0}, LI56;->u0()LL91;

    move-result-object p3

    invoke-virtual {p2, p3}, Liy5$b;->s(LL91;)Liy5$b;

    move-result-object p2

    invoke-virtual {p2}, Liy5$b;->m()Liy5;

    move-result-object p2

    invoke-virtual {p0, p2}, LPM2;->setShapeAppearanceModel(Liy5;)V

    sget p2, LXl4;->Tooltip_android_text:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, LI56;->B0(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LI56;->B:Landroid/content/Context;

    sget p3, LXl4;->Tooltip_android_textAppearance:I

    invoke-static {p2, p1, p3}, LNM2;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)LN06;

    move-result-object p2

    if-eqz p2, :cond_0

    sget p3, LXl4;->Tooltip_android_textColor:I

    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI56;->B:Landroid/content/Context;

    invoke-static {v0, p1, p3}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p2, p3}, LN06;->k(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-virtual {p0, p2}, LI56;->C0(LN06;)V

    iget-object p2, p0, LI56;->B:Landroid/content/Context;

    sget p3, Luf4;->colorOnBackground:I

    const-class v0, LI56;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, p3, v1}, LHM2;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result p2

    iget-object p3, p0, LI56;->B:Landroid/content/Context;

    const v1, 0x1010031

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v1, v2}, LHM2;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result p3

    const/16 v1, 0xe5

    invoke-static {p3, v1}, LJm0;->p(II)I

    move-result p3

    const/16 v1, 0x99

    invoke-static {p2, v1}, LJm0;->p(II)I

    move-result p2

    invoke-static {p3, p2}, LHM2;->h(II)I

    move-result p2

    sget p3, LXl4;->Tooltip_backgroundTint:I

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p0, p2}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    iget-object p2, p0, LI56;->B:Landroid/content/Context;

    sget p3, Luf4;->colorSurface:I

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, LHM2;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p0, p2}, LPM2;->k0(Landroid/content/res/ColorStateList;)V

    sget p2, LXl4;->Tooltip_android_padding:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, LI56;->G:I

    sget p2, LXl4;->Tooltip_android_minWidth:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, LI56;->H:I

    sget p2, LXl4;->Tooltip_android_minHeight:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, LI56;->I:I

    sget p2, LXl4;->Tooltip_android_layout_margin:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, LI56;->J:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public z0(Landroid/view/View;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LI56;->D0(Landroid/view/View;)V

    iget-object v0, p0, LI56;->E:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method
