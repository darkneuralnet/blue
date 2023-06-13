.class public final Lio/reactivex/internal/operators/maybe/O$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/maybe/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Lio/reactivex/s<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2e204f2d0e121106L


# instance fields
.field public final b:Lio/reactivex/internal/operators/maybe/O$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/maybe/O$b<",
            "TT;*>;"
        }
    .end annotation
.end field

.field public final c:I


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/maybe/O$b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/maybe/O$b<",
            "TT;*>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/maybe/O$c;->b:Lio/reactivex/internal/operators/maybe/O$b;

    iput p2, p0, Lio/reactivex/internal/operators/maybe/O$c;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/internal/disposables/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/O$c;->b:Lio/reactivex/internal/operators/maybe/O$b;

    iget v1, p0, Lio/reactivex/internal/operators/maybe/O$c;->c:I

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/maybe/O$b;->b(I)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/O$c;->b:Lio/reactivex/internal/operators/maybe/O$b;

    iget v1, p0, Lio/reactivex/internal/operators/maybe/O$c;->c:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/internal/operators/maybe/O$b;->c(Ljava/lang/Throwable;I)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->h(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/O$c;->b:Lio/reactivex/internal/operators/maybe/O$b;

    iget v1, p0, Lio/reactivex/internal/operators/maybe/O$c;->c:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/internal/operators/maybe/O$b;->d(Ljava/lang/Object;I)V

    return-void
.end method
