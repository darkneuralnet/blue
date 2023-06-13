.class public final synthetic LO32;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/qualitycontrol/widgets/InspectionCardView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO32;->a:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LO32;->a:Lco/bird/android/qualitycontrol/widgets/InspectionCardView;

    invoke-static {v0, p1}, Lco/bird/android/qualitycontrol/widgets/InspectionCardView;->u(Lco/bird/android/qualitycontrol/widgets/InspectionCardView;Landroid/animation/ValueAnimator;)V

    return-void
.end method
