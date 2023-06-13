.class public final Lco/bird/android/model/persistence/UnidentifiedScanEntityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toHardCountEntity",
        "Lco/bird/android/model/persistence/HardCountEntity;",
        "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
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
.method public static final toHardCountEntity(Lco/bird/android/model/persistence/UnidentifiedScanEntity;)Lco/bird/android/model/persistence/HardCountEntity;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getId()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getHardCountId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getScanIdentifier()Ljava/lang/String;

    move-result-object v4

    new-instance p0, Lco/bird/android/model/persistence/HardCountEntity;

    const-string v5, "UNIDENTIFIABLE"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/persistence/HardCountEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/InventoryScanningError;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
