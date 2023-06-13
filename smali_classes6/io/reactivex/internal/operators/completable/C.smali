.class public final Lio/reactivex/internal/operators/completable/C;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/h;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/C;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/observers/y;

    invoke-direct {v0, p1}, Lio/reactivex/internal/observers/y;-><init>(LhT5;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/C;->c:Lio/reactivex/h;

    invoke-interface {p1, v0}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
