.class public final Lno/nordicsemi/android/ble/o0;
.super Lno/nordicsemi/android/ble/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/y0<",
        "Luy0;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:I


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/o0;->N(Landroid/os/Handler;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/o0;->O(LQI4;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method

.method public I(LyT5;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public J(LDj1;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/o0;->s:I

    return v0
.end method

.method public L(Lj72;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public M(Landroid/bluetooth/BluetoothDevice;III)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast v0, Luy0;

    invoke-interface {v0, p1, p2, p3, p4}, Luy0;->a(Landroid/bluetooth/BluetoothDevice;III)V

    :cond_0
    return-void
.end method

.method public N(Landroid/os/Handler;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public O(LQI4;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/o0;->I(LyT5;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/o0;->J(LDj1;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/o0;->L(Lj72;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method
