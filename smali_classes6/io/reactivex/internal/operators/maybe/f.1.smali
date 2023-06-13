.class public final Lio/reactivex/internal/operators/maybe/f;
.super Lio/reactivex/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/maybe/f$a;,
        Lio/reactivex/internal/operators/maybe/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/p<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/u<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/u;Lio/reactivex/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/u<",
            "TT;>;",
            "Lio/reactivex/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/p;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/maybe/f;->b:Lio/reactivex/u;

    iput-object p2, p0, Lio/reactivex/internal/operators/maybe/f;->c:Lio/reactivex/h;

    return-void
.end method


# virtual methods
.method public S(Lio/reactivex/s;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/s<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/f;->c:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/maybe/f$b;

    iget-object v2, p0, Lio/reactivex/internal/operators/maybe/f;->b:Lio/reactivex/u;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/maybe/f$b;-><init>(Lio/reactivex/s;Lio/reactivex/u;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
