.class public final Lio/reactivex/internal/operators/completable/b$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/f;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/completable/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/f;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x38ec1727c243e8a6L


# instance fields
.field public final b:Lio/reactivex/f;

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/f;Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/b$b;->b:Lio/reactivex/f;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/b$b;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/disposables/c;

    invoke-static {v0}, Lio/reactivex/internal/disposables/d;->b(Lio/reactivex/disposables/c;)Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/b$b;->c:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/completable/b$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/completable/b$b;->b:Lio/reactivex/f;

    invoke-direct {v1, p0, v2}, Lio/reactivex/internal/operators/completable/b$a;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/f;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/b$b;->b:Lio/reactivex/f;

    invoke-interface {v0, p1}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/b$b;->b:Lio/reactivex/f;

    invoke-interface {p1, p0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    :cond_0
    return-void
.end method
