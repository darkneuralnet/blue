.class public LOE;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOE$a;,
        LOE$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Liz0;",
            ">;"
        }
    .end annotation
.end field

.field public b:LOE$a;

.field public c:Ljz0;


# direct methods
.method public constructor <init>(Ljz0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LOE;->a:Ljava/util/ArrayList;

    new-instance v0, LOE$a;

    invoke-direct {v0}, LOE$a;-><init>()V

    iput-object v0, p0, LOE;->b:LOE$a;

    iput-object p1, p0, LOE;->c:Ljz0;

    return-void
.end method


# virtual methods
.method public final a(LOE$b;Liz0;I)Z
    .locals 5

    iget-object v0, p0, LOE;->b:LOE$a;

    invoke-virtual {p2}, Liz0;->C()Liz0$b;

    move-result-object v1

    iput-object v1, v0, LOE$a;->a:Liz0$b;

    iget-object v0, p0, LOE;->b:LOE$a;

    invoke-virtual {p2}, Liz0;->V()Liz0$b;

    move-result-object v1

    iput-object v1, v0, LOE$a;->b:Liz0$b;

    iget-object v0, p0, LOE;->b:LOE$a;

    invoke-virtual {p2}, Liz0;->Y()I

    move-result v1

    iput v1, v0, LOE$a;->c:I

    iget-object v0, p0, LOE;->b:LOE$a;

    invoke-virtual {p2}, Liz0;->z()I

    move-result v1

    iput v1, v0, LOE$a;->d:I

    iget-object v0, p0, LOE;->b:LOE$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, LOE$a;->i:Z

    iput p3, v0, LOE$a;->j:I

    iget-object p3, v0, LOE$a;->a:Liz0$b;

    sget-object v2, Liz0$b;->d:Liz0$b;

    const/4 v3, 0x1

    if-ne p3, v2, :cond_0

    move p3, v3

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget-object v4, v0, LOE$a;->b:Liz0$b;

    if-ne v4, v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, Liz0;->f0:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v3

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v2, :cond_3

    iget v2, p2, Liz0;->f0:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    const/4 v4, 0x4

    if-eqz p3, :cond_4

    iget-object p3, p2, Liz0;->y:[I

    aget p3, p3, v1

    if-ne p3, v4, :cond_4

    sget-object p3, Liz0$b;->b:Liz0$b;

    iput-object p3, v0, LOE$a;->a:Liz0$b;

    :cond_4
    if-eqz v2, :cond_5

    iget-object p3, p2, Liz0;->y:[I

    aget p3, p3, v3

    if-ne p3, v4, :cond_5

    sget-object p3, Liz0$b;->b:Liz0$b;

    iput-object p3, v0, LOE$a;->b:Liz0$b;

    :cond_5
    invoke-interface {p1, p2, v0}, LOE$b;->b(Liz0;LOE$a;)V

    iget-object p1, p0, LOE;->b:LOE$a;

    iget p1, p1, LOE$a;->e:I

    invoke-virtual {p2, p1}, Liz0;->o1(I)V

    iget-object p1, p0, LOE;->b:LOE$a;

    iget p1, p1, LOE$a;->f:I

    invoke-virtual {p2, p1}, Liz0;->P0(I)V

    iget-object p1, p0, LOE;->b:LOE$a;

    iget-boolean p1, p1, LOE$a;->h:Z

    invoke-virtual {p2, p1}, Liz0;->O0(Z)V

    iget-object p1, p0, LOE;->b:LOE$a;

    iget p1, p1, LOE$a;->g:I

    invoke-virtual {p2, p1}, Liz0;->E0(I)V

    iget-object p1, p0, LOE;->b:LOE$a;

    sget p2, LOE$a;->k:I

    iput p2, p1, LOE$a;->j:I

    iget-boolean p1, p1, LOE$a;->i:Z

    return p1
.end method

.method public final b(Ljz0;)V
    .locals 12

    iget-object v0, p1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x40

    invoke-virtual {p1, v1}, Ljz0;->Y1(I)Z

    move-result v1

    invoke-virtual {p1}, Ljz0;->N1()LOE$b;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_b

    iget-object v5, p1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Liz0;

    instance-of v6, v5, LwE1;

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v6, v5, LCy;

    if-eqz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Liz0;->n0()Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz v1, :cond_3

    iget-object v6, v5, Liz0;->e:LeN1;

    if-eqz v6, :cond_3

    iget-object v7, v5, Liz0;->f:LKo6;

    if-eqz v7, :cond_3

    iget-object v6, v6, LgB6;->e:LY31;

    iget-boolean v6, v6, Lp01;->j:Z

    if-eqz v6, :cond_3

    iget-object v6, v7, LgB6;->e:LY31;

    iget-boolean v6, v6, Lp01;->j:Z

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v5, v3}, Liz0;->w(I)Liz0$b;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Liz0;->w(I)Liz0$b;

    move-result-object v8

    sget-object v9, Liz0$b;->d:Liz0$b;

    if-ne v6, v9, :cond_4

    iget v10, v5, Liz0;->w:I

    if-eq v10, v7, :cond_4

    if-ne v8, v9, :cond_4

    iget v10, v5, Liz0;->x:I

    if-eq v10, v7, :cond_4

    move v10, v7

    goto :goto_1

    :cond_4
    move v10, v3

    :goto_1
    if-nez v10, :cond_8

    invoke-virtual {p1, v7}, Ljz0;->Y1(I)Z

    move-result v11

    if-eqz v11, :cond_8

    instance-of v11, v5, Lzu6;

    if-nez v11, :cond_8

    if-ne v6, v9, :cond_5

    iget v11, v5, Liz0;->w:I

    if-nez v11, :cond_5

    if-eq v8, v9, :cond_5

    invoke-virtual {v5}, Liz0;->k0()Z

    move-result v11

    if-nez v11, :cond_5

    move v10, v7

    :cond_5
    if-ne v8, v9, :cond_6

    iget v11, v5, Liz0;->x:I

    if-nez v11, :cond_6

    if-eq v6, v9, :cond_6

    invoke-virtual {v5}, Liz0;->k0()Z

    move-result v11

    if-nez v11, :cond_6

    move v10, v7

    :cond_6
    if-eq v6, v9, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    iget v6, v5, Liz0;->f0:F

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    if-lez v6, :cond_8

    goto :goto_2

    :cond_8
    move v7, v10

    :goto_2
    if-eqz v7, :cond_9

    goto :goto_3

    :cond_9
    sget v6, LOE$a;->k:I

    invoke-virtual {p0, v2, v5, v6}, LOE;->a(LOE$b;Liz0;I)Z

    iget-object v5, p1, Ljz0;->b1:LbU2;

    if-eqz v5, :cond_a

    iget-wide v6, v5, LbU2;->a:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, v5, LbU2;->a:J

    :cond_a
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_b
    invoke-interface {v2}, LOE$b;->a()V

    return-void
.end method

.method public final c(Ljz0;Ljava/lang/String;III)V
    .locals 2

    invoke-virtual {p1}, Liz0;->K()I

    move-result p2

    invoke-virtual {p1}, Liz0;->J()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Liz0;->e1(I)V

    invoke-virtual {p1, v1}, Liz0;->d1(I)V

    invoke-virtual {p1, p4}, Liz0;->o1(I)V

    invoke-virtual {p1, p5}, Liz0;->P0(I)V

    invoke-virtual {p1, p2}, Liz0;->e1(I)V

    invoke-virtual {p1, v0}, Liz0;->d1(I)V

    iget-object p1, p0, LOE;->c:Ljz0;

    invoke-virtual {p1, p3}, Ljz0;->c2(I)V

    iget-object p1, p0, LOE;->c:Ljz0;

    invoke-virtual {p1}, Ljz0;->w1()V

    return-void
.end method

.method public d(Ljz0;IIIIIIIII)J
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move/from16 v4, p7

    invoke-virtual/range {p1 .. p1}, Ljz0;->N1()LOE$b;

    move-result-object v5

    iget-object v6, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Liz0;->Y()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Liz0;->z()I

    move-result v8

    const/16 v9, 0x80

    invoke-static {v2, v9}, Lhy3;->b(II)Z

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_1

    const/16 v12, 0x40

    invoke-static {v2, v12}, Lhy3;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v10

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_a

    move v12, v10

    :goto_2
    if-ge v12, v6, :cond_a

    iget-object v13, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Liz0;

    invoke-virtual {v13}, Liz0;->C()Liz0$b;

    move-result-object v14

    sget-object v15, Liz0$b;->d:Liz0$b;

    if-ne v14, v15, :cond_2

    const/4 v14, 0x1

    goto :goto_3

    :cond_2
    move v14, v10

    :goto_3
    invoke-virtual {v13}, Liz0;->V()Liz0$b;

    move-result-object v11

    if-ne v11, v15, :cond_3

    const/4 v11, 0x1

    goto :goto_4

    :cond_3
    move v11, v10

    :goto_4
    if-eqz v14, :cond_4

    if-eqz v11, :cond_4

    invoke-virtual {v13}, Liz0;->x()F

    move-result v11

    const/4 v14, 0x0

    cmpl-float v11, v11, v14

    if-lez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_5

    :cond_4
    move v11, v10

    :goto_5
    invoke-virtual {v13}, Liz0;->k0()Z

    move-result v14

    if-eqz v14, :cond_6

    if-eqz v11, :cond_6

    :cond_5
    :goto_6
    move v2, v10

    goto :goto_7

    :cond_6
    invoke-virtual {v13}, Liz0;->m0()Z

    move-result v14

    if-eqz v14, :cond_7

    if-eqz v11, :cond_7

    goto :goto_6

    :cond_7
    instance-of v11, v13, Lzu6;

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v13}, Liz0;->k0()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual {v13}, Liz0;->m0()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    const-wide/16 v11, 0x1

    if-eqz v2, :cond_b

    sget-object v13, LLr2;->x:LbU2;

    if-eqz v13, :cond_b

    iget-wide v14, v13, LbU2;->c:J

    add-long/2addr v14, v11

    iput-wide v14, v13, LbU2;->c:J

    :cond_b
    const/high16 v13, 0x40000000    # 2.0f

    if-ne v3, v13, :cond_c

    if-eq v4, v13, :cond_d

    :cond_c
    if-eqz v9, :cond_e

    :cond_d
    const/4 v14, 0x1

    goto :goto_8

    :cond_e
    move v14, v10

    :goto_8
    and-int/2addr v2, v14

    const/4 v14, 0x2

    if-eqz v2, :cond_16

    invoke-virtual/range {p1 .. p1}, Liz0;->I()I

    move-result v15

    move/from16 v11, p6

    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Liz0;->H()I

    move-result v12

    move/from16 v15, p8

    invoke-static {v12, v15}, Ljava/lang/Math;->min(II)I

    move-result v12

    if-ne v3, v13, :cond_f

    invoke-virtual/range {p1 .. p1}, Liz0;->Y()I

    move-result v15

    if-eq v15, v11, :cond_f

    invoke-virtual {v1, v11}, Liz0;->o1(I)V

    invoke-virtual/range {p1 .. p1}, Ljz0;->R1()V

    :cond_f
    if-ne v4, v13, :cond_10

    invoke-virtual/range {p1 .. p1}, Liz0;->z()I

    move-result v11

    if-eq v11, v12, :cond_10

    invoke-virtual {v1, v12}, Liz0;->P0(I)V

    invoke-virtual/range {p1 .. p1}, Ljz0;->R1()V

    :cond_10
    if-ne v3, v13, :cond_11

    if-ne v4, v13, :cond_11

    invoke-virtual {v1, v9}, Ljz0;->J1(Z)Z

    move-result v9

    move v12, v14

    goto :goto_a

    :cond_11
    invoke-virtual {v1, v9}, Ljz0;->K1(Z)Z

    move-result v11

    if-ne v3, v13, :cond_12

    invoke-virtual {v1, v9, v10}, Ljz0;->L1(ZI)Z

    move-result v12

    and-int/2addr v11, v12

    const/4 v12, 0x1

    goto :goto_9

    :cond_12
    move v12, v10

    :goto_9
    if-ne v4, v13, :cond_13

    const/4 v15, 0x1

    invoke-virtual {v1, v9, v15}, Ljz0;->L1(ZI)Z

    move-result v9

    and-int/2addr v9, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    :cond_13
    move v9, v11

    :goto_a
    if-eqz v9, :cond_17

    if-ne v3, v13, :cond_14

    const/4 v15, 0x1

    goto :goto_b

    :cond_14
    move v15, v10

    :goto_b
    if-ne v4, v13, :cond_15

    const/4 v3, 0x1

    goto :goto_c

    :cond_15
    move v3, v10

    :goto_c
    invoke-virtual {v1, v15, v3}, Ljz0;->t1(ZZ)V

    goto :goto_d

    :cond_16
    move v9, v10

    move v12, v9

    :cond_17
    :goto_d
    if-eqz v9, :cond_18

    if-eq v12, v14, :cond_34

    :cond_18
    invoke-virtual/range {p1 .. p1}, Ljz0;->O1()I

    move-result v3

    if-lez v6, :cond_19

    invoke-virtual/range {p0 .. p1}, LOE;->b(Ljz0;)V

    :cond_19
    invoke-virtual/range {p0 .. p1}, LOE;->e(Ljz0;)V

    iget-object v4, v0, LOE;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v6, :cond_1a

    const-string v6, "First pass"

    const/4 v9, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v6

    move/from16 p5, v9

    move/from16 p6, v7

    move/from16 p7, v8

    invoke-virtual/range {p2 .. p7}, LOE;->c(Ljz0;Ljava/lang/String;III)V

    :cond_1a
    if-lez v4, :cond_33

    invoke-virtual/range {p1 .. p1}, Liz0;->C()Liz0$b;

    move-result-object v6

    sget-object v9, Liz0$b;->c:Liz0$b;

    if-ne v6, v9, :cond_1b

    const/4 v15, 0x1

    goto :goto_e

    :cond_1b
    move v15, v10

    :goto_e
    invoke-virtual/range {p1 .. p1}, Liz0;->V()Liz0$b;

    move-result-object v6

    if-ne v6, v9, :cond_1c

    const/4 v6, 0x1

    goto :goto_f

    :cond_1c
    move v6, v10

    :goto_f
    invoke-virtual/range {p1 .. p1}, Liz0;->Y()I

    move-result v9

    iget-object v11, v0, LOE;->c:Ljz0;

    invoke-virtual {v11}, Liz0;->K()I

    move-result v11

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Liz0;->z()I

    move-result v11

    iget-object v12, v0, LOE;->c:Ljz0;

    invoke-virtual {v12}, Liz0;->J()I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v11

    move v12, v10

    move v13, v12

    :goto_10
    if-ge v12, v4, :cond_23

    iget-object v10, v0, LOE;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Liz0;

    instance-of v14, v10, Lzu6;

    if-nez v14, :cond_1d

    move/from16 p8, v3

    move/from16 v19, v7

    move/from16 v18, v8

    goto/16 :goto_12

    :cond_1d
    invoke-virtual {v10}, Liz0;->Y()I

    move-result v14

    move/from16 p8, v3

    invoke-virtual {v10}, Liz0;->z()I

    move-result v3

    move/from16 v18, v8

    sget v8, LOE$a;->l:I

    invoke-virtual {v0, v5, v10, v8}, LOE;->a(LOE$b;Liz0;I)Z

    move-result v8

    or-int/2addr v8, v13

    iget-object v13, v1, Ljz0;->b1:LbU2;

    move/from16 v19, v7

    move/from16 p2, v8

    if-eqz v13, :cond_1e

    iget-wide v7, v13, LbU2;->b:J

    const-wide/16 v16, 0x1

    add-long v7, v7, v16

    iput-wide v7, v13, LbU2;->b:J

    :cond_1e
    invoke-virtual {v10}, Liz0;->Y()I

    move-result v7

    invoke-virtual {v10}, Liz0;->z()I

    move-result v8

    if-eq v7, v14, :cond_20

    invoke-virtual {v10, v7}, Liz0;->o1(I)V

    if-eqz v15, :cond_1f

    invoke-virtual {v10}, Liz0;->O()I

    move-result v7

    if-le v7, v9, :cond_1f

    invoke-virtual {v10}, Liz0;->O()I

    move-result v7

    sget-object v13, LXy0$b;->e:LXy0$b;

    invoke-virtual {v10, v13}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v13

    invoke-virtual {v13}, LXy0;->f()I

    move-result v13

    add-int/2addr v7, v13

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    move v9, v7

    :cond_1f
    const/4 v7, 0x1

    goto :goto_11

    :cond_20
    move/from16 v7, p2

    :goto_11
    if-eq v8, v3, :cond_22

    invoke-virtual {v10, v8}, Liz0;->P0(I)V

    if-eqz v6, :cond_21

    invoke-virtual {v10}, Liz0;->t()I

    move-result v3

    if-le v3, v11, :cond_21

    invoke-virtual {v10}, Liz0;->t()I

    move-result v3

    sget-object v7, LXy0$b;->f:LXy0$b;

    invoke-virtual {v10, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v7

    invoke-virtual {v7}, LXy0;->f()I

    move-result v7

    add-int/2addr v3, v7

    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v11, v3

    :cond_21
    const/4 v7, 0x1

    :cond_22
    check-cast v10, Lzu6;

    invoke-virtual {v10}, Lzu6;->J1()Z

    move-result v3

    or-int v13, v7, v3

    :goto_12
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, p8

    move/from16 v8, v18

    move/from16 v7, v19

    const/4 v10, 0x0

    const/4 v14, 0x2

    goto/16 :goto_10

    :cond_23
    move/from16 p8, v3

    move/from16 v19, v7

    move/from16 v18, v8

    move v7, v14

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v7, :cond_32

    const/4 v8, 0x0

    :goto_14
    if-ge v8, v4, :cond_31

    iget-object v10, v0, LOE;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Liz0;

    instance-of v12, v10, LHL1;

    if-eqz v12, :cond_24

    instance-of v12, v10, Lzu6;

    if-eqz v12, :cond_28

    :cond_24
    instance-of v12, v10, LwE1;

    if-eqz v12, :cond_25

    goto :goto_15

    :cond_25
    invoke-virtual {v10}, Liz0;->X()I

    move-result v12

    const/16 v14, 0x8

    if-ne v12, v14, :cond_26

    goto :goto_15

    :cond_26
    if-eqz v2, :cond_27

    iget-object v12, v10, Liz0;->e:LeN1;

    iget-object v12, v12, LgB6;->e:LY31;

    iget-boolean v12, v12, Lp01;->j:Z

    if-eqz v12, :cond_27

    iget-object v12, v10, Liz0;->f:LKo6;

    iget-object v12, v12, LgB6;->e:LY31;

    iget-boolean v12, v12, Lp01;->j:Z

    if-eqz v12, :cond_27

    goto :goto_15

    :cond_27
    instance-of v12, v10, Lzu6;

    if-eqz v12, :cond_29

    :cond_28
    :goto_15
    move/from16 v21, v2

    move/from16 v22, v4

    move-object/from16 v20, v5

    const-wide/16 v16, 0x1

    goto/16 :goto_17

    :cond_29
    invoke-virtual {v10}, Liz0;->Y()I

    move-result v12

    invoke-virtual {v10}, Liz0;->z()I

    move-result v14

    invoke-virtual {v10}, Liz0;->r()I

    move-result v7

    sget v20, LOE$a;->l:I

    move/from16 v21, v2

    const/4 v2, 0x1

    if-ne v3, v2, :cond_2a

    sget v20, LOE$a;->m:I

    :cond_2a
    move/from16 v2, v20

    invoke-virtual {v0, v5, v10, v2}, LOE;->a(LOE$b;Liz0;I)Z

    move-result v2

    or-int/2addr v2, v13

    iget-object v13, v1, Ljz0;->b1:LbU2;

    move/from16 v22, v4

    move-object/from16 v20, v5

    if-eqz v13, :cond_2b

    iget-wide v4, v13, LbU2;->b:J

    const-wide/16 v16, 0x1

    add-long v4, v4, v16

    iput-wide v4, v13, LbU2;->b:J

    goto :goto_16

    :cond_2b
    const-wide/16 v16, 0x1

    :goto_16
    invoke-virtual {v10}, Liz0;->Y()I

    move-result v4

    invoke-virtual {v10}, Liz0;->z()I

    move-result v5

    if-eq v4, v12, :cond_2d

    invoke-virtual {v10, v4}, Liz0;->o1(I)V

    if-eqz v15, :cond_2c

    invoke-virtual {v10}, Liz0;->O()I

    move-result v2

    if-le v2, v9, :cond_2c

    invoke-virtual {v10}, Liz0;->O()I

    move-result v2

    sget-object v4, LXy0$b;->e:LXy0$b;

    invoke-virtual {v10, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    add-int/2addr v2, v4

    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_2c
    const/4 v2, 0x1

    :cond_2d
    if-eq v5, v14, :cond_2f

    invoke-virtual {v10, v5}, Liz0;->P0(I)V

    if-eqz v6, :cond_2e

    invoke-virtual {v10}, Liz0;->t()I

    move-result v2

    if-le v2, v11, :cond_2e

    invoke-virtual {v10}, Liz0;->t()I

    move-result v2

    sget-object v4, LXy0$b;->f:LXy0$b;

    invoke-virtual {v10, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    add-int/2addr v2, v4

    invoke-static {v11, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v11, v2

    :cond_2e
    const/4 v2, 0x1

    :cond_2f
    invoke-virtual {v10}, Liz0;->b0()Z

    move-result v4

    if-eqz v4, :cond_30

    invoke-virtual {v10}, Liz0;->r()I

    move-result v4

    if-eq v7, v4, :cond_30

    const/4 v13, 0x1

    goto :goto_17

    :cond_30
    move v13, v2

    :goto_17
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, v20

    move/from16 v2, v21

    move/from16 v4, v22

    const/4 v7, 0x2

    goto/16 :goto_14

    :cond_31
    move/from16 v21, v2

    move/from16 v22, v4

    move-object/from16 v20, v5

    const-wide/16 v16, 0x1

    if-eqz v13, :cond_32

    const-string v2, "intermediate pass"

    add-int/lit8 v3, v3, 0x1

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move/from16 p6, v19

    move/from16 p7, v18

    invoke-virtual/range {p2 .. p7}, LOE;->c(Ljz0;Ljava/lang/String;III)V

    move-object/from16 v5, v20

    move/from16 v2, v21

    move/from16 v4, v22

    const/4 v7, 0x2

    const/4 v13, 0x0

    goto/16 :goto_13

    :cond_32
    move/from16 v2, p8

    goto :goto_18

    :cond_33
    move v2, v3

    :goto_18
    invoke-virtual {v1, v2}, Ljz0;->b2(I)V

    :cond_34
    const-wide/16 v1, 0x0

    return-wide v1
.end method

.method public e(Ljz0;)V
    .locals 5

    iget-object v0, p0, LOE;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    invoke-virtual {v2}, Liz0;->C()Liz0$b;

    move-result-object v3

    sget-object v4, Liz0$b;->d:Liz0$b;

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Liz0;->V()Liz0$b;

    move-result-object v3

    if-ne v3, v4, :cond_1

    :cond_0
    iget-object v3, p0, LOE;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljz0;->R1()V

    return-void
.end method
