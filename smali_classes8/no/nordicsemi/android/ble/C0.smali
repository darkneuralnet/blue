.class public final Lno/nordicsemi/android/ble/C0;
.super Lno/nordicsemi/android/ble/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/a<",
        "LQS0;",
        ">;"
    }
.end annotation


# instance fields
.field public w:Z


# direct methods
.method public static synthetic O(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lno/nordicsemi/android/ble/C0;->T(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static synthetic T(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
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

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->W(Landroid/os/Handler;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->X(LQI4;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->W(Landroid/os/Handler;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic K(LQI4;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->X(LQI4;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public P(LyT5;)Lno/nordicsemi/android/ble/C0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public Q(LDj1;)Lno/nordicsemi/android/ble/C0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public R(Lj72;)Lno/nordicsemi/android/ble/C0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/C0;->w:Z

    return v0
.end method

.method public U([B)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public V(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/B0;->t:Ljava/lang/Object;

    check-cast v0, LQS0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/C0;->w:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Lno/nordicsemi/android/ble/C0;->w:Z

    new-instance v1, Lno/nordicsemi/android/ble/data/Data;

    invoke-direct {v1, p2}, Lno/nordicsemi/android/ble/data/Data;-><init>([B)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v2, Lsw6;

    invoke-direct {v2, v0, p1, v1}, Lsw6;-><init>(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    invoke-interface {p2, v2}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public W(Landroid/os/Handler;)Lno/nordicsemi/android/ble/C0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public X(LQI4;)Lno/nordicsemi/android/ble/C0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->K(LQI4;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->P(LyT5;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->Q(LDj1;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/C0;->R(Lj72;)Lno/nordicsemi/android/ble/C0;

    move-result-object p1

    return-object p1
.end method
