.class public final LJ90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKb0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ90$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LWa0;

.field public final c:LH90;

.field public final d:Ljava/lang/Object;

.field public e:Lr90;

.field public f:LJ90$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ90$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public g:LJ90$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ90$a<",
            "LqJ6;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LJ90$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ90$a<",
            "Ljc0;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lpa0;",
            "Ljava/util/concurrent/Executor;",
            ">;>;"
        }
    .end annotation
.end field

.field public final j:LTe4;

.field public final k:Lkc1;

.field public final l:LRb0;


# direct methods
.method public constructor <init>(Ljava/lang/String;LRb0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LJ90;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LJ90;->f:LJ90$a;

    iput-object v0, p0, LJ90;->g:LJ90$a;

    iput-object v0, p0, LJ90;->i:Ljava/util/List;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, LJ90;->a:Ljava/lang/String;

    iput-object p2, p0, LJ90;->l:LRb0;

    invoke-virtual {p2, v0}, LRb0;->c(Ljava/lang/String;)LWa0;

    move-result-object p2

    iput-object p2, p0, LJ90;->b:LWa0;

    new-instance v0, LH90;

    invoke-direct {v0, p0}, LH90;-><init>(LJ90;)V

    iput-object v0, p0, LJ90;->c:LH90;

    invoke-static {p1, p2}, Lec0;->a(Ljava/lang/String;LWa0;)LTe4;

    move-result-object p2

    iput-object p2, p0, LJ90;->j:LTe4;

    new-instance p2, Lia0;

    invoke-direct {p2, p1}, Lia0;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LJ90;->k:Lkc1;

    new-instance p1, LJ90$a;

    sget-object p2, Ljc0$b;->f:Ljc0$b;

    invoke-static {p2}, Ljc0;->a(Ljc0$b;)Ljc0;

    move-result-object p2

    invoke-direct {p1, p2}, LJ90$a;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LJ90;->h:LJ90$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJ90;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 3

    iget-object v0, p0, LJ90;->b:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Unable to get the lens facing of the camera."

    invoke-static {v1, v2}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lmq2;->a(I)I

    move-result v0

    return v0
.end method

.method public c(Ljava/util/concurrent/Executor;Lpa0;)V
    .locals 3

    iget-object v0, p0, LJ90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ90;->e:Lr90;

    if-nez v1, :cond_1

    iget-object v1, p0, LJ90;->i:Ljava/util/List;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LJ90;->i:Ljava/util/List;

    :cond_0
    iget-object v1, p0, LJ90;->i:Ljava/util/List;

    new-instance v2, Landroid/util/Pair;

    invoke-direct {v2, p2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :cond_1
    invoke-virtual {v1, p1, p2}, Lr90;->w(Ljava/util/concurrent/Executor;Lpa0;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Lpa0;)V
    .locals 3

    iget-object v0, p0, LJ90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ90;->e:Lr90;

    if-nez v1, :cond_3

    iget-object v1, p0, LJ90;->i:Ljava/util/List;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-ne v2, p1, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :cond_3
    invoke-virtual {v1, p1}, Lr90;->e0(Lpa0;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e(I)I
    .locals 3

    invoke-virtual {p0}, LJ90;->r()I

    move-result v0

    invoke-static {p1}, Lac0;->b(I)I

    move-result p1

    invoke-virtual {p0}, LJ90;->b()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v0, v2}, Lac0;->a(IIZ)I

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, LJ90;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, LxJ6;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Lkc1;
    .locals 1

    iget-object v0, p0, LJ90;->k:Lkc1;

    return-object v0
.end method

.method public h()Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "LqJ6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJ90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ90;->e:Lr90;

    if-nez v1, :cond_1

    iget-object v1, p0, LJ90;->g:LJ90$a;

    if-nez v1, :cond_0

    new-instance v1, LJ90$a;

    iget-object v2, p0, LJ90;->b:LWa0;

    invoke-static {v2}, LoJ6;->h(LWa0;)LqJ6;

    move-result-object v2

    invoke-direct {v1, v2}, LJ90$a;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, LJ90;->g:LJ90$a;

    :cond_0
    iget-object v1, p0, LJ90;->g:LJ90$a;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, LJ90;->g:LJ90$a;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Lr90;->M()LoJ6;

    move-result-object v1

    invoke-virtual {v1}, LoJ6;->j()Landroidx/lifecycle/LiveData;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LJ90;->e(I)I

    move-result v0

    return v0
.end method

.method public j(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJ90;->b:LWa0;

    invoke-virtual {v0}, LWa0;->b()LpR5;

    move-result-object v0

    invoke-virtual {v0, p1}, LpR5;->a(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public k()LTe4;
    .locals 1

    iget-object v0, p0, LJ90;->j:LTe4;

    return-object v0
.end method

.method public l(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJ90;->b:LWa0;

    invoke-virtual {v0}, LWa0;->b()LpR5;

    move-result-object v0

    invoke-virtual {v0, p1}, LpR5;->b(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public m()Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJ90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ90;->e:Lr90;

    if-nez v1, :cond_1

    iget-object v1, p0, LJ90;->f:LJ90$a;

    if-nez v1, :cond_0

    new-instance v1, LJ90$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, LJ90$a;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, LJ90;->f:LJ90$a;

    :cond_0
    iget-object v1, p0, LJ90;->f:LJ90$a;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, LJ90;->f:LJ90$a;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Lr90;->K()LU56;

    move-result-object v1

    invoke-virtual {v1}, LU56;->f()Landroidx/lifecycle/LiveData;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public n()Lr46;
    .locals 2

    iget-object v0, p0, LJ90;->b:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_TIMESTAMP_SOURCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget-object v0, Lr46;->b:Lr46;

    return-object v0

    :cond_0
    sget-object v0, Lr46;->c:Lr46;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LJ90;->s()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "androidx.camera.camera2.legacy"

    goto :goto_0

    :cond_0
    const-string v0, "androidx.camera.camera2"

    :goto_0
    return-object v0
.end method

.method public p()LH90;
    .locals 1

    iget-object v0, p0, LJ90;->c:LH90;

    return-object v0
.end method

.method public q()LWa0;
    .locals 1

    iget-object v0, p0, LJ90;->b:LWa0;

    return-object v0
.end method

.method public r()I
    .locals 2

    iget-object v0, p0, LJ90;->b:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public s()I
    .locals 2

    iget-object v0, p0, LJ90;->b:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, LJ90;->b:LWa0;

    const/4 v1, 0x4

    invoke-static {v0, v1}, LzJ6;->a(LWa0;I)Z

    move-result v0

    return v0
.end method

.method public u(Lr90;)V
    .locals 4

    iget-object v0, p0, LJ90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LJ90;->e:Lr90;

    iget-object v1, p0, LJ90;->g:LJ90$a;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lr90;->M()LoJ6;

    move-result-object p1

    invoke-virtual {p1}, LoJ6;->j()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-virtual {v1, p1}, LJ90$a;->d(Landroidx/lifecycle/LiveData;)V

    :cond_0
    iget-object p1, p0, LJ90;->f:LJ90$a;

    if-eqz p1, :cond_1

    iget-object v1, p0, LJ90;->e:Lr90;

    invoke-virtual {v1}, Lr90;->K()LU56;

    move-result-object v1

    invoke-virtual {v1}, LU56;->f()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-virtual {p1, v1}, LJ90$a;->d(Landroidx/lifecycle/LiveData;)V

    :cond_1
    iget-object p1, p0, LJ90;->i:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v2, p0, LJ90;->e:Lr90;

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lpa0;

    invoke-virtual {v2, v3, v1}, Lr90;->w(Ljava/util/concurrent/Executor;Lpa0;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, LJ90;->i:Ljava/util/List;

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LJ90;->v()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v()V
    .locals 0

    invoke-virtual {p0}, LJ90;->w()V

    return-void
.end method

.method public final w()V
    .locals 3

    invoke-virtual {p0}, LJ90;->s()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"

    goto :goto_0

    :cond_1
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_3"

    goto :goto_0

    :cond_2
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"

    goto :goto_0

    :cond_4
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device Level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraInfo"

    invoke-static {v1, v0}, LJx2;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Ljc0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LJ90;->h:LJ90$a;

    invoke-virtual {v0, p1}, LJ90$a;->d(Landroidx/lifecycle/LiveData;)V

    return-void
.end method
