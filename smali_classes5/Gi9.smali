.class public final LGi9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:Ljava/util/concurrent/ExecutorService;

.field public static final n:Ljava/util/concurrent/ExecutorService;

.field public static final o:J

.field public static p:LGi9;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:LKb9;

.field public final e:Ldh9;

.field public volatile f:Lvy7;

.field public volatile g:Lvy7;

.field public final h:Ljava/util/Map;

.field public final i:Lpj9;

.field public final j:Lcj9;

.field public k:Ljava/lang/String;

.field public final l:Lth9;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, LGi9;->m:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, LGi9;->n:Ljava/util/concurrent/ExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, LGi9;->o:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LKb9;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lth9;Lcj9;LDb9;[B)V
    .locals 13

    move-object v0, p0

    move-object v11, p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, v0, LGi9;->h:Ljava/util/Map;

    iput-object v11, v0, LGi9;->a:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, LGi9;->d:LKb9;

    move-object/from16 v1, p3

    iput-object v1, v0, LGi9;->b:Ljava/util/concurrent/Executor;

    move-object/from16 v1, p4

    iput-object v1, v0, LGi9;->c:Ljava/util/concurrent/Executor;

    move-object/from16 v1, p5

    iput-object v1, v0, LGi9;->l:Lth9;

    move-object/from16 v10, p6

    iput-object v10, v0, LGi9;->j:Lcj9;

    new-instance v12, Ldh9;

    invoke-virtual/range {p7 .. p7}, LDb9;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p7 .. p7}, LDb9;->a()Ljava/lang/String;

    move-result-object v4

    const-string v5, "firebase"

    const-wide/16 v6, 0x5

    const-wide/16 v8, 0x5

    move-object v1, v12

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Ldh9;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcj9;)V

    iput-object v12, v0, LGi9;->e:Ldh9;

    new-instance v1, Lpj9;

    invoke-direct {v1, p1}, Lpj9;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, LGi9;->i:Lpj9;

    return-void
.end method

.method public static bridge synthetic c(Lorg/json/JSONObject;)Lvy7;
    .locals 0

    invoke-static {p0}, LGi9;->m(Lorg/json/JSONObject;)Lvy7;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(LGi9;)LKb9;
    .locals 0

    iget-object p0, p0, LGi9;->d:LKb9;

    return-object p0
.end method

.method public static bridge synthetic e(LGi9;)Ldh9;
    .locals 0

    iget-object p0, p0, LGi9;->e:Ldh9;

    return-object p0
.end method

.method public static declared-synchronized f()LGi9;
    .locals 11

    const-class v0, LGi9;

    monitor-enter v0

    :try_start_0
    sget-object v1, LGi9;->p:LGi9;

    if-nez v1, :cond_0

    new-instance v1, LGi9;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    invoke-virtual {v2, v3}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/content/Context;

    invoke-static {}, LKb9;->b()LKb9;

    move-result-object v4

    new-instance v8, Lcj9;

    invoke-direct {v8}, Lcj9;-><init>()V

    sget-object v9, LFc9;->a:LDb9;

    sget-object v5, LGi9;->m:Ljava/util/concurrent/ExecutorService;

    sget-object v6, LGi9;->n:Ljava/util/concurrent/ExecutorService;

    sget-object v7, Lth9;->a:Lth9;

    const/4 v10, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, LGi9;-><init>(Landroid/content/Context;LKb9;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lth9;Lcj9;LDb9;[B)V

    sput-object v1, LGi9;->p:LGi9;

    :cond_0
    sget-object v1, LGi9;->p:LGi9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static bridge synthetic g(LGi9;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LGi9;->k:Ljava/lang/String;

    return-object p0
.end method

.method public static m(Lorg/json/JSONObject;)Lvy7;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lbi9;

    invoke-direct {v0, p0}, Lbi9;-><init>(Lorg/json/JSONObject;)V

    new-instance v1, LTx7;

    invoke-direct {v1}, LTx7;-><init>()V

    iget-object v0, v0, Lbi9;->b:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v3, ""

    goto :goto_1

    :cond_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xd

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "{ \"value\": "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " }"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "value"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    invoke-virtual {v1, v2, v3}, LTx7;->a(Ljava/lang/Object;Ljava/lang/Object;)LTx7;

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x37

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Getting JSON string value for remote config key "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " failed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "MLKit RemoteConfigRestC"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw p0

    :cond_2
    invoke-virtual {v1}, LTx7;->b()Lvy7;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(J)Lcom/google/android/gms/tasks/Task;
    .locals 11

    new-instance v2, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    new-instance v5, LYb9;

    invoke-direct {v5}, LYb9;-><init>()V

    invoke-virtual {v5}, LYb9;->g()V

    new-instance v8, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v9, p0, LGi9;->c:Ljava/util/concurrent/Executor;

    new-instance v10, Lri9;

    const/4 v6, 0x0

    move-object v0, v10

    move-object v1, p0

    move-wide v3, p1

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lri9;-><init>(LGi9;Ljava/util/Date;JLYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v9, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/google/android/gms/tasks/Task;
    .locals 5

    new-instance v0, LYb9;

    invoke-direct {v0}, LYb9;-><init>()V

    invoke-virtual {v0}, LYb9;->g()V

    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v2, p0, LGi9;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lji9;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v0, v4, v1}, Lji9;-><init>(LGi9;LYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object p1, p0, LGi9;->f:Lvy7;

    const-string v0, "vision_object_detection_enable_acceleration"

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lvy7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    iget-object p1, p0, LGi9;->h:Ljava/util/Map;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, LGi9;->h:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic i(Ljava/util/Date;JLYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6

    const-string p5, "MLKit RemoteConfigRestC"

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p4, v0}, LGi9;->l(LYb9;Z)Landroid/util/Pair;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lvy7;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    add-long/2addr v4, p2

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1, v3}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Saved remote config is past its expiration time."

    invoke-static {p5, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch LVi9; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    :try_start_1
    const-string p2, "Getting installation id..."

    invoke-static {p5, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, LGi9;->d:LKb9;

    invoke-virtual {p2}, LKb9;->d()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch LVi9; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string p2, "Got installation id. Checking temporary token for expiry..."

    invoke-static {p5, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, LGi9;->d:LKb9;

    invoke-virtual {p2}, LKb9;->c()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Got valid temporary auth token. Fetching remote config..."

    invoke-static {p5, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p3, Lyi9;

    invoke-direct {p3, p0, p2, p1, p4}, Lyi9;-><init>(LGi9;Ljava/lang/String;Ljava/util/Date;LYb9;)V

    invoke-static {p3}, LXj9;->a(LQj9;)Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Lc79;->h:Lc79;

    invoke-virtual {p4, p1}, LYb9;->d(Lc79;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Lyi9;->a()Lvy7;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "writeAndSetFetchedConfig: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, LGi9;->i:Lpj9;

    invoke-virtual {p3}, Lyi9;->b()LVg9;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lpj9;->b(LVg9;LYb9;)V

    iput-object v2, p0, LGi9;->g:Lvy7;

    goto :goto_3

    :catch_0
    move-exception p1

    sget-object p2, Lc79;->c:Lc79;

    invoke-virtual {p4, p2}, LYb9;->d(Lc79;)V

    const-string p2, "Initializing installation id failed"

    invoke-static {p5, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    move-object v2, v1

    :goto_3
    if-nez v2, :cond_4

    const-string p1, "Remote config was null!"

    invoke-static {p5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    const-string p1, "Got remote config."

    invoke-static {p5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    invoke-virtual {p6, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catch LVi9; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    invoke-virtual {p4}, LYb9;->e()V

    iget-object p1, p0, LGi9;->j:Lcj9;

    invoke-virtual {p1, p4}, Lcj9;->c(LYb9;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_7

    :catch_1
    move-exception p1

    goto :goto_6

    :catch_2
    move-exception p1

    goto :goto_6

    :catch_3
    move-exception p1

    :goto_6
    :try_start_3
    const-string p2, "Fetch failed"

    invoke-static {p5, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p6, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :goto_7
    invoke-virtual {p4}, LYb9;->e()V

    iget-object p2, p0, LGi9;->j:Lcj9;

    invoke-virtual {p2, p4}, Lcj9;->c(LYb9;)V

    throw p1
.end method

.method public final synthetic j(LYb9;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    const-string p2, "MLKit RemoteConfigRestC"

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0}, LGi9;->l(LYb9;Z)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Cached remote config was null!"

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "Loaded cached remote config."

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p1}, LYb9;->e()V

    iget-object p2, p0, LGi9;->j:Lcj9;

    invoke-virtual {p2, p1}, Lcj9;->e(LYb9;)V

    return-void

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Load failed"

    invoke-static {p2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, LYb9;->e()V

    iget-object p3, p0, LGi9;->j:Lcj9;

    invoke-virtual {p3, p1}, Lcj9;->e(LYb9;)V

    throw p2
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LGi9;->k:Ljava/lang/String;

    return-void
.end method

.method public final l(LYb9;Z)Landroid/util/Pair;
    .locals 3

    iget-object v0, p0, LGi9;->i:Lpj9;

    invoke-virtual {v0, p1}, Lpj9;->a(LYb9;)LVg9;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, LVg9;->d()Lorg/json/JSONObject;

    move-result-object v2

    :try_start_0
    invoke-static {v2}, LGi9;->m(Lorg/json/JSONObject;)Lvy7;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object v1, p0, LGi9;->g:Lvy7;

    if-eqz p2, :cond_1

    new-instance p2, LYb9;

    invoke-direct {p2}, LYb9;-><init>()V

    invoke-virtual {p2}, LYb9;->g()V

    iget-object v2, p0, LGi9;->g:Lvy7;

    iput-object v2, p0, LGi9;->f:Lvy7;

    invoke-virtual {p2}, LYb9;->e()V

    iget-object v2, p0, LGi9;->j:Lcj9;

    invoke-virtual {v2, p2}, Lcj9;->b(LYb9;)V

    :cond_1
    invoke-virtual {p1}, LYb9;->h()V

    invoke-virtual {v0}, LVg9;->c()Ljava/util/Date;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p2

    sget-object v0, Lc79;->n:Lc79;

    invoke-virtual {p1, v0}, LYb9;->c(Lc79;)V

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Saved remote config setting has invalid format: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "MLKit RemoteConfigRestC"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1
.end method
