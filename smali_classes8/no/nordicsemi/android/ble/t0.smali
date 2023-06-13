.class public final Lno/nordicsemi/android/ble/t0;
.super Lno/nordicsemi/android/ble/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/y0<",
        "Lcd5;",
        ">;"
    }
.end annotation


# direct methods
.method public static synthetic I(Lno/nordicsemi/android/ble/t0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/t0;->M(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private synthetic M(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast v0, Lcd5;

    invoke-interface {v0, p1, p2}, Lcd5;->a(Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v0, "Exception in Value callback"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/t0;->O(Landroid/os/Handler;)Lno/nordicsemi/android/ble/t0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/t0;->P(LQI4;)Lno/nordicsemi/android/ble/t0;

    move-result-object p1

    return-object p1
.end method

.method public J(LyT5;)Lno/nordicsemi/android/ble/t0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public K(LDj1;)Lno/nordicsemi/android/ble/t0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L(Lj72;)Lno/nordicsemi/android/ble/t0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public N(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LUr4;

    invoke-direct {v1, p0, p1, p2}, LUr4;-><init>(Lno/nordicsemi/android/ble/t0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public O(Landroid/os/Handler;)Lno/nordicsemi/android/ble/t0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public P(LQI4;)Lno/nordicsemi/android/ble/t0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/t0;->J(LyT5;)Lno/nordicsemi/android/ble/t0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/t0;->K(LDj1;)Lno/nordicsemi/android/ble/t0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/t0;->L(Lj72;)Lno/nordicsemi/android/ble/t0;

    move-result-object p1

    return-object p1
.end method
