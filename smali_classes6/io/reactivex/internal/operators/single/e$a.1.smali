.class public final Lio/reactivex/internal/operators/single/e$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/f;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/single/e;
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
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/f;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x76ddf7e9b08d21a8L


# instance fields
.field public final b:Lio/reactivex/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/I<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/I;Lio/reactivex/K;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;",
            "Lio/reactivex/K<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/e$a;->b:Lio/reactivex/I;

    iput-object p2, p0, Lio/reactivex/internal/operators/single/e$a;->c:Lio/reactivex/K;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/single/e$a;->c:Lio/reactivex/K;

    new-instance v1, Lio/reactivex/internal/observers/x;

    iget-object v2, p0, Lio/reactivex/internal/operators/single/e$a;->b:Lio/reactivex/I;

    invoke-direct {v1, p0, v2}, Lio/reactivex/internal/observers/x;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/I;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/single/e$a;->b:Lio/reactivex/I;

    invoke-interface {v0, p1}, Lio/reactivex/I;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/operators/single/e$a;->b:Lio/reactivex/I;

    invoke-interface {p1, p0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    :cond_0
    return-void
.end method
