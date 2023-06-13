.class Lcom/uber/autodispose/AutoDispose$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/FlowableSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose$1;->f(Lio/reactivex/k;)Lcom/uber/autodispose/FlowableSubscribeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/FlowableSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/k;

.field public final synthetic c:Lcom/uber/autodispose/AutoDispose$1;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/k;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1$2;->c:Lcom/uber/autodispose/AutoDispose$1;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDispose$1$2;->b:Lio/reactivex/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe()Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeFlowable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$2;->b:Lio/reactivex/k;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$2;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeFlowable;-><init>(Lna4;Lio/reactivex/h;)V

    invoke-virtual {v0}, Lio/reactivex/k;->subscribe()Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeFlowable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$2;->b:Lio/reactivex/k;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$2;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeFlowable;-><init>(Lna4;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/k;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeFlowable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$2;->b:Lio/reactivex/k;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$2;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeFlowable;-><init>(Lna4;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2}, Lio/reactivex/k;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method
