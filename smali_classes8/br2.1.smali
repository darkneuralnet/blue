.class public final Lbr2;
.super LSC0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LqZ0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\'\u0010(J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0096\u0001J\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0096\u0001J\u0008\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017J\u0008\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\u0015\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u001e\u0010!\u001a\u000c\u0012\u0008\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lbr2;",
        "LSC0;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "LqZ0;",
        "",
        "timeMillis",
        "block",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lo51;",
        "t",
        "LWc0;",
        "",
        "continuation",
        "l",
        "run",
        "y",
        "A",
        "",
        "L",
        "G",
        "c",
        "LSC0;",
        "dispatcher",
        "",
        "d",
        "I",
        "parallelism",
        "runningWorkers",
        "Ldx2;",
        "f",
        "Ldx2;",
        "queue",
        "",
        "Lkotlinx/coroutines/internal/SynchronizedObject;",
        "g",
        "Ljava/lang/Object;",
        "workerAllocationLock",
        "<init>",
        "(LSC0;I)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final c:LSC0;

.field public final d:I

.field public final synthetic e:LqZ0;

.field public final f:Ldx2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldx2<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method public constructor <init>(LSC0;I)V
    .locals 0

    invoke-direct {p0}, LSC0;-><init>()V

    iput-object p1, p0, Lbr2;->c:LSC0;

    iput p2, p0, Lbr2;->d:I

    instance-of p2, p1, LqZ0;

    if-eqz p2, :cond_0

    check-cast p1, LqZ0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, LbX0;->a()LqZ0;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lbr2;->e:LqZ0;

    new-instance p1, Ldx2;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ldx2;-><init>(Z)V

    iput-object p1, p0, Lbr2;->f:Ldx2;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr2;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p2}, Lbr2;->G(Ljava/lang/Runnable;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lbr2;->L()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbr2;->c:LSC0;

    invoke-virtual {p1, p0, p0}, LSC0;->A(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final G(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, Lbr2;->f:Ldx2;

    invoke-virtual {v0, p1}, Ldx2;->a(Ljava/lang/Object;)Z

    iget p1, p0, Lbr2;->runningWorkers:I

    iget v0, p0, Lbr2;->d:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final L()Z
    .locals 3

    iget-object v0, p0, Lbr2;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lbr2;->runningWorkers:I

    iget v2, p0, Lbr2;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    iget v1, p0, Lbr2;->runningWorkers:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lbr2;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public l(JLWc0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LWc0<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lbr2;->e:LqZ0;

    invoke-interface {v0, p1, p2, p3}, LqZ0;->l(JLWc0;)V

    return-void
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :cond_0
    iget-object v2, p0, Lbr2;->f:Ldx2;

    invoke-virtual {v2}, Ldx2;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v3, v2}, LVC0;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    iget-object v2, p0, Lbr2;->c:LSC0;

    invoke-virtual {v2, p0}, LSC0;->B(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lbr2;->c:LSC0;

    invoke-virtual {v0, p0, p0}, LSC0;->y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v1, p0, Lbr2;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget v2, p0, Lbr2;->runningWorkers:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lbr2;->runningWorkers:I

    iget-object v2, p0, Lbr2;->f:Ldx2;

    invoke-virtual {v2}, Ldx2;->c()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_2
    iget v2, p0, Lbr2;->runningWorkers:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lbr2;->runningWorkers:I

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 1

    iget-object v0, p0, Lbr2;->e:LqZ0;

    invoke-interface {v0, p1, p2, p3, p4}, LqZ0;->t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;

    move-result-object p1

    return-object p1
.end method

.method public y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p2}, Lbr2;->G(Ljava/lang/Runnable;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lbr2;->L()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbr2;->c:LSC0;

    invoke-virtual {p1, p0, p0}, LSC0;->y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
