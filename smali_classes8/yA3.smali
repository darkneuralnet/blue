.class public LyA3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILf32;LeZ3;)Lsf1;
    .locals 2

    invoke-static {p0, p1, p2}, LyA3;->n(ILf32;LeZ3;)Lsf1;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf32;->d(I)LWB1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lf32;->d(I)LWB1;

    move-result-object p1

    invoke-static {v0, p1, p0}, LAb5;->g(LWB1;LWB1;Lsf1;)Lsf1;

    move-result-object p0

    invoke-static {p0, p2}, LyA3;->p(Lsf1;LeZ3;)Lsf1;

    move-result-object p0

    return-object p0
.end method

.method public static b(ILbC1;)LWB1;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_3

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "Unable to determine overlay result geometry dimension"

    invoke-static {p0}, LKo;->f(Ljava/lang/String;)V

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LbC1;->v()LCX3;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LbC1;->e()LBr2;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LbC1;->s()LFW3;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LbC1;->c()LXB1;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static c(Ljava/util/List;Ljava/util/List;Ljava/util/List;LbC1;)LWB1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LCX3;",
            ">;",
            "Ljava/util/List<",
            "LBr2;",
            ">;",
            "Ljava/util/List<",
            "LFW3;",
            ">;",
            "LbC1;",
            ")",
            "LWB1;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_0

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p3, v0}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lsf1;Lsf1;LeZ3;)Z
    .locals 6

    invoke-virtual {p1}, Lsf1;->p()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, LeZ3;->e(D)D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->n()D

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, LeZ3;->e(D)D

    move-result-wide v2

    cmpl-double v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lsf1;->n()D

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, LeZ3;->e(D)D

    move-result-wide v2

    invoke-virtual {p0}, Lsf1;->p()D

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, LeZ3;->e(D)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lsf1;->q()D

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, LeZ3;->e(D)D

    move-result-wide v2

    invoke-virtual {p0}, Lsf1;->o()D

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, LeZ3;->e(D)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, LeZ3;->e(D)D

    move-result-wide v2

    invoke-virtual {p0}, Lsf1;->q()D

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, LeZ3;->e(D)D

    move-result-wide p0

    cmpg-double p0, v2, p0

    if-gez p0, :cond_3

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static e(LWB1;)Z
    .locals 0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result p0

    if-eqz p0, :cond_0

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

.method public static f(ILWB1;LWB1;LeZ3;)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 p3, 0x2

    if-eq p0, p3, :cond_1

    const/4 p3, 0x3

    if-eq p0, p3, :cond_0

    const/4 p3, 0x4

    if-eq p0, p3, :cond_1

    goto :goto_0

    :cond_0
    invoke-static {p1}, LyA3;->e(LWB1;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v0

    :cond_1
    invoke-static {p1}, LyA3;->e(LWB1;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {p2}, LyA3;->e(LWB1;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v0

    :cond_2
    invoke-static {p1, p2, p3}, LyA3;->g(LWB1;LWB1;LeZ3;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static g(LWB1;LWB1;LeZ3;)Z
    .locals 1

    invoke-static {p0}, LyA3;->e(LWB1;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, LyA3;->e(LWB1;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsf1;->g(Lsf1;)Z

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    invoke-static {p0, p1, p2}, LyA3;->d(Lsf1;Lsf1;LeZ3;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static h(LeZ3;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, LeZ3;->d()Z

    move-result p0

    return p0
.end method

.method public static i(DDD)Z
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    mul-double/2addr p2, v0

    cmpl-double p0, p0, p2

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static j(DDD)Z
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr p4, v0

    mul-double/2addr p2, p4

    cmpg-double p0, p0, p2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static k(LWB1;LWB1;ILWB1;)Z
    .locals 11

    const/4 v0, 0x1

    if-eqz p0, :cond_6

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p3}, LWB1;->M()D

    move-result-wide v7

    invoke-virtual {p0}, LWB1;->M()D

    move-result-wide v9

    invoke-virtual {p1}, LWB1;->M()D

    move-result-wide p0

    const/4 p3, 0x0

    if-eq p2, v0, :cond_5

    const/4 v1, 0x2

    if-eq p2, v1, :cond_4

    const/4 v1, 0x3

    if-eq p2, v1, :cond_2

    const/4 p3, 0x4

    if-eq p2, p3, :cond_1

    goto/16 :goto_0

    :cond_1
    add-double v3, v9, p0

    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result v0

    goto/16 :goto_0

    :cond_2
    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    move-wide v3, v9

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result p2

    if-eqz p2, :cond_3

    sub-double v3, v9, p0

    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    invoke-static/range {v1 .. v6}, LyA3;->i(DDD)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    move v0, p3

    goto :goto_0

    :cond_4
    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v9

    move-wide v3, v7

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, p0

    move-wide v3, v7

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result p2

    if-eqz p2, :cond_3

    sub-double v3, v9, p0

    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    invoke-static/range {v1 .. v6}, LyA3;->i(DDD)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_5
    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    move-wide v3, v9

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide v5, 0x3fb999999999999aL    # 0.1

    move-wide v1, v7

    move-wide v3, p0

    invoke-static/range {v1 .. v6}, LyA3;->j(DDD)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_6
    :goto_0
    return v0
.end method

.method public static l(LnA3;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LnA3;->x()LqA3;

    move-result-object v1

    invoke-virtual {p0}, LnA3;->z()Z

    move-result v2

    invoke-virtual {v1, v2}, LqA3;->F(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LnA3;->B()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, " Res"

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(III)I
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_3
    :goto_0
    return p1
.end method

.method public static n(ILf32;LeZ3;)Lsf1;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Lf32;->c(I)Lsf1;

    move-result-object p0

    invoke-static {p0, p2}, LyA3;->p(Lsf1;LeZ3;)Lsf1;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Lf32;->c(I)Lsf1;

    move-result-object p0

    invoke-static {p0, p2}, LyA3;->p(Lsf1;LeZ3;)Lsf1;

    move-result-object p0

    invoke-virtual {p1, v1}, Lf32;->c(I)Lsf1;

    move-result-object p1

    invoke-static {p1, p2}, LyA3;->p(Lsf1;LeZ3;)Lsf1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lsf1;->v(Lsf1;)Lsf1;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static o(LFW3;LeZ3;)LyB0;
    .locals 1

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object p0

    invoke-virtual {p0}, LyB0;->e()LyB0;

    move-result-object p0

    invoke-static {p1}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, LeZ3;->f(LyB0;)V

    :cond_1
    return-object p0
.end method

.method public static p(Lsf1;LeZ3;)Lsf1;
    .locals 2

    invoke-static {p0, p1}, LyA3;->q(Lsf1;LeZ3;)D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->c()Lsf1;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Lsf1;->h(D)V

    return-object p0
.end method

.method public static q(Lsf1;LeZ3;)D
    .locals 4

    invoke-static {p1}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lsf1;->m()D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->r()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Lsf1;->m()D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->r()D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    :cond_0
    const-wide p0, 0x3fb999999999999aL    # 0.1

    goto :goto_0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p1}, LeZ3;->b()D

    move-result-wide p0

    div-double/2addr v0, p0

    const-wide/high16 p0, 0x4008000000000000L    # 3.0

    :goto_0
    mul-double/2addr v0, p0

    return-wide v0
.end method

.method public static r(LpA3;ZLbC1;)LWB1;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LpA3;->b()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    if-nez p1, :cond_1

    invoke-virtual {v1}, LnA3;->B()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LnA3;->u()[LyB0;

    move-result-object v2

    invoke-virtual {p2, v2}, LbC1;->g([LyB0;)LBr2;

    move-result-object v2

    invoke-static {v1}, LyA3;->l(LnA3;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LWB1;->F0(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p2, v0}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p0

    return-object p0
.end method
