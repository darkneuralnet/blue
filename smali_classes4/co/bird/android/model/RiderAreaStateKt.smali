.class public final Lco/bird/android/model/RiderAreaStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "isInNoRideOrNoParkArea",
        "",
        "Lco/bird/android/model/RiderAreaState;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isInNoRideOrNoParkArea(Lco/bird/android/model/RiderAreaState;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/RiderAreaState;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/IN_NO_PARKING_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_PARKING_AREA;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/IN_NO_RIDE_NO_PARK_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_RIDE_NO_PARK_AREA;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/IN_NO_RIDE_AREA;->INSTANCE:Lco/bird/android/model/IN_NO_RIDE_AREA;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/IN_SLOW_NO_PARK_AREA;->INSTANCE:Lco/bird/android/model/IN_SLOW_NO_PARK_AREA;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
