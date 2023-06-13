.class public final Lco/bird/android/model/itemlease/ItemLeaseAssetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toItemLeaseAsset",
        "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
        "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;",
        "toWire",
        "model_release"
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
.method public static final toItemLeaseAsset(Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;)Lco/bird/android/model/itemlease/ItemLeaseAsset;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseAsset;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;->getLeaseId()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    if-nez v1, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;->getAssetId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v5, v3

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v6

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->Companion:Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose$Companion;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;->getPurpose()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose$Companion;->fromWire(Ljava/lang/String;)Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    move-result-object p0

    move-object v1, v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/itemlease/ItemLeaseAsset;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;)V

    return-object v0
.end method

.method public static final toWire(Lco/bird/android/model/itemlease/ItemLeaseAsset;)Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->getLeaseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->getAssetId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseAsset;->getPurpose()Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v0
.end method
