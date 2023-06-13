.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u0006\u001a!\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u0006\"\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "viewModel",
        "LgV2;",
        "modifier",
        "",
        "PaymentSheetScreen",
        "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V",
        "",
        "processing",
        "DismissKeyboardOnProcessing",
        "(ZLEt0;I)V",
        "PaymentSheetScreenContent",
        "Wallet",
        "",
        "PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG",
        "Ljava/lang/String;",
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
        "SMAP\nPaymentSheetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,190:1\n36#2:191\n460#2,13:217\n473#2,3:235\n460#2,13:259\n473#2,3:277\n1057#3,6:192\n74#4,6:198\n80#4:230\n84#4:239\n74#4,6:240\n80#4:272\n84#4:281\n75#5:204\n76#5,11:206\n89#5:238\n75#5:246\n76#5,11:248\n89#5:280\n76#6:205\n76#6:247\n154#7:231\n154#7:232\n154#7:233\n154#7:234\n154#7:273\n154#7:274\n154#7:275\n154#7:276\n76#8:282\n76#8:283\n76#8:284\n76#8:285\n76#8:286\n76#8:287\n76#8:288\n76#8:289\n76#8:290\n76#8:291\n76#8:292\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt\n*L\n64#1:191\n96#1:217,13\n96#1:235,3\n154#1:259,13\n154#1:277,3\n64#1:192,6\n96#1:198,6\n96#1:230\n96#1:239\n154#1:240,6\n154#1:272\n154#1:281\n96#1:204\n96#1:206,11\n96#1:238\n154#1:246\n154#1:248,11\n154#1:280\n96#1:205\n154#1:247\n103#1:231\n112#1:232\n118#1:233\n132#1:234\n160#1:273\n171#1:274\n172#1:275\n179#1:276\n39#1:282\n40#1:283\n75#1:284\n77#1:285\n78#1:286\n80#1:287\n81#1:288\n143#1:289\n147#1:290\n148#1:291\n149#1:292\n*E\n"
    }
.end annotation


# static fields
.field public static final PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG:Ljava/lang/String; = "PRIMARY_BUTTON"


# direct methods
.method private static final DismissKeyboardOnProcessing(ZLEt0;I)V
    .locals 4

    const v0, 0x240449a2

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v1, v1, 0xb

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.DismissKeyboardOnProcessing (PaymentSheetScreen.kt:59)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Lkv2;->a:Lkv2;

    sget v1, Lkv2;->c:I

    invoke-virtual {v0, p1, v1}, Lkv2;->b(LEt0;I)LnN5;

    move-result-object v0

    if-eqz p0, :cond_7

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v2, 0x44faf204

    invoke-interface {p1, v2}, LEt0;->F(I)V

    invoke-interface {p1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1;-><init>(LnN5;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/16 v0, 0x46

    invoke-static {v1, v3, p1, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :cond_7
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$DismissKeyboardOnProcessing$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$DismissKeyboardOnProcessing$2;-><init>(ZI)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final PaymentSheetScreen(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V
    .locals 7

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x56e8efaa

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

    const-string v2, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:34)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getContentVisible$paymentsheet_release()LtP5;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-static {v0, v1, p2, v2, v3}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getProcessing()LtP5;

    move-result-object v4

    invoke-static {v4, v1, p2, v2, v3}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreen$lambda$1(LsP5;)Z

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, p2, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->DismissKeyboardOnProcessing(ZLEt0;I)V

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    const v2, 0x1cd2c98e

    invoke-static {p2, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$2;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LsP5;)V

    const v0, -0x470f295c

    invoke-static {p2, v0, v3, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

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
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$3;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreen$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final PaymentSheetScreen$lambda$0(LsP5;)Z
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

.method private static final PaymentSheetScreen$lambda$1(LsP5;)Z
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

.method public static final PaymentSheetScreenContent(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V
    .locals 43

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "viewModel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x73f47183

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

    const-string v5, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:70)"

    invoke-static {v3, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->getShowLinkVerificationDialog()LtP5;

    move-result-object v3

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v10, 0x1

    invoke-static {v3, v12, v15, v13, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getHeaderText$paymentsheet_release()LEu1;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x2

    move-object v7, v15

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getBuyButtonState()LEu1;

    move-result-object v4

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCurrentScreen()LtP5;

    move-result-object v5

    invoke-static {v5, v12, v15, v13, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNotesText$paymentsheet_release()LtP5;

    move-result-object v5

    invoke-static {v5, v12, v15, v13, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v18

    sget v5, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_button_container_spacing_bottom:I

    const/4 v11, 0x0

    invoke-static {v5, v15, v11}, LH24;->a(ILEt0;I)F

    move-result v9

    sget v5, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_horizontal:I

    invoke-static {v5, v15, v11}, LH24;->a(ILEt0;I)F

    move-result v10

    const v5, 0x6365e899

    invoke-interface {v15, v5}, LEt0;->F(I)V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreenContent$lambda$3(LsP5;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v3

    new-instance v5, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$1;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$1;-><init>(Ljava/lang/Object;)V

    sget v6, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    invoke-static {v3, v5, v15, v6}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt;->LinkVerificationDialog(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;LEt0;I)V

    :cond_2
    invoke-interface {v15}, LEt0;->Q()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x7

    const/16 v19, 0x0

    move-object v5, v14

    move v13, v10

    move v10, v3

    move v3, v11

    move-object/from16 v11, v19

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

    invoke-static {v6, v7, v15, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

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

    if-nez v12, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v15, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
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

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v6, v15, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v5, 0x7ab4aae9

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const v5, -0x455f09d5

    invoke-interface {v15, v5}, LEt0;->F(I)V

    sget-object v5, LQm0;->a:LQm0;

    const v5, -0x74d91b8d

    invoke-interface {v15, v5}, LEt0;->F(I)V

    invoke-static/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreenContent$lambda$4(LsP5;)Ljava/lang/Integer;

    move-result-object v5

    const v6, 0x50dfd5f1

    invoke-interface {v15, v6}, LEt0;->F(I)V

    const/4 v6, 0x2

    if-nez v5, :cond_5

    const/4 v9, 0x0

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5, v15, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v5

    sget-object v19, LgV2;->b0:LgV2$a;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    int-to-float v7, v6

    invoke-static {v7}, Lk61;->g(F)F

    move-result v23

    const/16 v24, 0x7

    const/16 v25, 0x0

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v7, v13, v8, v6, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v7

    invoke-static {v5, v7, v15, v3, v3}, Lcom/stripe/android/ui/core/elements/H4TextKt;->H4Text(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_2
    invoke-interface {v15}, LEt0;->Q()V

    const/16 v5, 0x8

    invoke-static {v0, v9, v15, v5, v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V

    invoke-static/range {v17 .. v17}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreenContent$lambda$6(LsP5;)Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    move-result-object v7

    sget-object v10, LgV2;->b0:LgV2$a;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    int-to-float v11, v5

    invoke-static {v11}, Lk61;->g(F)F

    move-result v23

    const/16 v24, 0x7

    const/16 v25, 0x0

    move-object/from16 v19, v10

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v5

    const/16 v8, 0x38

    invoke-interface {v7, v0, v5, v15, v8}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->Content(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreenContent$lambda$5(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;->getErrorMessage()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;

    move-result-object v12

    goto :goto_3

    :cond_6
    move-object v12, v9

    :goto_3
    const v4, 0x50dfd7ad

    invoke-interface {v15, v4}, LEt0;->F(I)V

    if-nez v12, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;->getMessage()Ljava/lang/String;

    move-result-object v4

    int-to-float v5, v6

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v10, v6, v5}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v5

    invoke-static {v4, v5, v15, v3, v3}, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt;->ErrorMessage(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_4
    invoke-interface {v15}, LEt0;->Q()V

    sget-object v4, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$2$3;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$2$3;

    const-string v3, "PRIMARY_BUTTON"

    invoke-static {v10, v3}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x4

    move-object v7, v15

    invoke-static/range {v4 .. v9}, Lde;->a(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static/range {v18 .. v18}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreenContent$lambda$7(LsP5;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_8

    move-object/from16 v42, v14

    move-object/from16 v17, v15

    goto :goto_5

    :cond_8
    sget-object v3, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-static {v3, v15, v5}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v7

    invoke-virtual {v3, v15, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v3

    invoke-virtual {v3}, LGc6;->c()LG26;

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

    sget-object v3, Lr06;->b:Lr06$a;

    invoke-virtual {v3}, Lr06$a;->a()I

    move-result v3

    invoke-static {v3}, Lr06;->g(I)Lr06;

    move-result-object v35

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const v40, 0x3bfff

    const/16 v41, 0x0

    invoke-static/range {v16 .. v41}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v9

    const/16 v20, 0x0

    invoke-static {v11}, Lk61;->g(F)F

    move-result v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xd

    move-object/from16 v19, v10

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v3, 0x30

    const/16 v16, 0x1e4

    move-object/from16 v42, v14

    move-object v14, v15

    move-object/from16 v17, v15

    move v15, v3

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    :goto_5
    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->f()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-interface/range {v17 .. v17}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface/range {v17 .. v17}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_a

    goto :goto_6

    :cond_a
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$3;

    move-object/from16 v5, v42

    invoke-direct {v4, v0, v5, v1, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$PaymentSheetScreenContent$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;II)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method private static final PaymentSheetScreenContent$lambda$3(LsP5;)Z
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

.method private static final PaymentSheetScreenContent$lambda$4(LsP5;)Ljava/lang/Integer;
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

.method private static final PaymentSheetScreenContent$lambda$5(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    return-object p0
.end method

.method private static final PaymentSheetScreenContent$lambda$6(LsP5;)Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;
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

.method private static final PaymentSheetScreenContent$lambda$7(LsP5;)Ljava/lang/String;
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

.method public static final Wallet(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "viewModel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x221aab22

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v11

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_0

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object v12, v4

    goto :goto_0

    :cond_0
    move-object/from16 v12, p1

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.Wallet (PaymentSheetScreen.kt:138)"

    invoke-static {v3, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getWalletsContainerState$paymentsheet_release()LEu1;

    move-result-object v4

    new-instance v3, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;-><init>(ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x2

    move-object v7, v11

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentLauncher;->getEmailFlow()LEu1;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v8, 0x38

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getGooglePayButtonState()LEu1;

    move-result-object v4

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getButtonsEnabled()LEu1;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v15

    sget v4, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_horizontal:I

    const/4 v10, 0x0

    invoke-static {v4, v11, v10}, LH24;->a(ILEt0;I)F

    move-result v4

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$12(LsP5;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->getShouldShow()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v9, 0x0

    const/4 v5, 0x2

    const/4 v8, 0x0

    invoke-static {v12, v4, v9, v5, v8}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v4

    const v5, -0x1cd0f17e

    invoke-interface {v11, v5}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v6, LK9;->a:LK9$a;

    invoke-virtual {v6}, LK9$a;->j()LK9$b;

    move-result-object v6

    invoke-static {v5, v6, v11, v10}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v11, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v11, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v11, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v11, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v11}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v11}, LEt0;->h()V

    invoke-interface {v11}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v11, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v11}, LEt0;->e()V

    :goto_1
    invoke-interface {v11}, LEt0;->L()V

    invoke-static {v11}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v5, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v11}, LEt0;->q()V

    invoke-static {v11}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v11, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v11, v4}, LEt0;->F(I)V

    const v4, -0x455f09d5

    invoke-interface {v11, v4}, LEt0;->F(I)V

    sget-object v4, LQm0;->a:LQm0;

    const v4, -0x319d5b13

    invoke-interface {v11, v4}, LEt0;->F(I)V

    const v4, -0xdfcfae6

    invoke-interface {v11, v4}, LEt0;->F(I)V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$12(LsP5;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->getShowGooglePay()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v14}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$14(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonContainerFragmentKt;->convert(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    invoke-static {v15}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$15(LsP5;)Z

    move-result v5

    new-instance v6, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$1$1;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$1$1;-><init>(Ljava/lang/Object;)V

    sget-object v16, LgV2;->b0:LgV2$a;

    const/16 v17, 0x0

    const/4 v7, 0x7

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v7

    const/16 v9, 0xc00

    const/16 v16, 0x0

    move-object v8, v11

    const/4 v1, 0x0

    move/from16 v10, v16

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-interface {v11}, LEt0;->Q()V

    const v4, -0xdfcf988

    invoke-interface {v11, v4}, LEt0;->F(I)V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$12(LsP5;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->getShowLink()Z

    move-result v4

    const/4 v10, 0x1

    if-eqz v4, :cond_6

    invoke-static {v13}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$13(LsP5;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v15}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$15(LsP5;)Z

    move-result v5

    new-instance v6, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$1$2;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$1$2;-><init>(Ljava/lang/Object;)V

    sget-object v7, LgV2;->b0:LgV2$a;

    const/4 v13, 0x0

    invoke-static {v7, v1, v10, v13}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v15

    const/16 v16, 0x0

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v21, 0x0

    invoke-static/range {v15 .. v21}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v7, 0x30

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v1, v7}, LBB5;->r(LgV2;F)LgV2;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v1, 0x0

    move-object v8, v11

    move v15, v10

    move v10, v1

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    goto :goto_4

    :cond_6
    move v15, v10

    const/4 v13, 0x0

    :goto_4
    invoke-interface {v11}, LEt0;->Q()V

    invoke-static {v14}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$14(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;->getErrorMessage()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;

    move-result-object v8

    goto :goto_5

    :cond_7
    move-object v8, v13

    :goto_5
    const v1, -0xdfcf7c2

    invoke-interface {v11, v1}, LEt0;->F(I)V

    if-nez v8, :cond_8

    const/4 v5, 0x0

    goto :goto_6

    :cond_8
    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v5, 0x3

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    int-to-float v6, v15

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v4, v6, v5}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v1, v4, v11, v5, v5}, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt;->ErrorMessage(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_6
    invoke-interface {v11}, LEt0;->Q()V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->Wallet$lambda$12(LsP5;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;->getDividerTextResource()I

    move-result v1

    invoke-static {v1, v11, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11, v5, v5}, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt;->GooglePayDividerUi(Ljava/lang/String;LEt0;II)V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->f()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    :cond_9
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$2;

    move/from16 v4, p3

    invoke-direct {v3, v0, v12, v4, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$Wallet$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;II)V

    invoke-interface {v1, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final Wallet$lambda$12(LsP5;)Lcom/stripe/android/paymentsheet/state/WalletsContainerState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/state/WalletsContainerState;

    return-object p0
.end method

.method private static final Wallet$lambda$13(LsP5;)Ljava/lang/String;
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

.method private static final Wallet$lambda$14(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    return-object p0
.end method

.method private static final Wallet$lambda$15(LsP5;)Z
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

.method public static final synthetic access$DismissKeyboardOnProcessing(ZLEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->DismissKeyboardOnProcessing(ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$PaymentSheetScreen$lambda$0(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->PaymentSheetScreen$lambda$0(LsP5;)Z

    move-result p0

    return p0
.end method
