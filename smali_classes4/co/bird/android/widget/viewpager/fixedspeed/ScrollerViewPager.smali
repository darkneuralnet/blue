.class public Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String; = "ScrollerViewPager"


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x3e8

    iput p1, p0, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x3e8

    iput p1, p0, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget v0, p0, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->b:I

    invoke-virtual {p0, v0}, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->b(I)V

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->b:I

    invoke-virtual {p0, p1}, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->c(I)V

    return-void
.end method

.method public final c(I)V
    .locals 5

    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v1, Lio1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-direct {v3, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-direct {v1, v2, v3}, Lio1;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    invoke-virtual {v1, p1}, Lio1;->a(I)V

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    :try_start_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    sget-object p1, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->c:Ljava/lang/String;

    const-string v0, "onInterceptTouchEvent in IllegalArgumentException"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method
