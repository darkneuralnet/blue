.class public LtA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lf32;

.field public c:LbC1;

.field public d:LeZ3;

.field public e:LT83;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>(LWB1;LWB1;I)V
    .locals 1

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-virtual {v0}, LbC1;->B()LeZ3;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p3}, LtA3;-><init>(LWB1;LWB1;LeZ3;I)V

    return-void
.end method

.method public constructor <init>(LWB1;LWB1;LeZ3;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LtA3;->f:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LtA3;->g:Z

    iput-boolean v0, p0, LtA3;->h:Z

    iput-boolean v0, p0, LtA3;->i:Z

    iput-boolean v0, p0, LtA3;->j:Z

    iput-boolean v0, p0, LtA3;->k:Z

    iput-object p3, p0, LtA3;->d:LeZ3;

    iput p4, p0, LtA3;->a:I

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object p3

    iput-object p3, p0, LtA3;->c:LbC1;

    new-instance p3, Lf32;

    invoke-direct {p3, p1, p2}, Lf32;-><init>(LWB1;LWB1;)V

    iput-object p3, p0, LtA3;->b:Lf32;

    return-void
.end method

.method public constructor <init>(LWB1;LeZ3;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, p2, v1}, LtA3;-><init>(LWB1;LWB1;LeZ3;I)V

    return-void
.end method

.method public static f(Ljava/util/List;)Z
    .locals 0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static g(III)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move p1, v0

    :cond_0
    if-ne p2, v1, :cond_1

    move p2, v0

    :cond_1
    if-eq p0, v1, :cond_b

    const/4 v2, 0x2

    if-eq p0, v2, :cond_8

    const/4 v2, 0x3

    if-eq p0, v2, :cond_6

    const/4 v2, 0x4

    if-eq p0, v2, :cond_2

    return v0

    :cond_2
    if-nez p1, :cond_3

    if-nez p2, :cond_4

    :cond_3
    if-eqz p1, :cond_5

    if-nez p2, :cond_5

    :cond_4
    move v0, v1

    :cond_5
    return v0

    :cond_6
    if-nez p1, :cond_7

    if-eqz p2, :cond_7

    move v0, v1

    :cond_7
    return v0

    :cond_8
    if-eqz p1, :cond_9

    if-nez p2, :cond_a

    :cond_9
    move v0, v1

    :cond_a
    return v0

    :cond_b
    if-nez p1, :cond_c

    if-nez p2, :cond_c

    move v0, v1

    :cond_c
    return v0
.end method

.method public static j(LWB1;LWB1;I)LWB1;
    .locals 1

    new-instance v0, LtA3;

    invoke-direct {v0, p0, p1, p2}, LtA3;-><init>(LWB1;LWB1;I)V

    invoke-virtual {v0}, LtA3;->e()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static k(LWB1;LWB1;ILT83;)LWB1;
    .locals 2

    new-instance v0, LtA3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, p2}, LtA3;-><init>(LWB1;LWB1;LeZ3;I)V

    invoke-virtual {v0, p3}, LtA3;->m(LT83;)V

    invoke-virtual {v0}, LtA3;->e()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static l(LWB1;LWB1;ILeZ3;)LWB1;
    .locals 1

    new-instance v0, LtA3;

    invoke-direct {v0, p0, p1, p3, p2}, LtA3;-><init>(LWB1;LWB1;LeZ3;I)V

    invoke-virtual {v0}, LtA3;->e()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static o(LWB1;LeZ3;)LWB1;
    .locals 1

    new-instance v0, LtA3;

    invoke-direct {v0, p0, p1}, LtA3;-><init>(LWB1;LeZ3;)V

    invoke-virtual {v0}, LtA3;->e()LWB1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/Collection;)LpA3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lr91;",
            ">;)",
            "LpA3;"
        }
    .end annotation

    new-instance v0, LpA3;

    invoke-direct {v0}, LpA3;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr91;

    invoke-virtual {v1}, Lr91;->f()[LyB0;

    move-result-object v2

    invoke-virtual {v1}, Lr91;->b()LqA3;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, LpA3;->a([LyB0;LqA3;)LnA3;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final b()LWB1;
    .locals 4

    invoke-virtual {p0}, LtA3;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LtA3;->a(Ljava/util/Collection;)LpA3;

    move-result-object v0

    iget-boolean v1, p0, LtA3;->k:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, LtA3;->i:Z

    iget-object v2, p0, LtA3;->c:LbC1;

    invoke-static {v0, v1, v2}, LyA3;->r(LpA3;ZLbC1;)LWB1;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, LtA3;->h(LpA3;)V

    iget-boolean v1, p0, LtA3;->i:Z

    if-nez v1, :cond_4

    iget-boolean v2, p0, LtA3;->j:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget v1, p0, LtA3;->a:I

    invoke-virtual {p0, v1, v0}, LtA3;->d(ILpA3;)LWB1;

    move-result-object v0

    iget-object v1, p0, LtA3;->d:LeZ3;

    invoke-static {v1}, LyA3;->h(LeZ3;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LtA3;->b:Lf32;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lf32;->d(I)LWB1;

    move-result-object v1

    iget-object v2, p0, LtA3;->b:Lf32;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lf32;->d(I)LWB1;

    move-result-object v2

    iget v3, p0, LtA3;->a:I

    invoke-static {v1, v2, v3, v0}, LyA3;->k(LWB1;LWB1;ILWB1;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lorg/locationtech/jts/geom/TopologyException;

    const-string v1, "Result area inconsistent with overlay operation"

    invoke-direct {v0, v1}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-object v0

    :cond_4
    :goto_1
    iget-object v2, p0, LtA3;->c:LbC1;

    invoke-static {v0, v1, v2}, LyA3;->r(LpA3;ZLbC1;)LWB1;

    move-result-object v0

    return-object v0
.end method

.method public final c()LWB1;
    .locals 4

    iget v0, p0, LtA3;->a:I

    iget-object v1, p0, LtA3;->b:Lf32;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lf32;->b(I)I

    move-result v1

    iget-object v2, p0, LtA3;->b:Lf32;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lf32;->b(I)I

    move-result v2

    invoke-static {v0, v1, v2}, LyA3;->m(III)I

    move-result v0

    iget-object v1, p0, LtA3;->c:LbC1;

    invoke-static {v0, v1}, LyA3;->b(ILbC1;)LWB1;

    move-result-object v0

    return-object v0
.end method

.method public final d(ILpA3;)LWB1;
    .locals 13

    iget-boolean v0, p0, LtA3;->f:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p2}, LpA3;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, LEX3;

    iget-object v4, p0, LtA3;->c:LbC1;

    invoke-direct {v3, v2, v4}, LEX3;-><init>(Ljava/util/List;LbC1;)V

    invoke-virtual {v3}, LEX3;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-boolean v5, p0, LtA3;->h:Z

    const/4 v11, 0x0

    if-nez v5, :cond_9

    if-eqz v3, :cond_2

    if-nez v0, :cond_2

    const/4 v5, 0x4

    if-eq p1, v5, :cond_2

    const/4 v5, 0x2

    if-ne p1, v5, :cond_1

    goto :goto_1

    :cond_1
    move v5, v4

    goto :goto_2

    :cond_2
    :goto_1
    move v5, v1

    :goto_2
    if-eqz v5, :cond_3

    new-instance v12, Lhr2;

    iget-object v6, p0, LtA3;->b:Lf32;

    iget-object v10, p0, LtA3;->c:LbC1;

    move-object v5, v12

    move-object v7, p2

    move v8, v3

    move v9, p1

    invoke-direct/range {v5 .. v10}, Lhr2;-><init>(Lf32;LpA3;ZILbC1;)V

    iget-boolean v5, p0, LtA3;->f:Z

    invoke-virtual {v12, v5}, Lhr2;->f(Z)V

    invoke-virtual {v12}, Lhr2;->c()Ljava/util/List;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object v5, v11

    :goto_3
    if-nez v3, :cond_5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    goto :goto_4

    :cond_4
    move v3, v4

    goto :goto_5

    :cond_5
    :goto_4
    move v3, v1

    :goto_5
    if-eqz v3, :cond_6

    if-eqz v0, :cond_7

    :cond_6
    move v4, v1

    :cond_7
    if-ne p1, v1, :cond_8

    if-eqz v4, :cond_8

    new-instance p1, LQ62;

    iget-object v0, p0, LtA3;->c:LbC1;

    invoke-direct {p1, p2, v0}, LQ62;-><init>(LpA3;LbC1;)V

    iget-boolean p2, p0, LtA3;->f:Z

    invoke-virtual {p1, p2}, LQ62;->e(Z)V

    invoke-virtual {p1}, LQ62;->b()Ljava/util/List;

    move-result-object v11

    :cond_8
    move-object p1, v11

    move-object v11, v5

    goto :goto_6

    :cond_9
    move-object p1, v11

    :goto_6
    invoke-static {v2}, LtA3;->f(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-static {v11}, LtA3;->f(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-static {p1}, LtA3;->f(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p0}, LtA3;->c()LWB1;

    move-result-object p1

    return-object p1

    :cond_a
    iget-object p2, p0, LtA3;->c:LbC1;

    invoke-static {v2, v11, p1, p2}, LyA3;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;LbC1;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public e()LWB1;
    .locals 6

    iget v0, p0, LtA3;->a:I

    iget-object v1, p0, LtA3;->b:Lf32;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lf32;->d(I)LWB1;

    move-result-object v1

    iget-object v3, p0, LtA3;->b:Lf32;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lf32;->d(I)LWB1;

    move-result-object v3

    iget-object v5, p0, LtA3;->d:LeZ3;

    invoke-static {v0, v1, v3, v5}, LyA3;->f(ILWB1;LWB1;LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LtA3;->c()LWB1;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LtA3;->b:Lf32;

    invoke-virtual {v0, v2}, Lf32;->d(I)LWB1;

    move-result-object v0

    iget-object v1, p0, LtA3;->b:Lf32;

    invoke-virtual {v1, v4}, Lf32;->d(I)LWB1;

    move-result-object v1

    invoke-static {v0, v1}, Lla1;->c(LWB1;LWB1;)Lla1;

    move-result-object v0

    iget-object v1, p0, LtA3;->b:Lf32;

    invoke-virtual {v1}, Lf32;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, LtA3;->a:I

    iget-object v3, p0, LtA3;->b:Lf32;

    invoke-virtual {v3, v2}, Lf32;->d(I)LWB1;

    move-result-object v2

    iget-object v3, p0, LtA3;->b:Lf32;

    invoke-virtual {v3, v4}, Lf32;->d(I)LWB1;

    move-result-object v3

    iget-object v4, p0, LtA3;->d:LeZ3;

    invoke-static {v1, v2, v3, v4}, LxA3;->g(ILWB1;LWB1;LeZ3;)LWB1;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LtA3;->b:Lf32;

    invoke-virtual {v1}, Lf32;->k()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LtA3;->b:Lf32;

    invoke-virtual {v1}, Lf32;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, LtA3;->a:I

    iget-object v3, p0, LtA3;->b:Lf32;

    invoke-virtual {v3, v2}, Lf32;->d(I)LWB1;

    move-result-object v2

    iget-object v3, p0, LtA3;->b:Lf32;

    invoke-virtual {v3, v4}, Lf32;->d(I)LWB1;

    move-result-object v3

    iget-object v4, p0, LtA3;->d:LeZ3;

    invoke-static {v1, v2, v3, v4}, LsA3;->n(ILWB1;LWB1;LeZ3;)LWB1;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LtA3;->b()LWB1;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lla1;->g(LWB1;)V

    return-object v1
.end method

.method public final h(LpA3;)V
    .locals 2

    new-instance v0, LrA3;

    iget-object v1, p0, LtA3;->b:Lf32;

    invoke-direct {v0, p1, v1}, LrA3;-><init>(LpA3;Lf32;)V

    invoke-virtual {v0}, LrA3;->a()V

    iget p1, p0, LtA3;->a:I

    invoke-virtual {v0, p1}, LrA3;->l(I)V

    invoke-virtual {v0}, LrA3;->p()V

    return-void
.end method

.method public final i()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lr91;",
            ">;"
        }
    .end annotation

    new-instance v0, LF91;

    iget-object v1, p0, LtA3;->d:LeZ3;

    iget-object v2, p0, LtA3;->e:LT83;

    invoke-direct {v0, v1, v2}, LF91;-><init>(LeZ3;LT83;)V

    iget-boolean v1, p0, LtA3;->g:Z

    if-eqz v1, :cond_0

    iget v1, p0, LtA3;->a:I

    iget-object v2, p0, LtA3;->b:Lf32;

    iget-object v3, p0, LtA3;->d:LeZ3;

    invoke-static {v1, v2, v3}, LyA3;->a(ILf32;LeZ3;)Lsf1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, LF91;->v(Lsf1;)V

    :cond_0
    iget-object v1, p0, LtA3;->b:Lf32;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lf32;->d(I)LWB1;

    move-result-object v1

    iget-object v3, p0, LtA3;->b:Lf32;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lf32;->d(I)LWB1;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, LF91;->i(LWB1;LWB1;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, LtA3;->b:Lf32;

    invoke-virtual {v0, v2}, LF91;->p(I)Z

    move-result v5

    xor-int/2addr v5, v4

    invoke-virtual {v3, v2, v5}, Lf32;->m(IZ)V

    iget-object v2, p0, LtA3;->b:Lf32;

    invoke-virtual {v0, v4}, LF91;->p(I)Z

    move-result v0

    xor-int/2addr v0, v4

    invoke-virtual {v2, v4, v0}, Lf32;->m(IZ)V

    return-object v1
.end method

.method public m(LT83;)V
    .locals 0

    iput-object p1, p0, LtA3;->e:LT83;

    return-void
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, LtA3;->f:Z

    return-void
.end method
