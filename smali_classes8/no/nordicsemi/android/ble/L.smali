.class public final synthetic Lno/nordicsemi/android/ble/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/BleManagerHandler$3;

.field public final synthetic c:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/L;->b:Lno/nordicsemi/android/ble/BleManagerHandler$3;

    iput-object p2, p0, Lno/nordicsemi/android/ble/L;->c:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/L;->b:Lno/nordicsemi/android/ble/BleManagerHandler$3;

    iget-object v1, p0, Lno/nordicsemi/android/ble/L;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->i(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method
