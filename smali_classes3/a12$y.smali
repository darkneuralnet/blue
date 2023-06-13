.class public final La12$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La12;->Q(Lf12;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function5<",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "+",
        "LPC5;",
        ">;",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "Lg12;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\n\u00a2\u0006\u0004\u0008\u000c\u0010\r"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "scanItem",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "skuOrder",
        "",
        "errorCode",
        "",
        "LPC5;",
        "scannedItems",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "<anonymous parameter 4>",
        "Lg12;",
        "a",
        "(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n288#2,2:397\n1#3:399\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$7\n*L\n131#1:397,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:La12;


# direct methods
.method public constructor <init>(La12;)V
    .locals 0

    iput-object p1, p0, La12$y;->g:La12;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LPC5;",
            ">;",
            "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
            ")",
            "Lg12;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "scanItem"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "skuOrder"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "errorCode"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "scannedItems"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "<anonymous parameter 4>"

    move-object/from16 v6, p5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LPC5;

    invoke-virtual {v8}, LPC5;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireSkuScanItem;->getItemId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v8}, LPC5;->g()Ljl5;

    move-result-object v8

    sget-object v9, Ljl5;->d:Ljl5;

    if-ne v8, v9, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_1

    goto :goto_2

    :cond_3
    move-object v7, v6

    :goto_2
    check-cast v7, LPC5;

    invoke-static {}, La12;->access$getFORCE_SCAN_DEMAND_SOURCES$cp()Ljava/util/Set;

    move-result-object v4

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v8

    goto :goto_3

    :cond_4
    move-object v8, v6

    :goto_3
    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireTransferOrder;->getReason()Lco/bird/android/model/constant/TransferOrderReason;

    move-result-object v4

    goto :goto_4

    :cond_5
    move-object v4, v6

    :goto_4
    sget-object v5, Lco/bird/android/model/constant/TransferOrderReason;->TERMINATION:Lco/bird/android/model/constant/TransferOrderReason;

    if-ne v4, v5, :cond_6

    invoke-static/range {p3 .. p3}, Lco/bird/android/model/wire/WireSkuScanItemKt;->toInventoryScanningError(Ljava/lang/String;)Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/InventoryScanningError;->ITEM_NOT_IN_SKU_ORDER:Lco/bird/android/model/constant/InventoryScanningError;

    if-ne v4, v5, :cond_6

    iget-object v3, v0, La12$y;->g:La12;

    invoke-virtual {v3}, Lf1;->k()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lg12;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7ff

    const/16 v17, 0x0

    invoke-static/range {v4 .. v17}, Lg12;->copy$default(Lg12;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lg12;

    move-result-object v3

    new-instance v4, LSw1;

    invoke-direct {v4, v1, v2}, LSw1;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;)V

    invoke-virtual {v3, v4}, Lg12;->y(LSw1;)V

    goto :goto_5

    :cond_6
    invoke-static/range {p3 .. p3}, Lco/bird/android/model/wire/WireSkuScanItemKt;->toInventoryScanningError(Ljava/lang/String;)Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v1

    sget-object v4, Lco/bird/android/model/constant/InventoryScanningError;->INCORRECT_FLEET:Lco/bird/android/model/constant/InventoryScanningError;

    if-ne v1, v4, :cond_8

    if-eqz v7, :cond_8

    iget-object v1, v0, La12$y;->g:La12;

    invoke-virtual {v1}, Lf1;->k()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lg12;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7ff

    const/16 v21, 0x0

    invoke-static/range {v8 .. v21}, Lg12;->copy$default(Lg12;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lg12;

    move-result-object v3

    invoke-virtual {v7}, LPC5;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const-string v1, ""

    :cond_7
    invoke-virtual {v3, v1}, Lg12;->w(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    iget-object v1, v0, La12$y;->g:La12;

    invoke-virtual {v1}, Lf1;->k()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lg12;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x7ff

    const/16 v20, 0x0

    invoke-static/range {v7 .. v20}, Lg12;->copy$default(Lg12;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lg12;

    move-result-object v1

    new-instance v4, Lck5;

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v6

    :cond_9
    invoke-direct {v4, v6, v3}, Lck5;-><init>(Lco/bird/android/model/constant/TransferOrderDemandSource;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lg12;->A(Lck5;)V

    move-object v3, v1

    :goto_5
    return-object v3
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuScanItem;

    check-cast p2, Lco/bird/android/model/wire/WireSkuOrder;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/util/List;

    check-cast p5, Lco/bird/api/response/TransferOrderVehicleViewResponse;

    invoke-virtual/range {p0 .. p5}, La12$y;->a(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;

    move-result-object p1

    return-object p1
.end method
