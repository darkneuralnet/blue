.class public final synthetic Lno/nordicsemi/android/ble/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$g;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic b:[B


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/h;->a:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p2, p0, Lno/nordicsemi/android/ble/h;->b:[B

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/h;->a:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v1, p0, Lno/nordicsemi/android/ble/h;->b:[B

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->t(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
