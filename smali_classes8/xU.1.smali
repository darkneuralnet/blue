.class public abstract LxU;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxU$b;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/UUID;

.field public static final g:Ljava/util/UUID;

.field public static final h:Ljava/util/UUID;

.field public static final i:Ljava/util/UUID;

.field public static final j:Ljava/util/UUID;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LxU$b;

.field public c:LyU;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public d:Loy0;

.field public final e:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LxU;->f:Ljava/util/UUID;

    const-string v0, "0000180F-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LxU;->g:Ljava/util/UUID;

    const-string v0, "00002A19-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LxU;->h:Ljava/util/UUID;

    const-string v0, "00001801-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LxU;->i:Ljava/util/UUID;

    const-string v0, "00002A05-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LxU;->j:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, p1, v0}, LxU;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LxU$a;

    invoke-direct {v0, p0}, LxU$a;-><init>(LxU;)V

    iput-object v0, p0, LxU;->e:Landroid/content/BroadcastReceiver;

    iput-object p1, p0, LxU;->a:Landroid/content/Context;

    invoke-virtual {p0}, LxU;->C()LxU$b;

    move-result-object v1

    iput-object v1, p0, LxU;->b:LxU$b;

    invoke-virtual {v1, p0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->m2(LxU;Landroid/os/Handler;)V

    new-instance p2, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.device.action.PAIRING_REQUEST"

    invoke-direct {p2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private synthetic F(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iget-object p1, p0, LxU;->b:LxU$b;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->g5()V

    return-void
.end method

.method private synthetic G(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const/4 p1, 0x4

    const-string v0, "Battery Level notifications enabled"

    invoke-virtual {p0, p1, v0}, LxU;->H(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic t(LxU;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, LxU;->F(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic u(LxU;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, LxU;->G(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget-object v0, p0, LxU;->b:LxU$b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->k2()I

    move-result v0

    return v0
.end method

.method public final B()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LxU;->a:Landroid/content/Context;

    return-object v0
.end method

.method public abstract C()LxU$b;
.end method

.method public D()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public E(Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, 0x640

    goto :goto_0

    :cond_0
    const/16 p1, 0x12c

    :goto_0
    return p1
.end method

.method public H(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public I(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    return-void
.end method

.method public J()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->x()Lno/nordicsemi/android/ble/s0;

    move-result-object v0

    iget-object v1, p0, LxU;->b:LxU$b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/s0;->R(LQI4;)Lno/nordicsemi/android/ble/s0;

    move-result-object v0

    iget-object v1, p0, LxU;->b:LxU$b;

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->h2()LQS0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/s0;->S(LQS0;)Lno/nordicsemi/android/ble/s0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void
.end method

.method public final K(Loy0;)V
    .locals 0

    iput-object p1, p0, LxU;->d:Loy0;

    return-void
.end method

.method public L(LyU;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, LxU;->c:LyU;

    return-void
.end method

.method public M(Landroid/bluetooth/BluetoothGattCharacteristic;)LEj6;
    .locals 1

    iget-object v0, p0, LxU;->b:LxU$b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->l2(Ljava/lang/Object;)LEj6;

    move-result-object p1

    return-object p1
.end method

.method public N()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public P(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/u0;->y(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    iget-object p2, p0, LxU;->b:LxU$b;

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public Q(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-static {p1, p2, p3}, Lno/nordicsemi/android/ble/u0;->z(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    iget-object p2, p0, LxU;->b:LxU$b;

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public v()V
    .locals 2

    :try_start_0
    iget-object v0, p0, LxU;->a:Landroid/content/Context;

    iget-object v1, p0, LxU;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, LxU;->b:LxU$b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    return-void
.end method

.method public final w(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/n0;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lno/nordicsemi/android/ble/u0;->g(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    invoke-virtual {p0}, LxU;->N()Z

    move-result v0

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/ble/n0;->Y(Z)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    iget-object v0, p0, LxU;->b:LxU$b;

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/ble/n0;->W(LQI4;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bluetooth device not specified"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x()Lno/nordicsemi/android/ble/p0;
    .locals 2

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->i()Lno/nordicsemi/android/ble/p0;

    move-result-object v0

    iget-object v1, p0, LxU;->b:LxU$b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/p0;->P(LQI4;)Lno/nordicsemi/android/ble/p0;

    move-result-object v0

    return-object v0
.end method

.method public y()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->t()Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    iget-object v1, p0, LxU;->b:LxU$b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    new-instance v1, LvU;

    invoke-direct {v1, p0}, LvU;-><init>(LxU;)V

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/D0;->K(LkG;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    new-instance v1, LwU;

    invoke-direct {v1, p0}, LwU;-><init>(LxU;)V

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/D0;->L(LyT5;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void
.end method

.method public z(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;
    .locals 1

    invoke-static {p1}, Lno/nordicsemi/android/ble/u0;->u(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    iget-object v0, p0, LxU;->b:LxU$b;

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method
