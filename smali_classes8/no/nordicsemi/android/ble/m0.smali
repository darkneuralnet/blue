.class public final Lno/nordicsemi/android/ble/m0;
.super Lno/nordicsemi/android/ble/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lno/nordicsemi/android/ble/a<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->S(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->T(LQI4;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->S(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic K(LQI4;)Lno/nordicsemi/android/ble/A0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->T(LQI4;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public O(LyT5;)Lno/nordicsemi/android/ble/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LyT5;",
            ")",
            "Lno/nordicsemi/android/ble/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public P(LDj1;)Lno/nordicsemi/android/ble/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDj1;",
            ")",
            "Lno/nordicsemi/android/ble/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public Q(Lj72;)Lno/nordicsemi/android/ble/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj72;",
            ")",
            "Lno/nordicsemi/android/ble/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public R()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "ConditionalWaitRequest"

    const-string v2, "Error while checking predicate"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x1

    return v0
.end method

.method public S(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            ")",
            "Lno/nordicsemi/android/ble/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->J(Landroid/os/Handler;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public T(LQI4;)Lno/nordicsemi/android/ble/m0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQI4;",
            ")",
            "Lno/nordicsemi/android/ble/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/A0;->K(LQI4;)Lno/nordicsemi/android/ble/A0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->O(LyT5;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->P(LDj1;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->Q(Lj72;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    return-object p1
.end method
