.class public final LMG8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static volatile b:LiA8;

.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final d:LsT8;

.field public static final e:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LMG8;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, LMG8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, LsT8;

    sget-object v1, Lem8;->a:Lem8;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LsT8;-><init>(Lem8;[B)V

    sput-object v0, LMG8;->d:LsT8;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, LMG8;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    sget-object v0, LMG8;->b:LiA8;

    if-nez v0, :cond_4

    sget-object v0, LMG8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LMG8;->b:LiA8;

    if-nez v1, :cond_3

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, LMG8;->b:LiA8;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, LiA8;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_2

    :cond_1
    invoke-static {}, Lke8;->a()V

    invoke-static {}, LqN8;->a()V

    new-instance v1, Let8;

    invoke-direct {v1, p0}, Let8;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, LEE7;->a(LbD7;)LbD7;

    move-result-object v1

    new-instance v2, Ld68;

    invoke-direct {v2, p0, v1}, Ld68;-><init>(Landroid/content/Context;LbD7;)V

    sput-object v2, LMG8;->b:LiA8;

    sget-object p0, LMG8;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_4
    return-void
.end method
