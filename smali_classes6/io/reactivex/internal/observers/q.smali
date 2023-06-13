.class public final Lio/reactivex/internal/observers/q;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4b2db39073b2fa8dL


# instance fields
.field public final b:Lio/reactivex/internal/observers/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/observers/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:I

.field public d:Lio/reactivex/internal/fuseable/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile e:Z

.field public f:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/observers/r;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/observers/r<",
            "TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    iput p2, p0, Lio/reactivex/internal/observers/q;->c:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/observers/q;->e:Z

    return v0
.end method

.method public b()Lio/reactivex/internal/fuseable/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/internal/fuseable/j<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/observers/q;->d:Lio/reactivex/internal/fuseable/j;

    return-object v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/q;->e:Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/disposables/c;

    invoke-static {v0}, Lio/reactivex/internal/disposables/d;->b(Lio/reactivex/disposables/c;)Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    invoke-interface {v0, p0}, Lio/reactivex/internal/observers/r;->c(Lio/reactivex/internal/observers/q;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    invoke-interface {v0, p0, p1}, Lio/reactivex/internal/observers/r;->a(Lio/reactivex/internal/observers/q;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, Lio/reactivex/internal/observers/q;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    invoke-interface {v0, p0, p1}, Lio/reactivex/internal/observers/r;->d(Lio/reactivex/internal/observers/q;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    invoke-interface {p1}, Lio/reactivex/internal/observers/r;->b()V

    :goto_0
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

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lio/reactivex/internal/fuseable/f;->b(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lio/reactivex/internal/observers/q;->f:I

    iput-object p1, p0, Lio/reactivex/internal/observers/q;->d:Lio/reactivex/internal/fuseable/j;

    iput-boolean v1, p0, Lio/reactivex/internal/observers/q;->e:Z

    iget-object p1, p0, Lio/reactivex/internal/observers/q;->b:Lio/reactivex/internal/observers/r;

    invoke-interface {p1, p0}, Lio/reactivex/internal/observers/r;->c(Lio/reactivex/internal/observers/q;)V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lio/reactivex/internal/observers/q;->f:I

    iput-object p1, p0, Lio/reactivex/internal/observers/q;->d:Lio/reactivex/internal/fuseable/j;

    return-void

    :cond_1
    iget p1, p0, Lio/reactivex/internal/observers/q;->c:I

    neg-int p1, p1

    invoke-static {p1}, Lio/reactivex/internal/util/s;->c(I)Lio/reactivex/internal/fuseable/j;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/internal/observers/q;->d:Lio/reactivex/internal/fuseable/j;

    :cond_2
    return-void
.end method
