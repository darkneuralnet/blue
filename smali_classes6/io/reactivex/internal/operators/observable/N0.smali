.class public final Lio/reactivex/internal/operators/observable/N0;
.super Lio/reactivex/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/N0$a;
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
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/c<",
            "TT;TT;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/c<",
            "TT;TT;TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/p;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/N0;->b:Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/N0;->c:Lio/reactivex/functions/c;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/N0;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/N0$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/N0;->c:Lio/reactivex/functions/c;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/observable/N0$a;-><init>(Lio/reactivex/s;Lio/reactivex/functions/c;)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
