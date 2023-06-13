.class public LFW3;
.super LWB1;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x44077bad161cbb2aL


# instance fields
.field public g:LEB0;


# direct methods
.method public constructor <init>(LEB0;LbC1;)V
    .locals 0

    invoke-direct {p0, p2}, LWB1;-><init>(LbC1;)V

    invoke-virtual {p0, p1}, LFW3;->P0(LEB0;)V

    return-void
.end method


# virtual methods
.method public F()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public K0()LFW3;
    .locals 3

    new-instance v0, LFW3;

    iget-object v1, p0, LFW3;->g:LEB0;

    invoke-interface {v1}, LEB0;->copy()LEB0;

    move-result-object v1

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LFW3;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public L0()LEB0;
    .locals 1

    iget-object v0, p0, LFW3;->g:LEB0;

    return-object v0
.end method

.method public M0()D
    .locals 2

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    iget-wide v0, v0, LyB0;->b:D

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getX called on empty Point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public N()LWB1;
    .locals 1

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-virtual {v0}, LbC1;->c()LXB1;

    move-result-object v0

    return-object v0
.end method

.method public O0()D
    .locals 2

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    iget-wide v0, v0, LyB0;->c:D

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getY called on empty Point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public P()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final P0(LEB0;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object p1

    invoke-virtual {p1}, LbC1;->z()LFB0;

    move-result-object p1

    new-array v1, v0, [LyB0;

    invoke-interface {p1, v1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    move v0, v2

    :cond_1
    invoke-static {v0}, LKo;->c(Z)V

    iput-object p1, p0, LFW3;->g:LEB0;

    return-void
.end method

.method public W()LyB0;
    .locals 2

    iget-object v0, p0, LFW3;->g:LEB0;

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LFW3;->g:LEB0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LEB0;->u(I)LyB0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public Y()[LyB0;
    .locals 3

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [LyB0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [LyB0;

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v2

    aput-object v2, v0, v1

    :goto_0
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWB1;->m()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public d(LCB0;)V
    .locals 1

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    invoke-interface {p1, v0}, LCB0;->a(LyB0;)V

    return-void
.end method

.method public e(LGB0;)V
    .locals 2

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFW3;->g:LEB0;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, LGB0;->d(LEB0;I)V

    invoke-interface {p1}, LGB0;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LWB1;->H()V

    :cond_1
    return-void
.end method

.method public f(LZB1;)V
    .locals 0

    invoke-interface {p1, p0}, LZB1;->a(LWB1;)V

    return-void
.end method

.method public g0()I
    .locals 1

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LFW3;

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    invoke-virtual {p1}, LFW3;->W()LyB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LyB0;->d(LyB0;)I

    move-result p1

    return p1
.end method

.method public k()Lsf1;
    .locals 5

    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsf1;

    invoke-direct {v0}, Lsf1;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Lsf1;

    invoke-direct {v0}, Lsf1;-><init>()V

    iget-object v1, p0, LFW3;->g:LEB0;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, LEB0;->n2(I)D

    move-result-wide v3

    iget-object v1, p0, LFW3;->g:LEB0;

    invoke-interface {v1, v2}, LEB0;->N0(I)D

    move-result-wide v1

    invoke-virtual {v0, v3, v4, v1, v2}, Lsf1;->j(DD)V

    return-object v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LFW3;->K0()LFW3;

    move-result-object v0

    return-object v0
.end method

.method public r0()Z
    .locals 1

    iget-object v0, p0, LFW3;->g:LEB0;

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

.method public w(LWB1;D)Z
    .locals 3

    invoke-virtual {p0, p1}, LWB1;->s0(LWB1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0}, LFW3;->r0()Z

    move-result v0

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v2

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LFW3;

    invoke-virtual {p1}, LFW3;->W()LyB0;

    move-result-object p1

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2, p3}, LWB1;->r(LyB0;LyB0;D)Z

    move-result p1

    return p1
.end method
