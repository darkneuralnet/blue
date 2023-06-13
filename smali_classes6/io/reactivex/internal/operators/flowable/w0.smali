.class public final Lio/reactivex/internal/operators/flowable/w0;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/w0$b;,
        Lio/reactivex/internal/operators/flowable/w0$a;
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
.field public final c:[Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lna4<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Lna4<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>([Lna4;Ljava/lang/Iterable;Lio/reactivex/functions/o;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lna4<",
            "+TT;>;",
            "Ljava/lang/Iterable<",
            "+",
            "Lna4<",
            "+TT;>;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0;->c:[Lna4;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/w0;->d:Ljava/lang/Iterable;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/w0;->e:Lio/reactivex/functions/o;

    iput p4, p0, Lio/reactivex/internal/operators/flowable/w0;->f:I

    iput-boolean p5, p0, Lio/reactivex/internal/operators/flowable/w0;->g:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0;->c:[Lna4;

    if-nez v0, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [Lna4;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/w0;->d:Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lna4;

    array-length v5, v0

    if-ne v3, v5, :cond_0

    shr-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v3

    new-array v5, v5, [Lna4;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v5

    :cond_0
    add-int/lit8 v5, v3, 0x1

    aput-object v4, v0, v3

    move v3, v5

    goto :goto_0

    :cond_1
    array-length v3, v0

    :cond_2
    move v7, v3

    if-nez v7, :cond_3

    invoke-static {p1}, Lio/reactivex/internal/subscriptions/d;->a(LhT5;)V

    return-void

    :cond_3
    new-instance v8, Lio/reactivex/internal/operators/flowable/w0$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/w0;->e:Lio/reactivex/functions/o;

    iget v5, p0, Lio/reactivex/internal/operators/flowable/w0;->f:I

    iget-boolean v6, p0, Lio/reactivex/internal/operators/flowable/w0;->g:Z

    move-object v1, v8

    move-object v2, p1

    move v4, v7

    invoke-direct/range {v1 .. v6}, Lio/reactivex/internal/operators/flowable/w0$a;-><init>(LhT5;Lio/reactivex/functions/o;IIZ)V

    invoke-interface {p1, v8}, LhT5;->a(LoT5;)V

    invoke-virtual {v8, v0, v7}, Lio/reactivex/internal/operators/flowable/w0$a;->d([Lna4;I)V

    return-void
.end method
