.class public final Lco/bird/android/model/itemlease/ItemLeaseExemption$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/itemlease/ItemLeaseExemption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/itemlease/ItemLeaseExemption;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    const-class v1, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    sget-object v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    sget-object v3, Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-direct {v0, v1, v2, v3, p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption$Creator;->createFromParcel(Landroid/os/Parcel;)Lco/bird/android/model/itemlease/ItemLeaseExemption;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lco/bird/android/model/itemlease/ItemLeaseExemption;
    .locals 0

    new-array p1, p1, [Lco/bird/android/model/itemlease/ItemLeaseExemption;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption$Creator;->newArray(I)[Lco/bird/android/model/itemlease/ItemLeaseExemption;

    move-result-object p1

    return-object p1
.end method
