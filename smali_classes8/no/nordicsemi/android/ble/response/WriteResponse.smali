.class public Lno/nordicsemi/android/ble/response/WriteResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSS0;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lno/nordicsemi/android/ble/response/WriteResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Landroid/bluetooth/BluetoothDevice;

.field public c:Lno/nordicsemi/android/ble/data/Data;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lno/nordicsemi/android/ble/response/WriteResponse$a;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/response/WriteResponse$a;-><init>()V

    sput-object v0, Lno/nordicsemi/android/ble/response/WriteResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iput-object v0, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->b:Landroid/bluetooth/BluetoothDevice;

    const-class v0, Lno/nordicsemi/android/ble/data/Data;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lno/nordicsemi/android/ble/data/Data;

    iput-object p1, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->c:Lno/nordicsemi/android/ble/data/Data;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->b:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->c:Lno/nordicsemi/android/ble/data/Data;

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/response/WriteResponse;->c:Lno/nordicsemi/android/ble/data/Data;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
