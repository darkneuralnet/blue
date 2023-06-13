.class public abstract Lno/nordicsemi/android/ble/BleManagerHandler;
.super LQI4;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/ble/BleManagerHandler$g;,
        Lno/nordicsemi/android/ble/BleManagerHandler$f;,
        Lno/nordicsemi/android/ble/BleManagerHandler$d;,
        Lno/nordicsemi/android/ble/BleManagerHandler$e;
    }
.end annotation


# instance fields
.field public A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            "[B>;"
        }
    .end annotation
.end field

.field public B:Lno/nordicsemi/android/ble/n0;

.field public C:Lno/nordicsemi/android/ble/u0;

.field public D:Lno/nordicsemi/android/ble/v0;

.field public final E:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "LEj6;",
            ">;"
        }
    .end annotation
.end field

.field public F:Luy0;

.field public G:LEj6;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public H:Lno/nordicsemi/android/ble/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lno/nordicsemi/android/ble/a<",
            "*>;"
        }
    .end annotation
.end field

.field public final I:Landroid/content/BroadcastReceiver;

.field public final J:Landroid/content/BroadcastReceiver;

.field public final K:Landroid/bluetooth/BluetoothGattCallback;

.field public final a:Ljava/lang/Object;

.field public b:Landroid/bluetooth/BluetoothDevice;

.field public c:Landroid/bluetooth/BluetoothGatt;

.field public d:LxU;

.field public e:Landroid/os/Handler;

.field public final f:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/u0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/u0;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:J

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Z

.field public t:Z

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LQI4;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    const/4 v0, 0x0

    iput v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->l:I

    iput v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    const/16 v0, 0x17

    iput v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    const/4 v0, -0x1

    iput v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->y:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    new-instance v0, Lno/nordicsemi/android/ble/BleManagerHandler$a;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/BleManagerHandler$a;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->I:Landroid/content/BroadcastReceiver;

    new-instance v0, Lno/nordicsemi/android/ble/BleManagerHandler$b;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/BleManagerHandler$b;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->J:Landroid/content/BroadcastReceiver;

    new-instance v0, Lno/nordicsemi/android/ble/BleManagerHandler$3;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/BleManagerHandler$3;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->K:Landroid/bluetooth/BluetoothGattCallback;

    return-void
.end method

.method public static synthetic A()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->g3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic A0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->y3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    return-object p1
.end method

.method public static synthetic A3(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->d(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic A4(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->m(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic B()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->z4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic B0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->e4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic B1(Lno/nordicsemi/android/ble/BleManagerHandler;I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->v2(I)Z

    move-result p0

    return p0
.end method

.method public static synthetic B3(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-interface {p1, p0}, Loy0;->d(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic B4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Loy0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic C()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->W2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic C0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->H3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z4(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic C3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.disconnect()"

    return-object v0
.end method

.method public static synthetic C4()Ljava/lang/String;
    .locals 1

    const-string v0, "Connection lost"

    return-object v0
.end method

.method public static synthetic D()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->t3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic D0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->d3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic D1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c2()Z

    move-result p0

    return p0
.end method

.method public static synthetic D3()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected"

    return-object v0
.end method

.method public static synthetic D4(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->k(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic E(Lno/nordicsemi/android/ble/n0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->s3(Lno/nordicsemi/android/ble/n0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->N3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic E1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public static synthetic E3(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->m(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic E4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Loy0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic F(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->q3(Landroid/bluetooth/BluetoothDevice;Loy0;)V

    return-void
.end method

.method public static synthetic F0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic F1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    return p1
.end method

.method public static synthetic F3(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Loy0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic F4(I)Ljava/lang/String;
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

    invoke-static {p0}, LXA1;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->D3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic G0(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->B4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V

    return-void
.end method

.method public static synthetic G1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->T2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p0

    return p0
.end method

.method public static synthetic G3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.setCharacteristicNotification("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", true)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G4(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILyU;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, LyU;->i(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic H(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->w3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d4(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->P2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p0

    return p0
.end method

.method public static synthetic H3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Enabling indications for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H4(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V
    .locals 0

    invoke-interface {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$e;->a(LyU;)V

    return-void
.end method

.method public static synthetic I()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->n3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic I0(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->B3(Landroid/bluetooth/BluetoothDevice;Loy0;)V

    return-void
.end method

.method public static synthetic I1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I3()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.writeDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LxU;->f:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value=0x02-00)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic I4(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V
    .locals 0

    invoke-interface {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$f;->a(Loy0;)V

    return-void
.end method

.method public static synthetic J()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic J0(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->k3(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J1(Lno/nordicsemi/android/ble/BleManagerHandler;)LEj6;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->G:LEj6;

    return-object p0
.end method

.method public static synthetic J3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.setCharacteristicNotification("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", true)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J4(Landroid/bluetooth/BluetoothDevice;ILyU;)V
    .locals 0

    invoke-interface {p2, p0, p1}, LyU;->l(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic K(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c4(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lno/nordicsemi/android/ble/BleManagerHandler;->G4(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILyU;)V

    return-void
.end method

.method public static synthetic K1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static synthetic K3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Enabling notifications for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic K4(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x11

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lno/nordicsemi/android/ble/data/Data;->a(II)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->y:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, v0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->P4(Landroid/bluetooth/BluetoothGatt;I)V

    new-instance v0, LrW;

    invoke-direct {v0, p1, p2}, LrW;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_0
    return-void
.end method

.method public static synthetic L(Landroid/bluetooth/BluetoothDevice;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->J4(Landroid/bluetooth/BluetoothDevice;ILyU;)V

    return-void
.end method

.method public static synthetic L0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->e3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic L1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->O2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p0

    return p0
.end method

.method public static synthetic L3()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.writeDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LxU;->f:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value=0x01-00)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic M(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->p4(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic M0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->L3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic M1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic M3()Ljava/lang/String;
    .locals 1

    const-string v0, "Executing reliable write..."

    return-object v0
.end method

.method public static synthetic N()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->v3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic N0(Landroid/bluetooth/BluetoothDevice;ILyU;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->b3(Landroid/bluetooth/BluetoothDevice;ILyU;)V

    return-void
.end method

.method public static synthetic N1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    return p1
.end method

.method public static synthetic N3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.executeReliableWrite()"

    return-object v0
.end method

.method public static synthetic O(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->H4(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V

    return-void
.end method

.method public static synthetic O0(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->k4(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->v:I

    return p1
.end method

.method public static synthetic O3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reading characteristic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->F4(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->j4(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->w:I

    return p1
.end method

.method public static synthetic P3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.readCharacteristic("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->m3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Q0(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->c3(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static synthetic Q1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->x:I

    return p1
.end method

.method public static synthetic Q3(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reading descriptor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->C4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic R0(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->E4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V

    return-void
.end method

.method public static synthetic R1(Lno/nordicsemi/android/ble/BleManagerHandler;)Luy0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->F:Luy0;

    return-object p0
.end method

.method public static synthetic R3(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.readDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->A4(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic S0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->l3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic S1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    return p0
.end method

.method public static synthetic S3()Ljava/lang/String;
    .locals 1

    const-string v0, "Reading PHY..."

    return-object v0
.end method

.method public static synthetic T(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->i3(Landroid/bluetooth/BluetoothDevice;Loy0;)V

    return-void
.end method

.method public static synthetic T0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->S3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic T1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    return p1
.end method

.method public static synthetic T3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.readPhy()"

    return-object v0
.end method

.method public static synthetic U()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->U3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic U0(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->h3(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public static synthetic U3()Ljava/lang/String;
    .locals 1

    const-string v0, "Reading remote RSSI..."

    return-object v0
.end method

.method public static synthetic V(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->A3(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic V0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->x3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    return-object p1
.end method

.method public static synthetic V2()Ljava/lang/String;
    .locals 1

    const-string v0, "Cache refreshed"

    return-object v0
.end method

.method public static synthetic V3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.readRemoteRssi()"

    return-object v0
.end method

.method public static synthetic W()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->a4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    return-void
.end method

.method public static synthetic W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    return-object p0
.end method

.method public static synthetic W2()Ljava/lang/String;
    .locals 1

    const-string v0, "Refreshing failed"

    return-object v0
.end method

.method public static synthetic W3()Ljava/lang/String;
    .locals 1

    const-string v0, "Refreshing device cache..."

    return-object v0
.end method

.method public static synthetic X()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->g4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    return-void
.end method

.method public static synthetic X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    return-object p1
.end method

.method public static synthetic X2()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.close()"

    return-object v0
.end method

.method public static synthetic X3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.refresh() (hidden)"

    return-object v0
.end method

.method public static synthetic Y(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->j3(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    return p1
.end method

.method public static synthetic Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    return-object p0
.end method

.method public static synthetic Y2()Ljava/lang/String;
    .locals 1

    const-string v0, "device.createBond()"

    return-object v0
.end method

.method public static synthetic Y3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.refresh() method not found"

    return-object v0
.end method

.method public static synthetic Z(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->J3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->d5(Lno/nordicsemi/android/ble/BleManagerHandler$d;)V

    return-void
.end method

.method public static synthetic Z1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/n0;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    return-object p1
.end method

.method public static synthetic Z2()Ljava/lang/String;
    .locals 1

    const-string v0, "Service Changed characteristic found on a bonded device"

    return-object v0
.end method

.method public static synthetic Z3()Ljava/lang/String;
    .locals 1

    const-string v0, "Removing bond information..."

    return-object v0
.end method

.method public static synthetic a0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->h:Z

    return p0
.end method

.method public static synthetic a2(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->p:Z

    return p1
.end method

.method public static synthetic a3(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Battery Level received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "%"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a4()Ljava/lang/String;
    .locals 1

    const-string v0, "Device is not bonded"

    return-object v0
.end method

.method public static synthetic b0(Z)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->z3(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->h:Z

    return p1
.end method

.method public static synthetic b2(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->O4(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b3(Landroid/bluetooth/BluetoothDevice;ILyU;)V
    .locals 0

    invoke-interface {p2, p0, p1}, LyU;->l(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b4()Ljava/lang/String;
    .locals 1

    const-string v0, "device.removeBond() (hidden)"

    return-object v0
.end method

.method public static synthetic c0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->V2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->j:Z

    return p0
.end method

.method private synthetic c3(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x11

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lno/nordicsemi/android/ble/data/Data;->a(II)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-instance v0, LoW;

    invoke-direct {v0, p2}, LoW;-><init>(I)V

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iput p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->y:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, v0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->P4(Landroid/bluetooth/BluetoothGatt;I)V

    new-instance v0, LpW;

    invoke-direct {v0, p1, p2}, LpW;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    :cond_0
    return-void
.end method

.method public static synthetic c4(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Requesting connection priority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "..."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->K3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->j:Z

    return p1
.end method

.method public static synthetic d3()Ljava/lang/String;
    .locals 1

    const-string v0, "Aborting reliable write..."

    return-object v0
.end method

.method public static synthetic d4(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.requestConnectionPriority("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->r4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f2(Lno/nordicsemi/android/ble/u0;)V

    return-void
.end method

.method public static synthetic e3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.abortReliableWrite()"

    return-object v0
.end method

.method public static synthetic e4()Ljava/lang/String;
    .locals 1

    const-string v0, "Requesting new MTU..."

    return-object v0
.end method

.method public static synthetic f0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->I3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return-void
.end method

.method public static synthetic f3()Ljava/lang/String;
    .locals 1

    const-string v0, "Beginning reliable write..."

    return-object v0
.end method

.method public static synthetic f4(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.requestMtu("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->r3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g0(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->l4(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method

.method public static synthetic g3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.beginReliableWrite()"

    return-object v0
.end method

.method public static synthetic g4()Ljava/lang/String;
    .locals 1

    const-string v0, "Requesting preferred PHYs..."

    return-object v0
.end method

.method public static synthetic h(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->m4(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic h0(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Q3(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    return p0
.end method

.method public static synthetic h3(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic h4(III)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.setPreferredPhy("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->e(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LXH3;->e(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", coding option = "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LXH3;->d(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->G3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    return p1
.end method

.method public static synthetic i3(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-interface {p1, p0}, Loy0;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic i4(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Writing characteristic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result p0

    invoke-static {p0}, LXH3;->h(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->w4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j0(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->K4(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static synthetic j1(Lno/nordicsemi/android/ble/BleManagerHandler;)J
    .locals 2

    iget-wide v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->k:J

    return-wide v0
.end method

.method public static j2(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v1

    and-int/2addr p1, v1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, LxU;->f:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j3(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->e(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j4(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.writeCharacteristic("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->D4(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic k0(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->E3(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic k1(Lno/nordicsemi/android/ble/BleManagerHandler;J)J
    .locals 0

    iput-wide p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->k:J

    return-wide p1
.end method

.method public static synthetic k3(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->e(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k4(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Writing descriptor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->T3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->b4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    return p1
.end method

.method public static synthetic l3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)"

    return-object v0
.end method

.method public static synthetic l4(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.writeDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/o0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->o4(Lno/nordicsemi/android/ble/o0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic m0(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->f4(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    return-object p0
.end method

.method public static synthetic m3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.close()"

    return-object v0
.end method

.method public static synthetic m4(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic n(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/z0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->v4(Lno/nordicsemi/android/ble/z0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic n0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->X2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    return-void
.end method

.method public static synthetic n3()Ljava/lang/String;
    .locals 1

    const-string v0, "wait(200)"

    return-object v0
.end method

.method public static synthetic n4(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-interface {p1, p0}, Loy0;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic o(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->t4(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic o0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->C3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o1(Lno/nordicsemi/android/ble/BleManagerHandler;)LxU;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    return-object p0
.end method

.method public static synthetic o3()Ljava/lang/String;
    .locals 1

    const-string v0, "Connecting..."

    return-object v0
.end method

.method private synthetic o4(Lno/nordicsemi/android/ble/o0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic p(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->p3(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic p0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->o3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p1(Lno/nordicsemi/android/ble/BleManagerHandler;)I
    .locals 0

    iget p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->l:I

    return p0
.end method

.method public static synthetic p3(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private synthetic p4(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    if-ne v0, p1, :cond_0

    const/4 v0, -0x5

    invoke-virtual {p1, p2, v0}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic q()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->M3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q0(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->x4(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic q1(Lno/nordicsemi/android/ble/BleManagerHandler;)I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->l:I

    return v0
.end method

.method public static synthetic q3(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-interface {p1, p0}, Loy0;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic q4()Ljava/lang/String;
    .locals 1

    const-string v0, "Cache refreshed"

    return-object v0
.end method

.method public static synthetic r(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->O3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->X3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    return p0
.end method

.method public static synthetic r3()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.connect()"

    return-object v0
.end method

.method public static synthetic r4()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering Services..."

    return-object v0
.end method

.method public static synthetic s(III)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->h4(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->s4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    return p1
.end method

.method public static synthetic s3(Lno/nordicsemi/android/ble/n0;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/n0;->T()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "Connecting..."

    goto :goto_0

    :cond_0
    const-string p0, "Retrying..."

    :goto_0
    return-object p0
.end method

.method public static synthetic s4()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method public static synthetic t()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->u3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t0(Landroid/bluetooth/BluetoothDevice;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->n4(Landroid/bluetooth/BluetoothDevice;Loy0;)V

    return-void
.end method

.method public static synthetic t1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->n:Z

    return p1
.end method

.method public static synthetic t3()Ljava/lang/String;
    .locals 1

    const-string v0, "Ensuring bonding..."

    return-object v0
.end method

.method private synthetic t4(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    new-instance v0, LBV;

    invoke-direct {v0}, LBV;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    if-eqz v0, :cond_0

    const/4 v1, -0x3

    invoke-virtual {v0, p2, v1}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    invoke-interface {p2}, Ljava/util/Collection;->clear()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    iget-boolean p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c5()V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X4()V

    const/4 p2, 0x1

    iput-boolean p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->j:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->h:Z

    new-instance p2, LDV;

    invoke-direct {p2}, LDV;-><init>()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance p2, LEV;

    invoke-direct {p2}, LEV;-><init>()V

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_1
    return-void
.end method

.method public static synthetic u()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->f3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->q4()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->i:Z

    return p0
.end method

.method public static synthetic u3()Ljava/lang/String;
    .locals 1

    const-string v0, "Starting bonding..."

    return-object v0
.end method

.method public static synthetic u4(Lno/nordicsemi/android/ble/z0;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sleep("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/z0;->J()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->y4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V

    return-void
.end method

.method public static synthetic v0(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->F3(Landroid/bluetooth/BluetoothDevice;ILoy0;)V

    return-void
.end method

.method public static synthetic v1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->i:Z

    return p1
.end method

.method public static synthetic v3()Ljava/lang/String;
    .locals 1

    const-string v0, "Bond information present on client, skipping bonding"

    return-object v0
.end method

.method private synthetic v4(Lno/nordicsemi/android/ble/z0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return-void
.end method

.method public static synthetic w(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->a3(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->P3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w1(Lno/nordicsemi/android/ble/BleManagerHandler;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->M4(I)I

    move-result p0

    return p0
.end method

.method public static synthetic w3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.setCharacteristicNotification("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", false)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w4()Ljava/lang/String;
    .locals 1

    const-string v0, "Connection attempt timed out"

    return-object v0
.end method

.method public static synthetic x(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->i4(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lno/nordicsemi/android/ble/z0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->u4(Lno/nordicsemi/android/ble/z0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x1(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->r2(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic x3(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Disabling notifications and indications for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x4(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->m(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic y()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->W3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic y0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler;->V3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic y1(Lno/nordicsemi/android/ble/BleManagerHandler;)LIW;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic y3()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatt.writeDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LxU;->f:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value=0x00-00)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic y4(Landroid/bluetooth/BluetoothDevice;ILoy0;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Loy0;->f(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic z(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->I4(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V

    return-void
.end method

.method public static synthetic z0(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->R3(Landroid/bluetooth/BluetoothGattDescriptor;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    return-object p0
.end method

.method public static synthetic z3(Z)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    const-string p0, "Disconnecting..."

    goto :goto_0

    :cond_0
    const-string p0, "Cancelling connection..."

    :goto_0
    return-object p0
.end method

.method public static synthetic z4()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected"

    return-object v0
.end method


# virtual methods
.method public final A2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v2

    const/4 v3, 0x2

    and-int/2addr v2, v3

    if-nez v2, :cond_1

    return v1

    :cond_1
    new-instance v1, LHV;

    invoke-direct {v1, p1}, LHV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LIV;

    invoke-direct {v1, p1}, LIV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final B2(Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LlW;

    invoke-direct {v1, p1}, LlW;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LmW;

    invoke-direct {v1, p1}, LmW;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->readDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final C2()Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LtV;

    invoke-direct {v1}, LtV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LuV;

    invoke-direct {v1}, LuV;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-static {v0}, LBU;->a(Landroid/bluetooth/BluetoothGatt;)V

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D2()Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LOV;

    invoke-direct {v1}, LOV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LPV;

    invoke-direct {v1}, LPV;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->readRemoteRssi()Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final E2()Z
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, LSV;

    invoke-direct {v2}, LSV;-><init>()V

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v2, LTV;

    invoke-direct {v2}, LTV;-><init>()V

    const/4 v3, 0x3

    invoke-virtual {p0, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "refresh"

    new-array v4, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :catch_0
    move-exception v0

    const-string v2, "BleManager"

    const-string v3, "An exception occurred while refreshing device"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, LUV;

    invoke-direct {v0}, LUV;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {p0, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    return v1
.end method

.method public final F2()Z
    .locals 6

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, LbW;

    invoke-direct {v2}, LbW;-><init>()V

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    new-instance v1, LcW;

    invoke-direct {v1}, LcW;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return v4

    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "removeBond"

    new-array v5, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-instance v3, LdW;

    invoke-direct {v3}, LdW;-><init>()V

    const/4 v5, 0x3

    invoke-virtual {p0, v5, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iput-boolean v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->p:Z

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v2, :cond_2

    move v1, v4

    :cond_2
    return v1

    :catch_0
    move-exception v0

    const-string v2, "BleManager"

    const-string v3, "An exception occurred while removing bond"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method public final G2(I)Z
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq p1, v1, :cond_2

    if-eq p1, v2, :cond_1

    const-string v1, "BALANCED (30\u201350ms, 0, 20s)"

    const-string v3, "BALANCED"

    goto :goto_0

    :cond_1
    const-string v1, "LOW POWER (100\u2013125ms, 2, 20s)"

    const-string v3, "LOW POWER"

    goto :goto_0

    :cond_2
    const-string v1, "HIGH (11.25\u201315ms, 0, 20s)"

    const-string v3, "HIGH"

    :goto_0
    new-instance v4, LnV;

    invoke-direct {v4, v1}, LnV;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LoV;

    invoke-direct {v1, v3}, LoV;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->requestConnectionPriority(I)Z

    move-result p1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final H2(I)Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LJV;

    invoke-direct {v1}, LJV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LKV;

    invoke-direct {v1, p1}, LKV;-><init>(I)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final I2(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final J2(Z)Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, LxU;->g:Ljava/util/UUID;

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    sget-object v1, LxU;->h:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->x2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->u2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v1
.end method

.method public final K2(III)Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LeW;

    invoke-direct {v1}, LeW;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LfW;

    invoke-direct {v1, p1, p2, p3}, LfW;-><init>(III)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-static {v0, p1, p2, p3}, LCU;->a(Landroid/bluetooth/BluetoothGatt;III)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final L2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v2

    and-int/lit8 v2, v2, 0xc

    if-nez v2, :cond_1

    return v1

    :cond_1
    new-instance v1, LLV;

    invoke-direct {v1, p1}, LLV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LMV;

    invoke-direct {v1, p1}, LMV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-virtual {v0}, LxU;->D()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-interface {p2}, Lno/nordicsemi/android/ble/BleManagerHandler$g;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LxU;->H(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final M2(Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LVV;

    invoke-direct {v0, p1}, LVV;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v0, LWV;

    invoke-direct {v0, p1}, LWV;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;)V

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final M4(I)I
    .locals 1

    if-eqz p1, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x13

    if-eq p1, v0, :cond_1

    const/16 v0, 0x16

    if-eq p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1

    :cond_2
    const/16 p1, 0xa

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final N2(Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized N4(Z)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    :try_start_0
    iget-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    :cond_1
    iget-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x0

    :try_start_2
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/v0;->M()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/v0;->L()Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    invoke-virtual {v3, p0}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    invoke-virtual {v3, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    :cond_4
    move-object v3, v2

    :goto_1
    if-nez v3, :cond_6

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lno/nordicsemi/android/ble/u0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catch_0
    :cond_5
    move-object v3, v2

    :cond_6
    :goto_2
    if-nez v3, :cond_9

    :try_start_3
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    if-eqz v3, :cond_8

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->n:Z

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y4()V

    if-eqz p1, :cond_7

    new-instance v3, LKU;

    invoke-direct {v3, p1}, LKU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v3, LLU;

    invoke-direct {v3, p1}, LLU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    :cond_7
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/n0;->P()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v3, v4}, Lno/nordicsemi/android/ble/A0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_8
    :try_start_4
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Deque;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lno/nordicsemi/android/ble/u0;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :catch_1
    :try_start_5
    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->a5()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_9
    :goto_3
    :try_start_6
    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    iput-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    instance-of v4, v3, Lno/nordicsemi/android/ble/a;

    const/4 v5, 0x2

    const/4 v6, 0x3

    if-eqz v4, :cond_11

    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/a;

    sget-object v7, Lno/nordicsemi/android/ble/BleManagerHandler$c;->a:[I

    iget-object v8, v3, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    if-eq v7, v6, :cond_d

    const/4 v8, 0x4

    if-eq v7, v8, :cond_c

    const/4 v8, 0x5

    if-eq v7, v8, :cond_b

    const/4 v8, 0x6

    if-eq v7, v8, :cond_a

    move v7, v0

    goto :goto_4

    :cond_a
    const/16 v7, 0x4c

    goto :goto_4

    :cond_b
    move v7, v5

    goto :goto_4

    :cond_c
    const/16 v7, 0x20

    goto :goto_4

    :cond_d
    const/16 v7, 0x10

    :goto_4
    iget-boolean v8, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz v8, :cond_f

    if-eqz p1, :cond_f

    iget-object v8, v4, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v8, :cond_e

    invoke-virtual {v8}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v8

    and-int/2addr v7, v8

    if-eqz v7, :cond_f

    :cond_e
    move v7, v1

    goto :goto_5

    :cond_f
    move v7, v0

    :goto_5
    if-eqz v7, :cond_12

    instance-of v8, v4, Lno/nordicsemi/android/ble/m0;

    if-eqz v8, :cond_10

    move-object v8, v4

    check-cast v8, Lno/nordicsemi/android/ble/m0;

    invoke-virtual {v8}, Lno/nordicsemi/android/ble/m0;->R()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-virtual {v8, p1}, Lno/nordicsemi/android/ble/A0;->C(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v8, p1}, Lno/nordicsemi/android/ble/A0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :cond_10
    :try_start_7
    iput-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/a;->L()Lno/nordicsemi/android/ble/u0;

    move-result-object v8

    if-eqz v8, :cond_12

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/A0;->C(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/a;->L()Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    iput-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    goto :goto_6

    :cond_11
    move v7, v0

    :cond_12
    :goto_6
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v8, Lno/nordicsemi/android/ble/u0$c;->c:Lno/nordicsemi/android/ble/u0$c;

    if-ne v4, v8, :cond_13

    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/n0;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/n0;->P()Landroid/bluetooth/BluetoothDevice;

    move-result-object v8

    invoke-virtual {v4, v8}, Lno/nordicsemi/android/ble/A0;->C(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_7

    :cond_13
    if-eqz p1, :cond_24

    invoke-virtual {v3, p1}, Lno/nordicsemi/android/ble/u0;->C(Landroid/bluetooth/BluetoothDevice;)V

    :goto_7
    sget-object v4, Lno/nordicsemi/android/ble/BleManagerHandler$c;->a:[I

    iget-object v8, v3, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v4, v4, v8

    if-eq v4, v1, :cond_1d

    if-eq v4, v5, :cond_1d

    const-wide/16 v8, 0xc8

    const/16 v5, 0x1a

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_d

    :pswitch_0
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/z0;

    new-instance v5, LPU;

    invoke-direct {v5, v4}, LPU;-><init>(Lno/nordicsemi/android/ble/z0;)V

    invoke-virtual {p0, v6, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v5, LQU;

    invoke-direct {v5, p0, v4, p1}, LQU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/z0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/z0;->J()J

    move-result-wide v6

    invoke-virtual {p0, v5, v6, v7}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    :goto_8
    move v7, v1

    goto/16 :goto_d

    :pswitch_1
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->E2()Z

    move-result v7

    if-eqz v7, :cond_20

    new-instance v4, LOU;

    invoke-direct {v4, p0, v3, p1}, LOU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v4, v8, v9}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    goto/16 :goto_d

    :pswitch_2
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->D2()Z

    move-result v7

    if-eqz v7, :cond_20

    new-instance v4, LNU;

    invoke-direct {v4, p0, v3, p1}, LNU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    const-wide/16 v5, 0x3e8

    invoke-virtual {p0, v4, v5, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    goto/16 :goto_d

    :pswitch_3
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/r0;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v5, :cond_14

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->C2()Z

    move-result v7

    goto/16 :goto_d

    :cond_14
    iget-boolean v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz v7, :cond_20

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/r0;->S(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_4
    :try_start_8
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/r0;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v5, :cond_15

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/r0;->O()I

    move-result v5

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/r0;->N()I

    move-result v6

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/r0;->M()I

    move-result v4

    invoke-virtual {p0, v5, v6, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->K2(III)Z

    move-result v7

    goto/16 :goto_d

    :cond_15
    iget-boolean v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz v7, :cond_20

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/r0;->S(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_5
    :try_start_9
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/o0;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v5, :cond_16

    move v5, v1

    goto :goto_9

    :cond_16
    move v5, v0

    :goto_9
    iput-boolean v5, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/o0;->K()I

    move-result v5

    invoke-virtual {p0, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->G2(I)Z

    move-result v7

    if-eqz v7, :cond_17

    new-instance v5, LMU;

    invoke-direct {v5, p0, v4, p1}, LMU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/o0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v5, v8, v9}, Lno/nordicsemi/android/ble/BleManagerHandler;->c(Ljava/lang/Runnable;J)V

    goto/16 :goto_d

    :cond_17
    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    goto/16 :goto_d

    :pswitch_6
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/q0;

    iget v5, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/q0;->L()I

    move-result v6

    if-eq v5, v6, :cond_18

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/q0;->L()I

    move-result v4

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->H2(I)Z

    move-result v7

    goto/16 :goto_d

    :cond_18
    iget-boolean v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz v7, :cond_20

    iget v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, p1, v0}, Lno/nordicsemi/android/ble/q0;->O(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_7
    :try_start_a
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->g2()Z

    move-result v7

    goto/16 :goto_d

    :pswitch_8
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->J2(Z)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_9
    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->J2(Z)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_a
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->z2()Z

    move-result v7

    goto/16 :goto_d

    :pswitch_b
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->t2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_c
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->u2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_d
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->w2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_e
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->x2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_f
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->p2()Z

    move-result v7

    goto/16 :goto_d

    :pswitch_10
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->y2()Z

    move-result v7

    goto/16 :goto_d

    :pswitch_11
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->q2()Z

    move-result v7

    if-eqz v7, :cond_20

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_12
    :try_start_b
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/w0;

    iget-object v5, v4, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    if-eqz v5, :cond_20

    iget-object v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->A:Ljava/util/Map;

    if-eqz v6, :cond_19

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    iget-object v5, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->A:Ljava/util/Map;

    iget-object v6, v4, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    iget v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v7}, Lno/nordicsemi/android/ble/w0;->J(I)[B

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_19
    iget-object v5, v4, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    iget v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v6}, Lno/nordicsemi/android/ble/w0;->J(I)[B

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    :goto_a
    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    goto/16 :goto_8

    :pswitch_13
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/w0;

    iget-object v5, v4, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v5, :cond_20

    iget-object v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->z:Ljava/util/Map;

    if-eqz v6, :cond_1a

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    iget-object v5, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->z:Ljava/util/Map;

    iget-object v6, v4, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v7}, Lno/nordicsemi/android/ble/w0;->J(I)[B

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_1a
    iget-object v5, v4, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v6}, Lno/nordicsemi/android/ble/w0;->J(I)[B

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    :goto_b
    invoke-virtual {v4, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    goto/16 :goto_8

    :pswitch_14
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/D0;

    iget-object v5, v3, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    if-eqz v5, :cond_1b

    iget v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v6}, Lno/nordicsemi/android/ble/D0;->N(I)[B

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    :cond_1b
    invoke-virtual {p0, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->M2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_15
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->B2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v7

    goto/16 :goto_d

    :pswitch_16
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/D0;

    iget-object v5, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v5, :cond_1c

    iget v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v6}, Lno/nordicsemi/android/ble/D0;->N(I)[B

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/D0;->O()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    :cond_1c
    invoke-virtual {p0, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->L2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto :goto_d

    :pswitch_17
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->A2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    goto :goto_d

    :pswitch_18
    check-cast v3, Lno/nordicsemi/android/ble/v0;

    iput-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_19
    :try_start_c
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->F2()Z

    move-result v7

    goto :goto_d

    :pswitch_1a
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->s2(Z)Z

    move-result v7

    goto :goto_d

    :pswitch_1b
    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->s2(Z)Z

    move-result v7

    goto :goto_d

    :pswitch_1c
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->v2(I)Z

    move-result v7

    goto :goto_d

    :pswitch_1d
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/n0;

    iput-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/n0;->P()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual {p0, v5, v4}, Lno/nordicsemi/android/ble/BleManagerHandler;->r2(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z

    move-result v7

    goto :goto_d

    :cond_1d
    move-object v4, v3

    check-cast v4, Lno/nordicsemi/android/ble/D0;

    iget-object v5, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v5, :cond_1e

    iget v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    invoke-virtual {v4, v6}, Lno/nordicsemi/android/ble/D0;->N(I)[B

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    iget-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->z:Ljava/util/Map;

    if-eqz v4, :cond_1e

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    iget-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->z:Ljava/util/Map;

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    iget-object v4, v3, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v5, v3, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v6, Lno/nordicsemi/android/ble/u0$c;->j:Lno/nordicsemi/android/ble/u0$c;

    if-ne v5, v6, :cond_1f

    move v5, v1

    goto :goto_c

    :cond_1f
    move v5, v0

    :goto_c
    invoke-virtual {p0, v4, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->I2(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result v7

    :cond_20
    :goto_d
    if-nez v7, :cond_23

    if-eqz p1, :cond_23

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-eqz v4, :cond_21

    const/4 v4, -0x3

    goto :goto_e

    :cond_21
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_22

    const/4 v4, -0x1

    goto :goto_e

    :cond_22
    const/16 v4, -0x64

    :goto_e
    invoke-virtual {v3, p1, v4}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->s:Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_23
    monitor-exit p0

    return-void

    :cond_24
    :try_start_d
    invoke-virtual {v3}, Lno/nordicsemi/android/ble/u0;->B()V

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final O2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, LxU;->h:Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final O4(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->h:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->j:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->i:Z

    const/16 v2, 0x17

    iput v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->u:I

    iput v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->x:I

    iput v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->w:I

    iput v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->v:I

    iput v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c2()Z

    const/4 v1, 0x0

    const/4 v2, 0x5

    if-nez v0, :cond_0

    new-instance v0, LNV;

    invoke-direct {v0}, LNV;-><init>()V

    invoke-virtual {p0, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    new-instance v0, LYV;

    invoke-direct {v0, p1}, LYV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v0, LjW;

    invoke-direct {v0, p1, p2}, LjW;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->p:Z

    if-eqz v0, :cond_3

    new-instance v0, LsW;

    invoke-direct {v0}, LsW;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {p0, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v2, Lno/nordicsemi/android/ble/u0$c;->g:Lno/nordicsemi/android/ble/u0$c;

    if-eq v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    :cond_2
    new-instance v0, LDU;

    invoke-direct {v0, p1}, LDU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v0, LEU;

    invoke-direct {v0, p1, p2}, LEU;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    if-eqz p2, :cond_5

    iget-object v0, p2, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v2, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    if-ne v0, v2, :cond_5

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    goto :goto_1

    :cond_3
    new-instance v0, LFU;

    invoke-direct {v0}, LFU;-><init>()V

    invoke-virtual {p0, v2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v0, LGU;

    invoke-direct {v0, p1}, LGU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x3

    :goto_0
    new-instance p2, LHU;

    invoke-direct {p2, p1, v0}, LHU;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    :cond_5
    :goto_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LEj6;

    invoke-virtual {p2}, LEj6;->e()V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    iput-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->G:LEj6;

    const/4 p1, -0x1

    iput p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->y:I

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->c5()V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X4()V

    return-void
.end method

.method public final P2(Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LxU;->f:Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public P4(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final Q2()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    return v0
.end method

.method public Q4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public R2(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public R4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public abstract S2(Landroid/bluetooth/BluetoothGatt;)Z
.end method

.method public S4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final T2(Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LxU;->j:Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public T4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final U2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LxU;->j:Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public U4(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public V4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public W4(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public X4()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public Y4()V
    .locals 0

    return-void
.end method

.method public final Z4(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V
    .locals 2

    new-instance v0, LrV;

    invoke-direct {v0, p3}, LrV;-><init>(I)V

    const/4 v1, 0x6

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v0, LCV;

    invoke-direct {v0, p1, p2, p3}, LCV;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a5()V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b5(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public c(Ljava/lang/Runnable;J)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final c2()Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    instance-of v1, v0, Lno/nordicsemi/android/ble/m0;

    if-eqz v1, :cond_0

    check-cast v0, Lno/nordicsemi/android/ble/m0;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/m0;->R()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/A0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract c5()V
.end method

.method public final d()V
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    const/4 v3, -0x7

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    if-eqz v2, :cond_2

    iget-object v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    if-eq v4, v2, :cond_2

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    :cond_2
    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    :cond_3
    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->v2(I)Z

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    :goto_0
    return-void
.end method

.method public d2()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-virtual {v0}, LxU;->B()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->J:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-virtual {v1}, LxU;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->E2()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LgW;

    invoke-direct {v1}, LgW;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    goto :goto_0

    :cond_0
    new-instance v1, LhW;

    invoke-direct {v1}, LhW;-><init>()V

    const/4 v3, 0x5

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :cond_1
    :goto_0
    new-instance v1, LiW;

    invoke-direct {v1}, LiW;-><init>()V

    const/4 v3, 0x3

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :try_start_3
    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Collection;->clear()V

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final d5(Lno/nordicsemi/android/ble/BleManagerHandler$d;)V
    .locals 0

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final e(Lno/nordicsemi/android/ble/u0;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Lno/nordicsemi/android/ble/u0;->n:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return-void
.end method

.method public final e2(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    new-instance v0, LnW;

    invoke-direct {v0}, LnW;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->createBond()Z

    move-result p1

    return p1
.end method

.method public final e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    iget-object v0, v0, LxU;->c:LyU;

    if-eqz v0, :cond_0

    new-instance v1, LIU;

    invoke-direct {v1, p1, v0}, LIU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$e;LyU;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final f(Lno/nordicsemi/android/ble/A0;)V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->H:Lno/nordicsemi/android/ble/a;

    iget-object p1, p1, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->c:Lno/nordicsemi/android/ble/u0$c;

    if-ne p1, v1, :cond_0

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->v2(I)Z

    return-void

    :cond_0
    sget-object v0, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    return-void

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return-void
.end method

.method public final f2(Lno/nordicsemi/android/ble/u0;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->D:Lno/nordicsemi/android/ble/v0;

    if-nez v0, :cond_1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->g:Ljava/util/Deque;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->f:Ljava/util/Deque;

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/v0;->H(Lno/nordicsemi/android/ble/u0;)V

    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p1, Lno/nordicsemi/android/ble/u0;->n:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->o:Z

    return-void
.end method

.method public final f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    iget-object v0, v0, LxU;->d:Loy0;

    if-eqz v0, :cond_0

    new-instance v1, LJU;

    invoke-direct {v1, p1, v0}, LJU;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$f;Loy0;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final g2()Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xc

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    sget-object v2, LxU;->i:Ljava/util/UUID;

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    sget-object v2, LxU;->j:Ljava/util/UUID;

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    new-instance v1, LaW;

    invoke-direct {v1}, LaW;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->w2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public g5()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->G:LEj6;

    if-nez v0, :cond_0

    new-instance v0, LEj6;

    invoke-direct {v0, p0}, LEj6;-><init>(LL80;)V

    new-instance v1, LqW;

    invoke-direct {v1, p0}, LqW;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V

    invoke-virtual {v0, v1}, LEj6;->h(LQS0;)LEj6;

    move-result-object v0

    iput-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->G:LEj6;

    :cond_0
    return-void
.end method

.method public h2()LQS0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LkW;

    invoke-direct {v0, p0}, LkW;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler;)V

    return-object v0
.end method

.method public i2()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final k2()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    return v0
.end method

.method public l2(Ljava/lang/Object;)LEj6;
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEj6;

    if-nez v0, :cond_0

    new-instance v0, LEj6;

    invoke-direct {v0, p0}, LEj6;-><init>(LL80;)V

    if-eqz p1, :cond_1

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->E:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_1

    invoke-virtual {v0}, LEj6;->e()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public m2(LxU;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    iput-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->e:Landroid/os/Handler;

    return-void
.end method

.method public n2(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Deque;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGatt;",
            ")",
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/u0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public o2()V
    .locals 0

    return-void
.end method

.method public final p2()Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    if-nez v2, :cond_1

    return v1

    :cond_1
    new-instance v1, LQV;

    invoke-direct {v1}, LQV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LRV;

    invoke-direct {v1}, LRV;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->abortReliableWrite()V

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final q2()Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    new-instance v1, LFV;

    invoke-direct {v1}, LFV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LGV;

    invoke-direct {v1}, LGV;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->beginReliableWrite()Z

    move-result v0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r2(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/n0;)Z
    .locals 11

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_8

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->d:LxU;

    invoke-virtual {v0}, LxU;->B()Landroid/content/Context;

    move-result-object v5

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x3

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    if-nez v0, :cond_1

    new-instance v0, LRU;

    invoke-direct {v0}, LRU;-><init>()V

    invoke-virtual {p0, v7, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v0, LUU;

    invoke-direct {v0}, LUU;-><init>()V

    invoke-virtual {p0, v7, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const-wide/16 v8, 0xc8

    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :cond_1
    :try_start_4
    iput-boolean v6, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->k:J

    iput v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    new-instance p2, LVU;

    invoke-direct {p2}, LVU;-><init>()V

    invoke-virtual {p0, v4, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance p2, LWU;

    invoke-direct {p2, p1}, LWU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance p2, LXU;

    invoke-direct {p2, p1}, LXU;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    new-instance p1, LYU;

    invoke-direct {p1}, LYU;-><init>()V

    invoke-virtual {p0, v7, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->connect()Z

    monitor-exit v1

    return v3

    :cond_2
    if-eqz p2, :cond_3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->I:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v8, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v2, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->J:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v8, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-direct {v2, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :catch_0
    :cond_3
    :goto_0
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez p2, :cond_4

    return v6

    :cond_4
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/n0;->X()Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->p:Z

    if-eqz v0, :cond_5

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    :cond_5
    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    new-instance v0, LZU;

    invoke-direct {v0, p2}, LZU;-><init>(Lno/nordicsemi/android/ble/n0;)V

    invoke-virtual {p0, v4, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iput v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    new-instance v0, LaV;

    invoke-direct {v0, p1}, LaV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v0, LbV;

    invoke-direct {v0, p1}, LbV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->k:J

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-le v0, v1, :cond_6

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/n0;->Q()I

    move-result v9

    new-instance p2, LcV;

    invoke-direct {p2, v9}, LcV;-><init>(I)V

    invoke-virtual {p0, v7, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/4 v6, 0x0

    iget-object v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->K:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v8, 0x2

    iget-object v10, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->e:Landroid/os/Handler;

    move-object v4, p1

    invoke-static/range {v4 .. v10}, LzU;->a(Landroid/bluetooth/BluetoothDevice;Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;IILandroid/os/Handler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    goto :goto_1

    :cond_6
    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/n0;->Q()I

    move-result v9

    new-instance p2, LSU;

    invoke-direct {p2, v9}, LSU;-><init>(I)V

    invoke-virtual {p0, v7, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/4 v6, 0x0

    iget-object v7, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->K:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v8, 0x2

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LAU;->a(Landroid/bluetooth/BluetoothDevice;Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;II)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    goto :goto_1

    :cond_7
    new-instance p2, LTU;

    invoke-direct {p2}, LTU;-><init>()V

    invoke-virtual {p0, v7, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->K:Landroid/bluetooth/BluetoothGattCallback;

    invoke-virtual {p1, v5, v6, p2, v4}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;I)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :cond_8
    :goto_2
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_9

    if-eqz p2, :cond_9

    invoke-virtual {p2, p1}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    if-eqz p2, :cond_b

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/A0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_4

    :cond_9
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    if-eqz p2, :cond_b

    if-eqz v0, :cond_a

    const/4 v0, -0x4

    goto :goto_3

    :cond_a
    const/16 v0, -0x64

    :goto_3
    invoke-virtual {p2, p1, v0}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_b
    :goto_4
    iput-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->B:Lno/nordicsemi/android/ble/n0;

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return v3
.end method

.method public final s2(Z)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x2

    if-eqz p1, :cond_1

    new-instance v2, LpV;

    invoke-direct {v2}, LpV;-><init>()V

    invoke-virtual {p0, v1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    goto :goto_0

    :cond_1
    new-instance v2, LqV;

    invoke-direct {v2}, LqV;-><init>()V

    invoke-virtual {p0, v1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    :goto_0
    const/4 v1, 0x1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_2

    new-instance p1, LsV;

    invoke-direct {p1}, LsV;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {p0, v2, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return v1

    :cond_2
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->e2(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz p1, :cond_3

    if-nez v0, :cond_3

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->h()Lno/nordicsemi/android/ble/x0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    move-result-object p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    iget-object v2, v0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iput-object v2, p1, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iget-object v2, v0, Lno/nordicsemi/android/ble/u0;->j:Lj72;

    iput-object v2, p1, Lno/nordicsemi/android/ble/u0;->j:Lj72;

    iget-object v2, v0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    iput-object v2, p1, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    iget-object v2, v0, Lno/nordicsemi/android/ble/u0;->l:LyT5;

    iput-object v2, p1, Lno/nordicsemi/android/ble/u0;->l:LyT5;

    iget-object v2, v0, Lno/nordicsemi/android/ble/u0;->m:LDj1;

    iput-object v2, p1, Lno/nordicsemi/android/ble/u0;->m:LDj1;

    const/4 v2, 0x0

    iput-object v2, v0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iput-object v2, v0, Lno/nordicsemi/android/ble/u0;->j:Lj72;

    iput-object v2, v0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    iput-object v2, v0, Lno/nordicsemi/android/ble/u0;->l:LyT5;

    iput-object v2, v0, Lno/nordicsemi/android/ble/u0;->m:LDj1;

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f2(Lno/nordicsemi/android/ble/u0;)V

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->E()Lno/nordicsemi/android/ble/x0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f2(Lno/nordicsemi/android/ble/u0;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return v1

    :cond_3
    return v0
.end method

.method public final t2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->u2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1
.end method

.method public final u2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x30

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->j2(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, LkV;

    invoke-direct {v3, p1}, LkV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v4, 0x3

    invoke-virtual {p0, v4, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v2, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    new-instance v0, LlV;

    invoke-direct {v0, p1}, LlV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance p1, LmV;

    invoke-direct {p1}, LmV;-><init>()V

    invoke-virtual {p0, v4, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->N2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final v2(I)Z
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->p:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->q:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->n:Z

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v2, :cond_2

    iget-boolean v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    const/4 v4, 0x3

    iput v4, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    new-instance v5, LdV;

    invoke-direct {v5, v3}, LdV;-><init>(Z)V

    const/4 v6, 0x2

    invoke-virtual {p0, v6, v5}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    if-eqz v3, :cond_0

    new-instance v6, LeV;

    invoke-direct {v6, v5}, LeV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v6, LfV;

    invoke-direct {v6, v5}, LfV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    :cond_0
    new-instance v6, LgV;

    invoke-direct {v6}, LgV;-><init>()V

    invoke-virtual {p0, v4, v6}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    if-eqz v3, :cond_1

    return v0

    :cond_1
    iput v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->r:I

    new-instance v1, LhV;

    invoke-direct {v1}, LhV;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    new-instance v1, LiV;

    invoke-direct {v1, v5}, LiV;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->e5(Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    new-instance v1, LjV;

    invoke-direct {v1, v5, p1}, LjV;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->f5(Lno/nordicsemi/android/ble/BleManagerHandler$f;)V

    :cond_2
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->C:Lno/nordicsemi/android/ble/u0;

    if-eqz p1, :cond_6

    iget-object v1, p1, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v3, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->b:Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_4

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lno/nordicsemi/android/ble/u0;->B()V

    goto :goto_2

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    :goto_1
    invoke-virtual {p1, v1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    :cond_6
    :goto_2
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->N4(Z)V

    return v0
.end method

.method public final w2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->j2(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v1, LyV;

    invoke-direct {v1, p1}, LyV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v3, 0x3

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v2, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    new-instance v0, LzV;

    invoke-direct {v0, p1}, LzV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance p1, LAV;

    invoke-direct {p1}, LAV;-><init>()V

    invoke-virtual {p0, v3, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->N2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final x2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->j2(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v1, LvV;

    invoke-direct {v1, p1}, LvV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 v3, 0x3

    invoke-virtual {p0, v3, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v2, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    new-instance v0, LwV;

    invoke-direct {v0, p1}, LwV;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance p1, LxV;

    invoke-direct {p1}, LxV;-><init>()V

    invoke-virtual {p0, v3, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->N2(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final y2()Z
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->t:Z

    if-nez v2, :cond_1

    return v1

    :cond_1
    new-instance v1, LXV;

    invoke-direct {v1}, LXV;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    new-instance v1, LZV;

    invoke-direct {v1}, LZV;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->L4(ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->executeReliableWrite()Z

    move-result v0

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final z2()Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->c:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler;->m:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, LxU;->g:Ljava/util/UUID;

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    sget-object v1, LxU;->h:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->A2(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    return v0

    :cond_2
    :goto_0
    return v1
.end method
