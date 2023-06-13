.class public final Lcom/uber/rxdogtag/autodispose/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/rxdogtag/E;


# static fields
.field public static final a:Lcom/uber/rxdogtag/autodispose/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/uber/rxdogtag/autodispose/b;

    invoke-direct {v0}, Lcom/uber/rxdogtag/autodispose/b;-><init>()V

    sput-object v0, Lcom/uber/rxdogtag/autodispose/b;->a:Lcom/uber/rxdogtag/autodispose/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/k;LhT5;)LhT5;
    .locals 0

    instance-of p1, p2, Lcom/uber/autodispose/observers/AutoDisposingSubscriber;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/uber/autodispose/observers/AutoDisposingSubscriber;

    invoke-interface {p2}, Lcom/uber/autodispose/observers/AutoDisposingSubscriber;->w()LhT5;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public b(Lio/reactivex/F;Lio/reactivex/I;)Lio/reactivex/I;
    .locals 0

    instance-of p1, p2, Lcom/uber/autodispose/observers/AutoDisposingSingleObserver;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/uber/autodispose/observers/AutoDisposingSingleObserver;

    invoke-interface {p2}, Lcom/uber/autodispose/observers/AutoDisposingSingleObserver;->f()Lio/reactivex/I;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public c(Lio/reactivex/Observable;Lio/reactivex/D;)Lio/reactivex/D;
    .locals 0

    instance-of p1, p2, Lcom/uber/autodispose/observers/AutoDisposingObserver;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/uber/autodispose/observers/AutoDisposingObserver;

    invoke-interface {p2}, Lcom/uber/autodispose/observers/AutoDisposingObserver;->f()Lio/reactivex/D;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public d(Lio/reactivex/c;Lio/reactivex/f;)Lio/reactivex/f;
    .locals 0

    instance-of p1, p2, Lcom/uber/autodispose/observers/AutoDisposingCompletableObserver;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/uber/autodispose/observers/AutoDisposingCompletableObserver;

    invoke-interface {p2}, Lcom/uber/autodispose/observers/AutoDisposingCompletableObserver;->f()Lio/reactivex/f;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public e(Lio/reactivex/p;Lio/reactivex/s;)Lio/reactivex/s;
    .locals 0

    instance-of p1, p2, Lcom/uber/autodispose/observers/AutoDisposingMaybeObserver;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/uber/autodispose/observers/AutoDisposingMaybeObserver;

    invoke-interface {p2}, Lcom/uber/autodispose/observers/AutoDisposingMaybeObserver;->f()Lio/reactivex/s;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AutoDisposeObserverHandler"

    return-object v0
.end method
