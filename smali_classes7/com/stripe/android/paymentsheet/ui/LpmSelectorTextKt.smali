.class public final Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001aA\u0010\r\u001a\u00020\n2\n\u0008\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "icon",
        "",
        "text",
        "Lpm0;",
        "textColor",
        "LgV2;",
        "modifier",
        "",
        "isEnabled",
        "",
        "LpmSelectorText-T042LqI",
        "(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V",
        "LpmSelectorText",
        "paymentsheet_release"
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
        "SMAP\nLpmSelectorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmSelectorText.kt\ncom/stripe/android/paymentsheet/ui/LpmSelectorTextKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n75#2,6:47\n81#2:79\n85#2:85\n75#3:53\n76#3,11:55\n89#3:84\n76#4:54\n460#5,13:66\n473#5,3:81\n154#6:80\n*S KotlinDebug\n*F\n+ 1 LpmSelectorText.kt\ncom/stripe/android/paymentsheet/ui/LpmSelectorTextKt\n*L\n25#1:47,6\n25#1:79\n25#1:85\n25#1:53\n25#1:55,11\n25#1:84\n25#1:54\n25#1:66,13\n25#1:81,3\n31#1:80\n*E\n"
    }
.end annotation


# direct methods
.method public static final LpmSelectorText-T042LqI(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V
    .locals 27

    move-object/from16 v2, p1

    move-object/from16 v3, p4

    move/from16 v0, p5

    move/from16 v13, p7

    const-string v1, "text"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "modifier"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x1c0e1d6a

    move-object/from16 v4, p6

    invoke-interface {v4, v1}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v4, p8, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v7, v13, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v13, 0xe

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v14, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v13

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v13

    :goto_1
    and-int/lit8 v9, p8, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v13, 0x70

    if-nez v9, :cond_5

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, p8, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v8, v8, 0x180

    move-wide/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v13, 0x380

    move-wide/from16 v11, p2

    if-nez v9, :cond_8

    invoke-interface {v14, v11, v12}, LEt0;->s(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v8, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v13, 0x1c00

    if-nez v9, :cond_b

    invoke-interface {v14, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v8, v9

    :cond_b
    :goto_7
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_9

    :cond_c
    const v9, 0xe000

    and-int/2addr v9, v13

    if-nez v9, :cond_e

    invoke-interface {v14, v0}, LEt0;->o(Z)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v8, v9

    :cond_e
    :goto_9
    move v15, v8

    const v8, 0xb6db

    and-int/2addr v8, v15

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_10

    invoke-interface {v14}, LEt0;->b()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v14}, LEt0;->k()V

    move-object v1, v7

    move-object/from16 v26, v14

    goto/16 :goto_13

    :cond_10
    :goto_a
    if-eqz v4, :cond_11

    const/16 v24, 0x0

    goto :goto_b

    :cond_11
    move-object/from16 v24, v7

    :goto_b
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_12

    const/4 v4, -0x1

    const-string v7, "com.stripe.android.paymentsheet.ui.LpmSelectorText (LpmSelectorText.kt:17)"

    invoke-static {v1, v15, v4, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_12
    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->h()LK9$c;

    move-result-object v1

    shr-int/lit8 v4, v15, 0x9

    and-int/lit8 v4, v4, 0xe

    or-int/lit16 v4, v4, 0x180

    const v7, 0x2952b718

    invoke-interface {v14, v7}, LEt0;->F(I)V

    sget-object v7, Llo;->a:Llo;

    invoke-virtual {v7}, Llo;->f()Llo$d;

    move-result-object v7

    shr-int/lit8 v9, v4, 0x3

    and-int/lit8 v16, v9, 0xe

    and-int/lit8 v9, v9, 0x70

    or-int v9, v16, v9

    invoke-static {v7, v1, v14, v9}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v1

    shl-int/lit8 v7, v4, 0x3

    and-int/lit8 v7, v7, 0x70

    const v9, -0x4ee9b9da

    invoke-interface {v14, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v14, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v14, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static/range {p4 .. p4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v6

    shl-int/lit8 v7, v7, 0x9

    and-int/lit16 v7, v7, 0x1c00

    or-int/lit8 v7, v7, 0x6

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v2

    instance-of v2, v2, Llm;

    if-nez v2, :cond_13

    invoke-static {}, Lyt0;->c()V

    :cond_13
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v14, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_c

    :cond_14
    invoke-interface {v14}, LEt0;->e()V

    :goto_c
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v2, v1, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v9, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v8, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v2, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    shr-int/lit8 v2, v7, 0x3

    and-int/lit8 v2, v2, 0x70

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v1, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v14, v1}, LEt0;->F(I)V

    shr-int/lit8 v1, v7, 0x9

    and-int/lit8 v1, v1, 0xe

    const v2, -0x286e2e7f

    invoke-interface {v14, v2}, LEt0;->F(I)V

    and-int/lit8 v1, v1, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_16

    invoke-interface {v14}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_d

    :cond_15
    invoke-interface {v14}, LEt0;->k()V

    move-object/from16 v26, v14

    goto/16 :goto_12

    :cond_16
    :goto_d
    sget-object v1, Lad5;->a:Lad5;

    shr-int/lit8 v1, v4, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    const v2, 0x61715afa

    invoke-interface {v14, v2}, LEt0;->F(I)V

    and-int/lit8 v1, v1, 0x51

    const/16 v2, 0x10

    if-ne v1, v2, :cond_18

    invoke-interface {v14}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_e

    :cond_17
    invoke-interface {v14}, LEt0;->k()V

    move-object/from16 v26, v14

    goto/16 :goto_11

    :cond_18
    :goto_e
    const v1, 0x68d67b92

    invoke-interface {v14, v1}, LEt0;->F(I)V

    if-nez v24, :cond_19

    goto :goto_f

    :cond_19
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v2, v4, v5, v7, v6}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v6

    const/4 v2, 0x0

    invoke-static {v1, v14, v2}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v4

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v1, v14, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->i()J

    move-result-wide v7

    const/4 v5, 0x0

    const/16 v10, 0x1b8

    const/4 v1, 0x0

    move-object v9, v14

    move v11, v1

    invoke-static/range {v4 .. v11}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    :goto_f
    invoke-interface {v14}, LEt0;->Q()V

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v1, v14, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->f()LG26;

    move-result-object v25

    if-eqz v0, :cond_1a

    move-wide/from16 v19, p2

    move v2, v15

    goto :goto_10

    :cond_1a
    const v17, 0x3f19999a    # 0.6f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xe

    const/16 v22, 0x0

    move v2, v15

    move-wide/from16 v15, p2

    invoke-static/range {v15 .. v22}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v19, v4

    :goto_10
    sget-object v1, Ln26;->a:Ln26$a;

    invoke-virtual {v1}, Ln26$a;->b()I

    move-result v15

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v26, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v21, v2, 0xe

    const/16 v22, 0xc30

    const/16 v23, 0x57fa

    move-object/from16 v0, p1

    move-wide/from16 v2, v19

    move-object/from16 v19, v25

    move-object/from16 v20, v26

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    :goto_11
    invoke-interface/range {v26 .. v26}, LEt0;->Q()V

    :goto_12
    invoke-interface/range {v26 .. v26}, LEt0;->Q()V

    invoke-interface/range {v26 .. v26}, LEt0;->Q()V

    invoke-interface/range {v26 .. v26}, LEt0;->f()V

    invoke-interface/range {v26 .. v26}, LEt0;->Q()V

    invoke-interface/range {v26 .. v26}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LQt0;->Y()V

    :cond_1b
    move-object/from16 v1, v24

    :goto_13
    invoke-interface/range {v26 .. v26}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_1c

    goto :goto_14

    :cond_1c
    new-instance v10, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;

    move-object v0, v10

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;-><init>(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZII)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_14
    return-void
.end method
