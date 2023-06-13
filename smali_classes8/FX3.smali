.class public LFX3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LbC1;

.field public b:Ljava/util/List;


# direct methods
.method public constructor <init>(LbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LFX3;->b:Ljava/util/List;

    iput-object p1, p0, LFX3;->a:LbC1;

    return-void
.end method

.method public static f(LH91;Ljava/util/List;)LH91;
    .locals 8

    invoke-virtual {p0}, LH91;->g()LKr2;

    move-result-object p0

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LBr2;->L0(I)LyB0;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH91;

    invoke-virtual {v3}, LH91;->g()LKr2;

    move-result-object v4

    invoke-virtual {v4}, LWB1;->Z()Lsf1;

    move-result-object v5

    invoke-virtual {v5, v0}, Lsf1;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5, v0}, Lsf1;->b(Lsf1;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LBr2;->Y()[LyB0;

    move-result-object v6

    invoke-virtual {v4}, LBr2;->Y()[LyB0;

    move-result-object v7

    invoke-static {v6, v7}, LBB0;->f([LyB0;[LyB0;)LyB0;

    move-result-object v6

    invoke-virtual {v4}, LBr2;->Y()[LyB0;

    move-result-object v4

    invoke-static {v6, v4}, LLW3;->a(LyB0;[LyB0;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v1, :cond_3

    invoke-virtual {v2, v5}, Lsf1;->b(Lsf1;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_3
    invoke-virtual {v3}, LH91;->g()LKr2;

    move-result-object v1

    invoke-virtual {v1}, LWB1;->Z()Lsf1;

    move-result-object v1

    move-object v2, v1

    move-object v1, v3

    goto :goto_0

    :cond_4
    return-object v1
.end method


# virtual methods
.method public a(LlV3;)V
    .locals 1

    invoke-virtual {p1}, LlV3;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p1}, LlV3;->g()Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LFX3;->b(Ljava/util/Collection;Ljava/util/Collection;)V

    return-void
.end method

.method public b(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1

    invoke-static {p2}, LlV3;->j(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, LFX3;->c(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LFX3;->b:Ljava/util/List;

    invoke-virtual {p0, p1, v0, p2}, LFX3;->d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LFX3;->b:Ljava/util/List;

    invoke-virtual {p0, p1, v0, p2}, LFX3;->k(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, LFX3;->b:Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LFX3;->i(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public final c(Ljava/util/Collection;)Ljava/util/List;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v2

    invoke-virtual {v2}, LSl2;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lk41;->k()LH91;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, LgO2;

    iget-object v3, p0, LFX3;->a:LbC1;

    invoke-direct {v2, v1, v3}, LgO2;-><init>(Lk41;LbC1;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, LH91;->o()V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LgO2;

    invoke-virtual {v1}, LH91;->h()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_1

    invoke-virtual {v1}, LgO2;->s()V

    invoke-virtual {v1}, LgO2;->r()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, LFX3;->g(Ljava/util/List;)LH91;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2, v1}, LFX3;->j(LH91;Ljava/util/List;)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final e(Ljava/util/List;)Ljava/util/List;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH91;

    iget-object v2, p0, LFX3;->a:LbC1;

    invoke-virtual {v1, v2}, LH91;->q(LbC1;)LCX3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final g(Ljava/util/List;)LH91;
    .locals 5

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LpU2;

    invoke-virtual {v3}, LH91;->k()Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    if-gt v2, p1, :cond_2

    move v0, p1

    :cond_2
    const-string p1, "found two shells in MinimalEdgeRing list"

    invoke-static {v0, p1}, LKo;->d(ZLjava/lang/String;)V

    return-object v1
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LFX3;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, LFX3;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH91;

    invoke-virtual {v0}, LH91;->j()LH91;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p1}, LFX3;->f(LH91;Ljava/util/List;)LH91;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, LH91;->p(LH91;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, LH91;->f(I)LyB0;

    move-result-object p2

    const-string v0, "unable to assign hole to a shell"

    invoke-direct {p1, v0, p2}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final j(LH91;Ljava/util/List;)V
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpU2;

    invoke-virtual {v0}, LH91;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, LH91;->p(LH91;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final k(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH91;

    invoke-virtual {v0}, LH91;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
