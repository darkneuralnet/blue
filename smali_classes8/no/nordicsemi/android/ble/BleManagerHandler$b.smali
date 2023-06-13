.class public Lno/nordicsemi/android/ble/BleManagerHandler$b;
.super Landroid/content/BroadcastReceiver;
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

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static synthetic a(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->x()V

    return-void
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->u()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->w()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->o(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->n(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->t()V

    return-void
.end method

.method public static synthetic j(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->q(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic k()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-static {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$b;->z(Landroid/bluetooth/BluetoothDevice;LyU;)V

    return-void
.end method

.method public static synthetic n(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LXH3;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->f(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic p()Ljava/lang/String;
    .locals 1

    const-string v0, "Device bonded"

    return-object v0
.end method

.method public static synthetic q(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->n(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic r()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering services..."

    return-object v0
.end method

.method public static synthetic s()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method private synthetic t()V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->g1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LxW;

    invoke-direct {v2}, LxW;-><init>()V

    const/4 v3, 0x2

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LyW;

    invoke-direct {v2}, LyW;-><init>()V

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_0
    return-void
.end method

.method public static synthetic u()Ljava/lang/String;
    .locals 1

    const-string v0, "Bonding failed"

    return-object v0
.end method

.method public static synthetic v()Ljava/lang/String;
    .locals 1

    const-string v0, "Discovering services..."

    return-object v0
.end method

.method public static synthetic w()Ljava/lang/String;
    .locals 1

    const-string v0, "gatt.discoverServices()"

    return-object v0
.end method

.method private synthetic x()V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->g1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->d1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LvW;

    invoke-direct {v2}, LvW;-><init>()V

    const/4 v3, 0x2

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LwW;

    invoke-direct {v2}, LwW;-><init>()V

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_0
    return-void
.end method

.method public static synthetic y()Ljava/lang/String;
    .locals 1

    const-string v0, "Bond information removed"

    return-object v0
.end method

.method public static synthetic z(Landroid/bluetooth/BluetoothDevice;LyU;)V
    .locals 0

    invoke-interface {p1, p0}, LyU;->g(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    const-string v0, "android.bluetooth.device.extra.BOND_STATE"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "android.bluetooth.device.extra.PREVIOUS_BOND_STATE"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->K1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v1, :cond_8

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->K1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LuW;

    invoke-direct {v2, v0}, LuW;-><init>(I)V

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LGW;

    invoke-direct {v0}, LGW;-><init>()V

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LHW;

    invoke-direct {v0, p1}, LHW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LzW;

    invoke-direct {v0, p1}, LzW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$d;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    iget-object p2, p2, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v0, Lno/nordicsemi/android/ble/u0$c;->e:Lno/nordicsemi/android/ble/u0$c;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p2, LAW;

    invoke-direct {p2, p0}, LAW;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-ge p1, p2, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->e1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)V

    goto/16 :goto_0

    :cond_3
    return-void

    :pswitch_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LFW;

    invoke-direct {v0, p1}, LFW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LzW;

    invoke-direct {v0, p1}, LzW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$d;)V

    return-void

    :pswitch_2
    const/16 v0, 0xb

    if-ne p2, v0, :cond_5

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LBW;

    invoke-direct {v0, p1}, LBW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$e;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LzW;

    invoke-direct {v0, p1}, LzW;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z0(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/BleManagerHandler$d;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LCW;

    invoke-direct {v0}, LCW;-><init>()V

    const/4 v1, 0x5

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    iget-object p2, p2, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v0, Lno/nordicsemi/android/ble/u0$c;->e:Lno/nordicsemi/android/ble/u0$c;

    if-ne p2, v0, :cond_4

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    const/4 v0, -0x4

    invoke-virtual {p2, p1, v0}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;

    :cond_4
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->a1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->c1(Lno/nordicsemi/android/ble/BleManagerHandler;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance p2, LDW;

    invoke-direct {p2, p0}, LDW;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$b;)V

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_5
    const/16 v0, 0xc

    if-ne p2, v0, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->a2(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    iget-object p2, p2, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v0, Lno/nordicsemi/android/ble/u0$c;->g:Lno/nordicsemi/android/ble/u0$c;

    if-ne p2, v0, :cond_6

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v0, LEW;

    invoke-direct {v0}, LEW;-><init>()V

    invoke-static {p2, v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v3}, Lno/nordicsemi/android/ble/BleManagerHandler;->V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;

    :cond_6
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Q2()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    :cond_7
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$b;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->f1(Lno/nordicsemi/android/ble/BleManagerHandler;Z)V

    :cond_8
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
