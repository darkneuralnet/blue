.class public Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;
    }
.end annotation


# instance fields
.field public b:Landroid/graphics/Bitmap;

.field public c:Landroid/graphics/Rect;

.field public d:Landroid/graphics/Rect;

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:Landroidx/viewpager/widget/ViewPager$i;

.field public j:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->k:Z

    invoke-virtual {p0}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->h()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->k:Z

    invoke-virtual {p0}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->h()V

    return-void
.end method

.method public static bridge synthetic a(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)I
    .locals 0

    iget p0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->f:I

    return p0
.end method

.method public static bridge synthetic b(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->d:Landroid/graphics/Rect;

    return-object p0
.end method

.method public static bridge synthetic c(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)I
    .locals 0

    iget p0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->g:I

    return p0
.end method

.method public static bridge synthetic d(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->i:Landroidx/viewpager/widget/ViewPager$i;

    return-object p0
.end method

.method public static bridge synthetic e(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    return-object p0
.end method


# virtual methods
.method public addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->i:Landroidx/viewpager/widget/ViewPager$i;

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-class v0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Invalid bitmap bounds for the current device, parallax effect will not work."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_2

    iget v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->e:I

    if-eqz v1, :cond_1

    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->g:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->g:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()LcE3;

    move-result-object v1

    invoke-virtual {v1}, LcE3;->getCount()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->h:F

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->f:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    iget-object v2, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v0

    sub-float/2addr v2, v3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v2, v0

    float-to-int v0, v2

    iput v0, v1, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget-object v2, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()LcE3;

    move-result-object v1

    invoke-virtual {v1}, LcE3;->getCount()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->f:I

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->g:I

    :cond_2
    :goto_0
    return-void
.end method

.method public g()Landroidx/viewpager/widget/ViewPager$i;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->j:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;

    return-object v0
.end method

.method public final h()V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->d:Landroid/graphics/Rect;

    const/4 v0, 0x1

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->e:I

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->h:F

    new-instance v0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;

    invoke-direct {v0, p0}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;-><init>(Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)V

    iput-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->j:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager$a;

    invoke-super {p0, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->c:Landroid/graphics/Rect;

    iget-object v2, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->d:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->k:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/viewpager/widget/ViewPager;->onSizeChanged(IIII)V

    iget-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->d:Landroid/graphics/Rect;

    const/4 p3, 0x0

    iput p3, p1, Landroid/graphics/Rect;->top:I

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()LcE3;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->f()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->k:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->b:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setSwipeEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->k:Z

    return-void
.end method
