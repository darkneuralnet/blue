.class public final Lio/reactivex/internal/operators/observable/X$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/D<",
        "TU;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3fec6c572fe7d027L


# instance fields
.field public final b:J

.field public final c:Lio/reactivex/internal/operators/observable/X$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/X$b<",
            "TT;TU;>;"
        }
    .end annotation
.end field

.field public volatile d:Z

.field public volatile e:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TU;>;"
        }
    .end annotation
.end field

.field public f:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/X$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/X$b<",
            "TT;TU;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/X$a;->b:J

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/X$a;->d:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/X$b;->d()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/X$b;->i:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    iget-boolean v0, p1, Lio/reactivex/internal/operators/observable/X$b;->d:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/X$b;->c()Z

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/observable/X$a;->d:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/X$b;->d()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iget v0, p0, Lio/reactivex/internal/operators/observable/X$a;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    invoke-virtual {v0, p1, p0}, Lio/reactivex/internal/operators/observable/X$b;->k(Ljava/lang/Object;Lio/reactivex/internal/operators/observable/X$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/X$b;->d()V

    :goto_0
    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lio/reactivex/internal/fuseable/e;

    if-eqz v0, :cond_1

    check-cast p1, Lio/reactivex/internal/fuseable/e;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lio/reactivex/internal/operators/observable/X$a;->f:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->e:Lio/reactivex/internal/fuseable/j;

    iput-boolean v1, p0, Lio/reactivex/internal/operators/observable/X$a;->d:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->c:Lio/reactivex/internal/operators/observable/X$b;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/X$b;->d()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lio/reactivex/internal/operators/observable/X$a;->f:I

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/X$a;->e:Lio/reactivex/internal/fuseable/j;

    :cond_1
    return-void
.end method
