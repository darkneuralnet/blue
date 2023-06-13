.class public LBr2;
.super LWB1;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x2b2b51ba435c8e38L


# instance fields
.field public g:LEB0;


# direct methods
.method public constructor <init>(LEB0;LbC1;)V
    .locals 0

    invoke-direct {p0, p2}, LWB1;-><init>(LbC1;)V

    invoke-virtual {p0, p1}, LBr2;->S0(LEB0;)V

    return-void
.end method


# virtual methods
.method public F()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public K0()LBr2;
    .locals 3

    new-instance v0, LBr2;

    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1}, LEB0;->copy()LEB0;

    move-result-object v1

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LBr2;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public L0(I)LyB0;
    .locals 1

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0, p1}, LEB0;->u(I)LyB0;

    move-result-object p1

    return-object p1
.end method

.method public M0()LEB0;
    .locals 1

    iget-object v0, p0, LBr2;->g:LEB0;

    return-object v0
.end method

.method public N()LWB1;
    .locals 1

    new-instance v0, Lv00;

    invoke-direct {v0, p0}, Lv00;-><init>(LWB1;)V

    invoke-virtual {v0}, Lv00;->e()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public O0()LFW3;
    .locals 1

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LBr2;->g0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LBr2;->P0(I)LFW3;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    invoke-virtual {p0}, LBr2;->T0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P0(I)LFW3;
    .locals 2

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1, p1}, LEB0;->u(I)LyB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->t(LyB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public R0()LFW3;
    .locals 1

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LBr2;->P0(I)LFW3;

    move-result-object v0

    return-object v0
.end method

.method public final S0(LEB0;)V
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object p1

    invoke-virtual {p1}, LbC1;->z()LFB0;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [LyB0;

    invoke-interface {p1, v0}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p1}, LEB0;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid number of points in LineString (found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LEB0;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " - must be 0 or >= "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, LBr2;->g:LEB0;

    return-void
.end method

.method public T0()Z
    .locals 2

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, v1}, LBr2;->L0(I)LyB0;

    move-result-object v0

    invoke-virtual {p0}, LBr2;->g0()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LBr2;->L0(I)LyB0;

    move-result-object v1

    invoke-virtual {v0, v1}, LyB0;->g(LyB0;)Z

    move-result v0

    return v0
.end method

.method public W()LyB0;
    .locals 2

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LBr2;->g:LEB0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LEB0;->u(I)LyB0;

    move-result-object v0

    return-object v0
.end method

.method public Y()[LyB0;
    .locals 1

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0}, LEB0;->b2()[LyB0;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWB1;->m()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public d(LCB0;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1}, LEB0;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1, v0}, LEB0;->u(I)LyB0;

    move-result-object v1

    invoke-interface {p1, v1}, LCB0;->a(LyB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(LGB0;)V
    .locals 2

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1}, LEB0;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {p1, v1, v0}, LGB0;->d(LEB0;I)V

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
    .locals 2

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-static {v0}, Liq2;->a(LEB0;)D

    move-result-wide v0

    return-wide v0
.end method

.method public f(LZB1;)V
    .locals 0

    invoke-interface {p1, p0}, LZB1;->a(LWB1;)V

    return-void
.end method

.method public g0()I
    .locals 1

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    return v0
.end method

.method public j(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, LBr2;

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, LBr2;->g:LEB0;

    invoke-interface {v3}, LEB0;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p1, LBr2;->g:LEB0;

    invoke-interface {v3}, LEB0;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, LBr2;->g:LEB0;

    invoke-interface {v3, v1}, LEB0;->u(I)LyB0;

    move-result-object v3

    iget-object v4, p1, LBr2;->g:LEB0;

    invoke-interface {v4, v2}, LEB0;->u(I)LyB0;

    move-result-object v4

    invoke-virtual {v3, v4}, LyB0;->d(LyB0;)I

    move-result v3

    if-eqz v3, :cond_0

    return v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, LBr2;->g:LEB0;

    invoke-interface {v3}, LEB0;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    iget-object p1, p1, LBr2;->g:LEB0;

    invoke-interface {p1}, LEB0;->size()I

    move-result p1

    if-ge v2, p1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    return v0
.end method

.method public k()Lsf1;
    .locals 2

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsf1;

    invoke-direct {v0}, Lsf1;-><init>()V

    return-object v0

    :cond_0
    iget-object v0, p0, LBr2;->g:LEB0;

    new-instance v1, Lsf1;

    invoke-direct {v1}, Lsf1;-><init>()V

    invoke-interface {v0, v1}, LEB0;->m0(Lsf1;)Lsf1;

    move-result-object v0

    return-object v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LBr2;->K0()LBr2;

    move-result-object v0

    return-object v0
.end method

.method public r0()Z
    .locals 1

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s0(LWB1;)Z
    .locals 0

    instance-of p1, p1, LBr2;

    return p1
.end method

.method public w(LWB1;D)Z
    .locals 4

    invoke-virtual {p0, p1}, LBr2;->s0(LWB1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LBr2;

    iget-object v0, p0, LBr2;->g:LEB0;

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    iget-object v2, p1, LBr2;->g:LEB0;

    invoke-interface {v2}, LEB0;->size()I

    move-result v2

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    move v0, v1

    :goto_0
    iget-object v2, p0, LBr2;->g:LEB0;

    invoke-interface {v2}, LEB0;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, LBr2;->g:LEB0;

    invoke-interface {v2, v0}, LEB0;->u(I)LyB0;

    move-result-object v2

    iget-object v3, p1, LBr2;->g:LEB0;

    invoke-interface {v3, v0}, LEB0;->u(I)LyB0;

    move-result-object v3

    invoke-virtual {p0, v2, v3, p2, p3}, LWB1;->r(LyB0;LyB0;D)Z

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
