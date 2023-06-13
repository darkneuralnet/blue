.class public final Lco/bird/api/response/WireInventoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toPart",
        "Lco/bird/android/model/wire/WireInventoryPart;",
        "Lco/bird/api/response/WireInventory;",
        "co.bird.android.api"
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
.method public static final toPart(Lco/bird/api/response/WireInventory;)Lco/bird/android/model/wire/WireInventoryPart;
    .locals 19

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getSku()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->displayName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getSku()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getDefaultImageUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getHealthyThreshold()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireInventory;->getQuantity()I

    move-result v12

    new-instance v0, Lco/bird/android/model/wire/WireInventoryPart;

    move-object v2, v0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x35c4

    const/16 v18, 0x0

    invoke-direct/range {v2 .. v18}, Lco/bird/android/model/wire/WireInventoryPart;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;Ljava/util/List;ILco/bird/android/model/constant/HealthStatus;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
