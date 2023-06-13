.class public final Lxi3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxi3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J,\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u001c\u0010\u000e\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u000c\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002J\u000c\u0010\u0011\u001a\u00020\u000c*\u00020\u0002H\u0002J&\u0010\u0012\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0014\u0010\u0013\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\u0014\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lxi3;",
        "",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "skuOrder",
        "",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        "scannedItems",
        "Lio/reactivex/F;",
        "LH6;",
        "b",
        "Landroid/content/Context;",
        "context",
        "",
        "statusLayoutId",
        "g",
        "",
        "h",
        "i",
        "d",
        "e",
        "f",
        "a",
        "Landroid/content/Context;",
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


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi3;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lxi3;->c(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Ljava/util/List;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$skuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [LH6;

    iget-object v1, p0, Lxi3;->a:Landroid/content/Context;

    sget v2, LQj4;->item_operator_allocation_status:I

    invoke-virtual {p0, p1, v1, v2}, Lxi3;->g(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;I)LH6;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lxi3;->a:Landroid/content/Context;

    invoke-virtual {p0, p1, v1, p2}, Lxi3;->d(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;Ljava/util/List;)LH6;

    move-result-object p2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    iget-object p2, p0, Lxi3;->a:Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lxi3;->e(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;)LH6;

    move-result-object p2

    const/4 v1, 0x2

    aput-object p2, v0, v1

    iget-object p2, p0, Lxi3;->a:Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lxi3;->f(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;)LH6;

    move-result-object p0

    const/4 p1, 0x3

    aput-object p0, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic convert$default(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxi3;->b(Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/SkuOrder;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "skuOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwi3;

    invoke-direct {v0, p0, p1, p2}, Lwi3;-><init>(Lxi3;Lco/bird/android/model/persistence/SkuOrder;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      lis\u2026n(context),\n      )\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;Ljava/util/List;)LH6;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/SkuOrder;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
            ">;)",
            "LH6;"
        }
    .end annotation

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v1

    new-instance v8, LG6;

    new-instance v3, LVl0;

    sget v2, Lnl4;->sku_order_basic_info_header:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v2, "context.getString(R.stri\u2026_order_basic_info_header)"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xc

    const/4 v15, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v15}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, LQj4;->item_container_order_details_header:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x6

    new-array v2, v2, [LG6;

    sget v3, LQj4;->item_header_value:I

    new-instance v10, Lur2;

    sget v4, Lnl4;->sku_order_origin_warehouse_label:I

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "context.getString(R.stri\u2026r_origin_warehouse_label)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getOriginWarehouse()Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v10, v4, v5}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v4, LG6;

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v4

    move v11, v3

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    aput-object v4, v2, v5

    new-instance v10, Lur2;

    sget v4, Lnl4;->sku_order_destination_warehouse_label:I

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "context.getString(R.stri\u2026tination_warehouse_label)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDestinationWarehouse()Lco/bird/android/model/persistence/nestedstructures/Warehouse;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Warehouse;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v4, v1}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v1, LG6;

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x1

    aput-object v1, v2, v4

    new-instance v10, Lur2;

    sget v1, Lnl4;->sku_order_commodity_type_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "context.getString(R.stri\u2026der_commodity_type_label)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getCommodityType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LmS5;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v10, v1, v4}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v1, LG6;

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x2

    aput-object v1, v2, v4

    new-instance v10, Lur2;

    sget v1, Lnl4;->sku_order_commodity_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "context.getString(R.stri\u2026ku_order_commodity_label)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getCommodities()Ljava/util/Map;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getCommodity()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getCommodity()Ljava/lang/String;

    move-result-object v4

    :cond_0
    invoke-direct {v10, v1, v4}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v1, LG6;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v1

    move v11, v3

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x3

    aput-object v1, v2, v4

    new-instance v10, Lur2;

    sget v1, Lnl4;->sku_order_condition_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "context.getString(R.stri\u2026ku_order_condition_label)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getUsedCondition()Z

    move-result v4

    if-eqz v4, :cond_1

    sget v4, Lnl4;->sku_order_condition_used:I

    goto :goto_0

    :cond_1
    sget v4, Lnl4;->sku_order_condition_new:I

    :goto_0
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "context.getString(\n     \u2026          }\n            )"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v1, v4}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v1, LG6;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v1

    move v11, v3

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x4

    aput-object v1, v2, v4

    new-instance v10, Lur2;

    sget v1, Lnl4;->sku_order_quantity_header:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "context.getString(R.stri\u2026ku_order_quantity_header)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v4, v5, :cond_3

    if-eqz p3, :cond_2

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getQuantity()I

    move-result v4

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_4

    invoke-static/range {p3 .. p3}, Lco/bird/android/model/wire/WireSkuScannedItemsKt;->inboundScans(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_1

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getQuantity()I

    move-result v4

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getQuantity()I

    move-result v5

    invoke-static {v4, v5, v0}, LvB0;->g(IILandroid/content/Context;)Landroid/text/Spannable;

    move-result-object v0

    invoke-direct {v10, v1, v0}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v0, LG6;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v0

    move v11, v3

    invoke-direct/range {v9 .. v14}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x5

    aput-object v0, v2, v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    new-instance v0, LH6;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v0

    move-object v4, v8

    invoke-direct/range {v2 .. v7}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final e(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;)LH6;
    .locals 18

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v1, v2, :cond_0

    new-instance v1, Lkotlin/Triple;

    sget v2, Lnl4;->container_order_pickup_header:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lnl4;->container_order_target_eta_pickup:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getTargetDeliveryDate()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/Triple;

    sget v2, Lnl4;->container_order_arrival_header:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lnl4;->container_order_target_eta_delivery:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getTargetDeliveryDate()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/DateTime;

    new-instance v10, LG6;

    new-instance v5, LVl0;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    const-string v2, "context.getString(headerTextRes)"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x8

    const/16 v17, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v17}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, LQj4;->item_container_order_details_header:I

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v13, LQj4;->item_header_value:I

    new-instance v12, Lur2;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "context.getString(targetTextRes)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/text/SpannableString;

    invoke-static {v1}, LvB0;->a(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v12, v0, v2}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v0, LG6;

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    new-instance v0, LH6;

    const/4 v7, 0x0

    move-object v4, v0

    move-object v6, v10

    invoke-direct/range {v4 .. v9}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final f(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;)LH6;
    .locals 15

    move-object/from16 v0, p2

    new-instance v7, LG6;

    new-instance v2, LVl0;

    sget v1, Lnl4;->sku_order_purpose_header:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v1, "context.getString(R.stri\u2026sku_order_purpose_header)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LVl0;-><init>(Ljava/lang/String;ZZLco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, LQj4;->item_container_order_details_header:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v10, LQj4;->item_header_value:I

    new-instance v9, Lur2;

    sget v1, Lnl4;->transfer_order_reason_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.stri\u2026nsfer_order_reason_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getReason()Lco/bird/android/model/constant/TransferOrderReason;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v0, v1}, Lur2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    new-instance v0, LG6;

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LvB0;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v6, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, v7

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final g(Lco/bird/android/model/persistence/SkuOrder;Landroid/content/Context;I)LH6;
    .locals 15

    move-object/from16 v0, p2

    new-instance v7, LG6;

    new-instance v2, LVl0;

    sget v1, Lnl4;->transfer_order_details_status_header:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v1, "context.getString(R.stri\u2026er_details_status_header)"

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

    const/4 v1, 0x1

    new-array v1, v1, [LG6;

    new-instance v2, LHQ5;

    invoke-virtual/range {p0 .. p1}, Lxi3;->i(Lco/bird/android/model/persistence/SkuOrder;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v3, "context.getString(localizedLabelForStatus())"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/SkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v3

    invoke-static {v3}, LDC5;->b(Lco/bird/android/model/constant/SkuOrderStatus;)I

    move-result v3

    invoke-static {v0, v3}, LfB0;->f(Landroid/content/Context;I)I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, LHQ5;-><init>(Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LG6;

    const/4 v11, 0x0

    move-object v8, v0

    move-object v9, v2

    move/from16 v10, p3

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v6, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, v7

    invoke-direct/range {v0 .. v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final h(Lco/bird/android/model/persistence/SkuOrder;)Z
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PICKUP:Lco/bird/android/model/constant/SkuOrderStatus;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final i(Lco/bird/android/model/persistence/SkuOrder;)I
    .locals 1

    invoke-virtual {p0, p1}, Lxi3;->h(Lco/bird/android/model/persistence/SkuOrder;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lnl4;->transfer_order_status_ready_for_checkin:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/SkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p1

    sget-object v0, Lxi3$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget p1, Lnl4;->transfer_order_status_checked_in:I

    goto :goto_0

    :pswitch_1
    sget p1, Lnl4;->completed:I

    goto :goto_0

    :pswitch_2
    sget p1, Lnl4;->received_with_osd:I

    goto :goto_0

    :pswitch_3
    sget p1, Lnl4;->received:I

    goto :goto_0

    :pswitch_4
    sget p1, Lnl4;->bird_action_unknown:I

    goto :goto_0

    :pswitch_5
    sget p1, Lnl4;->return_to_sender:I

    goto :goto_0

    :pswitch_6
    sget p1, Lnl4;->status_ready_for_processing:I

    goto :goto_0

    :pswitch_7
    sget p1, Lnl4;->ready_for_pickup:I

    goto :goto_0

    :pswitch_8
    sget p1, Lnl4;->status_processed_with_osd:I

    goto :goto_0

    :pswitch_9
    sget p1, Lnl4;->status_processed:I

    goto :goto_0

    :pswitch_a
    sget p1, Lnl4;->pending:I

    goto :goto_0

    :pswitch_b
    sget p1, Lnl4;->transfer_order_status_in_transit:I

    goto :goto_0

    :pswitch_c
    sget p1, Lnl4;->canceled:I

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
