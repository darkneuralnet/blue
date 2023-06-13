.class public final Lio/reactivex/internal/operators/observable/U0;
.super Lio/reactivex/observables/a;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/disposables/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/U0$g;,
        Lio/reactivex/internal/operators/observable/U0$e;,
        Lio/reactivex/internal/operators/observable/U0$k;,
        Lio/reactivex/internal/operators/observable/U0$l;,
        Lio/reactivex/internal/operators/observable/U0$i;,
        Lio/reactivex/internal/operators/observable/U0$c;,
        Lio/reactivex/internal/operators/observable/U0$o;,
        Lio/reactivex/internal/operators/observable/U0$m;,
        Lio/reactivex/internal/operators/observable/U0$n;,
        Lio/reactivex/internal/operators/observable/U0$a;,
        Lio/reactivex/internal/operators/observable/U0$f;,
        Lio/reactivex/internal/operators/observable/U0$p;,
        Lio/reactivex/internal/operators/observable/U0$h;,
        Lio/reactivex/internal/operators/observable/U0$d;,
        Lio/reactivex/internal/operators/observable/U0$j;,
        Lio/reactivex/internal/operators/observable/U0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/observables/a<",
        "TT;>;",
        "Lio/reactivex/internal/disposables/g;"
    }
.end annotation


# static fields
.field public static final f:Lio/reactivex/internal/operators/observable/U0$b;


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/observable/U0$j<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/internal/operators/observable/U0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/U0$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$o;

    invoke-direct {v0}, Lio/reactivex/internal/operators/observable/U0$o;-><init>()V

    sput-object v0, Lio/reactivex/internal/operators/observable/U0;->f:Lio/reactivex/internal/operators/observable/U0$b;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/internal/operators/observable/U0$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/observable/U0$j<",
            "TT;>;>;",
            "Lio/reactivex/internal/operators/observable/U0$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/observables/a;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/U0;->e:Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/U0;->b:Lio/reactivex/B;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/U0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/U0;->d:Lio/reactivex/internal/operators/observable/U0$b;

    return-void
.end method

.method public static l(Lio/reactivex/B;I)Lio/reactivex/observables/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TT;>;I)",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Lio/reactivex/internal/operators/observable/U0;->p(Lio/reactivex/B;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/observable/U0$i;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/U0$i;-><init>(I)V

    invoke-static {p0, v0}, Lio/reactivex/internal/operators/observable/U0;->o(Lio/reactivex/B;Lio/reactivex/internal/operators/observable/U0$b;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lio/reactivex/B;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/observables/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    const v5, 0x7fffffff

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/U0;->n(Lio/reactivex/B;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;I)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method

.method public static n(Lio/reactivex/B;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;I)Lio/reactivex/observables/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "I)",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/observable/U0$l;

    move-object v0, v6

    move v1, p5

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/U0$l;-><init>(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-static {p0, v6}, Lio/reactivex/internal/operators/observable/U0;->o(Lio/reactivex/B;Lio/reactivex/internal/operators/observable/U0$b;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lio/reactivex/B;Lio/reactivex/internal/operators/observable/U0$b;)Lio/reactivex/observables/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/internal/operators/observable/U0$b<",
            "TT;>;)",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Lio/reactivex/internal/operators/observable/U0$k;

    invoke-direct {v1, v0, p1}, Lio/reactivex/internal/operators/observable/U0$k;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/internal/operators/observable/U0$b;)V

    new-instance v2, Lio/reactivex/internal/operators/observable/U0;

    invoke-direct {v2, v1, p0, v0, p1}, Lio/reactivex/internal/operators/observable/U0;-><init>(Lio/reactivex/B;Lio/reactivex/B;Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/internal/operators/observable/U0$b;)V

    invoke-static {v2}, Lio/reactivex/plugins/a;->r(Lio/reactivex/observables/a;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method

.method public static p(Lio/reactivex/B;)Lio/reactivex/observables/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/B<",
            "+TT;>;)",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/operators/observable/U0;->f:Lio/reactivex/internal/operators/observable/U0$b;

    invoke-static {p0, v0}, Lio/reactivex/internal/operators/observable/U0;->o(Lio/reactivex/B;Lio/reactivex/internal/operators/observable/U0$b;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/util/concurrent/Callable;Lio/reactivex/functions/o;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lio/reactivex/observables/a<",
            "TU;>;>;",
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/Observable<",
            "TU;>;+",
            "Lio/reactivex/B<",
            "TR;>;>;)",
            "Lio/reactivex/Observable<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$e;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/observable/U0$e;-><init>(Ljava/util/concurrent/Callable;Lio/reactivex/functions/o;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lio/reactivex/observables/a;Lio/reactivex/E;)Lio/reactivex/observables/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/observables/a<",
            "TT;>;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/observables/a<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lio/reactivex/internal/operators/observable/U0$g;

    invoke-direct {v0, p0, p1}, Lio/reactivex/internal/operators/observable/U0$g;-><init>(Lio/reactivex/observables/a;Lio/reactivex/Observable;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->r(Lio/reactivex/observables/a;)Lio/reactivex/observables/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast p1, Lio/reactivex/internal/operators/observable/U0$j;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Lio/reactivex/functions/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "Lio/reactivex/disposables/c;",
            ">;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/U0$j;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/U0;->d:Lio/reactivex/internal/operators/observable/U0$b;

    invoke-interface {v1}, Lio/reactivex/internal/operators/observable/U0$b;->call()Lio/reactivex/internal/operators/observable/U0$h;

    move-result-object v1

    new-instance v2, Lio/reactivex/internal/operators/observable/U0$j;

    invoke-direct {v2, v1}, Lio/reactivex/internal/operators/observable/U0$j;-><init>(Lio/reactivex/internal/operators/observable/U0$h;)V

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/U0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    iget-object v1, v0, Lio/reactivex/internal/operators/observable/U0$j;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Lio/reactivex/internal/operators/observable/U0$j;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    :try_start_0
    invoke-interface {p1, v0}, Lio/reactivex/functions/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/U0;->b:Lio/reactivex/B;

    invoke-interface {p1, v0}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_5

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/U0$j;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    :cond_5
    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lio/reactivex/internal/util/k;->e(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
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

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0;->e:Lio/reactivex/B;

    invoke-interface {v0, p1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
