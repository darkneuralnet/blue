.class public final Lio/reactivex/internal/operators/observable/U0$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/B<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/observable/U0$j<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/internal/operators/observable/U0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/U0$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/internal/operators/observable/U0$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/observable/U0$j<",
            "TT;>;>;",
            "Lio/reactivex/internal/operators/observable/U0$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/U0$k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/U0$k;->c:Lio/reactivex/internal/operators/observable/U0$b;

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0$k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/internal/operators/observable/U0$j;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0$k;->c:Lio/reactivex/internal/operators/observable/U0$b;

    invoke-interface {v0}, Lio/reactivex/internal/operators/observable/U0$b;->call()Lio/reactivex/internal/operators/observable/U0$h;

    move-result-object v0

    new-instance v1, Lio/reactivex/internal/operators/observable/U0$j;

    invoke-direct {v1, v0}, Lio/reactivex/internal/operators/observable/U0$j;-><init>(Lio/reactivex/internal/operators/observable/U0$h;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/U0$k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    new-instance v1, Lio/reactivex/internal/operators/observable/U0$d;

    invoke-direct {v1, v0, p1}, Lio/reactivex/internal/operators/observable/U0$d;-><init>(Lio/reactivex/internal/operators/observable/U0$j;Lio/reactivex/D;)V

    invoke-interface {p1, v1}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/observable/U0$j;->a(Lio/reactivex/internal/operators/observable/U0$d;)Z

    invoke-virtual {v1}, Lio/reactivex/internal/operators/observable/U0$d;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Lio/reactivex/internal/operators/observable/U0$j;->b(Lio/reactivex/internal/operators/observable/U0$d;)V

    return-void

    :cond_2
    iget-object p1, v0, Lio/reactivex/internal/operators/observable/U0$j;->b:Lio/reactivex/internal/operators/observable/U0$h;

    invoke-interface {p1, v1}, Lio/reactivex/internal/operators/observable/U0$h;->h(Lio/reactivex/internal/operators/observable/U0$d;)V

    return-void
.end method
