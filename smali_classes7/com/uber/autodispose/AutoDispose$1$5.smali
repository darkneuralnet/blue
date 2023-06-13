.class Lcom/uber/autodispose/AutoDispose$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/SingleSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose$1;->i(Lio/reactivex/F;)Lcom/uber/autodispose/SingleSubscribeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/SingleSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/F;

.field public final synthetic c:Lcom/uber/autodispose/AutoDispose$1;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/F;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/I;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    return-void
.end method

.method public b(Lio/reactivex/functions/b;)Lio/reactivex/disposables/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/b<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->b(Lio/reactivex/functions/b;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public subscribe()Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-virtual {v0}, Lio/reactivex/F;->subscribe()Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

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

    new-instance v0, Lcom/uber/autodispose/AutoDisposeSingle;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$5;->b:Lio/reactivex/F;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$5;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeSingle;-><init>(Lio/reactivex/K;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method
