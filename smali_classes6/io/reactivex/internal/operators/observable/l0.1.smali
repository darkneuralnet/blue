.class public final Lio/reactivex/internal/operators/observable/l0;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/l0$c;,
        Lio/reactivex/internal/operators/observable/l0$d;,
        Lio/reactivex/internal/operators/observable/l0$a;,
        Lio/reactivex/internal/operators/observable/l0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T",
        "Left:Ljava/lang/Object;",
        "TRight:",
        "Ljava/lang/Object;",
        "T",
        "LeftEnd:Ljava/lang/Object;",
        "TRightEnd:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT",
        "Left;",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "+TTRight;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT",
            "Left;",
            "+",
            "Lio/reactivex/B<",
            "TT",
            "LeftEnd;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TTRight;+",
            "Lio/reactivex/B<",
            "TTRightEnd;>;>;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/functions/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/c<",
            "-TT",
            "Left;",
            "-",
            "Lio/reactivex/Observable<",
            "TTRight;>;+TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/o;Lio/reactivex/functions/o;Lio/reactivex/functions/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT",
            "Left;",
            ">;",
            "Lio/reactivex/B<",
            "+TTRight;>;",
            "Lio/reactivex/functions/o<",
            "-TT",
            "Left;",
            "+",
            "Lio/reactivex/B<",
            "TT",
            "LeftEnd;",
            ">;>;",
            "Lio/reactivex/functions/o<",
            "-TTRight;+",
            "Lio/reactivex/B<",
            "TTRightEnd;>;>;",
            "Lio/reactivex/functions/c<",
            "-TT",
            "Left;",
            "-",
            "Lio/reactivex/Observable<",
            "TTRight;>;+TR;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/l0;->c:Lio/reactivex/B;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/l0;->d:Lio/reactivex/functions/o;

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/l0;->e:Lio/reactivex/functions/o;

    iput-object p5, p0, Lio/reactivex/internal/operators/observable/l0;->f:Lio/reactivex/functions/c;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TR;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/l0$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/l0;->d:Lio/reactivex/functions/o;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/l0;->e:Lio/reactivex/functions/o;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/l0;->f:Lio/reactivex/functions/c;

    invoke-direct {v0, p1, v1, v2, v3}, Lio/reactivex/internal/operators/observable/l0$a;-><init>(Lio/reactivex/D;Lio/reactivex/functions/o;Lio/reactivex/functions/o;Lio/reactivex/functions/c;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    new-instance p1, Lio/reactivex/internal/operators/observable/l0$d;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lio/reactivex/internal/operators/observable/l0$d;-><init>(Lio/reactivex/internal/operators/observable/l0$b;Z)V

    iget-object v1, v0, Lio/reactivex/internal/operators/observable/l0$a;->d:Lio/reactivex/disposables/b;

    invoke-virtual {v1, p1}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    new-instance v1, Lio/reactivex/internal/operators/observable/l0$d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lio/reactivex/internal/operators/observable/l0$d;-><init>(Lio/reactivex/internal/operators/observable/l0$b;Z)V

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/l0$a;->d:Lio/reactivex/disposables/b;

    invoke-virtual {v0, v1}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    invoke-interface {v0, p1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/l0;->c:Lio/reactivex/B;

    invoke-interface {p1, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
