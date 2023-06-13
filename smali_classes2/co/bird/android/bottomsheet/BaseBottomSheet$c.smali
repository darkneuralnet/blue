.class public final Lco/bird/android/bottomsheet/BaseBottomSheet$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/bottomsheet/BaseBottomSheet;->q(F)V
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
        "co/bird/android/bottomsheet/BaseBottomSheet$c",
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
.field public final synthetic a:Lco/bird/android/bottomsheet/BaseBottomSheet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method public constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;",
            "Landroid/animation/ValueAnimator$AnimatorUpdateListener;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$c;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    iput-object p2, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$c;->b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$c;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    const/4 v0, 0x2

    new-array v0, v0, [F

    invoke-static {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getBinding$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)LHp6;

    move-result-object v1

    iget-object v1, v1, LHp6;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$c;->b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-static {p1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$setRotationAnimator$p(Lco/bird/android/bottomsheet/BaseBottomSheet;Landroid/animation/ValueAnimator;)V

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$c;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getRotationAnimator$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)Landroid/animation/ValueAnimator;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method
