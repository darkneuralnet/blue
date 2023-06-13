.class public final Lpi3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u001a\u000c\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u001a\u000c\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\u000c\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "a",
        "Lco/bird/android/model/wire/WireTransferOrderLineItem;",
        "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;",
        "d",
        "Lco/bird/android/model/wire/WireTransferOrder;",
        "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
        "c",
        "Lco/bird/android/model/wire/WireFleet;",
        "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
        "b",
        "Lco/bird/android/model/wire/WireWarehouse;",
        "Lco/bird/android/model/persistence/nestedstructures/Warehouse;",
        "e",
        "co.bird.android.repository.operator-order-view"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireSkuOrder;)Lco/bird/android/model/persistence/SkuOrder;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/SkuOrder;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getPackagingQuantity()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getPackageType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getQuantity()I

    move-result v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItemId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lpi3;->d(Lco/bird/android/model/wire/WireTransferOrderLineItem;)Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/persistence/SkuOrder;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireFleet;)Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .locals 4

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Fleet;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFleet;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFleet;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFleet;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFleet;->getPartnerId()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/Fleet;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireTransferOrder;)Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .locals 14

    new-instance v13, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getStatus()Lco/bird/android/model/constant/TransferOrderStatus;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getReason()Lco/bird/android/model/constant/TransferOrderReason;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getOriginWarehouseId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouseId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getActualDeliveryDate()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getTargetDeliveryDate()Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v10

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getOriginWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lpi3;->e(Lco/bird/android/model/wire/WireWarehouse;)Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    move-result-object v11

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Lpi3;->e(Lco/bird/android/model/wire/WireWarehouse;)Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    move-result-object v12

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V

    return-object v13
.end method

.method public static final d(Lco/bird/android/model/wire/WireTransferOrderLineItem;)Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;
    .locals 10

    new-instance v9, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodityType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getUsedCondition()Z

    move-result v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lpi3;->c(Lco/bird/android/model/wire/WireTransferOrder;)Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodities()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getOriginFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lpi3;->b(Lco/bird/android/model/wire/WireFleet;)Lco/bird/android/model/persistence/nestedstructures/Fleet;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Lpi3;->b(Lco/bird/android/model/wire/WireFleet;)Lco/bird/android/model/persistence/nestedstructures/Fleet;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V

    return-object v9
.end method

.method public static final e(Lco/bird/android/model/wire/WireWarehouse;)Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .locals 2

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouse;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireWarehouse;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
