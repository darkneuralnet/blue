.class public final Lio/reactivex/internal/operators/completable/r;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/r$a;
    }
.end annotation


# instance fields
.field public final b:[Lio/reactivex/h;


# direct methods
.method public constructor <init>([Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/r;->b:[Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 6

    new-instance v0, Lio/reactivex/disposables/b;

    invoke-direct {v0}, Lio/reactivex/disposables/b;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    new-instance v2, Lio/reactivex/internal/operators/completable/r$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/completable/r;->b:[Lio/reactivex/h;

    array-length v3, v3

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, p1, v1, v0, v3}, Lio/reactivex/internal/operators/completable/r$a;-><init>(Lio/reactivex/f;Ljava/util/concurrent/atomic/AtomicBoolean;Lio/reactivex/disposables/b;I)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/r;->b:[Lio/reactivex/h;

    array-length v1, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p1, v3

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->e()Z

    move-result v5

    if-eqz v5, :cond_0

    return-void

    :cond_0
    if-nez v4, :cond_1

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "A completable source is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lio/reactivex/internal/operators/completable/r$a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-interface {v4, v2}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lio/reactivex/internal/operators/completable/r$a;->onComplete()V

    return-void
.end method
