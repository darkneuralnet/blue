.class public final synthetic LPu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPu3;->a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LPu3;->a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-static {v0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/animation/ValueAnimator;)V

    return-void
.end method
