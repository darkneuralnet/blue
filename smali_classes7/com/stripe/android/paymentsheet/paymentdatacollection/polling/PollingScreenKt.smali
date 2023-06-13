.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u000b\u001a5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0011\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "viewModel",
        "LgV2;",
        "modifier",
        "",
        "PollingScreen",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LgV2;LEt0;II)V",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "uiState",
        "Lkotlin/Function0;",
        "onCancel",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "Lkotlin/time/Duration;",
        "remainingDuration",
        "ActivePolling-bz6L7rs",
        "(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "ActivePolling",
        "FailedPolling",
        "(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "",
        "rememberActivePollingMessage-KLykuaI",
        "(JLEt0;I)Ljava/lang/String;",
        "rememberActivePollingMessage",
        "ActivePollingScreenPreview",
        "(LEt0;I)V",
        "FailedPollingScreenPreview",
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
        "SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Duration.kt\nkotlin/time/Duration\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,261:1\n76#2:262\n76#2:266\n76#2:299\n78#3,2:263\n80#3:291\n84#3:298\n75#4:265\n76#4,11:267\n89#4:297\n460#5,13:278\n473#5,3:294\n36#5:300\n141#6,2:292\n1057#7,3:301\n1060#7,3:306\n705#8,2:304\n76#9:309\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt\n*L\n54#1:262\n103#1:266\n205#1:299\n103#1:263,2\n103#1:291\n103#1:298\n103#1:265\n103#1:267,11\n103#1:297\n103#1:278,13\n103#1:294,3\n207#1:300\n128#1:292,2\n207#1:301,3\n207#1:306,3\n208#1:304,2\n55#1:309\n*E\n"
    }
.end annotation


# direct methods
.method private static final ActivePolling-bz6L7rs(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-wide/from16 v1, p0

    move/from16 v5, p5

    const v0, 0x1c64813e

    move-object/from16 v3, p4

    invoke-interface {v3, v0}, LEt0;->u(I)LEt0;

    move-result-object v3

    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0xe

    if-nez v4, :cond_2

    invoke-interface {v3, v1, v2}, LEt0;->s(J)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-object/from16 v15, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x70

    move-object/from16 v15, p2

    if-nez v6, :cond_5

    invoke-interface {v3, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v5, 0x380

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-interface {v3, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v8, v4, 0x2db

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v3}, LEt0;->b()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v3}, LEt0;->k()V

    move-object v4, v7

    goto/16 :goto_a

    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    sget-object v6, LgV2;->b0:LgV2$a;

    move-object v14, v6

    goto :goto_8

    :cond_b
    move-object v14, v7

    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePolling (PollingScreen.kt:97)"

    invoke-static {v0, v4, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    sget-object v0, LK9;->a:LK9$a;

    invoke-virtual {v0}, LK9$a;->g()LK9$b;

    move-result-object v0

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->b()Llo$e;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v14, v7, v9, v8}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    sget v8, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_top:I

    const/4 v13, 0x0

    invoke-static {v8, v3, v13}, LH24;->a(ILEt0;I)F

    move-result v8

    sget v9, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_horizontal:I

    invoke-static {v9, v3, v13}, LH24;->a(ILEt0;I)F

    move-result v9

    invoke-static {v7, v9, v8}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v7

    const v8, -0x1cd0f17e

    invoke-interface {v3, v8}, LEt0;->F(I)V

    const/16 v8, 0x36

    invoke-static {v6, v0, v3, v8}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v0

    const v6, -0x4ee9b9da

    invoke-interface {v3, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v3, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v3, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v3, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_d

    invoke-static {}, Lyt0;->c()V

    :cond_d
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-interface {v3, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_9

    :cond_e
    invoke-interface {v3}, LEt0;->e()V

    :goto_9
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v0, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v11, v6, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v11, v8, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v11, v9, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v0, v3, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v3, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v3, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x70cf5578

    invoke-interface {v3, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v30, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    invoke-virtual/range {v30 .. v30}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->getExtended-D9Ej5fM()F

    move-result v10

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v12}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v6

    sget-object v12, LTM2;->a:LTM2;

    sget v11, LTM2;->b:I

    invoke-static {v12, v3, v11}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/uicore/StripeColors;->getAppBarIcon-0d7_KjU()J

    move-result-wide v7

    const/16 v16, 0x6

    const/16 v17, 0x4

    move-object v10, v3

    move v15, v11

    move/from16 v11, v16

    move-object/from16 v23, v14

    move-object v14, v12

    move/from16 v12, v17

    invoke-static/range {v6 .. v12}, LK74;->b(LgV2;JFLEt0;II)V

    sget v6, Lcom/stripe/android/paymentsheet/R$string;->upi_polling_header:I

    invoke-static {v6, v3, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v3, v15}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v7

    invoke-virtual {v7}, LGc6;->h()LG26;

    move-result-object v25

    sget-object v31, Lr06;->b:Lr06$a;

    invoke-virtual/range {v31 .. v31}, Lr06$a;->a()I

    move-result v24

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {v30 .. v30}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->getNormal-D9Ej5fM()F

    move-result v20

    const/16 v21, 0x7

    const/16 v22, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v7

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v33, v14

    move-object/from16 v32, v23

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move/from16 v34, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    invoke-static/range {v24 .. v24}, Lr06;->g(I)Lr06;

    move-result-object v18

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x30

    const/16 v28, 0x0

    const/16 v29, 0x7dfc

    move-object/from16 v26, v3

    invoke-static/range {v6 .. v29}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    and-int/lit8 v6, v4, 0xe

    invoke-static {v1, v2, v3, v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->rememberActivePollingMessage-KLykuaI(JLEt0;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v31 .. v31}, Lr06$a;->a()I

    move-result v18

    move-object/from16 v7, v33

    move/from16 v8, v34

    invoke-virtual {v7, v3, v8}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v7

    invoke-virtual {v7}, LGc6;->c()LG26;

    move-result-object v7

    invoke-virtual {v7}, LG26;->n()J

    move-result-wide v7

    invoke-static {v7, v8}, LN26;->b(J)V

    invoke-static {v7, v8}, LM26;->f(J)J

    move-result-wide v9

    invoke-static {v7, v8}, LM26;->h(J)F

    move-result v7

    const v8, 0x3fa66666    # 1.3f

    mul-float/2addr v7, v8

    invoke-static {v9, v10, v7}, LN26;->i(JF)J

    move-result-wide v19

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-virtual/range {v30 .. v30}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->getNormal-D9Ej5fM()F

    move-result v25

    const/16 v26, 0x7

    const/16 v27, 0x0

    move-object/from16 v21, v0

    invoke-static/range {v21 .. v27}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v7

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    invoke-static/range {v18 .. v18}, Lr06;->g(I)Lr06;

    move-result-object v18

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    const v29, 0xf9fc

    move-object/from16 v26, v3

    invoke-static/range {v6 .. v29}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function3;

    move-result-object v15

    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    const/high16 v4, 0x30000000

    or-int v17, v0, v4

    const/16 v18, 0x1fe

    move-object/from16 v6, p2

    move-object/from16 v16, v3

    invoke-static/range {v6 .. v18}, Lk70;->c(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    move-object/from16 v4, v32

    :goto_a
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_10

    goto :goto_b

    :cond_10
    new-instance v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$ActivePolling$2;

    move-object v0, v8

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$ActivePolling$2;-><init>(JLkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

.method private static final ActivePollingScreenPreview(LEt0;I)V
    .locals 8

    const v0, -0x30a388b3

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePollingScreenPreview (PollingScreen.kt:231)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->getLambda-6$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$ActivePollingScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$ActivePollingScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final FailedPolling(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x3141fc33

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v4

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0xe

    if-nez v5, :cond_2

    invoke-interface {v4, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_2
    move v5, v1

    :goto_1
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x70

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v4, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v7, p1

    :goto_4
    move v15, v5

    and-int/lit8 v5, v15, 0x5b

    const/16 v8, 0x12

    if-ne v5, v8, :cond_7

    invoke-interface {v4}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v4}, LEt0;->k()V

    move-object v3, v4

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v6, :cond_8

    sget-object v5, LgV2;->b0:LgV2$a;

    move-object/from16 v31, v5

    goto :goto_6

    :cond_8
    move-object/from16 v31, v7

    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling (PollingScreen.kt:138)"

    invoke-static {v3, v15, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    const/4 v5, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$1;

    invoke-direct {v3, v0, v15}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v6, 0x6712692

    const/4 v7, 0x1

    invoke-static {v4, v6, v7, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move/from16 v27, v15

    move v15, v3

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    sget-object v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->getLambda-4$paymentsheet_release()Lkotlin/jvm/functions/Function3;

    move-result-object v26

    shr-int/lit8 v3, v27, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0x180

    move/from16 v28, v3

    const/high16 v29, 0xc00000

    const v30, 0x1fffa

    move-object v3, v4

    move-object/from16 v4, v31

    move-object/from16 v27, v3

    invoke-static/range {v4 .. v30}, LVi5;->a(LgV2;LXi5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLhy5;FJJJJJLkotlin/jvm/functions/Function3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    move-object/from16 v7, v31

    :goto_7
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$2;

    invoke-direct {v4, v0, v7, v1, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$2;-><init>(Lkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method private static final FailedPollingScreenPreview(LEt0;I)V
    .locals 8

    const v0, 0x2a1078c4

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPollingScreenPreview (PollingScreen.kt:247)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;->getLambda-8$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPollingScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPollingScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const v0, 0x5764cf92

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_2

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p4, 0x70

    if-nez v4, :cond_5

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, p4, 0x380

    if-nez v5, :cond_8

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :cond_8
    :goto_5
    and-int/lit16 v5, v1, 0x2db

    const/16 v6, 0x92

    if-ne v5, v6, :cond_b

    invoke-interface {p3}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LEt0;->k()V

    :cond_a
    :goto_6
    move-object v4, p2

    goto/16 :goto_9

    :cond_b
    :goto_7
    if-eqz v4, :cond_c

    sget-object p2, LgV2;->b0:LgV2$a;

    :cond_c
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:72)"

    invoke-static {v0, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_d
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->getPollingState()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    move-result-object v0

    sget-object v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_f

    if-eq v0, v3, :cond_f

    const/4 v3, 0x3

    if-eq v0, v3, :cond_f

    if-eq v0, v2, :cond_e

    const v0, 0x52ad9508

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->Q()V

    goto :goto_8

    :cond_e
    const v0, 0x52ad9484

    invoke-interface {p3, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v1, v0, 0xe

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {p1, p2, p3, v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->FailedPolling(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-interface {p3}, LEt0;->Q()V

    goto :goto_8

    :cond_f
    const v0, 0x52ad93a7

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->getDurationRemaining-UwyO8pc()J

    move-result-wide v2

    and-int/lit8 v0, v1, 0x70

    and-int/lit16 v1, v1, 0x380

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-wide v1, v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->ActivePolling-bz6L7rs(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-interface {p3}, LEt0;->Q()V

    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    goto :goto_6

    :goto_9
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_10

    goto :goto_a

    :cond_10
    new-instance p3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$4;

    move-object v1, p3

    move-object v2, p0

    move-object v3, p1

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$4;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {p2, p3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LgV2;LEt0;II)V
    .locals 7

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5ddd1bd3

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_0

    sget-object p1, LgV2;->b0:LgV2$a;

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:49)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLifecycleOwner;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->getUiState()LtP5;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x8

    invoke-static {v1, v2, p2, v4, v3}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LLifecycleOwner;)V

    invoke-static {v0, v2, p2, v4}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->PollingScreen$lambda$0(LsP5;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$2;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$2;-><init>(Ljava/lang/Object;)V

    const v0, 0x3f2b851f    # 0.67f

    invoke-static {p1, v0}, LBB5;->i(LgV2;F)LgV2;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$3;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$3;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LgV2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final PollingScreen$lambda$0(LsP5;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    return-object p0
.end method

.method public static final synthetic access$ActivePolling-bz6L7rs(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->ActivePolling-bz6L7rs(JLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$ActivePollingScreenPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->ActivePollingScreenPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$FailedPolling(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->FailedPolling(Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$FailedPollingScreenPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->FailedPollingScreenPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    return-void
.end method

.method private static final rememberActivePollingMessage-KLykuaI(JLEt0;I)Ljava/lang/String;
    .locals 3

    const v0, -0xcd062c2

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.polling.rememberActivePollingMessage (PollingScreen.kt:201)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p3

    invoke-interface {p2, p3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/content/Context;

    invoke-static {p0, p1}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    const v1, 0x44faf204

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    invoke-static {p0, p1}, Lkotlin/time/Duration;->getInWholeMinutes-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1}, Lkotlin/time/Duration;->getSecondsComponent-impl(J)I

    move-result v2

    invoke-static {p0, p1}, Lkotlin/time/Duration;->getNanosecondsComponent-impl(J)I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    const/16 v2, 0x30

    invoke-static {p0, p1, v2}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->upi_polling_message:I

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {p3, p1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    const-string p0, "remember(remainingDurati\u2026age, remainingTime)\n    }"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object v1
.end method
