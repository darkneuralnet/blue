.class public LCy;
.super LJL1;
.source "SourceFile"


# instance fields
.field public X0:I

.field public Y0:Z

.field public Z0:I

.field public a1:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LJL1;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LCy;->X0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, LCy;->Y0:Z

    iput v0, p0, LCy;->Z0:I

    iput-boolean v0, p0, LCy;->a1:Z

    return-void
.end method


# virtual methods
.method public A1()I
    .locals 1

    iget v0, p0, LCy;->Z0:I

    return v0
.end method

.method public B1()I
    .locals 3

    iget v0, p0, LCy;->X0:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public C1()V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LJL1;->W0:I

    if-ge v1, v2, :cond_5

    iget-object v2, p0, LJL1;->V0:[Liz0;

    aget-object v2, v2, v1

    iget-boolean v3, p0, LCy;->Y0:Z

    if-nez v3, :cond_0

    invoke-virtual {v2}, Liz0;->h()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    iget v3, p0, LCy;->X0:I

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    if-eq v3, v5, :cond_2

    const/4 v5, 0x3

    if-ne v3, v5, :cond_4

    :cond_2
    invoke-virtual {v2, v4, v4}, Liz0;->W0(IZ)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v2, v0, v4}, Liz0;->W0(IZ)V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public D1(Z)V
    .locals 0

    iput-boolean p1, p0, LCy;->Y0:Z

    return-void
.end method

.method public E1(I)V
    .locals 0

    iput p1, p0, LCy;->X0:I

    return-void
.end method

.method public F1(I)V
    .locals 0

    iput p1, p0, LCy;->Z0:I

    return-void
.end method

.method public g(LLr2;Z)V
    .locals 12

    iget-object p2, p0, Liz0;->Y:[LXy0;

    iget-object v0, p0, Liz0;->Q:LXy0;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    iget-object v0, p0, Liz0;->R:LXy0;

    const/4 v2, 0x2

    aput-object v0, p2, v2

    iget-object v0, p0, Liz0;->S:LXy0;

    const/4 v3, 0x1

    aput-object v0, p2, v3

    iget-object v0, p0, Liz0;->T:LXy0;

    const/4 v4, 0x3

    aput-object v0, p2, v4

    move p2, v1

    :goto_0
    iget-object v0, p0, Liz0;->Y:[LXy0;

    array-length v5, v0

    if-ge p2, v5, :cond_0

    aget-object v0, v0, p2

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v5

    iput-object v5, v0, LXy0;->i:LrN5;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget p2, p0, LCy;->X0:I

    if-ltz p2, :cond_1f

    const/4 v5, 0x4

    if-ge p2, v5, :cond_1f

    aget-object p2, v0, p2

    iget-boolean v0, p0, LCy;->a1:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LCy;->x1()Z

    :cond_1
    iget-boolean v0, p0, LCy;->a1:Z

    if-eqz v0, :cond_6

    iput-boolean v1, p0, LCy;->a1:Z

    iget p2, p0, LCy;->X0:I

    if-eqz p2, :cond_4

    if-ne p2, v3, :cond_2

    goto :goto_1

    :cond_2
    if-eq p2, v2, :cond_3

    if-ne p2, v4, :cond_5

    :cond_3
    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget v0, p0, Liz0;->i0:I

    invoke-virtual {p1, p2, v0}, LLr2;->f(LrN5;I)V

    iget-object p2, p0, Liz0;->T:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget v0, p0, Liz0;->i0:I

    invoke-virtual {p1, p2, v0}, LLr2;->f(LrN5;I)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget v0, p0, Liz0;->h0:I

    invoke-virtual {p1, p2, v0}, LLr2;->f(LrN5;I)V

    iget-object p2, p0, Liz0;->S:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget v0, p0, Liz0;->h0:I

    invoke-virtual {p1, p2, v0}, LLr2;->f(LrN5;I)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    move v0, v1

    :goto_3
    iget v6, p0, LJL1;->W0:I

    if-ge v0, v6, :cond_c

    iget-object v6, p0, LJL1;->V0:[Liz0;

    aget-object v6, v6, v0

    iget-boolean v7, p0, LCy;->Y0:Z

    if-nez v7, :cond_7

    invoke-virtual {v6}, Liz0;->h()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_5

    :cond_7
    iget v7, p0, LCy;->X0:I

    if-eqz v7, :cond_8

    if-ne v7, v3, :cond_9

    :cond_8
    invoke-virtual {v6}, Liz0;->C()Liz0$b;

    move-result-object v7

    sget-object v8, Liz0$b;->d:Liz0$b;

    if-ne v7, v8, :cond_9

    iget-object v7, v6, Liz0;->Q:LXy0;

    iget-object v7, v7, LXy0;->f:LXy0;

    if-eqz v7, :cond_9

    iget-object v7, v6, Liz0;->S:LXy0;

    iget-object v7, v7, LXy0;->f:LXy0;

    if-eqz v7, :cond_9

    :goto_4
    move v0, v3

    goto :goto_6

    :cond_9
    iget v7, p0, LCy;->X0:I

    if-eq v7, v2, :cond_a

    if-ne v7, v4, :cond_b

    :cond_a
    invoke-virtual {v6}, Liz0;->V()Liz0$b;

    move-result-object v7

    sget-object v8, Liz0$b;->d:Liz0$b;

    if-ne v7, v8, :cond_b

    iget-object v7, v6, Liz0;->R:LXy0;

    iget-object v7, v7, LXy0;->f:LXy0;

    if-eqz v7, :cond_b

    iget-object v6, v6, Liz0;->T:LXy0;

    iget-object v6, v6, LXy0;->f:LXy0;

    if-eqz v6, :cond_b

    goto :goto_4

    :cond_b
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_c
    move v0, v1

    :goto_6
    iget-object v6, p0, Liz0;->Q:LXy0;

    invoke-virtual {v6}, LXy0;->l()Z

    move-result v6

    if-nez v6, :cond_e

    iget-object v6, p0, Liz0;->S:LXy0;

    invoke-virtual {v6}, LXy0;->l()Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_7

    :cond_d
    move v6, v1

    goto :goto_8

    :cond_e
    :goto_7
    move v6, v3

    :goto_8
    iget-object v7, p0, Liz0;->R:LXy0;

    invoke-virtual {v7}, LXy0;->l()Z

    move-result v7

    if-nez v7, :cond_10

    iget-object v7, p0, Liz0;->T:LXy0;

    invoke-virtual {v7}, LXy0;->l()Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_9

    :cond_f
    move v7, v1

    goto :goto_a

    :cond_10
    :goto_9
    move v7, v3

    :goto_a
    if-nez v0, :cond_15

    iget v8, p0, LCy;->X0:I

    if-nez v8, :cond_11

    if-nez v6, :cond_14

    :cond_11
    if-ne v8, v2, :cond_12

    if-nez v7, :cond_14

    :cond_12
    if-ne v8, v3, :cond_13

    if-nez v6, :cond_14

    :cond_13
    if-ne v8, v4, :cond_15

    if-eqz v7, :cond_15

    :cond_14
    move v6, v3

    goto :goto_b

    :cond_15
    move v6, v1

    :goto_b
    if-nez v6, :cond_16

    move v6, v5

    goto :goto_c

    :cond_16
    const/4 v6, 0x5

    :goto_c
    move v7, v1

    :goto_d
    iget v8, p0, LJL1;->W0:I

    if-ge v7, v8, :cond_1b

    iget-object v8, p0, LJL1;->V0:[Liz0;

    aget-object v8, v8, v7

    iget-boolean v9, p0, LCy;->Y0:Z

    if-nez v9, :cond_17

    invoke-virtual {v8}, Liz0;->h()Z

    move-result v9

    if-nez v9, :cond_17

    goto :goto_11

    :cond_17
    iget-object v9, v8, Liz0;->Y:[LXy0;

    iget v10, p0, LCy;->X0:I

    aget-object v9, v9, v10

    invoke-virtual {p1, v9}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v9

    iget-object v8, v8, Liz0;->Y:[LXy0;

    iget v10, p0, LCy;->X0:I

    aget-object v8, v8, v10

    iput-object v9, v8, LXy0;->i:LrN5;

    iget-object v11, v8, LXy0;->f:LXy0;

    if-eqz v11, :cond_18

    iget-object v11, v11, LXy0;->d:Liz0;

    if-ne v11, p0, :cond_18

    iget v8, v8, LXy0;->g:I

    add-int/2addr v8, v1

    goto :goto_e

    :cond_18
    move v8, v1

    :goto_e
    if-eqz v10, :cond_1a

    if-ne v10, v2, :cond_19

    goto :goto_f

    :cond_19
    iget-object v10, p2, LXy0;->i:LrN5;

    iget v11, p0, LCy;->Z0:I

    add-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v0}, LLr2;->g(LrN5;LrN5;IZ)V

    goto :goto_10

    :cond_1a
    :goto_f
    iget-object v10, p2, LXy0;->i:LrN5;

    iget v11, p0, LCy;->Z0:I

    sub-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v0}, LLr2;->i(LrN5;LrN5;IZ)V

    :goto_10
    iget-object v10, p2, LXy0;->i:LrN5;

    iget v11, p0, LCy;->Z0:I

    add-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v6}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :goto_11
    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_1b
    iget p2, p0, LCy;->X0:I

    const/16 v0, 0x8

    if-nez p2, :cond_1c

    iget-object p2, p0, Liz0;->S:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v2, p0, Liz0;->Q:LXy0;

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v2, v1, v0}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->S:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v5}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->Q:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v1}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto/16 :goto_12

    :cond_1c
    if-ne p2, v3, :cond_1d

    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v2, p0, Liz0;->S:LXy0;

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v2, v1, v0}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->Q:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v5}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->Q:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->S:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v1}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_12

    :cond_1d
    if-ne p2, v2, :cond_1e

    iget-object p2, p0, Liz0;->T:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v2, p0, Liz0;->R:LXy0;

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v2, v1, v0}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->T:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v5}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->R:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v1}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_12

    :cond_1e
    if-ne p2, v4, :cond_1f

    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v2, p0, Liz0;->T:LXy0;

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v2, v1, v0}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->R:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v5}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object p2, p0, Liz0;->R:LXy0;

    iget-object p2, p2, LXy0;->i:LrN5;

    iget-object v0, p0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->T:LXy0;

    iget-object v0, v0, LXy0;->i:LrN5;

    invoke-virtual {p1, p2, v0, v1, v1}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_1f
    :goto_12
    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n(Liz0;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liz0;",
            "Ljava/util/HashMap<",
            "Liz0;",
            "Liz0;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LJL1;->n(Liz0;Ljava/util/HashMap;)V

    check-cast p1, LCy;

    iget p2, p1, LCy;->X0:I

    iput p2, p0, LCy;->X0:I

    iget-boolean p2, p1, LCy;->Y0:Z

    iput-boolean p2, p0, LCy;->Y0:Z

    iget p1, p1, LCy;->Z0:I

    iput p1, p0, LCy;->Z0:I

    return-void
.end method

.method public p0()Z
    .locals 1

    iget-boolean v0, p0, LCy;->a1:Z

    return v0
.end method

.method public q0()Z
    .locals 1

    iget-boolean v0, p0, LCy;->a1:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Barrier] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Liz0;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, LJL1;->W0:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LJL1;->V0:[Liz0;

    aget-object v2, v2, v1

    if-lez v1, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Liz0;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x1()Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    :goto_0
    iget v4, p0, LJL1;->W0:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ge v2, v4, :cond_5

    iget-object v4, p0, LJL1;->V0:[Liz0;

    aget-object v4, v4, v2

    iget-boolean v7, p0, LCy;->Y0:Z

    if-nez v7, :cond_0

    invoke-virtual {v4}, Liz0;->h()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    iget v7, p0, LCy;->X0:I

    if-eqz v7, :cond_1

    if-ne v7, v0, :cond_2

    :cond_1
    invoke-virtual {v4}, Liz0;->p0()Z

    move-result v7

    if-nez v7, :cond_2

    :goto_1
    move v3, v1

    goto :goto_2

    :cond_2
    iget v7, p0, LCy;->X0:I

    if-eq v7, v6, :cond_3

    if-ne v7, v5, :cond_4

    :cond_3
    invoke-virtual {v4}, Liz0;->q0()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_13

    if-lez v4, :cond_13

    move v2, v1

    move v3, v2

    :goto_3
    iget v4, p0, LJL1;->W0:I

    if-ge v1, v4, :cond_10

    iget-object v4, p0, LJL1;->V0:[Liz0;

    aget-object v4, v4, v1

    iget-boolean v7, p0, LCy;->Y0:Z

    if-nez v7, :cond_6

    invoke-virtual {v4}, Liz0;->h()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    :cond_6
    if-nez v3, :cond_b

    iget v3, p0, LCy;->X0:I

    if-nez v3, :cond_7

    sget-object v2, LXy0$b;->c:LXy0$b;

    invoke-virtual {v4, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    goto :goto_4

    :cond_7
    if-ne v3, v0, :cond_8

    sget-object v2, LXy0$b;->e:LXy0$b;

    invoke-virtual {v4, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    goto :goto_4

    :cond_8
    if-ne v3, v6, :cond_9

    sget-object v2, LXy0$b;->d:LXy0$b;

    invoke-virtual {v4, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    goto :goto_4

    :cond_9
    if-ne v3, v5, :cond_a

    sget-object v2, LXy0$b;->f:LXy0$b;

    invoke-virtual {v4, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    :cond_a
    :goto_4
    move v3, v0

    :cond_b
    iget v7, p0, LCy;->X0:I

    if-nez v7, :cond_c

    sget-object v7, LXy0$b;->c:LXy0$b;

    invoke-virtual {v4, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_c
    if-ne v7, v0, :cond_d

    sget-object v7, LXy0$b;->e:LXy0$b;

    invoke-virtual {v4, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_5

    :cond_d
    if-ne v7, v6, :cond_e

    sget-object v7, LXy0$b;->d:LXy0$b;

    invoke-virtual {v4, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_e
    if-ne v7, v5, :cond_f

    sget-object v7, LXy0$b;->f:LXy0$b;

    invoke-virtual {v4, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_f
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    :cond_10
    iget v1, p0, LCy;->Z0:I

    add-int/2addr v2, v1

    iget v1, p0, LCy;->X0:I

    if-eqz v1, :cond_12

    if-ne v1, v0, :cond_11

    goto :goto_6

    :cond_11
    invoke-virtual {p0, v2, v2}, Liz0;->M0(II)V

    goto :goto_7

    :cond_12
    :goto_6
    invoke-virtual {p0, v2, v2}, Liz0;->J0(II)V

    :goto_7
    iput-boolean v0, p0, LCy;->a1:Z

    return v0

    :cond_13
    return v1
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, LCy;->Y0:Z

    return v0
.end method

.method public z1()I
    .locals 1

    iget v0, p0, LCy;->X0:I

    return v0
.end method
