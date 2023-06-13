.class public Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public b:F

.field public final c:Landroid/graphics/Paint;

.field public d:F

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->f:Z

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object p3, LOl4;->RoundCornerImageView:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c(Landroid/content/res/TypedArray;)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/res/TypedArray;)V
    .locals 2

    :try_start_0
    sget v0, LOl4;->RoundCornerImageView_strokeColor:I

    const/high16 v1, -0x1000000

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->e:I

    sget v0, LOl4;->RoundCornerImageView_strokeWidth:I

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    sget v0, LOl4;->RoundCornerImageView_radius:I

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->b:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->f:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v1, v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    div-float/2addr v5, v2

    sub-float/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    div-float/2addr v6, v2

    sub-float/2addr v5, v6

    invoke-direct {v0, v3, v1, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    iget v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->e:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->b:F

    iget-object v2, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_1
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iget v2, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->b:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v0, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    iget v0, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    float-to-int v1, v0

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr p1, v1

    float-to-int v0, v0

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public setBorderEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->f:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRadius(F)V
    .locals 0

    iput p1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->b:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 0

    iput p1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->e:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 0

    iput p1, p0, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;->d:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
