.class public final Lio/reactivex/internal/operators/observable/J1;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/J1$a;,
        Lio/reactivex/internal/operators/observable/J1$b;,
        Lio/reactivex/internal/operators/observable/J1$d;,
        Lio/reactivex/internal/operators/observable/J1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/observable/a<",
        "TT;",
        "Lio/reactivex/Observable<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TB;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TB;+",
            "Lio/reactivex/B<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public final e:I


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/B<",
            "TB;>;",
            "Lio/reactivex/functions/o<",
            "-TB;+",
            "Lio/reactivex/B<",
            "TV;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lio/reactivex/B;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/J1;->c:Lio/reactivex/B;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/J1;->d:Lio/reactivex/functions/o;

    iput p4, p0, Lio/reactivex/internal/operators/observable/J1;->e:I

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/a;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/J1$c;

    new-instance v2, Lio/reactivex/observers/h;

    invoke-direct {v2, p1}, Lio/reactivex/observers/h;-><init>(Lio/reactivex/D;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/J1;->c:Lio/reactivex/B;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/J1;->d:Lio/reactivex/functions/o;

    iget v4, p0, Lio/reactivex/internal/operators/observable/J1;->e:I

    invoke-direct {v1, v2, p1, v3, v4}, Lio/reactivex/internal/operators/observable/J1$c;-><init>(Lio/reactivex/D;Lio/reactivex/B;Lio/reactivex/functions/o;I)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
