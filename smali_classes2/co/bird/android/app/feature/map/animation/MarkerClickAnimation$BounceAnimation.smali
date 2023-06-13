.class final Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BounceAnimation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;",
        "Ljava/lang/Runnable;",
        "",
        "run",
        "",
        "begin",
        "J",
        "duration",
        "LfM2;",
        "marker",
        "LfM2;",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "Landroid/view/animation/Interpolator;",
        "interpolator",
        "Landroid/view/animation/Interpolator;",
        "<init>",
        "(JJLfM2;Landroid/os/Handler;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final begin:J

.field private final duration:J

.field private final handler:Landroid/os/Handler;

.field private final interpolator:Landroid/view/animation/Interpolator;

.field private final marker:LfM2;


# direct methods
.method public constructor <init>(JJLfM2;Landroid/os/Handler;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->begin:J

    iput-wide p3, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->duration:J

    iput-object p5, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->marker:LfM2;

    iput-object p6, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->handler:Landroid/os/Handler;

    new-instance p1, Landroid/view/animation/BounceInterpolator;

    invoke-direct {p1}, Landroid/view/animation/BounceInterpolator;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->interpolator:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->begin:J

    sub-long/2addr v0, v2

    const/4 v2, 0x1

    int-to-float v2, v2

    iget-object v3, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->interpolator:Landroid/view/animation/Interpolator;

    long-to-float v0, v0

    iget-wide v4, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->duration:J

    long-to-float v1, v4

    div-float/2addr v0, v1

    invoke-interface {v3, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    sub-float/2addr v2, v0

    const/4 v0, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->marker:LfM2;

    const v2, 0x3f99999a    # 1.2f

    mul-float/2addr v2, v0

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v1, v3, v2}, LfM2;->h(FF)V

    float-to-double v0, v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;->handler:Landroid/os/Handler;

    const-wide/16 v1, 0x10

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
