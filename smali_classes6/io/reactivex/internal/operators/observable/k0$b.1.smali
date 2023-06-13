.class public final Lio/reactivex/internal/operators/observable/k0$b;
.super Lio/reactivex/observables/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/observables/b<",
        "TK;TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/internal/operators/observable/k0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/k0$c<",
            "TT;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lio/reactivex/internal/operators/observable/k0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lio/reactivex/internal/operators/observable/k0$c<",
            "TT;TK;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/observables/b;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/k0$b;->c:Lio/reactivex/internal/operators/observable/k0$c;

    return-void
.end method

.method public static a(Ljava/lang/Object;ILio/reactivex/internal/operators/observable/k0$a;Z)Lio/reactivex/internal/operators/observable/k0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            ">(TK;I",
            "Lio/reactivex/internal/operators/observable/k0$a<",
            "*TK;TT;>;Z)",
            "Lio/reactivex/internal/operators/observable/k0$b<",
            "TK;TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/k0$c;

    invoke-direct {v0, p1, p2, p0, p3}, Lio/reactivex/internal/operators/observable/k0$c;-><init>(ILio/reactivex/internal/operators/observable/k0$a;Ljava/lang/Object;Z)V

    new-instance p1, Lio/reactivex/internal/operators/observable/k0$b;

    invoke-direct {p1, p0, v0}, Lio/reactivex/internal/operators/observable/k0$b;-><init>(Ljava/lang/Object;Lio/reactivex/internal/operators/observable/k0$c;)V

    return-object p1
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/k0$b;->c:Lio/reactivex/internal/operators/observable/k0$c;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/k0$c;->c()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/k0$b;->c:Lio/reactivex/internal/operators/observable/k0$c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/k0$c;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/k0$b;->c:Lio/reactivex/internal/operators/observable/k0$c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/k0$c;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/k0$b;->c:Lio/reactivex/internal/operators/observable/k0$c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/k0$c;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
