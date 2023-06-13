.class public final LSe9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:Lbw7;

.field public static final l:Lvy7;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:LLe9;

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

    invoke-static {v0, v1}, Lvy7;->d(Ljava/lang/Object;Ljava/lang/Object;)Lvy7;

    move-result-object v0

    sput-object v0, LSe9;->l:Lvy7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZy5;LLe9;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LSe9;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LSe9;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LSe9;->a:Ljava/lang/String;

    invoke-static {p1}, LCp0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LSe9;->b:Ljava/lang/String;

    iput-object p2, p0, LSe9;->d:LZy5;

    iput-object p3, p0, LSe9;->c:LLe9;

    iput-object p4, p0, LSe9;->g:Ljava/lang/String;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, LEe9;

    invoke-direct {v0, p4}, LEe9;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, LSe9;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lxe9;

    invoke-direct {v0, p2}, Lxe9;-><init>(LZy5;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, LSe9;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, LSe9;->l:Lvy7;

    invoke-virtual {p2, p4}, Lvy7;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, Lvy7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LSe9;->h:I

    return-void
.end method

.method public static a(Ljava/util/List;D)J
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p1, v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static declared-synchronized g()Lbw7;
    .locals 5

    const-class v0, LSe9;

    monitor-enter v0

    :try_start_0
    sget-object v1, LSe9;->k:Lbw7;
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

    new-instance v2, LSt7;

    invoke-direct {v2}, LSt7;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lvv2;->h()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, LCp0;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LSt7;->d(Ljava/lang/Object;)LSt7;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LSt7;->e()Lbw7;

    move-result-object v1

    sput-object v1, LSe9;->k:Lbw7;
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
.method public final synthetic b(Lqf9;LmW8;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1, p2}, Lqf9;->f(LmW8;)Lqf9;

    invoke-virtual {p1}, Lqf9;->b()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ly79;

    invoke-direct {v0}, Ly79;-><init>()V

    iget-object v1, p0, LSe9;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ly79;->b(Ljava/lang/String;)Ly79;

    iget-object v1, p0, LSe9;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ly79;->c(Ljava/lang/String;)Ly79;

    invoke-static {}, LSe9;->g()Lbw7;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly79;->h(Lbw7;)Ly79;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly79;->g(Ljava/lang/Boolean;)Ly79;

    invoke-virtual {v0, p2}, Ly79;->l(Ljava/lang/String;)Ly79;

    invoke-virtual {v0, p3}, Ly79;->j(Ljava/lang/String;)Ly79;

    iget-object p2, p0, LSe9;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LSe9;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LSe9;->d:LZy5;

    invoke-virtual {p2}, LZy5;->a()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, Ly79;->i(Ljava/lang/String;)Ly79;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ly79;->d(Ljava/lang/Integer;)Ly79;

    iget p2, p0, LSe9;->h:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ly79;->k(Ljava/lang/Integer;)Ly79;

    invoke-virtual {p1, v0}, Lqf9;->g(Ly79;)Lqf9;

    iget-object p2, p0, LSe9;->c:LLe9;

    invoke-interface {p2, p1}, LLe9;->a(Lqf9;)V

    return-void
.end method

.method public final synthetic c(LmW8;Ljava/lang/Object;JLqQ7;)V
    .locals 6

    iget-object p5, p0, LSe9;->j:Ljava/util/Map;

    invoke-interface {p5, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    iget-object p5, p0, LSe9;->j:Ljava/util/Map;

    invoke-static {}, Lpx9;->q()Lpx9;

    move-result-object v0

    invoke-interface {p5, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p5, p0, LSe9;->j:Ljava/util/Map;

    invoke-interface {p5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LbB7;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p5, p2, p3}, LzI7;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, LSe9;->i(LmW8;JJ)Z

    move-result p4

    if-nez p4, :cond_1

    return-void

    :cond_1
    iget-object p4, p0, LSe9;->i:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p5}, LzI7;->h()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    new-instance p4, Ljava/util/ArrayList;

    invoke-interface {p5, p3}, LbB7;->zzc(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance v0, LDR8;

    invoke-direct {v0}, LDR8;-><init>()V

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v2, v4

    goto :goto_1

    :cond_2
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v4, v1

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->a(Ljava/lang/Long;)LDR8;

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    invoke-static {p4, v1, v2}, LSe9;->a(Ljava/util/List;D)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->c(Ljava/lang/Long;)LDR8;

    const-wide v1, 0x4052c00000000000L    # 75.0

    invoke-static {p4, v1, v2}, LSe9;->a(Ljava/util/List;D)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->f(Ljava/lang/Long;)LDR8;

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    invoke-static {p4, v1, v2}, LSe9;->a(Ljava/util/List;D)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->d(Ljava/lang/Long;)LDR8;

    const-wide/high16 v1, 0x4039000000000000L    # 25.0

    invoke-static {p4, v1, v2}, LSe9;->a(Ljava/util/List;D)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->b(Ljava/lang/Long;)LDR8;

    const-wide/16 v1, 0x0

    invoke-static {p4, v1, v2}, LSe9;->a(Ljava/util/List;D)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, LDR8;->e(Ljava/lang/Long;)LDR8;

    invoke-virtual {v0}, LDR8;->g()LZR8;

    move-result-object v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    check-cast p3, LJg8;

    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    sget-object v2, LTV8;->e:LTV8;

    invoke-virtual {v1, v2}, LyW8;->e(LTV8;)LyW8;

    new-instance v2, LOf8;

    invoke-direct {v2}, LOf8;-><init>()V

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {v2, p4}, LOf8;->a(Ljava/lang/Integer;)LOf8;

    invoke-virtual {v2, p3}, LOf8;->c(LJg8;)LOf8;

    invoke-virtual {v2, v0}, LOf8;->b(LZR8;)LOf8;

    invoke-virtual {v2}, LOf8;->e()Loh8;

    move-result-object p3

    invoke-virtual {v1, p3}, LyW8;->d(Loh8;)LyW8;

    invoke-static {v1}, Lqf9;->d(LyW8;)Lqf9;

    move-result-object p3

    invoke-virtual {p0}, LSe9;->h()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p3, p1, p4}, LSe9;->e(Lqf9;LmW8;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    iget-object p2, p0, LSe9;->j:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Lqf9;LmW8;)V
    .locals 1

    invoke-virtual {p0}, LSe9;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, LSe9;->e(Lqf9;LmW8;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lqf9;LmW8;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v7, Lqe9;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lqe9;-><init>(LSe9;Lqf9;LmW8;Ljava/lang/String;[B)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(LyY7;LmW8;)V
    .locals 8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p2

    move-wide v2, v6

    invoke-virtual/range {v0 .. v5}, LSe9;->i(LmW8;JJ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LSe9;->i:Ljava/util/Map;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LyY7;->a()Lqf9;

    move-result-object p1

    invoke-virtual {p0}, LSe9;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, LSe9;->e(Lqf9;LmW8;Ljava/lang/String;)V

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LSe9;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LSe9;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, LSe9;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i(LmW8;JJ)Z
    .locals 2

    iget-object p4, p0, LSe9;->i:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    const/4 p5, 0x1

    if-nez p4, :cond_0

    return p5

    :cond_0
    iget-object p4, p0, LSe9;->i:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p2, v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    cmp-long p1, p2, v0

    if-lez p1, :cond_1

    return p5

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
