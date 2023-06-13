.class public final Lio/reactivex/internal/operators/completable/d;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/d$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/g;


# direct methods
.method public constructor <init>(Lio/reactivex/g;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/d;->b:Lio/reactivex/g;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 1

    new-instance v0, Lio/reactivex/internal/operators/completable/d$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/completable/d$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    :try_start_0
    iget-object p1, p0, Lio/reactivex/internal/operators/completable/d;->b:Lio/reactivex/g;

    invoke-interface {p1, v0}, Lio/reactivex/g;->a(Lio/reactivex/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/completable/d$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
