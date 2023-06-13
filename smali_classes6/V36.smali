.class public LV36;
.super LsW1;
.source "SourceFile"


# direct methods
.method public constructor <init>(LtW1;)V
    .locals 0

    invoke-direct {p0, p1}, LsW1;-><init>(LtW1;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;
    .locals 3

    iget-object v0, p0, LsW1;->a:LtW1;

    invoke-virtual {v0, p1, p2}, LtW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result p1

    invoke-direct {v1, v0, v2, p1, p2}, Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;-><init>(Ljava/lang/String;Ljava/util/UUID;II)V

    return-object v1
.end method
