.class public final Lio/reactivex/internal/operators/flowable/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/o<",
        "TT;>;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/f;

.field public c:LoT5;


# direct methods
.method public constructor <init>(Lio/reactivex/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/E$a;->b:Lio/reactivex/f;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->b:Lio/reactivex/f;

    invoke-interface {v0, p0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    sget-object v0, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    sget-object v1, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 1

    sget-object v0, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->b:Lio/reactivex/f;

    invoke-interface {v0}, Lio/reactivex/f;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lio/reactivex/internal/subscriptions/g;->b:Lio/reactivex/internal/subscriptions/g;

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->c:LoT5;

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/E$a;->b:Lio/reactivex/f;

    invoke-interface {v0, p1}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method
