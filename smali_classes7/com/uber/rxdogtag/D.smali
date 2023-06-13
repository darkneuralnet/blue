.class public final Lcom/uber/rxdogtag/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements Lio/reactivex/observers/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/o<",
        "TT;>;",
        "Lio/reactivex/observers/f;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Throwable;

.field public final c:Lcom/uber/rxdogtag/M$b;

.field public final d:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/uber/rxdogtag/M$b;LhT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/rxdogtag/M$b;",
            "LhT5<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    iput-object v0, p0, Lcom/uber/rxdogtag/D;->b:Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iput-object p2, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    return-void
.end method

.method public static synthetic b(Lcom/uber/rxdogtag/D;LoT5;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/D;->l(LoT5;)V

    return-void
.end method

.method public static synthetic c(Lcom/uber/rxdogtag/D;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/D;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lcom/uber/rxdogtag/D;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/D;->i(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lcom/uber/rxdogtag/D;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/D;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Lcom/uber/rxdogtag/D;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/D;->k(Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/D;->b:Ljava/lang/Throwable;

    const-string v2, "onComplete"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic i(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/D;->b:Ljava/lang/Throwable;

    const-string v2, "onNext"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic j(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic k(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/D;->b:Ljava/lang/Throwable;

    const-string v2, "onSubscribe"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic l(LoT5;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-interface {v0, p1}, LhT5;->a(LoT5;)V

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/x;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/x;-><init>(Lcom/uber/rxdogtag/D;)V

    new-instance v1, Lcom/uber/rxdogtag/y;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/y;-><init>(Lcom/uber/rxdogtag/D;LoT5;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-interface {v0, p1}, LhT5;->a(LoT5;)V

    :goto_0
    return-void
.end method

.method public hasCustomOnError()Z
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

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

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/z;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/z;-><init>(Lcom/uber/rxdogtag/D;)V

    iget-object v1, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/uber/rxdogtag/A;

    invoke-direct {v2, v1}, Lcom/uber/rxdogtag/A;-><init>(LhT5;)V

    invoke-static {v0, v2}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/D;->b:Ljava/lang/Throwable;

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

    iget-object v0, p0, Lcom/uber/rxdogtag/D;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/B;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/B;-><init>(Lcom/uber/rxdogtag/D;)V

    new-instance v1, Lcom/uber/rxdogtag/C;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/C;-><init>(Lcom/uber/rxdogtag/D;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/D;->d:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
