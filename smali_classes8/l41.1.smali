.class public Ll41;
.super Lz91;
.source "SourceFile"


# instance fields
.field public d:Ljava/util/List;

.field public e:LSl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz91;-><init>()V

    return-void
.end method


# virtual methods
.method public b([LcC1;)V
    .locals 5

    invoke-super {p0, p1}, Lz91;->b([LcC1;)V

    new-instance p1, LSl2;

    const/4 v0, -0x1

    invoke-direct {p1, v0}, LSl2;-><init>(I)V

    iput-object p1, p0, Ll41;->e:LSl2;

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv91;

    invoke-virtual {v0}, Lv91;->e()Lq91;

    move-result-object v0

    invoke-virtual {v0}, LSD1;->b()LSl2;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v2}, LSl2;->d(I)I

    move-result v3

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    :cond_1
    iget-object v3, p0, Ll41;->e:LSl2;

    invoke-virtual {v3, v2, v1}, LSl2;->n(II)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public g(Lv91;)V
    .locals 0

    check-cast p1, Lk41;

    invoke-virtual {p0, p1, p1}, Lz91;->h(Lv91;Ljava/lang/Object;)V

    return-void
.end method

.method public k()V
    .locals 7

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->o()Lk41;

    move-result-object v5

    invoke-virtual {v1}, Lk41;->s()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v1}, Lk41;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Lk41;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v4

    :goto_0
    if-ne v0, v4, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk41;

    invoke-virtual {v4}, Lk41;->o()Lk41;

    move-result-object v5

    invoke-virtual {v4}, Lk41;->s()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v4}, Lk41;->e()Lq91;

    move-result-object v4

    if-nez v0, :cond_5

    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5}, LSD1;->f(Z)V

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lk41;->q()Z

    move-result v4

    if-eqz v4, :cond_7

    move v0, v2

    :cond_7
    invoke-virtual {v5}, Lk41;->q()Z

    move-result v4

    if-eqz v4, :cond_4

    move v0, v3

    goto :goto_1

    :cond_8
    return-void
.end method

.method public l()LSl2;
    .locals 1

    iget-object v0, p0, Ll41;->e:LSl2;

    return-object v0
.end method

.method public m(LH91;)I
    .locals 3

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk41;

    invoke-virtual {v2}, Lk41;->k()LH91;

    move-result-object v2

    if-ne v2, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final n()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ll41;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll41;->d:Ljava/util/List;

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->q()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lk41;->o()Lk41;

    move-result-object v2

    invoke-virtual {v2}, Lk41;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_2
    iget-object v2, p0, Ll41;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ll41;->d:Ljava/util/List;

    return-object v0
.end method

.method public o(LH91;)V
    .locals 9

    iget-object v0, p0, Ll41;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v4, v1

    move-object v3, v2

    :goto_0
    const/4 v5, 0x2

    if-ltz v0, :cond_5

    iget-object v6, p0, Ll41;->d:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lk41;

    invoke-virtual {v6}, Lk41;->o()Lk41;

    move-result-object v7

    if-nez v2, :cond_0

    invoke-virtual {v6}, Lk41;->k()LH91;

    move-result-object v8

    if-ne v8, p1, :cond_0

    move-object v2, v6

    :cond_0
    if-eq v4, v1, :cond_3

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lk41;->k()LH91;

    move-result-object v5

    if-eq v5, p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v6}, Lk41;->F(Lk41;)V

    move v4, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v7}, Lk41;->k()LH91;

    move-result-object v6

    if-eq v6, p1, :cond_4

    goto :goto_1

    :cond_4
    move v4, v5

    move-object v3, v7

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    if-ne v4, v5, :cond_8

    const/4 v0, 0x0

    if-eqz v2, :cond_6

    move v4, v1

    goto :goto_2

    :cond_6
    move v4, v0

    :goto_2
    const-string v5, "found null for first outgoing dirEdge"

    invoke-static {v4, v5}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v2}, Lk41;->k()LH91;

    move-result-object v4

    if-ne v4, p1, :cond_7

    goto :goto_3

    :cond_7
    move v1, v0

    :goto_3
    const-string p1, "unable to link last incoming dirEdge"

    invoke-static {v1, p1}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v3, v2}, Lk41;->F(Lk41;)V

    :cond_8
    return-void
.end method

.method public p()V
    .locals 9

    invoke-virtual {p0}, Ll41;->n()Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    move-object v2, v0

    :goto_0
    iget-object v5, p0, Ll41;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-ge v3, v5, :cond_6

    iget-object v5, p0, Ll41;->d:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk41;

    invoke-virtual {v5}, Lk41;->o()Lk41;

    move-result-object v7

    invoke-virtual {v5}, Lv91;->f()LSl2;

    move-result-object v8

    invoke-virtual {v8}, LSl2;->g()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {v5}, Lk41;->q()Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v0, v5

    :cond_1
    if-eq v4, v1, :cond_4

    if-eq v4, v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lk41;->q()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v5}, Lk41;->E(Lk41;)V

    move v4, v1

    goto :goto_1

    :cond_4
    invoke-virtual {v7}, Lk41;->q()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    move v4, v6

    move-object v2, v7

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    if-ne v4, v6, :cond_8

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lk41;->q()Z

    move-result v1

    const-string v3, "unable to link last incoming dirEdge"

    invoke-static {v1, v3}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v2, v0}, Lk41;->E(Lk41;)V

    goto :goto_2

    :cond_7
    new-instance v0, Lorg/locationtech/jts/geom/TopologyException;

    const-string v1, "no outgoing dirEdge found"

    invoke-virtual {p0}, Lz91;->c()LyB0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw v0

    :cond_8
    :goto_2
    return-void
.end method

.method public q()V
    .locals 3

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v2

    invoke-virtual {v1}, Lk41;->o()Lk41;

    move-result-object v1

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v1

    invoke-virtual {v2, v1}, LSl2;->k(LSl2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(LSl2;)V
    .locals 4

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, LSl2;->d(I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, LSl2;->m(II)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, LSl2;->d(I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, LSl2;->m(II)V

    goto :goto_0

    :cond_0
    return-void
.end method
