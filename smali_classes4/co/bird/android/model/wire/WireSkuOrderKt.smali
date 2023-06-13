.class public final Lco/bird/android/model/wire/WireSkuOrderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u000c\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0008\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0004*\u00020\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "commodity",
        "",
        "Lco/bird/android/model/wire/WireTransferOrderLineItem;",
        "completed",
        "",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "packingType",
        "readyForPickup",
        "received",
        "receivedInDestination",
        "vehicleType",
        "model-wire_release"
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
.method public static final commodity(Lco/bird/android/model/wire/WireTransferOrderLineItem;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodities()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toUpperCase()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodity()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static final completed(Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->COMPLETED:Lco/bird/android/model/constant/SkuOrderStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final packingType(Lco/bird/android/model/wire/WireSkuOrder;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getContainerOrder()Lco/bird/android/model/wire/WireContainerOrder;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireContainerOrder;->getPackageTypes()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getPackageType()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    const-string v1, "this as java.lang.String).toUpperCase()"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_1

    :cond_0
    const-string p0, ""

    :cond_1
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final readyForPickup(Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PICKUP:Lco/bird/android/model/constant/SkuOrderStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final received(Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PROCESSING:Lco/bird/android/model/constant/SkuOrderStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final receivedInDestination(Lco/bird/android/model/wire/WireSkuOrder;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED:Lco/bird/android/model/constant/SkuOrderStatus;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final vehicleType(Lco/bird/android/model/wire/WireTransferOrderLineItem;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getCommodityType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
