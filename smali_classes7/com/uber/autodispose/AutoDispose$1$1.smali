.class Lcom/uber/autodispose/AutoDispose$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/CompletableSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDispose$1;->e(Lio/reactivex/c;)Lcom/uber/autodispose/CompletableSubscribeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/c;

.field public final synthetic c:Lcom/uber/autodispose/AutoDispose$1;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDispose$1;Lio/reactivex/c;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDispose$1$1;->c:Lcom/uber/autodispose/AutoDispose$1;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDispose$1$1;->b:Lio/reactivex/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeCompletable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$1;->b:Lio/reactivex/c;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$1;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeCompletable;-><init>(Lio/reactivex/c;Lio/reactivex/h;)V

    invoke-virtual {v0, p1}, Lio/reactivex/c;->b(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/a;",
            "Lio/reactivex/functions/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/disposables/c;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/AutoDisposeCompletable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$1;->b:Lio/reactivex/c;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$1;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeCompletable;-><init>(Lio/reactivex/c;Lio/reactivex/h;)V

    invoke-virtual {v0, p1, p2}, Lio/reactivex/c;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public subscribe()Lio/reactivex/disposables/c;
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposeCompletable;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDispose$1$1;->b:Lio/reactivex/c;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDispose$1$1;->c:Lcom/uber/autodispose/AutoDispose$1;

    iget-object v2, v2, Lcom/uber/autodispose/AutoDispose$1;->a:Lio/reactivex/h;

    invoke-direct {v0, v1, v2}, Lcom/uber/autodispose/AutoDisposeCompletable;-><init>(Lio/reactivex/c;Lio/reactivex/h;)V

    invoke-virtual {v0}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v0

    return-object v0
.end method
