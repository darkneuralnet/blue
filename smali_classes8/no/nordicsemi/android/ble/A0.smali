.class public abstract Lno/nordicsemi/android/ble/A0;
.super Lno/nordicsemi/android/ble/u0;
.source "SourceFile"


# instance fields
.field public r:Ljava/lang/Runnable;

.field public s:J


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/u0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-void
.end method

.method public static synthetic H(Lno/nordicsemi/android/ble/A0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/A0;->p(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private synthetic p(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    const/4 v0, -0x5

    invoke-virtual {p0, p1, v0}, Lno/nordicsemi/android/ble/A0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/u0;->a:LQI4;

    invoke-virtual {p1, p0}, LQI4;->f(Lno/nordicsemi/android/ble/A0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    iget-object v1, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, LL80;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    :cond_0
    invoke-super {p0, p1, p2}, Lno/nordicsemi/android/ble/u0;->A(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public B()V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    iget-object v1, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, LL80;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    :cond_0
    invoke-super {p0}, Lno/nordicsemi/android/ble/u0;->B()V

    return-void
.end method

.method public C(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    iget-wide v0, p0, Lno/nordicsemi/android/ble/A0;->s:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    new-instance v0, LO46;

    invoke-direct {v0, p0, p1}, LO46;-><init>(Lno/nordicsemi/android/ble/A0;Landroid/bluetooth/BluetoothDevice;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    iget-object v1, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    iget-wide v2, p0, Lno/nordicsemi/android/ble/A0;->s:J

    invoke-interface {v1, v0, v2, v3}, LL80;->c(Ljava/lang/Runnable;J)V

    :cond_0
    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->C(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public D(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    iget-object v1, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, LL80;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/A0;->r:Ljava/lang/Runnable;

    :cond_0
    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->D(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/A0;->J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/A0;->K(LQI4;)Lno/nordicsemi/android/ble/A0;

    move-result-object p1

    return-object p1
.end method

.method public final I()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/ble/exception/RequestFailedException;,
            Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;,
            Lno/nordicsemi/android/ble/exception/InvalidRequestException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->e()V

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iget-object v1, p0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    :try_start_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v2}, Landroid/os/ConditionVariable;->close()V

    new-instance v2, Lno/nordicsemi/android/ble/u0$b;

    invoke-direct {v2, p0}, Lno/nordicsemi/android/ble/u0$b;-><init>(Lno/nordicsemi/android/ble/u0;)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    move-result-object v3

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/u0;->k()V

    iget-object v3, p0, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    iget-wide v4, p0, Lno/nordicsemi/android/ble/A0;->s:J

    invoke-virtual {v3, v4, v5}, Landroid/os/ConditionVariable;->block(J)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/u0$b;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iget v3, v2, Lno/nordicsemi/android/ble/u0$b;->a:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    const/16 v4, -0x64

    if-eq v3, v4, :cond_1

    const v4, -0xf4240

    if-ne v3, v4, :cond_0

    new-instance v2, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    invoke-direct {v2, p0}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>(Lno/nordicsemi/android/ble/u0;)V

    throw v2

    :cond_0
    new-instance v3, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    iget v2, v2, Lno/nordicsemi/android/ble/u0$b;->a:I

    invoke-direct {v3, p0, v2}, Lno/nordicsemi/android/ble/exception/RequestFailedException;-><init>(Lno/nordicsemi/android/ble/u0;I)V

    throw v3

    :cond_1
    new-instance v2, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;-><init>()V

    throw v2

    :cond_2
    new-instance v2, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;

    invoke-direct {v2}, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;-><init>()V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    iput-object v0, p0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iput-object v1, p0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    return-void

    :cond_4
    :try_start_1
    new-instance v2, Ljava/lang/InterruptedException;

    invoke-direct {v2}, Ljava/lang/InterruptedException;-><init>()V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    iput-object v0, p0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    iput-object v1, p0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    throw v2
.end method

.method public J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public K(LQI4;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public final k()V
    .locals 0

    invoke-super {p0}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void
.end method
