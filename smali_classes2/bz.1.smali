.class public final synthetic Lbz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/bottomsheet/BaseBottomSheet;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbz;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lbz;->a:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {v0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->k(Lco/bird/android/bottomsheet/BaseBottomSheet;Landroid/animation/ValueAnimator;)V

    return-void
.end method
