.class public final Lqq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpu8<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMb9<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LAn8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAn8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:LP78;

.field public final f:Lmj8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final g:LYA8;

.field public final h:Ljava/lang/Object;

.field public final i:Ll89;

.field public j:LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMb9<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LMb9;LAn8;Ljava/util/concurrent/Executor;LP78;Lmj8;LYA8;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LMb9<",
            "Landroid/net/Uri;",
            ">;",
            "LAn8<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "LP78;",
            "Lmj8<",
            "TT;>;",
            "LYA8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lqq8;->h:Ljava/lang/Object;

    invoke-static {}, Ll89;->c()Ll89;

    move-result-object v0

    iput-object v0, p0, Lqq8;->i:Ll89;

    const/4 v0, 0x0

    iput-object v0, p0, Lqq8;->j:LMb9;

    iput-object p1, p0, Lqq8;->a:Ljava/lang/String;

    invoke-static {p2}, Lva9;->h(LMb9;)LMb9;

    move-result-object p1

    iput-object p1, p0, Lqq8;->b:LMb9;

    iput-object p3, p0, Lqq8;->c:LAn8;

    invoke-static {p4}, LHc9;->c(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lqq8;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lqq8;->e:LP78;

    iput-object p6, p0, Lqq8;->f:Lmj8;

    iput-object p7, p0, Lqq8;->g:LYA8;

    return-void
.end method

.method public static d()LDu8;
    .locals 1

    invoke-static {}, LVp8;->b()LDu8;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqq8;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Lk69;Ljava/util/concurrent/Executor;Lcu8;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk69<",
            "-TT;TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lcu8;",
            ")",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lqq8;->l()LMb9;

    move-result-object p3

    iget-object v0, p0, Lqq8;->i:Ll89;

    new-instance v1, Lzo8;

    invoke-direct {v1, p0, p3, p1, p2}, Lzo8;-><init>(Lqq8;LMb9;Lk69;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, LKD8;->b(Lc69;)Lc69;

    move-result-object p1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll89;->d(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final c(LNt8;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNt8;",
            ")",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lqq8;->l()LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e(Ljava/lang/Object;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p0, Lqq8;->h:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lqq8;->j:LMb9;

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic f()LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lqq8;->b:LMb9;

    new-instance v1, LYo8;

    invoke-direct {v1, p0}, LYo8;-><init>(Lqq8;)V

    invoke-static {v1}, LKD8;->c(Lk69;)Lk69;

    move-result-object v1

    iget-object v2, p0, Lqq8;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    invoke-static {v0}, Lva9;->h(LMb9;)LMb9;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic g(Ljava/lang/Void;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p0, Lqq8;->b:LMb9;

    invoke-static {p1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lqq8;->m(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic h(LMb9;LMb9;Ljava/lang/Object;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lwp8;

    invoke-direct {p1, p0, p2}, Lwp8;-><init>(Lqq8;LMb9;)V

    invoke-static {p1}, LKD8;->c(Lk69;)Lk69;

    move-result-object p1

    iget-object p3, p0, Lqq8;->d:Ljava/util/concurrent/Executor;

    invoke-static {p2, p1, p3}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    iget-object p2, p0, Lqq8;->h:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    invoke-static {}, Lva9;->g()LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic i(Landroid/net/Uri;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, ".bak"

    invoke-static {p1, v0}, Lev8;->a(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lqq8;->e:LP78;

    invoke-virtual {v1, v0}, LP78;->d(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqq8;->e:LP78;

    invoke-virtual {v1, v0, p1}, LP78;->c(Landroid/net/Uri;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-static {}, Lva9;->g()LMb9;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j()LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lqq8;->b:LMb9;

    invoke-static {v0}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    :try_start_0
    invoke-virtual {p0, v0}, Lqq8;->m(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    instance-of v1, v0, Lcom/google/android/gms/internal/recaptcha/zzes;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/android/gms/internal/recaptcha/zzes;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object v0

    new-instance v1, Lkp8;

    invoke-direct {v1, p0}, Lkp8;-><init>(Lqq8;)V

    invoke-static {v1}, LKD8;->c(Lk69;)Lk69;

    move-result-object v1

    iget-object v2, p0, Lqq8;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v0}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final synthetic k(LMb9;Ljava/lang/Object;)LMb9;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lqq8;->b:LMb9;

    invoke-static {v0}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    const-string v1, ".tmp"

    invoke-static {v0, v1}, Lev8;->a(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lqq8;->g:LYA8;

    const-string v3, "Write "

    iget-object v4, p0, Lqq8;->a:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v3, v4

    :goto_0
    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, LYA8;->b(Ljava/lang/String;I)LUB8;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v3, LDb8;

    invoke-direct {v3}, LDb8;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    iget-object v5, p0, Lqq8;->e:LP78;

    invoke-static {}, Lxg8;->b()Lxg8;

    move-result-object v6

    new-array v4, v4, [LDb8;

    const/4 v7, 0x0

    aput-object v3, v4, v7

    invoke-virtual {v6, v4}, Lxg8;->c([LDb8;)Lxg8;

    invoke-virtual {v5, v1, v6}, LP78;->a(Landroid/net/Uri;Lz78;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/io/OutputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    check-cast p2, LNp9;

    invoke-interface {p2, v4}, LNp9;->e(Ljava/io/OutputStream;)V

    invoke-virtual {v3}, LDb8;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v4, :cond_1

    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_1
    :try_start_5
    invoke-virtual {v2}, LUB8;->close()V

    iget-object p2, p0, Lqq8;->e:LP78;

    invoke-virtual {p2, v1, v0}, LP78;->c(Landroid/net/Uri;Landroid/net/Uri;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    iget-object p2, p0, Lqq8;->h:Ljava/lang/Object;

    monitor-enter p2

    :try_start_6
    iput-object p1, p0, Lqq8;->j:LMb9;

    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {}, Lva9;->g()LMb9;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    if-eqz v4, :cond_2

    :try_start_8
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p2

    :try_start_9
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catch_0
    move-exception p1

    :try_start_a
    iget-object p2, p0, Lqq8;->e:LP78;

    invoke-static {p2, v0, p1}, LQu8;->a(LP78;Landroid/net/Uri;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception p1

    :try_start_b
    invoke-virtual {v2}, LUB8;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception p2

    :try_start_c
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1

    :catch_1
    move-exception p1

    iget-object p2, p0, Lqq8;->e:LP78;

    invoke-virtual {p2, v1}, LP78;->d(Landroid/net/Uri;)Z

    move-result p2

    if-eqz p2, :cond_3

    :try_start_d
    iget-object p2, p0, Lqq8;->e:LP78;

    invoke-virtual {p2, v1}, LP78;->b(Landroid/net/Uri;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2

    goto :goto_3

    :catch_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw p1
.end method

.method public final l()LMb9;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lqq8;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lqq8;->j:LMb9;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    iget-object v1, p0, Lqq8;->j:LMb9;

    invoke-static {v1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :try_start_2
    iput-object v1, p0, Lqq8;->j:LMb9;

    :cond_0
    :goto_0
    iget-object v1, p0, Lqq8;->j:LMb9;

    if-nez v1, :cond_1

    iget-object v1, p0, Lqq8;->i:Ll89;

    new-instance v2, Lno8;

    invoke-direct {v2, p0}, Lno8;-><init>(Lqq8;)V

    invoke-static {v2}, LKD8;->b(Lc69;)Lc69;

    move-result-object v2

    iget-object v3, p0, Lqq8;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Ll89;->d(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    invoke-static {v1}, Lva9;->h(LMb9;)LMb9;

    move-result-object v1

    iput-object v1, p0, Lqq8;->j:LMb9;

    :cond_1
    iget-object v1, p0, Lqq8;->j:LMb9;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final m(Landroid/net/Uri;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lqq8;->g:LYA8;

    const-string v1, "Read "

    iget-object v2, p0, Lqq8;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LYA8;->b(Ljava/lang/String;I)LUB8;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lqq8;->e:LP78;

    invoke-static {}, Lhg8;->b()Lhg8;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, LP78;->a(Landroid/net/Uri;Lz78;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v2, p0, Lqq8;->c:LAn8;

    move-object v3, v2

    check-cast v3, Lfw8;

    invoke-virtual {v3}, Lfw8;->b()LNp9;

    move-result-object v3

    invoke-interface {v3}, LNp9;->z()Lhq9;

    move-result-object v3

    check-cast v2, Lfw8;

    invoke-virtual {v2}, Lfw8;->a()Lsk9;

    move-result-object v2

    invoke-interface {v3, v1, v2}, Lhq9;->b(Ljava/io/InputStream;Lsk9;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_1
    :try_start_4
    invoke-virtual {v0}, LUB8;->close()V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_7
    invoke-virtual {v0}, LUB8;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    :try_start_9
    iget-object v1, p0, Lqq8;->e:LP78;

    invoke-virtual {v1, p1}, LP78;->d(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lqq8;->c:LAn8;

    invoke-interface {v0}, LAn8;->zza()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    :goto_3
    iget-object v1, p0, Lqq8;->e:LP78;

    invoke-static {v1, p1, v0}, LQu8;->a(LP78;Landroid/net/Uri;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method
