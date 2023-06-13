.class public final Lio/reactivex/internal/operators/completable/y;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/y$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/h;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/y;->b:Lio/reactivex/h;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/y;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    new-instance v0, Lio/reactivex/internal/operators/completable/y$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/completable/y;->b:Lio/reactivex/h;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/completable/y$a;-><init>(Lio/reactivex/f;Lio/reactivex/h;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/y;->c:Lio/reactivex/E;

    invoke-virtual {p1, v0}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    move-result-object p1

    iget-object v0, v0, Lio/reactivex/internal/operators/completable/y$a;->c:Lio/reactivex/internal/disposables/h;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/disposables/h;->a(Lio/reactivex/disposables/c;)Z

    return-void
.end method
