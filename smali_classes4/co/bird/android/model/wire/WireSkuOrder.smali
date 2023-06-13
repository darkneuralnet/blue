.class public final Lco/bird/android/model/wire/WireSkuOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bq\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0008H\u00c6\u0003J\t\u0010,\u001a\u00020\u000cH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J|\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0008H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u00a8\u00066"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "",
        "id",
        "",
        "containerOrder",
        "Lco/bird/android/model/wire/WireContainerOrder;",
        "containerOrderId",
        "packagingQuantity",
        "",
        "packageType",
        "quantity",
        "status",
        "Lco/bird/android/model/constant/SkuOrderStatus;",
        "transferOrderLineItemId",
        "transferOrderLineItem",
        "Lco/bird/android/model/wire/WireTransferOrderLineItem;",
        "updatedAt",
        "Lorg/joda/time/DateTime;",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)V",
        "getContainerOrder",
        "()Lco/bird/android/model/wire/WireContainerOrder;",
        "getContainerOrderId",
        "()Ljava/lang/String;",
        "getId",
        "getPackageType",
        "getPackagingQuantity",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getQuantity",
        "()I",
        "getStatus",
        "()Lco/bird/android/model/constant/SkuOrderStatus;",
        "getTransferOrderLineItem",
        "()Lco/bird/android/model/wire/WireTransferOrderLineItem;",
        "getTransferOrderLineItemId",
        "getUpdatedAt",
        "()Lorg/joda/time/DateTime;",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)Lco/bird/android/model/wire/WireSkuOrder;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "model-wire_release"
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
.field private final containerOrder:Lco/bird/android/model/wire/WireContainerOrder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "container_order"
    .end annotation

    .annotation runtime Lft5;
        value = "container_order"
    .end annotation
.end field

.field private final containerOrderId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "container_order_id"
    .end annotation

    .annotation runtime Lft5;
        value = "container_order_id"
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

.field private final packageType:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "package_type"
    .end annotation

    .annotation runtime Lft5;
        value = "package_type"
    .end annotation
.end field

.field private final packagingQuantity:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "packaging_quantity"
    .end annotation

    .annotation runtime Lft5;
        value = "packaging_quantity"
    .end annotation
.end field

.field private final quantity:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "quantity"
    .end annotation

    .annotation runtime Lft5;
        value = "quantity"
    .end annotation
.end field

.field private final status:Lco/bird/android/model/constant/SkuOrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field

.field private final transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "transfer_order_line_item"
    .end annotation

    .annotation runtime Lft5;
        value = "transfer_order_line_item"
    .end annotation
.end field

.field private final transferOrderLineItemId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "transfer_order_line_item_id"
    .end annotation

    .annotation runtime Lft5;
        value = "transfer_order_line_item_id"
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
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerOrderId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferOrderLineItemId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    iput-object p3, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    iput-object p5, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    iput p6, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    iput-object p7, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    iput-object p8, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    iput-object p10, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v5, v3

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object v7, v3

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v8, v3

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    move v9, v1

    goto :goto_5

    :cond_5
    move/from16 v9, p6

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move-object v12, v3

    goto :goto_7

    :cond_7
    move-object/from16 v12, p9

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    move-object v13, v3

    goto :goto_8

    :cond_8
    move-object/from16 v13, p10

    :goto_8
    move-object v3, p0

    move-object/from16 v10, p7

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/wire/WireSkuOrder;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/wire/WireSkuOrder;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/wire/WireSkuOrder;->copy(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireContainerOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    return v0
.end method

.method public final component7()Lco/bird/android/model/constant/SkuOrderStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lco/bird/android/model/wire/WireTransferOrderLineItem;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)Lco/bird/android/model/wire/WireSkuOrder;
    .locals 12

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerOrderId"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transferOrderLineItemId"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireSkuOrder;

    move-object v1, v0

    move-object v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WireSkuOrder;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireSkuOrder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireSkuOrder;

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    iget v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    iget-object v3, p1, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    return-object v0
.end method

.method public final getContainerOrderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackageType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackagingQuantity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getQuantity()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    return v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/SkuOrderStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    return-object v0
.end method

.method public final getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    return-object v0
.end method

.method public final getTransferOrderLineItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireContainerOrder;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/wire/WireSkuOrder;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrder:Lco/bird/android/model/wire/WireContainerOrder;

    iget-object v2, p0, Lco/bird/android/model/wire/WireSkuOrder;->containerOrderId:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/WireSkuOrder;->packagingQuantity:Ljava/lang/Integer;

    iget-object v4, p0, Lco/bird/android/model/wire/WireSkuOrder;->packageType:Ljava/lang/String;

    iget v5, p0, Lco/bird/android/model/wire/WireSkuOrder;->quantity:I

    iget-object v6, p0, Lco/bird/android/model/wire/WireSkuOrder;->status:Lco/bird/android/model/constant/SkuOrderStatus;

    iget-object v7, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItemId:Ljava/lang/String;

    iget-object v8, p0, Lco/bird/android/model/wire/WireSkuOrder;->transferOrderLineItem:Lco/bird/android/model/wire/WireTransferOrderLineItem;

    iget-object v9, p0, Lco/bird/android/model/wire/WireSkuOrder;->updatedAt:Lorg/joda/time/DateTime;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WireSkuOrder(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", containerOrder="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", containerOrderId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", packagingQuantity="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", packageType="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", quantity="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", transferOrderLineItemId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", transferOrderLineItem="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
