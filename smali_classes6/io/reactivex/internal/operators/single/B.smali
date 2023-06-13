.class public final Lio/reactivex/internal/operators/single/B;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/B$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/K;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "+TT;>;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/B;->b:Lio/reactivex/K;

    iput-object p2, p0, Lio/reactivex/internal/operators/single/B;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/single/B$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/single/B;->b:Lio/reactivex/K;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/single/B$a;-><init>(Lio/reactivex/I;Lio/reactivex/K;)V

    invoke-interface {p1, v0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/single/B;->c:Lio/reactivex/E;

    invoke-virtual {p1, v0}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object p1

    iget-object v0, v0, Lio/reactivex/internal/operators/single/B$a;->c:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method
