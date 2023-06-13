.class public Lco/bird/android/widget/behavior/QuickReturnBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V
    .locals 0

    if-lez p5, :cond_0

    iget p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    if-ltz p1, :cond_1

    :cond_0
    if-gez p5, :cond_2

    iget p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    if-lez p1, :cond_2

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const/4 p1, 0x0

    iput p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    :cond_2
    iget p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    add-int/2addr p1, p5

    iput p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p1

    if-lez p1, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p1

    goto :goto_0

    :cond_3
    const/16 p1, 0x258

    :goto_0
    iget p3, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    if-le p3, p1, :cond_4

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p2}, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a(Landroid/view/View;)V

    goto :goto_1

    :cond_4
    iget p1, p0, Lco/bird/android/widget/behavior/QuickReturnBehavior;->a:I

    if-gez p1, :cond_5

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0, p2}, Lco/bird/android/widget/behavior/QuickReturnBehavior;->b(Landroid/view/View;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
