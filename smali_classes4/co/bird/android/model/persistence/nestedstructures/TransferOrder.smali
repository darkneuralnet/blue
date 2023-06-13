.class public final Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u0012H\u00c6\u0003J\t\u0010*\u001a\u00020\u0012H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00101\u001a\u00020\rH\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\u0085\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00104\u001a\u0002052\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001dR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0016\u00a8\u0006:"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
        "",
        "id",
        "",
        "demandSource",
        "Lco/bird/android/model/constant/TransferOrderDemandSource;",
        "status",
        "Lco/bird/android/model/constant/TransferOrderStatus;",
        "reason",
        "Lco/bird/android/model/constant/TransferOrderReason;",
        "originWarehouseId",
        "destinationWarehouseId",
        "actualDeliveryDate",
        "Lorg/joda/time/DateTime;",
        "targetDeliveryDate",
        "createdAt",
        "updatedAt",
        "originWarehouse",
        "Lco/bird/android/model/persistence/nestedstructures/Warehouse;",
        "destinationWarehouse",
        "(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V",
        "getActualDeliveryDate",
        "()Lorg/joda/time/DateTime;",
        "getCreatedAt",
        "getDemandSource",
        "()Lco/bird/android/model/constant/TransferOrderDemandSource;",
        "getDestinationWarehouse",
        "()Lco/bird/android/model/persistence/nestedstructures/Warehouse;",
        "getDestinationWarehouseId",
        "()Ljava/lang/String;",
        "getId",
        "getOriginWarehouse",
        "getOriginWarehouseId",
        "getReason",
        "()Lco/bird/android/model/constant/TransferOrderReason;",
        "getStatus",
        "()Lco/bird/android/model/constant/TransferOrderStatus;",
        "getTargetDeliveryDate",
        "getUpdatedAt",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final actualDeliveryDate:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "actual_delivery_date"
    .end annotation

    .annotation runtime Lft5;
        value = "actual_delivery_date"
    .end annotation
.end field

.field private final createdAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created_at"
    .end annotation

    .annotation runtime Lft5;
        value = "created_at"
    .end annotation
.end field

.field private final demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "demand_source"
    .end annotation

    .annotation runtime Lft5;
        value = "demand_source"
    .end annotation
.end field

.field private final destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "destination_warehouse"
    .end annotation

    .annotation runtime Lft5;
        value = "destination_warehouse"
    .end annotation
.end field

.field private final destinationWarehouseId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "destination_warehouse_id"
    .end annotation

    .annotation runtime Lft5;
        value = "destination_warehouse_id"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "origin_warehouse"
    .end annotation

    .annotation runtime Lft5;
        value = "origin_warehouse"
    .end annotation
.end field

.field private final originWarehouseId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "origin_warehouse_id"
    .end annotation

    .annotation runtime Lft5;
        value = "origin_warehouse_id"
    .end annotation
.end field

.field private final reason:Lco/bird/android/model/constant/TransferOrderReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reason"
    .end annotation

    .annotation runtime Lft5;
        value = "reason"
    .end annotation
.end field

.field private final status:Lco/bird/android/model/constant/TransferOrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field

.field private final targetDeliveryDate:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "target_delivery_date"
    .end annotation

    .annotation runtime Lft5;
        value = "target_delivery_date"
    .end annotation
.end field

.field private final updatedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated_at"
    .end annotation

    .annotation runtime Lft5;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "demandSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originWarehouseId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationWarehouseId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetDeliveryDate"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originWarehouse"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationWarehouse"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    iput-object p8, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    iput-object p9, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    iput-object p10, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    iput-object p11, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    iput-object p12, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    move-object v13, v2

    goto :goto_1

    :cond_1
    move-object/from16 v13, p10

    :goto_1
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    invoke-direct/range {v3 .. v15}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->copy(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component11()Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    return-object v0
.end method

.method public final component12()Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/TransferOrderDemandSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/TransferOrderStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/TransferOrderReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component8()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component9()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .locals 14

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "demandSource"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originWarehouseId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationWarehouseId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetDeliveryDate"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originWarehouse"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationWarehouse"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-object v1, v0

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v13}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getActualDeliveryDate()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    return-object v0
.end method

.method public final getDestinationWarehouse()Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    return-object v0
.end method

.method public final getDestinationWarehouseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginWarehouse()Lco/bird/android/model/persistence/nestedstructures/Warehouse;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    return-object v0
.end method

.method public final getOriginWarehouseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReason()Lco/bird/android/model/constant/TransferOrderReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/TransferOrderStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    return-object v0
.end method

.method public final getTargetDeliveryDate()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->demandSource:Lco/bird/android/model/constant/TransferOrderDemandSource;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->status:Lco/bird/android/model/constant/TransferOrderStatus;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->reason:Lco/bird/android/model/constant/TransferOrderReason;

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouseId:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouseId:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->actualDeliveryDate:Lorg/joda/time/DateTime;

    iget-object v7, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->targetDeliveryDate:Lorg/joda/time/DateTime;

    iget-object v8, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->createdAt:Lorg/joda/time/DateTime;

    iget-object v9, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->updatedAt:Lorg/joda/time/DateTime;

    iget-object v10, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->originWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    iget-object v11, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->destinationWarehouse:Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "TransferOrder(id="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", demandSource="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reason="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", originWarehouseId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destinationWarehouseId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", actualDeliveryDate="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetDeliveryDate="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", originWarehouse="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destinationWarehouse="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
