.class public final Lio/reactivex/internal/operators/observable/v$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/v$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7a85719c209ca572L


# instance fields
.field public final b:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-TU;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/internal/operators/observable/v$b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/v$b$a<",
            "TU;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public f:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field public g:Lio/reactivex/disposables/c;

.field public volatile h:Z

.field public volatile i:Z

.field public volatile j:Z

.field public k:I


# direct methods
.method public constructor <init>(Lio/reactivex/D;Lio/reactivex/functions/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TU;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/B<",
            "+TU;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/v$b;->c:Lio/reactivex/functions/o;

    iput p3, p0, Lio/reactivex/internal/operators/observable/v$b;->e:I

    new-instance p2, Lio/reactivex/internal/operators/observable/v$b$a;

    invoke-direct {p2, p1, p0}, Lio/reactivex/internal/operators/observable/v$b$a;-><init>(Lio/reactivex/D;Lio/reactivex/internal/operators/observable/v$b;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/v$b;->d:Lio/reactivex/internal/operators/observable/v$b$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    return-void

    :cond_1
    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->h:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    iput-boolean v2, p0, Lio/reactivex/internal/operators/observable/v$b;->i:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    return-void

    :cond_3
    if-nez v3, :cond_4

    :try_start_1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->c:Lio/reactivex/functions/o;

    invoke-interface {v0, v1}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null ObservableSource"

    invoke-static {v0, v1}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v2, p0, Lio/reactivex/internal/operators/observable/v$b;->h:Z

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->d:Lio/reactivex/internal/operators/observable/v$b$a;

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->dispose()V

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->clear()V

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {v1, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->dispose()V

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v1}, Lio/reactivex/internal/fuseable/j;->clear()V

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {v1, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->h:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->a()V

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->i:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->d:Lio/reactivex/internal/operators/observable/v$b$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/v$b$a;->a()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->g:Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->clear()V

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->i:Z

    return v0
.end method

.method public onComplete()V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->a()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->dispose()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lio/reactivex/internal/operators/observable/v$b;->k:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->a()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/v$b;->g:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->g:Lio/reactivex/disposables/c;

    instance-of v0, p1, Lio/reactivex/internal/fuseable/e;

    if-eqz v0, :cond_1

    check-cast p1, Lio/reactivex/internal/fuseable/e;

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lio/reactivex/internal/operators/observable/v$b;->k:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    iput-boolean v1, p0, Lio/reactivex/internal/operators/observable/v$b;->j:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/v$b;->a()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lio/reactivex/internal/operators/observable/v$b;->k:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void

    :cond_1
    new-instance p1, Lio/reactivex/internal/queue/c;

    iget v0, p0, Lio/reactivex/internal/operators/observable/v$b;->e:I

    invoke-direct {p1, v0}, Lio/reactivex/internal/queue/c;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->f:Lio/reactivex/internal/fuseable/j;

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/v$b;->b:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    :cond_2
    return-void
.end method
