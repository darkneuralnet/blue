.class public LWW2;
.super LXB1;
.source "SourceFile"

# interfaces
.implements LLX3;


# static fields
.field private static final serialVersionUID:J = -0x7a5aa1369171983L


# direct methods
.method public constructor <init>([LCX3;LbC1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LXB1;-><init>([LWB1;LbC1;)V

    return-void
.end method


# virtual methods
.method public F()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public bridge synthetic K0()LXB1;
    .locals 1

    invoke-virtual {p0}, LWW2;->L0()LWW2;

    move-result-object v0

    return-object v0
.end method

.method public L0()LWW2;
    .locals 4

    iget-object v0, p0, LXB1;->g:[LWB1;

    array-length v0, v0

    new-array v1, v0, [LCX3;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LXB1;->g:[LWB1;

    aget-object v3, v3, v2

    invoke-virtual {v3}, LWB1;->m()LWB1;

    move-result-object v3

    check-cast v3, LCX3;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LWW2;

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LWW2;-><init>([LCX3;LbC1;)V

    return-object v0
.end method

.method public N()LWB1;
    .locals 6

    invoke-virtual {p0}, LXB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v0

    invoke-virtual {v0}, LbC1;->k()LDW2;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, LXB1;->g:[LWB1;

    array-length v4, v3

    if-ge v2, v4, :cond_2

    aget-object v3, v3, v2

    check-cast v3, LCX3;

    invoke-virtual {v3}, LCX3;->N()LWB1;

    move-result-object v3

    move v4, v1

    :goto_1
    invoke-virtual {v3}, LWB1;->f0()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v3, v4}, LWB1;->d0(I)LWB1;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [LBr2;

    invoke-virtual {p0}, LWB1;->c0()LbC1;

    move-result-object v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBr2;

    invoke-virtual {v2, v0}, LbC1;->l([LBr2;)LDW2;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LWW2;->L0()LWW2;

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
