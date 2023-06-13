.class public final Lco/bird/android/model/itemlease/ItemLeaseMetadataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toItemLeaseMetadata",
        "Lco/bird/android/model/itemlease/ItemLeaseMetadata;",
        "Lco/bird/android/model/wire/WireLeaseMetadata;",
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
.method public static final toItemLeaseMetadata(Lco/bird/android/model/wire/WireLeaseMetadata;)Lco/bird/android/model/itemlease/ItemLeaseMetadata;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseMetadata;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseMetadata;->getHelmet()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseMetadata;->getPhysicalLockSticker()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toWire(Lco/bird/android/model/itemlease/ItemLeaseMetadata;)Lco/bird/android/model/wire/WireLeaseMetadata;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireLeaseMetadata;

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;->getHelmet()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseMetadata;->getPhysicalLockSticker()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/wire/WireLeaseMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
