.class public LtX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LuI1;
.implements LvI1;


# instance fields
.field public final a:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LCI1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public final c:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "Lhg6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LsI1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LX94;Ljava/util/Set;Ljava/util/concurrent/Executor;LX94;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LX94<",
            "LCI1;",
            ">;",
            "Ljava/util/Set<",
            "LsI1;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "LX94<",
            "Lhg6;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtX0;->a:LX94;

    iput-object p2, p0, LtX0;->d:Ljava/util/Set;

    iput-object p3, p0, LtX0;->e:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LtX0;->c:LX94;

    iput-object p5, p0, LtX0;->b:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;LX94;Ljava/util/concurrent/Executor;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "LsI1;",
            ">;",
            "LX94<",
            "Lhg6;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    new-instance v1, LsX0;

    invoke-direct {v1, p1, p2}, LsX0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v0, p0

    move-object v2, p3

    move-object v3, p5

    move-object v4, p4

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LtX0;-><init>(LX94;Ljava/util/Set;Ljava/util/concurrent/Executor;LX94;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic c(LtX0;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0}, LtX0;->k()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LtX0;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LtX0;->i()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/String;)LCI1;
    .locals 0

    invoke-static {p0, p1}, LtX0;->j(Landroid/content/Context;Ljava/lang/String;)LCI1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lyb4;LOs0;)LtX0;
    .locals 0

    invoke-static {p0, p1}, LtX0;->h(Lyb4;LOs0;)LtX0;

    move-result-object p0

    return-object p0
.end method

.method public static g()LEs0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEs0<",
            "LtX0;",
            ">;"
        }
    .end annotation

    const-class v0, LYv;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, LuI1;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-class v3, LvI1;

    aput-object v3, v1, v2

    const-class v2, LtX0;

    invoke-static {v2, v1}, LEs0;->f(Ljava/lang/Class;[Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v2, LAm1;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v2, LsI1;

    invoke-static {v2}, Lk01;->m(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v2, Lhg6;

    invoke-static {v2}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    new-instance v2, LrX0;

    invoke-direct {v2, v0}, LrX0;-><init>(Lyb4;)V

    invoke-virtual {v1, v2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lyb4;LOs0;)LtX0;
    .locals 7

    new-instance v6, LtX0;

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    const-class v0, LAm1;

    invoke-interface {p1, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAm1;

    invoke-virtual {v0}, LAm1;->n()Ljava/lang/String;

    move-result-object v2

    const-class v0, LsI1;

    invoke-interface {p1, v0}, LOs0;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v0, Lhg6;

    invoke-interface {p1, v0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v4

    invoke-interface {p1, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LtX0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;LX94;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method

.method private synthetic i()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LtX0;->a:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCI1;

    invoke-virtual {v0}, LCI1;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, LCI1;->b()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LDI1;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "agent"

    invoke-virtual {v3}, LDI1;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "dates"

    new-instance v6, Lorg/json/JSONArray;

    invoke-virtual {v3}, LDI1;->b()Ljava/util/List;

    move-result-object v3

    invoke-direct {v6, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "heartbeats"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "version"

    const-string v2, "2"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Landroid/util/Base64OutputStream;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    :try_start_8
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :catchall_4
    move-exception v0

    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v0
.end method

.method public static synthetic j(Landroid/content/Context;Ljava/lang/String;)LCI1;
    .locals 1

    new-instance v0, LCI1;

    invoke-direct {v0, p0, p1}, LCI1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method private synthetic k()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LtX0;->a:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCI1;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, LtX0;->c:LX94;

    invoke-interface {v3}, LX94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhg6;

    invoke-interface {v3}, Lhg6;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LCI1;->k(JLjava/lang/String;)V

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)LvI1$a;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, LtX0;->a:LX94;

    invoke-interface {p1}, LX94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCI1;

    invoke-virtual {p1, v0, v1}, LCI1;->i(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LCI1;->g()V

    sget-object p1, LvI1$a;->e:LvI1$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    sget-object p1, LvI1$a;->c:LvI1$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LtX0;->b:Landroid/content/Context;

    invoke-static {v0}, Lmh6;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LtX0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, LqX0;

    invoke-direct {v1, p0}, LqX0;-><init>(LtX0;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LtX0;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LtX0;->b:Landroid/content/Context;

    invoke-static {v0}, Lmh6;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LtX0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, LpX0;

    invoke-direct {v1, p0}, LpX0;-><init>(LtX0;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
