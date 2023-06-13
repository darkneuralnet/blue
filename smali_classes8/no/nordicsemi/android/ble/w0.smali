.class public final Lno/nordicsemi/android/ble/w0;
.super Lno/nordicsemi/android/ble/x0;
.source "SourceFile"


# instance fields
.field public final r:[B

.field public s:Z


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/w0;->L(Landroid/os/Handler;)Lno/nordicsemi/android/ble/w0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/w0;->M(LQI4;)Lno/nordicsemi/android/ble/w0;

    move-result-object p1

    return-object p1
.end method

.method public H(LyT5;)Lno/nordicsemi/android/ble/w0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public I(LDj1;)Lno/nordicsemi/android/ble/w0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public J(I)[B
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/w0;->s:Z

    if-eqz v0, :cond_0

    const/16 p1, 0x200

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x3

    :goto_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/w0;->r:[B

    array-length v1, v0

    if-ge v1, p1, :cond_1

    return-object v0

    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LS70;->a([BII)[B

    move-result-object p1

    return-object p1
.end method

.method public K(Lj72;)Lno/nordicsemi/android/ble/w0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L(Landroid/os/Handler;)Lno/nordicsemi/android/ble/w0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public M(LQI4;)Lno/nordicsemi/android/ble/w0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/w0;->H(LyT5;)Lno/nordicsemi/android/ble/w0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/w0;->I(LDj1;)Lno/nordicsemi/android/ble/w0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/w0;->K(Lj72;)Lno/nordicsemi/android/ble/w0;

    move-result-object p1

    return-object p1
.end method
