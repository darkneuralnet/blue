.class public final Lio/reactivex/internal/operators/mixed/c;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/mixed/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/u<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/internal/util/j;

.field public final f:I


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;Lio/reactivex/internal/util/j;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/u<",
            "+TR;>;>;",
            "Lio/reactivex/internal/util/j;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/c;->c:Lio/reactivex/k;

    iput-object p2, p0, Lio/reactivex/internal/operators/mixed/c;->d:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/mixed/c;->e:Lio/reactivex/internal/util/j;

    iput p4, p0, Lio/reactivex/internal/operators/mixed/c;->f:I

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/c;->c:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/mixed/c$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/mixed/c;->d:Lio/reactivex/functions/o;

    iget v3, p0, Lio/reactivex/internal/operators/mixed/c;->f:I

    iget-object v4, p0, Lio/reactivex/internal/operators/mixed/c;->e:Lio/reactivex/internal/util/j;

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/mixed/c$a;-><init>(LhT5;Lio/reactivex/functions/o;ILio/reactivex/internal/util/j;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method
