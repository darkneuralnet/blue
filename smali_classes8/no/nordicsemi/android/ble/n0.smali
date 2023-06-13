.class public Lno/nordicsemi/android/ble/n0;
.super Lno/nordicsemi/android/ble/A0;
.source "SourceFile"


# instance fields
.field public final t:Landroid/bluetooth/BluetoothDevice;

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:Z


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/A0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    const/4 p1, 0x0

    iput p1, p0, Lno/nordicsemi/android/ble/n0;->v:I

    iput p1, p0, Lno/nordicsemi/android/ble/n0;->w:I

    iput p1, p0, Lno/nordicsemi/android/ble/n0;->x:I

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/n0;->y:Z

    iput-object p2, p0, Lno/nordicsemi/android/ble/n0;->t:Landroid/bluetooth/BluetoothDevice;

    const/4 p1, 0x1

    iput p1, p0, Lno/nordicsemi/android/ble/n0;->u:I

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->V(Landroid/os/Handler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->W(LQI4;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->V(Landroid/os/Handler;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic K(LQI4;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->W(LQI4;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public L()Z
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/n0;->w:I

    if-lez v0, :cond_0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lno/nordicsemi/android/ble/n0;->w:I

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public M()V
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->o:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->a:LQI4;

    invoke-virtual {v0}, LQI4;->d()V

    :cond_0
    return-void
.end method

.method public N(LyT5;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public O(LDj1;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public P()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/n0;->t:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/n0;->u:I

    return v0
.end method

.method public R()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/n0;->x:I

    return v0
.end method

.method public S(Lj72;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public T()Z
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/n0;->v:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lno/nordicsemi/android/ble/n0;->v:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public U(II)Lno/nordicsemi/android/ble/n0;
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/n0;->w:I

    iput p2, p0, Lno/nordicsemi/android/ble/n0;->x:I

    return-object p0
.end method

.method public V(Landroid/os/Handler;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public W(LQI4;)Lno/nordicsemi/android/ble/n0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->K(LQI4;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public X()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/n0;->y:Z

    return v0
.end method

.method public Y(Z)Lno/nordicsemi/android/ble/n0;
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/n0;->y:Z

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->N(LyT5;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->O(LDj1;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/n0;->S(Lj72;)Lno/nordicsemi/android/ble/n0;

    move-result-object p1

    return-object p1
.end method
