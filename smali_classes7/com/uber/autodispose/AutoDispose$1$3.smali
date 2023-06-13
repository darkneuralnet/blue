.class Lcom/uber/autodispose/AutoDispose$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/MaybeSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose$1;->g(Lio/reactivex/p;)Lcom/uber/autodispose/MaybeSubscribeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/MaybeSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/p;

.field public final synthetic c:Lcom/uber/autodispose/AutoDispose$1;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/p;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1$3;->c:Lcom/uber/autodispose/AutoDispose$1;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDispose$1$3;->b:Lio/reactivex/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe()Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeMaybe;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$3;->b:Lio/reactivex/p;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$3;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeMaybe;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    invoke-virtual {v0}, Lio/reactivex/p;->subscribe()Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeMaybe;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$3;->b:Lio/reactivex/p;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$3;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeMaybe;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeMaybe;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$3;->b:Lio/reactivex/p;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$3;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeMaybe;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2}, Lio/reactivex/p;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeMaybe;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$3;->b:Lio/reactivex/p;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$3;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeMaybe;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2, p3}, Lio/reactivex/p;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method
