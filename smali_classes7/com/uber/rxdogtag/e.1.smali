.class public final Lcom/uber/rxdogtag/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/f;
.implements Lio/reactivex/observers/f;


# instance fields
.field public final b:Ljava/lang/Throwable;

.field public final c:Lcom/uber/rxdogtag/M$b;

.field public final d:Lio/reactivex/f;


# direct methods
.method public constructor <init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    iput-object v0, p0, Lcom/uber/rxdogtag/e;->b:Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iput-object p2, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

    return-void
.end method

.method public static synthetic a(Lcom/uber/rxdogtag/e;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/e;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Lcom/uber/rxdogtag/e;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/e;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lcom/uber/rxdogtag/e;Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/uber/rxdogtag/e;->g(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method private synthetic d(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/e;->b:Ljava/lang/Throwable;

    const-string v2, "onComplete"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic e(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/e;->b:Ljava/lang/Throwable;

    const-string v2, "onSubscribe"

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic g(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

    invoke-interface {v0, p1}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    return-void
.end method


# virtual methods
.method public hasCustomOnError()Z
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

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

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/a;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/a;-><init>(Lcom/uber/rxdogtag/e;)V

    iget-object v1, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/uber/rxdogtag/b;

    invoke-direct {v2, v1}, Lcom/uber/rxdogtag/b;-><init>(Lio/reactivex/f;)V

    invoke-static {v0, v2}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

    invoke-interface {v0}, Lio/reactivex/f;->onComplete()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iget-object v1, p0, Lcom/uber/rxdogtag/e;->b:Ljava/lang/Throwable;

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lcom/uber/rxdogtag/M;->w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lcom/uber/rxdogtag/e;->c:Lcom/uber/rxdogtag/M$b;

    iget-boolean v0, v0, Lcom/uber/rxdogtag/M$b;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/uber/rxdogtag/c;

    invoke-direct {v0, p0}, Lcom/uber/rxdogtag/c;-><init>(Lcom/uber/rxdogtag/e;)V

    new-instance v1, Lcom/uber/rxdogtag/d;

    invoke-direct {v1, p0, p1}, Lcom/uber/rxdogtag/d;-><init>(Lcom/uber/rxdogtag/e;Lio/reactivex/disposables/c;)V

    invoke-static {v0, v1}, Lcom/uber/rxdogtag/M;->m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/uber/rxdogtag/e;->d:Lio/reactivex/f;

    invoke-interface {v0, p1}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    :goto_0
    return-void
.end method
