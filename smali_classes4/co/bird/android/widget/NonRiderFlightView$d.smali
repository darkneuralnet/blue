.class public final Lco/bird/android/widget/NonRiderFlightView$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/NonRiderFlightView;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "co/bird/android/widget/NonRiderFlightView$d",
        "Landroid/animation/AnimatorListenerAdapter;",
        "Landroid/animation/Animator;",
        "animation",
        "",
        "onAnimationEnd",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/widget/NonRiderFlightView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView$d;->a:Lco/bird/android/widget/NonRiderFlightView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/NonRiderFlightView$d;->b(Lco/bird/android/widget/NonRiderFlightView;)V

    return-void
.end method

.method public static final b(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/widget/NonRiderFlightView;->access$showToasts(Lco/bird/android/widget/NonRiderFlightView;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView$d;->a:Lco/bird/android/widget/NonRiderFlightView;

    invoke-static {p1}, Lco/bird/android/widget/NonRiderFlightView;->access$getBinding$p(Lco/bird/android/widget/NonRiderFlightView;)Lcr6;

    move-result-object p1

    iget-object p1, p1, Lcr6;->f:Lg56;

    invoke-virtual {p1}, Lg56;->b()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "binding.toastMessage.root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView$d;->a:Lco/bird/android/widget/NonRiderFlightView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lco/bird/android/widget/NonRiderFlightView;->access$setShowingToasts$p(Lco/bird/android/widget/NonRiderFlightView;Z)V

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView$d;->a:Lco/bird/android/widget/NonRiderFlightView;

    new-instance v0, LJ93;

    invoke-direct {v0, p1}, LJ93;-><init>(Lco/bird/android/widget/NonRiderFlightView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
