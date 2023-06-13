.class public final Lyc0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyc0$a;
    }
.end annotation


# static fields
.field public static final o:Ljava/lang/Object;

.field public static final p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lfc0;

.field public final b:Ljava/lang/Object;

.field public final c:Lzc0;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Landroid/os/Handler;

.field public final f:Landroid/os/HandlerThread;

.field public g:LFb0;

.field public h:Lxb0;

.field public i:LVf6;

.field public j:Landroid/content/Context;

.field public final k:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lyc0$a;

.field public m:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lyc0;->o:Ljava/lang/Object;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lyc0;->p:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lzc0$b;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfc0;

    invoke-direct {v0}, Lfc0;-><init>()V

    iput-object v0, p0, Lyc0;->a:Lfc0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyc0;->b:Ljava/lang/Object;

    sget-object v0, Lyc0$a;->b:Lyc0$a;

    iput-object v0, p0, Lyc0;->l:Lyc0$a;

    const/4 v0, 0x0

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iput-object v1, p0, Lyc0;->m:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lzc0$b;->getCameraXConfig()Lzc0;

    move-result-object p2

    iput-object p2, p0, Lyc0;->c:Lzc0;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lyc0;->g(Landroid/content/Context;)Lzc0$b;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lzc0$b;->getCameraXConfig()Lzc0;

    move-result-object p2

    iput-object p2, p0, Lyc0;->c:Lzc0;

    :goto_0
    iget-object p2, p0, Lyc0;->c:Lzc0;

    invoke-virtual {p2, v0}, Lzc0;->S(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    iget-object v1, p0, Lyc0;->c:Lzc0;

    invoke-virtual {v1, v0}, Lzc0;->V(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v1

    if-nez p2, :cond_1

    new-instance p2, LEb0;

    invoke-direct {p2}, LEb0;-><init>()V

    :cond_1
    iput-object p2, p0, Lyc0;->d:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_2

    new-instance p2, Landroid/os/HandlerThread;

    const-string v1, "CameraX-scheduler"

    const/16 v2, 0xa

    invoke-direct {p2, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lyc0;->f:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {p2}, LPE1;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p2

    iput-object p2, p0, Lyc0;->e:Landroid/os/Handler;

    goto :goto_1

    :cond_2
    iput-object v0, p0, Lyc0;->f:Landroid/os/HandlerThread;

    iput-object v1, p0, Lyc0;->e:Landroid/os/Handler;

    :goto_1
    iget-object p2, p0, Lyc0;->c:Lzc0;

    sget-object v1, Lzc0;->K:Landroidx/camera/core/impl/f$a;

    invoke-interface {p2, v1, v0}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    iput-object p2, p0, Lyc0;->n:Ljava/lang/Integer;

    invoke-static {p2}, Lyc0;->j(Ljava/lang/Integer;)V

    invoke-virtual {p0, p1}, Lyc0;->l(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, Lyc0;->k:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lyc0;Landroid/content/Context;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lyc0;->o(Landroid/content/Context;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyc0;Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lyc0;->n(Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V

    return-void
.end method

.method public static synthetic c(Lyc0;Ljava/util/concurrent/Executor;JLO80$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lyc0;->m(Ljava/util/concurrent/Executor;JLO80$a;)V

    return-void
.end method

.method public static g(Landroid/content/Context;)Lzc0$b;
    .locals 5

    const-string v0, "CameraX"

    invoke-static {p0}, LdB0;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    instance-of v2, v1, Lzc0$b;

    if-eqz v2, :cond_0

    check-cast v1, Lzc0$b;

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0}, LdB0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    const-class v4, Landroidx/camera/core/impl/MetadataHolderService;

    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 p0, 0x280

    invoke-virtual {v2, v3, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v2, "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    const-string p0, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-static {v0, p0}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzc0$b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    goto :goto_1

    :catch_5
    move-exception p0

    goto :goto_1

    :catch_6
    move-exception p0

    :goto_1
    const-string v2, "Failed to retrieve default CameraXConfig.Provider from meta-data"

    invoke-static {v0, v2, p0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-object v1
.end method

.method public static j(Ljava/lang/Integer;)V
    .locals 5

    sget-object v0, Lyc0;->o:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    :try_start_0
    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "minLogLevel"

    const/4 v3, 0x3

    const/4 v4, 0x6

    invoke-static {v1, v3, v4, v2}, LHZ3;->c(IIILjava/lang/String;)I

    sget-object v1, Lyc0;->p:Landroid/util/SparseArray;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v3, v2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-static {}, Lyc0;->q()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private synthetic m(Ljava/util/concurrent/Executor;JLO80$a;)V
    .locals 6

    iget-object v4, p0, Lyc0;->j:Landroid/content/Context;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lyc0;->k(Ljava/util/concurrent/Executor;JLandroid/content/Context;LO80$a;)V

    return-void
.end method

.method private synthetic n(Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, LdB0;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    iput-object v1, p0, Lyc0;->j:Landroid/content/Context;

    if-nez v1, :cond_0

    invoke-static {p1}, LdB0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lyc0;->j:Landroid/content/Context;

    :cond_0
    iget-object p1, p0, Lyc0;->c:Lzc0;

    invoke-virtual {p1, v0}, Lzc0;->T(LFb0$a;)LFb0$a;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lyc0;->d:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lyc0;->e:Landroid/os/Handler;

    invoke-static {v1, v2}, Loc0;->a(Ljava/util/concurrent/Executor;Landroid/os/Handler;)Loc0;

    move-result-object v1

    iget-object v2, p0, Lyc0;->c:Lzc0;

    invoke-virtual {v2, v0}, Lzc0;->R(Lic0;)Lic0;

    move-result-object v2

    iget-object v3, p0, Lyc0;->j:Landroid/content/Context;

    invoke-interface {p1, v3, v1, v2}, LFb0$a;->a(Landroid/content/Context;Loc0;Lic0;)LFb0;

    move-result-object p1

    iput-object p1, p0, Lyc0;->g:LFb0;

    iget-object p1, p0, Lyc0;->c:Lzc0;

    invoke-virtual {p1, v0}, Lzc0;->U(Lxb0$a;)Lxb0$a;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lyc0;->j:Landroid/content/Context;

    iget-object v3, p0, Lyc0;->g:LFb0;

    invoke-interface {v3}, LFb0;->d()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lyc0;->g:LFb0;

    invoke-interface {v4}, LFb0;->b()Ljava/util/Set;

    move-result-object v4

    invoke-interface {p1, v1, v3, v4}, Lxb0$a;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Lxb0;

    move-result-object p1

    iput-object p1, p0, Lyc0;->h:Lxb0;

    iget-object p1, p0, Lyc0;->c:Lzc0;

    invoke-virtual {p1, v0}, Lzc0;->W(LVf6$c;)LVf6$c;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lyc0;->j:Landroid/content/Context;

    invoke-interface {p1, v1}, LVf6$c;->a(Landroid/content/Context;)LVf6;

    move-result-object p1

    iput-object p1, p0, Lyc0;->i:LVf6;

    instance-of p1, p2, LEb0;

    if-eqz p1, :cond_1

    move-object p1, p2

    check-cast p1, LEb0;

    iget-object v1, p0, Lyc0;->g:LFb0;

    invoke-virtual {p1, v1}, LEb0;->c(LFb0;)V

    :cond_1
    iget-object p1, p0, Lyc0;->a:Lfc0;

    iget-object v1, p0, Lyc0;->g:LFb0;

    invoke-virtual {p1, v1}, Lfc0;->b(LFb0;)V

    iget-object p1, p0, Lyc0;->j:Landroid/content/Context;

    iget-object v1, p0, Lyc0;->a:Lfc0;

    invoke-static {p1, v1, v2}, Landroidx/camera/core/impl/CameraValidator;->a(Landroid/content/Context;Lfc0;Lic0;)V

    invoke-virtual {p0}, Lyc0;->p()V

    invoke-virtual {p3, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_2
    new-instance p1, Landroidx/camera/core/InitializationException;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing UseCaseConfigFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    new-instance p1, Landroidx/camera/core/InitializationException;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_4
    new-instance p1, Landroidx/camera/core/InitializationException;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid app configuration provided. Missing CameraFactory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_0
    .catch Landroidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroidx/camera/core/InitializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v1, p4

    const-wide/16 v3, 0x9c4

    cmp-long v1, v1, v3

    if-gez v1, :cond_5

    const-string v0, "CameraX"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retry init. Start time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " current time "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lyc0;->e:Landroid/os/Handler;

    new-instance v6, Lxc0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lxc0;-><init>(Lyc0;Ljava/util/concurrent/Executor;JLO80$a;)V

    const-string p2, "retry_token"

    const-wide/16 p3, 0x1f4

    invoke-static {p1, v6, p2, p3, p4}, LPE1;->b(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_1

    :cond_5
    iget-object p2, p0, Lyc0;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    sget-object p4, Lyc0$a;->d:Lyc0$a;

    iput-object p4, p0, Lyc0;->l:Lyc0$a;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    instance-of p2, p1, Landroidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException;

    if-eqz p2, :cond_6

    const-string p1, "CameraX"

    const-string p2, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."

    invoke-static {p1, p2}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    instance-of p2, p1, Landroidx/camera/core/InitializationException;

    if-eqz p2, :cond_7

    invoke-virtual {p3, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_1

    :cond_7
    new-instance p2, Landroidx/camera/core/InitializationException;

    invoke-direct {p2, p1}, Landroidx/camera/core/InitializationException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private synthetic o(Landroid/content/Context;LO80$a;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v1, p0, Lyc0;->d:Ljava/util/concurrent/Executor;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lyc0;->k(Ljava/util/concurrent/Executor;JLandroid/content/Context;LO80$a;)V

    const-string p1, "CameraX initInternal"

    return-object p1
.end method

.method public static q()V
    .locals 3

    sget-object v0, Lyc0;->p:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, LJx2;->i()V

    return-void

    :cond_0
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1}, LJx2;->j(I)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, LJx2;->j(I)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v1}, LJx2;->j(I)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v1}, LJx2;->j(I)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public d()Lxb0;
    .locals 2

    iget-object v0, p0, Lyc0;->h:Lxb0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()LFb0;
    .locals 2

    iget-object v0, p0, Lyc0;->g:LFb0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()Lfc0;
    .locals 1

    iget-object v0, p0, Lyc0;->a:Lfc0;

    return-object v0
.end method

.method public h()LVf6;
    .locals 2

    iget-object v0, p0, Lyc0;->i:LVf6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyc0;->k:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public final k(Ljava/util/concurrent/Executor;JLandroid/content/Context;LO80$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "J",
            "Landroid/content/Context;",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v7, Lwc0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p5

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lwc0;-><init>(Lyc0;Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V

    invoke-interface {p1, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyc0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lyc0;->l:Lyc0$a;

    sget-object v2, Lyc0$a;->b:Lyc0$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "CameraX.initInternal() should only be called once per instance"

    invoke-static {v1, v2}, LHZ3;->j(ZLjava/lang/String;)V

    sget-object v1, Lyc0$a;->c:Lyc0$a;

    iput-object v1, p0, Lyc0;->l:Lyc0$a;

    new-instance v1, Lvc0;

    invoke-direct {v1, p0, p1}, Lvc0;-><init>(Lyc0;Landroid/content/Context;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lyc0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lyc0$a;->e:Lyc0$a;

    iput-object v1, p0, Lyc0;->l:Lyc0$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
