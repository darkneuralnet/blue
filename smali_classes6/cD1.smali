.class public LcD1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LcD1$g;,
        LcD1$b;,
        LcD1$a;,
        LcD1$i;,
        LcD1$h;,
        LcD1$m;,
        LcD1$l;,
        LcD1$o;,
        LcD1$n;,
        LcD1$c;,
        LcD1$d;,
        LcD1$e;,
        LcD1$f;,
        LcD1$k;,
        LcD1$j;
    }
.end annotation


# instance fields
.field public final a:LtO1;

.field public b:Lxd6;


# direct methods
.method public constructor <init>(LtO1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LtO1;

    iput-object p1, p0, LcD1;->a:LtO1;

    return-void
.end method


# virtual methods
.method public final A(LcD1$k;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->L2(LSs7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Lvy9;

    invoke-direct {v1, p0, p1}, Lvy9;-><init>(LcD1;LcD1$k;)V

    invoke-interface {v0, v1}, LtO1;->L2(LSs7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final B(LcD1$l;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->G3(Ldw7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, LGe7;

    invoke-direct {v1, p0, p1}, LGe7;-><init>(LcD1;LcD1$l;)V

    invoke-interface {v0, v1}, LtO1;->G3(Ldw7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final C(LcD1$m;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->p2(LHx7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, LbC7;

    invoke-direct {v1, p0, p1}, LbC7;-><init>(LcD1;LcD1$m;)V

    invoke-interface {v0, v1}, LtO1;->p2(LHx7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final D(LcD1$n;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->o3(LUG7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Lj99;

    invoke-direct {v1, p0, p1}, Lj99;-><init>(LcD1;LcD1$n;)V

    invoke-interface {v0, v1}, LtO1;->o3(LUG7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final E(LcD1$o;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->u2(LDI7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Ljd9;

    invoke-direct {v1, p0, p1}, Ljd9;-><init>(LcD1;LcD1$o;)V

    invoke-interface {v0, v1}, LtO1;->u2(LDI7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final F(IIII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1, p2, p3, p4}, LtO1;->g4(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final a(Lcom/google/android/gms/maps/model/CircleOptions;)Lxj0;
    .locals 2

    :try_start_0
    const-string v0, "CircleOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lxj0;

    iget-object v1, p0, LcD1;->a:LtO1;

    invoke-interface {v1, p1}, LtO1;->F1(Lcom/google/android/gms/maps/model/CircleOptions;)LQT8;

    move-result-object p1

    invoke-direct {v0, p1}, Lxj0;-><init>(LQT8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final b(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)LfE1;
    .locals 1

    :try_start_0
    const-string v0, "GroundOverlayOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->H2(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)LC99;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LfE1;

    invoke-direct {v0, p1}, LfE1;-><init>(LC99;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;
    .locals 1

    :try_start_0
    const-string v0, "MarkerOptions must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->J1(Lcom/google/android/gms/maps/model/MarkerOptions;)LEw9;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LfM2;

    invoke-direct {v0, p1}, LfM2;-><init>(LEw9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final d(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;
    .locals 2

    :try_start_0
    const-string v0, "PolygonOptions must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LDX3;

    iget-object v1, p0, LcD1;->a:LtO1;

    invoke-interface {v1, p1}, LtO1;->c0(Lcom/google/android/gms/maps/model/PolygonOptions;)LOf7;

    move-result-object p1

    invoke-direct {v0, p1}, LDX3;-><init>(LOf7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final e(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;
    .locals 2

    :try_start_0
    const-string v0, "PolylineOptions must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LMX3;

    iget-object v1, p0, LcD1;->a:LtO1;

    invoke-interface {v1, p1}, LtO1;->E1(Lcom/google/android/gms/maps/model/PolylineOptions;)LCi7;

    move-result-object p1

    invoke-direct {v0, p1}, LMX3;-><init>(LCi7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final f(Lqc0;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-virtual {p1}, Lqc0;->a()LWO1;

    move-result-object p1

    invoke-interface {v0, p1}, LtO1;->L1(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final g(Lqc0;ILcD1$a;)V
    .locals 2

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-virtual {p1}, Lqc0;->a()LWO1;

    move-result-object p1

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, LEf7;

    invoke-direct {v1, p3}, LEf7;-><init>(LcD1$a;)V

    move-object p3, v1

    :goto_0
    invoke-interface {v0, p1, p2, p3}, LtO1;->r4(LWO1;ILXX7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final h()V
    .locals 2

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0}, LtO1;->clear()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final i()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0}, LtO1;->v2()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final j()F
    .locals 2

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0}, LtO1;->I1()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final k()LU74;
    .locals 2

    :try_start_0
    new-instance v0, LU74;

    iget-object v1, p0, LcD1;->a:LtO1;

    invoke-interface {v1}, LtO1;->getProjection()LZO1;

    move-result-object v1

    invoke-direct {v0, v1}, LU74;-><init>(LZO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final l()Lxd6;
    .locals 2

    :try_start_0
    iget-object v0, p0, LcD1;->b:Lxd6;

    if-nez v0, :cond_0

    new-instance v0, Lxd6;

    iget-object v1, p0, LcD1;->a:LtO1;

    invoke-interface {v1}, LtO1;->M1()LmP1;

    move-result-object v1

    invoke-direct {v0, v1}, Lxd6;-><init>(LmP1;)V

    iput-object v0, p0, LcD1;->b:Lxd6;

    :cond_0
    iget-object v0, p0, LcD1;->b:Lxd6;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final m(Lqc0;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-virtual {p1}, Lqc0;->a()LWO1;

    move-result-object p1

    invoke-interface {v0, p1}, LtO1;->H1(LWO1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final n(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->K1(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final o(Z)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->R3(Z)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final p(LcD1$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->r3(LnA8;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Lte8;

    invoke-direct {v1, p0, p1}, Lte8;-><init>(LcD1;LcD1$b;)V

    invoke-interface {v0, v1}, LtO1;->r3(LnA8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public q(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->k4(Lcom/google/android/gms/maps/model/MapStyleOptions;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final r(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LcD1;->a:LtO1;

    invoke-interface {v0, p1}, LtO1;->U1(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final s(LcD1$c;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->Q1(Lkd9;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Luw9;

    invoke-direct {v1, p0, p1}, Luw9;-><init>(LcD1;LcD1$c;)V

    invoke-interface {v0, v1}, LtO1;->Q1(Lkd9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final t(LcD1$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->A2(Lwl9;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Llv9;

    invoke-direct {v1, p0, p1}, Llv9;-><init>(LcD1;LcD1$d;)V

    invoke-interface {v0, v1}, LtO1;->A2(Lwl9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final u(LcD1$e;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->w3(LGq9;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, LNt9;

    invoke-direct {v1, p0, p1}, LNt9;-><init>(LcD1;LcD1$e;)V

    invoke-interface {v0, v1}, LtO1;->w3(LGq9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final v(LcD1$f;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->i3(LOt9;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Lls9;

    invoke-direct {v1, p0, p1}, Lls9;-><init>(LcD1;LcD1$f;)V

    invoke-interface {v0, v1}, LtO1;->i3(LOt9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final w(LcD1$g;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->a4(Lxy9;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, LkZ8;

    invoke-direct {v1, p0, p1}, LkZ8;-><init>(LcD1;LcD1$g;)V

    invoke-interface {v0, v1}, LtO1;->a4(Lxy9;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final x(LcD1$h;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->v3(Lti7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, LNP7;

    invoke-direct {v1, p0, p1}, LNP7;-><init>(LcD1;LcD1$h;)V

    invoke-interface {v0, v1}, LtO1;->v3(Lti7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final y(LcD1$i;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->s2(Ljk7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Ln68;

    invoke-direct {v1, p0, p1}, Ln68;-><init>(LcD1;LcD1$i;)V

    invoke-interface {v0, v1}, LtO1;->s2(Ljk7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final z(LcD1$j;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, LcD1;->a:LtO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LtO1;->G1(LAp7;)V

    return-void

    :cond_0
    iget-object v0, p0, LcD1;->a:LtO1;

    new-instance v1, Lwx9;

    invoke-direct {v1, p0, p1}, Lwx9;-><init>(LcD1;LcD1$j;)V

    invoke-interface {v0, v1}, LtO1;->G1(LAp7;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
