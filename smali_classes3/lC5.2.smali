.class public final LlC5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J8\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00040\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "LlC5;",
        "",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "wireSkuOrder",
        "",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        "scannedItems",
        "",
        "outbound",
        "allowSkuScanning",
        "Lio/reactivex/F;",
        "LH6;",
        "b",
        "i",
        "d",
        "e",
        "f",
        "g",
        "h",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nSkuOrderDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlC5;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LlC5;->c(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)Ljava/util/List;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$wireSkuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scannedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    new-array v0, v0, [LH6;

    invoke-virtual {p0, p1}, LlC5;->i(Lco/bird/android/model/wire/WireSkuOrder;)LH6;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2, p3, p4}, LlC5;->d(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)LH6;

    move-result-object p2

    aput-object p2, v0, v1

    const/4 p2, 0x2

    invoke-virtual {p0, p1}, LlC5;->e(Lco/bird/android/model/wire/WireSkuOrder;)LH6;

    move-result-object p4

    aput-object p4, v0, p2

    const/4 p2, 0x3

    invoke-virtual {p0, p1, p3}, LlC5;->f(Lco/bird/android/model/wire/WireSkuOrder;Z)LH6;

    move-result-object p3

    aput-object p3, v0, p2

    const/4 p2, 0x4

    invoke-virtual {p0, p1}, LlC5;->h(Lco/bird/android/model/wire/WireSkuOrder;)LH6;

    move-result-object p3

    aput-object p3, v0, p2

    const/4 p2, 0x5

    invoke-virtual {p0, p1}, LlC5;->g(Lco/bird/android/model/wire/WireSkuOrder;)LH6;

    move-result-object p0

    aput-object p0, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;ZZ)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "wireSkuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LkC5;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, LkC5;-><init>(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      lis\u2026eSkuOrder),\n      )\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)LH6;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;ZZ)",
            "LH6;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v7, LG6;

    new-instance v2, LVl0;

    iget-object v1, v0, LlC5;->a:Landroid/content/Context;

    sget v3, Lnl4;->sku_order_basic_info_header:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v1, "context.getString(L.stri\u2026_order_basic_info_header)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, LQj4;->item_container_order_details_header:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p3, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static/range {p2 .. p2}, Lco/bird/android/model/wire/WireSkuScannedItemsKt;->inboundScans(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getQuantity()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    const/4 v5, 0x0

    if-eqz p4, :cond_2

    if-eqz p3, :cond_2

    if-nez v2, :cond_2

    sget v2, Lnl4;->sku_order_start_adding_label:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_2
    if-eqz p4, :cond_3

    if-nez p3, :cond_3

    if-nez v2, :cond_3

    sget v2, Lnl4;->sku_order_start_scanning_label:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v5

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v8

    goto :goto_3

    :cond_4
    move-object v8, v5

    :goto_3
    const/16 v9, 0x9

    new-array v9, v9, [LG6;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getOriginFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireFleet;->getName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_5

    sget v13, LQj4;->item_header_value:I

    new-instance v12, Lur2;

    iget-object v11, v0, LlC5;->a:Landroid/content/Context;

    sget v14, Lnl4;->sku_order_origin_fleet_label:I

    invoke-virtual {v11, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    const-string v14, "context.getString(L.stri\u2026order_origin_fleet_label)"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v12, v11, v10}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v10, LG6;

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v10

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_5
    move-object v10, v5

    :goto_4
    aput-object v10, v9, v4

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireFleet;->getName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    sget v12, LQj4;->item_header_value:I

    new-instance v11, Lur2;

    iget-object v10, v0, LlC5;->a:Landroid/content/Context;

    sget v13, Lnl4;->sku_order_destination_fleet_label:I

    invoke-virtual {v10, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v13, "context.getString(L.stri\u2026_destination_fleet_label)"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v10, v6}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v6, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_6
    move-object v6, v5

    :goto_5
    aput-object v6, v9, v3

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireTransferOrder;->getOriginWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireWarehouse;->getName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_7

    sget v12, LQj4;->item_header_value:I

    new-instance v11, Lur2;

    iget-object v10, v0, LlC5;->a:Landroid/content/Context;

    sget v13, Lnl4;->sku_order_origin_warehouse_label:I

    invoke-virtual {v10, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v13, "context.getString(L.stri\u2026r_origin_warehouse_label)"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v10, v6}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v6, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_7
    move-object v6, v5

    :goto_6
    const/4 v10, 0x2

    aput-object v6, v9, v10

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireWarehouse;->getName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    sget v12, LQj4;->item_header_value:I

    new-instance v11, Lur2;

    iget-object v8, v0, LlC5;->a:Landroid/content/Context;

    sget v10, Lnl4;->sku_order_destination_warehouse_label:I

    invoke-virtual {v8, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v10, "context.getString(L.stri\u2026tination_warehouse_label)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v8, v6}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v6, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_8
    move-object v6, v5

    :goto_7
    const/4 v8, 0x3

    aput-object v6, v9, v8

    sget v6, LQj4;->item_header_value:I

    new-instance v11, Lur2;

    iget-object v8, v0, LlC5;->a:Landroid/content/Context;

    sget v10, Lnl4;->sku_order_commodity_type_label:I

    invoke-virtual {v8, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v10, "context.getString(L.stri\u2026der_commodity_type_label)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v10

    const-string v16, ""

    if-eqz v10, :cond_9

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodityType()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_9

    invoke-static {v10}, LmS5;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_a

    :cond_9
    move-object/from16 v10, v16

    :cond_a
    invoke-direct {v11, v8, v10}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v8, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v8

    move v12, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x4

    aput-object v8, v9, v10

    new-instance v11, Lur2;

    iget-object v8, v0, LlC5;->a:Landroid/content/Context;

    sget v10, Lnl4;->sku_order_commodity_label:I

    invoke-virtual {v8, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v10, "context.getString(L.stri\u2026ku_order_commodity_label)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v10

    if-eqz v10, :cond_b

    invoke-static {v10}, Lco/bird/android/model/wire/WireSkuOrderKt;->commodity(Lco/bird/android/model/wire/WireTransferOrderLineItem;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_c

    :cond_b
    move-object/from16 v10, v16

    :cond_c
    invoke-direct {v11, v8, v10}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v8, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v8

    move v12, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x5

    aput-object v8, v9, v10

    new-instance v11, Lur2;

    iget-object v8, v0, LlC5;->a:Landroid/content/Context;

    sget v10, Lnl4;->sku_order_condition_label:I

    invoke-virtual {v8, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v10, "context.getString(L.stri\u2026ku_order_condition_label)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v0, LlC5;->a:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v12

    if-eqz v12, :cond_d

    invoke-virtual {v12}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getUsedCondition()Z

    move-result v12

    if-ne v12, v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v4

    :goto_8
    if-eqz v3, :cond_e

    sget v3, Lnl4;->sku_order_condition_used:I

    goto :goto_9

    :cond_e
    sget v3, Lnl4;->sku_order_condition_new:I

    :goto_9
    invoke-virtual {v10, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "context.getString(if (wi\u2026ondition_new\n          })"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v8, v3}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v3, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v3

    move v12, v6

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    aput-object v3, v9, v4

    sget v12, LQj4;->item_header_spannable_status_cta:I

    iget-object v3, v0, LlC5;->a:Landroid/content/Context;

    sget v4, Lnl4;->sku_order_quantity_header:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getQuantity()I

    move-result v4

    iget-object v6, v0, LlC5;->a:Landroid/content/Context;

    invoke-static {v1, v4, v6}, LvB0;->g(IILandroid/content/Context;)Landroid/text/Spannable;

    move-result-object v1

    if-eqz v2, :cond_f

    iget-object v4, v0, LlC5;->a:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :cond_f
    new-instance v11, LHH1;

    const-string v2, "getString(L.string.sku_order_quantity_header)"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v5, v3, v1}, LHH1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/text/Spannable;)V

    new-instance v1, LG6;

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x7

    aput-object v1, v9, v2

    sget v12, LQj4;->item_vehicles_in_order:I

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuOrder;->getId()Ljava/lang/String;

    move-result-object v11

    new-instance v1, LG6;

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v2, 0x8

    aput-object v1, v9, v2

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    new-instance v8, LH6;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v8

    move-object v3, v7

    invoke-direct/range {v1 .. v6}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final e(Lco/bird/android/model/wire/WireSkuOrder;)LH6;
    .locals 14

    new-instance v6, LG6;

    new-instance v1, LVl0;

    iget-object v0, p0, LlC5;->a:Landroid/content/Context;

    sget v2, Lnl4;->sku_order_packing_info_header:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v0, "context.getString(L.stri\u2026rder_packing_info_header)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, LQj4;->item_container_order_details_header:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x2

    new-array v0, v0, [LG6;

    invoke-static {p1}, Lco/bird/android/model/wire/WireSkuOrderKt;->packingType(Lco/bird/android/model/wire/WireSkuOrder;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget v9, LQj4;->item_header_value:I

    new-instance v8, Lur2;

    iget-object v3, p0, LlC5;->a:Landroid/content/Context;

    sget v4, Lnl4;->sku_order_package_type_label:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "context.getString(L.stri\u2026order_package_type_label)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v3, v1}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v1, LG6;

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getPackagingQuantity()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget v9, LQj4;->item_header_value:I

    new-instance v8, Lur2;

    iget-object v1, p0, LlC5;->a:Landroid/content/Context;

    sget v2, Lnl4;->sku_order_package_quantity_label:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026r_package_quantity_label)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v8, v1, p1}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v2, LG6;

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    const/4 p1, 0x1

    aput-object v2, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->l(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance p1, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final f(Lco/bird/android/model/wire/WireSkuOrder;Z)LH6;
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LlC5;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, LvB0;->e(Lco/bird/android/model/wire/WireContainerOrder;Landroid/content/Context;ZZ)LH6;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final g(Lco/bird/android/model/wire/WireSkuOrder;)LH6;
    .locals 14

    new-instance v6, LG6;

    new-instance v1, LVl0;

    iget-object v0, p0, LlC5;->a:Landroid/content/Context;

    sget v2, Lnl4;->sku_order_purpose_header:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v0, "context.getString(L.stri\u2026sku_order_purpose_header)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, LQj4;->item_container_order_details_header:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LlC5;->a:Landroid/content/Context;

    invoke-static {p1, v1, v0}, LvB0;->k(Lco/bird/android/model/wire/WireTransferOrderLineItem;Landroid/content/Context;Lco/bird/android/model/wire/WireTransferOrder;)LG6;

    move-result-object p1

    move-object v1, p1

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->l(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance p1, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final h(Lco/bird/android/model/wire/WireSkuOrder;)LH6;
    .locals 14

    new-instance v6, LG6;

    new-instance v1, LVl0;

    iget-object v0, p0, LlC5;->a:Landroid/content/Context;

    sget v2, Lnl4;->sku_order_details_header:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v0, "context.getString(L.stri\u2026sku_order_details_header)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, LQj4;->item_container_order_details_header:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, LlC5;->a:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-static {p1, v1, v0, v2, v0}, LvB0;->generateStatusItem$default(Lco/bird/android/model/wire/WireContainerOrder;Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/Object;)LG6;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->l(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance p1, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final i(Lco/bird/android/model/wire/WireSkuOrder;)LH6;
    .locals 14

    new-instance v6, LG6;

    new-instance v1, LVl0;

    iget-object v0, p0, LlC5;->a:Landroid/content/Context;

    sget v2, Lnl4;->sku_order_status_header:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v0, "context.getString(L.stri\u2026.sku_order_status_header)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, LQj4;->item_container_order_details_header:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LHQ5;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v1

    iget-object v2, p0, LlC5;->a:Landroid/content/Context;

    invoke-static {v1, v2}, LDC5;->a(Lco/bird/android/model/constant/SkuOrderStatus;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    iget-object v1, p0, LlC5;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p1

    invoke-static {p1}, LDC5;->b(Lco/bird/android/model/constant/SkuOrderStatus;)I

    move-result p1

    invoke-static {v1, p1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LHQ5;-><init>(Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    new-array p1, p1, [LG6;

    sget v9, LQj4;->item_sku_order_status:I

    new-instance v1, LG6;

    const/4 v10, 0x0

    move-object v7, v1

    move-object v8, v0

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    aput-object v1, p1, v0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance p1, LH6;

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
