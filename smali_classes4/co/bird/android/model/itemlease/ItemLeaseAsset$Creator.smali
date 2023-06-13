.class public final Lco/bird/android/model/itemlease/ItemLeaseAsset$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/itemlease/ItemLeaseAsset;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/model/itemlease/ItemLeaseAsset;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/itemlease/ItemLeaseAsset;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseAsset;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lorg/joda/time/DateTime;

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/itemlease/ItemLeaseAsset;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseAsset$Creator;->createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/itemlease/ItemLeaseAsset;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lco/bird/android/model/itemlease/ItemLeaseAsset;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/itemlease/ItemLeaseAsset;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseAsset$Creator;->newArray(I)[Lco/bird/android/model/itemlease/ItemLeaseAsset;

    move-result-object p1

    return-object p1
.end method
