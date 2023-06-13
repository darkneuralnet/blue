.class public final synthetic LIj3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

.field public final synthetic b:Lco/bird/android/model/persistence/FleetIconAnimation;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIj3;->a:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    iput-object p2, p0, LIj3;->b:Lco/bird/android/model/persistence/FleetIconAnimation;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, LIj3;->a:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    iget-object v1, p0, LIj3;->b:Lco/bird/android/model/persistence/FleetIconAnimation;

    invoke-static {v0, v1, p1}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;->t(Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;Lco/bird/android/model/persistence/FleetIconAnimation;Landroid/animation/ValueAnimator;)V

    return-void
.end method
