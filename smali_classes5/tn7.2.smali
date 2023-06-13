.class public final Ltn7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Ljava/util/concurrent/ExecutorService;

.field public static final k:J

.field public static final l:J

.field public static m:Ltn7;


# instance fields
.field public final a:Lxn7;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Lun7;

.field public final d:LHn7;

.field public final e:J

.field public final f:J

.field public final g:Lzn7;

.field public final h:Ljava/lang/Object;

.field public final i:Lho7;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ltn7;->j:Ljava/util/concurrent/ExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Ltn7;->k:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Ltn7;->l:J

    return-void
.end method

.method public constructor <init>(Lho7;Ljava/util/concurrent/ExecutorService;Lxn7;Lun7;JJ)V
    .locals 3

    new-instance v0, Lco7;

    invoke-direct {v0}, Lco7;-><init>()V

    new-instance v1, Lzn7;

    invoke-direct {v1}, Lzn7;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Ltn7;->h:Ljava/lang/Object;

    iput-object p1, p0, Ltn7;->i:Lho7;

    iput-object p2, p0, Ltn7;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Ltn7;->a:Lxn7;

    iput-object v0, p0, Ltn7;->d:LHn7;

    iput-object p4, p0, Ltn7;->c:Lun7;

    iput-wide p5, p0, Ltn7;->e:J

    iput-wide p7, p0, Ltn7;->f:J

    iput-object v1, p0, Ltn7;->g:Lzn7;

    return-void
.end method

.method public static declared-synchronized a()Ltn7;
    .locals 11

    const-class v0, Ltn7;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltn7;->m:Ltn7;

    if-nez v1, :cond_0

    new-instance v1, Ltn7;

    invoke-static {}, Lho7;->b()Lho7;

    move-result-object v3

    sget-object v4, Ltn7;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lxn7;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v2

    const-class v6, Landroid/content/Context;

    invoke-virtual {v2, v6}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-direct {v5, v2}, Lxn7;-><init>(Landroid/content/Context;)V

    new-instance v6, Lun7;

    invoke-direct {v6}, Lun7;-><init>()V

    sget-wide v7, Ltn7;->k:J

    sget-wide v9, Ltn7;->l:J

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, Ltn7;-><init>(Lho7;Ljava/util/concurrent/ExecutorService;Lxn7;Lun7;JJ)V

    sput-object v1, Ltn7;->m:Ltn7;

    :cond_0
    sget-object v1, Ltn7;->m:Ltn7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/google/android/gms/tasks/Task;
    .locals 9

    const-string p3, "AccelerationAllowlist"

    invoke-static {}, Lzn7;->a()Lyn7;

    move-result-object p4

    invoke-virtual {p4}, Lyn7;->a()LRJ7;

    move-result-object p4

    invoke-virtual {p4}, LRJ7;->D()LOJ7;

    move-result-object p4

    invoke-virtual {p4}, LOJ7;->J()Ljava/lang/String;

    move-result-object p4

    :try_start_0
    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    const-string p1, "Unable to retrieve NNAPI info required by AllowlistServer before Android Q, skipping allowlist fetch."

    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    const-string p4, "fetchAccelerationAllowlist"

    invoke-static {p3, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "com.google.perception"

    new-instance v6, LGn7;

    const/4 p3, 0x2

    invoke-direct {v6, v4, p3}, LGn7;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6}, LGn7;->f()V

    new-instance p3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p3}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object p4, p0, Ltn7;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v8, Lrn7;

    const/4 v5, 0x2

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lrn7;-><init>(Ltn7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p4, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p4, p2, v0

    const-string p4, "Unable to parse OS version returned by the AndroidSystemInfoProvider \'%s\'"

    invoke-static {p4, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfx7;
    .locals 8

    const-string v3, "com.google.perception"

    new-instance p3, LGn7;

    const/4 p4, 0x2

    invoke-direct {p3, v3, p4}, LGn7;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p3}, LGn7;->f()V

    :try_start_0
    iget-object v0, p0, Ltn7;->a:Lxn7;

    const/4 v4, 0x2

    iget-wide v6, p0, Ltn7;->e:J

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v7}, Lxn7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;J)Lfx7;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3}, LGn7;->e()V

    iget-object p2, p0, Ltn7;->c:Lun7;

    invoke-virtual {p2, p3}, Lun7;->b(LGn7;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p3}, LGn7;->e()V

    iget-object p2, p0, Ltn7;->c:Lun7;

    invoke-virtual {p2, p3}, Lun7;->b(LGn7;)V

    throw p1
.end method

.method public final synthetic d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 15

    move-object v1, p0

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    const-string v0, "com.google.perception"

    :try_start_0
    iget-object v2, v1, Ltn7;->a:Lxn7;

    const/4 v6, 0x2

    iget-wide v8, v1, Ltn7;->f:J

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object v5, v0

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v9}, Lxn7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;J)Lfx7;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v0, "AccelerationAllowlist"

    const-string v3, "Cached copy available, not calling the server"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v13, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    const-string v2, "AccelerationAllowlist"

    const-string v3, "fetching allowlist"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v14, Lsn7;

    invoke-static {}, Lzn7;->a()Lyn7;

    move-result-object v8

    iget-object v2, v1, Ltn7;->h:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, v1, Ltn7;->i:Lho7;

    invoke-virtual {v3}, Lho7;->c()V

    iget-object v3, v1, Ltn7;->i:Lho7;

    invoke-virtual {v3}, Lho7;->a()Ldo7;

    move-result-object v9

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v7, 0x2

    :try_start_2
    iget-object v10, v1, Ltn7;->d:LHn7;

    iget-object v11, v1, Ltn7;->c:Lun7;

    move-object v2, v14

    move-object/from16 v3, p5

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object v6, v0

    invoke-direct/range {v2 .. v11}, Lsn7;-><init>(LGn7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILyn7;Ldo7;LHn7;Lun7;)V

    invoke-static {v14}, Ljp7;->a(Lip7;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v0, Lbz9;->g:Lbz9;

    invoke-virtual {v12, v0}, LGn7;->d(Lbz9;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v2, "AccelerationAllowlist"

    const-string v3, "Saving allowlist"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v14}, Lsn7;->a()Lfx7;

    move-result-object v9

    iget-object v2, v1, Ltn7;->a:Lxn7;

    const/4 v7, 0x2

    move-object v3, v9

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object v6, v0

    move-object/from16 v8, p5

    invoke-virtual/range {v2 .. v8}, Lxn7;->c(Lfx7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILGn7;)V

    move-object v0, v9

    :goto_0
    invoke-virtual {v13, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    invoke-virtual/range {p5 .. p5}, LGn7;->e()V

    iget-object v0, v1, Ltn7;->c:Lun7;

    invoke-virtual {v0, v12}, Lun7;->b(LGn7;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    :try_start_5
    sget-object v2, Lbz9;->e:Lbz9;

    invoke-virtual {v12, v2}, LGn7;->d(Lbz9;)V

    invoke-virtual {v13, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :goto_3
    invoke-virtual/range {p5 .. p5}, LGn7;->e()V

    iget-object v2, v1, Ltn7;->c:Lun7;

    invoke-virtual {v2, v12}, Lun7;->b(LGn7;)V

    throw v0
.end method
