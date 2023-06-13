.class public Lno/nordicsemi/android/ble/BleManagerHandler$a;
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

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static synthetic a(Lno/nordicsemi/android/ble/BleManagerHandler$a;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$a;->b(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic b(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/BleManagerHandler$a;->c(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(I)Ljava/lang/String;
    .locals 2

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string p1, "TURNING OFF"

    return-object p1

    :pswitch_1
    const-string p1, "ON"

    return-object p1

    :pswitch_2
    const-string p1, "TURNING ON"

    return-object p1

    :pswitch_3
    const-string p1, "OFF"

    return-object p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/16 v0, 0xa

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v1, "android.bluetooth.adapter.extra.PREVIOUS_STATE"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    new-instance v2, LtW;

    invoke-direct {v2, p0, p1}, LtW;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$a;I)V

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lno/nordicsemi/android/ble/BleManagerHandler;->W0(Lno/nordicsemi/android/ble/BleManagerHandler;ILno/nordicsemi/android/ble/BleManagerHandler$g;)V

    const/16 v1, 0xd

    if-eq p1, v0, :cond_0

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eq p2, v1, :cond_4

    if-eq p2, v0, :cond_4

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->m1(Lno/nordicsemi/android/ble/BleManagerHandler;)Ljava/util/Deque;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->A1(Lno/nordicsemi/android/ble/BleManagerHandler;Ljava/util/Deque;)Ljava/util/Deque;

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->K1(Lno/nordicsemi/android/ble/BleManagerHandler;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    const/16 v2, -0x64

    if-eqz v1, :cond_1

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    iget-object v1, v1, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    sget-object v3, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->U1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/u0;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->V1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/u0;)Lno/nordicsemi/android/ble/u0;

    :cond_1
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->W1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/a;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->X1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/a;)Lno/nordicsemi/android/ble/a;

    :cond_2
    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y1(Lno/nordicsemi/android/ble/BleManagerHandler;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Z1(Lno/nordicsemi/android/ble/BleManagerHandler;Lno/nordicsemi/android/ble/n0;)Lno/nordicsemi/android/ble/n0;

    :cond_3
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->a2(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y0(Lno/nordicsemi/android/ble/BleManagerHandler;Z)Z

    if-eqz p1, :cond_5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-static {v0, p1, p2}, Lno/nordicsemi/android/ble/BleManagerHandler;->b2(Lno/nordicsemi/android/ble/BleManagerHandler;Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$a;->a:Lno/nordicsemi/android/ble/BleManagerHandler;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->d2()V

    :cond_5
    :goto_0
    return-void
.end method
