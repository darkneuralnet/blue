.class public LZ36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEI4;
.implements LnI4;


# instance fields
.field public final a:LEI4;

.field public final b:Ljava/lang/Object;

.field public volatile c:LnI4;

.field public volatile d:LnI4;

.field public e:LEI4$a;

.field public f:LEI4$a;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;LEI4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LEI4$a;->e:LEI4$a;

    iput-object v0, p0, LZ36;->e:LEI4$a;

    iput-object v0, p0, LZ36;->f:LEI4$a;

    iput-object p1, p0, LZ36;->b:Ljava/lang/Object;

    iput-object p2, p0, LZ36;->a:LEI4;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->d:LnI4;

    invoke-interface {v1}, LnI4;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-interface {v1}, LnI4;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(LnI4;)Z
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LZ36;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LZ36;->e:LEI4$a;

    sget-object v1, LEI4$a;->d:LEI4$a;

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(LnI4;)Z
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LZ36;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZ36;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LZ36;->g:Z

    sget-object v1, LEI4$a;->e:LEI4$a;

    iput-object v1, p0, LZ36;->e:LEI4$a;

    iput-object v1, p0, LZ36;->f:LEI4$a;

    iget-object v1, p0, LZ36;->d:LnI4;

    invoke-interface {v1}, LnI4;->clear()V

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-interface {v1}, LnI4;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(LnI4;)V
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->d:LnI4;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LEI4$a;->f:LEI4$a;

    iput-object p1, p0, LZ36;->f:LEI4$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, LEI4$a;->f:LEI4$a;

    iput-object p1, p0, LZ36;->e:LEI4$a;

    iget-object p1, p0, LZ36;->a:LEI4;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, LEI4;->d(LnI4;)V

    :cond_1
    iget-object p1, p0, LZ36;->f:LEI4$a;

    invoke-virtual {p1}, LEI4$a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LZ36;->d:LnI4;

    invoke-interface {p1}, LnI4;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e(LnI4;)Z
    .locals 3

    instance-of v0, p1, LZ36;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, LZ36;

    iget-object v0, p0, LZ36;->c:LnI4;

    if-nez v0, :cond_0

    iget-object v0, p1, LZ36;->c:LnI4;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZ36;->c:LnI4;

    iget-object v2, p1, LZ36;->c:LnI4;

    invoke-interface {v0, v2}, LnI4;->e(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, LZ36;->d:LnI4;

    if-nez v0, :cond_1

    iget-object p1, p1, LZ36;->d:LnI4;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    iget-object v0, p0, LZ36;->d:LnI4;

    iget-object p1, p1, LZ36;->d:LnI4;

    invoke-interface {v0, p1}, LnI4;->e(LnI4;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public f()Z
    .locals 3

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->e:LEI4$a;

    sget-object v2, LEI4$a;->e:LEI4$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g(LnI4;)Z
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LZ36;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LZ36;->e:LEI4$a;

    sget-object v1, LEI4$a;->f:LEI4$a;

    if-eq p1, v1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getRoot()LEI4;
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->a:LEI4;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LEI4;->getRoot()LEI4;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h(LnI4;)V
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, LEI4$a;->g:LEI4$a;

    iput-object p1, p0, LZ36;->f:LEI4$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, LEI4$a;->g:LEI4$a;

    iput-object p1, p0, LZ36;->e:LEI4$a;

    iget-object p1, p0, LZ36;->a:LEI4;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, LEI4;->h(LnI4;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LZ36;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, LZ36;->e:LEI4$a;

    sget-object v3, LEI4$a;->f:LEI4$a;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, LZ36;->f:LEI4$a;

    sget-object v3, LEI4$a;->c:LEI4$a;

    if-eq v2, v3, :cond_0

    iput-object v3, p0, LZ36;->f:LEI4$a;

    iget-object v2, p0, LZ36;->d:LnI4;

    invoke-interface {v2}, LnI4;->i()V

    :cond_0
    iget-boolean v2, p0, LZ36;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, LZ36;->e:LEI4$a;

    sget-object v3, LEI4$a;->c:LEI4$a;

    if-eq v2, v3, :cond_1

    iput-object v3, p0, LZ36;->e:LEI4$a;

    iget-object v2, p0, LZ36;->c:LnI4;

    invoke-interface {v2}, LnI4;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iput-boolean v1, p0, LZ36;->g:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    iput-boolean v1, p0, LZ36;->g:Z

    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public isComplete()Z
    .locals 3

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->e:LEI4$a;

    sget-object v2, LEI4$a;->f:LEI4$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isRunning()Z
    .locals 3

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->e:LEI4$a;

    sget-object v2, LEI4$a;->c:LEI4$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, LZ36;->a:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->b(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LZ36;->a:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->c(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, LZ36;->a:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->g(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public m(LnI4;LnI4;)V
    .locals 0

    iput-object p1, p0, LZ36;->c:LnI4;

    iput-object p2, p0, LZ36;->d:LnI4;

    return-void
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, LZ36;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZ36;->f:LEI4$a;

    invoke-virtual {v1}, LEI4$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, LEI4$a;->d:LEI4$a;

    iput-object v1, p0, LZ36;->f:LEI4$a;

    iget-object v1, p0, LZ36;->d:LnI4;

    invoke-interface {v1}, LnI4;->pause()V

    :cond_0
    iget-object v1, p0, LZ36;->e:LEI4$a;

    invoke-virtual {v1}, LEI4$a;->a()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, LEI4$a;->d:LEI4$a;

    iput-object v1, p0, LZ36;->e:LEI4$a;

    iget-object v1, p0, LZ36;->c:LnI4;

    invoke-interface {v1}, LnI4;->pause()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
