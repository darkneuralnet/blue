.class public LCX3;
.super LWB1;
.source "SourceFile"

# interfaces
.implements LLX3;


# static fields
.field private static final serialVersionUID:J = -0x307ffefd8dc971b5L


# instance fields
.field public g:LKr2;

.field public h:[LKr2;


# direct methods
.method public constructor <init>(LKr2;[LKr2;LbC1;)V
    .locals 0

    invoke-direct {p0, p3}, LWB1;-><init>(LbC1;)V

    const/4 p3, 0x0

    iput-object p3, p0, LCX3;->g:LKr2;

    if-nez p1, :cond_0

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object p1

    invoke-virtual {p1}, LbC1;->h()LKr2;

    move-result-object p1

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    new-array p2, p2, [LKr2;

    :cond_1
    invoke-static {p2}, LWB1;->o0([Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-virtual {p1}, LBr2;->r0()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p2}, LWB1;->l0([LWB1;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "shell is empty but holes are not"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iput-object p1, p0, LCX3;->g:LKr2;

    iput-object p2, p0, LCX3;->h:[LKr2;

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "holes must not contain null elements"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public F()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public K0()LCX3;
    .locals 5

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LWB1;->m()LWB1;

    move-result-object v0

    check-cast v0, LKr2;

    iget-object v1, p0, LCX3;->h:[LKr2;

    array-length v1, v1

    new-array v1, v1, [LKr2;

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LCX3;->h:[LKr2;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->m()LWB1;

    move-result-object v3

    check-cast v3, LKr2;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, LCX3;

    iget-object v3, p0, LWB1;->c:LbC1;

    invoke-direct {v2, v0, v1, v3}, LCX3;-><init>(LKr2;[LKr2;LbC1;)V

    return-object v2
.end method

.method public L0()LKr2;
    .locals 1

    iget-object v0, p0, LCX3;->g:LKr2;

    return-object v0
.end method

.method public M()D
    .locals 5

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-static {v0}, LHm;->a(LEB0;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    add-double/2addr v0, v2

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LCX3;->h:[LKr2;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, LBr2;->M0()LEB0;

    move-result-object v3

    invoke-static {v3}, LHm;->a(LEB0;)D

    move-result-wide v3

    sub-double/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public M0(I)LKr2;
    .locals 1

    iget-object v0, p0, LCX3;->h:[LKr2;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public N()LWB1;
    .locals 7

    invoke-virtual {p0}, LCX3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-virtual {v0}, LbC1;->k()LDW2;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LCX3;->h:[LKr2;

    array-length v0, v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v2, v0, [LKr2;

    iget-object v3, p0, LCX3;->g:LKr2;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move v3, v4

    :goto_0
    iget-object v5, p0, LCX3;->h:[LKr2;

    array-length v6, v5

    if-ge v3, v6, :cond_1

    add-int/lit8 v6, v3, 0x1

    aget-object v3, v5, v3

    aput-object v3, v2, v6

    move v3, v6

    goto :goto_0

    :cond_1
    if-gt v0, v1, :cond_2

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    aget-object v1, v2, v4

    invoke-virtual {v1}, LBr2;->M0()LEB0;

    move-result-object v1

    invoke-virtual {v0, v1}, LbC1;->i(LEB0;)LKr2;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-virtual {v0, v2}, LbC1;->l([LBr2;)LDW2;

    move-result-object v0

    return-object v0
.end method

.method public O0()I
    .locals 1

    iget-object v0, p0, LCX3;->h:[LKr2;

    array-length v0, v0

    return v0
.end method

.method public P()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public W()LyB0;
    .locals 1

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->W()LyB0;

    move-result-object v0

    return-object v0
.end method

.method public Y()[LyB0;
    .locals 7

    invoke-virtual {p0}, LCX3;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [LyB0;

    return-object v0

    :cond_0
    invoke-virtual {p0}, LCX3;->g0()I

    move-result v0

    new-array v0, v0, [LyB0;

    iget-object v2, p0, LCX3;->g:LKr2;

    invoke-virtual {v2}, LBr2;->Y()[LyB0;

    move-result-object v2

    const/4 v3, -0x1

    move v4, v1

    :goto_0
    array-length v5, v2

    if-ge v4, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    aget-object v5, v2, v4

    aput-object v5, v0, v3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    iget-object v4, p0, LCX3;->h:[LKr2;

    array-length v5, v4

    if-ge v2, v5, :cond_3

    aget-object v4, v4, v2

    invoke-virtual {v4}, LBr2;->Y()[LyB0;

    move-result-object v4

    move v5, v1

    :goto_2
    array-length v6, v4

    if-ge v5, v6, :cond_2

    add-int/lit8 v3, v3, 0x1

    aget-object v6, v4, v5

    aput-object v6, v0, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWB1;->m()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public d(LCB0;)V
    .locals 3

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0, p1}, LBr2;->d(LCB0;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LCX3;->h:[LKr2;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LBr2;->d(LCB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(LGB0;)V
    .locals 3

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0, p1}, LBr2;->e(LGB0;)V

    invoke-interface {p1}, LGB0;->isDone()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LCX3;->h:[LKr2;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LBr2;->e(LGB0;)V

    invoke-interface {p1}, LGB0;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {p1}, LGB0;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LWB1;->H()V

    :cond_2
    return-void
.end method

.method public e0()D
    .locals 5

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->e0()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    add-double/2addr v0, v2

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LCX3;->h:[LKr2;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, LBr2;->e0()D

    move-result-wide v3

    add-double/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public f(LZB1;)V
    .locals 3

    invoke-interface {p1, p0}, LZB1;->a(LWB1;)V

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0, p1}, LBr2;->f(LZB1;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LCX3;->h:[LKr2;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LBr2;->f(LZB1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g0()I
    .locals 4

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->g0()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LCX3;->h:[LKr2;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2}, LBr2;->g0()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public j(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, LCX3;

    iget-object v0, p0, LCX3;->g:LKr2;

    iget-object v1, p1, LCX3;->g:LKr2;

    invoke-virtual {v0, v1}, LBr2;->j(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LCX3;->O0()I

    move-result v0

    invoke-virtual {p1}, LCX3;->O0()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, LCX3;->M0(I)LKr2;

    move-result-object v4

    invoke-virtual {p1, v3}, LCX3;->M0(I)LKr2;

    move-result-object v5

    invoke-virtual {v4, v5}, LBr2;->j(Ljava/lang/Object;)I

    move-result v4

    if-eqz v4, :cond_1

    return v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-ge v3, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    if-ge v3, v1, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    return v2
.end method

.method public k()Lsf1;
    .locals 1

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LWB1;->Z()Lsf1;

    move-result-object v0

    return-object v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LCX3;->K0()LCX3;

    move-result-object v0

    return-object v0
.end method

.method public r0()Z
    .locals 1

    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->r0()Z

    move-result v0

    return v0
.end method

.method public w(LWB1;D)Z
    .locals 4

    invoke-virtual {p0, p1}, LWB1;->s0(LWB1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LCX3;

    iget-object v0, p0, LCX3;->g:LKr2;

    iget-object v2, p1, LCX3;->g:LKr2;

    invoke-virtual {v0, v2, p2, p3}, LWB1;->w(LWB1;D)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LCX3;->h:[LKr2;

    array-length v0, v0

    iget-object v2, p1, LCX3;->h:[LKr2;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    move v0, v1

    :goto_0
    iget-object v2, p0, LCX3;->h:[LKr2;

    array-length v3, v2

    if-ge v0, v3, :cond_4

    aget-object v2, v2, v0

    iget-object v3, p1, LCX3;->h:[LKr2;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3, p2, p3}, LWB1;->w(LWB1;D)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public x0()Z
    .locals 12

    invoke-virtual {p0}, LCX3;->O0()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LCX3;->g:LKr2;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, LBr2;->g0()I

    move-result v0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, LCX3;->g:LKr2;

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v3

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_5

    invoke-interface {v0, v4}, LEB0;->n2(I)D

    move-result-wide v5

    invoke-virtual {v3}, Lsf1;->p()D

    move-result-wide v7

    cmpl-double v7, v5, v7

    if-eqz v7, :cond_3

    invoke-virtual {v3}, Lsf1;->n()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-eqz v5, :cond_3

    return v1

    :cond_3
    invoke-interface {v0, v4}, LEB0;->N0(I)D

    move-result-wide v5

    invoke-virtual {v3}, Lsf1;->q()D

    move-result-wide v7

    cmpl-double v7, v5, v7

    if-eqz v7, :cond_4

    invoke-virtual {v3}, Lsf1;->o()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-eqz v5, :cond_4

    return v1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v0, v1}, LEB0;->n2(I)D

    move-result-wide v2

    invoke-interface {v0, v1}, LEB0;->N0(I)D

    move-result-wide v4

    const/4 v6, 0x1

    move v7, v6

    :goto_1
    const/4 v8, 0x4

    if-gt v7, v8, :cond_9

    invoke-interface {v0, v7}, LEB0;->n2(I)D

    move-result-wide v8

    invoke-interface {v0, v7}, LEB0;->N0(I)D

    move-result-wide v10

    cmpl-double v2, v8, v2

    if-eqz v2, :cond_6

    move v2, v6

    goto :goto_2

    :cond_6
    move v2, v1

    :goto_2
    cmpl-double v3, v10, v4

    if-eqz v3, :cond_7

    move v3, v6

    goto :goto_3

    :cond_7
    move v3, v1

    :goto_3
    if-ne v2, v3, :cond_8

    return v1

    :cond_8
    add-int/lit8 v7, v7, 0x1

    move-wide v2, v8

    move-wide v4, v10

    goto :goto_1

    :cond_9
    return v6
.end method
