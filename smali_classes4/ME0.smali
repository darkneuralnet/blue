.class public final LME0;
.super Landroid/view/animation/Animation;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final b:Landroid/widget/ImageView;

.field public final c:Lco/bird/android/widget/cropper/CropOverlayView;

.field public final d:[F

.field public final e:[F

.field public final f:Landroid/graphics/RectF;

.field public final g:Landroid/graphics/RectF;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/RectF;

.field public final k:[F

.field public final l:[F


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lco/bird/android/widget/cropper/CropOverlayView;)V
    .locals 3

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [F

    iput-object v1, p0, LME0;->d:[F

    new-array v1, v0, [F

    iput-object v1, p0, LME0;->e:[F

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LME0;->f:Landroid/graphics/RectF;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LME0;->g:Landroid/graphics/RectF;

    const/16 v1, 0x9

    new-array v2, v1, [F

    iput-object v2, p0, LME0;->h:[F

    new-array v2, v1, [F

    iput-object v2, p0, LME0;->i:[F

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LME0;->j:Landroid/graphics/RectF;

    new-array v0, v0, [F

    iput-object v0, p0, LME0;->k:[F

    new-array v0, v1, [F

    iput-object v0, p0, LME0;->l:[F

    iput-object p1, p0, LME0;->b:Landroid/widget/ImageView;

    iput-object p2, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    const-wide/16 p1, 0x12c

    invoke-virtual {p0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p0, p1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {p0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    iget-object p2, p0, LME0;->j:Landroid/graphics/RectF;

    iget-object v0, p0, LME0;->f:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, LME0;->g:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v3, v1

    mul-float/2addr v3, p1

    add-float/2addr v1, v3

    iput v1, p2, Landroid/graphics/RectF;->left:F

    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v3, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v1

    mul-float/2addr v3, p1

    add-float/2addr v1, v3

    iput v1, p2, Landroid/graphics/RectF;->top:F

    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v3, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v1

    mul-float/2addr v3, p1

    add-float/2addr v1, v3

    iput v1, p2, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0, p2}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    iget-object v1, p0, LME0;->k:[F

    array-length v2, v1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, LME0;->d:[F

    aget v2, v2, v0

    iget-object v3, p0, LME0;->e:[F

    aget v3, v3, v0

    sub-float/2addr v3, v2

    mul-float/2addr v3, p1

    add-float/2addr v2, v3

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    iget-object v2, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lco/bird/android/widget/cropper/CropOverlayView;->setBounds([FII)V

    :goto_1
    iget-object v0, p0, LME0;->l:[F

    array-length v1, v0

    if-ge p2, v1, :cond_1

    iget-object v1, p0, LME0;->h:[F

    aget v1, v1, p2

    iget-object v2, p0, LME0;->i:[F

    aget v2, v2, p2

    sub-float/2addr v2, v1

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    aput v1, v0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    iget-object p2, p0, LME0;->l:[F

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object p2, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    iget-object p1, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iget-object p1, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public d([FLandroid/graphics/Matrix;)V
    .locals 3

    iget-object v0, p0, LME0;->e:[F

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LME0;->g:Landroid/graphics/RectF;

    iget-object v0, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object p1, p0, LME0;->i:[F

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    return-void
.end method

.method public e([FLandroid/graphics/Matrix;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/animation/Animation;->reset()V

    iget-object v0, p0, LME0;->d:[F

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LME0;->f:Landroid/graphics/RectF;

    iget-object v0, p0, LME0;->c:Lco/bird/android/widget/cropper/CropOverlayView;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object p1, p0, LME0;->h:[F

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    iget-object p1, p0, LME0;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
