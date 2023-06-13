.class public final Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u009f\u0001\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\rH\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u000c\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "sheetViewModel",
        "",
        "enabled",
        "",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "supportedPaymentMethods",
        "selectedItem",
        "showLinkInlineSignup",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkPaymentLauncher",
        "LEu1;",
        "showCheckboxFlow",
        "Lkotlin/Function1;",
        "",
        "onItemSelectedListener",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "onLinkSignupStateChanged",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "formArguments",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "onFormFieldValuesChanged",
        "PaymentElement",
        "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "Landroid/content/Context;",
        "Landroidx/activity/ComponentActivity;",
        "requireActivity",
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
        "SMAP\nPaymentElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentElement.kt\ncom/stripe/android/paymentsheet/ui/PaymentElementKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,123:1\n76#2:124\n76#2:139\n76#2:173\n25#3:125\n460#3,13:151\n460#3,13:185\n473#3,3:199\n473#3,3:206\n1057#4,6:126\n74#5,6:132\n80#5:164\n74#5,6:166\n80#5:198\n84#5:203\n84#5:210\n75#6:138\n76#6,11:140\n75#6:172\n76#6,11:174\n89#6:202\n89#6:209\n154#7:165\n154#7:204\n154#7:205\n*S KotlinDebug\n*F\n+ 1 PaymentElement.kt\ncom/stripe/android/paymentsheet/ui/PaymentElementKt\n*L\n46#1:124\n55#1:139\n72#1:173\n47#1:125\n55#1:151,13\n72#1:185,13\n72#1:199,3\n55#1:206,3\n47#1:126,6\n55#1:132,6\n55#1:164\n72#1:166,6\n72#1:198\n72#1:203\n55#1:210\n55#1:138\n55#1:140,11\n72#1:172\n72#1:174,11\n72#1:202\n55#1:209\n63#1:165\n96#1:204\n105#1:205\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentElement(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
            "Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Z",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "-",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v11, p9

    move/from16 v12, p12

    move/from16 v13, p13

    const-string v0, "sheetViewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethods"

    move-object/from16 v10, p2

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedItem"

    move-object/from16 v9, p3

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkPaymentLauncher"

    move-object/from16 v8, p5

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showCheckboxFlow"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelectedListener"

    move-object/from16 v6, p7

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLinkSignupStateChanged"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formArguments"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFormFieldValuesChanged"

    move-object/from16 v4, p10

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4ab21035

    move-object/from16 v2, p11

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v3

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "com.stripe.android.paymentsheet.ui.PaymentElement (PaymentElement.kt:32)"

    invoke-static {v0, v12, v13, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {v3, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v2, -0x1d58f75c

    invoke-interface {v3, v2}, LEt0;->F(I)V

    invoke-interface {v3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v14, LEt0;->a:LEt0$a;

    invoke-virtual {v14}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v2, v14, :cond_1

    new-instance v2, Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v14

    const-string v15, "context.applicationContext"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1e

    const/16 v22, 0x0

    move-object v15, v2

    move-object/from16 v16, v14

    invoke-direct/range {v15 .. v22}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {v3}, LEt0;->Q()V

    move-object/from16 v18, v2

    check-cast v18, Lcom/stripe/android/uicore/image/StripeImageLoader;

    sget v2, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_horizontal:I

    const/4 v15, 0x0

    invoke-static {v2, v3, v15}, LH24;->a(ILEt0;I)F

    move-result v2

    sget-object v14, LgV2;->b0:LgV2$a;

    const/4 v10, 0x0

    const/4 v15, 0x1

    const/4 v1, 0x0

    invoke-static {v14, v10, v15, v1}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    const v1, -0x1cd0f17e

    invoke-interface {v3, v1}, LEt0;->F(I)V

    sget-object v26, Llo;->a:Llo;

    invoke-virtual/range {v26 .. v26}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v27, LK9;->a:LK9$a;

    invoke-virtual/range {v27 .. v27}, LK9$a;->j()LK9$b;

    move-result-object v10

    const/4 v15, 0x0

    invoke-static {v1, v10, v3, v15}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v10, -0x4ee9b9da

    invoke-interface {v3, v10}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v15

    invoke-interface {v3, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v3, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v3, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v28, LBt0;->M:LBt0$a;

    invoke-virtual/range {v28 .. v28}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static/range {v16 .. v16}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v6

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_3
    invoke-interface {v3}, LEt0;->e()V

    :goto_0
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual/range {v28 .. v28}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v5, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v15, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v10, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v1, v3, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v3, v1}, LEt0;->F(I)V

    const v5, -0x455f09d5

    invoke-interface {v3, v5}, LEt0;->F(I)V

    sget-object v6, LQm0;->a:LQm0;

    const v6, 0x54ae1941

    invoke-interface {v3, v6}, LEt0;->F(I)V

    const v6, -0x3ea85567

    invoke-interface {v3, v6}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    if-le v6, v7, :cond_4

    invoke-interface/range {p2 .. p3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v15

    const/16 v20, 0x0

    const/16 v6, 0x1a

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v21

    const/16 v22, 0x0

    const/16 v6, 0xc

    int-to-float v10, v6

    invoke-static {v10}, Lk61;->g(F)F

    move-result v23

    const/16 v24, 0x5

    const/16 v25, 0x0

    move-object/from16 v19, v14

    invoke-static/range {v19 .. v25}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v19

    const/16 v20, 0x0

    shl-int/lit8 v10, v12, 0x3

    and-int/lit16 v10, v10, 0x380

    const v16, 0x30008

    or-int v10, v10, v16

    shr-int/lit8 v4, v12, 0xc

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v4, v10

    sget v10, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v6, v10, 0xc

    or-int v22, v4, v6

    const/16 v23, 0x40

    move-object v10, v14

    move-object/from16 v14, p2

    const/4 v4, 0x0

    move/from16 v16, p1

    move-object/from16 v17, p7

    move-object/from16 v21, v3

    invoke-static/range {v14 .. v23}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodsUI(Ljava/util/List;IZLkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;LgV2;LCo2;LEt0;II)V

    goto :goto_1

    :cond_4
    move-object v10, v14

    :goto_1
    invoke-interface {v3}, LEt0;->Q()V

    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v6

    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v14, v14, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v14, 0x2

    if-eqz v6, :cond_7

    const v6, -0x3ea8535c

    invoke-interface {v3, v6}, LEt0;->F(I)V

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->requireActivity(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v0

    const-string v6, "null cannot be cast to non-null type com.stripe.android.paymentsheet.ui.BaseSheetActivity<*>"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;

    invoke-virtual {v0, v11}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->setFormArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V

    const/4 v0, 0x0

    const/4 v6, 0x0

    invoke-static {v10, v2, v0, v14, v6}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v14

    const v0, -0x1cd0f17e

    invoke-interface {v3, v0}, LEt0;->F(I)V

    invoke-virtual/range {v26 .. v26}, Llo;->g()Llo$l;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, LK9$a;->j()LK9$b;

    move-result-object v6

    invoke-static {v0, v6, v3, v4}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v0

    const v6, -0x4ee9b9da

    invoke-interface {v3, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v3, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v15

    invoke-interface {v3, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v3, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    invoke-virtual/range {v28 .. v28}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {v14}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v14

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v1

    instance-of v1, v1, Llm;

    if-nez v1, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v3, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface {v3}, LEt0;->e()V

    :goto_2
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v1

    invoke-virtual/range {v28 .. v28}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v1, v0, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v6, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v15, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v28 .. v28}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v7, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v3, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v3, v0}, LEt0;->F(I)V

    const v0, -0x65308577

    invoke-interface {v3, v0}, LEt0;->F(I)V

    sget-object v14, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$1$1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$1$1$1;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x6

    move-object/from16 v17, v3

    invoke-static/range {v14 .. v19}, Lde;->a(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    move v15, v2

    move-object/from16 v16, v3

    move-object v1, v10

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const v0, -0x3ea851d0

    invoke-interface {v3, v0}, LEt0;->F(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;

    move-result-object v6

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v10, v2, v0, v14, v1}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v7

    sget v1, Lcom/stripe/android/ui/core/Amount;->$stable:I

    sget v4, Lcom/stripe/android/model/PaymentMethodCreateParams;->$stable:I

    or-int/2addr v1, v4

    const v4, 0x9000

    or-int/2addr v1, v4

    shr-int/lit8 v4, v12, 0x1b

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v1, v4

    and-int/lit8 v4, v12, 0x70

    or-int/2addr v1, v4

    shl-int/lit8 v4, v13, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v1, v4

    const/4 v14, 0x0

    move v15, v2

    move-object/from16 v2, p9

    move-object v5, v3

    move/from16 v3, p1

    move-object/from16 v4, p10

    move-object/from16 v16, v5

    move-object/from16 v5, p6

    const/4 v0, 0x1

    move-object/from16 v8, v16

    move v9, v1

    move-object v1, v10

    move v10, v14

    invoke-static/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;LgV2;LEt0;II)V

    invoke-interface/range {v16 .. v16}, LEt0;->Q()V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkInlineSelection()LGX2;

    move-result-object v2

    const/16 v3, 0x8

    move-object/from16 v9, v16

    const/4 v4, 0x0

    invoke-static {v2, v4, v9, v3, v0}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v2

    if-eqz p4, :cond_9

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x6

    if-eqz v2, :cond_8

    const v2, -0x3ea84f99

    invoke-interface {v9, v2}, LEt0;->F(I)V

    new-instance v5, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$1$2;

    move-object/from16 v10, p0

    move-object v2, v4

    invoke-direct {v5, v10}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$1$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v1, v15, v3}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    sget v0, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    shr-int/lit8 v1, v12, 0xf

    and-int/lit8 v1, v1, 0xe

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-object/from16 v2, p5

    move-object v3, v5

    move-object v5, v9

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignedInKt;->LinkInlineSignedIn(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-interface {v9}, LEt0;->Q()V

    goto :goto_4

    :cond_8
    move-object/from16 v10, p0

    move-object v2, v4

    const/4 v4, 0x0

    const v5, -0x3ea84de1

    invoke-interface {v9, v5}, LEt0;->F(I)V

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v1, v15, v3}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v1

    invoke-static {v1, v4, v0, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    sget v0, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    shr-int/lit8 v1, v12, 0xf

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    and-int/lit8 v1, v12, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v12, 0x12

    and-int/lit16 v1, v1, 0x380

    or-int v7, v0, v1

    const/4 v8, 0x0

    move-object/from16 v2, p5

    move/from16 v3, p1

    move-object/from16 v4, p8

    move-object v6, v9

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup(Lcom/stripe/android/link/LinkPaymentLauncher;ZLkotlin/jvm/functions/Function2;LgV2;LEt0;II)V

    invoke-interface {v9}, LEt0;->Q()V

    goto :goto_4

    :cond_9
    move-object/from16 v10, p0

    :goto_4
    invoke-interface {v9}, LEt0;->Q()V

    invoke-interface {v9}, LEt0;->Q()V

    invoke-interface {v9}, LEt0;->Q()V

    invoke-interface {v9}, LEt0;->f()V

    invoke-interface {v9}, LEt0;->Q()V

    invoke-interface {v9}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v14

    if-nez v14, :cond_b

    goto :goto_5

    :cond_b
    new-instance v15, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$PaymentElement$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v14, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final requireActivity(Landroid/content/Context;)Landroidx/activity/ComponentActivity;
    .locals 1

    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    instance-of v0, p0, Landroidx/activity/ComponentActivity;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/activity/ComponentActivity;

    return-object p0

    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "currentContext.baseContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to find an Activity from the current Context"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
