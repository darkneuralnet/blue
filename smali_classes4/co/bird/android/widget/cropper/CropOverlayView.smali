.class public Lco/bird/android/widget/cropper/CropOverlayView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/cropper/CropOverlayView$a;,
        Lco/bird/android/widget/cropper/CropOverlayView$b;
    }
.end annotation


# instance fields
.field public A:Lco/bird/android/widget/cropper/CropImageView$d;

.field public B:Lco/bird/android/widget/cropper/CropImageView$c;

.field public C:Z

.field public final b:Lco/bird/android/widget/cropper/d;

.field public final c:Landroid/graphics/RectF;

.field public final d:[F

.field public final e:Landroid/graphics/RectF;

.field public final f:Landroid/graphics/Rect;

.field public g:Landroid/view/ScaleGestureDetector;

.field public h:Z

.field public i:Lco/bird/android/widget/cropper/CropOverlayView$a;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Paint;

.field public final n:Landroid/graphics/Path;

.field public o:I

.field public p:I

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:Lco/bird/android/widget/cropper/e;

.field public w:Z

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/widget/cropper/CropOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lco/bird/android/widget/cropper/d;

    invoke-direct {p1}, Lco/bird/android/widget/cropper/d;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->c:Landroid/graphics/RectF;

    const/16 p1, 0x8

    new-array p1, p1, [F

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    int-to-float p1, p1

    iget p2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    return-void
.end method

.method public static bridge synthetic a(Lco/bird/android/widget/cropper/CropOverlayView;)Lco/bird/android/widget/cropper/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    return-object p0
.end method

.method public static o(I)Landroid/graphics/Paint;
    .locals 1

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method public static p(FI)Landroid/graphics/Paint;
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object p0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/graphics/RectF;)Z
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->u([F)F

    move-result v2

    iget-object v3, v0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v3}, Lco/bird/android/widget/cropper/c;->w([F)F

    move-result v3

    iget-object v4, v0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v4}, Lco/bird/android/widget/cropper/c;->v([F)F

    move-result v4

    iget-object v5, v0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v5}, Lco/bird/android/widget/cropper/c;->p([F)F

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/cropper/CropOverlayView;->s()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    return v7

    :cond_0
    iget-object v6, v0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    aget v7, v6, v7

    const/4 v8, 0x1

    aget v9, v6, v8

    const/4 v10, 0x4

    aget v10, v6, v10

    const/4 v11, 0x5

    aget v11, v6, v11

    const/4 v12, 0x6

    aget v12, v6, v12

    const/4 v13, 0x7

    aget v13, v6, v13

    cmpg-float v14, v13, v9

    const/4 v15, 0x3

    const/16 v16, 0x2

    if-gez v14, :cond_2

    aget v14, v6, v15

    cmpg-float v15, v9, v14

    if-gez v15, :cond_1

    aget v7, v6, v16

    move v9, v11

    move v6, v12

    move v11, v14

    move v14, v13

    move/from16 v19, v10

    move v10, v7

    move/from16 v7, v19

    goto :goto_0

    :cond_1
    aget v6, v6, v16

    move/from16 v19, v7

    move v7, v6

    move v6, v10

    move/from16 v10, v19

    move/from16 v20, v11

    move v11, v9

    move v9, v14

    move/from16 v14, v20

    goto :goto_0

    :cond_2
    aget v14, v6, v15

    cmpl-float v15, v9, v14

    if-lez v15, :cond_3

    aget v6, v6, v16

    move v10, v12

    move v11, v13

    goto :goto_0

    :cond_3
    move v6, v7

    move v14, v9

    move v7, v12

    move v9, v13

    :goto_0
    sub-float/2addr v9, v14

    sub-float/2addr v7, v6

    div-float/2addr v9, v7

    const/high16 v7, -0x40800000    # -1.0f

    div-float/2addr v7, v9

    mul-float v12, v9, v6

    sub-float v12, v14, v12

    mul-float/2addr v6, v7

    sub-float/2addr v14, v6

    mul-float v6, v9, v10

    sub-float v6, v11, v6

    mul-float/2addr v10, v7

    sub-float/2addr v11, v10

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    iget v13, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v10, v13

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    iget v15, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v13, v15

    div-float/2addr v10, v13

    neg-float v13, v10

    iget v8, v1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v15, v10

    sub-float v15, v8, v15

    iget v0, v1, Landroid/graphics/RectF;->right:F

    mul-float v17, v13, v0

    sub-float v8, v8, v17

    sub-float v17, v15, v12

    sub-float v18, v9, v10

    div-float v17, v17, v18

    cmpg-float v0, v17, v0

    if-gez v0, :cond_4

    move/from16 v0, v17

    goto :goto_1

    :cond_4
    move v0, v2

    :goto_1
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    sub-float v2, v15, v14

    sub-float v10, v7, v10

    div-float/2addr v2, v10

    iget v10, v1, Landroid/graphics/RectF;->right:F

    cmpg-float v10, v2, v10

    if-gez v10, :cond_5

    goto :goto_2

    :cond_5
    move v2, v0

    :goto_2
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    sub-float v2, v8, v11

    sub-float v10, v7, v13

    div-float/2addr v2, v10

    move/from16 v17, v5

    iget v5, v1, Landroid/graphics/RectF;->right:F

    cmpg-float v5, v2, v5

    if-gez v5, :cond_6

    goto :goto_3

    :cond_6
    move v2, v0

    :goto_3
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    sub-float v2, v8, v14

    div-float/2addr v2, v10

    iget v5, v1, Landroid/graphics/RectF;->left:F

    cmpl-float v5, v2, v5

    if-lez v5, :cond_7

    goto :goto_4

    :cond_7
    move v2, v4

    :goto_4
    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    sub-float/2addr v8, v6

    sub-float v4, v9, v13

    div-float/2addr v8, v4

    iget v4, v1, Landroid/graphics/RectF;->left:F

    cmpl-float v4, v8, v4

    if-lez v4, :cond_8

    goto :goto_5

    :cond_8
    move v8, v2

    :goto_5
    invoke-static {v2, v8}, Ljava/lang/Math;->min(FF)F

    move-result v2

    sub-float/2addr v15, v6

    div-float v15, v15, v18

    iget v1, v1, Landroid/graphics/RectF;->left:F

    cmpl-float v1, v15, v1

    if-lez v1, :cond_9

    goto :goto_6

    :cond_9
    move v15, v2

    :goto_6
    invoke-static {v2, v15}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float v2, v9, v0

    add-float/2addr v2, v12

    mul-float v4, v7, v1

    add-float/2addr v4, v14

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    mul-float/2addr v7, v0

    add-float/2addr v7, v11

    mul-float/2addr v9, v1

    add-float/2addr v9, v6

    invoke-static {v7, v9}, Ljava/lang/Math;->min(FF)F

    move-result v3

    move/from16 v4, v17

    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    move-object/from16 v4, p0

    iget-object v5, v4, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iput v0, v5, Landroid/graphics/RectF;->left:F

    iput v2, v5, Landroid/graphics/RectF;->top:F

    iput v1, v5, Landroid/graphics/RectF;->right:F

    iput v3, v5, Landroid/graphics/RectF;->bottom:F

    const/4 v0, 0x1

    return v0
.end method

.method public final c(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->i:Lco/bird/android/widget/cropper/CropOverlayView$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView$a;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "AIC"

    const-string v1, "Exception in crop window changed"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v1}, Lco/bird/android/widget/cropper/c;->u([F)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v3}, Lco/bird/android/widget/cropper/c;->w([F)F

    move-result v3

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v5

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->v([F)F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v9

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->p([F)F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    sget-object v4, Lco/bird/android/widget/cropper/CropImageView$c;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    if-ne v3, v4, :cond_1

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->s()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    const/4 v6, 0x0

    aget v6, v4, v6

    const/4 v7, 0x1

    aget v4, v4, v7

    invoke-virtual {v3, v6, v4}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    const/4 v6, 0x2

    aget v6, v4, v6

    const/4 v7, 0x3

    aget v4, v4, v7

    invoke-virtual {v3, v6, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    const/4 v6, 0x4

    aget v6, v4, v6

    const/4 v7, 0x5

    aget v4, v4, v7

    invoke-virtual {v3, v6, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    const/4 v6, 0x6

    aget v6, v4, v6

    const/4 v7, 0x7

    aget v4, v4, v7

    invoke-virtual {v3, v6, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    sget-object v4, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    sget-object v3, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    iget-object v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, v1

    move v6, v9

    move v7, v2

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0

    :cond_0
    iget v7, v0, Landroid/graphics/RectF;->top:F

    iget-object v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, v1

    move v6, v9

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    move v7, v2

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v5, v0, Landroid/graphics/RectF;->top:F

    iget v6, v0, Landroid/graphics/RectF;->left:F

    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v7, v0, Landroid/graphics/RectF;->right:F

    iget v8, v0, Landroid/graphics/RectF;->top:F

    iget v10, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->c:Landroid/graphics/RectF;

    iget v4, v0, Landroid/graphics/RectF;->left:F

    iget v6, v0, Landroid/graphics/RectF;->top:F

    iget v7, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v3, v4, v6, v7, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->c:Landroid/graphics/RectF;

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->n:Landroid/graphics/Path;

    sget-object v3, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    iget-object v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, v1

    move v6, v9

    move v7, v2

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :goto_0
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    sget-object v2, Lco/bird/android/widget/cropper/CropImageView$c;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v4, v2, v3

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    sget-object v6, Lco/bird/android/widget/cropper/CropImageView$c;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    if-ne v5, v6, :cond_1

    iget v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->q:F

    :cond_1
    add-float/2addr v1, v4

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v5}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v5

    invoke-virtual {v5, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    sub-float/2addr v2, v0

    div-float/2addr v2, v3

    add-float/2addr v4, v2

    iget v0, v5, Landroid/graphics/RectF;->left:F

    sub-float v7, v0, v2

    iget v1, v5, Landroid/graphics/RectF;->top:F

    sub-float v8, v1, v4

    sub-float v9, v0, v2

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    add-float v10, v1, v0

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->left:F

    sub-float v7, v0, v4

    iget v1, v5, Landroid/graphics/RectF;->top:F

    sub-float v8, v1, v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    add-float v9, v0, v3

    sub-float v10, v1, v2

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->right:F

    add-float v7, v0, v2

    iget v1, v5, Landroid/graphics/RectF;->top:F

    sub-float v8, v1, v4

    add-float v9, v0, v2

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    add-float v10, v1, v0

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->right:F

    add-float v7, v0, v4

    iget v1, v5, Landroid/graphics/RectF;->top:F

    sub-float v8, v1, v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    sub-float v9, v0, v3

    sub-float v10, v1, v2

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->left:F

    sub-float v7, v0, v2

    iget v1, v5, Landroid/graphics/RectF;->bottom:F

    add-float v8, v1, v4

    sub-float v9, v0, v2

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    sub-float v10, v1, v0

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->left:F

    sub-float v7, v0, v4

    iget v1, v5, Landroid/graphics/RectF;->bottom:F

    add-float v8, v1, v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    add-float v9, v0, v3

    add-float v10, v1, v2

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->right:F

    add-float v7, v0, v2

    iget v1, v5, Landroid/graphics/RectF;->bottom:F

    add-float v8, v1, v4

    add-float v9, v0, v2

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    sub-float v10, v1, v0

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, v5, Landroid/graphics/RectF;->right:F

    add-float v7, v0, v4

    iget v1, v5, Landroid/graphics/RectF;->bottom:F

    add-float v8, v1, v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    sub-float v9, v0, v3

    add-float v10, v1, v2

    iget-object v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    const/high16 v4, 0x40400000    # 3.0f

    div-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v5

    div-float/2addr v5, v4

    iget-object v4, v0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    sget-object v6, Lco/bird/android/widget/cropper/CropImageView$c;->c:Lco/bird/android/widget/cropper/CropImageView$c;

    if-ne v4, v6, :cond_1

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    sub-float/2addr v4, v1

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v7

    div-float/2addr v7, v6

    sub-float/2addr v7, v1

    iget v1, v2, Landroid/graphics/RectF;->left:F

    add-float v11, v1, v3

    iget v1, v2, Landroid/graphics/RectF;->right:F

    sub-float v15, v1, v3

    float-to-double v8, v7

    sub-float v1, v4, v3

    div-float/2addr v1, v4

    float-to-double v12, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->acos(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v8, v12

    double-to-float v1, v8

    iget v3, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v7

    sub-float v10, v3, v1

    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v7

    add-float v12, v3, v1

    iget-object v13, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v8, p1

    move v9, v11

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v3, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v7

    sub-float v14, v3, v1

    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v7

    add-float v16, v3, v1

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v12, p1

    move v13, v15

    move-object/from16 v17, v1

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v2, Landroid/graphics/RectF;->top:F

    add-float v12, v1, v5

    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    sub-float v17, v1, v5

    float-to-double v8, v4

    sub-float v1, v7, v5

    div-float/2addr v1, v7

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->asin(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    mul-double/2addr v8, v5

    double-to-float v1, v8

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v3, v4

    sub-float v9, v3, v1

    iget v3, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v4

    add-float v11, v3, v1

    iget-object v13, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v8, p1

    move v10, v12

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v3, v4

    sub-float v14, v3, v1

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v4

    add-float v16, v2, v1

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v13, p1

    move/from16 v15, v17

    move-object/from16 v18, v1

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    iget v1, v2, Landroid/graphics/RectF;->left:F

    add-float v9, v1, v3

    iget v1, v2, Landroid/graphics/RectF;->right:F

    sub-float v13, v1, v3

    iget v8, v2, Landroid/graphics/RectF;->top:F

    iget v10, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v11, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v6, p1

    move v7, v9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v12, v2, Landroid/graphics/RectF;->top:F

    iget v14, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v15, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    move v11, v13

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v2, Landroid/graphics/RectF;->top:F

    add-float v10, v1, v5

    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    sub-float v15, v1, v5

    iget v7, v2, Landroid/graphics/RectF;->left:F

    iget v9, v2, Landroid/graphics/RectF;->right:F

    iget-object v11, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move v8, v10

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v12, v2, Landroid/graphics/RectF;->left:F

    iget v14, v2, Landroid/graphics/RectF;->right:F

    iget-object v1, v0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    move-object/from16 v11, p1

    move v13, v15

    move-object/from16 v16, v1

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final h(Landroid/graphics/RectF;)V
    .locals 6

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/d;->e()F

    move-result v1

    cmpg-float v0, v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    if-gez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/d;->e()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->right:F

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->d()F

    move-result v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/d;->d()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->bottom:F

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->c()F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->c()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->right:F

    :cond_2
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->b()F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v2}, Lco/bird/android/widget/cropper/d;->b()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v2, v0

    iput v2, p1, Landroid/graphics/RectF;->bottom:F

    :cond_3
    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->b(Landroid/graphics/RectF;)Z

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_7

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_7

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    iget-object v4, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iget v5, p1, Landroid/graphics/RectF;->left:F

    cmpg-float v5, v5, v0

    if-gez v5, :cond_4

    iput v0, p1, Landroid/graphics/RectF;->left:F

    :cond_4
    iget v0, p1, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_5

    iput v2, p1, Landroid/graphics/RectF;->top:F

    :cond_5
    iget v0, p1, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_6

    iput v3, p1, Landroid/graphics/RectF;->right:F

    :cond_6
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_7

    iput v4, p1, Landroid/graphics/RectF;->bottom:F

    :cond_7
    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    mul-float/2addr v2, v3

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fb999999999999aL    # 0.1

    cmpl-double v0, v2, v4

    if-lez v0, :cond_9

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    mul-float/2addr v2, v3

    cmpl-float v0, v0, v2

    if-lez v0, :cond_8

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    mul-float/2addr v0, v2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v0, v1

    iget v1, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/RectF;->right:F

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    div-float/2addr v0, v2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v0, v1

    iget v1, p1, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/RectF;->top:F

    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    :cond_9
    :goto_0
    return-void
.end method

.method public i()V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->h(Landroid/graphics/RectF;)V

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1, v0}, Lco/bird/android/widget/cropper/d;->t(Landroid/graphics/RectF;)V

    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    return v0
.end method

.method public l()Lco/bird/android/widget/cropper/CropImageView$c;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    return-object v0
.end method

.method public m()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public n()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->d(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0}, Lco/bird/android/widget/cropper/d;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->A:Lco/bird/android/widget/cropper/CropImageView$d;

    sget-object v1, Lco/bird/android/widget/cropper/CropImageView$d;->d:Lco/bird/android/widget/cropper/CropImageView$d;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->g(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/widget/cropper/CropImageView$d;->c:Lco/bird/android/widget/cropper/CropImageView$d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->g(Landroid/graphics/Canvas;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->e(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->f(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->g:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_2

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->u(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->v()V

    return v2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->t(FF)V

    return v2

    :cond_4
    return v1
.end method

.method public final q()V
    .locals 10

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v0}, Lco/bird/android/widget/cropper/c;->u([F)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->w([F)F

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v2}, Lco/bird/android/widget/cropper/c;->v([F)F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v3}, Lco/bird/android/widget/cropper/c;->p([F)F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    cmpg-float v4, v2, v0

    if-lez v4, :cond_4

    cmpg-float v4, v3, v1

    if-gtz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    const/4 v5, 0x1

    iput-boolean v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    iget v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->s:F

    sub-float v6, v2, v0

    mul-float v7, v5, v6

    sub-float v8, v3, v1

    mul-float/2addr v5, v8

    iget-object v9, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    if-lez v9, :cond_1

    iget-object v9, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v9

    if-lez v9, :cond_1

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v6}, Lco/bird/android/widget/cropper/d;->k()F

    move-result v6

    div-float/2addr v5, v6

    add-float/2addr v5, v0

    iput v5, v4, Landroid/graphics/RectF;->left:F

    iget-object v5, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v6}, Lco/bird/android/widget/cropper/d;->j()F

    move-result v6

    div-float/2addr v5, v6

    add-float/2addr v5, v1

    iput v5, v4, Landroid/graphics/RectF;->top:F

    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    iget-object v7, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v7}, Lco/bird/android/widget/cropper/d;->k()F

    move-result v7

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    iput v5, v4, Landroid/graphics/RectF;->right:F

    iget v5, v4, Landroid/graphics/RectF;->top:F

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    iget-object v7, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v7}, Lco/bird/android/widget/cropper/d;->j()F

    move-result v7

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    iput v5, v4, Landroid/graphics/RectF;->bottom:F

    iget v5, v4, Landroid/graphics/RectF;->left:F

    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v4, Landroid/graphics/RectF;->left:F

    iget v0, v4, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v4, Landroid/graphics/RectF;->top:F

    iget v0, v4, Landroid/graphics/RectF;->right:F

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v4, Landroid/graphics/RectF;->right:F

    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    goto/16 :goto_0

    :cond_1
    iget-boolean v9, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    if-eqz v9, :cond_3

    cmpl-float v9, v2, v0

    if-lez v9, :cond_3

    cmpl-float v9, v3, v1

    if-lez v9, :cond_3

    div-float/2addr v6, v8

    iget v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    cmpl-float v6, v6, v8

    const/high16 v8, 0x40000000    # 2.0f

    if-lez v6, :cond_2

    add-float/2addr v1, v5

    iput v1, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v5

    iput v3, v4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v8

    iget v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    int-to-float v1, v1

    iget v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/d;->e()F

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v8

    sub-float v2, v0, v1

    iput v2, v4, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->right:F

    goto :goto_0

    :cond_2
    add-float/2addr v0, v7

    iput v0, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v7

    iput v2, v4, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v8

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/d;->d()F

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    div-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v8

    sub-float v2, v0, v1

    iput v2, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    goto :goto_0

    :cond_3
    add-float/2addr v0, v7

    iput v0, v4, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v5

    iput v1, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v7

    iput v2, v4, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v5

    iput v3, v4, Landroid/graphics/RectF;->bottom:F

    :goto_0
    invoke-virtual {p0, v4}, Lco/bird/android/widget/cropper/CropOverlayView;->h(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, v4}, Lco/bird/android/widget/cropper/d;->t(Landroid/graphics/RectF;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    return v0
.end method

.method public final s()Z
    .locals 5

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x6

    aget v3, v0, v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    aget v3, v0, v2

    const/4 v4, 0x7

    aget v0, v0, v4

    cmpl-float v0, v3, v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public setAspectRatioX(I)V
    .locals 1

    if-lez p1, :cond_1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    int-to-float p1, p1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAspectRatioY(I)V
    .locals 1

    if-lez p1, :cond_1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->y:I

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->x:I

    int-to-float v0, v0

    int-to-float p1, p1

    div-float/2addr v0, p1

    iput v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBounds([FII)V
    .locals 4

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([FF)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->d:[F

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    iput p2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->o:I

    iput p3, p0, Lco/bird/android/widget/cropper/CropOverlayView;->p:I

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {p1}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    cmpl-float p1, p1, v0

    if-nez p1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    :cond_3
    return-void
.end method

.method public setCropShape(Lco/bird/android/widget/cropper/CropImageView$c;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setCropWindowChangeListener(Lco/bird/android/widget/cropper/CropOverlayView$a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->i:Lco/bird/android/widget/cropper/CropOverlayView$a;

    return-void
.end method

.method public setCropWindowLimits(FFFF)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lco/bird/android/widget/cropper/d;->p(FFFF)V

    return-void
.end method

.method public setCropWindowRect(Landroid/graphics/RectF;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/d;->t(Landroid/graphics/RectF;)V

    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setGuidelines(Lco/bird/android/widget/cropper/CropImageView$d;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->A:Lco/bird/android/widget/cropper/CropImageView$d;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->A:Lco/bird/android/widget/cropper/CropImageView$d;

    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setInitialAttributeValues(Lco/bird/android/widget/cropper/CropImageOptions;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/cropper/d;->q(Lco/bird/android/widget/cropper/CropImageOptions;)V

    iget-object v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->b:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropShape(Lco/bird/android/widget/cropper/CropImageView$c;)V

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->c:F

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setSnapRadius(F)V

    iget-object v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->e:Lco/bird/android/widget/cropper/CropImageView$d;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setGuidelines(Lco/bird/android/widget/cropper/CropImageView$d;)V

    iget-boolean v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->m:Z

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->n:I

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setAspectRatioX(I)V

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->o:I

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setAspectRatioY(I)V

    iget-boolean v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->j:Z

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->x(Z)Z

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->d:F

    iput v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->t:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->l:F

    iput v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->s:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->p:F

    iget v1, p1, Lco/bird/android/widget/cropper/CropImageOptions;->q:I

    invoke-static {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->p(FI)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->s:F

    iput v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->q:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->t:F

    iput v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->r:F

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->r:F

    iget v1, p1, Lco/bird/android/widget/cropper/CropImageOptions;->u:I

    invoke-static {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->p(FI)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    iget v0, p1, Lco/bird/android/widget/cropper/CropImageOptions;->v:F

    iget v1, p1, Lco/bird/android/widget/cropper/CropImageOptions;->w:I

    invoke-static {v0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->p(FI)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    iget p1, p1, Lco/bird/android/widget/cropper/CropImageOptions;->x:I

    invoke-static {p1}, Lco/bird/android/widget/cropper/CropOverlayView;->o(I)Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    return-void
.end method

.method public setInitialCropWindowRect(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->f:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/widget/cropper/c;->a:Landroid/graphics/Rect;

    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->c(Z)V

    :cond_1
    return-void
.end method

.method public setMaxCropResultSize(II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/widget/cropper/d;->r(II)V

    return-void
.end method

.method public setMinCropResultSize(II)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/widget/cropper/d;->s(II)V

    return-void
.end method

.method public setSnapRadius(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->u:F

    return-void
.end method

.method public final t(FF)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    iget v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->t:F

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->B:Lco/bird/android/widget/cropper/CropImageView$c;

    invoke-virtual {v0, p1, p2, v1, v2}, Lco/bird/android/widget/cropper/d;->f(FFFLco/bird/android/widget/cropper/CropImageView$c;)Lco/bird/android/widget/cropper/e;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final u(FF)V
    .locals 12

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    if-eqz v0, :cond_1

    iget v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->u:F

    iget-object v1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {v1}, Lco/bird/android/widget/cropper/d;->h()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p0, v1}, Lco/bird/android/widget/cropper/CropOverlayView;->b(Landroid/graphics/RectF;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v9, v0

    iget-object v2, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    iget-object v6, p0, Lco/bird/android/widget/cropper/CropOverlayView;->e:Landroid/graphics/RectF;

    iget v7, p0, Lco/bird/android/widget/cropper/CropOverlayView;->o:I

    iget v8, p0, Lco/bird/android/widget/cropper/CropOverlayView;->p:I

    iget-boolean v10, p0, Lco/bird/android/widget/cropper/CropOverlayView;->w:Z

    iget v11, p0, Lco/bird/android/widget/cropper/CropOverlayView;->z:F

    move-object v3, v1

    move v4, p1

    move v5, p2

    invoke-virtual/range {v2 .. v11}, Lco/bird/android/widget/cropper/e;->m(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFZF)V

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->b:Lco/bird/android/widget/cropper/d;

    invoke-virtual {p1, v1}, Lco/bird/android/widget/cropper/d;->t(Landroid/graphics/RectF;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/cropper/CropOverlayView;->c(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->v:Lco/bird/android/widget/cropper/e;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->c(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public w()V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->C:Z

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/widget/cropper/c;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, Lco/bird/android/widget/cropper/CropOverlayView;->q()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public x(Z)Z
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/widget/cropper/CropOverlayView;->h:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->h:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->g:Landroid/view/ScaleGestureDetector;

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lco/bird/android/widget/cropper/CropOverlayView$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lco/bird/android/widget/cropper/CropOverlayView$b;-><init>(Lco/bird/android/widget/cropper/CropOverlayView;LNE0;)V

    invoke-direct {p1, v0, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p1, p0, Lco/bird/android/widget/cropper/CropOverlayView;->g:Landroid/view/ScaleGestureDetector;

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
