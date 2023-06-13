.class public final Lgt5;
.super LZt4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LZt4<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:LZt4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZt4<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Lam;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lam<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZt4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZt4<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LZt4;-><init>()V

    iput-object p1, p0, Lgt5;->b:LZt4;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lgt5;->b:LZt4;

    invoke-virtual {v0}, LZt4;->a()Z

    move-result v0

    return v0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lgt5;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgt5;->d:Lam;

    if-nez v0, :cond_0

    new-instance v0, Lam;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lam;-><init>(I)V

    iput-object v0, p0, Lgt5;->d:Lam;

    :cond_0
    invoke-virtual {v0, p1}, Lam;->b(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lgt5;->c:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lgt5;->b:LZt4;

    invoke-virtual {v0, p1}, LZt4;->accept(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lgt5;->e()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e()V
    .locals 2

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgt5;->d:Lam;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgt5;->c:Z

    monitor-exit p0

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lgt5;->d:Lam;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lgt5;->b:LZt4;

    invoke-virtual {v0, v1}, Lam;->a(LZt4;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lgt5;->b:LZt4;

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
