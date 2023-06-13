.class public LoA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LnA3;

.field public b:LKr2;

.field public c:Z

.field public d:[LyB0;

.field public e:Lw12;

.field public f:LoA3;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoA3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LnA3;LbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LoA3;->g:Ljava/util/List;

    iput-object p1, p0, LoA3;->a:LnA3;

    invoke-virtual {p0, p1}, LoA3;->c(LnA3;)[LyB0;

    move-result-object p1

    iput-object p1, p0, LoA3;->d:[LyB0;

    invoke-virtual {p0, p1, p2}, LoA3;->b([LyB0;LbC1;)V

    return-void
.end method


# virtual methods
.method public a(LoA3;)V
    .locals 1

    iget-object v0, p0, LoA3;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b([LyB0;LbC1;)V
    .locals 1

    iget-object v0, p0, LoA3;->b:LKr2;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2, p1}, LbC1;->j([LyB0;)LKr2;

    move-result-object p1

    iput-object p1, p0, LoA3;->b:LKr2;

    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object p1

    invoke-static {p1}, LDy3;->c([LyB0;)Z

    move-result p1

    iput-boolean p1, p0, LoA3;->c:Z

    return-void
.end method

.method public final c(LnA3;)[LyB0;
    .locals 3

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    move-object v1, p1

    :cond_0
    invoke-virtual {v1}, LnA3;->v()LoA3;

    move-result-object v2

    if-eq v2, p0, :cond_2

    invoke-virtual {v1, v0}, LnA3;->q(LDB0;)V

    invoke-virtual {v1, p0}, LnA3;->Q(LoA3;)V

    invoke-virtual {v1}, LnA3;->M()LnA3;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, LnA3;->M()LnA3;

    move-result-object v1

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, LDB0;->o()V

    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    const-string v0, "Found null edge in ring"

    invoke-virtual {v1}, LFE1;->d()LyB0;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1

    :cond_2
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Edge visited twice during ring-building at "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LnA3;->t()LyB0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, LnA3;->t()LyB0;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1
.end method

.method public d(Ljava/util/List;)LoA3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LoA3;",
            ">;)",
            "LoA3;"
        }
    .end annotation

    invoke-virtual {p0}, LoA3;->h()LKr2;

    move-result-object v0

    invoke-virtual {v0}, LWB1;->Z()Lsf1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LBr2;->L0(I)LyB0;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LoA3;

    invoke-virtual {v4}, LoA3;->h()LKr2;

    move-result-object v5

    invoke-virtual {v5}, LWB1;->Z()Lsf1;

    move-result-object v5

    invoke-virtual {v5, v1}, Lsf1;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5, v1}, Lsf1;->b(Lsf1;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LBr2;->Y()[LyB0;

    move-result-object v6

    invoke-virtual {v4}, LoA3;->f()[LyB0;

    move-result-object v7

    invoke-static {v6, v7}, LBB0;->f([LyB0;[LyB0;)LyB0;

    move-result-object v6

    invoke-virtual {v4, v6}, LoA3;->k(LyB0;)Z

    move-result v6

    if-eqz v6, :cond_0

    if-eqz v2, :cond_3

    invoke-virtual {v3, v5}, Lsf1;->b(Lsf1;)Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_3
    invoke-virtual {v4}, LoA3;->h()LKr2;

    move-result-object v2

    invoke-virtual {v2}, LWB1;->Z()Lsf1;

    move-result-object v2

    move-object v3, v2

    move-object v2, v4

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public e()LyB0;
    .locals 2

    iget-object v0, p0, LoA3;->d:[LyB0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final f()[LyB0;
    .locals 1

    iget-object v0, p0, LoA3;->d:[LyB0;

    return-object v0
.end method

.method public final g()LNW3;
    .locals 2

    iget-object v0, p0, LoA3;->e:Lw12;

    if-nez v0, :cond_0

    new-instance v0, Lw12;

    invoke-virtual {p0}, LoA3;->h()LKr2;

    move-result-object v1

    invoke-direct {v0, v1}, Lw12;-><init>(LWB1;)V

    iput-object v0, p0, LoA3;->e:Lw12;

    :cond_0
    iget-object v0, p0, LoA3;->e:Lw12;

    return-object v0
.end method

.method public h()LKr2;
    .locals 1

    iget-object v0, p0, LoA3;->b:LKr2;

    return-object v0
.end method

.method public i()LoA3;
    .locals 1

    invoke-virtual {p0}, LoA3;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LoA3;->f:LoA3;

    return-object v0

    :cond_0
    return-object p0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, LoA3;->c:Z

    return v0
.end method

.method public k(LyB0;)Z
    .locals 1

    invoke-virtual {p0}, LoA3;->g()LNW3;

    move-result-object v0

    invoke-interface {v0, p1}, LNW3;->a(LyB0;)I

    move-result p1

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(LoA3;)V
    .locals 0

    iput-object p1, p0, LoA3;->f:LoA3;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, LoA3;->a(LoA3;)V

    :cond_0
    return-void
.end method

.method public m(LbC1;)LCX3;
    .locals 3

    iget-object v0, p0, LoA3;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [LKr2;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LoA3;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LoA3;->g:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LoA3;

    invoke-virtual {v2}, LoA3;->h()LKr2;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    iget-object v1, p0, LoA3;->b:LKr2;

    invoke-virtual {p1, v1, v0}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object p1

    return-object p1
.end method
