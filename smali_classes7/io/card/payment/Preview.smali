.class Lio/card/payment/Preview;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final TAG:Ljava/lang/String; = "Preview"


# instance fields
.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field mSurfaceView:Landroid/view/SurfaceView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput p4, p0, Lio/card/payment/Preview;->mPreviewWidth:I

    iput p3, p0, Lio/card/payment/Preview;->mPreviewHeight:I

    new-instance p2, Landroid/view/SurfaceView;

    invoke-direct {p2, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/card/payment/Preview;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public getSurfaceHolder()Landroid/view/SurfaceHolder;
    .locals 1

    invoke-virtual {p0}, Lio/card/payment/Preview;->getSurfaceView()Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    return-object v0
.end method

.method public getSurfaceView()Landroid/view/SurfaceView;
    .locals 1

    iget-object v0, p0, Lio/card/payment/Preview;->mSurfaceView:Landroid/view/SurfaceView;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/16 v0, 0xff

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-lez p1, :cond_1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget p1, p0, Lio/card/payment/Preview;->mPreviewHeight:I

    mul-int p2, p4, p1

    iget p3, p0, Lio/card/payment/Preview;->mPreviewWidth:I

    mul-int v0, p5, p3

    const/4 v1, 0x0

    if-le p2, v0, :cond_0

    mul-int/2addr p3, p5

    div-int/2addr p3, p1

    iget-object p1, p0, Lio/card/payment/Preview;->mSurfaceView:Landroid/view/SurfaceView;

    sub-int p2, p4, p3

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p4, p3

    div-int/lit8 p4, p4, 0x2

    invoke-virtual {p1, p2, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    mul-int/2addr p1, p4

    div-int/2addr p1, p3

    iget-object p2, p0, Lio/card/payment/Preview;->mSurfaceView:Landroid/view/SurfaceView;

    sub-int p3, p5, p1

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p5, p1

    div-int/lit8 p5, p5, 0x2

    invoke-virtual {p2, v1, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method
