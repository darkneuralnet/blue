.class public final Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->r()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lio/reactivex/K<",
        "+",
        "Landroidx/work/c$a;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "it",
        "Lio/reactivex/K;",
        "Landroidx/work/c$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;->g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/Config;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBeaconConfig()Lco/bird/android/model/wire/configs/BeaconConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BeaconConfig;->getEnableBluetoothScanReporting()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;->g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBeaconConfig()Lco/bird/android/model/wire/configs/BeaconConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BeaconConfig;->getHeadlessScanPeriod()J

    move-result-wide v1

    iget-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;->g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    invoke-virtual {p1}, Landroidx/work/c;->g()Landroidx/work/b;

    move-result-object p1

    const-string v3, "co.bird.android.app.feature.bluetooth.job.trigger"

    invoke-virtual {p1, v3}, Landroidx/work/b;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->access$headlessScan(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;JLjava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "{\n          Single.just(\u2026sult.failure())\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$b;->a(Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
