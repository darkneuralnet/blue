.class public final Lio/reactivex/internal/operators/flowable/W;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/W$b;,
        Lio/reactivex/internal/operators/flowable/W$c;,
        Lio/reactivex/internal/operators/flowable/W$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/k<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput p1, p0, Lio/reactivex/internal/operators/flowable/W;->c:I

    add-int/2addr p1, p2

    iput p1, p0, Lio/reactivex/internal/operators/flowable/W;->d:I

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lio/reactivex/internal/fuseable/a;

    if-eqz v0, :cond_0

    new-instance v0, Lio/reactivex/internal/operators/flowable/W$b;

    move-object v1, p1

    check-cast v1, Lio/reactivex/internal/fuseable/a;

    iget v2, p0, Lio/reactivex/internal/operators/flowable/W;->c:I

    iget v3, p0, Lio/reactivex/internal/operators/flowable/W;->d:I

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/internal/operators/flowable/W$b;-><init>(Lio/reactivex/internal/fuseable/a;II)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/flowable/W$c;

    iget v1, p0, Lio/reactivex/internal/operators/flowable/W;->c:I

    iget v2, p0, Lio/reactivex/internal/operators/flowable/W;->d:I

    invoke-direct {v0, p1, v1, v2}, Lio/reactivex/internal/operators/flowable/W$c;-><init>(LhT5;II)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    :goto_0
    return-void
.end method
