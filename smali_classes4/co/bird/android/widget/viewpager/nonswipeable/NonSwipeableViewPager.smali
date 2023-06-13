.class public Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;
.super Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;
.source "SourceFile"


# instance fields
.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;->d:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;->d:Z

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lco/bird/android/widget/viewpager/fixedspeed/ScrollerViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;->d:Z

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

.method public setSwipeEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/viewpager/nonswipeable/NonSwipeableViewPager;->d:Z

    return-void
.end method
