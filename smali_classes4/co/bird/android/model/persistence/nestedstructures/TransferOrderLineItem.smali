.class public final Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003Je\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00072\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;",
        "",
        "id",
        "",
        "commodity",
        "commodityType",
        "usedCondition",
        "",
        "transferOrder",
        "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
        "commodities",
        "",
        "originFleet",
        "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
        "destinationFleet",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V",
        "getCommodities",
        "()Ljava/util/Map;",
        "getCommodity",
        "()Ljava/lang/String;",
        "getCommodityType",
        "getDestinationFleet",
        "()Lco/bird/android/model/persistence/nestedstructures/Fleet;",
        "getId",
        "getOriginFleet",
        "getTransferOrder",
        "()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
        "getUsedCondition",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
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
.field private final commodities:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "commodities"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "commodities"
    .end annotation
.end field

.field private final commodity:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "commodity"
    .end annotation

    .annotation runtime Lft5;
        value = "commodity"
    .end annotation
.end field

.field private final commodityType:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "commodity_type"
    .end annotation

    .annotation runtime Lft5;
        value = "commodity_type"
    .end annotation
.end field

.field private final destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "destination_fleet"
    .end annotation

    .annotation runtime Lft5;
        value = "destination_fleet"
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

.field private final originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "origin_fleet"
    .end annotation

    .annotation runtime Lft5;
        value = "origin_fleet"
    .end annotation
.end field

.field private final transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "transfer_order"
    .end annotation

    .annotation runtime Lft5;
        value = "transfer_order"
    .end annotation
.end field

.field private final usedCondition:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "used"
    .end annotation

    .annotation runtime Lft5;
        value = "used"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
            "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodityType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferOrder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodities"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originFleet"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationFleet"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    iput-boolean p4, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    iput-object p6, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    iput-object p7, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    iput-object p8, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object/from16 v7, p6

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    return v0
.end method

.method public final component5()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
            "Lco/bird/android/model/persistence/nestedstructures/Fleet;",
            ")",
            "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;"
        }
    .end annotation

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodity"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodityType"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferOrder"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commodities"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originFleet"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationFleet"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-object v1, v0

    move v5, p4

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCommodities()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    return-object v0
.end method

.method public final getCommodity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommodityType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestinationFleet()Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginFleet()Lco/bird/android/model/persistence/nestedstructures/Fleet;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    return-object v0
.end method

.method public final getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    return-object v0
.end method

.method public final getUsedCondition()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Fleet;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Fleet;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodity:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodityType:Ljava/lang/String;

    iget-boolean v3, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->usedCondition:Z

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->transferOrder:Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    iget-object v5, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->commodities:Ljava/util/Map;

    iget-object v6, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->originFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    iget-object v7, p0, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->destinationFleet:Lco/bird/android/model/persistence/nestedstructures/Fleet;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "TransferOrderLineItem(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", commodity="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", commodityType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", usedCondition="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", transferOrder="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", commodities="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", originFleet="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destinationFleet="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
