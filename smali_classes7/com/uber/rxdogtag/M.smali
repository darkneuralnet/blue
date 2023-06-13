.class public final Lcom/uber/rxdogtag/M;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uber/rxdogtag/M$d;,
        Lcom/uber/rxdogtag/M$b;,
        Lcom/uber/rxdogtag/M$e;,
        Lcom/uber/rxdogtag/M$c;,
        Lcom/uber/rxdogtag/M$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/InstantiationError;

    invoke-direct {v0}, Ljava/lang/InstantiationError;-><init>()V

    throw v0
.end method

.method public static synthetic a(Lcom/uber/rxdogtag/M$b;Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/uber/rxdogtag/M;->t(Lcom/uber/rxdogtag/M$b;Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/uber/rxdogtag/M$b;Lio/reactivex/p;Lio/reactivex/s;)Lio/reactivex/s;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/uber/rxdogtag/M;->u(Lcom/uber/rxdogtag/M$b;Lio/reactivex/p;Lio/reactivex/s;)Lio/reactivex/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/StackTraceElement;)Z
    .locals 0

    invoke-static {p0}, Lcom/uber/rxdogtag/M;->p(Ljava/lang/StackTraceElement;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/uber/rxdogtag/M$d;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/uber/rxdogtag/M;->q(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/uber/rxdogtag/M$d;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lcom/uber/rxdogtag/M$b;Lio/reactivex/k;LhT5;)LhT5;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/uber/rxdogtag/M;->s(Lcom/uber/rxdogtag/M$b;Lio/reactivex/k;LhT5;)LhT5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/uber/rxdogtag/M$b;Lio/reactivex/Observable;Lio/reactivex/D;)Lio/reactivex/D;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/uber/rxdogtag/M;->r(Lcom/uber/rxdogtag/M$b;Lio/reactivex/Observable;Lio/reactivex/D;)Lio/reactivex/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/uber/rxdogtag/M$b;Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/uber/rxdogtag/M;->v(Lcom/uber/rxdogtag/M$b;Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/uber/rxdogtag/M$b;)V
    .locals 0

    invoke-static {p0}, Lcom/uber/rxdogtag/M;->o(Lcom/uber/rxdogtag/M$b;)V

    return-void
.end method

.method public static i()Lcom/uber/rxdogtag/M$a;
    .locals 1

    new-instance v0, Lcom/uber/rxdogtag/M$a;

    invoke-direct {v0}, Lcom/uber/rxdogtag/M$a;-><init>()V

    return-object v0
.end method

.method public static j(Ljava/lang/String;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static k(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)Lio/reactivex/exceptions/OnErrorNotImplementedException;
    .locals 10

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->c:Ljava/util/Set;

    invoke-static {p1, v0}, Lcom/uber/rxdogtag/M;->l(Ljava/lang/Throwable;Ljava/util/Set;)Ljava/lang/StackTraceElement;

    move-result-object p1

    iget-boolean v0, p0, Lcom/uber/rxdogtag/M$b;->d:Z

    if-eqz v0, :cond_0

    instance-of v0, p2, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :cond_0
    instance-of v0, p2, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    const-string v1, ""

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    move-object v3, p2

    move-object p2, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    new-instance v3, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    invoke-direct {v3, v0, p2}, Lio/reactivex/exceptions/OnErrorNotImplementedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-array v0, v2, [Ljava/lang/StackTraceElement;

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    :goto_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v4, 0x3

    if-eqz p3, :cond_3

    const/4 v5, 0x4

    goto :goto_1

    :cond_3
    move v5, v4

    :goto_1
    iget-boolean p0, p0, Lcom/uber/rxdogtag/M$b;->a:Z

    const/4 v6, 0x1

    if-eqz p0, :cond_4

    array-length p0, v0

    add-int/2addr p0, v6

    new-array p0, p0, [Ljava/lang/StackTraceElement;

    aput-object p1, p0, v2

    array-length p1, v0

    if-eqz p1, :cond_8

    array-length p1, v0

    invoke-static {v0, v2, p0, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_4
    new-instance p0, Lcom/uber/rxdogtag/F;

    invoke-direct {p0}, Lcom/uber/rxdogtag/F;-><init>()V

    invoke-static {v0, p0}, Lcom/uber/rxdogtag/M;->n([Ljava/lang/Object;Lcom/uber/rxdogtag/M$e;)I

    move-result p0

    const/4 v7, -0x1

    if-eq p0, v7, :cond_5

    add-int/2addr p0, v6

    goto :goto_2

    :cond_5
    move p0, v2

    :goto_2
    array-length v7, v0

    add-int/2addr v7, v5

    sub-int/2addr v7, p0

    new-array v7, v7, [Ljava/lang/StackTraceElement;

    aput-object p1, v7, v2

    new-instance p1, Ljava/lang/StackTraceElement;

    const-string v8, "[[ \u2191\u2191 Inferred subscribe point \u2191\u2191 ]]"

    invoke-direct {p1, v8, v1, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    aput-object p1, v7, v6

    const/4 p1, 0x2

    if-eqz p3, :cond_6

    new-instance v8, Ljava/lang/StackTraceElement;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p3, v6, v2

    const-string p3, "[[ Originating callback: %s ]]"

    invoke-static {v9, p3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {v8, p3, v1, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    aput-object v8, v7, p1

    goto :goto_3

    :cond_6
    move v4, p1

    :goto_3
    new-instance p1, Ljava/lang/StackTraceElement;

    const-string p3, "[[ \u2193\u2193 Original trace \u2193\u2193 ]]"

    invoke-direct {p1, p3, v1, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    aput-object p1, v7, v4

    array-length p1, v0

    if-eqz p1, :cond_7

    array-length p1, v0

    sub-int/2addr p1, p0

    invoke-static {v0, p0, v7, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    move-object p0, v7

    :cond_8
    :goto_4
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object v3
.end method

.method public static l(Ljava/lang/Throwable;Ljava/util/Set;)Ljava/lang/StackTraceElement;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/StackTraceElement;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lcom/uber/rxdogtag/M;->j(Ljava/lang/String;Ljava/util/Set;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v3

    :cond_1
    new-instance p0, Ljava/lang/StackTraceElement;

    const-string p1, "Unknown"

    const-string v0, "unknown"

    invoke-direct {p0, p1, v0, v0, v1}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0
.end method

.method public static m(Lcom/uber/rxdogtag/M$d;Ljava/lang/Runnable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/rxdogtag/M$d<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    new-instance v2, Lcom/uber/rxdogtag/L;

    invoke-direct {v2, v0, p0}, Lcom/uber/rxdogtag/L;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/uber/rxdogtag/M$d;)V

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Lio/reactivex/exceptions/OnErrorNotImplementedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-interface {p0, p1}, Lcom/uber/rxdogtag/M$d;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/uber/rxdogtag/M$d;->accept(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    throw p0
.end method

.method public static n([Ljava/lang/Object;Lcom/uber/rxdogtag/M$e;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Lcom/uber/rxdogtag/M$e<",
            "TT;>;)I"
        }
    .end annotation

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    aget-object v1, p0, v0

    invoke-interface {p1, v1}, Lcom/uber/rxdogtag/M$e;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static declared-synchronized o(Lcom/uber/rxdogtag/M$b;)V
    .locals 2

    const-class v0, Lcom/uber/rxdogtag/M;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/uber/rxdogtag/G;

    invoke-direct {v1, p0}, Lcom/uber/rxdogtag/G;-><init>(Lcom/uber/rxdogtag/M$b;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->H(Lio/reactivex/functions/c;)V

    new-instance v1, Lcom/uber/rxdogtag/H;

    invoke-direct {v1, p0}, Lcom/uber/rxdogtag/H;-><init>(Lcom/uber/rxdogtag/M$b;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->F(Lio/reactivex/functions/c;)V

    new-instance v1, Lcom/uber/rxdogtag/I;

    invoke-direct {v1, p0}, Lcom/uber/rxdogtag/I;-><init>(Lcom/uber/rxdogtag/M$b;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->I(Lio/reactivex/functions/c;)V

    new-instance v1, Lcom/uber/rxdogtag/J;

    invoke-direct {v1, p0}, Lcom/uber/rxdogtag/J;-><init>(Lcom/uber/rxdogtag/M$b;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->G(Lio/reactivex/functions/c;)V

    new-instance v1, Lcom/uber/rxdogtag/K;

    invoke-direct {v1, p0}, Lcom/uber/rxdogtag/K;-><init>(Lcom/uber/rxdogtag/M$b;)V

    invoke-static {v1}, Lio/reactivex/plugins/a;->E(Lio/reactivex/functions/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static synthetic p(Ljava/lang/StackTraceElement;)Z
    .locals 1

    const-string v0, "[[ \u2193\u2193 Original trace \u2193\u2193 ]]"

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic q(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/uber/rxdogtag/M$d;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    instance-of v0, p3, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    if-eqz v0, :cond_0

    invoke-interface {p1, p3}, Lcom/uber/rxdogtag/M$d;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p3, Ljava/lang/NullPointerException;

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "subscribeActual failed"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/uber/rxdogtag/M$d;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0, p2, p3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic r(Lcom/uber/rxdogtag/M$b;Lio/reactivex/Observable;Lio/reactivex/D;)Lio/reactivex/D;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/rxdogtag/E;

    invoke-interface {v1, p1, p2}, Lcom/uber/rxdogtag/E;->c(Lio/reactivex/Observable;Lio/reactivex/D;)Lio/reactivex/D;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/rxdogtag/M;->x(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/uber/rxdogtag/DogTagObserver;

    invoke-direct {p1, p0, p2}, Lcom/uber/rxdogtag/DogTagObserver;-><init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/D;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public static synthetic s(Lcom/uber/rxdogtag/M$b;Lio/reactivex/k;LhT5;)LhT5;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/rxdogtag/E;

    invoke-interface {v1, p1, p2}, Lcom/uber/rxdogtag/E;->a(Lio/reactivex/k;LhT5;)LhT5;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/rxdogtag/M;->x(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/uber/rxdogtag/D;

    invoke-direct {p1, p0, p2}, Lcom/uber/rxdogtag/D;-><init>(Lcom/uber/rxdogtag/M$b;LhT5;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public static synthetic t(Lcom/uber/rxdogtag/M$b;Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/rxdogtag/E;

    invoke-interface {v1, p1, p2}, Lcom/uber/rxdogtag/E;->b(Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/rxdogtag/M;->x(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/uber/rxdogtag/w;

    invoke-direct {p1, p0, p2}, Lcom/uber/rxdogtag/w;-><init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/I;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public static synthetic u(Lcom/uber/rxdogtag/M$b;Lio/reactivex/p;Lio/reactivex/s;)Lio/reactivex/s;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/rxdogtag/E;

    invoke-interface {v1, p1, p2}, Lcom/uber/rxdogtag/E;->e(Lio/reactivex/p;Lio/reactivex/s;)Lio/reactivex/s;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/rxdogtag/M;->x(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/uber/rxdogtag/l;

    invoke-direct {p1, p0, p2}, Lcom/uber/rxdogtag/l;-><init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/s;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public static synthetic v(Lcom/uber/rxdogtag/M$b;Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/rxdogtag/M$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/rxdogtag/E;

    invoke-interface {v1, p1, p2}, Lcom/uber/rxdogtag/E;->d(Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/rxdogtag/M;->x(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/uber/rxdogtag/e;

    invoke-direct {p1, p0, p2}, Lcom/uber/rxdogtag/e;-><init>(Lcom/uber/rxdogtag/M$b;Lio/reactivex/f;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public static w(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/uber/rxdogtag/M;->k(Lcom/uber/rxdogtag/M$b;Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)Lio/reactivex/exceptions/OnErrorNotImplementedException;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static x(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Lio/reactivex/observers/f;

    if-eqz v0, :cond_0

    check-cast p0, Lio/reactivex/observers/f;

    invoke-interface {p0}, Lio/reactivex/observers/f;->hasCustomOnError()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
