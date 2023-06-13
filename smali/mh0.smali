.class public Lmh0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljz0;LLr2;IILnh0;)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v1, p4

    iget-object v11, v1, Lnh0;->a:Liz0;

    iget-object v12, v1, Lnh0;->c:Liz0;

    iget-object v13, v1, Lnh0;->b:Liz0;

    iget-object v14, v1, Lnh0;->d:Liz0;

    iget-object v2, v1, Lnh0;->e:Liz0;

    iget v3, v1, Lnh0;->k:F

    iget-object v4, v0, Liz0;->b0:[Liz0$b;

    aget-object v4, v4, v10

    sget-object v5, Liz0$b;->c:Liz0$b;

    const/4 v15, 0x1

    if-ne v4, v5, :cond_0

    move v4, v15

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-nez v10, :cond_3

    iget v7, v2, Liz0;->J0:I

    if-nez v7, :cond_1

    move v8, v15

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-ne v7, v15, :cond_2

    move/from16 v16, v15

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    :goto_2
    if-ne v7, v5, :cond_6

    goto :goto_5

    :cond_3
    iget v7, v2, Liz0;->K0:I

    if-nez v7, :cond_4

    move v8, v15

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    if-ne v7, v15, :cond_5

    move/from16 v16, v15

    goto :goto_4

    :cond_5
    const/16 v16, 0x0

    :goto_4
    if-ne v7, v5, :cond_6

    :goto_5
    move v5, v15

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    :goto_6
    move/from16 v17, v16

    const/4 v7, 0x0

    move/from16 v16, v8

    move-object v8, v11

    :goto_7
    const/16 v21, 0x0

    if-nez v7, :cond_14

    iget-object v6, v8, Liz0;->Y:[LXy0;

    aget-object v6, v6, p3

    if-eqz v5, :cond_7

    const/16 v19, 0x1

    goto :goto_8

    :cond_7
    const/16 v19, 0x4

    :goto_8
    invoke-virtual {v6}, LXy0;->f()I

    move-result v23

    iget-object v15, v8, Liz0;->b0:[Liz0$b;

    aget-object v15, v15, v10

    move/from16 v25, v3

    sget-object v3, Liz0$b;->d:Liz0$b;

    if-ne v15, v3, :cond_8

    iget-object v15, v8, Liz0;->y:[I

    aget v15, v15, v10

    if-nez v15, :cond_8

    move/from16 v26, v7

    const/4 v15, 0x1

    goto :goto_9

    :cond_8
    move/from16 v26, v7

    const/4 v15, 0x0

    :goto_9
    iget-object v7, v6, LXy0;->f:LXy0;

    if-eqz v7, :cond_9

    if-eq v8, v11, :cond_9

    invoke-virtual {v7}, LXy0;->f()I

    move-result v7

    add-int v23, v23, v7

    :cond_9
    move/from16 v7, v23

    if-eqz v5, :cond_a

    if-eq v8, v11, :cond_a

    if-eq v8, v13, :cond_a

    move-object/from16 v23, v2

    const/16 v19, 0x8

    goto :goto_a

    :cond_a
    move-object/from16 v23, v2

    :goto_a
    iget-object v2, v6, LXy0;->f:LXy0;

    if-eqz v2, :cond_e

    if-ne v8, v13, :cond_b

    move-object/from16 v27, v11

    iget-object v11, v6, LXy0;->i:LrN5;

    iget-object v2, v2, LXy0;->i:LrN5;

    const/4 v1, 0x6

    invoke-virtual {v9, v11, v2, v7, v1}, LLr2;->h(LrN5;LrN5;II)V

    goto :goto_b

    :cond_b
    move-object/from16 v27, v11

    iget-object v1, v6, LXy0;->i:LrN5;

    iget-object v2, v2, LXy0;->i:LrN5;

    const/16 v11, 0x8

    invoke-virtual {v9, v1, v2, v7, v11}, LLr2;->h(LrN5;LrN5;II)V

    :goto_b
    if-eqz v15, :cond_c

    if-nez v5, :cond_c

    const/16 v19, 0x5

    :cond_c
    if-ne v8, v13, :cond_d

    if-eqz v5, :cond_d

    invoke-virtual {v8, v10}, Liz0;->j0(I)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x5

    goto :goto_c

    :cond_d
    move/from16 v1, v19

    :goto_c
    iget-object v2, v6, LXy0;->i:LrN5;

    iget-object v6, v6, LXy0;->f:LXy0;

    iget-object v6, v6, LXy0;->i:LrN5;

    invoke-virtual {v9, v2, v6, v7, v1}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_d

    :cond_e
    move-object/from16 v27, v11

    :goto_d
    if-eqz v4, :cond_10

    invoke-virtual {v8}, Liz0;->X()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_f

    iget-object v1, v8, Liz0;->b0:[Liz0$b;

    aget-object v1, v1, v10

    if-ne v1, v3, :cond_f

    iget-object v1, v8, Liz0;->Y:[LXy0;

    add-int/lit8 v2, p3, 0x1

    aget-object v2, v1, v2

    iget-object v2, v2, LXy0;->i:LrN5;

    aget-object v1, v1, p3

    iget-object v1, v1, LXy0;->i:LrN5;

    const/4 v3, 0x5

    const/4 v6, 0x0

    invoke-virtual {v9, v2, v1, v6, v3}, LLr2;->h(LrN5;LrN5;II)V

    goto :goto_e

    :cond_f
    const/4 v6, 0x0

    :goto_e
    iget-object v1, v8, Liz0;->Y:[LXy0;

    aget-object v1, v1, p3

    iget-object v1, v1, LXy0;->i:LrN5;

    iget-object v2, v0, Liz0;->Y:[LXy0;

    aget-object v2, v2, p3

    iget-object v2, v2, LXy0;->i:LrN5;

    const/16 v3, 0x8

    invoke-virtual {v9, v1, v2, v6, v3}, LLr2;->h(LrN5;LrN5;II)V

    :cond_10
    iget-object v1, v8, Liz0;->Y:[LXy0;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, LXy0;->f:LXy0;

    if-eqz v1, :cond_12

    iget-object v1, v1, LXy0;->d:Liz0;

    iget-object v2, v1, Liz0;->Y:[LXy0;

    aget-object v2, v2, p3

    iget-object v2, v2, LXy0;->f:LXy0;

    if-eqz v2, :cond_12

    iget-object v2, v2, LXy0;->d:Liz0;

    if-eq v2, v8, :cond_11

    goto :goto_f

    :cond_11
    move-object/from16 v21, v1

    :cond_12
    :goto_f
    if-eqz v21, :cond_13

    move-object/from16 v8, v21

    move/from16 v7, v26

    goto :goto_10

    :cond_13
    const/4 v7, 0x1

    :goto_10
    move-object/from16 v1, p4

    move-object/from16 v2, v23

    move/from16 v3, v25

    move-object/from16 v11, v27

    goto/16 :goto_7

    :cond_14
    move-object/from16 v23, v2

    move/from16 v25, v3

    move-object/from16 v27, v11

    if-eqz v14, :cond_18

    iget-object v1, v12, Liz0;->Y:[LXy0;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, LXy0;->f:LXy0;

    if-eqz v1, :cond_18

    iget-object v1, v14, Liz0;->Y:[LXy0;

    aget-object v1, v1, v2

    iget-object v3, v14, Liz0;->b0:[Liz0$b;

    aget-object v3, v3, v10

    sget-object v6, Liz0$b;->d:Liz0$b;

    if-ne v3, v6, :cond_15

    iget-object v3, v14, Liz0;->y:[I

    aget v3, v3, v10

    if-nez v3, :cond_15

    const/4 v3, 0x1

    goto :goto_11

    :cond_15
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_16

    if-nez v5, :cond_16

    iget-object v3, v1, LXy0;->f:LXy0;

    iget-object v6, v3, LXy0;->d:Liz0;

    if-ne v6, v0, :cond_16

    iget-object v6, v1, LXy0;->i:LrN5;

    iget-object v3, v3, LXy0;->i:LrN5;

    invoke-virtual {v1}, LXy0;->f()I

    move-result v7

    neg-int v7, v7

    const/4 v8, 0x5

    invoke-virtual {v9, v6, v3, v7, v8}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_12

    :cond_16
    const/4 v8, 0x5

    if-eqz v5, :cond_17

    iget-object v3, v1, LXy0;->f:LXy0;

    iget-object v6, v3, LXy0;->d:Liz0;

    if-ne v6, v0, :cond_17

    iget-object v6, v1, LXy0;->i:LrN5;

    iget-object v3, v3, LXy0;->i:LrN5;

    invoke-virtual {v1}, LXy0;->f()I

    move-result v7

    neg-int v7, v7

    const/4 v11, 0x4

    invoke-virtual {v9, v6, v3, v7, v11}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_17
    :goto_12
    iget-object v3, v1, LXy0;->i:LrN5;

    iget-object v6, v12, Liz0;->Y:[LXy0;

    aget-object v2, v6, v2

    iget-object v2, v2, LXy0;->f:LXy0;

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    const/4 v6, 0x6

    invoke-virtual {v9, v3, v2, v1, v6}, LLr2;->j(LrN5;LrN5;II)V

    goto :goto_13

    :cond_18
    const/4 v8, 0x5

    :goto_13
    if-eqz v4, :cond_19

    iget-object v0, v0, Liz0;->Y:[LXy0;

    add-int/lit8 v1, p3, 0x1

    aget-object v0, v0, v1

    iget-object v0, v0, LXy0;->i:LrN5;

    iget-object v2, v12, Liz0;->Y:[LXy0;

    aget-object v1, v2, v1

    iget-object v2, v1, LXy0;->i:LrN5;

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    const/16 v3, 0x8

    invoke-virtual {v9, v0, v2, v1, v3}, LLr2;->h(LrN5;LrN5;II)V

    :cond_19
    move-object/from16 v0, p4

    iget-object v1, v0, Lnh0;->h:Ljava/util/ArrayList;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1f

    iget-boolean v3, v0, Lnh0;->r:Z

    if-eqz v3, :cond_1a

    iget-boolean v3, v0, Lnh0;->t:Z

    if-nez v3, :cond_1a

    iget v3, v0, Lnh0;->j:I

    int-to-float v3, v3

    goto :goto_14

    :cond_1a
    move/from16 v3, v25

    :goto_14
    const/4 v4, 0x0

    move/from16 v29, v4

    move-object/from16 v7, v21

    const/4 v6, 0x0

    :goto_15
    if-ge v6, v2, :cond_1f

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Liz0;

    iget-object v15, v11, Liz0;->N0:[F

    aget v15, v15, v10

    cmpg-float v20, v15, v4

    if-gez v20, :cond_1c

    iget-boolean v15, v0, Lnh0;->t:Z

    if-eqz v15, :cond_1b

    iget-object v11, v11, Liz0;->Y:[LXy0;

    add-int/lit8 v15, p3, 0x1

    aget-object v15, v11, v15

    iget-object v15, v15, LXy0;->i:LrN5;

    aget-object v11, v11, p3

    iget-object v11, v11, LXy0;->i:LrN5;

    const/4 v4, 0x0

    const/4 v8, 0x4

    invoke-virtual {v9, v15, v11, v4, v8}, LLr2;->e(LrN5;LrN5;II)Lxo;

    move v8, v4

    goto :goto_17

    :cond_1b
    const/4 v8, 0x4

    const/high16 v15, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    goto :goto_16

    :cond_1c
    const/4 v8, 0x4

    :goto_16
    cmpl-float v19, v15, v4

    if-nez v19, :cond_1d

    iget-object v11, v11, Liz0;->Y:[LXy0;

    add-int/lit8 v15, p3, 0x1

    aget-object v15, v11, v15

    iget-object v15, v15, LXy0;->i:LrN5;

    aget-object v11, v11, p3

    iget-object v11, v11, LXy0;->i:LrN5;

    const/16 v4, 0x8

    const/4 v8, 0x0

    invoke-virtual {v9, v15, v11, v8, v4}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :goto_17
    move-object/from16 v25, v1

    move/from16 v18, v2

    goto :goto_19

    :cond_1d
    const/4 v8, 0x0

    if-eqz v7, :cond_1e

    iget-object v4, v7, Liz0;->Y:[LXy0;

    aget-object v7, v4, p3

    iget-object v7, v7, LXy0;->i:LrN5;

    add-int/lit8 v18, p3, 0x1

    aget-object v4, v4, v18

    iget-object v4, v4, LXy0;->i:LrN5;

    iget-object v8, v11, Liz0;->Y:[LXy0;

    move-object/from16 v25, v1

    aget-object v1, v8, p3

    iget-object v1, v1, LXy0;->i:LrN5;

    aget-object v8, v8, v18

    iget-object v8, v8, LXy0;->i:LrN5;

    move/from16 v18, v2

    invoke-virtual/range {p1 .. p1}, LLr2;->r()Lxo;

    move-result-object v2

    move-object/from16 v28, v2

    move/from16 v30, v3

    move/from16 v31, v15

    move-object/from16 v32, v7

    move-object/from16 v33, v4

    move-object/from16 v34, v1

    move-object/from16 v35, v8

    invoke-virtual/range {v28 .. v35}, Lxo;->l(FFFLrN5;LrN5;LrN5;LrN5;)Lxo;

    invoke-virtual {v9, v2}, LLr2;->d(Lxo;)V

    goto :goto_18

    :cond_1e
    move-object/from16 v25, v1

    move/from16 v18, v2

    :goto_18
    move-object v7, v11

    move/from16 v29, v15

    :goto_19
    add-int/lit8 v6, v6, 0x1

    move/from16 v2, v18

    move-object/from16 v1, v25

    const/4 v4, 0x0

    const/4 v8, 0x5

    goto/16 :goto_15

    :cond_1f
    if-eqz v13, :cond_25

    if-eq v13, v14, :cond_20

    if-eqz v5, :cond_25

    :cond_20
    move-object/from16 v11, v27

    iget-object v0, v11, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    iget-object v1, v12, Liz0;->Y:[LXy0;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v0, v0, LXy0;->f:LXy0;

    if-eqz v0, :cond_21

    iget-object v0, v0, LXy0;->i:LrN5;

    move-object v3, v0

    goto :goto_1a

    :cond_21
    move-object/from16 v3, v21

    :goto_1a
    iget-object v0, v1, LXy0;->f:LXy0;

    if-eqz v0, :cond_22

    iget-object v0, v0, LXy0;->i:LrN5;

    move-object v5, v0

    goto :goto_1b

    :cond_22
    move-object/from16 v5, v21

    :goto_1b
    iget-object v0, v13, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    if-eqz v14, :cond_23

    iget-object v1, v14, Liz0;->Y:[LXy0;

    aget-object v1, v1, v2

    :cond_23
    if-eqz v3, :cond_48

    if-eqz v5, :cond_48

    if-nez v10, :cond_24

    move-object/from16 v2, v23

    iget v2, v2, Liz0;->q0:F

    goto :goto_1c

    :cond_24
    move-object/from16 v2, v23

    iget v2, v2, Liz0;->r0:F

    :goto_1c
    move v4, v2

    invoke-virtual {v0}, LXy0;->f()I

    move-result v6

    invoke-virtual {v1}, LXy0;->f()I

    move-result v7

    iget-object v2, v0, LXy0;->i:LrN5;

    iget-object v8, v1, LXy0;->i:LrN5;

    const/4 v10, 0x7

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v8

    move v8, v10

    invoke-virtual/range {v0 .. v8}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    goto/16 :goto_36

    :cond_25
    move-object/from16 v11, v27

    if-eqz v16, :cond_37

    if-eqz v13, :cond_37

    iget v1, v0, Lnh0;->j:I

    if-lez v1, :cond_26

    iget v0, v0, Lnh0;->i:I

    if-ne v0, v1, :cond_26

    const/16 v24, 0x1

    goto :goto_1d

    :cond_26
    const/16 v24, 0x0

    :goto_1d
    move-object v8, v13

    move-object v15, v8

    :goto_1e
    if-eqz v15, :cond_48

    iget-object v0, v15, Liz0;->P0:[Liz0;

    aget-object v0, v0, v10

    move-object v7, v0

    :goto_1f
    if-eqz v7, :cond_27

    invoke-virtual {v7}, Liz0;->X()I

    move-result v0

    const/16 v6, 0x8

    if-ne v0, v6, :cond_28

    iget-object v0, v7, Liz0;->P0:[Liz0;

    aget-object v7, v0, v10

    goto :goto_1f

    :cond_27
    const/16 v6, 0x8

    :cond_28
    if-nez v7, :cond_2a

    if-ne v15, v14, :cond_29

    goto :goto_21

    :cond_29
    move-object/from16 v20, v7

    :goto_20
    move-object/from16 v18, v8

    goto/16 :goto_28

    :cond_2a
    :goto_21
    iget-object v0, v15, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    iget-object v1, v0, LXy0;->i:LrN5;

    iget-object v2, v0, LXy0;->f:LXy0;

    if-eqz v2, :cond_2b

    iget-object v2, v2, LXy0;->i:LrN5;

    goto :goto_22

    :cond_2b
    move-object/from16 v2, v21

    :goto_22
    if-eq v8, v15, :cond_2c

    iget-object v2, v8, Liz0;->Y:[LXy0;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, LXy0;->i:LrN5;

    goto :goto_23

    :cond_2c
    if-ne v15, v13, :cond_2e

    iget-object v2, v11, Liz0;->Y:[LXy0;

    aget-object v2, v2, p3

    iget-object v2, v2, LXy0;->f:LXy0;

    if-eqz v2, :cond_2d

    iget-object v2, v2, LXy0;->i:LrN5;

    goto :goto_23

    :cond_2d
    move-object/from16 v2, v21

    :cond_2e
    :goto_23
    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    iget-object v3, v15, Liz0;->Y:[LXy0;

    add-int/lit8 v4, p3, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    if-eqz v7, :cond_2f

    iget-object v5, v7, Liz0;->Y:[LXy0;

    aget-object v5, v5, p3

    iget-object v6, v5, LXy0;->i:LrN5;

    :goto_24
    move-object/from16 p0, v7

    goto :goto_25

    :cond_2f
    iget-object v5, v12, Liz0;->Y:[LXy0;

    aget-object v5, v5, v4

    iget-object v5, v5, LXy0;->f:LXy0;

    if-eqz v5, :cond_30

    iget-object v6, v5, LXy0;->i:LrN5;

    goto :goto_24

    :cond_30
    move-object/from16 p0, v7

    move-object/from16 v6, v21

    :goto_25
    iget-object v7, v15, Liz0;->Y:[LXy0;

    aget-object v7, v7, v4

    iget-object v7, v7, LXy0;->i:LrN5;

    if-eqz v5, :cond_31

    invoke-virtual {v5}, LXy0;->f()I

    move-result v5

    add-int/2addr v3, v5

    :cond_31
    iget-object v5, v8, Liz0;->Y:[LXy0;

    aget-object v5, v5, v4

    invoke-virtual {v5}, LXy0;->f()I

    move-result v5

    add-int/2addr v0, v5

    if-eqz v1, :cond_35

    if-eqz v2, :cond_35

    if-eqz v6, :cond_35

    if-eqz v7, :cond_35

    if-ne v15, v13, :cond_32

    iget-object v0, v13, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    :cond_32
    move v5, v0

    if-ne v15, v14, :cond_33

    iget-object v0, v14, Liz0;->Y:[LXy0;

    aget-object v0, v0, v4

    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    move/from16 v18, v0

    goto :goto_26

    :cond_33
    move/from16 v18, v3

    :goto_26
    if-eqz v24, :cond_34

    const/16 v19, 0x8

    goto :goto_27

    :cond_34
    const/16 v19, 0x5

    :goto_27
    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move v3, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v20, p0

    move/from16 v7, v18

    move-object/from16 v18, v8

    move/from16 v8, v19

    invoke-virtual/range {v0 .. v8}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    goto :goto_28

    :cond_35
    move-object/from16 v20, p0

    goto/16 :goto_20

    :goto_28
    invoke-virtual {v15}, Liz0;->X()I

    move-result v0

    const/16 v8, 0x8

    if-eq v0, v8, :cond_36

    goto :goto_29

    :cond_36
    move-object/from16 v15, v18

    :goto_29
    move-object v8, v15

    move-object/from16 v15, v20

    goto/16 :goto_1e

    :cond_37
    const/16 v8, 0x8

    if-eqz v17, :cond_48

    if-eqz v13, :cond_48

    iget v1, v0, Lnh0;->j:I

    if-lez v1, :cond_38

    iget v0, v0, Lnh0;->i:I

    if-ne v0, v1, :cond_38

    const/16 v24, 0x1

    goto :goto_2a

    :cond_38
    const/16 v24, 0x0

    :goto_2a
    move-object v7, v13

    move-object v15, v7

    :goto_2b
    if-eqz v15, :cond_44

    iget-object v0, v15, Liz0;->P0:[Liz0;

    aget-object v0, v0, v10

    :goto_2c
    if-eqz v0, :cond_39

    invoke-virtual {v0}, Liz0;->X()I

    move-result v1

    if-ne v1, v8, :cond_39

    iget-object v0, v0, Liz0;->P0:[Liz0;

    aget-object v0, v0, v10

    goto :goto_2c

    :cond_39
    if-eq v15, v13, :cond_42

    if-eq v15, v14, :cond_42

    if-eqz v0, :cond_42

    if-ne v0, v14, :cond_3a

    move-object/from16 v6, v21

    goto :goto_2d

    :cond_3a
    move-object v6, v0

    :goto_2d
    iget-object v0, v15, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    iget-object v1, v0, LXy0;->i:LrN5;

    iget-object v2, v0, LXy0;->f:LXy0;

    if-eqz v2, :cond_3b

    iget-object v2, v2, LXy0;->i:LrN5;

    :cond_3b
    iget-object v2, v7, Liz0;->Y:[LXy0;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, LXy0;->i:LrN5;

    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    iget-object v4, v15, Liz0;->Y:[LXy0;

    aget-object v4, v4, v3

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    if-eqz v6, :cond_3d

    iget-object v5, v6, Liz0;->Y:[LXy0;

    aget-object v5, v5, p3

    iget-object v8, v5, LXy0;->i:LrN5;

    move-object/from16 p0, v6

    iget-object v6, v5, LXy0;->f:LXy0;

    if-eqz v6, :cond_3c

    iget-object v6, v6, LXy0;->i:LrN5;

    goto :goto_2e

    :cond_3c
    move-object/from16 v6, v21

    :goto_2e
    move-object/from16 v36, v8

    move-object v8, v6

    move-object/from16 v6, v36

    goto :goto_30

    :cond_3d
    move-object/from16 p0, v6

    iget-object v5, v14, Liz0;->Y:[LXy0;

    aget-object v5, v5, p3

    if-eqz v5, :cond_3e

    iget-object v6, v5, LXy0;->i:LrN5;

    goto :goto_2f

    :cond_3e
    move-object/from16 v6, v21

    :goto_2f
    iget-object v8, v15, Liz0;->Y:[LXy0;

    aget-object v8, v8, v3

    iget-object v8, v8, LXy0;->i:LrN5;

    :goto_30
    if-eqz v5, :cond_3f

    invoke-virtual {v5}, LXy0;->f()I

    move-result v5

    add-int/2addr v4, v5

    :cond_3f
    move/from16 v18, v4

    iget-object v4, v7, Liz0;->Y:[LXy0;

    aget-object v3, v4, v3

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    add-int/2addr v3, v0

    if-eqz v24, :cond_40

    const/16 v20, 0x8

    goto :goto_31

    :cond_40
    const/16 v20, 0x4

    :goto_31
    if-eqz v1, :cond_41

    if-eqz v2, :cond_41

    if-eqz v6, :cond_41

    if-eqz v8, :cond_41

    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move-object v5, v6

    move-object/from16 v19, p0

    const/16 v22, 0x4

    move-object v6, v8

    move-object/from16 v23, v7

    move/from16 v7, v18

    const/16 v10, 0x8

    move/from16 v8, v20

    invoke-virtual/range {v0 .. v8}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    goto :goto_32

    :cond_41
    move-object/from16 v19, p0

    move-object/from16 v23, v7

    const/16 v10, 0x8

    const/16 v22, 0x4

    :goto_32
    move-object/from16 v0, v19

    goto :goto_33

    :cond_42
    move-object/from16 v23, v7

    move v10, v8

    const/16 v22, 0x4

    :goto_33
    invoke-virtual {v15}, Liz0;->X()I

    move-result v1

    if-eq v1, v10, :cond_43

    move-object v7, v15

    goto :goto_34

    :cond_43
    move-object/from16 v7, v23

    :goto_34
    move-object v15, v0

    move v8, v10

    move/from16 v10, p2

    goto/16 :goto_2b

    :cond_44
    iget-object v0, v13, Liz0;->Y:[LXy0;

    aget-object v0, v0, p3

    iget-object v1, v11, Liz0;->Y:[LXy0;

    aget-object v1, v1, p3

    iget-object v1, v1, LXy0;->f:LXy0;

    iget-object v2, v14, Liz0;->Y:[LXy0;

    add-int/lit8 v3, p3, 0x1

    aget-object v10, v2, v3

    iget-object v2, v12, Liz0;->Y:[LXy0;

    aget-object v2, v2, v3

    iget-object v11, v2, LXy0;->f:LXy0;

    if-eqz v1, :cond_46

    if-eq v13, v14, :cond_45

    iget-object v2, v0, LXy0;->i:LrN5;

    iget-object v1, v1, LXy0;->i:LrN5;

    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    const/4 v15, 0x5

    invoke-virtual {v9, v2, v1, v0, v15}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_35

    :cond_45
    const/4 v15, 0x5

    if-eqz v11, :cond_47

    iget-object v2, v0, LXy0;->i:LrN5;

    iget-object v3, v1, LXy0;->i:LrN5;

    invoke-virtual {v0}, LXy0;->f()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v10, LXy0;->i:LrN5;

    iget-object v7, v11, LXy0;->i:LrN5;

    invoke-virtual {v10}, LXy0;->f()I

    move-result v8

    const/16 v18, 0x5

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move/from16 v8, v18

    invoke-virtual/range {v0 .. v8}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    goto :goto_35

    :cond_46
    const/4 v15, 0x5

    :cond_47
    :goto_35
    if-eqz v11, :cond_48

    if-eq v13, v14, :cond_48

    iget-object v0, v10, LXy0;->i:LrN5;

    iget-object v1, v11, LXy0;->i:LrN5;

    invoke-virtual {v10}, LXy0;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v9, v0, v1, v2, v15}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_48
    :goto_36
    if-nez v16, :cond_49

    if-eqz v17, :cond_50

    :cond_49
    if-eqz v13, :cond_50

    if-eq v13, v14, :cond_50

    iget-object v0, v13, Liz0;->Y:[LXy0;

    aget-object v1, v0, p3

    if-nez v14, :cond_4a

    move-object v14, v13

    :cond_4a
    iget-object v2, v14, Liz0;->Y:[LXy0;

    const/4 v3, 0x1

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v4, v1, LXy0;->f:LXy0;

    if-eqz v4, :cond_4b

    iget-object v4, v4, LXy0;->i:LrN5;

    goto :goto_37

    :cond_4b
    move-object/from16 v4, v21

    :goto_37
    iget-object v5, v2, LXy0;->f:LXy0;

    if-eqz v5, :cond_4c

    iget-object v5, v5, LXy0;->i:LrN5;

    goto :goto_38

    :cond_4c
    move-object/from16 v5, v21

    :goto_38
    if-eq v12, v14, :cond_4e

    iget-object v5, v12, Liz0;->Y:[LXy0;

    aget-object v5, v5, v3

    iget-object v5, v5, LXy0;->f:LXy0;

    if-eqz v5, :cond_4d

    iget-object v5, v5, LXy0;->i:LrN5;

    move-object/from16 v21, v5

    :cond_4d
    move-object/from16 v5, v21

    :cond_4e
    if-ne v13, v14, :cond_4f

    aget-object v2, v0, v3

    :cond_4f
    if-eqz v4, :cond_50

    if-eqz v5, :cond_50

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-virtual {v1}, LXy0;->f()I

    move-result v7

    iget-object v0, v14, Liz0;->Y:[LXy0;

    aget-object v0, v0, v3

    invoke-virtual {v0}, LXy0;->f()I

    move-result v8

    iget-object v1, v1, LXy0;->i:LrN5;

    iget-object v10, v2, LXy0;->i:LrN5;

    const/4 v11, 0x5

    move-object/from16 v0, p1

    move-object v2, v4

    move v3, v7

    move v4, v6

    move-object v6, v10

    move v7, v8

    move v8, v11

    invoke-virtual/range {v0 .. v8}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    :cond_50
    return-void
.end method

.method public static b(Ljz0;LLr2;Ljava/util/ArrayList;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljz0;",
            "LLr2;",
            "Ljava/util/ArrayList<",
            "Liz0;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p3, :cond_0

    iget v1, p0, Ljz0;->h1:I

    iget-object v2, p0, Ljz0;->k1:[Lnh0;

    move v3, v0

    goto :goto_0

    :cond_0
    iget v1, p0, Ljz0;->i1:I

    iget-object v2, p0, Ljz0;->j1:[Lnh0;

    const/4 v3, 0x2

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v4, v2, v0

    invoke-virtual {v4}, Lnh0;->a()V

    if-eqz p2, :cond_1

    iget-object v5, v4, Lnh0;->a:Liz0;

    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    invoke-static {p0, p1, p3, v3, v4}, Lmh0;->a(Ljz0;LLr2;IILnh0;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
