.class public final Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;
.super Landroidx/work/RxWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;",
        "Landroidx/work/RxWorker;",
        "Lio/reactivex/F;",
        "Landroidx/work/c$a;",
        "r",
        "",
        "scanPeriodSeconds",
        "",
        "trigger",
        "A",
        "LMD;",
        "h",
        "LMD;",
        "x",
        "()LMD;",
        "setBaseBluetoothManager",
        "(LMD;)V",
        "baseBluetoothManager",
        "Lpv0;",
        "i",
        "Lpv0;",
        "y",
        "()Lpv0;",
        "setConfigManager",
        "(Lpv0;)V",
        "configManager",
        "Ldr4;",
        "j",
        "Ldr4;",
        "z",
        "()Ldr4;",
        "setReactiveLocationManager",
        "(Ldr4;)V",
        "reactiveLocationManager",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "k",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final k:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;

.field public static final l:I


# instance fields
.field public h:LMD;

.field public i:Lpv0;

.field public j:Ldr4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->k:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->l:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/RxWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->O1(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;)V

    return-void
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final synthetic access$headlessScan(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;JLjava/lang/String;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->A(JLjava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final A(JLjava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->z()Ldr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ldr4;->e(Z)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;

    invoke-direct {v1, p0, p3}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;-><init>(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Ljava/lang/String;)V

    new-instance p3, LNH1;

    invoke-direct {p3, v1}, LNH1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p3}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, p2, v0}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p3, p1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Landroidx/work/c$a;->b()Landroidx/work/c$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 p2, 0xa

    invoke-virtual {p1, p2, p3, v0}, Lio/reactivex/F;->l(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "private fun headlessScan\u2026DS, TimeUnit.SECONDS)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public r()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->y()Lpv0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lpv0;->l0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;-><init>(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;)V

    new-instance v2, LOH1;

    invoke-direct {v2, v1}, LOH1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun createWork(\u2026     .singleOrError()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final x()LMD;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->h:LMD;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "baseBluetoothManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()Lpv0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->i:Lpv0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "configManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final z()Ldr4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->j:Ldr4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "reactiveLocationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
