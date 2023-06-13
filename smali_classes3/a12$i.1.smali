.class public final La12$i;
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
        "<anonymous parameter 3>",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "acceptanceOptions",
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
        "SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$13\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:La12;


# direct methods
.method public constructor <init>(La12;)V
    .locals 0

    iput-object p1, p0, La12$i;->g:La12;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;
    .locals 20
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

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    const-string v4, "scanItem"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "skuOrder"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "errorCode"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "<anonymous parameter 3>"

    move-object/from16 v6, p4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "acceptanceOptions"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p3 .. p3}, Lco/bird/android/model/wire/WireSkuScanItemKt;->toInventoryScanningError(Ljava/lang/String;)Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v4

    sget-object v6, Lco/bird/android/model/constant/InventoryScanningError;->ITEM_NOT_IN_SKU_ORDER:Lco/bird/android/model/constant/InventoryScanningError;

    if-eq v4, v6, :cond_1

    iget-object v1, v0, La12$i;->g:La12;

    invoke-virtual {v1}, Lf1;->k()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lg12;

    const/4 v7, 0x0

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

    const/16 v18, 0x7ff

    const/16 v19, 0x0

    invoke-static/range {v6 .. v19}, Lg12;->copy$default(Lg12;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lg12;

    move-result-object v1

    new-instance v3, Lck5;

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-direct {v3, v4, v2}, Lck5;-><init>(Lco/bird/android/model/constant/TransferOrderDemandSource;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lg12;->A(Lck5;)V

    goto :goto_1

    :cond_1
    iget-object v2, v0, La12$i;->g:La12;

    invoke-virtual {v2}, Lf1;->k()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

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

    move-result-object v2

    new-instance v4, Lam5;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5, v3}, Lam5;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V

    invoke-virtual {v2, v4}, Lg12;->B(Lam5;)V

    move-object v1, v2

    :goto_1
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuScanItem;

    check-cast p2, Lco/bird/android/model/wire/WireSkuOrder;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/util/List;

    check-cast p5, Lco/bird/api/response/TransferOrderVehicleViewResponse;

    invoke-virtual/range {p0 .. p5}, La12$i;->a(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;

    move-result-object p1

    return-object p1
.end method
