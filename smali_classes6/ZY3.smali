.class public LZY3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZY3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LEl0;",
        ">",
        "Ljava/lang/Object;",
        "LF9<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LF9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF9<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:LvE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvE2<",
            "Ljava/lang/Integer;",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/locks/ReadWriteLock;


# direct methods
.method public constructor <init>(LF9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF9<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LvE2;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, LvE2;-><init>(I)V

    iput-object v0, p0, LZY3;->b:LvE2;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, LZY3;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    iput-object p1, p0, LZY3;->a:LF9;

    return-void
.end method

.method public static bridge synthetic a(LZY3;I)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1}, LZY3;->i(I)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0}, LF9;->b()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public c(LEl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0, p1}, LF9;->c(LEl0;)V

    invoke-virtual {p0}, LZY3;->h()V

    return-void
.end method

.method public clearItems()V
    .locals 1

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0}, LF9;->clearItems()V

    invoke-virtual {p0}, LZY3;->h()V

    return-void
.end method

.method public d(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0, p1}, LF9;->d(Ljava/util/Collection;)V

    invoke-virtual {p0}, LZY3;->h()V

    return-void
.end method

.method public e(LEl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0, p1}, LF9;->e(LEl0;)V

    invoke-virtual {p0}, LZY3;->h()V

    return-void
.end method

.method public f(D)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation

    double-to-int p1, p1

    invoke-virtual {p0, p1}, LZY3;->i(I)Ljava/util/Set;

    move-result-object p2

    iget-object v0, p0, LZY3;->b:LvE2;

    add-int/lit8 v1, p1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    new-instance v2, LZY3$a;

    invoke-direct {v2, p0, v1}, LZY3$a;-><init>(LZY3;I)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    iget-object v0, p0, LZY3;->b:LvE2;

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LZY3$a;

    invoke-direct {v1, p0, p1}, LZY3$a;-><init>(LZY3;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    return-object p2
.end method

.method public g(LEl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LZY3;->a:LF9;

    invoke-interface {v0, p1}, LF9;->g(LEl0;)V

    invoke-virtual {p0}, LZY3;->h()V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LZY3;->b:LvE2;

    invoke-virtual {v0}, LvE2;->c()V

    return-void
.end method

.method public final i(I)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, LZY3;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v0, p0, LZY3;->b:LvE2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, LZY3;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-nez v0, :cond_1

    iget-object v0, p0, LZY3;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v0, p0, LZY3;->b:LvE2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    iget-object v0, p0, LZY3;->a:LF9;

    int-to-double v1, p1

    invoke-interface {v0, v1, v2}, LF9;->f(D)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LZY3;->b:LvE2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, LvE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, LZY3;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :cond_1
    return-object v0
.end method
