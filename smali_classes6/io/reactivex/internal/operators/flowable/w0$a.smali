.class public final Lio/reactivex/internal/operators/flowable/w0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "LoT5;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x21ca630c444d714fL


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final c:[Lio/reactivex/internal/operators/flowable/w0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/internal/operators/flowable/w0$b<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;

.field public final f:Lio/reactivex/internal/util/c;

.field public final g:Z

.field public volatile h:Z

.field public final i:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/functions/o;IIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;IIZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$a;->b:LhT5;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/w0$a;->d:Lio/reactivex/functions/o;

    iput-boolean p5, p0, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    new-array p1, p3, [Lio/reactivex/internal/operators/flowable/w0$b;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    new-instance p5, Lio/reactivex/internal/operators/flowable/w0$b;

    invoke-direct {p5, p0, p4}, Lio/reactivex/internal/operators/flowable/w0$b;-><init>(Lio/reactivex/internal/operators/flowable/w0$a;I)V

    aput-object p5, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    new-array p2, p3, [Ljava/lang/Object;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/w0$a;->i:[Ljava/lang/Object;

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$a;->c:[Lio/reactivex/internal/operators/flowable/w0$b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lio/reactivex/internal/util/c;

    invoke-direct {p1}, Lio/reactivex/internal/util/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->c:[Lio/reactivex/internal/operators/flowable/w0$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lio/reactivex/internal/operators/flowable/w0$b;->cancel()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()V
    .locals 18

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v2, v1, Lio/reactivex/internal/operators/flowable/w0$a;->b:LhT5;

    iget-object v3, v1, Lio/reactivex/internal/operators/flowable/w0$a;->c:[Lio/reactivex/internal/operators/flowable/w0$b;

    array-length v4, v3

    iget-object v5, v1, Lio/reactivex/internal/operators/flowable/w0$a;->i:[Ljava/lang/Object;

    const/4 v7, 0x1

    :cond_1
    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    const-wide/16 v12, 0x0

    :goto_0
    cmp-long v14, v8, v12

    const/4 v15, 0x0

    const/16 v16, 0x0

    if-eqz v14, :cond_c

    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->h:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    if-nez v0, :cond_3

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    move/from16 v0, v16

    move v6, v0

    :goto_1
    if-ge v6, v4, :cond_a

    aget-object v10, v3, v6

    aget-object v11, v5, v6

    if-nez v11, :cond_9

    :try_start_0
    iget-boolean v11, v10, Lio/reactivex/internal/operators/flowable/w0$b;->g:Z

    iget-object v10, v10, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    if-eqz v10, :cond_4

    invoke-interface {v10}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v10

    goto :goto_2

    :cond_4
    move-object v10, v15

    :goto_2
    if-nez v10, :cond_5

    const/16 v17, 0x1

    goto :goto_3

    :cond_5
    move/from16 v17, v16

    :goto_3
    if-eqz v11, :cond_7

    if-eqz v17, :cond_7

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_6

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_6
    invoke-interface {v2}, LhT5;->onComplete()V

    :goto_4
    return-void

    :cond_7
    if-nez v17, :cond_8

    aput-object v10, v5, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-object v10, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v10, v0}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    if-nez v0, :cond_8

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_8
    const/4 v0, 0x1

    :cond_9
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_a
    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    :try_start_1
    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->d:Lio/reactivex/functions/o;

    invoke-virtual {v5}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v6}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "The zipper returned a null value"

    invoke-static {v0, v6}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v2, v0}, LhT5;->onNext(Ljava/lang/Object;)V

    const-wide/16 v10, 0x1

    add-long/2addr v12, v10

    invoke-static {v5, v15}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v3, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v3, v0}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_c
    :goto_6
    if-nez v14, :cond_14

    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->h:Z

    if-eqz v0, :cond_d

    return-void

    :cond_d
    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    if-nez v0, :cond_e

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_e
    move/from16 v6, v16

    :goto_7
    if-ge v6, v4, :cond_14

    aget-object v0, v3, v6

    aget-object v10, v5, v6

    if-nez v10, :cond_13

    :try_start_2
    iget-boolean v10, v0, Lio/reactivex/internal/operators/flowable/w0$b;->g:Z

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/w0$b;->e:Lio/reactivex/internal/fuseable/j;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    :cond_f
    move-object v0, v15

    :goto_8
    if-nez v0, :cond_10

    const/4 v11, 0x1

    goto :goto_9

    :cond_10
    move/from16 v11, v16

    :goto_9
    if-eqz v10, :cond_12

    if-eqz v11, :cond_12

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_11

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    invoke-interface {v2}, LhT5;->onComplete()V

    :goto_a
    return-void

    :cond_12
    if-nez v11, :cond_13

    aput-object v0, v5, v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_b

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    iget-object v10, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v10, v0}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    iget-boolean v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    if-nez v0, :cond_13

    invoke-virtual/range {p0 .. p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0}, Lio/reactivex/internal/util/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, v0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_13
    :goto_b
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_14
    const-wide/16 v10, 0x0

    cmp-long v0, v12, v10

    if-eqz v0, :cond_16

    array-length v0, v3

    move/from16 v6, v16

    :goto_c
    if-ge v6, v0, :cond_15

    aget-object v10, v3, v6

    invoke-virtual {v10, v12, v13}, Lio/reactivex/internal/operators/flowable/w0$b;->o(J)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    :cond_15
    const-wide v10, 0x7fffffffffffffffL

    cmp-long v0, v8, v10

    if-eqz v0, :cond_16

    iget-object v0, v1, Lio/reactivex/internal/operators/flowable/w0$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v8, v12

    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_16
    neg-int v0, v7

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_1

    return-void
.end method

.method public c(Lio/reactivex/internal/operators/flowable/w0$b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/flowable/w0$b<",
            "TT;TR;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v0, p2}, Lio/reactivex/internal/util/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lio/reactivex/internal/operators/flowable/w0$b;->g:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/flowable/w0$a;->b()V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->h:Z

    invoke-virtual {p0}, Lio/reactivex/internal/operators/flowable/w0$a;->a()V

    :cond_0
    return-void
.end method

.method public d([Lna4;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lna4<",
            "+TT;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->c:[Lio/reactivex/internal/operators/flowable/w0$b;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/w0$a;->h:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/w0$a;->g:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/w0$a;->f:Lio/reactivex/internal/util/c;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    aget-object v2, p1, v1

    aget-object v3, v0, v1

    invoke-interface {v2, v3}, Lna4;->c(LhT5;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public o(J)V
    .locals 1

    invoke-static {p1, p2}, Lio/reactivex/internal/subscriptions/g;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/w0$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/reactivex/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lio/reactivex/internal/operators/flowable/w0$a;->b()V

    :cond_0
    return-void
.end method
