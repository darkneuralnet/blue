.class public Lc41;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LOE$a;

.field public static b:I

.field public static c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LOE$a;

    invoke-direct {v0}, LOE$a;-><init>()V

    sput-object v0, Lc41;->a:LOE$a;

    const/4 v0, 0x0

    sput v0, Lc41;->b:I

    sput v0, Lc41;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILiz0;)Z
    .locals 7

    invoke-virtual {p1}, Liz0;->C()Liz0$b;

    move-result-object p0

    invoke-virtual {p1}, Liz0;->V()Liz0$b;

    move-result-object v0

    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object v1

    check-cast v1, Ljz0;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Liz0;->C()Liz0$b;

    move-result-object v2

    sget-object v3, Liz0$b;->b:Liz0$b;

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Liz0;->V()Liz0$b;

    move-result-object v1

    sget-object v2, Liz0$b;->b:Liz0$b;

    :cond_2
    sget-object v1, Liz0$b;->b:Liz0$b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq p0, v1, :cond_5

    invoke-virtual {p1}, Liz0;->p0()Z

    move-result v5

    if-nez v5, :cond_5

    sget-object v5, Liz0$b;->c:Liz0$b;

    if-eq p0, v5, :cond_5

    sget-object v5, Liz0$b;->d:Liz0$b;

    if-ne p0, v5, :cond_3

    iget v6, p1, Liz0;->w:I

    if-nez v6, :cond_3

    iget v6, p1, Liz0;->f0:F

    cmpl-float v6, v6, v2

    if-nez v6, :cond_3

    invoke-virtual {p1, v3}, Liz0;->c0(I)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_3
    if-ne p0, v5, :cond_4

    iget p0, p1, Liz0;->w:I

    if-ne p0, v4, :cond_4

    invoke-virtual {p1}, Liz0;->Y()I

    move-result p0

    invoke-virtual {p1, v3, p0}, Liz0;->f0(II)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    move p0, v3

    goto :goto_2

    :cond_5
    :goto_1
    move p0, v4

    :goto_2
    if-eq v0, v1, :cond_8

    invoke-virtual {p1}, Liz0;->q0()Z

    move-result v1

    if-nez v1, :cond_8

    sget-object v1, Liz0$b;->c:Liz0$b;

    if-eq v0, v1, :cond_8

    sget-object v1, Liz0$b;->d:Liz0$b;

    if-ne v0, v1, :cond_6

    iget v5, p1, Liz0;->x:I

    if-nez v5, :cond_6

    iget v5, p1, Liz0;->f0:F

    cmpl-float v5, v5, v2

    if-nez v5, :cond_6

    invoke-virtual {p1, v4}, Liz0;->c0(I)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_6
    if-ne v0, v1, :cond_7

    iget v0, p1, Liz0;->x:I

    if-ne v0, v4, :cond_7

    invoke-virtual {p1}, Liz0;->z()I

    move-result v0

    invoke-virtual {p1, v4, v0}, Liz0;->f0(II)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    move v0, v3

    goto :goto_4

    :cond_8
    :goto_3
    move v0, v4

    :goto_4
    iget p1, p1, Liz0;->f0:F

    cmpl-float p1, p1, v2

    if-lez p1, :cond_a

    if-nez p0, :cond_9

    if-eqz v0, :cond_a

    :cond_9
    return v4

    :cond_a
    if-eqz p0, :cond_b

    if-eqz v0, :cond_b

    move v3, v4

    :cond_b
    return v3
.end method

.method public static b(ILiz0;LOE$b;Z)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Liz0;->i0()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    sget v3, Lc41;->b:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    sput v3, Lc41;->b:I

    instance-of v3, v0, Ljz0;

    if-nez v3, :cond_1

    invoke-virtual/range {p1 .. p1}, Liz0;->o0()Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, p0, 0x1

    invoke-static {v3, v0}, Lc41;->a(ILiz0;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, LOE$a;

    invoke-direct {v5}, LOE$a;-><init>()V

    sget v6, LOE$a;->k:I

    invoke-static {v3, v0, v1, v5, v6}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_1
    sget-object v3, LXy0$b;->c:LXy0$b;

    invoke-virtual {v0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v3

    sget-object v5, LXy0$b;->e:LXy0$b;

    invoke-virtual {v0, v5}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v5

    invoke-virtual {v3}, LXy0;->e()I

    move-result v6

    invoke-virtual {v5}, LXy0;->e()I

    move-result v7

    invoke-virtual {v3}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v10, 0x8

    if-eqz v8, :cond_d

    invoke-virtual {v3}, LXy0;->n()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {v3}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LXy0;

    iget-object v12, v8, LXy0;->d:Liz0;

    add-int/lit8 v13, p0, 0x1

    invoke-static {v13, v12}, Lc41;->a(ILiz0;)Z

    move-result v14

    invoke-virtual {v12}, Liz0;->o0()Z

    move-result v15

    if-eqz v15, :cond_2

    if-eqz v14, :cond_2

    new-instance v15, LOE$a;

    invoke-direct {v15}, LOE$a;-><init>()V

    sget v11, LOE$a;->k:I

    invoke-static {v13, v12, v1, v15, v11}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_2
    iget-object v11, v12, Liz0;->Q:LXy0;

    if-ne v8, v11, :cond_3

    iget-object v11, v12, Liz0;->S:LXy0;

    iget-object v11, v11, LXy0;->f:LXy0;

    if-eqz v11, :cond_3

    invoke-virtual {v11}, LXy0;->n()Z

    move-result v11

    if-nez v11, :cond_4

    :cond_3
    iget-object v11, v12, Liz0;->S:LXy0;

    if-ne v8, v11, :cond_5

    iget-object v11, v12, Liz0;->Q:LXy0;

    iget-object v11, v11, LXy0;->f:LXy0;

    if-eqz v11, :cond_5

    invoke-virtual {v11}, LXy0;->n()Z

    move-result v11

    if-eqz v11, :cond_5

    :cond_4
    move v11, v4

    goto :goto_1

    :cond_5
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v12}, Liz0;->C()Liz0$b;

    move-result-object v15

    sget-object v4, Liz0$b;->d:Liz0$b;

    if-ne v15, v4, :cond_8

    if-eqz v14, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v12}, Liz0;->C()Liz0$b;

    move-result-object v8

    if-ne v8, v4, :cond_9

    iget v4, v12, Liz0;->A:I

    if-ltz v4, :cond_9

    iget v4, v12, Liz0;->z:I

    if-ltz v4, :cond_9

    invoke-virtual {v12}, Liz0;->X()I

    move-result v4

    if-eq v4, v10, :cond_7

    iget v4, v12, Liz0;->w:I

    if-nez v4, :cond_9

    invoke-virtual {v12}, Liz0;->x()F

    move-result v4

    cmpl-float v4, v4, v9

    if-nez v4, :cond_9

    :cond_7
    invoke-virtual {v12}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v12}, Liz0;->n0()Z

    move-result v4

    if-nez v4, :cond_9

    if-eqz v11, :cond_9

    invoke-virtual {v12}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v13, v0, v1, v12, v2}, Lc41;->e(ILiz0;LOE$b;Liz0;Z)V

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {v12}, Liz0;->o0()Z

    move-result v4

    if-eqz v4, :cond_a

    :cond_9
    :goto_3
    const/4 v4, 0x1

    goto/16 :goto_0

    :cond_a
    iget-object v4, v12, Liz0;->Q:LXy0;

    if-ne v8, v4, :cond_b

    iget-object v14, v12, Liz0;->S:LXy0;

    iget-object v14, v14, LXy0;->f:LXy0;

    if-nez v14, :cond_b

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    add-int/2addr v4, v6

    invoke-virtual {v12}, Liz0;->Y()I

    move-result v8

    add-int/2addr v8, v4

    invoke-virtual {v12, v4, v8}, Liz0;->J0(II)V

    invoke-static {v13, v12, v1, v2}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto :goto_3

    :cond_b
    iget-object v14, v12, Liz0;->S:LXy0;

    if-ne v8, v14, :cond_c

    iget-object v4, v4, LXy0;->f:LXy0;

    if-nez v4, :cond_c

    invoke-virtual {v14}, LXy0;->f()I

    move-result v4

    sub-int v4, v6, v4

    invoke-virtual {v12}, Liz0;->Y()I

    move-result v8

    sub-int v8, v4, v8

    invoke-virtual {v12, v8, v4}, Liz0;->J0(II)V

    invoke-static {v13, v12, v1, v2}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto :goto_3

    :cond_c
    if-eqz v11, :cond_9

    invoke-virtual {v12}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v13, v1, v12, v2}, Lc41;->d(ILOE$b;Liz0;Z)V

    goto :goto_3

    :cond_d
    instance-of v3, v0, LwE1;

    if-eqz v3, :cond_e

    return-void

    :cond_e
    invoke-virtual {v5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v3

    if-eqz v3, :cond_1a

    invoke-virtual {v5}, LXy0;->n()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-virtual {v5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_f
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LXy0;

    iget-object v5, v4, LXy0;->d:Liz0;

    const/4 v6, 0x1

    add-int/lit8 v8, p0, 0x1

    invoke-static {v8, v5}, Lc41;->a(ILiz0;)Z

    move-result v11

    invoke-virtual {v5}, Liz0;->o0()Z

    move-result v12

    if-eqz v12, :cond_10

    if-eqz v11, :cond_10

    new-instance v12, LOE$a;

    invoke-direct {v12}, LOE$a;-><init>()V

    sget v13, LOE$a;->k:I

    invoke-static {v8, v5, v1, v12, v13}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_10
    iget-object v12, v5, Liz0;->Q:LXy0;

    if-ne v4, v12, :cond_11

    iget-object v12, v5, Liz0;->S:LXy0;

    iget-object v12, v12, LXy0;->f:LXy0;

    if-eqz v12, :cond_11

    invoke-virtual {v12}, LXy0;->n()Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    iget-object v12, v5, Liz0;->S:LXy0;

    if-ne v4, v12, :cond_13

    iget-object v12, v5, Liz0;->Q:LXy0;

    iget-object v12, v12, LXy0;->f:LXy0;

    if-eqz v12, :cond_13

    invoke-virtual {v12}, LXy0;->n()Z

    move-result v12

    if-eqz v12, :cond_13

    :cond_12
    move v12, v6

    goto :goto_5

    :cond_13
    const/4 v12, 0x0

    :goto_5
    invoke-virtual {v5}, Liz0;->C()Liz0$b;

    move-result-object v13

    sget-object v14, Liz0$b;->d:Liz0$b;

    if-ne v13, v14, :cond_16

    if-eqz v11, :cond_14

    goto :goto_6

    :cond_14
    invoke-virtual {v5}, Liz0;->C()Liz0$b;

    move-result-object v4

    if-ne v4, v14, :cond_f

    iget v4, v5, Liz0;->A:I

    if-ltz v4, :cond_f

    iget v4, v5, Liz0;->z:I

    if-ltz v4, :cond_f

    invoke-virtual {v5}, Liz0;->X()I

    move-result v4

    if-eq v4, v10, :cond_15

    iget v4, v5, Liz0;->w:I

    if-nez v4, :cond_f

    invoke-virtual {v5}, Liz0;->x()F

    move-result v4

    cmpl-float v4, v4, v9

    if-nez v4, :cond_f

    :cond_15
    invoke-virtual {v5}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-virtual {v5}, Liz0;->n0()Z

    move-result v4

    if-nez v4, :cond_f

    if-eqz v12, :cond_f

    invoke-virtual {v5}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {v8, v0, v1, v5, v2}, Lc41;->e(ILiz0;LOE$b;Liz0;Z)V

    goto/16 :goto_4

    :cond_16
    :goto_6
    invoke-virtual {v5}, Liz0;->o0()Z

    move-result v11

    if-eqz v11, :cond_17

    goto/16 :goto_4

    :cond_17
    iget-object v11, v5, Liz0;->Q:LXy0;

    if-ne v4, v11, :cond_18

    iget-object v13, v5, Liz0;->S:LXy0;

    iget-object v13, v13, LXy0;->f:LXy0;

    if-nez v13, :cond_18

    invoke-virtual {v11}, LXy0;->f()I

    move-result v4

    add-int/2addr v4, v7

    invoke-virtual {v5}, Liz0;->Y()I

    move-result v11

    add-int/2addr v11, v4

    invoke-virtual {v5, v4, v11}, Liz0;->J0(II)V

    invoke-static {v8, v5, v1, v2}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto/16 :goto_4

    :cond_18
    iget-object v13, v5, Liz0;->S:LXy0;

    if-ne v4, v13, :cond_19

    iget-object v4, v11, LXy0;->f:LXy0;

    if-nez v4, :cond_19

    invoke-virtual {v13}, LXy0;->f()I

    move-result v4

    sub-int v4, v7, v4

    invoke-virtual {v5}, Liz0;->Y()I

    move-result v11

    sub-int v11, v4, v11

    invoke-virtual {v5, v11, v4}, Liz0;->J0(II)V

    invoke-static {v8, v5, v1, v2}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto/16 :goto_4

    :cond_19
    if-eqz v12, :cond_f

    invoke-virtual {v5}, Liz0;->k0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {v8, v1, v5, v2}, Lc41;->d(ILOE$b;Liz0;Z)V

    goto/16 :goto_4

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Liz0;->s0()V

    return-void
.end method

.method public static c(ILCy;LOE$b;IZ)V
    .locals 1

    invoke-virtual {p1}, LCy;->x1()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p3, :cond_0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p1, p2, p4}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p1, p2}, Lc41;->i(ILiz0;LOE$b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static d(ILOE$b;Liz0;Z)V
    .locals 6

    invoke-virtual {p2}, Liz0;->A()F

    move-result v0

    iget-object v1, p2, Liz0;->Q:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    iget-object v2, p2, Liz0;->S:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p2, Liz0;->Q:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    add-int/2addr v3, v1

    iget-object v4, p2, Liz0;->S:LXy0;

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    sub-int v4, v2, v4

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v1, v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v1, v3

    move v2, v4

    :goto_0
    invoke-virtual {p2}, Liz0;->Y()I

    move-result v3

    sub-int v4, v2, v1

    sub-int/2addr v4, v3

    if-le v1, v2, :cond_1

    sub-int v4, v1, v2

    sub-int/2addr v4, v3

    :cond_1
    if-lez v4, :cond_2

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float/2addr v0, v5

    goto :goto_1

    :cond_2
    int-to-float v4, v4

    mul-float/2addr v0, v4

    :goto_1
    float-to-int v0, v0

    add-int/2addr v0, v1

    add-int v4, v0, v3

    if-le v1, v2, :cond_3

    sub-int v4, v0, v3

    :cond_3
    invoke-virtual {p2, v0, v4}, Liz0;->J0(II)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p2, p1, p3}, Lc41;->b(ILiz0;LOE$b;Z)V

    return-void
.end method

.method public static e(ILiz0;LOE$b;Liz0;Z)V
    .locals 7

    invoke-virtual {p3}, Liz0;->A()F

    move-result v0

    iget-object v1, p3, Liz0;->Q:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    iget-object v2, p3, Liz0;->Q:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p3, Liz0;->S:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p3, Liz0;->S:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v1, :cond_4

    invoke-virtual {p3}, Liz0;->Y()I

    move-result v3

    invoke-virtual {p3}, Liz0;->X()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_3

    iget v4, p3, Liz0;->w:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    instance-of v3, p1, Ljz0;

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Liz0;->Y()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object p1

    invoke-virtual {p1}, Liz0;->Y()I

    move-result p1

    :goto_0
    invoke-virtual {p3}, Liz0;->A()F

    move-result v3

    mul-float/2addr v3, v6

    int-to-float p1, p1

    mul-float/2addr v3, p1

    float-to-int v3, v3

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    sub-int v3, v2, v1

    :cond_2
    :goto_1
    iget p1, p3, Liz0;->z:I

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget p1, p3, Liz0;->A:I

    if-lez p1, :cond_3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_3
    sub-int/2addr v2, v1

    sub-int/2addr v2, v3

    int-to-float p1, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v6

    float-to-int p1, v0

    add-int/2addr v1, p1

    add-int/2addr v3, v1

    invoke-virtual {p3, v1, v3}, Liz0;->J0(II)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p3, p2, p4}, Lc41;->b(ILiz0;LOE$b;Z)V

    :cond_4
    return-void
.end method

.method public static f(ILOE$b;Liz0;)V
    .locals 6

    invoke-virtual {p2}, Liz0;->T()F

    move-result v0

    iget-object v1, p2, Liz0;->R:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    iget-object v2, p2, Liz0;->T:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p2, Liz0;->R:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    add-int/2addr v3, v1

    iget-object v4, p2, Liz0;->T:LXy0;

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    sub-int v4, v2, v4

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v1, v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v1, v3

    move v2, v4

    :goto_0
    invoke-virtual {p2}, Liz0;->z()I

    move-result v3

    sub-int v4, v2, v1

    sub-int/2addr v4, v3

    if-le v1, v2, :cond_1

    sub-int v4, v1, v2

    sub-int/2addr v4, v3

    :cond_1
    if-lez v4, :cond_2

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float/2addr v0, v5

    goto :goto_1

    :cond_2
    int-to-float v4, v4

    mul-float/2addr v0, v4

    :goto_1
    float-to-int v0, v0

    add-int v4, v1, v0

    add-int v5, v4, v3

    if-le v1, v2, :cond_3

    sub-int v4, v1, v0

    sub-int v5, v4, v3

    :cond_3
    invoke-virtual {p2, v4, v5}, Liz0;->M0(II)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p2, p1}, Lc41;->i(ILiz0;LOE$b;)V

    return-void
.end method

.method public static g(ILiz0;LOE$b;Liz0;)V
    .locals 7

    invoke-virtual {p3}, Liz0;->T()F

    move-result v0

    iget-object v1, p3, Liz0;->R:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    iget-object v2, p3, Liz0;->R:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p3, Liz0;->T:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p3, Liz0;->T:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v1, :cond_4

    invoke-virtual {p3}, Liz0;->z()I

    move-result v3

    invoke-virtual {p3}, Liz0;->X()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_3

    iget v4, p3, Liz0;->x:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    instance-of v3, p1, Ljz0;

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Liz0;->z()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object p1

    invoke-virtual {p1}, Liz0;->z()I

    move-result p1

    :goto_0
    mul-float v3, v0, v6

    int-to-float p1, p1

    mul-float/2addr v3, p1

    float-to-int v3, v3

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    sub-int v3, v2, v1

    :cond_2
    :goto_1
    iget p1, p3, Liz0;->C:I

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget p1, p3, Liz0;->D:I

    if-lez p1, :cond_3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_3
    sub-int/2addr v2, v1

    sub-int/2addr v2, v3

    int-to-float p1, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v6

    float-to-int p1, v0

    add-int/2addr v1, p1

    add-int/2addr v3, v1

    invoke-virtual {p3, v1, v3}, Liz0;->M0(II)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0, p3, p2}, Lc41;->i(ILiz0;LOE$b;)V

    :cond_4
    return-void
.end method

.method public static h(Ljz0;LOE$b;)V
    .locals 13

    invoke-virtual {p0}, Liz0;->C()Liz0$b;

    move-result-object v0

    invoke-virtual {p0}, Liz0;->V()Liz0$b;

    move-result-object v1

    const/4 v2, 0x0

    sput v2, Lc41;->b:I

    sput v2, Lc41;->c:I

    invoke-virtual {p0}, Liz0;->y0()V

    invoke-virtual {p0}, LcB6;->v1()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    invoke-virtual {v6}, Liz0;->y0()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljz0;->U1()Z

    move-result v5

    sget-object v6, Liz0$b;->b:Liz0$b;

    if-ne v0, v6, :cond_1

    invoke-virtual {p0}, Liz0;->Y()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Liz0;->J0(II)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2}, Liz0;->K0(I)V

    :goto_1
    move v0, v2

    move v6, v0

    move v7, v6

    :goto_2
    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, -0x1

    const/4 v10, 0x1

    if-ge v0, v4, :cond_7

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Liz0;

    instance-of v12, v11, LwE1;

    if-eqz v12, :cond_5

    check-cast v11, LwE1;

    invoke-virtual {v11}, LwE1;->w1()I

    move-result v12

    if-ne v12, v10, :cond_6

    invoke-virtual {v11}, LwE1;->x1()I

    move-result v6

    if-eq v6, v9, :cond_2

    invoke-virtual {v11}, LwE1;->x1()I

    move-result v6

    invoke-virtual {v11, v6}, LwE1;->A1(I)V

    goto :goto_3

    :cond_2
    invoke-virtual {v11}, LwE1;->y1()I

    move-result v6

    if-eq v6, v9, :cond_3

    invoke-virtual {p0}, Liz0;->p0()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p0}, Liz0;->Y()I

    move-result v6

    invoke-virtual {v11}, LwE1;->y1()I

    move-result v8

    sub-int/2addr v6, v8

    invoke-virtual {v11, v6}, LwE1;->A1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Liz0;->p0()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v11}, LwE1;->z1()F

    move-result v6

    invoke-virtual {p0}, Liz0;->Y()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v6, v9

    add-float/2addr v6, v8

    float-to-int v6, v6

    invoke-virtual {v11, v6}, LwE1;->A1(I)V

    :cond_4
    :goto_3
    move v6, v10

    goto :goto_4

    :cond_5
    instance-of v8, v11, LCy;

    if-eqz v8, :cond_6

    check-cast v11, LCy;

    invoke-virtual {v11}, LCy;->B1()I

    move-result v8

    if-nez v8, :cond_6

    move v7, v10

    :cond_6
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_9

    move v0, v2

    :goto_5
    if-ge v0, v4, :cond_9

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    instance-of v11, v6, LwE1;

    if-eqz v11, :cond_8

    check-cast v6, LwE1;

    invoke-virtual {v6}, LwE1;->w1()I

    move-result v11

    if-ne v11, v10, :cond_8

    invoke-static {v2, v6, p1, v5}, Lc41;->b(ILiz0;LOE$b;Z)V

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_9
    invoke-static {v2, p0, p1, v5}, Lc41;->b(ILiz0;LOE$b;Z)V

    if-eqz v7, :cond_b

    move v0, v2

    :goto_6
    if-ge v0, v4, :cond_b

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    instance-of v7, v6, LCy;

    if-eqz v7, :cond_a

    check-cast v6, LCy;

    invoke-virtual {v6}, LCy;->B1()I

    move-result v7

    if-nez v7, :cond_a

    invoke-static {v2, v6, p1, v2, v5}, Lc41;->c(ILCy;LOE$b;IZ)V

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_b
    sget-object v0, Liz0$b;->b:Liz0$b;

    if-ne v1, v0, :cond_c

    invoke-virtual {p0}, Liz0;->z()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Liz0;->M0(II)V

    goto :goto_7

    :cond_c
    invoke-virtual {p0, v2}, Liz0;->L0(I)V

    :goto_7
    move v0, v2

    move v1, v0

    move v6, v1

    :goto_8
    if-ge v0, v4, :cond_12

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Liz0;

    instance-of v11, v7, LwE1;

    if-eqz v11, :cond_10

    check-cast v7, LwE1;

    invoke-virtual {v7}, LwE1;->w1()I

    move-result v11

    if-nez v11, :cond_11

    invoke-virtual {v7}, LwE1;->x1()I

    move-result v1

    if-eq v1, v9, :cond_d

    invoke-virtual {v7}, LwE1;->x1()I

    move-result v1

    invoke-virtual {v7, v1}, LwE1;->A1(I)V

    goto :goto_9

    :cond_d
    invoke-virtual {v7}, LwE1;->y1()I

    move-result v1

    if-eq v1, v9, :cond_e

    invoke-virtual {p0}, Liz0;->q0()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0}, Liz0;->z()I

    move-result v1

    invoke-virtual {v7}, LwE1;->y1()I

    move-result v11

    sub-int/2addr v1, v11

    invoke-virtual {v7, v1}, LwE1;->A1(I)V

    goto :goto_9

    :cond_e
    invoke-virtual {p0}, Liz0;->q0()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v7}, LwE1;->z1()F

    move-result v1

    invoke-virtual {p0}, Liz0;->z()I

    move-result v11

    int-to-float v11, v11

    mul-float/2addr v1, v11

    add-float/2addr v1, v8

    float-to-int v1, v1

    invoke-virtual {v7, v1}, LwE1;->A1(I)V

    :cond_f
    :goto_9
    move v1, v10

    goto :goto_a

    :cond_10
    instance-of v11, v7, LCy;

    if-eqz v11, :cond_11

    check-cast v7, LCy;

    invoke-virtual {v7}, LCy;->B1()I

    move-result v7

    if-ne v7, v10, :cond_11

    move v6, v10

    :cond_11
    :goto_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_12
    if-eqz v1, :cond_14

    move v0, v2

    :goto_b
    if-ge v0, v4, :cond_14

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liz0;

    instance-of v7, v1, LwE1;

    if-eqz v7, :cond_13

    check-cast v1, LwE1;

    invoke-virtual {v1}, LwE1;->w1()I

    move-result v7

    if-nez v7, :cond_13

    invoke-static {v10, v1, p1}, Lc41;->i(ILiz0;LOE$b;)V

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_14
    invoke-static {v2, p0, p1}, Lc41;->i(ILiz0;LOE$b;)V

    if-eqz v6, :cond_16

    move p0, v2

    :goto_c
    if-ge p0, v4, :cond_16

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz0;

    instance-of v1, v0, LCy;

    if-eqz v1, :cond_15

    check-cast v0, LCy;

    invoke-virtual {v0}, LCy;->B1()I

    move-result v1

    if-ne v1, v10, :cond_15

    invoke-static {v2, v0, p1, v10, v5}, Lc41;->c(ILCy;LOE$b;IZ)V

    :cond_15
    add-int/lit8 p0, p0, 0x1

    goto :goto_c

    :cond_16
    move p0, v2

    :goto_d
    if-ge p0, v4, :cond_1a

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz0;

    invoke-virtual {v0}, Liz0;->o0()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {v2, v0}, Lc41;->a(ILiz0;)Z

    move-result v1

    if-eqz v1, :cond_19

    sget-object v1, Lc41;->a:LOE$a;

    sget v6, LOE$a;->k:I

    invoke-static {v2, v0, p1, v1, v6}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    instance-of v1, v0, LwE1;

    if-eqz v1, :cond_18

    move-object v1, v0

    check-cast v1, LwE1;

    invoke-virtual {v1}, LwE1;->w1()I

    move-result v1

    if-nez v1, :cond_17

    invoke-static {v2, v0, p1}, Lc41;->i(ILiz0;LOE$b;)V

    goto :goto_e

    :cond_17
    invoke-static {v2, v0, p1, v5}, Lc41;->b(ILiz0;LOE$b;Z)V

    goto :goto_e

    :cond_18
    invoke-static {v2, v0, p1, v5}, Lc41;->b(ILiz0;LOE$b;Z)V

    invoke-static {v2, v0, p1}, Lc41;->i(ILiz0;LOE$b;)V

    :cond_19
    :goto_e
    add-int/lit8 p0, p0, 0x1

    goto :goto_d

    :cond_1a
    return-void
.end method

.method public static i(ILiz0;LOE$b;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Liz0;->r0()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    sget v2, Lc41;->c:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    sput v2, Lc41;->c:I

    instance-of v2, v0, Ljz0;

    if-nez v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Liz0;->o0()Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, p0, 0x1

    invoke-static {v2, v0}, Lc41;->a(ILiz0;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, LOE$a;

    invoke-direct {v4}, LOE$a;-><init>()V

    sget v5, LOE$a;->k:I

    invoke-static {v2, v0, v1, v4, v5}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_1
    sget-object v2, LXy0$b;->d:LXy0$b;

    invoke-virtual {v0, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    sget-object v4, LXy0$b;->f:LXy0$b;

    invoke-virtual {v0, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v2}, LXy0;->e()I

    move-result v5

    invoke-virtual {v4}, LXy0;->e()I

    move-result v6

    invoke-virtual {v2}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    if-eqz v7, :cond_d

    invoke-virtual {v2}, LXy0;->n()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v2}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LXy0;

    iget-object v11, v7, LXy0;->d:Liz0;

    add-int/lit8 v12, p0, 0x1

    invoke-static {v12, v11}, Lc41;->a(ILiz0;)Z

    move-result v13

    invoke-virtual {v11}, Liz0;->o0()Z

    move-result v14

    if-eqz v14, :cond_3

    if-eqz v13, :cond_3

    new-instance v14, LOE$a;

    invoke-direct {v14}, LOE$a;-><init>()V

    sget v15, LOE$a;->k:I

    invoke-static {v12, v11, v1, v14, v15}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_3
    iget-object v14, v11, Liz0;->R:LXy0;

    if-ne v7, v14, :cond_4

    iget-object v14, v11, Liz0;->T:LXy0;

    iget-object v14, v14, LXy0;->f:LXy0;

    if-eqz v14, :cond_4

    invoke-virtual {v14}, LXy0;->n()Z

    move-result v14

    if-nez v14, :cond_5

    :cond_4
    iget-object v14, v11, Liz0;->T:LXy0;

    if-ne v7, v14, :cond_6

    iget-object v14, v11, Liz0;->R:LXy0;

    iget-object v14, v14, LXy0;->f:LXy0;

    if-eqz v14, :cond_6

    invoke-virtual {v14}, LXy0;->n()Z

    move-result v14

    if-eqz v14, :cond_6

    :cond_5
    move v14, v3

    goto :goto_1

    :cond_6
    const/4 v14, 0x0

    :goto_1
    invoke-virtual {v11}, Liz0;->V()Liz0$b;

    move-result-object v15

    sget-object v10, Liz0$b;->d:Liz0$b;

    if-ne v15, v10, :cond_9

    if-eqz v13, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v11}, Liz0;->V()Liz0$b;

    move-result-object v7

    if-ne v7, v10, :cond_2

    iget v7, v11, Liz0;->D:I

    if-ltz v7, :cond_2

    iget v7, v11, Liz0;->C:I

    if-ltz v7, :cond_2

    invoke-virtual {v11}, Liz0;->X()I

    move-result v7

    if-eq v7, v9, :cond_8

    iget v7, v11, Liz0;->x:I

    if-nez v7, :cond_2

    invoke-virtual {v11}, Liz0;->x()F

    move-result v7

    cmpl-float v7, v7, v8

    if-nez v7, :cond_2

    :cond_8
    invoke-virtual {v11}, Liz0;->m0()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v11}, Liz0;->n0()Z

    move-result v7

    if-nez v7, :cond_2

    if-eqz v14, :cond_2

    invoke-virtual {v11}, Liz0;->m0()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-static {v12, v0, v1, v11}, Lc41;->g(ILiz0;LOE$b;Liz0;)V

    goto/16 :goto_0

    :cond_9
    :goto_2
    invoke-virtual {v11}, Liz0;->o0()Z

    move-result v10

    if-eqz v10, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object v10, v11, Liz0;->R:LXy0;

    if-ne v7, v10, :cond_b

    iget-object v13, v11, Liz0;->T:LXy0;

    iget-object v13, v13, LXy0;->f:LXy0;

    if-nez v13, :cond_b

    invoke-virtual {v10}, LXy0;->f()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v11}, Liz0;->z()I

    move-result v10

    add-int/2addr v10, v7

    invoke-virtual {v11, v7, v10}, Liz0;->M0(II)V

    invoke-static {v12, v11, v1}, Lc41;->i(ILiz0;LOE$b;)V

    goto/16 :goto_0

    :cond_b
    iget-object v13, v11, Liz0;->T:LXy0;

    if-ne v7, v13, :cond_c

    iget-object v7, v10, LXy0;->f:LXy0;

    if-nez v7, :cond_c

    invoke-virtual {v13}, LXy0;->f()I

    move-result v7

    sub-int v7, v5, v7

    invoke-virtual {v11}, Liz0;->z()I

    move-result v10

    sub-int v10, v7, v10

    invoke-virtual {v11, v10, v7}, Liz0;->M0(II)V

    invoke-static {v12, v11, v1}, Lc41;->i(ILiz0;LOE$b;)V

    goto/16 :goto_0

    :cond_c
    if-eqz v14, :cond_2

    invoke-virtual {v11}, Liz0;->m0()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-static {v12, v1, v11}, Lc41;->f(ILOE$b;Liz0;)V

    goto/16 :goto_0

    :cond_d
    instance-of v2, v0, LwE1;

    if-eqz v2, :cond_e

    return-void

    :cond_e
    invoke-virtual {v4}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v4}, LXy0;->n()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v4}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LXy0;

    iget-object v5, v4, LXy0;->d:Liz0;

    add-int/lit8 v7, p0, 0x1

    invoke-static {v7, v5}, Lc41;->a(ILiz0;)Z

    move-result v10

    invoke-virtual {v5}, Liz0;->o0()Z

    move-result v11

    if-eqz v11, :cond_10

    if-eqz v10, :cond_10

    new-instance v11, LOE$a;

    invoke-direct {v11}, LOE$a;-><init>()V

    sget v12, LOE$a;->k:I

    invoke-static {v7, v5, v1, v11, v12}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_10
    iget-object v11, v5, Liz0;->R:LXy0;

    if-ne v4, v11, :cond_11

    iget-object v11, v5, Liz0;->T:LXy0;

    iget-object v11, v11, LXy0;->f:LXy0;

    if-eqz v11, :cond_11

    invoke-virtual {v11}, LXy0;->n()Z

    move-result v11

    if-nez v11, :cond_12

    :cond_11
    iget-object v11, v5, Liz0;->T:LXy0;

    if-ne v4, v11, :cond_13

    iget-object v11, v5, Liz0;->R:LXy0;

    iget-object v11, v11, LXy0;->f:LXy0;

    if-eqz v11, :cond_13

    invoke-virtual {v11}, LXy0;->n()Z

    move-result v11

    if-eqz v11, :cond_13

    :cond_12
    move v11, v3

    goto :goto_4

    :cond_13
    const/4 v11, 0x0

    :goto_4
    invoke-virtual {v5}, Liz0;->V()Liz0$b;

    move-result-object v12

    sget-object v13, Liz0$b;->d:Liz0$b;

    if-ne v12, v13, :cond_16

    if-eqz v10, :cond_14

    goto :goto_5

    :cond_14
    invoke-virtual {v5}, Liz0;->V()Liz0$b;

    move-result-object v4

    if-ne v4, v13, :cond_f

    iget v4, v5, Liz0;->D:I

    if-ltz v4, :cond_f

    iget v4, v5, Liz0;->C:I

    if-ltz v4, :cond_f

    invoke-virtual {v5}, Liz0;->X()I

    move-result v4

    if-eq v4, v9, :cond_15

    iget v4, v5, Liz0;->x:I

    if-nez v4, :cond_f

    invoke-virtual {v5}, Liz0;->x()F

    move-result v4

    cmpl-float v4, v4, v8

    if-nez v4, :cond_f

    :cond_15
    invoke-virtual {v5}, Liz0;->m0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-virtual {v5}, Liz0;->n0()Z

    move-result v4

    if-nez v4, :cond_f

    if-eqz v11, :cond_f

    invoke-virtual {v5}, Liz0;->m0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {v7, v0, v1, v5}, Lc41;->g(ILiz0;LOE$b;Liz0;)V

    goto/16 :goto_3

    :cond_16
    :goto_5
    invoke-virtual {v5}, Liz0;->o0()Z

    move-result v10

    if-eqz v10, :cond_17

    goto/16 :goto_3

    :cond_17
    iget-object v10, v5, Liz0;->R:LXy0;

    if-ne v4, v10, :cond_18

    iget-object v12, v5, Liz0;->T:LXy0;

    iget-object v12, v12, LXy0;->f:LXy0;

    if-nez v12, :cond_18

    invoke-virtual {v10}, LXy0;->f()I

    move-result v4

    add-int/2addr v4, v6

    invoke-virtual {v5}, Liz0;->z()I

    move-result v10

    add-int/2addr v10, v4

    invoke-virtual {v5, v4, v10}, Liz0;->M0(II)V

    invoke-static {v7, v5, v1}, Lc41;->i(ILiz0;LOE$b;)V

    goto/16 :goto_3

    :cond_18
    iget-object v12, v5, Liz0;->T:LXy0;

    if-ne v4, v12, :cond_19

    iget-object v4, v10, LXy0;->f:LXy0;

    if-nez v4, :cond_19

    invoke-virtual {v12}, LXy0;->f()I

    move-result v4

    sub-int v4, v6, v4

    invoke-virtual {v5}, Liz0;->z()I

    move-result v10

    sub-int v10, v4, v10

    invoke-virtual {v5, v10, v4}, Liz0;->M0(II)V

    invoke-static {v7, v5, v1}, Lc41;->i(ILiz0;LOE$b;)V

    goto/16 :goto_3

    :cond_19
    if-eqz v11, :cond_f

    invoke-virtual {v5}, Liz0;->m0()Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {v7, v1, v5}, Lc41;->f(ILOE$b;Liz0;)V

    goto/16 :goto_3

    :cond_1a
    sget-object v2, LXy0$b;->g:LXy0$b;

    invoke-virtual {v0, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v2}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v4

    if-eqz v4, :cond_1f

    invoke-virtual {v2}, LXy0;->n()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-virtual {v2}, LXy0;->e()I

    move-result v4

    invoke-virtual {v2}, LXy0;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1b
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LXy0;

    iget-object v6, v5, LXy0;->d:Liz0;

    add-int/lit8 v7, p0, 0x1

    invoke-static {v7, v6}, Lc41;->a(ILiz0;)Z

    move-result v8

    invoke-virtual {v6}, Liz0;->o0()Z

    move-result v9

    if-eqz v9, :cond_1c

    if-eqz v8, :cond_1c

    new-instance v9, LOE$a;

    invoke-direct {v9}, LOE$a;-><init>()V

    sget v10, LOE$a;->k:I

    invoke-static {v7, v6, v1, v9, v10}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_1c
    invoke-virtual {v6}, Liz0;->V()Liz0$b;

    move-result-object v9

    sget-object v10, Liz0$b;->d:Liz0$b;

    if-ne v9, v10, :cond_1d

    if-eqz v8, :cond_1b

    :cond_1d
    invoke-virtual {v6}, Liz0;->o0()Z

    move-result v8

    if-eqz v8, :cond_1e

    goto :goto_6

    :cond_1e
    iget-object v8, v6, Liz0;->U:LXy0;

    if-ne v5, v8, :cond_1b

    invoke-virtual {v5}, LXy0;->f()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Liz0;->I0(I)V

    invoke-static {v7, v6, v1}, Lc41;->i(ILiz0;LOE$b;)V

    goto :goto_6

    :cond_1f
    invoke-virtual/range {p1 .. p1}, Liz0;->t0()V

    return-void
.end method
