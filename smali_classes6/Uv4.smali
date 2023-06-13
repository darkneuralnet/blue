.class public LUv4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUv4$a;
    }
.end annotation


# static fields
.field public static final j:Lcom/google/android/gms/common/util/Clock;

.field public static final k:Ljava/util/Random;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LNn1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LNn1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:LAm1;

.field public final e:LSm1;

.field public final f:Lvm1;

.field public final g:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "Lba;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/String;

.field public i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    sput-object v0, LUv4;->j:Lcom/google/android/gms/common/util/Clock;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, LUv4;->k:Ljava/util/Random;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LUv4;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;LAm1;LSm1;Lvm1;LX94;)V
    .locals 8
    .param p2    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build LUW;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "LAm1;",
            "LSm1;",
            "Lvm1;",
            "LX94<",
            "Lba;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, LUv4;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;LAm1;LSm1;Lvm1;LX94;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;LAm1;LSm1;Lvm1;LX94;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "LAm1;",
            "LSm1;",
            "Lvm1;",
            "LX94<",
            "Lba;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LUv4;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LUv4;->i:Ljava/util/Map;

    iput-object p1, p0, LUv4;->b:Landroid/content/Context;

    iput-object p2, p0, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, LUv4;->d:LAm1;

    iput-object p4, p0, LUv4;->e:LSm1;

    iput-object p5, p0, LUv4;->f:Lvm1;

    iput-object p6, p0, LUv4;->g:LX94;

    invoke-virtual {p3}, LAm1;->m()Lpn1;

    move-result-object p3

    invoke-virtual {p3}, Lpn1;->c()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, LUv4;->h:Ljava/lang/String;

    invoke-static {p1}, LUv4$a;->a(Landroid/content/Context;)V

    if-eqz p7, :cond_0

    new-instance p1, LSv4;

    invoke-direct {p1, p0}, LSv4;-><init>(LUv4;)V

    invoke-static {p2, p1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public static synthetic a()Lba;
    .locals 1

    invoke-static {}, LUv4;->o()Lba;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Z)V
    .locals 0

    invoke-static {p0}, LUv4;->p(Z)V

    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/d;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "frc"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 p1, 0x2

    aput-object p2, v0, p1

    const/4 p1, 0x3

    const-string p2, "settings"

    aput-object p2, v0, p1

    const-string p1, "%s_%s_%s_%s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    new-instance p1, Lcom/google/firebase/remoteconfig/internal/d;

    invoke-direct {p1, p0}, Lcom/google/firebase/remoteconfig/internal/d;-><init>(Landroid/content/SharedPreferences;)V

    return-object p1
.end method

.method public static k(LAm1;Ljava/lang/String;LX94;)LiS3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "Ljava/lang/String;",
            "LX94<",
            "Lba;",
            ">;)",
            "LiS3;"
        }
    .end annotation

    invoke-static {p0}, LUv4;->n(LAm1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "firebase"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, LiS3;

    invoke-direct {p0, p2}, LiS3;-><init>(LX94;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static m(LAm1;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "firebase"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, LUv4;->n(LAm1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(LAm1;)Z
    .locals 1

    invoke-virtual {p0}, LAm1;->l()Ljava/lang/String;

    move-result-object p0

    const-string v0, "[DEFAULT]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic o()Lba;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static declared-synchronized p(Z)V
    .locals 3

    const-class v0, LUv4;

    monitor-enter v0

    :try_start_0
    sget-object v1, LUv4;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNn1;

    invoke-virtual {v2, p0}, LNn1;->o(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public declared-synchronized c(LAm1;Ljava/lang/String;LSm1;Lvm1;Ljava/util/concurrent/Executor;LMu0;LMu0;LMu0;Lcom/google/firebase/remoteconfig/internal/c;Lnv0;Lcom/google/firebase/remoteconfig/internal/d;)LNn1;
    .locals 23

    move-object/from16 v9, p0

    move-object/from16 v0, p2

    monitor-enter p0

    :try_start_0
    iget-object v1, v9, LUv4;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v15, LNn1;

    iget-object v11, v9, LUv4;->b:Landroid/content/Context;

    invoke-static/range {p1 .. p2}, LUv4;->m(LAm1;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object/from16 v14, p4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-object v14, v1

    :goto_0
    iget-object v6, v9, LUv4;->b:Landroid/content/Context;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p7

    move-object/from16 v7, p2

    move-object/from16 v8, p11

    invoke-virtual/range {v1 .. v8}, LUv4;->l(LAm1;LSm1;Lcom/google/firebase/remoteconfig/internal/c;LMu0;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lzv0;

    move-result-object v22

    move-object v10, v15

    move-object/from16 v12, p1

    move-object/from16 v13, p3

    move-object v1, v15

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    move-object/from16 v17, p7

    move-object/from16 v18, p8

    move-object/from16 v19, p9

    move-object/from16 v20, p10

    move-object/from16 v21, p11

    invoke-direct/range {v10 .. v22}, LNn1;-><init>(Landroid/content/Context;LAm1;LSm1;Lvm1;Ljava/util/concurrent/Executor;LMu0;LMu0;LMu0;Lcom/google/firebase/remoteconfig/internal/c;Lnv0;Lcom/google/firebase/remoteconfig/internal/d;Lzv0;)V

    invoke-virtual {v1}, LNn1;->p()V

    iget-object v2, v9, LUv4;->a:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, LUv4;->l:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, v9, LUv4;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNn1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(Ljava/lang/String;)LNn1;
    .locals 13
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "fetch"

    invoke-virtual {p0, p1, v0}, LUv4;->e(Ljava/lang/String;Ljava/lang/String;)LMu0;

    move-result-object v7

    const-string v0, "activate"

    invoke-virtual {p0, p1, v0}, LUv4;->e(Ljava/lang/String;Ljava/lang/String;)LMu0;

    move-result-object v8

    const-string v0, "defaults"

    invoke-virtual {p0, p1, v0}, LUv4;->e(Ljava/lang/String;Ljava/lang/String;)LMu0;

    move-result-object v9

    iget-object v0, p0, LUv4;->b:Landroid/content/Context;

    iget-object v1, p0, LUv4;->h:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LUv4;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/d;

    move-result-object v12

    invoke-virtual {p0, v8, v9}, LUv4;->i(LMu0;LMu0;)Lnv0;

    move-result-object v11

    iget-object v0, p0, LUv4;->d:LAm1;

    iget-object v1, p0, LUv4;->g:LX94;

    invoke-static {v0, p1, v1}, LUv4;->k(LAm1;Ljava/lang/String;LX94;)LiS3;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LRv4;

    invoke-direct {v1, v0}, LRv4;-><init>(LiS3;)V

    invoke-virtual {v11, v1}, Lnv0;->b(Lcom/google/android/gms/common/util/BiConsumer;)V

    :cond_0
    iget-object v2, p0, LUv4;->d:LAm1;

    iget-object v4, p0, LUv4;->e:LSm1;

    iget-object v5, p0, LUv4;->f:Lvm1;

    iget-object v6, p0, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, p1, v7, v12}, LUv4;->g(Ljava/lang/String;LMu0;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/c;

    move-result-object v10

    move-object v1, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v12}, LUv4;->c(LAm1;Ljava/lang/String;LSm1;Lvm1;Ljava/util/concurrent/Executor;LMu0;LMu0;LMu0;Lcom/google/firebase/remoteconfig/internal/c;Lnv0;Lcom/google/firebase/remoteconfig/internal/d;)LNn1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)LMu0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "frc"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LUv4;->h:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const/4 p1, 0x3

    aput-object p2, v0, p1

    const-string p1, "%s_%s_%s_%s.json"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, LUv4;->b:Landroid/content/Context;

    invoke-static {v0, p1}, LCv0;->c(Landroid/content/Context;Ljava/lang/String;)LCv0;

    move-result-object p1

    invoke-static {p2, p1}, LMu0;->h(Ljava/util/concurrent/Executor;LCv0;)LMu0;

    move-result-object p1

    return-object p1
.end method

.method public f()LNn1;
    .locals 1

    const-string v0, "firebase"

    invoke-virtual {p0, v0}, LUv4;->d(Ljava/lang/String;)LNn1;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized g(Ljava/lang/String;LMu0;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/c;
    .locals 11

    monitor-enter p0

    :try_start_0
    new-instance v10, Lcom/google/firebase/remoteconfig/internal/c;

    iget-object v1, p0, LUv4;->e:LSm1;

    iget-object v0, p0, LUv4;->d:LAm1;

    invoke-static {v0}, LUv4;->n(LAm1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LUv4;->g:LX94;

    goto :goto_0

    :cond_0
    new-instance v0, LTv4;

    invoke-direct {v0}, LTv4;-><init>()V

    :goto_0
    move-object v2, v0

    iget-object v3, p0, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, LUv4;->j:Lcom/google/android/gms/common/util/Clock;

    sget-object v5, LUv4;->k:Ljava/util/Random;

    iget-object v0, p0, LUv4;->d:LAm1;

    invoke-virtual {v0}, LAm1;->m()Lpn1;

    move-result-object v0

    invoke-virtual {v0}, Lpn1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p3}, LUv4;->h(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    move-result-object v7

    iget-object v9, p0, LUv4;->i:Ljava/util/Map;

    move-object v0, v10

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v9}, Lcom/google/firebase/remoteconfig/internal/c;-><init>(LSm1;LX94;Ljava/util/concurrent/Executor;Lcom/google/android/gms/common/util/Clock;Ljava/util/Random;LMu0;Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v10

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;
    .locals 10

    iget-object v0, p0, LUv4;->d:LAm1;

    invoke-virtual {v0}, LAm1;->m()Lpn1;

    move-result-object v0

    invoke-virtual {v0}, Lpn1;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    iget-object v2, p0, LUv4;->b:Landroid/content/Context;

    invoke-virtual {p3}, Lcom/google/firebase/remoteconfig/internal/d;->b()J

    move-result-wide v6

    invoke-virtual {p3}, Lcom/google/firebase/remoteconfig/internal/d;->b()J

    move-result-wide v8

    move-object v1, v0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v9}, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-object v0
.end method

.method public final i(LMu0;LMu0;)Lnv0;
    .locals 2

    new-instance v0, Lnv0;

    iget-object v1, p0, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, v1, p1, p2}, Lnv0;-><init>(Ljava/util/concurrent/Executor;LMu0;LMu0;)V

    return-object v0
.end method

.method public declared-synchronized l(LAm1;LSm1;Lcom/google/firebase/remoteconfig/internal/c;LMu0;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;)Lzv0;
    .locals 11

    move-object v1, p0

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzv0;

    iget-object v10, v1, LUv4;->c:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v2, v0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v2 .. v10}, Lzv0;-><init>(LAm1;LSm1;Lcom/google/firebase/remoteconfig/internal/c;LMu0;Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/concurrent/ScheduledExecutorService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
