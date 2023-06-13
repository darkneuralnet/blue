.class public final Lio/reactivex/internal/operators/observable/d1;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/d1$b;,
        Lio/reactivex/internal/operators/observable/d1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/d<",
            "-TT;-TT;>;"
        }
    .end annotation
.end field

.field public final e:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/d;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "+TT;>;",
            "Lio/reactivex/B<",
            "+TT;>;",
            "Lio/reactivex/functions/d<",
            "-TT;-TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/d1;->b:Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/d1;->c:Lio/reactivex/B;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/d1;->d:Lio/reactivex/functions/d;

    iput p4, p0, Lio/reactivex/internal/operators/observable/d1;->e:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/observable/d1$a;

    iget v2, p0, Lio/reactivex/internal/operators/observable/d1;->e:I

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/d1;->b:Lio/reactivex/B;

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/d1;->c:Lio/reactivex/B;

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/d1;->d:Lio/reactivex/functions/d;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/observable/d1$a;-><init>(Lio/reactivex/D;ILio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/d;)V

    invoke-interface {p1, v6}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v6}, Lio/reactivex/internal/operators/observable/d1$a;->d()V

    return-void
.end method
