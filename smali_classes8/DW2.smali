.class public LDW2;
.super LXB1;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x7155d2ab4afa7f8dL


# direct methods
.method public constructor <init>([LBr2;LbC1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LXB1;-><init>([LWB1;LbC1;)V

    return-void
.end method


# virtual methods
.method public F()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic K0()LXB1;
    .locals 1

    invoke-virtual {p0}, LDW2;->L0()LDW2;

    move-result-object v0

    return-object v0
.end method

.method public L0()LDW2;
    .locals 4

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    new-array v1, v0, [LBr2;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LXB1;->g:[LWB1;

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->m()LWB1;

    move-result-object v3

    check-cast v3, LBr2;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LDW2;

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LDW2;-><init>([LBr2;LbC1;)V

    return-object v0
.end method

.method public M0()Z
    .locals 4

    invoke-virtual {p0}, LXB1;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, LXB1;->g:[LWB1;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    aget-object v2, v2, v0

    check-cast v2, LBr2;

    invoke-virtual {v2}, LBr2;->T0()Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public N()LWB1;
    .locals 1

    new-instance v0, Lv00;

    invoke-direct {v0, p0}, Lv00;-><init>(LWB1;)V

    invoke-virtual {v0}, Lv00;->e()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    invoke-virtual {p0}, LDW2;->M0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LDW2;->L0()LDW2;

    move-result-object v0

    return-object v0
.end method

.method public w(LWB1;D)Z
    .locals 1

    invoke-virtual {p0, p1}, LWB1;->s0(LWB1;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, LXB1;->w(LWB1;D)Z

    move-result p1

    return p1
.end method
