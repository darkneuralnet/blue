.class public final Lio/reactivex/internal/operators/completable/z;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/z$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/c;

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/c;Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/z;->b:Lio/reactivex/c;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/z;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    new-instance v0, Lio/reactivex/internal/operators/completable/z$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/completable/z$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/z;->c:Lio/reactivex/h;

    iget-object v1, v0, Lio/reactivex/internal/operators/completable/z$a;->c:Lio/reactivex/internal/operators/completable/z$a$a;

    invoke-interface {p1, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/z;->b:Lio/reactivex/c;

    invoke-virtual {p1, v0}, Lio/reactivex/c;->g(Lio/reactivex/f;)V

    return-void
.end method
