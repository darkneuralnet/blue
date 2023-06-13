.class public LsY2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_0
    return-void
.end method

.method public b(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 0

    return-void
.end method

.method public g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method

.method public h(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method public i(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    :cond_0
    return-void
.end method

.method public j(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    :cond_0
    return-void
.end method

.method public k(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, LsY2;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method
