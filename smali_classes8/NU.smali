.class public final synthetic LNU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/BleManagerHandler;

.field public final synthetic c:Lno/nordicsemi/android/ble/u0;

.field public final synthetic d:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNU;->b:Lno/nordicsemi/android/ble/BleManagerHandler;

    iput-object p2, p0, LNU;->c:Lno/nordicsemi/android/ble/u0;

    iput-object p3, p0, LNU;->d:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LNU;->b:Lno/nordicsemi/android/ble/BleManagerHandler;

    iget-object v1, p0, LNU;->c:Lno/nordicsemi/android/ble/u0;

    iget-object v2, p0, LNU;->d:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->M(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
