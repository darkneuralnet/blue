.class public final LKb9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:LKb9;


# instance fields
.field public final a:Lwb9;

.field public final b:Lsc9;

.field public final c:Lfc9;

.field public d:Lyc9;


# direct methods
.method public constructor <init>(Landroid/content/Context;LDb9;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfc9;

    invoke-direct {v0}, Lfc9;-><init>()V

    iput-object v0, p0, LKb9;->c:Lfc9;

    new-instance v1, Lsc9;

    invoke-direct {v1, p1}, Lsc9;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, LKb9;->b:Lsc9;

    new-instance p1, Lwb9;

    invoke-direct {p1, p2, v0}, Lwb9;-><init>(LDb9;Lfc9;)V

    iput-object p1, p0, LKb9;->a:Lwb9;

    return-void
.end method

.method public static declared-synchronized b()LKb9;
    .locals 4

    const-class v0, LKb9;

    monitor-enter v0

    :try_start_0
    sget-object v1, LKb9;->e:LKb9;

    if-nez v1, :cond_0

    new-instance v1, LKb9;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    invoke-virtual {v2, v3}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, LFc9;->a:LDb9;

    invoke-direct {v1, v2, v3}, LKb9;-><init>(Landroid/content/Context;LDb9;)V

    sput-object v1, LKb9;->e:LKb9;

    :cond_0
    sget-object v1, LKb9;->e:LKb9;
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
.method public final a()Lcb9;
    .locals 1

    iget-object v0, p0, LKb9;->d:Lyc9;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    iget-object v0, p0, LKb9;->d:Lyc9;

    invoke-virtual {v0}, Lyc9;->b()Lcb9;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LKb9;->d:Lyc9;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    iget-object v0, p0, LKb9;->d:Lyc9;

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    iget-object v0, p0, LKb9;->d:Lyc9;

    invoke-virtual {v0}, Lyc9;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LYb9;

    invoke-direct {v0}, LYb9;-><init>()V

    invoke-virtual {v0}, LYb9;->g()V

    :try_start_0
    iget-object v3, p0, LKb9;->a:Lwb9;

    invoke-virtual {v3, v0}, Lwb9;->c(LYb9;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, LKb9;->a:Lwb9;

    invoke-virtual {v3}, Lwb9;->a()Lyc9;

    move-result-object v3

    iput-object v3, p0, LKb9;->d:Lyc9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v0}, LYb9;->e()V

    iget-object v3, p0, LKb9;->c:Lfc9;

    sget-object v4, LmW8;->N1:LmW8;

    invoke-virtual {v3, v4, v0}, Lfc9;->a(LmW8;LYb9;)V

    goto :goto_2

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, LYb9;->e()V

    iget-object v2, p0, LKb9;->c:Lfc9;

    sget-object v3, LmW8;->N1:LmW8;

    invoke-virtual {v2, v3, v0}, Lfc9;->a(LmW8;LYb9;)V

    throw v1

    :cond_3
    :goto_2
    iget-object v0, p0, LKb9;->d:Lyc9;

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    move v1, v2

    :goto_3
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(Z)V

    iget-object v0, p0, LKb9;->d:Lyc9;

    invoke-virtual {v0}, Lyc9;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    new-instance v0, LYb9;

    invoke-direct {v0}, LYb9;-><init>()V

    invoke-virtual {v0}, LYb9;->g()V

    :try_start_0
    iget-object v1, p0, LKb9;->b:Lsc9;

    invoke-virtual {v1, v0}, Lsc9;->a(LYb9;)Lyc9;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, p0, LKb9;->d:Lyc9;

    goto :goto_1

    :cond_0
    new-instance v1, LYb9;

    invoke-direct {v1}, LYb9;-><init>()V

    invoke-virtual {v1}, LYb9;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Lcb9;

    invoke-static {}, LRb9;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcb9;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, LKb9;->a:Lwb9;

    new-instance v4, Ljb9;

    invoke-direct {v4, v3, v2, v1}, Ljb9;-><init>(Lwb9;Lcb9;LYb9;)V

    invoke-static {v4}, LXj9;->a(LQj9;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lc79;->h:Lc79;

    invoke-virtual {v1, v2}, LYb9;->d(Lc79;)V

    sget-object v2, Lc79;->e:Lc79;

    invoke-virtual {v1, v2}, LYb9;->d(Lc79;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, LYb9;->e()V

    iget-object v2, p0, LKb9;->c:Lfc9;

    sget-object v3, LmW8;->M1:LmW8;

    :goto_0
    invoke-virtual {v2, v3, v1}, Lfc9;->a(LmW8;LYb9;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object v2, p0, LKb9;->a:Lwb9;

    invoke-virtual {v2}, Lwb9;->a()Lyc9;

    move-result-object v2

    iput-object v2, p0, LKb9;->d:Lyc9;

    if-eqz v2, :cond_2

    iget-object v3, p0, LKb9;->b:Lsc9;

    invoke-virtual {v3, v2, v1}, Lsc9;->c(Lyc9;LYb9;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :try_start_4
    invoke-virtual {v1}, LYb9;->e()V

    iget-object v2, p0, LKb9;->c:Lfc9;

    sget-object v3, LmW8;->M1:LmW8;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, LYb9;->e()V

    iget-object v1, p0, LKb9;->c:Lfc9;

    sget-object v2, LmW8;->L1:LmW8;

    invoke-virtual {v1, v2, v0}, Lfc9;->a(LmW8;LYb9;)V

    return-void

    :catchall_0
    move-exception v2

    :try_start_5
    invoke-virtual {v1}, LYb9;->e()V

    iget-object v3, p0, LKb9;->c:Lfc9;

    sget-object v4, LmW8;->M1:LmW8;

    invoke-virtual {v3, v4, v1}, Lfc9;->a(LmW8;LYb9;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, LYb9;->e()V

    iget-object v2, p0, LKb9;->c:Lfc9;

    sget-object v3, LmW8;->L1:LmW8;

    invoke-virtual {v2, v3, v0}, Lfc9;->a(LmW8;LYb9;)V

    throw v1
.end method
