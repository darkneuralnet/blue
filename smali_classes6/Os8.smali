.class public LOs8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMb9<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lpu8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpu8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ll89;

.field public final e:Lxy8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxy8<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lxy8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxy8<",
            "*>;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Object;

.field public final h:LYA8;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk69<",
            "Lzj8<",
            "TT;>;*>;>;"
        }
    .end annotation
.end field

.field public final j:LEv8;


# direct methods
.method public constructor <init>(Lpu8;LEv8;LMb9;ZZ[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu8<",
            "TT;>;",
            "LEv8;",
            "LMb9<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p6, Lxy8;

    new-instance v0, Lbs8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbs8;-><init>(LOs8;LCr8;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-direct {p6, v0, v2}, Lxy8;-><init>(Lc69;Ljava/util/concurrent/Executor;)V

    iput-object p6, p0, LOs8;->f:Lxy8;

    new-instance p6, Ljava/lang/Object;

    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, LOs8;->g:Ljava/lang/Object;

    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, LOs8;->i:Ljava/util/List;

    iput-object p1, p0, LOs8;->c:Lpu8;

    iput-object p2, p0, LOs8;->j:LEv8;

    iput-object p3, p0, LOs8;->b:LMb9;

    invoke-interface {p1}, Lpu8;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LOs8;->a:Ljava/lang/String;

    new-instance p2, Lxy8;

    new-instance p3, Lbo8;

    check-cast p1, Lqq8;

    invoke-direct {p3, p1}, Lbo8;-><init>(Lqq8;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lxy8;-><init>(Lc69;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, LOs8;->e:Lxy8;

    if-eqz p5, :cond_0

    invoke-static {}, LYA8;->d()LYA8;

    move-result-object p1

    iput-object p1, p0, LOs8;->h:LYA8;

    goto :goto_0

    :cond_0
    invoke-static {}, LYA8;->c()LYA8;

    move-result-object p1

    iput-object p1, p0, LOs8;->h:LYA8;

    :goto_0
    new-instance p1, LEq8;

    invoke-direct {p1, p0}, LEq8;-><init>(LOs8;)V

    invoke-virtual {p0, p1}, LOs8;->n(Lk69;)V

    if-eqz p4, :cond_1

    invoke-static {}, Ll89;->c()Ll89;

    move-result-object p1

    iput-object p1, p0, LOs8;->d:Ll89;

    return-void

    :cond_1
    iput-object v1, p0, LOs8;->d:Ll89;

    return-void
.end method

.method public static synthetic a(LOs8;)Lpu8;
    .locals 0

    iget-object p0, p0, LOs8;->c:Lpu8;

    return-object p0
.end method

.method public static synthetic b(LOs8;)Lxy8;
    .locals 0

    iget-object p0, p0, LOs8;->e:Lxy8;

    return-object p0
.end method

.method public static synthetic c(LOs8;)LYA8;
    .locals 0

    iget-object p0, p0, LOs8;->h:LYA8;

    return-object p0
.end method

.method public static synthetic j(LOs8;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LOs8;->g:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic k(LOs8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LOs8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(LOs8;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LOs8;->i:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic m(LOs8;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LOs8;->i:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public final d()LMb9;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LOs8;->h:LYA8;

    invoke-virtual {v0}, LYA8;->a()V

    iget-object v0, p0, LOs8;->f:Lxy8;

    invoke-virtual {v0}, Lxy8;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LOs8;->c:Lpu8;

    invoke-interface {v0, v1}, Lpu8;->c(LNt8;)LMb9;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LOs8;->h:LYA8;

    iget-object v2, p0, LOs8;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "Get "

    if-eqz v3, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, LYA8;->b(Ljava/lang/String;I)LUB8;

    move-result-object v0

    :try_start_0
    iget-object v2, p0, LOs8;->f:Lxy8;

    invoke-virtual {v2}, Lxy8;->b()LMb9;

    move-result-object v2

    new-instance v3, LSq8;

    invoke-direct {v3, p0, v1}, LSq8;-><init>(LOs8;LNt8;)V

    invoke-static {v3}, LKD8;->c(Lk69;)Lk69;

    move-result-object v1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    invoke-virtual {v0, v1}, LUB8;->a(LMb9;)LMb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LUB8;->close()V

    move-object v0, v1

    :goto_1
    iget-object v1, p0, LOs8;->b:LMb9;

    invoke-static {v1}, Lva9;->h(LMb9;)LMb9;

    invoke-static {v0}, Lva9;->h(LMb9;)LMb9;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, LUB8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final synthetic e(LNt8;Ljava/lang/Object;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p0, LOs8;->c:Lpu8;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lpu8;->c(LNt8;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f(Lzj8;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p0, LOs8;->e:Lxy8;

    invoke-virtual {p1}, Lxy8;->b()LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic g(Lk69;Ljava/util/concurrent/Executor;Ljava/lang/Object;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p3, p0, LOs8;->c:Lpu8;

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lpu8;->b(Lk69;Ljava/util/concurrent/Executor;Lcu8;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic h(Lk69;Ljava/util/concurrent/Executor;Ljava/lang/Object;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p3, p0, LOs8;->c:Lpu8;

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lpu8;->b(Lk69;Ljava/util/concurrent/Executor;Lcu8;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lk69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk69<",
            "-TT;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOs8;->h:LYA8;

    iget-object v1, p0, LOs8;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "Update "

    if-eqz v2, :cond_0

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LYA8;->b(Ljava/lang/String;I)LUB8;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LOs8;->f:Lxy8;

    invoke-virtual {v1}, Lxy8;->b()LMb9;

    move-result-object v1

    iget-object v2, p0, LOs8;->d:Ll89;

    if-nez v2, :cond_1

    new-instance v2, Ler8;

    invoke-direct {v2, p0, p1, p2}, Ler8;-><init>(LOs8;Lk69;Ljava/util/concurrent/Executor;)V

    invoke-static {v2}, LKD8;->c(Lk69;)Lk69;

    move-result-object p1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {v1, p1, p2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance v3, Lsq8;

    invoke-direct {v3, p0, v1, p1, p2}, Lsq8;-><init>(LOs8;LMb9;Lk69;Ljava/util/concurrent/Executor;)V

    invoke-static {v3}, LKD8;->b(Lc69;)Lc69;

    move-result-object p1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-virtual {v2, p1, p2}, Ll89;->d(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    :goto_1
    iget-object p2, p0, LOs8;->b:LMb9;

    invoke-static {p2}, Lva9;->h(LMb9;)LMb9;

    invoke-virtual {v0, p1}, LUB8;->a(LMb9;)LMb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LUB8;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, LUB8;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final n(Lk69;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk69<",
            "Lzj8<",
            "TT;>;*>;)V"
        }
    .end annotation

    iget-object v0, p0, LOs8;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOs8;->i:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
