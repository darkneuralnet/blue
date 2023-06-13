.class public final Lco/bird/android/model/DeliveryReleaseLocationDetails$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/DeliveryReleaseLocationDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/model/DeliveryReleaseLocationDetails;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/DeliveryReleaseLocationDetails;
    .locals 11

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    const-class v1, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/configs/DeliveryConfig;

    sget-object v1, Lco/bird/android/model/Delivery;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/Delivery;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/model/constant/NestPurpose;->valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/NestPurpose;

    move-result-object v8

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1

    move v10, v5

    goto :goto_1

    :cond_1
    move v10, v6

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object p1

    move-object v1, v0

    move v5, v7

    move-object v6, v8

    move-object v7, v9

    move v8, v10

    move-object v9, p1

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/DeliveryReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/DeliveryReleaseLocationDetails$Creator;->createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/DeliveryReleaseLocationDetails;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lco/bird/android/model/DeliveryReleaseLocationDetails;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/DeliveryReleaseLocationDetails;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/DeliveryReleaseLocationDetails$Creator;->newArray(I)[Lco/bird/android/model/DeliveryReleaseLocationDetails;

    move-result-object p1

    return-object p1
.end method
