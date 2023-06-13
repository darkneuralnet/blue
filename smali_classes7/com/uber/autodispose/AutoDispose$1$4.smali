.class Lcom/uber/autodispose/AutoDispose$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/ObservableSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose$1;->h(Lio/reactivex/Observable;)Lcom/uber/autodispose/ObservableSubscribeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/ObservableSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/Observable;

.field public final synthetic c:Lcom/uber/autodispose/AutoDispose$1;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/Observable;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe()Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0}, Lio/reactivex/Observable;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v0

    return-object v0
.end method

.method public subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/functions/a;",
            ")",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

.method public subscribeWith(Lio/reactivex/D;)Lio/reactivex/D;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lio/reactivex/D<",
            "-TT;>;>(TE;)TE;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$4;->b:Lio/reactivex/Observable;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$4;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribeWith(Lio/reactivex/D;)Lio/reactivex/D;

    move-result-object p1

    return-object p1
.end method
