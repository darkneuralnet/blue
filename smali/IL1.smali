.class public LIL1;
.super LgB6;
.source "SourceFile"


# direct methods
.method public constructor <init>(Liz0;)V
    .locals 0

    invoke-direct {p0, p1}, LgB6;-><init>(Liz0;)V

    return-void
.end method


# virtual methods
.method public a(Ll01;)V
    .locals 6

    iget-object p1, p0, LgB6;->b:Liz0;

    check-cast p1, LCy;

    invoke-virtual {p1}, LCy;->z1()I

    move-result v0

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v1, v1, Lp01;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v4, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp01;

    iget v5, v5, Lp01;->g:I

    if-eq v4, v2, :cond_1

    if-ge v5, v4, :cond_2

    :cond_1
    move v4, v5

    :cond_2
    if-ge v3, v5, :cond_0

    move v3, v5

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {p1}, LCy;->A1()I

    move-result p1

    add-int/2addr v3, p1

    invoke-virtual {v0, v3}, Lp01;->d(I)V

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {p1}, LCy;->A1()I

    move-result p1

    add-int/2addr v4, p1

    invoke-virtual {v0, v4}, Lp01;->d(I)V

    :goto_2
    return-void
.end method

.method public d()V
    .locals 7

    iget-object v0, p0, LgB6;->b:Liz0;

    instance-of v1, v0, LCy;

    if-eqz v1, :cond_c

    iget-object v1, p0, LgB6;->h:Lp01;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lp01;->b:Z

    check-cast v0, LCy;

    invoke-virtual {v0}, LCy;->z1()I

    move-result v1

    invoke-virtual {v0}, LCy;->y1()Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v1, :cond_9

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v1, p0, LgB6;->h:Lp01;

    sget-object v2, Lp01$a;->h:Lp01$a;

    iput-object v2, v1, Lp01;->e:Lp01$a;

    :goto_0
    iget v1, v0, LJL1;->W0:I

    if-ge v5, v1, :cond_2

    iget-object v1, v0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v5

    if-nez v3, :cond_1

    invoke-virtual {v1}, Liz0;->X()I

    move-result v2

    if-ne v2, v4, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v1, Liz0;->f:LKo6;

    iget-object v1, v1, LgB6;->i:Lp01;

    iget-object v2, v1, Lp01;->k:Ljava/util/List;

    iget-object v6, p0, LgB6;->h:Lp01;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LgB6;->h:Lp01;

    iget-object v2, v2, Lp01;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    goto/16 :goto_8

    :cond_3
    iget-object v1, p0, LgB6;->h:Lp01;

    sget-object v2, Lp01$a;->g:Lp01$a;

    iput-object v2, v1, Lp01;->e:Lp01$a;

    :goto_2
    iget v1, v0, LJL1;->W0:I

    if-ge v5, v1, :cond_5

    iget-object v1, v0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v5

    if-nez v3, :cond_4

    invoke-virtual {v1}, Liz0;->X()I

    move-result v2

    if-ne v2, v4, :cond_4

    goto :goto_3

    :cond_4
    iget-object v1, v1, Liz0;->f:LKo6;

    iget-object v1, v1, LgB6;->h:Lp01;

    iget-object v2, v1, Lp01;->k:Ljava/util/List;

    iget-object v6, p0, LgB6;->h:Lp01;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LgB6;->h:Lp01;

    iget-object v2, v2, Lp01;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    goto/16 :goto_8

    :cond_6
    iget-object v1, p0, LgB6;->h:Lp01;

    sget-object v2, Lp01$a;->f:Lp01$a;

    iput-object v2, v1, Lp01;->e:Lp01$a;

    :goto_4
    iget v1, v0, LJL1;->W0:I

    if-ge v5, v1, :cond_8

    iget-object v1, v0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v5

    if-nez v3, :cond_7

    invoke-virtual {v1}, Liz0;->X()I

    move-result v2

    if-ne v2, v4, :cond_7

    goto :goto_5

    :cond_7
    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->i:Lp01;

    iget-object v2, v1, Lp01;->k:Ljava/util/List;

    iget-object v6, p0, LgB6;->h:Lp01;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LgB6;->h:Lp01;

    iget-object v2, v2, Lp01;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    goto :goto_8

    :cond_9
    iget-object v1, p0, LgB6;->h:Lp01;

    sget-object v2, Lp01$a;->e:Lp01$a;

    iput-object v2, v1, Lp01;->e:Lp01$a;

    :goto_6
    iget v1, v0, LJL1;->W0:I

    if-ge v5, v1, :cond_b

    iget-object v1, v0, LJL1;->V0:[Liz0;

    aget-object v1, v1, v5

    if-nez v3, :cond_a

    invoke-virtual {v1}, Liz0;->X()I

    move-result v2

    if-ne v2, v4, :cond_a

    goto :goto_7

    :cond_a
    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->h:Lp01;

    iget-object v2, v1, Lp01;->k:Ljava/util/List;

    iget-object v6, p0, LgB6;->h:Lp01;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LgB6;->h:Lp01;

    iget-object v2, v2, Lp01;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_b
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LIL1;->q(Lp01;)V

    :cond_c
    :goto_8
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LgB6;->b:Liz0;

    instance-of v1, v0, LCy;

    if-eqz v1, :cond_2

    check-cast v0, LCy;

    invoke-virtual {v0}, LCy;->z1()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->g:I

    invoke-virtual {v0, v1}, Liz0;->r1(I)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->g:I

    invoke-virtual {v0, v1}, Liz0;->q1(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LgB6;->c:Led5;

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {v0}, Lp01;->c()V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q(Lp01;)V
    .locals 1

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
