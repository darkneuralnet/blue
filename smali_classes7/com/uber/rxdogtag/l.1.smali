.class public final Lcom/uber/rxdogtag/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/s;
.implements Lio/reactivex/observers/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/s<",
        "TT;>;",
        "Lio/reactivex/observers/f;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Throwable;

.field public final c:Lcom/uber/rxdogtag/M$b;

.field public final d:Lio/reactivex/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/s<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/rxdogtag/M$b;",
            "Lio/reactivex/s<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    iput-object v0, p0, Lcom/uber/rxdogtag/l;->b:Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iput-object p2, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    return-void
.end method

.method public static synthetic a(Lcom/uber/rxdogtag/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/l;->j(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Lcom/uber/rxdogtag/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/l;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lcom/uber/rxdogtag/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/l;->h(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lcom/uber/rxdogtag/l;Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/l;->i(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public static synthetic e(Lcom/uber/rxdogtag/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/l;->k(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/l;->b:Ljava/lang/Throwable;

    const-string v2, "onComplete"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic h(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/l;->b:Ljava/lang/Throwable;

    const-string v2, "onSubscribe"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic i(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method private synthetic j(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/l;->b:Ljava/lang/Throwable;

    const-string v2, "onSuccess"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic k(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public hasCustomOnError()Z
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

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

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/j;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/j;-><init>(Lcom/uber/rxdogtag/l;)V

    iget-object v1, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/uber/rxdogtag/k;

    invoke-direct {v2, v1}, Lcom/uber/rxdogtag/k;-><init>(Lio/reactivex/s;)V

    invoke-static {v0, v2}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-interface {v0}, Lio/reactivex/s;->onComplete()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/l;->b:Ljava/lang/Throwable;

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/f;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/f;-><init>(Lcom/uber/rxdogtag/l;)V

    new-instance v1, Lcom/uber/rxdogtag/g;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/g;-><init>(Lcom/uber/rxdogtag/l;Lio/reactivex/disposables/c;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onSubscribe(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/l;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/h;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/h;-><init>(Lcom/uber/rxdogtag/l;)V

    new-instance v1, Lcom/uber/rxdogtag/i;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/i;-><init>(Lcom/uber/rxdogtag/l;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/l;->d:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
