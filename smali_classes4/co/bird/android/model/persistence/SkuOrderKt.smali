.class public final Lco/bird/android/model/persistence/SkuOrderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "isInbound",
        "",
        "Lco/bird/android/model/persistence/SkuOrder;",
        "model-persistence_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isInbound(Lco/bird/android/model/persistence/SkuOrder;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/TransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
