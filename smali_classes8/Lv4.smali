.class public final LLv4;
.super Lno/nordicsemi/android/ble/v0;
.source "SourceFile"


# instance fields
.field public s:Z

.field public t:Z

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/ble/v0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->U(Landroid/os/Handler;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->V(LQI4;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public I()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LLv4;->u:Z

    invoke-super {p0}, Lno/nordicsemi/android/ble/v0;->I()V

    return-void
.end method

.method public bridge synthetic J(LyT5;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->R(LyT5;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic K(LDj1;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->S(LDj1;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public L()Lno/nordicsemi/android/ble/u0;
    .locals 2

    iget-boolean v0, p0, LLv4;->s:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, LLv4;->s:Z

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->s()Lno/nordicsemi/android/ble/x0;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lno/nordicsemi/android/ble/v0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, LLv4;->t:Z

    iget-boolean v0, p0, LLv4;->u:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lno/nordicsemi/android/ble/u0;->r()Lno/nordicsemi/android/ble/x0;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lno/nordicsemi/android/ble/u0;->w()Lno/nordicsemi/android/ble/x0;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-super {p0}, Lno/nordicsemi/android/ble/v0;->L()Lno/nordicsemi/android/ble/u0;

    move-result-object v0

    return-object v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, LLv4;->s:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lno/nordicsemi/android/ble/v0;->M()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, LLv4;->t:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge synthetic N(Lj72;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->T(Lj72;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic P(Landroid/os/Handler;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->U(Landroid/os/Handler;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Q(LQI4;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->V(LQI4;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public R(LyT5;)LLv4;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/v0;->J(LyT5;)Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public S(LDj1;)LLv4;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/v0;->K(LDj1;)Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public T(Lj72;)LLv4;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/v0;->N(Lj72;)Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public U(Landroid/os/Handler;)LLv4;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/v0;->P(Landroid/os/Handler;)Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public V(LQI4;)LLv4;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/v0;->Q(LQI4;)Lno/nordicsemi/android/ble/v0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->R(LyT5;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->S(LDj1;)LLv4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, LLv4;->T(Lj72;)LLv4;

    move-result-object p1

    return-object p1
.end method
