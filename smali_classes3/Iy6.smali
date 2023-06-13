.class public final LIy6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIy6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "LIy6;",
        "",
        "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;",
        "warehouseFlightSheetDetails",
        "",
        "LH6;",
        "a",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;",
        "summary",
        "c",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;",
        "status",
        "b",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;",
        "warehouseDetails",
        "d",
        "",
        "warehouseId",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;",
        "warehouseVehicleDetails",
        "e",
        "<init>",
        "()V",
        "warehouse-flight-sheet_release"
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
        "SMAP\nWarehouseFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetConverter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1045#2:94\n1603#2,9:95\n1855#2:104\n1856#2:106\n1612#2:107\n1549#2:108\n1620#2,3:109\n1549#2:113\n1620#2,3:114\n1#3:105\n1#3:112\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetConverter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetConverter\n*L\n25#1:94\n26#1:95,9\n26#1:104\n26#1:106\n26#1:107\n59#1:108\n59#1:109,3\n73#1:113\n73#1:114,3\n26#1:105\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "warehouseFlightSheetDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/persistence/nestedstructures/WarehouseFlightSheetSection;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getSummary()Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getStatus()Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getWarehouseDetails()Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getVehicleDetails()Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, LIy6$b;

    invoke-direct {v1}, LIy6$b;-><init>()V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseFlightSheetSection;

    instance-of v3, v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    if-eqz v3, :cond_1

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    invoke-virtual {p0, v2}, LIy6;->c(Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;)LH6;

    move-result-object v2

    goto :goto_1

    :cond_1
    instance-of v3, v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    if-eqz v3, :cond_2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    invoke-virtual {p0, v2}, LIy6;->b(Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;)LH6;

    move-result-object v2

    goto :goto_1

    :cond_2
    instance-of v3, v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    if-eqz v3, :cond_3

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    invoke-virtual {p0, v2}, LIy6;->d(Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;)LH6;

    move-result-object v2

    goto :goto_1

    :cond_3
    instance-of v3, v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getWarehouseId()Ljava/lang/String;

    move-result-object v3

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    invoke-virtual {p0, v3, v2}, LIy6;->e(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)LH6;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public final b(Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;)LH6;
    .locals 7

    new-instance v6, LG6;

    sget v2, LVj4;->item_warehouse_flight_sheet_status:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, LH6;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final c(Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;)LH6;
    .locals 7

    new-instance v6, LG6;

    sget v2, LVj4;->item_warehouse_flight_sheet_summary:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, LH6;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final d(Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;)LH6;
    .locals 14

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;->getDetails()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;

    new-instance v1, LG6;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getFormat()Lco/bird/android/model/constant/FlightSheetDetailFormat;

    move-result-object v2

    sget-object v4, LIy6$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    sget v2, Lbk4;->item_formatted_flight_sheet_detail_short:I

    goto :goto_1

    :cond_0
    sget v2, Lbk4;->item_formatted_flight_sheet_detail_long:I

    :goto_1
    move v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v9

    new-instance p1, LH6;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final e(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)LH6;
    .locals 15

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;->getVehicles()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;

    new-instance v2, LG6;

    sget v5, LVj4;->item_warehouse_flight_sheet_vehicle_detail:I

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v10

    new-instance v11, LG6;

    new-instance v6, Lco/bird/android/model/RefreshWarehouseButton;

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;->getTitle()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/RefreshWarehouseButton;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, LVj4;->item_warehouse_flight_sheet_vehicle_details_title:I

    const/4 v3, 0x0

    move-object v0, v11

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LH6;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v14}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
