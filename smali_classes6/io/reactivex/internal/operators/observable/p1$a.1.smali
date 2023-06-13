.class public final Lio/reactivex/internal/operators/observable/p1$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/D<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3540c639803a63b9L


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/p1$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/p1$b<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:I

.field public volatile e:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TR;>;"
        }
    .end annotation
.end field

.field public volatile f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/p1$b;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/p1$b<",
            "TT;TR;>;JI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/p1$a;->c:J

    iput p4, p0, Lio/reactivex/internal/operators/observable/p1$a;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 4

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->c:J

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    iget-wide v2, v2, Lio/reactivex/internal/operators/observable/p1$b;->k:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->f:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/p1$b;->b()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    invoke-virtual {v0, p0, p1}, Lio/reactivex/internal/operators/observable/p1$b;->c(Lio/reactivex/internal/operators/observable/p1$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-wide v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->c:J

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    iget-wide v2, v2, Lio/reactivex/internal/operators/observable/p1$b;->k:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->e:Lio/reactivex/internal/fuseable/j;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/p1$b;->b()V

    :cond_1
    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Lio/reactivex/internal/fuseable/e;

    if-eqz v0, :cond_1

    check-cast p1, Lio/reactivex/internal/fuseable/e;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->e:Lio/reactivex/internal/fuseable/j;

    iput-boolean v1, p0, Lio/reactivex/internal/operators/observable/p1$a;->f:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->b:Lio/reactivex/internal/operators/observable/p1$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/p1$b;->b()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->e:Lio/reactivex/internal/fuseable/j;

    return-void

    :cond_1
    new-instance p1, Lio/reactivex/internal/queue/c;

    iget v0, p0, Lio/reactivex/internal/operators/observable/p1$a;->d:I

    invoke-direct {p1, v0}, Lio/reactivex/internal/queue/c;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/p1$a;->e:Lio/reactivex/internal/fuseable/j;

    :cond_2
    return-void
.end method
