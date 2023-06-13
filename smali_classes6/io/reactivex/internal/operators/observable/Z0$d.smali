.class public final Lio/reactivex/internal/operators/observable/Z0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/Z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/Z0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/Z0$c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/Z0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/Z0$c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/Z0$d;->b:Lio/reactivex/internal/operators/observable/Z0$c;

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Z0$d;->b:Lio/reactivex/internal/operators/observable/Z0$c;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/Z0$c;->a()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Z0$d;->b:Lio/reactivex/internal/operators/observable/Z0$c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/Z0$c;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/Z0$d;->b:Lio/reactivex/internal/operators/observable/Z0$c;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/Z0$c;->g()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Z0$d;->b:Lio/reactivex/internal/operators/observable/Z0$c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/Z0$c;->h(Lio/reactivex/disposables/c;)Z

    return-void
.end method
