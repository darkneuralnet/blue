.class public final Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001aW\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "",
        "automationTestTag",
        "",
        "isChecked",
        "label",
        "isEnabled",
        "Lkotlin/Function1;",
        "",
        "onValueChange",
        "CheckboxElementUI",
        "(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V",
        "stripe-ui-core_release"
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
        "SMAP\nCheckboxElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckboxElementUI.kt\ncom/stripe/android/uicore/elements/CheckboxElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:112\n50#3:71\n49#3:72\n460#3,13:98\n473#3,3:113\n1057#4,6:73\n75#5,6:79\n81#5:111\n85#5:117\n75#6:85\n76#6,11:87\n89#6:116\n76#7:86\n*S KotlinDebug\n*F\n+ 1 CheckboxElementUI.kt\ncom/stripe/android/uicore/elements/CheckboxElementUIKt\n*L\n40#1:70\n63#1:112\n41#1:71\n41#1:72\n38#1:98,13\n38#1:113,3\n41#1:73,6\n38#1:79,6\n38#1:111\n38#1:117\n38#1:85\n38#1:87,11\n38#1:116\n38#1:86\n*E\n"
    }
.end annotation


# direct methods
.method public static final CheckboxElementUI(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p5

    move/from16 v7, p7

    const-string v0, "onValueChange"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x546ea45b

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v7, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0xe

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v7

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v7

    :goto_1
    and-int/lit8 v8, p8, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v7, 0x70

    if-nez v9, :cond_5

    move-object/from16 v9, p1

    invoke-interface {v1, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v9, p1

    :goto_4
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v11, v7, 0x380

    if-nez v11, :cond_8

    move/from16 v11, p2

    invoke-interface {v1, v11}, LEt0;->o(Z)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v5, v12

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v11, p2

    :goto_7
    and-int/lit8 v12, p8, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v13, v7, 0x1c00

    if-nez v13, :cond_b

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_8

    :cond_a
    const/16 v14, 0x400

    :goto_8
    or-int/2addr v5, v14

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v13, p3

    :goto_a
    and-int/lit8 v14, p8, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_c

    :cond_c
    const v15, 0xe000

    and-int/2addr v15, v7

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v1, v15}, LEt0;->o(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_b

    :cond_d
    const/16 v16, 0x2000

    :goto_b
    or-int v5, v5, v16

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v15, p4

    :goto_d
    and-int/lit8 v16, p8, 0x20

    if-eqz v16, :cond_f

    const/high16 v16, 0x30000

    :goto_e
    or-int v5, v5, v16

    goto :goto_f

    :cond_f
    const/high16 v16, 0x70000

    and-int v16, v7, v16

    if-nez v16, :cond_11

    invoke-interface {v1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v16, 0x10000

    goto :goto_e

    :cond_11
    :goto_f
    const v16, 0x5b6db

    and-int v3, v5, v16

    const v0, 0x12492

    if-ne v3, v0, :cond_13

    invoke-interface {v1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_10

    :cond_12
    invoke-interface {v1}, LEt0;->k()V

    move-object v2, v9

    move v3, v11

    move-object v8, v13

    move v5, v15

    goto/16 :goto_17

    :cond_13
    :goto_10
    if-eqz v2, :cond_14

    sget-object v0, LgV2;->b0:LgV2$a;

    goto :goto_11

    :cond_14
    move-object v0, v4

    :goto_11
    if-eqz v8, :cond_15

    const-string v2, ""

    goto :goto_12

    :cond_15
    move-object v2, v9

    :goto_12
    const/4 v3, 0x0

    if-eqz v10, :cond_16

    move v4, v3

    goto :goto_13

    :cond_16
    move v4, v11

    :goto_13
    const/4 v8, 0x0

    if-eqz v12, :cond_17

    move-object v13, v8

    :cond_17
    if-eqz v14, :cond_18

    move v15, v3

    :cond_18
    invoke-static {}, LQt0;->O()Z

    move-result v9

    if-eqz v9, :cond_19

    const/4 v9, -0x1

    const-string v10, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:21)"

    const v11, 0x546ea45b

    invoke-static {v11, v5, v9, v10}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_19
    if-eqz v4, :cond_1a

    sget v9, Lcom/stripe/android/uicore/R$string;->selected:I

    goto :goto_14

    :cond_1a
    sget v9, Lcom/stripe/android/uicore/R$string;->not_selected:I

    :goto_14
    invoke-static {v9, v1, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x4

    int-to-float v14, v10

    invoke-static {v14}, Lk61;->g(F)F

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v0, v11, v10, v12, v8}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v10

    shr-int/lit8 v11, v5, 0x3

    const v3, 0x1e7b2b64

    invoke-interface {v1, v3}, LEt0;->F(I)V

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v1, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v16

    or-int v3, v3, v16

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_1b

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_1c

    :cond_1b
    new-instance v8, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;

    invoke-direct {v8, v2, v9}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1c
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    const/4 v9, 0x0

    invoke-static {v10, v9, v8, v12, v3}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v8

    sget-object v9, LCb5;->b:LCb5$a;

    invoke-virtual {v9}, LCb5$a;->b()I

    move-result v9

    invoke-static {v9}, LCb5;->h(I)LCb5;

    move-result-object v9

    invoke-static {v8, v4, v15, v9, v6}, Lm56;->b(LgV2;ZZLCb5;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9, v12, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v16, LK9;->a:LK9$a;

    invoke-virtual/range {v16 .. v16}, LK9$a;->h()LK9$c;

    move-result-object v8

    const v9, 0x2952b718

    invoke-interface {v1, v9}, LEt0;->F(I)V

    sget-object v9, Llo;->a:Llo;

    invoke-virtual {v9}, Llo;->f()Llo$d;

    move-result-object v9

    const/16 v10, 0x30

    invoke-static {v9, v8, v1, v10}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v8

    const v9, -0x4ee9b9da

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v1, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    move-object/from16 p6, v0

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    move-object/from16 v18, v2

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v2

    instance-of v2, v2, Llm;

    if-nez v2, :cond_1d

    invoke-static {}, Lyt0;->c()V

    :cond_1d
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v1, v0}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_15

    :cond_1e
    invoke-interface {v1}, LEt0;->e()V

    :goto_15
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v8, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v9, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v12, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v10, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v0, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v2, 0x6843e977

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    shr-int/lit8 v2, v5, 0x6

    and-int/lit8 v2, v2, 0xe

    const/16 v3, 0x30

    or-int/2addr v2, v3

    and-int/lit16 v3, v11, 0x1c00

    or-int/2addr v2, v3

    const/4 v3, 0x4

    move v8, v4

    move v11, v15

    move-object v12, v1

    move-object/from16 v19, v13

    move v13, v2

    move v2, v14

    move v14, v3

    invoke-static/range {v8 .. v14}, Lcom/stripe/android/uicore/elements/menu/CheckboxKt;->Checkbox(ZLkotlin/jvm/functions/Function1;LgV2;ZLEt0;II)V

    move-object/from16 v8, v19

    if-nez v8, :cond_1f

    goto :goto_16

    :cond_1f
    sget-object v19, LgV2;->b0:LgV2$a;

    invoke-static {v2}, Lk61;->g(F)F

    move-result v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v25, 0x0

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LK9$a;->h()LK9$c;

    move-result-object v3

    invoke-interface {v0, v2, v3}, LZc5;->c(LgV2;LK9$c;)LgV2;

    move-result-object v0

    shr-int/lit8 v2, v5, 0x9

    and-int/lit8 v2, v2, 0xe

    const/4 v3, 0x0

    invoke-static {v8, v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_16
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LQt0;->Y()V

    :cond_20
    move v3, v4

    move v5, v15

    move-object/from16 v2, v18

    move-object/from16 v4, p6

    :goto_17
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_21

    goto :goto_18

    :cond_21
    new-instance v10, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$3;

    move-object v0, v10

    move-object v1, v4

    move-object v4, v8

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$3;-><init>(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_18
    return-void
.end method
