.class public abstract Lio/reactivex/internal/operators/observable/U0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/operators/observable/U0$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/internal/operators/observable/U0$f;",
        ">;",
        "Lio/reactivex/internal/operators/observable/U0$h<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2090aef8efde5e9eL


# instance fields
.field public b:Lio/reactivex/internal/operators/observable/U0$f;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/U0$f;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/U0$a;->b:Lio/reactivex/internal/operators/observable/U0$f;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/internal/operators/observable/U0$f;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0$a;->b:Lio/reactivex/internal/operators/observable/U0$f;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/U0$a;->b:Lio/reactivex/internal/operators/observable/U0$f;

    iget p1, p0, Lio/reactivex/internal/operators/observable/U0$a;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/reactivex/internal/operators/observable/U0$a;->c:I

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public c()Lio/reactivex/internal/operators/observable/U0$f;
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$f;

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Lio/reactivex/internal/util/n;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/internal/operators/observable/U0$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lio/reactivex/internal/operators/observable/U0$f;

    invoke-direct {v1, v0}, Lio/reactivex/internal/operators/observable/U0$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lio/reactivex/internal/operators/observable/U0$a;->a(Lio/reactivex/internal/operators/observable/U0$f;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/U0$a;->l()V

    return-void
.end method

.method public final error(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lio/reactivex/internal/util/n;->g(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/U0$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$f;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/U0$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/reactivex/internal/operators/observable/U0$a;->a(Lio/reactivex/internal/operators/observable/U0$f;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/U0$a;->l()V

    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/reactivex/internal/util/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/U0$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$f;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/U0$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/reactivex/internal/operators/observable/U0$a;->a(Lio/reactivex/internal/operators/observable/U0$f;)V

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/U0$a;->k()V

    return-void
.end method

.method public final g()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$f;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$f;

    iget v1, p0, Lio/reactivex/internal/operators/observable/U0$a;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lio/reactivex/internal/operators/observable/U0$a;->c:I

    invoke-virtual {p0, v0}, Lio/reactivex/internal/operators/observable/U0$a;->i(Lio/reactivex/internal/operators/observable/U0$f;)V

    return-void
.end method

.method public final h(Lio/reactivex/internal/operators/observable/U0$d;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/U0$d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/U0$d;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/internal/operators/observable/U0$f;

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/U0$a;->c()Lio/reactivex/internal/operators/observable/U0$f;

    move-result-object v1

    iput-object v1, p1, Lio/reactivex/internal/operators/observable/U0$d;->d:Ljava/lang/Object;

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/U0$d;->e()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iput-object v3, p1, Lio/reactivex/internal/operators/observable/U0$d;->d:Ljava/lang/Object;

    return-void

    :cond_3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/reactivex/internal/operators/observable/U0$f;

    if-eqz v2, :cond_5

    iget-object v1, v2, Lio/reactivex/internal/operators/observable/U0$f;->b:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lio/reactivex/internal/operators/observable/U0$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p1, Lio/reactivex/internal/operators/observable/U0$d;->c:Lio/reactivex/D;

    invoke-static {v1, v4}, Lio/reactivex/internal/util/n;->b(Ljava/lang/Object;Lio/reactivex/D;)Z

    move-result v1

    if-eqz v1, :cond_4

    iput-object v3, p1, Lio/reactivex/internal/operators/observable/U0$d;->d:Ljava/lang/Object;

    return-void

    :cond_4
    move-object v1, v2

    goto :goto_0

    :cond_5
    iput-object v1, p1, Lio/reactivex/internal/operators/observable/U0$d;->d:Ljava/lang/Object;

    neg-int v0, v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_1

    return-void
.end method

.method public final i(Lio/reactivex/internal/operators/observable/U0$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final j()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$f;

    iget-object v1, v0, Lio/reactivex/internal/operators/observable/U0$f;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    new-instance v1, Lio/reactivex/internal/operators/observable/U0$f;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/reactivex/internal/operators/observable/U0$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public abstract k()V
.end method

.method public l()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/U0$a;->j()V

    return-void
.end method
