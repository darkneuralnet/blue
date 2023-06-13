.class final Lcom/uber/autodispose/AutoDisposeObservable;
.super Lio/reactivex/Observable;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/ObservableSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "TT;>;",
        "Lcom/uber/autodispose/ObservableSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposeObservable;->b:Lio/reactivex/B;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDisposeObservable;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposeObservable;->b:Lio/reactivex/B;

    new-instance v1, Lcom/uber/autodispose/AutoDisposingObserverImpl;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDisposeObservable;->c:Lio/reactivex/h;

    invoke-direct {v1, v2, p1}, Lcom/uber/autodispose/AutoDisposingObserverImpl;-><init>(Lio/reactivex/h;Lio/reactivex/D;)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
