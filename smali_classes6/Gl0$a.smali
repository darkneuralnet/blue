.class public LGl0$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Float;",
        "Ljava/lang/Void;",
        "Ljava/util/Set<",
        "+",
        "LDl0<",
        "TT;>;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LGl0;


# direct methods
.method public constructor <init>(LGl0;)V
    .locals 0

    iput-object p1, p0, LGl0$a;->a:LGl0;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LGl0;LFl0;)V
    .locals 0

    invoke-direct {p0, p1}, LGl0$a;-><init>(LGl0;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Float;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Float;",
            ")",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, LGl0$a;->a:LGl0;

    invoke-static {v0}, LGl0;->e(LGl0;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0$a;->a:LGl0;

    invoke-static {v0}, LGl0;->d(LGl0;)LF9;

    move-result-object v0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    float-to-double v1, p1

    invoke-interface {v0, v1, v2}, LF9;->f(D)Ljava/util/Set;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LGl0$a;->a:LGl0;

    invoke-static {v0}, LGl0;->e(LGl0;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0$a;->a:LGl0;

    invoke-static {v0}, LGl0;->e(LGl0;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public b(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0$a;->a:LGl0;

    invoke-static {v0}, LGl0;->f(LGl0;)LHl0;

    move-result-object v0

    invoke-interface {v0, p1}, LHl0;->onClustersChanged(Ljava/util/Set;)V

    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Float;

    invoke-virtual {p0, p1}, LGl0$a;->a([Ljava/lang/Float;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LGl0$a;->b(Ljava/util/Set;)V

    return-void
.end method
