.class public final synthetic LOu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOu3;->a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    iput-boolean p2, p0, LOu3;->b:Z

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, LOu3;->a:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    iget-boolean v1, p0, LOu3;->b:Z

    invoke-static {v0, v1, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method
