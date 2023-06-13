.class public final Lco/bird/android/model/extra/VehicleDetailsExtra$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/extra/VehicleDetailsExtra;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/model/extra/VehicleDetailsExtra;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/extra/VehicleDetailsExtra;
    .locals 3

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/extra/VehicleDetailsExtra;

    const-class v1, Lco/bird/android/model/extra/VehicleDetailsExtra;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-direct {v0, v1, v2, p1}, Lco/bird/android/model/extra/VehicleDetailsExtra;-><init>(Lco/bird/android/model/wire/WireBird;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/extra/VehicleDetailsExtra$Creator;->createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/extra/VehicleDetailsExtra;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lco/bird/android/model/extra/VehicleDetailsExtra;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/extra/VehicleDetailsExtra;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/extra/VehicleDetailsExtra$Creator;->newArray(I)[Lco/bird/android/model/extra/VehicleDetailsExtra;

    move-result-object p1

    return-object p1
.end method
