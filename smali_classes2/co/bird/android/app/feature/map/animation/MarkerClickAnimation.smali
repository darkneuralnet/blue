.class public final Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;",
        "",
        "LfM2;",
        "marker",
        "",
        "run",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "Ljava/lang/Runnable;",
        "anim",
        "Ljava/lang/Runnable;",
        "<init>",
        "()V",
        "BounceAnimation",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMarkerClickAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkerClickAnimation.kt\nco/bird/android/app/feature/map/animation/MarkerClickAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"
    }
.end annotation


# instance fields
.field private anim:Ljava/lang/Runnable;

.field private final handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final run(LfM2;)Z
    .locals 8

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->anim:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;

    const-wide/16 v4, 0x258

    iget-object v7, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->handler:Landroid/os/Handler;

    move-object v1, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v7}, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;-><init>(JJLfM2;Landroid/os/Handler;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->anim:Ljava/lang/Runnable;

    iget-object p1, p0, Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;->handler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1
.end method
