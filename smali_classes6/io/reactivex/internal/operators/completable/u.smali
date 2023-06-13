.class public final Lio/reactivex/internal/operators/completable/u;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/u$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/h;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/u;->b:Lio/reactivex/h;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/u;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 3

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/u;->b:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/completable/u$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/completable/u;->c:Lio/reactivex/E;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/completable/u$a;-><init>(Lio/reactivex/f;Lio/reactivex/E;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
