.class public final Luo1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;",
        "",
        "a",
        "(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;)I",
        "layoutId",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;

    if-eqz v0, :cond_0

    sget p0, Laj4;->complication_battery:I

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;

    if-eqz p0, :cond_1

    sget p0, Laj4;->complication_icon:I

    :goto_0
    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
