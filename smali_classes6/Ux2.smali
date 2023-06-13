.class public LUx2;
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
    .locals 1

    iget-object v0, p0, LsW1;->a:LtW1;

    invoke-virtual {v0, p1, p2}, LtW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lye5;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
