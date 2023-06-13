.class public final Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001au\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0002\u0008\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0002\u0008\u000bH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "primaryButtonEnabled",
        "",
        "primaryButtonText",
        "title",
        "Lkotlin/Function0;",
        "",
        "onPrimaryButtonClick",
        "onCloseClick",
        "Lkotlin/Function1;",
        "LPm0;",
        "Lkotlin/ExtensionFunctionType;",
        "formContent",
        "checkboxContent",
        "InputAddressScreen",
        "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V",
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
        "SMAP\nInputAddressScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n76#2:145\n76#2:163\n81#3,11:146\n68#4,5:157\n73#4:188\n77#4:193\n75#5:162\n76#5,11:164\n89#5:192\n460#6,13:175\n473#6,3:189\n76#7:194\n76#7:195\n76#7:196\n76#7:197\n*S KotlinDebug\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt\n*L\n39#1:145\n91#1:163\n84#1:146,11\n91#1:157,5\n91#1:188\n91#1:193\n91#1:162\n91#1:164,11\n91#1:192\n91#1:175,13\n91#1:189,3\n89#1:194\n99#1:195\n106#1:196\n107#1:197\n*E\n"
    }
.end annotation


# direct methods
.method public static final InputAddressScreen(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "injector"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x2827dc53

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v12

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:80)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v6, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v2, 0x671a9c9b

    invoke-interface {v12, v2}, LEt0;->F(I)V

    sget-object v2, Lpv2;->a:Lpv2;

    const/4 v11, 0x6

    invoke-virtual {v2, v12, v11}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v4

    if-eqz v4, :cond_d

    const/4 v5, 0x0

    instance-of v2, v4, Landroidx/lifecycle/e;

    if-eqz v2, :cond_1

    move-object v2, v4

    check-cast v2, Landroidx/lifecycle/e;

    invoke-interface {v2}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v2

    const-string v3, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v2, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v7, v2

    const-class v3, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    const v9, 0x9048

    const/4 v10, 0x0

    move-object v8, v12

    invoke-static/range {v3 .. v10}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v2

    invoke-interface {v12}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getFormController()LtP5;

    move-result-object v3

    const/16 v4, 0x8

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v3, v9, v12, v4, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;

    move-result-object v4

    const/4 v13, 0x0

    if-nez v4, :cond_4

    const v2, -0x776fb0b0

    invoke-interface {v12, v2}, LEt0;->F(I)V

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->e()LK9;

    move-result-object v2

    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    invoke-static {v3, v4, v10, v9}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const v4, 0x2bb5b5d7

    invoke-interface {v12, v4}, LEt0;->F(I)V

    invoke-static {v2, v13, v12, v11}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v2

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

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v12}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v12}, LEt0;->h()V

    invoke-interface {v12}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v12, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v12}, LEt0;->e()V

    :goto_1
    invoke-interface {v12}, LEt0;->L()V

    invoke-static {v12}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v2, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v12}, LEt0;->q()V

    invoke-static {v12}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v2, v12, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v12, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v12, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, 0x44409434

    invoke-interface {v12, v2}, LEt0;->F(I)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x7

    move-object v7, v12

    invoke-static/range {v3 .. v9}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->f()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    goto/16 :goto_5

    :cond_4
    const v4, -0x776faff9

    invoke-interface {v12, v4}, LEt0;->F(I)V

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;

    move-result-object v11

    if-nez v11, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-virtual {v11}, Lcom/stripe/android/ui/core/FormController;->getCompleteFormValues()LEu1;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x38

    const/4 v8, 0x2

    move-object v6, v12

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v14

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getButtonTitle()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_6
    move-object v3, v9

    :goto_2
    const v4, -0x776faf6f

    invoke-interface {v12, v4}, LEt0;->F(I)V

    if-nez v3, :cond_7

    sget v3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_address_element_primary_button:I

    invoke-static {v3, v12, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    :cond_7
    move-object v15, v3

    invoke-interface {v12}, LEt0;->Q()V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getTitle()Ljava/lang/String;

    move-result-object v9

    :cond_8
    const v3, -0x776faec3

    invoke-interface {v12, v3}, LEt0;->F(I)V

    if-nez v9, :cond_9

    sget v3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_address_element_shipping_address:I

    invoke-static {v3, v12, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    :cond_9
    invoke-interface {v12}, LEt0;->Q()V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getFormEnabled()LtP5;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    const/16 v7, 0x38

    const/4 v8, 0x2

    move-object v6, v12

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v8

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getCheckboxChecked()LtP5;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v16, 0x2

    move-object v13, v8

    move/from16 v8, v16

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-static {v14}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$5$lambda$2(LsP5;)Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_a

    move v4, v10

    goto :goto_3

    :cond_a
    const/4 v4, 0x0

    :goto_3
    new-instance v6, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$1;

    invoke-direct {v6, v2, v14, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;LsP5;LsP5;)V

    new-instance v7, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$2;

    invoke-direct {v7, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)V

    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$3;

    invoke-direct {v5, v11, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$3;-><init>(Lcom/stripe/android/ui/core/FormController;Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)V

    const v8, -0xa077c10

    invoke-static {v12, v8, v10, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$4;

    invoke-direct {v5, v2, v3, v13}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$5$4;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;LsP5;LsP5;)V

    const v2, -0x3ef5dcb1

    invoke-static {v12, v2, v10, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    const/high16 v11, 0x1b0000

    move v3, v4

    move-object v4, v15

    move-object v5, v9

    move-object v9, v2

    move-object v10, v12

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;I)V

    :goto_4
    invoke-interface {v12}, LEt0;->Q()V

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_6

    :cond_c
    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$6;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$6;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final InputAddressScreen(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move/from16 v15, p8

    const-string v0, "primaryButtonText"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCloseClick"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formContent"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkboxContent"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2647089c

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v8

    and-int/lit8 v1, v15, 0xe

    move/from16 v7, p0

    if-nez v1, :cond_1

    invoke-interface {v8, v7}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v2, v15, 0x70

    if-nez v2, :cond_3

    invoke-interface {v8, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v15, 0x380

    if-nez v2, :cond_5

    invoke-interface {v8, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v15, 0x1c00

    if-nez v2, :cond_7

    invoke-interface {v8, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    const v2, 0xe000

    and-int/2addr v2, v15

    if-nez v2, :cond_9

    invoke-interface {v8, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x70000

    and-int/2addr v2, v15

    if-nez v2, :cond_b

    invoke-interface {v8, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x380000

    and-int/2addr v2, v15

    if-nez v2, :cond_d

    invoke-interface {v8, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x80000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    move v2, v1

    const v1, 0x2db6db

    and-int/2addr v1, v2

    const v3, 0x92492

    if-ne v1, v3, :cond_f

    invoke-interface {v8}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_8

    :cond_e
    invoke-interface {v8}, LEt0;->k()V

    move-object v11, v8

    goto/16 :goto_9

    :cond_f
    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:29)"

    invoke-static {v0, v2, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v0

    invoke-interface {v8, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LBv1;

    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v1, v5, v3}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-static {v0}, LqC6;->a(LgV2;)LgV2;

    move-result-object v16

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-virtual {v0, v8, v1}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->n()J

    move-result-wide v34

    const/16 v17, 0x0

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$1;

    invoke-direct {v0, v6, v12}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$1;-><init>(LBv1;Lkotlin/jvm/functions/Function0;)V

    const v1, -0x31b1105f

    invoke-static {v8, v1, v5, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v36, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$2;

    move-object v0, v4

    move-object/from16 v1, p2

    move-object/from16 v3, p5

    move-object v9, v4

    move-object/from16 v4, p6

    move v10, v5

    move/from16 v5, p0

    move-object/from16 v38, v6

    move-object/from16 v6, p1

    move-object/from16 v7, v38

    move-object v11, v8

    move-object/from16 v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$2;-><init>(Ljava/lang/String;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZLjava/lang/String;LBv1;Lkotlin/jvm/functions/Function0;)V

    const v0, 0x39ff1eda

    invoke-static {v11, v0, v10, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v38

    const/16 v40, 0x180

    const/high16 v41, 0xc00000

    const v42, 0x17ffa

    move-object/from16 v39, v11

    invoke-static/range {v16 .. v42}, LVi5;->a(LgV2;LXi5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLhy5;FJJJJJLkotlin/jvm/functions/Function3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    :goto_9
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_12

    goto :goto_a

    :cond_12
    new-instance v10, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$3;

    move-object v0, v10

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$3;-><init>(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method private static final InputAddressScreen$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;
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

.method private static final InputAddressScreen$lambda$5$lambda$2(LsP5;)Ljava/util/Map;
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

.method private static final InputAddressScreen$lambda$5$lambda$3(LsP5;)Z
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

.method private static final InputAddressScreen$lambda$5$lambda$4(LsP5;)Z
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

.method public static final synthetic access$InputAddressScreen$lambda$5$lambda$2(LsP5;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$5$lambda$2(LsP5;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$InputAddressScreen$lambda$5$lambda$3(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$5$lambda$3(LsP5;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$InputAddressScreen$lambda$5$lambda$4(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt;->InputAddressScreen$lambda$5$lambda$4(LsP5;)Z

    move-result p0

    return p0
.end method
