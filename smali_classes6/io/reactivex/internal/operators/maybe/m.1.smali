.class public final Lio/reactivex/internal/operators/maybe/m;
.super Lio/reactivex/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/maybe/m$a;
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
.field public final b:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/q<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/K;Lio/reactivex/functions/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "TT;>;",
            "Lio/reactivex/functions/q<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/p;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/maybe/m;->b:Lio/reactivex/K;

    iput-object p2, p0, Lio/reactivex/internal/operators/maybe/m;->c:Lio/reactivex/functions/q;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/maybe/m;->b:Lio/reactivex/K;

    new-instance v1, Lio/reactivex/internal/operators/maybe/m$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/maybe/m;->c:Lio/reactivex/functions/q;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/maybe/m$a;-><init>(Lio/reactivex/s;Lio/reactivex/functions/q;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
