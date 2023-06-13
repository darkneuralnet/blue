.class public LUj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUj2$b;,
        LUj2$a;
    }
.end annotation


# instance fields
.field public a:LSj2;

.field public b:J

.field public c:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, LUj2;-><init>(D)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LUj2;->a:LSj2;

    iput-wide p1, p0, LUj2;->c:D

    return-void
.end method


# virtual methods
.method public final a(LyB0;)LSj2;
    .locals 3

    new-instance v0, LUj2$a;

    iget-wide v1, p0, LUj2;->c:D

    invoke-direct {v0, p1, v1, v2}, LUj2$a;-><init>(LyB0;D)V

    invoke-virtual {v0}, LUj2$a;->c()Lsf1;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LUj2;->f(Lsf1;LTj2;)V

    invoke-virtual {v0}, LUj2$a;->b()LSj2;

    move-result-object p1

    return-object p1
.end method

.method public b(LyB0;)LSj2;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LUj2;->c(LyB0;Ljava/lang/Object;)LSj2;

    move-result-object p1

    return-object p1
.end method

.method public c(LyB0;Ljava/lang/Object;)LSj2;
    .locals 4

    iget-object v0, p0, LUj2;->a:LSj2;

    if-nez v0, :cond_0

    new-instance v0, LSj2;

    invoke-direct {v0, p1, p2}, LSj2;-><init>(LyB0;Ljava/lang/Object;)V

    iput-object v0, p0, LUj2;->a:LSj2;

    return-object v0

    :cond_0
    iget-wide v0, p0, LUj2;->c:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0, p1}, LUj2;->a(LyB0;)LSj2;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LSj2;->e()V

    return-object v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LUj2;->d(LyB0;Ljava/lang/Object;)LSj2;

    move-result-object p1

    return-object p1
.end method

.method public final d(LyB0;Ljava/lang/Object;)LSj2;
    .locals 10

    iget-object v0, p0, LUj2;->a:LSj2;

    const/4 v1, 0x1

    move-object v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, LSj2;->a()LyB0;

    move-result-object v2

    invoke-virtual {p1, v2}, LyB0;->f(LyB0;)D

    move-result-wide v2

    iget-wide v5, p0, LUj2;->c:D

    cmpg-double v2, v2, v5

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    move v2, v1

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v0}, LSj2;->e()V

    return-object v0

    :cond_1
    invoke-virtual {v0, v4}, LSj2;->k(Z)D

    move-result-wide v5

    if-eqz v4, :cond_2

    iget-wide v7, p1, LyB0;->b:D

    cmpg-double v2, v7, v5

    if-gez v2, :cond_3

    :goto_2
    move v3, v1

    goto :goto_3

    :cond_2
    iget-wide v7, p1, LyB0;->c:D

    cmpg-double v2, v7, v5

    if-gez v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_3
    if-eqz v3, :cond_4

    invoke-virtual {v0}, LSj2;->c()LSj2;

    move-result-object v2

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, LSj2;->d()LSj2;

    move-result-object v2

    :goto_4
    xor-int/lit8 v4, v4, 0x1

    move-object v9, v2

    move-object v2, v0

    move-object v0, v9

    goto :goto_0

    :cond_5
    iget-wide v0, p0, LUj2;->b:J

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    iput-wide v0, p0, LUj2;->b:J

    new-instance v0, LSj2;

    invoke-direct {v0, p1, p2}, LSj2;-><init>(LyB0;Ljava/lang/Object;)V

    if-eqz v3, :cond_6

    invoke-virtual {v2, v0}, LSj2;->i(LSj2;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v2, v0}, LSj2;->j(LSj2;)V

    :goto_5
    return-object v0
.end method

.method public e(LyB0;)LSj2;
    .locals 3

    iget-object v0, p0, LUj2;->a:LSj2;

    const/4 v1, 0x1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LSj2;->a()LyB0;

    move-result-object v2

    invoke-virtual {v2, p1}, LyB0;->g(LyB0;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0, v1, p1}, LSj2;->f(ZLyB0;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, LSj2;->c()LSj2;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LSj2;->d()LSj2;

    move-result-object v0

    :goto_1
    xor-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Lsf1;LTj2;)V
    .locals 6

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iget-object v1, p0, LUj2;->a:LSj2;

    const/4 v2, 0x1

    :cond_0
    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    new-instance v4, LUj2$b;

    invoke-direct {v4, v1, v2}, LUj2$b;-><init>(LSj2;Z)V

    invoke-interface {v0, v4}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, p1}, LSj2;->g(ZLsf1;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, LSj2;->c()LSj2;

    move-result-object v1

    if-eqz v1, :cond_0

    xor-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    move-object v1, v3

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUj2$b;

    invoke-virtual {v1}, LUj2$b;->a()LSj2;

    move-result-object v2

    invoke-virtual {v1}, LUj2$b;->b()Z

    move-result v1

    invoke-virtual {v2}, LSj2;->a()LyB0;

    move-result-object v4

    invoke-virtual {p1, v4}, Lsf1;->a(LyB0;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p2, v2}, LTj2;->a(LSj2;)V

    :cond_3
    invoke-virtual {v2, v1, p1}, LSj2;->h(ZLsf1;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v2}, LSj2;->d()LSj2;

    move-result-object v2

    if-eqz v2, :cond_4

    xor-int/lit8 v1, v1, 0x1

    :cond_4
    move-object v5, v2

    move v2, v1

    move-object v1, v5

    goto :goto_0

    :cond_5
    move v2, v1

    goto :goto_1

    :cond_6
    return-void
.end method
