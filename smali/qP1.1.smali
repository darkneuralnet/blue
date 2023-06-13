.class public final LqP1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aI\u0010\n\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onClick",
        "LgV2;",
        "modifier",
        "",
        "enabled",
        "LrX2;",
        "interactionSource",
        "content",
        "a",
        "(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "Lk61;",
        "F",
        "RippleRadius",
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
        "SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n25#2:131\n460#2,13:156\n473#2,3:171\n25#2:176\n460#2,13:201\n473#2,3:216\n1114#3,6:132\n1114#3,6:177\n68#4,5:138\n73#4:169\n77#4:175\n68#4,5:183\n73#4:214\n77#4:220\n75#5:143\n76#5,11:145\n89#5:174\n75#5:188\n76#5,11:190\n89#5:219\n76#6:144\n76#6:170\n76#6:189\n76#6:215\n154#7:221\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n63#1:131\n66#1:156,13\n66#1:171,3\n107#1:176\n110#1:201,13\n110#1:216,3\n63#1:132,6\n107#1:177,6\n66#1:138,5\n66#1:169\n66#1:175\n110#1:183,5\n110#1:214\n110#1:220\n66#1:143\n66#1:145,11\n66#1:174\n110#1:188\n110#1:190,11\n110#1:219\n66#1:144\n78#1:170\n110#1:189\n123#1:215\n129#1:221\n*E\n"
    }
.end annotation


# static fields
.field public static final a:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LqP1;->a:F

    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Z",
            "LrX2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p4

    move/from16 v11, p6

    const-string v0, "onClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x69eb252

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    if-nez v1, :cond_2

    invoke-interface {v12, v9}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v11, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v12, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v3, p1

    :goto_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v11, 0x380

    if-nez v5, :cond_8

    move/from16 v5, p2

    invoke-interface {v12, v5}, LEt0;->o(Z)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v1, v6

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v5, p2

    :goto_7
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v7, v11, 0x1c00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v12, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_8

    :cond_a
    const/16 v8, 0x400

    :goto_8
    or-int/2addr v1, v8

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v7, p3

    :goto_a
    and-int/lit8 v8, p7, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_c

    :cond_c
    const v8, 0xe000

    and-int/2addr v8, v11

    if-nez v8, :cond_e

    invoke-interface {v12, v10}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_b

    :cond_d
    const/16 v8, 0x2000

    :goto_b
    or-int/2addr v1, v8

    :cond_e
    :goto_c
    move v13, v1

    const v1, 0xb6db

    and-int/2addr v1, v13

    const/16 v8, 0x2492

    if-ne v1, v8, :cond_10

    invoke-interface {v12}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_d

    :cond_f
    invoke-interface {v12}, LEt0;->k()V

    move-object v2, v3

    move v3, v5

    move-object v4, v7

    goto/16 :goto_13

    :cond_10
    :goto_d
    if-eqz v2, :cond_11

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v14, v1

    goto :goto_e

    :cond_11
    move-object v14, v3

    :goto_e
    if-eqz v4, :cond_12

    const/16 v16, 0x1

    goto :goto_f

    :cond_12
    move/from16 v16, v5

    :goto_f
    if-eqz v6, :cond_14

    const v1, -0x1d58f75c

    invoke-interface {v12, v1}, LEt0;->F(I)V

    invoke-interface {v12}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_13

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object v1

    invoke-interface {v12, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_13
    invoke-interface {v12}, LEt0;->Q()V

    check-cast v1, LrX2;

    move-object/from16 v17, v1

    goto :goto_10

    :cond_14
    move-object/from16 v17, v7

    :goto_10
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.IconButton (IconButton.kt:58)"

    invoke-static {v0, v13, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_15
    invoke-static {v14}, Lg62;->c(LgV2;)LgV2;

    move-result-object v0

    sget-object v1, LCb5;->b:LCb5$a;

    invoke-virtual {v1}, LCb5$a;->a()I

    move-result v8

    const/4 v1, 0x0

    sget v2, LqP1;->a:F

    const-wide/16 v3, 0x0

    const/16 v6, 0x36

    const/4 v7, 0x4

    move-object v5, v12

    invoke-static/range {v1 .. v7}, Lwb5;->e(ZFJLEt0;II)Ly12;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v8}, LCb5;->h(I)LCb5;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object/from16 v1, v17

    move/from16 v3, v16

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v8}, Lak0;->c(LgV2;LrX2;Ly12;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v0

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v1

    const v2, 0x2bb5b5d7

    invoke-interface {v12, v2}, LEt0;->F(I)V

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v1, v2, v12, v3}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v4, -0x4ee9b9da

    invoke-interface {v12, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v12, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v12, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v12, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v12}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_16

    invoke-static {}, Lyt0;->c()V

    :cond_16
    invoke-interface {v12}, LEt0;->h()V

    invoke-interface {v12}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_17

    invoke-interface {v12, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_11

    :cond_17
    invoke-interface {v12}, LEt0;->e()V

    :goto_11
    invoke-interface {v12}, LEt0;->L()V

    invoke-static {v12}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v8, v1, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v6, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v12}, LEt0;->q()V

    invoke-static {v12}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v1, v12, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v12, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    if-eqz v16, :cond_18

    const v0, 0x2cea5948

    invoke-interface {v12, v0}, LEt0;->F(I)V

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    invoke-interface {v12, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    goto :goto_12

    :cond_18
    const v0, 0x2cea5962

    invoke-interface {v12, v0}, LEt0;->F(I)V

    sget-object v0, LWz0;->a:LWz0;

    invoke-virtual {v0, v12, v3}, LWz0;->b(LEt0;I)F

    move-result v0

    :goto_12
    invoke-interface {v12}, LEt0;->Q()V

    const/4 v1, 0x1

    new-array v1, v1, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v3, v0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, v1, v2

    shr-int/lit8 v0, v13, 0x9

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    invoke-static {v1, v10, v12, v0}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->f()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LQt0;->Y()V

    :cond_19
    move-object v2, v14

    move/from16 v3, v16

    move-object/from16 v4, v17

    :goto_13
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_1a

    goto :goto_14

    :cond_1a
    new-instance v12, LqP1$a;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LqP1$a;-><init>(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v8, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_14
    return-void
.end method
