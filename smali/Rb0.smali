.class public final LRb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRb0$b;,
        LRb0$a;
    }
.end annotation


# instance fields
.field public final a:LRb0$b;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LWa0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRb0$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/ArrayMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/ArrayMap;-><init>(I)V

    iput-object v0, p0, LRb0;->b:Ljava/util/Map;

    iput-object p1, p0, LRb0;->a:LRb0$b;

    return-void
.end method

.method public static a(Landroid/content/Context;)LRb0;
    .locals 1

    invoke-static {}, LXG2;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p0, v0}, LRb0;->b(Landroid/content/Context;Landroid/os/Handler;)LRb0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/Handler;)LRb0;
    .locals 1

    new-instance v0, LRb0;

    invoke-static {p0, p1}, LRb0$b;->c(Landroid/content/Context;Landroid/os/Handler;)LRb0$b;

    move-result-object p0

    invoke-direct {v0, p0}, LRb0;-><init>(LRb0$b;)V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;)LWa0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    iget-object v0, p0, LRb0;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LRb0;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWa0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    iget-object v1, p0, LRb0;->a:LRb0$b;

    invoke-interface {v1, p1}, LRb0$b;->d(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    invoke-static {v1, p1}, LWa0;->d(Landroid/hardware/camera2/CameraCharacteristics;Ljava/lang/String;)LWa0;

    move-result-object v1

    iget-object v2, p0, LRb0;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    new-instance v1, Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2712

    invoke-direct {v1, v3, v2, p1}, Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public d()[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    iget-object v0, p0, LRb0;->a:LRb0$b;

    invoke-interface {v0}, LRb0$b;->f()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    iget-object v0, p0, LRb0;->a:LRb0$b;

    invoke-interface {v0}, LRb0$b;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    iget-object v0, p0, LRb0;->a:LRb0$b;

    invoke-interface {v0, p1, p2, p3}, LRb0$b;->b(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    return-void
.end method

.method public g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 1

    iget-object v0, p0, LRb0;->a:LRb0$b;

    invoke-interface {v0, p1, p2}, LRb0$b;->a(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method

.method public h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 1

    iget-object v0, p0, LRb0;->a:LRb0$b;

    invoke-interface {v0, p1}, LRb0$b;->g(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method
