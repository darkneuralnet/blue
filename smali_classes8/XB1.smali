.class public LXB1;
.super LWB1;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x4f07bcb1f857d89bL


# instance fields
.field public g:[LWB1;


# direct methods
.method public constructor <init>([LWB1;LbC1;)V
    .locals 0

    invoke-direct {p0, p2}, LWB1;-><init>(LbC1;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [LWB1;

    :cond_0
    invoke-static {p1}, LWB1;->o0([Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iput-object p1, p0, LXB1;->g:[LWB1;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "geometries must not contain null elements"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public F()I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2}, LWB1;->F()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public K0()LXB1;
    .locals 4

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    new-array v1, v0, [LWB1;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LXB1;->g:[LWB1;

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->m()LWB1;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LXB1;

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LXB1;-><init>([LWB1;LbC1;)V

    return-object v0
.end method

.method public M()D
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LXB1;->g:[LWB1;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->M()D

    move-result-wide v3

    add-double/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public N()LWB1;
    .locals 1

    invoke-static {p0}, LWB1;->g(LWB1;)V

    invoke-static {}, LKo;->e()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public P()I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2}, LWB1;->P()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public W()LyB0;
    .locals 2

    invoke-virtual {p0}, LXB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LXB1;->g:[LWB1;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LWB1;->W()LyB0;

    move-result-object v0

    return-object v0
.end method

.method public Y()[LyB0;
    .locals 7

    invoke-virtual {p0}, LXB1;->g0()I

    move-result v0

    new-array v0, v0, [LyB0;

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v4, p0, LXB1;->g:[LWB1;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, LWB1;->Y()[LyB0;

    move-result-object v4

    move v5, v2

    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_0

    add-int/lit8 v1, v1, 0x1

    aget-object v6, v4, v5

    aput-object v6, v0, v1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
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

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LXB1;->g:[LWB1;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LWB1;->d(LCB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d0(I)LWB1;
    .locals 1

    iget-object v0, p0, LXB1;->g:[LWB1;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public e(LGB0;)V
    .locals 3

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LXB1;->g:[LWB1;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LWB1;->e(LGB0;)V

    invoke-interface {p1}, LGB0;->isDone()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p1}, LGB0;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, LWB1;->H()V

    :cond_3
    return-void
.end method

.method public e0()D
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LXB1;->g:[LWB1;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->e0()D

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

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LXB1;->g:[LWB1;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, LWB1;->f(LZB1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f0()I
    .locals 1

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    return v0
.end method

.method public g0()I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v0, v3, :cond_0

    aget-object v2, v2, v0

    invoke-virtual {v2}, LWB1;->g0()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public j(Ljava/lang/Object;)I
    .locals 2

    new-instance v0, Ljava/util/TreeSet;

    iget-object v1, p0, LXB1;->g:[LWB1;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/TreeSet;

    check-cast p1, LXB1;

    iget-object p1, p1, LXB1;->g:[LWB1;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0, v1}, LWB1;->h(Ljava/util/Collection;Ljava/util/Collection;)I

    move-result p1

    return p1
.end method

.method public k()Lsf1;
    .locals 4

    new-instance v0, Lsf1;

    invoke-direct {v0}, Lsf1;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2}, LWB1;->Z()Lsf1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lsf1;->l(Lsf1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LXB1;->K0()LXB1;

    move-result-object v0

    return-object v0
.end method

.method public r0()Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    invoke-virtual {v2}, LWB1;->r0()Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

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
    check-cast p1, LXB1;

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    iget-object v2, p1, LXB1;->g:[LWB1;

    array-length v2, v2

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    move v0, v1

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v0, v3, :cond_3

    aget-object v2, v2, v0

    iget-object v3, p1, LXB1;->g:[LWB1;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3, p2, p3}, LWB1;->w(LWB1;D)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
