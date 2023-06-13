.class Lio/card/payment/Torch;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Torch"


# instance fields
.field private mHeight:F

.field private mOn:Z

.field private mWidth:F


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/card/payment/Torch;->mOn:Z

    iput p1, p0, Lio/card/payment/Torch;->mWidth:F

    iput p2, p0, Lio/card/payment/Torch;->mHeight:F

    return-void
.end method

.method private static createBoltPath()Landroid/graphics/Path;
    .locals 5

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v3, 0x41300000    # 11.0f

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-virtual {v0, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v3, 0x41500000    # 13.0f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v3, 0x40e00000    # 7.0f

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->setLastPoint(FF)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v2, -0x3f300000    # -6.5f

    const/high16 v3, -0x3ee00000    # -10.0f

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    const v2, 0x3d4ccccd    # 0.05f

    invoke-virtual {v1, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lio/card/payment/Torch;->mWidth:F

    neg-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v2, p0, Lio/card/payment/Torch;->mHeight:F

    neg-float v2, v2

    div-float/2addr v2, v1

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v2, -0x1000000

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-boolean v6, p0, Lio/card/payment/Torch;->mOn:Z

    if-eqz v6, :cond_0

    const/16 v6, 0xc0

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_0

    :cond_0
    const/16 v6, 0x60

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_0
    const/16 v6, 0x8

    new-array v6, v6, [F

    const/high16 v7, 0x40a00000    # 5.0f

    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([FF)V

    new-instance v7, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/4 v8, 0x0

    invoke-direct {v7, v6, v8, v8}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    iget v6, p0, Lio/card/payment/Torch;->mWidth:F

    iget v8, p0, Lio/card/payment/Torch;->mHeight:F

    invoke-virtual {v7, v6, v8}, Landroid/graphics/drawable/shapes/Shape;->resize(FF)V

    invoke-virtual {v7, p1, v4}, Landroid/graphics/drawable/shapes/RoundRectShape;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    invoke-virtual {v7, p1, v0}, Landroid/graphics/drawable/shapes/RoundRectShape;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sget-object v4, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-boolean v3, p0, Lio/card/payment/Torch;->mOn:Z

    if-eqz v3, :cond_1

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    invoke-static {}, Lio/card/payment/Torch;->createBoltPath()Landroid/graphics/Path;

    move-result-object v2

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    const v4, 0x3f4ccccd    # 0.8f

    iget v5, p0, Lio/card/payment/Torch;->mHeight:F

    mul-float/2addr v5, v4

    invoke-virtual {v3, v5, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget v3, p0, Lio/card/payment/Torch;->mWidth:F

    div-float/2addr v3, v1

    iget v4, p0, Lio/card/payment/Torch;->mHeight:F

    div-float/2addr v4, v1

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public setOn(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/card/payment/Torch;->mOn:Z

    return-void
.end method
