.class public final LQC5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Ljl5;",
        "scanState",
        "LPC5;",
        "a",
        "Lco/bird/android/model/wire/WireSuccessfulScannedItem;",
        "b",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireSkuScanItem;Ljl5;)LPC5;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPC5;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getItemId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getItemDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getItemDisplayCaption()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getBird()Lco/bird/android/model/wire/WireSkuVehicle;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getErrorCode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSkuScanItem;->getScanIdentifier()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v1, v0

    move-object v9, p1

    invoke-direct/range {v1 .. v11}, LPC5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireSkuVehicle;Ljava/lang/String;Ljava/lang/String;Ljl5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireSuccessfulScannedItem;Ljl5;)LPC5;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPC5;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getItemId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getItemDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getItemDisplayCaption()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getBird()Lco/bird/android/model/wire/WireSkuVehicle;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSuccessfulScannedItem;->getReceived()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p1, Ljl5;->d:Ljl5;

    goto :goto_0

    :cond_0
    sget-object p1, Ljl5;->b:Ljl5;

    :cond_1
    :goto_0
    move-object v9, p1

    const/16 v10, 0x60

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, LPC5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireSkuVehicle;Ljava/lang/String;Ljava/lang/String;Ljl5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic toSkuScanItem$default(Lco/bird/android/model/wire/WireSkuScanItem;Ljl5;ILjava/lang/Object;)LPC5;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LQC5;->a(Lco/bird/android/model/wire/WireSkuScanItem;Ljl5;)LPC5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toSkuScanItem$default(Lco/bird/android/model/wire/WireSuccessfulScannedItem;Ljl5;ILjava/lang/Object;)LPC5;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LQC5;->b(Lco/bird/android/model/wire/WireSuccessfulScannedItem;Ljl5;)LPC5;

    move-result-object p0

    return-object p0
.end method
