.class public final LDQ7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:LDQ7;


# instance fields
.field public final a:Lcn8;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lon8;

    invoke-direct {v0}, Lon8;-><init>()V

    invoke-static {}, LCh9;->a()LK49;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {v1}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-virtual {v0, v1}, Lon8;->c(Ljava/util/concurrent/Executor;)Lon8;

    new-instance v1, LP78;

    invoke-static {p1}, LZ88;->i(Landroid/content/Context;)LK88;

    move-result-object p1

    invoke-virtual {p1}, LK88;->b()LZ88;

    move-result-object p1

    invoke-static {p1}, LZP8;->A(Ljava/lang/Object;)LZP8;

    move-result-object p1

    invoke-direct {v1, p1}, LP78;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lon8;->d(LP78;)Lon8;

    invoke-static {}, Lqq8;->d()LDu8;

    move-result-object p1

    invoke-virtual {v0, p1}, Lon8;->b(LDu8;)Lon8;

    invoke-virtual {v0}, Lon8;->a()Lcn8;

    move-result-object p1

    iput-object p1, p0, LDQ7;->a:Lcn8;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcn8;
    .locals 0

    invoke-static {p0}, LDQ7;->b(Landroid/content/Context;)LDQ7;

    move-result-object p0

    iget-object p0, p0, LDQ7;->a:Lcn8;

    return-object p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)LDQ7;
    .locals 2

    const-class v0, LDQ7;

    monitor-enter v0

    :try_start_0
    sget-object v1, LDQ7;->b:LDQ7;

    if-nez v1, :cond_0

    new-instance v1, LDQ7;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, LDQ7;-><init>(Landroid/content/Context;)V

    sput-object v1, LDQ7;->b:LDQ7;

    :cond_0
    sget-object p0, LDQ7;->b:LDQ7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
