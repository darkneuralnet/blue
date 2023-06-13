.class public Lve5$b;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lve5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lve5;


# direct methods
.method public constructor <init>(Lve5;)V
    .locals 0

    iput-object p1, p0, Lve5$b;->a:Lve5;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    const-string v0, "onCharacteristicChanged"

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, LOx2;->l(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2}, LsY2;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->i:LZt4;

    invoke-virtual {p1}, LZt4;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->i:LZt4;

    new-instance v0, Lci0;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getInstanceId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {v0, v1, v2, p2}, Lci0;-><init>(Ljava/util/UUID;Ljava/lang/Integer;[B)V

    invoke-virtual {p1, v0}, LZt4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string v0, "onCharacteristicRead"

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, LOx2;->j(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->g:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->g:Lve5$c;

    sget-object v1, LuU;->d:LuU;

    invoke-static {v0, p1, p2, p3, v1}, Lve5;->m(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->g:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    new-instance p3, Lt70;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lt70;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string v0, "onCharacteristicWrite"

    const/4 v1, 0x0

    invoke-static {v0, p1, p3, p2, v1}, LOx2;->j(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->k(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->h:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->h:Lve5$c;

    sget-object v1, LuU;->e:LuU;

    invoke-static {v0, p1, p2, p3, v1}, Lve5;->m(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->h:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    new-instance p3, Lt70;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lt70;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string v0, "onConnectionStateChange"

    invoke-static {v0, p1, p2, p3}, LOx2;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->b(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->b:LkX;

    invoke-virtual {v0, p1}, LkX;->b(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {p0, p3}, Lve5$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->c:Lv41;

    new-instance v1, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lv41;->d(Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->c:Lv41;

    new-instance v1, Lcom/polidea/rxandroidble2/exceptions/BleGattException;

    sget-object v2, LuU;->b:LuU;

    invoke-direct {v1, p1, p2, v2}, Lcom/polidea/rxandroidble2/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILuU;)V

    invoke-virtual {v0, v1}, Lv41;->e(Lcom/polidea/rxandroidble2/exceptions/BleGattException;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->e:Lma4;

    invoke-static {p3}, Lve5;->j(I)Lke5$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7

    const-string v0, "onConnectionUpdated"

    move-object v1, p1

    move v2, p5

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, LOx2;->m(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;IIII)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v1, v0, Lve5;->d:LsY2;

    move-object v2, p1

    move v6, p5

    invoke-virtual/range {v1 .. v6}, LsY2;->f(Landroid/bluetooth/BluetoothGatt;IIII)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->n:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->n:Lve5$c;

    sget-object v1, LuU;->m:LuU;

    invoke-static {v0, p1, p5, v1}, Lve5;->l(Lve5$c;Landroid/bluetooth/BluetoothGatt;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->n:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    new-instance p5, Lty0;

    invoke-direct {p5, p2, p3, p4}, Lty0;-><init>(III)V

    invoke-virtual {p1, p5}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 2

    const-string v0, "onDescriptorRead"

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, LOx2;->k(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->j:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->j:Lve5$c;

    sget-object v1, LuU;->h:LuU;

    invoke-static {v0, p1, p2, p3, v1}, Lve5;->n(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->j:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    new-instance p3, Lt70;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lt70;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 2

    const-string v0, "onDescriptorWrite"

    const/4 v1, 0x0

    invoke-static {v0, p1, p3, p2, v1}, LOx2;->k(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->k:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->k:Lve5$c;

    sget-object v1, LuU;->i:LuU;

    invoke-static {v0, p1, p2, p3, v1}, Lve5;->n(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->k:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    new-instance p3, Lt70;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lt70;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    const-string v0, "onMtuChanged"

    invoke-static {v0, p1, p3, p2}, LOx2;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->e(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->m:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->m:Lve5$c;

    sget-object v1, LuU;->l:LuU;

    invoke-static {v0, p1, p3, v1}, Lve5;->l(Lve5$c;Landroid/bluetooth/BluetoothGatt;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->m:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    const-string v0, "onReadRemoteRssi"

    invoke-static {v0, p1, p3, p2}, LOx2;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2, p3}, LsY2;->h(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->l:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->l:Lve5$c;

    sget-object v1, LuU;->k:LuU;

    invoke-static {v0, p1, p3, v1}, Lve5;->l(Lve5$c;Landroid/bluetooth/BluetoothGatt;ILuU;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lve5$b;->a:Lve5;

    iget-object p1, p1, Lve5;->l:Lve5$c;

    iget-object p1, p1, Lve5$c;->a:Lma4;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    const-string v0, "onReliableWriteCompleted"

    invoke-static {v0, p1, p2}, LOx2;->h(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2}, LsY2;->i(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 2

    const-string v0, "onServicesDiscovered"

    invoke-static {v0, p1, p2}, LOx2;->h(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->d:LsY2;

    invoke-virtual {v0, p1, p2}, LsY2;->j(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->f:Lve5$c;

    invoke-virtual {v0}, Lve5$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lve5$b;->a:Lve5;

    iget-object v0, v0, Lve5;->f:Lve5$c;

    sget-object v1, LuU;->c:LuU;

    invoke-static {v0, p1, p2, v1}, Lve5;->l(Lve5$c;Landroid/bluetooth/BluetoothGatt;ILuU;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lve5$b;->a:Lve5;

    iget-object p2, p2, Lve5;->f:Lve5$c;

    iget-object p2, p2, Lve5$c;->a:Lma4;

    new-instance v0, Lue5;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lue5;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
