.class public LKr2;
.super LBr2;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x3b229e262367a6b5L


# direct methods
.method public constructor <init>(LEB0;LbC1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LBr2;-><init>(LEB0;LbC1;)V

    invoke-virtual {p0}, LKr2;->V0()V

    return-void
.end method


# virtual methods
.method public bridge synthetic K0()LBr2;
    .locals 1

    invoke-virtual {p0}, LKr2;->U0()LKr2;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public T0()Z
    .locals 1

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-super {p0}, LBr2;->T0()Z

    move-result v0

    return v0
.end method

.method public U0()LKr2;
    .locals 3

    new-instance v0, LKr2;

    iget-object v1, p0, LBr2;->g:LEB0;

    invoke-interface {v1}, LEB0;->copy()LEB0;

    move-result-object v1

    iget-object v2, p0, LWB1;->c:LbC1;

    invoke-direct {v0, v1, v2}, LKr2;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public final V0()V
    .locals 4

    invoke-virtual {p0}, LBr2;->r0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, LBr2;->T0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Points of LinearRing do not form a closed linestring"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-interface {v0}, LEB0;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid number of points in LinearRing (found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LBr2;->M0()LEB0;

    move-result-object v3

    invoke-interface {v3}, LEB0;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " - must be 0 or >= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method public k0()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public bridge synthetic n()LWB1;
    .locals 1

    invoke-virtual {p0}, LKr2;->U0()LKr2;

    move-result-object v0

    return-object v0
.end method
