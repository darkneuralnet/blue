.class public final Lio/reactivex/internal/operators/flowable/W$b;
.super Lio/reactivex/internal/operators/flowable/W$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x23e7f25903d0c345L


# instance fields
.field public final e:Lio/reactivex/internal/fuseable/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/fuseable/a<",
            "-",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/internal/fuseable/a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/fuseable/a<",
            "-",
            "Ljava/lang/Integer;",
            ">;II)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lio/reactivex/internal/operators/flowable/W$a;-><init>(II)V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/W$b;->e:Lio/reactivex/internal/fuseable/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, Lio/reactivex/internal/operators/flowable/W$a;->b:I

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/W$b;->e:Lio/reactivex/internal/fuseable/a;

    iget v2, p0, Lio/reactivex/internal/operators/flowable/W$a;->c:I

    :goto_0
    if-eq v2, v0, :cond_1

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/W$a;->d:Z

    if-eqz v3, :cond_0

    return-void

    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Lio/reactivex/internal/fuseable/a;->h(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/W$a;->d:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v1}, LhT5;->onComplete()V

    return-void
.end method

.method public d(J)V
    .locals 9

    iget v0, p0, Lio/reactivex/internal/operators/flowable/W$a;->b:I

    iget v1, p0, Lio/reactivex/internal/operators/flowable/W$a;->c:I

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/W$b;->e:Lio/reactivex/internal/fuseable/a;

    const-wide/16 v3, 0x0

    :cond_0
    move-wide v5, v3

    :cond_1
    :goto_0
    cmp-long v7, v5, p1

    if-eqz v7, :cond_4

    if-eq v1, v0, :cond_4

    iget-boolean v7, p0, Lio/reactivex/internal/operators/flowable/W$a;->d:Z

    if-eqz v7, :cond_2

    return-void

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Lio/reactivex/internal/fuseable/a;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-ne v1, v0, :cond_6

    iget-boolean p1, p0, Lio/reactivex/internal/operators/flowable/W$a;->d:Z

    if-nez p1, :cond_5

    invoke-interface {v2}, LhT5;->onComplete()V

    :cond_5
    return-void

    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    cmp-long v7, v5, p1

    if-nez v7, :cond_1

    iput v1, p0, Lio/reactivex/internal/operators/flowable/W$a;->c:I

    neg-long p1, v5

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    cmp-long v5, p1, v3

    if-nez v5, :cond_0

    return-void
.end method
