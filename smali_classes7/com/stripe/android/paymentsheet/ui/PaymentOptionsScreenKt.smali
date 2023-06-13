.class public final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;",
        "viewModel",
        "LgV2;",
        "modifier",
        "",
        "PaymentOptionsScreen",
        "(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V",
        "PaymentOptionsScreenContent",
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
        "SMAP\nPaymentOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,96:1\n74#2,6:97\n80#2:129\n84#2:138\n75#3:103\n76#3,11:105\n89#3:137\n76#4:104\n460#5,13:116\n473#5,3:134\n154#6:130\n154#6:131\n154#6:132\n154#6:133\n76#7:139\n76#7:140\n76#7:141\n76#7:142\n76#7:143\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt\n*L\n53#1:97,6\n53#1:129\n53#1:138\n53#1:103\n53#1:105,11\n53#1:137\n53#1:104\n53#1:116,13\n53#1:134,3\n67#1:130\n68#1:131\n77#1:132\n91#1:133\n44#1:139\n45#1:140\n47#1:141\n48#1:142\n50#1:143\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentOptionsScreen(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V
    .locals 7

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1a24622b

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

    const-string v2, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreen (PaymentOptionsScreen.kt:25)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;)V

    const v1, 0x5294410f

    const/4 v2, 0x1

    invoke-static {p2, v1, v2, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;)V

    const v3, 0x1cfda5a5

    invoke-static {p2, v3, v2, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    shl-int/lit8 v0, p3, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v5, v0, 0x36

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;->PaymentSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$3;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final PaymentOptionsScreenContent(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V
    .locals 42

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "viewModel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x14660020

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_0

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object v14, v4

    goto :goto_0

    :cond_0
    move-object/from16 v14, p1

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreenContent (PaymentOptionsScreen.kt:39)"

    invoke-static {v3, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getHeaderText$paymentsheet_release()LEu1;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x2

    move-object v7, v15

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCurrentScreen()LtP5;

    move-result-object v4

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v11, 0x1

    invoke-static {v4, v12, v15, v13, v11}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->getError$paymentsheet_release()LtP5;

    move-result-object v4

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNotesText$paymentsheet_release()LtP5;

    move-result-object v5

    invoke-static {v5, v12, v15, v13, v11}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/LinkHandler;->getShowLinkVerificationDialog()LtP5;

    move-result-object v5

    invoke-static {v5, v12, v15, v13, v11}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v18

    sget v5, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_button_container_spacing_bottom:I

    const/4 v10, 0x0

    invoke-static {v5, v15, v10}, LH24;->a(ILEt0;I)F

    move-result v9

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v19, 0x7

    const/16 v20, 0x0

    move-object v5, v14

    move v13, v10

    move/from16 v10, v19

    move-object/from16 v11, v20

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v5

    const v6, -0x1cd0f17e

    invoke-interface {v15, v6}, LEt0;->F(I)V

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->g()Llo$l;

    move-result-object v6

    sget-object v7, LK9;->a:LK9$a;

    invoke-virtual {v7}, LK9$a;->j()LK9$b;

    move-result-object v7

    invoke-static {v6, v7, v15, v13}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v6

    const v7, -0x4ee9b9da

    invoke-interface {v15, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v15, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v15, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v15}, LEt0;->e()V

    :goto_1
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v6, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v7, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v8, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v9, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v6, v15, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v5, 0x7ab4aae9

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const v5, -0x455f09d5

    invoke-interface {v15, v5}, LEt0;->F(I)V

    sget-object v5, LQm0;->a:LQm0;

    const v5, 0x5a2a8596

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const v5, 0xa6ff4aa

    invoke-interface {v15, v5}, LEt0;->F(I)V

    invoke-static/range {v18 .. v18}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent$lambda$4(LsP5;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1;-><init>(Ljava/lang/Object;)V

    sget v7, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    invoke-static {v5, v6, v15, v7}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt;->LinkVerificationDialog(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;LEt0;I)V

    :cond_4
    invoke-interface {v15}, LEt0;->Q()V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent$lambda$0(LsP5;)Ljava/lang/Integer;

    move-result-object v3

    const v5, 0xa6ff5a4

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const/16 v5, 0x30

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3, v15, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    sget-object v22, LgV2;->b0:LgV2$a;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    int-to-float v8, v7

    invoke-static {v8}, Lk61;->g(F)F

    move-result v26

    const/16 v27, 0x7

    const/16 v28, 0x0

    invoke-static/range {v22 .. v28}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v8

    const/16 v9, 0x14

    int-to-float v9, v9

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    const/4 v10, 0x0

    invoke-static {v8, v9, v6, v7, v10}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v8

    invoke-static {v3, v8, v15, v5, v13}, Lcom/stripe/android/ui/core/elements/H4TextKt;->H4Text(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_2
    invoke-interface {v15}, LEt0;->Q()V

    invoke-static/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent$lambda$1(LsP5;)Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    move-result-object v3

    const/16 v8, 0x40

    invoke-static {v3, v0, v15, v8}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreenKt;->Content(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEt0;I)V

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent$lambda$2(LsP5;)Ljava/lang/String;

    move-result-object v3

    const v4, 0xa6ff6ce

    invoke-interface {v15, v4}, LEt0;->F(I)V

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    sget-object v4, LgV2;->b0:LgV2$a;

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v4, v6, v7, v8, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static {v3, v4, v15, v5, v13}, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt;->ErrorMessage(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_3
    invoke-interface {v15}, LEt0;->Q()V

    sget-object v4, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4;

    sget-object v3, LgV2;->b0:LgV2$a;

    const-string v5, "PRIMARY_BUTTON"

    invoke-static {v3, v5}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x4

    move-object v7, v15

    invoke-static/range {v4 .. v9}, Lde;->a(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static/range {v17 .. v17}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent$lambda$3(LsP5;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    move-object v3, v14

    move-object/from16 v17, v15

    goto/16 :goto_4

    :cond_7
    sget-object v5, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v5, v15, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v12

    invoke-virtual {v5, v15, v6}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->c()LG26;

    move-result-object v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    sget-object v5, Lr06;->b:Lr06$a;

    invoke-virtual {v5}, Lr06$a;->a()I

    move-result v5

    invoke-static {v5}, Lr06;->g(I)Lr06;

    move-result-object v35

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const v40, 0x3bfff

    const/16 v41, 0x0

    invoke-static/range {v16 .. v41}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v16

    const/4 v6, 0x0

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v11, 0x0

    move-object v5, v3

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x30

    const/16 v19, 0x1e4

    move-wide v7, v12

    move-object/from16 v9, v16

    move v12, v3

    move-object/from16 v13, v17

    move-object v3, v14

    move-object v14, v15

    move-object/from16 v17, v15

    move/from16 v15, v18

    move/from16 v16, v19

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    :goto_4
    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->f()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface/range {v17 .. v17}, LEt0;->w()LWm5;

    move-result-object v4

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$2;

    invoke-direct {v5, v0, v3, v1, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreenContent$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;II)V

    invoke-interface {v4, v5}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final PaymentOptionsScreenContent$lambda$0(LsP5;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final PaymentOptionsScreenContent$lambda$1(LsP5;)Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    return-object p0
.end method

.method private static final PaymentOptionsScreenContent$lambda$2(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final PaymentOptionsScreenContent$lambda$3(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final PaymentOptionsScreenContent$lambda$4(LsP5;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
