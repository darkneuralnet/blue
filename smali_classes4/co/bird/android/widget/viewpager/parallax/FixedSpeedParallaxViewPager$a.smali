.class public Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrollStateChanged(I)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    iget-object v1, v0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->d:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->h(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroid/graphics/Rect;

    move-result-object v0

    int-to-float v1, p1

    add-float/2addr v1, p2

    const v2, 0x3c23d70a    # 0.01f

    sub-float v3, v1, v2

    iget-object v4, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v4}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->d(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v4, v4

    iput v4, v0, Landroid/graphics/Rect;->left:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->h(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroid/graphics/Rect;

    move-result-object v0

    add-float v4, v1, v2

    iget-object v5, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v5}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->d(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v5}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->f(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iput v4, v0, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->e(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v4, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    iput v3, v0, Landroid/graphics/Rect;->left:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->e(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroid/graphics/Rect;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v1, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$i;->onPageScrolled(IFI)V

    :cond_1
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager$a;->b:Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;

    invoke-static {v0}, Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;->g(Lco/bird/android/widget/viewpager/parallax/FixedSpeedParallaxViewPager;)Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$i;->onPageSelected(I)V

    :cond_0
    return-void
.end method
