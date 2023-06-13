.class Lno/nordicsemi/android/ble/BleManagerHandler$3;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/ble/BleManagerHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lno/nordicsemi/android/ble/BleManagerHandler;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method

.method public static synthetic A(Landroid/bluetooth/BluetoothGatt;ZLyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->r1(Landroid/bluetooth/BluetoothGatt;ZLyU;)V

    return-void
.end method

.method private synthetic A0(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->x1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z

    return-void
.end method

.method public static synthetic B()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->W0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic B0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error (0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXA1;->b(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->q0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Error on connection state change"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic D(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->Q0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connected to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(III)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->L0(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0(Landroid/bluetooth/BluetoothGatt;LyU;)V
    .locals 0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-interface {p1, p0}, LyU;->b(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic F(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->r0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic F0(Landroid/bluetooth/BluetoothGatt;Loy0;)V
    .locals 0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-interface {p1, p0}, Loy0;->b(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic G(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->b1(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wait("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->R0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic H0()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering services..."

    return-object v0
.end method

.method public static synthetic I()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->m0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic I0()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method public static synthetic J(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->G0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic J0(ILandroid/bluetooth/BluetoothGatt;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->p1(Lno/nordicsemi/android/ble/BleManagerHandler;)I

    move-result v0

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->h1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/g0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/g0;-><init>()V

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/h0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/h0;-><init>()V

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_1
    return-void
.end method

.method public static synthetic K(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->Z0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error: (0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXA1;->b(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->T0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic L0(III)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection parameters updated (interval: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-double v1, p0

    const-wide/high16 v3, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, latency: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", timeout: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 p2, p2, 0xa

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "ms)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->n1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic M0(III)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-double v1, p0

    const-wide/high16 v3, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, latency: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", timeout: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 p2, p2, 0xa

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "ms)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->t0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(IIII)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection parameters update failed with status "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " (interval: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-double p0, p1

    const-wide/high16 v1, 0x3ff4000000000000L    # 1.25

    mul-double/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, latency: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", timeout: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 p3, p3, 0xa

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "ms)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Landroid/bluetooth/BluetoothGatt;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->E0(Landroid/bluetooth/BluetoothGatt;LyU;)V

    return-void
.end method

.method public static synthetic O0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Error on connection priority request"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic P()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->z0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic P0(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Read Response received from descr. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->K0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication required ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->g1(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Phone has lost bonding information"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic S(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->s0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S0(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data written to descr. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->c1(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic T0()Ljava/lang/String;
    .locals 1

    const-string v0, "Service Changed notifications enabled"

    return-object v0
.end method

.method public static synthetic U(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->p0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U0()Ljava/lang/String;
    .locals 1

    const-string v0, "Notifications and indications disabled"

    return-object v0
.end method

.method public static synthetic V(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->Y0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic V0()Ljava/lang/String;
    .locals 1

    const-string v0, "Notifications enabled"

    return-object v0
.end method

.method public static synthetic W()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->V0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic W0()Ljava/lang/String;
    .locals 1

    const-string v0, "Indications enabled"

    return-object v0
.end method

.method public static synthetic X()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->w0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication required ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(IIII)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->N0(IIII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Phone has lost bonding information"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic Z(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->x0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MTU changed to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothGatt;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->F0(Landroid/bluetooth/BluetoothGatt;Loy0;)V

    return-void
.end method

.method public static synthetic a0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->f1(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic a1(II)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PHY read (TX: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->f(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", RX: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->f(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lno/nordicsemi/android/ble/BleManagerHandler$3;ILandroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->J0(ILandroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public static synthetic b0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->C0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic b1(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PHY read failed with status "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(II)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->v0(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->p1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c1(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Error on PHY read"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->l1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->m1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d1(II)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PHY updated (TX: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->f(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", RX: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->f(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(II)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a1(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->D0(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e1(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PHY updated failed with status "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->k1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f0(Landroid/bluetooth/BluetoothGatt;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->t1(Landroid/bluetooth/BluetoothGatt;LyU;)V

    return-void
.end method

.method public static synthetic f1(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Error on PHY update"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->l0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->I0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g1(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Remote RSSI received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " dBm"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->X0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->j1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h1(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reading remote RSSI failed with status "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->y0(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public static synthetic i0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->k0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i1(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Error on RSSI read"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic j(III)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->M0(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->q1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j1()Ljava/lang/String;
    .locals 1

    const-string v0, "Reliable Write executed"

    return-object v0
.end method

.method public static synthetic k(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->i1(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic k0()Ljava/lang/String;
    .locals 1

    const-string v0, "Service Changed indication received"

    return-object v0
.end method

.method public static synthetic k1()Ljava/lang/String;
    .locals 1

    const-string v0, "Reliable Write aborted"

    return-object v0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->U0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l0()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering Services..."

    return-object v0
.end method

.method public static synthetic l1()Ljava/lang/String;
    .locals 1

    const-string v0, "Service changed, invalidating services"

    return-object v0
.end method

.method public static synthetic m(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->A0(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public static synthetic m0()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method public static synthetic m1()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering Services..."

    return-object v0
.end method

.method public static synthetic n(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->P0(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Notification received from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n1()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method public static synthetic o(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->S0(Landroid/bluetooth/BluetoothGattDescriptor;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Indication received from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o1()Ljava/lang/String;
    .locals 1

    const-string v0, "Services discovered"

    return-object v0
.end method

.method public static synthetic p(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->O0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic p0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Read Response received from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p1()Ljava/lang/String;
    .locals 1

    const-string v0, "Primary service found"

    return-object v0
.end method

.method public static synthetic q(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->u0(Landroid/bluetooth/BluetoothGatt;ILyU;)V

    return-void
.end method

.method public static synthetic q0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication required ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q1()Ljava/lang/String;
    .locals 1

    const-string v0, "Secondary service found"

    return-object v0
.end method

.method public static synthetic r()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->s1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Phone has lost bonding information"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic r1(Landroid/bluetooth/BluetoothGatt;ZLyU;)V
    .locals 0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-interface {p2, p0, p1}, LyU;->h(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic s(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->e1(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data written to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", value: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->c([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s1()Ljava/lang/String;
    .locals 1

    const-string v0, "Device is not supported"

    return-object v0
.end method

.method public static synthetic t(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->o0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication required ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t1(Landroid/bluetooth/BluetoothGatt;LyU;)V
    .locals 0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-interface {p1, p0}, LyU;->e(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic u(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->n0(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Landroid/bluetooth/BluetoothGatt;ILyU;)V
    .locals 1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    const-string v0, "Phone has lost bonding information"

    invoke-interface {p2, p0, v0, p1}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic v()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->o1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic v0(II)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Callback] Connection state changed with status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " and new state: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " ("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->g(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->B0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.close()"

    return-object v0
.end method

.method public static synthetic x()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->H0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x0(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wait("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->h1(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic y0(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->x1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z

    return-void
.end method

.method public static synthetic z(II)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$3;->d1(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0()Ljava/lang/String;
    .locals 1

    const-string v0, "autoConnect = false called failed; retrying with autoConnect = true"

    return-object v0
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 7

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->I1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    if-eqz v1, :cond_1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-gt p2, v0, :cond_0

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/d;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/d;-><init>()V

    invoke-static {p2, v4, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->c5()V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->X4()V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->m1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->clear()V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/e;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/e;-><init>()V

    invoke-static {p2, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/f;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/f;-><init>()V

    const/4 v1, 0x3

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_0
    return-void

    :cond_1
    sget-object v1, LxU;->f:Ljava/util/UUID;

    invoke-virtual {p2, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v6

    array-length v6, v6

    if-ne v6, v2, :cond_2

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v1

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    if-ne v1, v5, :cond_3

    :cond_2
    move v2, v5

    :cond_3
    if-eqz v2, :cond_4

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/g;

    invoke-direct {v2, p2, v0}, Lno/nordicsemi/android/ble/g;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {v1, v4, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v1, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->R4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/h;

    invoke-direct {v2, p2, v0}, Lno/nordicsemi/android/ble/h;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {v1, v4, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v1, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Q4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->J1(Lno/nordicsemi/android/ble/BleManagerHandler;)LEj6;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->J1(Lno/nordicsemi/android/ble/BleManagerHandler;)LEj6;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, LEj6;->f(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_5
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->M1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEj6;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v0}, LEj6;->d([B)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, LEj6;->f(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_6
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    instance-of v1, v1, Lno/nordicsemi/android/ble/C0;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    iget-object v1, v1, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-ne v1, p2, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object p2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/a;->N()Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/C0;

    invoke-virtual {p2, v0}, Lno/nordicsemi/android/ble/C0;->U([B)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Lno/nordicsemi/android/ble/C0;->V(Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/C0;->S()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/A0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/a;->M()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_7
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_8
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    if-nez p3, :cond_3

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/q;

    invoke-direct {v1, p2, v0}, Lno/nordicsemi/android/ble/q;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    const/4 v2, 0x4

    invoke-static {p3, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->S4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/s0;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/s0;

    invoke-virtual {p2, v0}, Lno/nordicsemi/android/ble/s0;->O([B)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Lno/nordicsemi/android/ble/s0;->P(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/s0;->L()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    goto :goto_1

    :cond_3
    const-string p2, "BleManager"

    const/4 v0, 0x5

    if-eq p3, v0, :cond_7

    const/16 v1, 0x8

    if-eq p3, v1, :cond_7

    const/16 v1, 0x89

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCharacteristicRead error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/s0;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v0, "Error on reading characteristic"

    invoke-static {p2, p1, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :cond_6
    :goto_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void

    :cond_7
    :goto_2
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/r;

    invoke-direct {v2, p3}, Lno/nordicsemi/android/ble/r;-><init>(I)V

    invoke-static {v1, v0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_8

    const-string v0, "Phone has lost bonding information"

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/s;

    invoke-direct {v0, p1, p3}, Lno/nordicsemi/android/ble/s;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_8
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    if-nez p3, :cond_2

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/a0;

    invoke-direct {v1, p2, v0}, Lno/nordicsemi/android/ble/a0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    const/4 v2, 0x4

    invoke-static {p3, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->T4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/D0;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/D0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, v0}, Lno/nordicsemi/android/ble/D0;->T(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p3

    if-nez p3, :cond_0

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p3

    instance-of p3, p3, LLv4;

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 p3, -0x6

    invoke-virtual {p2, p1, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/v0;->I()V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/D0;->P()Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_2
    const-string p2, "BleManager"

    const/4 v0, 0x5

    if-eq p3, v0, :cond_6

    const/16 v1, 0x8

    if-eq p3, v1, :cond_6

    const/16 v1, 0x89

    if-ne p3, v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCharacteristicWrite error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/D0;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p2

    instance-of p2, p2, LLv4;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/v0;->I()V

    :cond_4
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v0, "Error on writing characteristic"

    invoke-static {p2, p1, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :cond_5
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void

    :cond_6
    :goto_1
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/b0;

    invoke-direct {v2, p3}, Lno/nordicsemi/android/ble/b0;-><init>(I)V

    invoke-static {v1, v0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_7

    const-string v0, "Phone has lost bonding information"

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/c0;

    invoke-direct {v0, p1, p3}, Lno/nordicsemi/android/ble/c0;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_7
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 11

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/w;

    invoke-direct {v1, p2, p3}, Lno/nordicsemi/android/ble/w;-><init>(II)V

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/16 v0, 0xc

    const/4 v1, 0x4

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez p2, :cond_3

    const/4 v7, 0x2

    if-ne p3, v7, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->K1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "BleManager"

    const-string p3, "Device received notification after disconnection."

    invoke-static {p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/C;

    invoke-direct {p3}, Lno/nordicsemi/android/ble/C;-><init>()V

    invoke-static {p2, v2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/D;

    invoke-direct {p3, p1}, Lno/nordicsemi/android/ble/D;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p2, v1, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->i1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v3, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->k1(Lno/nordicsemi/android/ble/BleManagerHandler;J)J

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v7}, Lno/nordicsemi/android/ble/BleManagerHandler;->l1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/E;

    invoke-direct {p3, p1}, Lno/nordicsemi/android/ble/E;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/F;

    invoke-direct {p3, p1}, Lno/nordicsemi/android/ble/F;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->n1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p2

    if-nez p2, :cond_17

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    move v5, v6

    :goto_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;

    move-result-object p2

    invoke-virtual {p2, v5}, LxU;->E(Z)I

    move-result p2

    if-lez p2, :cond_2

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/G;

    invoke-direct {v0, p2}, Lno/nordicsemi/android/ble/G;-><init>(I)V

    invoke-static {p3, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_2
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->q1(Lno/nordicsemi/android/ble/BleManagerHandler;)I

    move-result p3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/H;

    invoke-direct {v1, p0, p3, p1}, Lno/nordicsemi/android/ble/H;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$3;ILandroid/bluetooth/BluetoothGatt;)V

    int-to-long p1, p2

    invoke-virtual {v0, v1, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    goto/16 :goto_7

    :cond_3
    if-nez p3, :cond_15

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->j1(Lno/nordicsemi/android/ble/BleManagerHandler;)J

    move-result-wide v9

    cmp-long p3, v9, v3

    if-lez p3, :cond_4

    move p3, v5

    goto :goto_1

    :cond_4
    move p3, v6

    :goto_1
    if-eqz p3, :cond_5

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->j1(Lno/nordicsemi/android/ble/BleManagerHandler;)J

    move-result-wide v3

    const-wide/16 v9, 0x4e20

    add-long/2addr v3, v9

    cmp-long v3, v7, v3

    if-lez v3, :cond_5

    move v3, v5

    goto :goto_2

    :cond_5
    move v3, v6

    :goto_2
    if-eqz p2, :cond_6

    iget-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v7, Lno/nordicsemi/android/ble/J;

    invoke-direct {v7, p2}, Lno/nordicsemi/android/ble/J;-><init>(I)V

    const/4 v8, 0x5

    invoke-static {v4, v8, v7}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_6
    if-eqz p2, :cond_8

    if-eqz p3, :cond_8

    if-nez v3, :cond_8

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p3

    if-eqz p3, :cond_8

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p3

    invoke-virtual {p3}, Lno/nordicsemi/android/ble/n0;->L()Z

    move-result p3

    if-eqz p3, :cond_8

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/n0;->R()I

    move-result p2

    if-lez p2, :cond_7

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/K;

    invoke-direct {v0, p2}, Lno/nordicsemi/android/ble/K;-><init>(I)V

    invoke-static {p3, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_7
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/L;

    invoke-direct {v0, p0, p1}, Lno/nordicsemi/android/ble/L;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V

    int-to-long p1, p2

    invoke-virtual {p3, v0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    return-void

    :cond_8
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p3

    invoke-virtual {p3}, Lno/nordicsemi/android/ble/n0;->X()Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->r1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p3}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p3

    if-ne p3, v0, :cond_9

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/y;

    invoke-direct {p3}, Lno/nordicsemi/android/ble/y;-><init>()V

    invoke-static {p2, v2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/z;

    invoke-direct {p3, p0, p1}, Lno/nordicsemi/android/ble/z;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$3;Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_9
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->m1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->clear()V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->t1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->h1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p3

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->u1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v2

    iget-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    if-eqz v3, :cond_a

    const/16 v1, 0xa

    goto :goto_3

    :cond_a
    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->w1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    move-result v1

    :goto_3
    invoke-static {v4, v5, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->b2(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    const/4 v4, -0x1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    iget-object v1, v1, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v5, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    if-eq v1, v5, :cond_d

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    iget-object v1, v1, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v5, Lno/nordicsemi/android/ble/u0$c;->g:Lno/nordicsemi/android/ble/u0$c;

    if-eq v1, v5, :cond_d

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    if-nez p2, :cond_c

    move v7, v4

    goto :goto_4

    :cond_c
    move v7, p2

    :goto_4
    invoke-virtual {v1, v5, v7}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;

    :cond_d
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual {v1, v5, v4}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    :cond_e
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    if-eqz v1, :cond_12

    if-eqz v2, :cond_f

    const/4 v4, -0x2

    goto :goto_5

    :cond_f
    if-nez p2, :cond_10

    goto :goto_5

    :cond_10
    const/16 v1, 0x85

    if-ne p2, v1, :cond_11

    if-eqz v3, :cond_11

    const/4 v4, -0x5

    goto :goto_5

    :cond_11
    move v4, p2

    :goto_5
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v1, v2, v4}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/n0;)Lno/nordicsemi/android/ble/n0;

    :cond_12
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    if-eqz p3, :cond_13

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->r1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->x1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z

    goto :goto_6

    :cond_13
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->s1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :goto_6
    if-nez p3, :cond_14

    if-nez p2, :cond_16

    :cond_14
    return-void

    :cond_15
    if-eqz p2, :cond_16

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/A;

    invoke-direct {v0, p2}, Lno/nordicsemi/android/ble/A;-><init>(I)V

    const/4 v1, 0x6

    invoke-static {p3, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_16
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/B;

    invoke-direct {v0, p1, p2}, Lno/nordicsemi/android/ble/B;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p3, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_17
    :goto_7
    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    if-nez p5, :cond_1

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/i0;

    invoke-direct {v0, p2, p3, p4}, Lno/nordicsemi/android/ble/i0;-><init>(III)V

    const/4 v1, 0x4

    invoke-static {p5, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->O1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->P1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5, p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->Q1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p5, p1, p2, p3, p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->U4(Landroid/bluetooth/BluetoothGatt;III)V

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5}, Lno/nordicsemi/android/ble/BleManagerHandler;->R1(Lno/nordicsemi/android/ble/BleManagerHandler;)Luy0;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-interface {p5, v0, p2, p3, p4}, Luy0;->a(Landroid/bluetooth/BluetoothDevice;III)V

    :cond_0
    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p5

    instance-of p5, p5, Lno/nordicsemi/android/ble/o0;

    if-eqz p5, :cond_4

    iget-object p5, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p5}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p5

    check-cast p5, Lno/nordicsemi/android/ble/o0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p5, v0, p2, p3, p4}, Lno/nordicsemi/android/ble/o0;->M(Landroid/bluetooth/BluetoothDevice;III)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x3b

    const/4 v1, 0x0

    const/4 v2, 0x5

    const-string v3, ", timeout: "

    const-string v4, ", latency: "

    const-string v5, "BleManager"

    if-ne p5, v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onConnectionUpdated received status: Unacceptable connection interval, interval: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v3, Lno/nordicsemi/android/ble/j0;

    invoke-direct {v3, p2, p3, p4}, Lno/nordicsemi/android/ble/j0;-><init>(III)V

    invoke-static {v0, v2, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/o0;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p5}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onConnectionUpdated received status: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", interval: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v3, Lno/nordicsemi/android/ble/k0;

    invoke-direct {v3, p5, p2, p3, p4}, Lno/nordicsemi/android/ble/k0;-><init>(IIII)V

    invoke-static {v0, v2, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/o0;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, p5}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    :cond_3
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/l0;

    invoke-direct {p3, p1, p5}, Lno/nordicsemi/android/ble/l0;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->S1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->T1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_5
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    if-nez p3, :cond_1

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/M;

    invoke-direct {v1, p2, v0}, Lno/nordicsemi/android/ble/M;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;[B)V

    const/4 v2, 0x4

    invoke-static {p3, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->V4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/s0;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/s0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, v0}, Lno/nordicsemi/android/ble/s0;->P(Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/s0;->L()Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_1
    const-string p2, "BleManager"

    const/4 v0, 0x5

    if-eq p3, v0, :cond_5

    const/16 v1, 0x8

    if-eq p3, v1, :cond_5

    const/16 v1, 0x89

    if-ne p3, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDescriptorRead error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/s0;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_3
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v0, "Error on reading descriptor"

    invoke-static {p2, p1, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void

    :cond_5
    :goto_1
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/N;

    invoke-direct {v2, p3}, Lno/nordicsemi/android/ble/N;-><init>(I)V

    invoke-static {v1, v0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_6

    const-string v0, "Phone has lost bonding information"

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/O;

    invoke-direct {v0, p1, p3}, Lno/nordicsemi/android/ble/O;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_6
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_8

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/i;

    invoke-direct {v2, p2, v0}, Lno/nordicsemi/android/ble/i;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;[B)V

    const/4 v3, 0x4

    invoke-static {p3, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->G1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/j;

    invoke-direct {p3}, Lno/nordicsemi/android/ble/j;-><init>()V

    invoke-static {p2, v3, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    goto :goto_1

    :cond_0
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->H1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p3

    if-eqz p3, :cond_4

    if-eqz v0, :cond_5

    array-length p3, v0

    const/4 v2, 0x2

    if-ne p3, v2, :cond_5

    aget-byte p3, v0, v1

    if-nez p3, :cond_5

    const/4 p3, 0x0

    aget-byte p3, v0, p3

    if-eqz p3, :cond_3

    if-eq p3, v1, :cond_2

    if-eq p3, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/n;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/n;-><init>()V

    invoke-static {p3, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/l;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/l;-><init>()V

    invoke-static {p3, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    goto :goto_0

    :cond_3
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/k;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/k;-><init>()V

    invoke-static {p3, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :goto_0
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    goto :goto_1

    :cond_4
    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    :cond_5
    :goto_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/D0;

    if-eqz p2, :cond_b

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/D0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, v0}, Lno/nordicsemi/android/ble/D0;->T(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p3

    if-nez p3, :cond_6

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p3

    instance-of p3, p3, LLv4;

    if-eqz p3, :cond_6

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 p3, -0x6

    invoke-virtual {p2, p1, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/v0;->I()V

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/D0;->P()Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_2

    :cond_8
    const-string p2, "BleManager"

    const/4 v0, 0x5

    if-eq p3, v0, :cond_c

    const/16 v2, 0x8

    if-eq p3, v2, :cond_c

    const/16 v2, 0x89

    if-ne p3, v2, :cond_9

    goto :goto_3

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDescriptorWrite error "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/D0;

    if-eqz p2, :cond_a

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p2

    instance-of p2, p2, LLv4;

    if-eqz p2, :cond_a

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/v0;->I()V

    :cond_a
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v0, "Error on writing descriptor"

    invoke-static {p2, p1, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :cond_b
    :goto_2
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void

    :cond_c
    :goto_3
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/o;

    invoke-direct {v2, p3}, Lno/nordicsemi/android/ble/o;-><init>(I)V

    invoke-static {v1, v0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_d

    const-string v0, "Phone has lost bonding information"

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/p;

    invoke-direct {v0, p1, p3}, Lno/nordicsemi/android/ble/p;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_d
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    if-nez p3, :cond_0

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/c;

    invoke-direct {v0, p2}, Lno/nordicsemi/android/ble/c;-><init>(I)V

    const/4 v1, 0x4

    invoke-static {p3, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->N1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p3, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->b5(Landroid/bluetooth/BluetoothGatt;I)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p3

    instance-of p3, p3, Lno/nordicsemi/android/ble/q0;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p3

    check-cast p3, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Lno/nordicsemi/android/ble/q0;->O(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onMtuChanged error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mtu: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "BleManager"

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v0, "Error on mtu request"

    invoke-static {p2, p1, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_3
    return-void
.end method

.method public onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 2

    if-nez p4, :cond_0

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/I;

    invoke-direct {v0, p2, p3}, Lno/nordicsemi/android/ble/I;-><init>(II)V

    const/4 v1, 0x4

    invoke-static {p4, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p4

    instance-of p4, p4, Lno/nordicsemi/android/ble/r0;

    if-eqz p4, :cond_2

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p4

    check-cast p4, Lno/nordicsemi/android/ble/r0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p4, v0, p2, p3}, Lno/nordicsemi/android/ble/r0;->T(Landroid/bluetooth/BluetoothDevice;II)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/U;

    invoke-direct {p3, p4}, Lno/nordicsemi/android/ble/U;-><init>(I)V

    const/4 v0, 0x5

    invoke-static {p2, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/r0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/f0;

    invoke-direct {p3, p1, p4}, Lno/nordicsemi/android/ble/f0;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 2

    if-nez p4, :cond_0

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/X;

    invoke-direct {v0, p2, p3}, Lno/nordicsemi/android/ble/X;-><init>(II)V

    const/4 v1, 0x4

    invoke-static {p4, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p4

    instance-of p4, p4, Lno/nordicsemi/android/ble/r0;

    if-eqz p4, :cond_2

    iget-object p4, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p4}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p4

    check-cast p4, Lno/nordicsemi/android/ble/r0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p4, v0, p2, p3}, Lno/nordicsemi/android/ble/r0;->T(Landroid/bluetooth/BluetoothDevice;II)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/Y;

    invoke-direct {p3, p4}, Lno/nordicsemi/android/ble/Y;-><init>(I)V

    const/4 v0, 0x5

    invoke-static {p2, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/r0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p3, Lno/nordicsemi/android/ble/Z;

    invoke-direct {p3, p1, p4}, Lno/nordicsemi/android/ble/Z;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p1

    instance-of p1, p1, Lno/nordicsemi/android/ble/r0;

    if-eqz p1, :cond_4

    :cond_3
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_4
    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    if-nez p3, :cond_0

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/b;

    invoke-direct {v0, p2}, Lno/nordicsemi/android/ble/b;-><init>(I)V

    const/4 v1, 0x4

    invoke-static {p3, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p3

    instance-of p3, p3, Lno/nordicsemi/android/ble/t0;

    if-eqz p3, :cond_2

    iget-object p3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p3

    check-cast p3, Lno/nordicsemi/android/ble/t0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Lno/nordicsemi/android/ble/t0;->N(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/m;

    invoke-direct {v0, p3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v1, 0x5

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    instance-of p2, p2, Lno/nordicsemi/android/ble/t0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/x;

    invoke-direct {v0, p1, p3}, Lno/nordicsemi/android/ble/x;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v0

    iget-object v0, v0, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->o:Lno/nordicsemi/android/ble/u0$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->F1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    if-nez p2, :cond_2

    if-eqz v0, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/d0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/d0;-><init>()V

    const/4 v1, 0x4

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/e0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/e0;-><init>()V

    const/4 v1, 0x5

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 v0, -0x4

    invoke-virtual {p2, p1, v0}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReliableWriteCompleted execute "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BleManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v1, "Error on Execute Reliable Write"

    invoke-static {v0, p1, v1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    :goto_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    return-void
.end method

.method public onServiceChanged(Landroid/bluetooth/BluetoothGatt;)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/t;

    invoke-direct {v1}, Lno/nordicsemi/android/ble/t;-><init>()V

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c5()V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X4()V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->m1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->b1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/u;

    invoke-direct {v1}, Lno/nordicsemi/android/ble/u;-><init>()V

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/v;

    invoke-direct {v1}, Lno/nordicsemi/android/ble/v;-><init>()V

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    if-nez p2, :cond_9

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/P;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/P;-><init>()V

    const/4 v2, 0x4

    invoke-static {p2, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->b1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->S2(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Lno/nordicsemi/android/ble/Q;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/Q;-><init>()V

    const/4 v3, 0x2

    invoke-static {p2, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->v1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->R2(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v4, Lno/nordicsemi/android/ble/S;

    invoke-direct {v4}, Lno/nordicsemi/android/ble/S;-><init>()V

    invoke-static {v2, v3, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_1
    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v3, Lno/nordicsemi/android/ble/T;

    invoke-direct {v3, p1, p2}, Lno/nordicsemi/android/ble/T;-><init>(Landroid/bluetooth/BluetoothGatt;Z)V

    invoke-static {v2, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->y1(Lno/nordicsemi/android/ble/BleManagerHandler;)LIW;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->n2(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Deque;

    move-result-object v2

    invoke-static {p2, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->z1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p2

    if-eqz p2, :cond_2

    move v1, v0

    :cond_2
    if-eqz v1, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->z1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/ble/u0;

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v2, v3}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    iput-boolean v0, v2, Lno/nordicsemi/android/ble/u0;->n:Z

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->z1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v2}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    invoke-static {p2, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    :cond_4
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-eq p2, v2, :cond_5

    const/16 v2, 0x1b

    if-eq p2, v2, :cond_5

    const/16 v2, 0x1c

    if-ne p2, v2, :cond_6

    :cond_5
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->v()Lno/nordicsemi/android/ble/D0;

    move-result-object v2

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {v2, v3}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object v2

    invoke-static {p2, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    :cond_6
    if-eqz v1, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;

    move-result-object p2

    invoke-virtual {p2}, LxU;->J()V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;

    move-result-object p2

    iget-object p2, p2, LxU;->c:LyU;

    if-eqz p2, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;

    move-result-object p2

    iget-object p2, p2, LxU;->c:LyU;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {p2, p1}, LyU;->j(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;

    move-result-object p1

    invoke-virtual {p1}, LxU;->y()V

    :cond_7
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->o2()V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    goto :goto_1

    :cond_8
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v1, Lno/nordicsemi/android/ble/V;

    invoke-direct {v1}, Lno/nordicsemi/android/ble/V;-><init>()V

    const/4 v3, 0x5

    invoke-static {p2, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->v1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, Lno/nordicsemi/android/ble/W;

    invoke-direct {v0, p1}, Lno/nordicsemi/android/ble/W;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->B1(Lno/nordicsemi/android/ble/BleManagerHandler;I)Z

    goto :goto_1

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onServicesDiscovered error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BleManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const-string v2, "Error on discovering services"

    invoke-static {v0, v1, v2, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 v0, -0x4

    invoke-virtual {p2, p1, v0}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/n0;)Lno/nordicsemi/android/ble/n0;

    :cond_a
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$3;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, -0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->B1(Lno/nordicsemi/android/ble/BleManagerHandler;I)Z

    :goto_1
    return-void
.end method
