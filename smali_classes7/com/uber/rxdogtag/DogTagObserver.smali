.class final Lcom/uber/rxdogtag/DogTagObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/observers/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/observers/f;"
    }
.end annotation


# instance fields
.field private final config:Lcom/uber/rxdogtag/M$b;

.field private final delegate:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final t:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/rxdogtag/M$b;",
            "Lio/reactivex/D<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    iput-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iput-object p2, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    return-void
.end method

.method public static synthetic a(Lcom/uber/rxdogtag/DogTagObserver;Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/DogTagObserver;->lambda$onSubscribe$1(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public static synthetic b(Lcom/uber/rxdogtag/DogTagObserver;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/DogTagObserver;->lambda$onComplete$6(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lcom/uber/rxdogtag/DogTagObserver;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/DogTagObserver;->lambda$onNext$2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lcom/uber/rxdogtag/DogTagObserver;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/DogTagObserver;->lambda$onNext$3(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lcom/uber/rxdogtag/DogTagObserver;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/DogTagObserver;->lambda$onSubscribe$0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic lambda$onComplete$6(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    const-string v2, "onComplete"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onError$4(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    const-string v2, "onError"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onError$5(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic lambda$onNext$2(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    const-string v2, "onNext"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onNext$3(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic lambda$onSubscribe$0(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    const-string v2, "onSubscribe"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onSubscribe$1(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void
.end method


# virtual methods
.method public hasCustomOnError()Z
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    instance-of v1, v0, Lio/reactivex/observers/f;

    if-eqz v1, :cond_0

    check-cast v0, Lio/reactivex/observers/f;

    invoke-interface {v0}, Lio/reactivex/observers/f;->hasCustomOnError()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/o;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/o;-><init>(Lcom/uber/rxdogtag/DogTagObserver;)V

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/uber/rxdogtag/p;

    invoke-direct {v2, v1}, Lcom/uber/rxdogtag/p;-><init>(Lio/reactivex/D;)V

    invoke-static {v0, v2}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/DogTagObserver;->t:Ljava/lang/Throwable;

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/q;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/q;-><init>(Lcom/uber/rxdogtag/DogTagObserver;)V

    new-instance v1, Lcom/uber/rxdogtag/r;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/r;-><init>(Lcom/uber/rxdogtag/DogTagObserver;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->config:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/m;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/m;-><init>(Lcom/uber/rxdogtag/DogTagObserver;)V

    new-instance v1, Lcom/uber/rxdogtag/n;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/n;-><init>(Lcom/uber/rxdogtag/DogTagObserver;Lio/reactivex/disposables/c;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/DogTagObserver;->delegate:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method
