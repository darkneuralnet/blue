.class final Lcom/uber/autodispose/AutoDisposeCompletable;
.super Lio/reactivex/c;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/CompletableSubscribeProxy;


# instance fields
.field public final b:Lio/reactivex/c;

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/c;Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposeCompletable;->b:Lio/reactivex/c;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDisposeCompletable;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 3

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposeCompletable;->b:Lio/reactivex/c;

    new-instance v1, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDisposeCompletable;->c:Lio/reactivex/h;

    invoke-direct {v1, v2, p1}, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;-><init>(Lio/reactivex/h;Lio/reactivex/f;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    return-void
.end method
