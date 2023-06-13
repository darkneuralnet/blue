.class public final Lt19;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:LEd9;

.field public static final l:Lpl9;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lf09;

.field public final d:LZy5;

.field public final e:Lcom/google/android/gms/tasks/Task;

.field public final f:Lcom/google/android/gms/tasks/Task;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Ljava/util/Map;

.field public final j:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, Lpl9;->c(Ljava/lang/Object;Ljava/lang/Object;)Lpl9;

    move-result-object v0

    sput-object v0, Lt19;->l:Lpl9;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZy5;Lf09;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt19;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt19;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lt19;->a:Ljava/lang/String;

    invoke-static {p1}, LCp0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lt19;->b:Ljava/lang/String;

    iput-object p2, p0, Lt19;->d:LZy5;

    iput-object p3, p0, Lt19;->c:Lf09;

    invoke-static {}, LZ39;->a()LZ39;

    iput-object p4, p0, Lt19;->g:Ljava/lang/String;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, LQ09;

    invoke-direct {v0, p0}, LQ09;-><init>(Lt19;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, Lt19;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La19;

    invoke-direct {v0, p2}, La19;-><init>(LZy5;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, Lt19;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, Lt19;->l:Lpl9;

    invoke-virtual {p2, p4}, Lpl9;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, Lpl9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lt19;->h:I

    return-void
.end method

.method public static declared-synchronized d()LEd9;
    .locals 5

    const-class v0, Lt19;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lt19;->k:LEd9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Lfx0;->a(Landroid/content/res/Configuration;)Lvv2;

    move-result-object v1

    new-instance v2, LeZ8;

    invoke-direct {v2}, LeZ8;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lvv2;->h()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, LCp0;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LeZ8;->c(Ljava/lang/Object;)LeZ8;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LeZ8;->d()LEd9;

    move-result-object v1

    sput-object v1, Lt19;->k:LEd9;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, Lt19;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic b(LVZ8;LGF8;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, LVZ8;->c(LGF8;)LVZ8;

    invoke-interface {p1}, LVZ8;->zzc()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LXS8;

    invoke-direct {v0}, LXS8;-><init>()V

    iget-object v1, p0, Lt19;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LXS8;->b(Ljava/lang/String;)LXS8;

    iget-object v1, p0, Lt19;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, LXS8;->c(Ljava/lang/String;)LXS8;

    invoke-static {}, Lt19;->d()LEd9;

    move-result-object v1

    invoke-virtual {v0, v1}, LXS8;->h(LEd9;)LXS8;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LXS8;->g(Ljava/lang/Boolean;)LXS8;

    invoke-virtual {v0, p2}, LXS8;->l(Ljava/lang/String;)LXS8;

    invoke-virtual {v0, p3}, LXS8;->j(Ljava/lang/String;)LXS8;

    iget-object p2, p0, Lt19;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lt19;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lt19;->d:LZy5;

    invoke-virtual {p2}, LZy5;->a()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, LXS8;->i(Ljava/lang/String;)LXS8;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LXS8;->d(Ljava/lang/Integer;)LXS8;

    iget p2, p0, Lt19;->h:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LXS8;->k(Ljava/lang/Integer;)LXS8;

    invoke-interface {p1, v0}, LVZ8;->b(LXS8;)LVZ8;

    iget-object p2, p0, Lt19;->c:Lf09;

    invoke-interface {p2, p1}, Lf09;->a(LVZ8;)V

    return-void
.end method

.method public final c(Ly39;LGF8;)V
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lt19;->i:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lt19;->i:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, v0, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1e

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    return-void

    :cond_1
    :goto_0
    iget-object v2, p0, Lt19;->i:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Ly39;->a:I

    iget v1, p1, Ly39;->b:I

    iget v2, p1, Ly39;->c:I

    iget v3, p1, Ly39;->d:I

    iget v4, p1, Ly39;->e:I

    iget-wide v5, p1, Ly39;->f:J

    iget p1, p1, Ly39;->g:I

    new-instance v7, LQD8;

    invoke-direct {v7}, LQD8;-><init>()V

    const/4 v8, -0x1

    if-eq v0, v8, :cond_6

    const/16 v8, 0x23

    if-eq v0, v8, :cond_5

    const v8, 0x32315659

    if-eq v0, v8, :cond_4

    const/16 v8, 0x10

    if-eq v0, v8, :cond_3

    const/16 v8, 0x11

    if-eq v0, v8, :cond_2

    sget-object v0, LJC8;->c:LJC8;

    goto :goto_1

    :cond_2
    sget-object v0, LJC8;->e:LJC8;

    goto :goto_1

    :cond_3
    sget-object v0, LJC8;->d:LJC8;

    goto :goto_1

    :cond_4
    sget-object v0, LJC8;->f:LJC8;

    goto :goto_1

    :cond_5
    sget-object v0, LJC8;->g:LJC8;

    goto :goto_1

    :cond_6
    sget-object v0, LJC8;->i:LJC8;

    :goto_1
    invoke-virtual {v7, v0}, LQD8;->d(LJC8;)LQD8;

    const/4 v0, 0x1

    if-eq v1, v0, :cond_a

    const/4 v0, 0x2

    if-eq v1, v0, :cond_9

    const/4 v0, 0x3

    if-eq v1, v0, :cond_8

    const/4 v0, 0x4

    if-eq v1, v0, :cond_7

    sget-object v0, LbE8;->h:LbE8;

    goto :goto_2

    :cond_7
    sget-object v0, LbE8;->g:LbE8;

    goto :goto_2

    :cond_8
    sget-object v0, LbE8;->f:LbE8;

    goto :goto_2

    :cond_9
    sget-object v0, LbE8;->e:LbE8;

    goto :goto_2

    :cond_a
    sget-object v0, LbE8;->d:LbE8;

    :goto_2
    invoke-virtual {v7, v0}, LQD8;->f(LbE8;)LQD8;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, LQD8;->c(Ljava/lang/Integer;)LQD8;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, LQD8;->e(Ljava/lang/Integer;)LQD8;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, LQD8;->g(Ljava/lang/Integer;)LQD8;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, LQD8;->b(Ljava/lang/Long;)LQD8;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, LQD8;->h(Ljava/lang/Integer;)LQD8;

    invoke-virtual {v7}, LQD8;->j()LzE8;

    move-result-object p1

    new-instance v0, LSF8;

    invoke-direct {v0}, LSF8;-><init>()V

    invoke-virtual {v0, p1}, LSF8;->d(LzE8;)LSF8;

    invoke-static {v0}, LC19;->d(LSF8;)LVZ8;

    move-result-object p1

    iget-object v0, p0, Lt19;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lt19;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_b
    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, Lt19;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lj19;

    invoke-direct {v2, p0, p1, p2, v0}, Lj19;-><init>(Lt19;LVZ8;LGF8;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
