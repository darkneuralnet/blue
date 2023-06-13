.class public final Lno/nordicsemi/android/ble/s0;
.super Lno/nordicsemi/android/ble/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/y0<",
        "LQS0;",
        ">;"
    }
.end annotation


# instance fields
.field public s:I

.field public t:Z


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/y0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    const/4 p1, 0x0

    iput p1, p0, Lno/nordicsemi/android/ble/s0;->s:I

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/s0;->t:Z

    return-void
.end method

.method public static synthetic I(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/s0;->N(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static synthetic N(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    :try_start_0
    invoke-interface {p0, p1, p2}, LQS0;->b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object p1, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string p2, "Exception in Value callback"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/s0;->Q(Landroid/os/Handler;)Lno/nordicsemi/android/ble/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/s0;->R(LQI4;)Lno/nordicsemi/android/ble/s0;

    move-result-object p1

    return-object p1
.end method

.method public J(LyT5;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public K(LDj1;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/s0;->t:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public M(Lj72;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public O([B)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public P(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    check-cast v0, LQS0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/s0;->t:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Lno/nordicsemi/android/ble/s0;->t:Z

    new-instance v1, Lno/nordicsemi/android/ble/data/Data;

    invoke-direct {v1, p2}, Lno/nordicsemi/android/ble/data/Data;-><init>([B)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v2, LRr4;

    invoke-direct {v2, v0, p1, v1}, LRr4;-><init>(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    invoke-interface {p2, v2}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public Q(Landroid/os/Handler;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public R(LQI4;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public S(LQS0;)Lno/nordicsemi/android/ble/s0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/y0;->H(Ljava/lang/Object;)Lno/nordicsemi/android/ble/y0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/s0;->J(LyT5;)Lno/nordicsemi/android/ble/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/s0;->K(LDj1;)Lno/nordicsemi/android/ble/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/s0;->M(Lj72;)Lno/nordicsemi/android/ble/s0;

    move-result-object p1

    return-object p1
.end method
