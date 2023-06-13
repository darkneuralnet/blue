.class Lcom/uber/autodispose/AutoDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/AutoDisposeConverter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose;->b(Lio/reactivex/h;)Lcom/uber/autodispose/AutoDisposeConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/AutoDisposeConverter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/h;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/reactivex/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/AutoDispose$1;->e(Lio/reactivex/c;)Lcom/uber/autodispose/CompletableSubscribeProxy;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Lio/reactivex/Observable;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/AutoDispose$1;->h(Lio/reactivex/Observable;)Lcom/uber/autodispose/ObservableSubscribeProxy;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lio/reactivex/p;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/AutoDispose$1;->g(Lio/reactivex/p;)Lcom/uber/autodispose/MaybeSubscribeProxy;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lio/reactivex/F;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/AutoDispose$1;->i(Lio/reactivex/F;)Lcom/uber/autodispose/SingleSubscribeProxy;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lio/reactivex/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/uber/autodispose/AutoDispose$1;->f(Lio/reactivex/k;)Lcom/uber/autodispose/FlowableSubscribeProxy;

    move-result-object p1

    return-object p1
.end method

.method public e(Lio/reactivex/c;)Lcom/uber/autodispose/CompletableSubscribeProxy;
    .locals 2

    sget-boolean v0, Lcom/uber/autodispose/AutoDisposePlugins;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/uber/autodispose/AutoDisposeCompletable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lcom/uber/autodispose/AutoDisposeCompletable;-><init>(Lio/reactivex/c;Lio/reactivex/h;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/AutoDispose$1$1;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/AutoDispose$1$1;-><init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/c;)V

    return-object v0
.end method

.method public f(Lio/reactivex/k;)Lcom/uber/autodispose/FlowableSubscribeProxy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;)",
            "Lcom/uber/autodispose/FlowableSubscribeProxy<",
            "TT;>;"
        }
    .end annotation

    sget-boolean v0, Lcom/uber/autodispose/AutoDisposePlugins;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/uber/autodispose/AutoDisposeFlowable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lcom/uber/autodispose/AutoDisposeFlowable;-><init>(Lna4;Lio/reactivex/h;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/AutoDispose$1$2;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/AutoDispose$1$2;-><init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/k;)V

    return-object v0
.end method

.method public g(Lio/reactivex/p;)Lcom/uber/autodispose/MaybeSubscribeProxy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/p<",
            "TT;>;)",
            "Lcom/uber/autodispose/MaybeSubscribeProxy<",
            "TT;>;"
        }
    .end annotation

    sget-boolean v0, Lcom/uber/autodispose/AutoDisposePlugins;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/uber/autodispose/AutoDisposeMaybe;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lcom/uber/autodispose/AutoDisposeMaybe;-><init>(Lio/reactivex/u;Lio/reactivex/h;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/AutoDispose$1$3;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/AutoDispose$1$3;-><init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/p;)V

    return-object v0
.end method

.method public h(Lio/reactivex/Observable;)Lcom/uber/autodispose/ObservableSubscribeProxy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lcom/uber/autodispose/ObservableSubscribeProxy<",
            "TT;>;"
        }
    .end annotation

    sget-boolean v0, Lcom/uber/autodispose/AutoDisposePlugins;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/uber/autodispose/AutoDisposeObservable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lcom/uber/autodispose/AutoDisposeObservable;-><init>(Lio/reactivex/B;Lio/reactivex/h;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/AutoDispose$1$4;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/AutoDispose$1$4;-><init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/Observable;)V

    return-object v0
.end method

.method public i(Lio/reactivex/F;)Lcom/uber/autodispose/SingleSubscribeProxy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lcom/uber/autodispose/SingleSubscribeProxy<",
            "TT;>;"
        }
    .end annotation

    sget-boolean v0, Lcom/uber/autodispose/AutoDisposePlugins;->c:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/AutoDispose$1$5;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/AutoDispose$1$5;-><init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/F;)V

    return-object v0
.end method
