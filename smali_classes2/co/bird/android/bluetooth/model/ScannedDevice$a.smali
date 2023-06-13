.class public final Lco/bird/android/bluetooth/model/ScannedDevice$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/bluetooth/model/ScannedDevice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/bluetooth/model/ScannedDevice;",
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
.method public final a(Landroid/os/Parcel;)Lco/bird/android/bluetooth/model/ScannedDevice;
    .locals 8

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/bluetooth/model/ScannedDevice;

    const-class v1, Lco/bird/android/bluetooth/model/ScannedDevice;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lorg/joda/time/DateTime;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/bluetooth/model/ScannedDevice;-><init>(Lno/nordicsemi/android/support/v18/scanner/ScanResult;Ljava/lang/String;IIILorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public final b(I)[Lco/bird/android/bluetooth/model/ScannedDevice;
    .locals 0

    new-array p1, p1, [Lco/bird/android/bluetooth/model/ScannedDevice;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/bluetooth/model/ScannedDevice$a;->a(Landroid/os/Parcel;)Lco/bird/android/bluetooth/model/ScannedDevice;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/bluetooth/model/ScannedDevice$a;->b(I)[Lco/bird/android/bluetooth/model/ScannedDevice;

    move-result-object p1

    return-object p1
.end method
