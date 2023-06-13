.class public Lim2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;

.field public static final b:Ldj2$a;

.field public static final c:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 23

    const-string v0, "nm"

    const-string v1, "ind"

    const-string v2, "refId"

    const-string v3, "ty"

    const-string v4, "parent"

    const-string v5, "sw"

    const-string v6, "sh"

    const-string v7, "sc"

    const-string v8, "ks"

    const-string v9, "tt"

    const-string v10, "masksProperties"

    const-string v11, "shapes"

    const-string v12, "t"

    const-string v13, "ef"

    const-string v14, "sr"

    const-string v15, "st"

    const-string v16, "w"

    const-string v17, "h"

    const-string v18, "ip"

    const-string v19, "op"

    const-string v20, "tm"

    const-string v21, "cl"

    const-string v22, "hd"

    filled-new-array/range {v0 .. v22}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, Lim2;->a:Ldj2$a;

    const-string v0, "d"

    const-string v1, "a"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, Lim2;->b:Ldj2$a;

    const-string v0, "ty"

    const-string v1, "nm"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, Lim2;->c:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)Lfm2;
    .locals 40
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    sget-object v1, Lfm2$b;->b:Lfm2$b;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ldj2;->c()V

    const-string v2, "UNSET"

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    const-wide/16 v12, -0x1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    move-object/from16 v32, v1

    move-object/from16 v18, v3

    move-object/from16 v21, v18

    move-object/from16 v22, v21

    move-object/from16 v30, v22

    move-object/from16 v31, v30

    move-object/from16 v33, v31

    move-object/from16 v35, v33

    move-object/from16 v36, v35

    move-wide/from16 v16, v4

    move/from16 v23, v6

    move/from16 v24, v23

    move/from16 v25, v24

    move/from16 v34, v25

    move/from16 v27, v9

    move/from16 v28, v27

    move/from16 v29, v28

    move/from16 v37, v29

    move-wide/from16 v19, v12

    move/from16 v26, v14

    move-object v12, v2

    move-object/from16 v13, v36

    move/from16 v14, v37

    :cond_0
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_12

    sget-object v1, Lim2;->a:Ldj2$a;

    invoke-virtual {v0, v1}, Ldj2;->s(Ldj2$a;)I

    move-result v1

    const/4 v2, 0x1

    packed-switch v1, :pswitch_data_0

    invoke-virtual/range {p0 .. p0}, Ldj2;->t()V

    invoke-virtual/range {p0 .. p0}, Ldj2;->u()V

    goto :goto_0

    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Ldj2;->i()Z

    move-result v34

    goto :goto_0

    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v13

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v7, v6}, LHe;->f(Ldj2;LrD2;Z)Lqe;

    move-result-object v33

    goto :goto_0

    :pswitch_3
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    double-to-float v1, v1

    move/from16 v37, v1

    goto :goto_0

    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    double-to-float v14, v1

    goto :goto_0

    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    invoke-static {}, LGi6;->e()F

    move-result v3

    float-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-float v1, v1

    move/from16 v29, v1

    goto :goto_0

    :pswitch_6
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    invoke-static {}, LGi6;->e()F

    move-result v3

    float-to-double v3, v3

    mul-double/2addr v1, v3

    double-to-float v1, v1

    move/from16 v28, v1

    goto :goto_0

    :pswitch_7
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    double-to-float v1, v1

    move/from16 v27, v1

    goto :goto_0

    :pswitch_8
    invoke-virtual/range {p0 .. p0}, Ldj2;->k()D

    move-result-wide v1

    double-to-float v1, v1

    move/from16 v26, v1

    goto :goto_0

    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Ldj2;->b()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual/range {p0 .. p0}, Ldj2;->c()V

    :cond_1
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lim2;->c:Ldj2$a;

    invoke-virtual {v0, v3}, Ldj2;->s(Ldj2$a;)I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Ldj2;->t()V

    invoke-virtual/range {p0 .. p0}, Ldj2;->u()V

    goto :goto_2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v3

    const/16 v4, 0x1d

    if-ne v3, v4, :cond_4

    invoke-static/range {p0 .. p1}, LNY;->b(Ldj2;LrD2;)LMY;

    move-result-object v35

    goto :goto_2

    :cond_4
    const/16 v4, 0x19

    if-ne v3, v4, :cond_1

    new-instance v3, LV71;

    invoke-direct {v3}, LV71;-><init>()V

    invoke-virtual {v3, v0, v7}, LV71;->b(Ldj2;LrD2;)LU71;

    move-result-object v36

    goto :goto_2

    :cond_5
    invoke-virtual/range {p0 .. p0}, Ldj2;->f()V

    goto :goto_1

    :cond_6
    invoke-virtual/range {p0 .. p0}, Ldj2;->d()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, LrD2;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual/range {p0 .. p0}, Ldj2;->c()V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lim2;->b:Ldj2$a;

    invoke-virtual {v0, v1}, Ldj2;->s(Ldj2$a;)I

    move-result v1

    if-eqz v1, :cond_a

    if-eq v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Ldj2;->t()V

    invoke-virtual/range {p0 .. p0}, Ldj2;->u()V

    goto :goto_3

    :cond_7
    invoke-virtual/range {p0 .. p0}, Ldj2;->b()V

    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static/range {p0 .. p1}, LDe;->a(Ldj2;LrD2;)LCe;

    move-result-object v1

    move-object/from16 v31, v1

    :cond_8
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual/range {p0 .. p0}, Ldj2;->u()V

    goto :goto_4

    :cond_9
    invoke-virtual/range {p0 .. p0}, Ldj2;->d()V

    goto :goto_3

    :cond_a
    invoke-static/range {p0 .. p1}, LHe;->d(Ldj2;LrD2;)LBe;

    move-result-object v30

    goto :goto_3

    :cond_b
    invoke-virtual/range {p0 .. p0}, Ldj2;->f()V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual/range {p0 .. p0}, Ldj2;->b()V

    :cond_c
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static/range {p0 .. p1}, LAA0;->a(Ldj2;LrD2;)LzA0;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    invoke-virtual/range {p0 .. p0}, Ldj2;->d()V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual/range {p0 .. p0}, Ldj2;->b()V

    :goto_6
    invoke-virtual/range {p0 .. p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static/range {p0 .. p1}, LrM2;->a(Ldj2;LrD2;)LpM2;

    move-result-object v1

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v7, v1}, LrD2;->r(I)V

    invoke-virtual/range {p0 .. p0}, Ldj2;->d()V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    invoke-static {}, Lfm2$b;->values()[Lfm2$b;

    move-result-object v3

    array-length v3, v3

    if-lt v1, v3, :cond_f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported matte type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, LrD2;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    invoke-static {}, Lfm2$b;->values()[Lfm2$b;

    move-result-object v3

    aget-object v32, v3, v1

    sget-object v1, Lim2$a;->a:[I

    invoke-virtual/range {v32 .. v32}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    if-eq v1, v2, :cond_11

    const/4 v3, 0x2

    if-eq v1, v3, :cond_10

    goto :goto_7

    :cond_10
    const-string v1, "Unsupported matte type: Luma Inverted"

    invoke-virtual {v7, v1}, LrD2;->a(Ljava/lang/String;)V

    goto :goto_7

    :cond_11
    const-string v1, "Unsupported matte type: Luma"

    invoke-virtual {v7, v1}, LrD2;->a(Ljava/lang/String;)V

    :goto_7
    invoke-virtual {v7, v2}, LrD2;->r(I)V

    goto/16 :goto_0

    :pswitch_e
    invoke-static/range {p0 .. p1}, LFe;->g(Ldj2;LrD2;)LEe;

    move-result-object v22

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual/range {p0 .. p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    int-to-float v1, v1

    invoke-static {}, LGi6;->e()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    move/from16 v24, v1

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    int-to-float v1, v1

    invoke-static {}, LGi6;->e()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    move/from16 v23, v1

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    int-to-long v1, v1

    move-wide/from16 v19, v1

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    sget-object v18, Lfm2$a;->h:Lfm2$a;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-static {}, Lfm2$a;->values()[Lfm2$a;

    move-result-object v2

    aget-object v18, v2, v1

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual/range {p0 .. p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v21

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual/range {p0 .. p0}, Ldj2;->l()I

    move-result v1

    int-to-long v1, v1

    move-wide/from16 v16, v1

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual/range {p0 .. p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_0

    :cond_12
    invoke-virtual/range {p0 .. p0}, Ldj2;->f()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    cmpl-float v0, v14, v9

    if-lez v0, :cond_13

    new-instance v5, Lfl2;

    const/4 v4, 0x0

    const/16 v38, 0x0

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v39

    move-object v0, v5

    move-object/from16 v1, p1

    move-object v2, v11

    move-object v3, v11

    move-object v9, v5

    move/from16 v5, v38

    move-object/from16 v38, v10

    move-object v10, v6

    move-object/from16 v6, v39

    invoke-direct/range {v0 .. v6}, Lfl2;-><init>(LrD2;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    goto :goto_8

    :cond_13
    move-object/from16 v38, v10

    move-object v10, v6

    move v0, v9

    :goto_8
    cmpl-float v0, v37, v0

    if-lez v0, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual/range {p1 .. p1}, LrD2;->f()F

    move-result v0

    move/from16 v37, v0

    :goto_9
    new-instance v9, Lfl2;

    const/4 v4, 0x0

    invoke-static/range {v37 .. v37}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object v0, v9

    move-object/from16 v1, p1

    move-object v2, v15

    move-object v3, v15

    move v5, v14

    invoke-direct/range {v0 .. v6}, Lfl2;-><init>(LrD2;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, Lfl2;

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object v0, v9

    move-object v2, v11

    move-object v3, v11

    move/from16 v5, v37

    invoke-direct/range {v0 .. v6}, Lfl2;-><init>(LrD2;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, ".ai"

    invoke-virtual {v12, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    const-string v0, "ai"

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    :cond_15
    const-string v0, "Convert your Illustrator layers to shape layers."

    invoke-virtual {v7, v0}, LrD2;->a(Ljava/lang/String;)V

    :cond_16
    new-instance v37, Lfm2;

    move-object/from16 v0, v37

    move-object v1, v8

    move-object/from16 v2, p1

    move-object v3, v12

    move-wide/from16 v4, v16

    move-object/from16 v6, v18

    move-wide/from16 v7, v19

    move-object/from16 v9, v21

    move-object/from16 v21, v10

    move-object/from16 v10, v38

    move-object/from16 v11, v22

    move/from16 v12, v23

    move/from16 v13, v24

    move/from16 v14, v25

    move/from16 v15, v26

    move/from16 v16, v27

    move/from16 v17, v28

    move/from16 v18, v29

    move-object/from16 v19, v30

    move-object/from16 v20, v31

    move-object/from16 v22, v32

    move-object/from16 v23, v33

    move/from16 v24, v34

    move-object/from16 v25, v35

    move-object/from16 v26, v36

    invoke-direct/range {v0 .. v26}, Lfm2;-><init>(Ljava/util/List;LrD2;Ljava/lang/String;JLfm2$a;JLjava/lang/String;Ljava/util/List;LEe;IIIFFFFLBe;LCe;Ljava/util/List;Lfm2$b;Lqe;ZLMY;LU71;)V

    return-object v37

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(LrD2;)Lfm2;
    .locals 28

    move-object/from16 v2, p0

    invoke-virtual/range {p0 .. p0}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object v18

    new-instance v27, Lfm2;

    move-object/from16 v0, v27

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v3, "__container"

    const-wide/16 v4, -0x1

    sget-object v6, Lfm2$a;->b:Lfm2$a;

    const-wide/16 v7, -0x1

    const/4 v9, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v10

    new-instance v12, LEe;

    move-object v11, v12

    invoke-direct {v12}, LEe;-><init>()V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    move/from16 v17, v4

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    move/from16 v18, v4

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v21

    sget-object v22, Lfm2$b;->b:Lfm2$b;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v4, -0x1

    invoke-direct/range {v0 .. v26}, Lfm2;-><init>(Ljava/util/List;LrD2;Ljava/lang/String;JLfm2$a;JLjava/lang/String;Ljava/util/List;LEe;IIIFFFFLBe;LCe;Ljava/util/List;Lfm2$b;Lqe;ZLMY;LU71;)V

    return-object v27
.end method
