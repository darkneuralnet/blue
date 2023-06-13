.class public final Lno/nordicsemi/android/ble/r0;
.super Lno/nordicsemi/android/ble/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/y0<",
        "LoS3;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:I

.field public final t:I

.field public final u:I


# direct methods
.method public static synthetic I(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lno/nordicsemi/android/ble/r0;->R(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic J(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/r0;->Q(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private synthetic Q(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast v0, LoS3;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1, v1}, LoS3;->a(Landroid/bluetooth/BluetoothDevice;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v1, "Exception in Value callback"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private synthetic R(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast v0, LoS3;

    invoke-interface {v0, p1, p2, p3}, LoS3;->a(Landroid/bluetooth/BluetoothDevice;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string p3, "Exception in Value callback"

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/r0;->U(Landroid/os/Handler;)Lno/nordicsemi/android/ble/r0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/r0;->V(LQI4;)Lno/nordicsemi/android/ble/r0;

    move-result-object p1

    return-object p1
.end method

.method public K(LyT5;)Lno/nordicsemi/android/ble/r0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L(LDj1;)Lno/nordicsemi/android/ble/r0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/r0;->u:I

    return v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/r0;->t:I

    return v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/r0;->s:I

    return v0
.end method

.method public P(Lj72;)Lno/nordicsemi/android/ble/r0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public S(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LqS3;

    invoke-direct {v1, p0, p1}, LqS3;-><init>(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public T(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LpS3;

    invoke-direct {v1, p0, p1, p2, p3}, LpS3;-><init>(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;II)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public U(Landroid/os/Handler;)Lno/nordicsemi/android/ble/r0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public V(LQI4;)Lno/nordicsemi/android/ble/r0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/r0;->K(LyT5;)Lno/nordicsemi/android/ble/r0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/r0;->L(LDj1;)Lno/nordicsemi/android/ble/r0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/r0;->P(Lj72;)Lno/nordicsemi/android/ble/r0;

    move-result-object p1

    return-object p1
.end method
