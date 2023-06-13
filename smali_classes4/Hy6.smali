.class public final LHy6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0008\u001a\n\u0010\r\u001a\u00020\u000c*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;",
        "",
        "warehouseId",
        "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;",
        "a",
        "Lco/bird/android/model/wire/WireWarehouseSummary;",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;",
        "d",
        "Lco/bird/android/model/wire/WireWarehouseStatus;",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;",
        "c",
        "Lco/bird/android/model/wire/WireWarehouseDetails;",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;",
        "b",
        "Lco/bird/android/model/wire/WireWarehouseVehicleDetails;",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;",
        "f",
        "Lco/bird/android/model/wire/WireWarehouseVehicle;",
        "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;",
        "e",
        "co.bird.android.repository.warehouse-flight-sheet"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWarehouseFlightSheetConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetConversion.kt\nco/bird/android/repository/warehouseflightsheet/conversion/WarehouseFlightSheetConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n1549#2:75\n1620#2,3:76\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetConversion.kt\nco/bird/android/repository/warehouseflightsheet/conversion/WarehouseFlightSheetConversionKt\n*L\n49#1:71\n49#1:72,3\n57#1:75\n57#1:76,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warehouseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;->getSummary()Lco/bird/android/model/wire/WireWarehouseSummary;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LHy6;->d(Lco/bird/android/model/wire/WireWarehouseSummary;)Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;->getStatus()Lco/bird/android/model/wire/WireWarehouseStatus;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LHy6;->c(Lco/bird/android/model/wire/WireWarehouseStatus;)Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    move-result-object v1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;->getWarehouseDetails()Lco/bird/android/model/wire/WireWarehouseDetails;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, LHy6;->b(Lco/bird/android/model/wire/WireWarehouseDetails;)Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    move-result-object v1

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;->getVehicleDetails()Lco/bird/android/model/wire/WireWarehouseVehicleDetails;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, LHy6;->f(Lco/bird/android/model/wire/WireWarehouseVehicleDetails;)Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    move-result-object p0

    move-object v6, p0

    goto :goto_3

    :cond_3
    move-object v6, v2

    :goto_3
    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireWarehouseDetails;)Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseDetails;->getIdx()I

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseDetails;->getDetails()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireFormattedFlightSheetDetail;

    invoke-static {v2}, LqB0;->d(Lco/bird/android/model/wire/WireFormattedFlightSheetDetail;)Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    invoke-direct {p0, v0, v1}, Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;-><init>(ILjava/util/List;)V

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/wire/WireWarehouseStatus;)Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseStatus;->getIdx()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseStatus;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseStatus;->getDetails()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseStatus;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseStatus;->getIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    move-object v6, p0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireWarehouseSummary;)Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseSummary;->getIdx()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseSummary;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseSummary;->getCount()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;-><init>(ILjava/lang/String;I)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireWarehouseVehicle;)Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicle;->getBirdId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicle;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicle;->getStatusIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicle;->getStatusIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v5, v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicle;->getBattery()I

    move-result v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;I)V

    return-object v0
.end method

.method public static final f(Lco/bird/android/model/wire/WireWarehouseVehicleDetails;)Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicleDetails;->getIdx()I

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicleDetails;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouseVehicleDetails;->getVehicles()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireWarehouseVehicle;

    invoke-static {v3}, LHy6;->e(Lco/bird/android/model/wire/WireWarehouseVehicle;)Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    invoke-direct {p0, v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object p0
.end method
