.class public final Lio/reactivex/internal/operators/flowable/l;
.super Lio/reactivex/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/operators/flowable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-",
            "LoT5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/p;

.field public final f:Lio/reactivex/functions/a;


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/g;Lio/reactivex/functions/p;Lio/reactivex/functions/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/g<",
            "-",
            "LoT5;",
            ">;",
            "Lio/reactivex/functions/p;",
            "Lio/reactivex/functions/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/flowable/a;-><init>(Lio/reactivex/k;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/l;->d:Lio/reactivex/functions/g;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/l;->e:Lio/reactivex/functions/p;

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/l;->f:Lio/reactivex/functions/a;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/a;->c:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/l$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/l;->d:Lio/reactivex/functions/g;

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/l;->e:Lio/reactivex/functions/p;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/l;->f:Lio/reactivex/functions/a;

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/l$a;-><init>(LhT5;Lio/reactivex/functions/g;Lio/reactivex/functions/p;Lio/reactivex/functions/a;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
