.class public Lno/nordicsemi/android/ble/v0;
.super Lno/nordicsemi/android/ble/u0;
.source "SourceFile"


# instance fields
.field public final r:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/u0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lno/nordicsemi/android/ble/u0$c;->b:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {p0, v0}, Lno/nordicsemi/android/ble/u0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/v0;->P(Landroid/os/Handler;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/v0;->Q(LQI4;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    return-object p1
.end method

.method public H(Lno/nordicsemi/android/ble/u0;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public I()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public J(LyT5;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public K(LDj1;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L()Lno/nordicsemi/android/ble/u0;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/ble/u0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N(Lj72;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public O()Z
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/v0;->r:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public P(Landroid/os/Handler;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public Q(LQI4;)Lno/nordicsemi/android/ble/v0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/v0;->J(LyT5;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/v0;->K(LDj1;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/v0;->N(Lj72;)Lno/nordicsemi/android/ble/v0;

    move-result-object p1

    return-object p1
.end method
