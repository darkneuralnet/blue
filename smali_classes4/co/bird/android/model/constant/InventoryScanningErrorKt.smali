.class public final Lco/bird/android/model/constant/InventoryScanningErrorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "isDuplicateScan",
        "",
        "Lco/bird/android/model/constant/InventoryScanningError;",
        "isValidQRNotInDB",
        "isValidSerialNotInDB",
        "model-constant"
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
.method public static final isDuplicateScan(Lco/bird/android/model/constant/InventoryScanningError;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/InventoryScanningError;->Companion:Lco/bird/android/model/constant/InventoryScanningError$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/constant/InventoryScanningError$Companion;->getDUPLICATE_SCAN_ERRORS()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isValidQRNotInDB(Lco/bird/android/model/constant/InventoryScanningError;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/InventoryScanningError;->Companion:Lco/bird/android/model/constant/InventoryScanningError$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/constant/InventoryScanningError$Companion;->getVALID_QR_NOT_IN_DB_ERRORS()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isValidSerialNotInDB(Lco/bird/android/model/constant/InventoryScanningError;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/InventoryScanningError;->Companion:Lco/bird/android/model/constant/InventoryScanningError$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/constant/InventoryScanningError$Companion;->getVALID_SERIAL_NOT_IN_DB_ERRORS()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
