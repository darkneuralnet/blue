.class public abstract LlB8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/lang/Object;

.field public static volatile g:LdA8;

.field public static final h:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final i:LJB8;

.field public static final j:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:LRz8;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public volatile d:I

.field public volatile e:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LlB8;->f:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, LlB8;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, LJB8;

    sget-object v1, LKy8;->a:LKy8;

    invoke-direct {v0, v1}, LJB8;-><init>(LKy8;)V

    sput-object v0, LlB8;->i:LJB8;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, LlB8;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public synthetic constructor <init>(LRz8;Ljava/lang/String;Ljava/lang/Object;ZLZA8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x1

    iput p4, p0, LlB8;->d:I

    iget-object p4, p1, LRz8;->a:Landroid/net/Uri;

    if-eqz p4, :cond_0

    iput-object p1, p0, LlB8;->a:LRz8;

    iput-object p2, p0, LlB8;->b:Ljava/lang/String;

    iput-object p3, p0, LlB8;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c()V
    .locals 1

    sget-object v0, LlB8;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 3

    sget-object v0, LlB8;->g:LdA8;

    if-nez v0, :cond_5

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, LlB8;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LlB8;->g:LdA8;

    if-nez v1, :cond_4

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, LlB8;->g:LdA8;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object p0, v2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, LdA8;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_3

    :cond_2
    invoke-static {}, Lgv8;->d()V

    invoke-static {}, LxB8;->b()V

    invoke-static {}, Lrx8;->d()V

    new-instance v1, Lyy8;

    invoke-direct {v1, p0}, Lyy8;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, LRE8;->a(LLD8;)LLD8;

    move-result-object v1

    new-instance v2, Lsu8;

    invoke-direct {v2, p0, v1}, Lsu8;-><init>(Landroid/content/Context;LLD8;)V

    sput-object v2, LlB8;->g:LdA8;

    sget-object p0, LlB8;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_3
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :cond_4
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final b()Ljava/lang/Object;
    .locals 8

    sget-object v0, LlB8;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, LlB8;->d:I

    if-ge v1, v0, :cond_c

    monitor-enter p0

    :try_start_0
    iget v1, p0, LlB8;->d:I

    if-ge v1, v0, :cond_b

    sget-object v1, LlB8;->g:LdA8;

    invoke-static {}, LQC8;->c()LQC8;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LdA8;->b()LLD8;

    move-result-object v2

    invoke-interface {v2}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQC8;

    invoke-virtual {v2}, LQC8;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, LQC8;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LHv8;

    iget-object v5, p0, LlB8;->a:LRz8;

    iget-object v6, v5, LRz8;->a:Landroid/net/Uri;

    iget-object v5, v5, LRz8;->c:Ljava/lang/String;

    iget-object v7, p0, LlB8;->b:Ljava/lang/String;

    invoke-virtual {v4, v6, v3, v5, v7}, LHv8;->a(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    const-string v5, "Must call PhenotypeFlag.init() first"

    if-eqz v1, :cond_a

    iget-object v5, p0, LlB8;->a:LRz8;

    iget-object v5, v5, LRz8;->a:Landroid/net/Uri;

    if-eqz v5, :cond_2

    invoke-virtual {v1}, LdA8;->a()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v5}, LPx8;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1}, LdA8;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    iget-object v6, p0, LlB8;->a:LRz8;

    iget-object v6, v6, LRz8;->a:Landroid/net/Uri;

    sget-object v7, Lmy8;->b:Lmy8;

    invoke-static {v5, v6, v7}, Lgv8;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lgv8;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, LdA8;->a()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lmy8;->b:Lmy8;

    invoke-static {v5, v3, v6}, LxB8;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;)LxB8;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_3

    iget-object v6, p0, LlB8;->b:Ljava/lang/String;

    invoke-interface {v5, v6}, Lww8;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p0, v5}, LlB8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_2

    :cond_3
    move-object v5, v3

    :goto_2
    if-nez v5, :cond_7

    iget-object v5, p0, LlB8;->a:LRz8;

    iget-boolean v5, v5, LRz8;->d:Z

    if-nez v5, :cond_5

    invoke-virtual {v1}, LdA8;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lrx8;->a(Landroid/content/Context;)Lrx8;

    move-result-object v1

    iget-object v5, p0, LlB8;->a:LRz8;

    iget-boolean v5, v5, LRz8;->d:Z

    if-eqz v5, :cond_4

    move-object v5, v3

    goto :goto_3

    :cond_4
    iget-object v5, p0, LlB8;->b:Ljava/lang/String;

    :goto_3
    invoke-virtual {v1, v5}, Lrx8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v1}, LlB8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    iget-object v5, p0, LlB8;->c:Ljava/lang/Object;

    goto :goto_4

    :cond_6
    move-object v5, v3

    :cond_7
    :goto_4
    invoke-virtual {v2}, LQC8;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    if-nez v4, :cond_8

    iget-object v5, p0, LlB8;->c:Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v4}, LlB8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :cond_9
    :goto_5
    iput-object v5, p0, LlB8;->e:Ljava/lang/Object;

    iput v0, p0, LlB8;->d:I

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_6
    monitor-exit p0

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_c
    :goto_7
    iget-object v0, p0, LlB8;->e:Ljava/lang/Object;

    return-object v0
.end method
