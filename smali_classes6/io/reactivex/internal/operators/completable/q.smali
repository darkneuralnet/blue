.class public final Lio/reactivex/internal/operators/completable/q;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/q$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/q;->b:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/q;->b:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/completable/q$a;

    invoke-direct {v1, p1}, Lio/reactivex/internal/operators/completable/q$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
