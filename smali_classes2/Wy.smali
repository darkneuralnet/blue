.class public final synthetic LWy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/bottomsheet/BaseBottomSheet;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWy;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    iput p2, p0, LWy;->b:F

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, LWy;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    iget v1, p0, LWy;->b:F

    invoke-static {v0, v1, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->f(Lco/bird/android/bottomsheet/BaseBottomSheet;FLandroid/animation/ValueAnimator;)V

    return-void
.end method
