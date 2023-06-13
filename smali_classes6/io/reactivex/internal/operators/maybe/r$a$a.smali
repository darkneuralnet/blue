.class public final Lio/reactivex/internal/operators/maybe/r$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/maybe/r$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/s<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/maybe/r$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/maybe/r$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/maybe/r$a$a;->b:Lio/reactivex/internal/operators/maybe/r$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/r$a$a;->b:Lio/reactivex/internal/operators/maybe/r$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/maybe/r$a;->b:Lio/reactivex/s;

    invoke-interface {v0}, Lio/reactivex/s;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/r$a$a;->b:Lio/reactivex/internal/operators/maybe/r$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/maybe/r$a;->b:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/r$a$a;->b:Lio/reactivex/internal/operators/maybe/r$a;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/r$a$a;->b:Lio/reactivex/internal/operators/maybe/r$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/maybe/r$a;->b:Lio/reactivex/s;

    invoke-interface {v0, p1}, Lio/reactivex/s;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
