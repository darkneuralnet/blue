.class public final Lbs8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc69<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk69<",
            "Lzj8;",
            "*>;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LOs8;


# direct methods
.method public synthetic constructor <init>(LOs8;LCr8;)V
    .locals 0

    iput-object p1, p0, Lbs8;->b:LOs8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lbs8;->b:LOs8;

    invoke-static {v0}, LOs8;->j(LOs8;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lbs8;->a:Ljava/util/List;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zza()LMb9;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lbs8;->b:LOs8;

    invoke-static {v0}, LOs8;->c(LOs8;)LYA8;

    move-result-object v0

    iget-object v1, p0, Lbs8;->b:LOs8;

    invoke-static {v1}, LOs8;->k(LOs8;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Initialize "

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LYA8;->b(Ljava/lang/String;I)LUB8;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lbs8;->b:LOs8;

    invoke-static {v1}, LOs8;->j(LOs8;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lbs8;->a:Ljava/util/List;

    if-nez v2, :cond_1

    iget-object v2, p0, Lbs8;->b:LOs8;

    invoke-static {v2}, LOs8;->l(LOs8;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lbs8;->a:Ljava/util/List;

    iget-object v2, p0, Lbs8;->b:LOs8;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, LOs8;->m(LOs8;Ljava/util/List;)Ljava/util/List;

    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lbs8;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Lzs8;

    iget-object v3, p0, Lbs8;->b:LOs8;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lzs8;-><init>(LOs8;LCr8;)V

    iget-object v3, p0, Lbs8;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk69;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-interface {v4, v2}, Lk69;->zza(Ljava/lang/Object;)LMb9;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_4
    invoke-static {v2}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v1}, Lva9;->b(Ljava/lang/Iterable;)Lha9;

    move-result-object v1

    new-instance v2, LPr8;

    invoke-direct {v2, p0}, LPr8;-><init>(Lbs8;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lha9;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    invoke-virtual {v0, v1}, LUB8;->a(LMb9;)LMb9;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {v0}, LUB8;->close()V

    return-object v1

    :catchall_0
    move-exception v2

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_7
    invoke-virtual {v0}, LUB8;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method
