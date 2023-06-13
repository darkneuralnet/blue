.class public final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0090\u0001\u0010\t\u001a\u00020\u00002\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00000\u00162\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00182\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00182\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00000\u0016\u00a2\u0006\u0002\u0008\u001cH\u0001\u00a2\u0006\u0004\u0008\t\u0010\u001e\u001aC\u0010&\u001a\u00020\u0000*\u00020\u001f2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00182\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0003\u00a2\u0006\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "",
        "PaymentMethodBodyPreview",
        "(LEt0;I)V",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "",
        "loadFromArgs",
        "PaymentMethodBody",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;ZLEt0;I)V",
        "",
        "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
        "supportedPaymentMethods",
        "selectedPaymentMethod",
        "",
        "primaryButtonLabel",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "primaryButtonState",
        "secondaryButtonLabel",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Lkotlin/Function1;",
        "onPaymentMethodSelected",
        "Lkotlin/Function0;",
        "onPrimaryButtonClick",
        "onSecondaryButtonClick",
        "LPm0;",
        "Lkotlin/ExtensionFunctionType;",
        "formContent",
        "(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "LZc5;",
        "paymentMethod",
        "selected",
        "enabled",
        "onSelected",
        "LgV2;",
        "modifier",
        "PaymentMethodTypeCell",
        "(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "link_release"
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
        "SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,288:1\n81#2,11:289\n76#3:300\n76#3:308\n1#4:301\n68#5,5:302\n73#5:333\n77#5:338\n75#6:307\n76#6,11:309\n89#6:337\n460#7,13:320\n473#7,3:334\n76#8:339\n76#8:340\n76#8:341\n76#8:342\n76#8:343\n76#8:344\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt\n*L\n84#1:289,11\n121#1:300\n142#1:308\n142#1:302,5\n142#1:333\n142#1:338\n142#1:307\n142#1:309,11\n142#1:337\n142#1:320,13\n142#1:334,3\n93#1:339\n108#1:340\n111#1:341\n112#1:342\n113#1:343\n114#1:344\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentMethodBody(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;ZLEt0;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "linkAccount"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "injector"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0xbdab59a

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody (PaymentMethodBody.kt:78)"

    invoke-static {v4, v3, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v8, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;

    invoke-direct {v8, v0, v1, v2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Z)V

    const v4, 0x671a9c9b

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, Lpv2;->a:Lpv2;

    const/4 v14, 0x6

    invoke-virtual {v4, v15, v14}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v6

    if-eqz v6, :cond_c

    const/4 v7, 0x0

    instance-of v4, v6, Landroidx/lifecycle/e;

    if-eqz v4, :cond_1

    move-object v4, v6

    check-cast v4, Landroidx/lifecycle/e;

    invoke-interface {v4}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v4

    const-string v5, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v4, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v9, v4

    const-class v5, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    const v11, 0x9048

    const/4 v12, 0x0

    move-object v10, v15

    invoke-static/range {v5 .. v12}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v4

    invoke-interface {v15}, LEt0;->Q()V

    check-cast v4, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    new-instance v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;

    invoke-direct {v5}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;-><init>()V

    new-instance v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1;

    invoke-direct {v6, v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1;-><init>(Ljava/lang/Object;)V

    sget v7, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;->$stable:I

    invoke-static {v5, v6, v15, v7}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object v5

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getFinancialConnectionsSessionClientSecret()LtP5;

    move-result-object v6

    const/4 v13, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x1

    invoke-static {v6, v13, v15, v11, v12}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v6

    invoke-static {v6}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$0(LsP5;)Ljava/lang/String;

    move-result-object v6

    const v7, -0x3d221df0

    invoke-interface {v15, v7}, LEt0;->F(I)V

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    new-instance v7, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$1$1;

    invoke-direct {v7, v5, v6, v4, v13}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$1$1;-><init>(LTH2;Ljava/lang/String;Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lkotlin/coroutines/Continuation;)V

    const/16 v5, 0x40

    invoke-static {v6, v7, v15, v5}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1
    invoke-interface {v15}, LEt0;->Q()V

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getFormController()LGX2;

    move-result-object v5

    invoke-static {v5, v13, v15, v11, v12}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v5

    invoke-static {v5}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$2(LsP5;)Lcom/stripe/android/ui/core/FormController;

    move-result-object v10

    const v5, -0x3d221bec

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const/4 v9, 0x0

    if-nez v10, :cond_3

    move v1, v12

    move-object v0, v13

    move-object v4, v15

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v10}, Lcom/stripe/android/ui/core/FormController;->getCompleteFormValues()LEu1;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v16, 0x38

    const/16 v17, 0x2

    move-object v8, v15

    move/from16 v9, v16

    move-object v14, v10

    move/from16 v10, v17

    invoke-static/range {v5 .. v10}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v5

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getPrimaryButtonState()LtP5;

    move-result-object v6

    invoke-static {v6, v13, v15, v11, v12}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v6

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getErrorMessage()LtP5;

    move-result-object v7

    invoke-static {v7, v13, v15, v11, v12}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getPaymentMethod()LtP5;

    move-result-object v8

    invoke-static {v8, v13, v15, v11, v12}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v8

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getSupportedTypes()Ljava/util/List;

    move-result-object v9

    invoke-static {v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$6(LsP5;)Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    move-result-object v10

    invoke-static {v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$6(LsP5;)Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    move-result-object v8

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v11

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v13

    invoke-interface {v15, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const-string v12, "LocalContext.current.resources"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v11, v13}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->primaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$4(LsP5;)Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v6

    invoke-static {v5}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$3(LsP5;)Ljava/util/Map;

    move-result-object v11

    if-eqz v11, :cond_4

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_5

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-nez v6, :cond_6

    sget-object v6, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :cond_6
    move-object v11, v6

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getSecondaryButtonLabel()I

    move-result v6

    const/4 v13, 0x0

    invoke-static {v6, v15, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v7}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$5(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v18

    new-instance v7, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$2;

    invoke-direct {v7, v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$2;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$3;

    invoke-direct {v6, v5, v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$3;-><init>(LsP5;Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)V

    new-instance v5, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$4;

    invoke-direct {v5, v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$4;-><init>(Ljava/lang/Object;)V

    new-instance v13, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$5;

    invoke-direct {v13, v14, v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$2$5;-><init>(Lcom/stripe/android/ui/core/FormController;Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)V

    const v4, 0x635e01d8

    const/4 v14, 0x1

    invoke-static {v15, v4, v14, v13}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const v17, 0x30000008

    move-object v13, v5

    move-object v5, v9

    move-object/from16 v19, v6

    move-object v6, v10

    move-object/from16 v20, v7

    move-object v7, v8

    move-object v8, v11

    move-object v9, v12

    move-object/from16 v10, v18

    move-object/from16 v11, v20

    move-object/from16 v12, v19

    const/4 v0, 0x0

    move v1, v14

    move-object v14, v4

    move-object v4, v15

    move/from16 v16, v17

    invoke-static/range {v5 .. v16}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V

    sget-object v13, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    invoke-interface {v4}, LEt0;->Q()V

    if-nez v13, :cond_9

    sget-object v5, LgV2;->b0:LgV2$a;

    const/4 v6, 0x0

    invoke-static {v5, v6, v1, v0}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    invoke-static {v5, v6, v1, v0}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v1

    const v5, 0x2bb5b5d7

    invoke-interface {v4, v5}, LEt0;->F(I)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static {v1, v6, v4, v5}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v5, -0x4ee9b9da

    invoke-interface {v4, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v4, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v4, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v4, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v4}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v4}, LEt0;->h()V

    invoke-interface {v4}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v4, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_8
    invoke-interface {v4}, LEt0;->e()V

    :goto_5
    invoke-interface {v4}, LEt0;->L()V

    invoke-static {v4}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v1, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v9, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v9, v6, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v9, v7, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v4}, LEt0;->q()V

    invoke-static {v4}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v1, v4, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v4, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {v4, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x28103883

    invoke-interface {v4, v0}, LEt0;->F(I)V

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x7

    move-object v9, v4

    invoke-static/range {v5 .. v11}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->f()V

    invoke-interface {v4}, LEt0;->Q()V

    invoke-interface {v4}, LEt0;->Q()V

    :cond_9
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface {v4}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance v1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$4;

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$4;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;ZI)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final PaymentMethodBody(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "supportedPaymentMethods"

    move-object/from16 v13, p0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedPaymentMethod"

    move-object/from16 v14, p1

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonLabel"

    move-object/from16 v15, p2

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonState"

    move-object/from16 v12, p3

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondaryButtonLabel"

    move-object/from16 v11, p4

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPaymentMethodSelected"

    move-object/from16 v10, p6

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    move-object/from16 v9, p7

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSecondaryButtonClick"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formContent"

    move-object/from16 v7, p9

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x286e0739

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v6

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody (PaymentMethodBody.kt:153)"

    move/from16 v5, p11

    invoke-static {v0, v5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v5, p11

    :goto_0
    new-instance v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p5

    move-object/from16 v5, p2

    move-object v13, v6

    move-object/from16 v6, p3

    move-object/from16 v7, p7

    move/from16 v8, p11

    move-object/from16 v9, p4

    move-object/from16 v10, p8

    move-object/from16 v11, p6

    move-object/from16 v12, p9

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;-><init>(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V

    const v1, 0x76a0ca50

    const/4 v2, 0x1

    invoke-static {v13, v1, v2, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v13, v1}, Lcom/stripe/android/link/ui/CommonKt;->ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v13, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$6;

    move-object v1, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$6;-><init>(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v0, v13}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final PaymentMethodBody$lambda$0(LsP5;)Ljava/lang/String;
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

.method private static final PaymentMethodBody$lambda$2(LsP5;)Lcom/stripe/android/ui/core/FormController;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;)",
            "Lcom/stripe/android/ui/core/FormController;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/FormController;

    return-object p0
.end method

.method private static final PaymentMethodBody$lambda$8$lambda$3(LsP5;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;)",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method private static final PaymentMethodBody$lambda$8$lambda$4(LsP5;)Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            ">;)",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object p0
.end method

.method private static final PaymentMethodBody$lambda$8$lambda$5(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;)",
            "Lcom/stripe/android/link/ui/ErrorMessage;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/ErrorMessage;

    return-object p0
.end method

.method private static final PaymentMethodBody$lambda$8$lambda$6(LsP5;)Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;)",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    return-object p0
.end method

.method private static final PaymentMethodBodyPreview(LEt0;I)V
    .locals 4

    const v0, 0x737d5a5c

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

    const-string v2, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyPreview (PaymentMethodBody.kt:59)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/paymentmethod/ComposableSingletons$PaymentMethodBodyKt;->INSTANCE:Lcom/stripe/android/link/ui/paymentmethod/ComposableSingletons$PaymentMethodBodyKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/paymentmethod/ComposableSingletons$PaymentMethodBodyKt;->getLambda-3$link_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBodyPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBodyPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final PaymentMethodTypeCell(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZc5;",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p3

    move/from16 v8, p7

    const v0, -0x23859524

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v9

    const/high16 v1, -0x80000000

    and-int v1, p8, v1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x6

    move-object/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0xe

    move-object/from16 v10, p0

    if-nez v1, :cond_2

    invoke-interface {v9, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v8, 0x70

    move-object/from16 v11, p1

    if-nez v2, :cond_5

    invoke-interface {v9, v11}, LEt0;->n(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v8, 0x380

    move/from16 v12, p2

    if-nez v2, :cond_8

    invoke-interface {v9, v12}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v2, v8, 0x1c00

    if-nez v2, :cond_b

    invoke-interface {v9, v7}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x800

    goto :goto_6

    :cond_a
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    :goto_7
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v13, p4

    goto :goto_9

    :cond_c
    const v2, 0xe000

    and-int/2addr v2, v8

    move-object/from16 v13, p4

    if-nez v2, :cond_e

    invoke-interface {v9, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/16 v2, 0x4000

    goto :goto_8

    :cond_d
    const/16 v2, 0x2000

    :goto_8
    or-int/2addr v1, v2

    :cond_e
    :goto_9
    and-int/lit8 v2, p8, 0x10

    if-eqz v2, :cond_f

    const/high16 v3, 0x30000

    or-int/2addr v1, v3

    goto :goto_b

    :cond_f
    const/high16 v3, 0x70000

    and-int/2addr v3, v8

    if-nez v3, :cond_11

    move-object/from16 v3, p5

    invoke-interface {v9, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/high16 v4, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v4, 0x10000

    :goto_a
    or-int/2addr v1, v4

    goto :goto_c

    :cond_11
    :goto_b
    move-object/from16 v3, p5

    :goto_c
    const v4, 0x5b6db

    and-int/2addr v1, v4

    const v4, 0x12492

    if-ne v1, v4, :cond_13

    invoke-interface {v9}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v9}, LEt0;->k()V

    move-object v6, v3

    goto :goto_10

    :cond_13
    :goto_d
    if-eqz v2, :cond_14

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v14, v1

    goto :goto_e

    :cond_14
    move-object v14, v3

    :goto_e
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.paymentmethod.PaymentMethodTypeCell (PaymentMethodBody.kt:222)"

    invoke-static {v0, v8, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_15
    const/4 v15, 0x1

    new-array v6, v15, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    if-eqz v7, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_16
    const v1, 0x3f19999a    # 0.6f

    :goto_f
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    new-instance v5, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object v2, v14

    move/from16 v3, p2

    move/from16 v4, p3

    move-object v7, v5

    move-object/from16 v5, p4

    move-object/from16 v16, v6

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1;-><init>(LZc5;LgV2;ZZLkotlin/jvm/functions/Function0;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;)V

    const v0, -0xc73a1e4

    invoke-static {v9, v0, v15, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v2, v16

    invoke-static {v2, v0, v9, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LQt0;->Y()V

    :cond_17
    move-object v6, v14

    :goto_10
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_18

    goto :goto_11

    :cond_18
    new-instance v14, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$2;-><init>(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {v9, v14}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_11
    return-void
.end method

.method public static final synthetic access$PaymentMethodBody$lambda$8$lambda$3(LsP5;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody$lambda$8$lambda$3(LsP5;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$PaymentMethodBodyPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBodyPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$PaymentMethodTypeCell(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodTypeCell(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    return-void
.end method
