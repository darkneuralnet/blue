.class public final LVm4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u001aO\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0017\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000f\"\u0017\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000f\"\u0017\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000f\"\u0017\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u000f\"\u0017\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u000f\"\u0017\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "",
        "selected",
        "Lkotlin/Function0;",
        "",
        "onClick",
        "LgV2;",
        "modifier",
        "enabled",
        "LrX2;",
        "interactionSource",
        "LTm4;",
        "colors",
        "a",
        "(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V",
        "Lk61;",
        "F",
        "RadioButtonRippleRadius",
        "b",
        "RadioButtonPadding",
        "c",
        "RadioButtonSize",
        "d",
        "RadioRadius",
        "e",
        "RadioButtonDotSize",
        "f",
        "RadioStrokeWidth",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n50#2:243\n49#2:244\n1114#3,6:235\n1114#3,6:245\n75#4:241\n75#4:254\n154#5:242\n154#5:251\n154#5:252\n154#5:253\n154#5:255\n154#5:256\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n116#1:243\n116#1:244\n79#1:235,6\n116#1:245,6\n83#1:241\n230#1:254\n83#1:242\n227#1:251\n228#1:252\n229#1:253\n231#1:255\n232#1:256\n*E\n"
    }
.end annotation


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LVm4;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    sput v1, LVm4;->b:F

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    sput v1, LVm4;->c:F

    div-float/2addr v1, v0

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    sput v1, LVm4;->d:F

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    sput v1, LVm4;->e:F

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LVm4;->f:F

    return-void
.end method

.method public static final a(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Z",
            "LrX2;",
            "LTm4;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p7

    const v0, 0x4e58b201    # 9.0888608E8f

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v6

    and-int/lit8 v1, p8, 0x1

    const/4 v5, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0xe

    if-nez v1, :cond_2

    invoke-interface {v6, v7}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v5

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v9, 0x70

    if-nez v2, :cond_5

    invoke-interface {v6, v8}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v9, 0x380

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v6, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v3, p2

    :goto_6
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v9, 0x1c00

    if-nez v10, :cond_b

    move/from16 v10, p3

    invoke-interface {v6, v10}, LEt0;->o(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_7

    :cond_a
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v1, v11

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v10, p3

    :goto_9
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_b

    :cond_c
    const v12, 0xe000

    and-int/2addr v12, v9

    if-nez v12, :cond_e

    move-object/from16 v12, p4

    invoke-interface {v6, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_a

    :cond_d
    const/16 v13, 0x2000

    :goto_a
    or-int/2addr v1, v13

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v12, p4

    :goto_c
    const/high16 v13, 0x70000

    and-int/2addr v13, v9

    if-nez v13, :cond_11

    and-int/lit8 v13, p8, 0x20

    if-nez v13, :cond_f

    move-object/from16 v13, p5

    invoke-interface {v6, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_d

    :cond_f
    move-object/from16 v13, p5

    :cond_10
    const/high16 v14, 0x10000

    :goto_d
    or-int/2addr v1, v14

    goto :goto_e

    :cond_11
    move-object/from16 v13, p5

    :goto_e
    const v14, 0x5b6db

    and-int/2addr v14, v1

    const v15, 0x12492

    if-ne v14, v15, :cond_13

    invoke-interface {v6}, LEt0;->b()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_f

    :cond_12
    invoke-interface {v6}, LEt0;->k()V

    move-object v4, v3

    move-object v3, v6

    move-object v5, v12

    move-object v6, v13

    goto/16 :goto_19

    :cond_13
    :goto_f
    invoke-interface {v6}, LEt0;->J()V

    and-int/lit8 v14, v9, 0x1

    const v20, -0x70001

    if-eqz v14, :cond_16

    invoke-interface {v6}, LEt0;->l()Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_11

    :cond_14
    invoke-interface {v6}, LEt0;->k()V

    and-int/lit8 v2, p8, 0x20

    if-eqz v2, :cond_15

    and-int v1, v1, v20

    :cond_15
    move-object v15, v3

    move v14, v10

    move-object/from16 v17, v12

    move-object v12, v13

    :goto_10
    move v10, v1

    goto :goto_15

    :cond_16
    :goto_11
    if-eqz v2, :cond_17

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_12

    :cond_17
    move-object v2, v3

    :goto_12
    if-eqz v4, :cond_18

    const/4 v3, 0x1

    goto :goto_13

    :cond_18
    move v3, v10

    :goto_13
    if-eqz v11, :cond_1a

    const v4, -0x1d58f75c

    invoke-interface {v6, v4}, LEt0;->F(I)V

    invoke-interface {v6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v4, v10, :cond_19

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object v4

    invoke-interface {v6, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_19
    invoke-interface {v6}, LEt0;->Q()V

    check-cast v4, LrX2;

    goto :goto_14

    :cond_1a
    move-object v4, v12

    :goto_14
    and-int/lit8 v10, p8, 0x20

    if-eqz v10, :cond_1b

    sget-object v10, LUm4;->a:LUm4;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v18, 0xc00

    const/16 v19, 0x7

    move-object/from16 v17, v6

    invoke-virtual/range {v10 .. v19}, LUm4;->a(JJJLEt0;II)LTm4;

    move-result-object v10

    and-int v1, v1, v20

    move-object v15, v2

    move v14, v3

    move-object/from16 v17, v4

    move-object v12, v10

    goto :goto_10

    :cond_1b
    move v10, v1

    move-object v15, v2

    move v14, v3

    move-object/from16 v17, v4

    move-object v12, v13

    :goto_15
    invoke-interface {v6}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1c

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.RadioButton (RadioButton.kt:73)"

    invoke-static {v0, v10, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1c
    const/4 v0, 0x0

    if-eqz v7, :cond_1d

    sget v1, LVm4;->e:F

    int-to-float v2, v5

    div-float/2addr v1, v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    goto :goto_16

    :cond_1d
    int-to-float v1, v0

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    :goto_16
    const/16 v2, 0x64

    const/4 v13, 0x0

    const/4 v3, 0x6

    invoke-static {v2, v0, v13, v3, v13}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v11, 0x30

    const/16 v16, 0x4

    move-object v4, v6

    move v5, v11

    move-object v11, v6

    move/from16 v6, v16

    invoke-static/range {v1 .. v6}, LJe;->d(FLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v6

    shr-int/lit8 v1, v10, 0x9

    and-int/lit8 v2, v1, 0xe

    shl-int/lit8 v3, v10, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-interface {v12, v14, v7, v11, v1}, LTm4;->a(ZZLEt0;I)LsP5;

    move-result-object v5

    const v1, 0x73baf562

    invoke-interface {v11, v1}, LEt0;->F(I)V

    if-eqz v8, :cond_1e

    sget-object v1, LgV2;->b0:LgV2$a;

    sget-object v2, LCb5;->b:LCb5$a;

    invoke-virtual {v2}, LCb5$a;->e()I

    move-result v2

    const/4 v10, 0x0

    sget v3, LVm4;->a:F

    const-wide/16 v18, 0x0

    const/16 v4, 0x36

    const/16 v16, 0x4

    move-object/from16 p2, v11

    move v11, v3

    move-object/from16 v20, v12

    move-object v3, v13

    move-wide/from16 v12, v18

    move/from16 v18, v14

    move-object/from16 v14, p2

    move-object/from16 v21, v15

    move v15, v4

    invoke-static/range {v10 .. v16}, Lwb5;->e(ZFJLEt0;II)Ly12;

    move-result-object v4

    invoke-static {v2}, LCb5;->h(I)LCb5;

    move-result-object v10

    move v11, v0

    move-object v0, v1

    move/from16 v1, p0

    move-object/from16 v2, v17

    move-object v12, v3

    move-object v3, v4

    move/from16 v4, v18

    move-object v13, v5

    move-object v5, v10

    move-object v10, v6

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, LGr5;->a(LgV2;ZLrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function0;)LgV2;

    move-result-object v0

    goto :goto_17

    :cond_1e
    move-object v10, v6

    move-object/from16 p2, v11

    move-object/from16 v20, v12

    move-object v12, v13

    move/from16 v18, v14

    move-object/from16 v21, v15

    move v11, v0

    move-object v13, v5

    sget-object v0, LgV2;->b0:LgV2$a;

    :goto_17
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    if-eqz v8, :cond_1f

    sget-object v1, LgV2;->b0:LgV2$a;

    invoke-static {v1}, Lg62;->c(LgV2;)LgV2;

    move-result-object v1

    goto :goto_18

    :cond_1f
    sget-object v1, LgV2;->b0:LgV2$a;

    :goto_18
    move-object/from16 v2, v21

    invoke-interface {v2, v1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v1

    invoke-interface {v1, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v0

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v0, v1, v11, v3, v12}, LBB5;->E(LgV2;LK9;ZILjava/lang/Object;)LgV2;

    move-result-object v0

    sget v1, LVm4;->b:F

    invoke-static {v0, v1}, LND3;->i(LgV2;F)LgV2;

    move-result-object v0

    sget v1, LVm4;->c:F

    invoke-static {v0, v1}, LBB5;->s(LgV2;F)LgV2;

    move-result-object v0

    const v1, 0x1e7b2b64

    move-object/from16 v3, p2

    invoke-interface {v3, v1}, LEt0;->F(I)V

    invoke-interface {v3, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v3, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface {v3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_20

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_21

    :cond_20
    new-instance v4, LVm4$a;

    invoke-direct {v4, v13, v10}, LVm4$a;-><init>(LsP5;LsP5;)V

    invoke-interface {v3, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_21
    invoke-interface {v3}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v4, v3, v11}, Lre0;->a(LgV2;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-static {}, LQt0;->Y()V

    :cond_22
    move-object v4, v2

    move-object/from16 v5, v17

    move/from16 v10, v18

    move-object/from16 v6, v20

    :goto_19
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_23

    goto :goto_1a

    :cond_23
    new-instance v12, LVm4$b;

    move-object v0, v12

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v4

    move v4, v10

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LVm4$b;-><init>(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;II)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1a
    return-void
.end method

.method public static final synthetic b()F
    .locals 1

    sget v0, LVm4;->d:F

    return v0
.end method

.method public static final synthetic c()F
    .locals 1

    sget v0, LVm4;->f:F

    return v0
.end method
