.class public final Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0082\u0001\u0010\t\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\u00122\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00142\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00000\u0012\u00a2\u0006\u0002\u0008\u0018H\u0001\u00a2\u0006\u0004\u0008\t\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\u0012H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00078\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "CardEditPreview",
        "(LEt0;I)V",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "",
        "paymentDetailsId",
        "CardEditBody",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V",
        "",
        "isProcessing",
        "isDefault",
        "setAsDefaultChecked",
        "primaryButtonEnabled",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Lkotlin/Function1;",
        "onSetAsDefaultClick",
        "Lkotlin/Function0;",
        "onPrimaryButtonClick",
        "onCancelClick",
        "LPm0;",
        "Lkotlin/ExtensionFunctionType;",
        "formContent",
        "(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "DefaultPaymentMethodCheckbox",
        "(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V",
        "DEFAULT_PAYMENT_METHOD_CHECKBOX_TAG",
        "Ljava/lang/String;",
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
        "SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,193:1\n81#2,11:194\n68#3,5:205\n73#3:236\n77#3:241\n75#4:210\n76#4,11:212\n89#4:240\n76#5:211\n460#6,13:223\n473#6,3:237\n50#6:242\n49#6:243\n1057#7,6:244\n76#8:250\n76#8:251\n76#8:252\n76#8:253\n76#8:254\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt\n*L\n69#1:194,11\n76#1:205,5\n76#1:236\n76#1:241\n76#1:210\n76#1:212,11\n76#1:240\n76#1:211\n76#1:223,13\n76#1:237,3\n188#1:242\n188#1:243\n188#1:244,6\n73#1:250\n86#1:251\n87#1:252\n88#1:253\n89#1:254\n*E\n"
    }
.end annotation


# static fields
.field public static final DEFAULT_PAYMENT_METHOD_CHECKBOX_TAG:Ljava/lang/String; = "DEFAULT_PAYMENT_METHOD_CHECKBOX"


# direct methods
.method public static final CardEditBody(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "linkAccount"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "injector"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "paymentDetailsId"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x64b59070

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.link.ui.cardedit.CardEditBody (CardEditScreen.kt:63)"

    invoke-static {v4, v3, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v8, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;

    invoke-direct {v8, v0, v1, v2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;)V

    const v4, 0x671a9c9b

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, Lpv2;->a:Lpv2;

    const/4 v13, 0x6

    invoke-virtual {v4, v15, v13}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v6

    if-eqz v6, :cond_9

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

    const-class v5, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    const v11, 0x9048

    const/4 v12, 0x0

    move-object v10, v15

    invoke-static/range {v5 .. v12}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v4

    invoke-interface {v15}, LEt0;->Q()V

    check-cast v4, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getFormController()LGX2;

    move-result-object v5

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v14, 0x1

    invoke-static {v5, v11, v15, v12, v14}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v5

    invoke-static {v5}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;

    move-result-object v6

    const/4 v10, 0x0

    if-nez v6, :cond_4

    const v4, 0x1c3a8cb8

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    invoke-static {v4, v5, v14, v11}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static {v4, v5, v14, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->e()LK9;

    move-result-object v5

    const v6, 0x2bb5b5d7

    invoke-interface {v15, v6}, LEt0;->F(I)V

    invoke-static {v5, v10, v15, v13}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v15, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v9, LBt0;->M:LBt0$a;

    invoke-virtual {v9}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

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

    invoke-virtual {v9}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v5, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v11, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v15, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const v4, -0x7f65a980

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, Lf10;->a:Lf10;

    const v4, -0x1e53336f

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x7

    move-object v9, v15

    invoke-static/range {v5 .. v11}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    move-object/from16 v16, v15

    goto/16 :goto_3

    :cond_4
    const v6, 0x1c3a8da2

    invoke-interface {v15, v6}, LEt0;->F(I)V

    invoke-static {v5}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;

    move-result-object v13

    if-nez v13, :cond_5

    move-object/from16 v16, v15

    goto/16 :goto_2

    :cond_5
    invoke-virtual {v13}, Lcom/stripe/android/ui/core/FormController;->getCompleteFormValues()LEu1;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v16, 0x2

    move-object v8, v15

    move/from16 v17, v10

    move/from16 v10, v16

    invoke-static/range {v5 .. v10}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v5

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isProcessing()LtP5;

    move-result-object v6

    invoke-static {v6, v11, v15, v12, v14}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v6

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getErrorMessage()LtP5;

    move-result-object v7

    invoke-static {v7, v11, v15, v12, v14}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getSetAsDefault()LtP5;

    move-result-object v8

    invoke-static {v8, v11, v15, v12, v14}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v8

    invoke-static {v6}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$6$lambda$3(LsP5;)Z

    move-result v6

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isDefault()Z

    move-result v9

    invoke-static {v8}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$6$lambda$5(LsP5;)Z

    move-result v8

    invoke-static {v5}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$6$lambda$2(LsP5;)Ljava/util/Map;

    move-result-object v10

    if-eqz v10, :cond_6

    move/from16 v17, v14

    :cond_6
    invoke-static {v7}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$6$lambda$4(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v10

    new-instance v11, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$1;

    invoke-direct {v11, v4}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$1;-><init>(Ljava/lang/Object;)V

    new-instance v12, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$2;

    invoke-direct {v12, v5, v4}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$2;-><init>(LsP5;Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)V

    new-instance v7, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$3;

    invoke-direct {v7, v4}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$3;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)V

    new-instance v5, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$4;

    invoke-direct {v5, v13, v4}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$2$4;-><init>(Lcom/stripe/android/ui/core/FormController;Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)V

    const v4, -0x56889bc

    invoke-static {v15, v4, v14, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v13

    const/high16 v4, 0x6000000

    move v5, v6

    move v6, v9

    move-object v14, v7

    move v7, v8

    move/from16 v8, v17

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v14

    move-object v14, v15

    move-object/from16 v16, v15

    move v15, v4

    invoke-static/range {v5 .. v15}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V

    :goto_2
    invoke-interface/range {v16 .. v16}, LEt0;->Q()V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface/range {v16 .. v16}, LEt0;->w()LWm5;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    new-instance v5, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$3;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$3;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;I)V

    invoke-interface {v4, v5}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
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

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    move-object/from16 v14, p8

    move/from16 v15, p10

    const-string v0, "onSetAsDefaultClick"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCancelClick"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formContent"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x681389a2

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v10

    and-int/lit8 v1, v15, 0xe

    move/from16 v9, p0

    if-nez v1, :cond_1

    invoke-interface {v10, v9}, LEt0;->o(Z)Z

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

    move/from16 v8, p1

    if-nez v2, :cond_3

    invoke-interface {v10, v8}, LEt0;->o(Z)Z

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

    move/from16 v7, p2

    if-nez v2, :cond_5

    invoke-interface {v10, v7}, LEt0;->o(Z)Z

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

    move/from16 v6, p3

    if-nez v2, :cond_7

    invoke-interface {v10, v6}, LEt0;->o(Z)Z

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

    move-object/from16 v5, p4

    if-nez v2, :cond_9

    invoke-interface {v10, v5}, LEt0;->n(Ljava/lang/Object;)Z

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

    invoke-interface {v10, v11}, LEt0;->n(Ljava/lang/Object;)Z

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

    invoke-interface {v10, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x80000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    const/high16 v2, 0x1c00000

    and-int/2addr v2, v15

    if-nez v2, :cond_f

    invoke-interface {v10, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v2, 0x400000

    :goto_8
    or-int/2addr v1, v2

    :cond_f
    const/high16 v2, 0xe000000

    and-int/2addr v2, v15

    if-nez v2, :cond_11

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    const/high16 v2, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v2, 0x2000000

    :goto_9
    or-int/2addr v1, v2

    :cond_11
    move v4, v1

    const v1, 0xb6db6db

    and-int/2addr v1, v4

    const v2, 0x2492492

    if-ne v1, v2, :cond_13

    invoke-interface {v10}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_a

    :cond_12
    invoke-interface {v10}, LEt0;->k()V

    move-object v12, v10

    goto :goto_b

    :cond_13
    :goto_a
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.cardedit.CardEditBody (CardEditScreen.kt:116)"

    invoke-static {v0, v4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_14
    new-instance v3, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;

    move-object v0, v3

    move-object/from16 v1, p4

    move/from16 v2, p0

    move-object v11, v3

    move/from16 v3, p3

    move/from16 v16, v4

    move-object/from16 v4, p6

    move/from16 v5, v16

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move/from16 v8, p2

    move/from16 v9, p1

    move-object v12, v10

    move-object/from16 v10, p5

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;ZZLkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;ZZLkotlin/jvm/functions/Function1;)V

    const v0, 0x7cae5327

    const/4 v1, 0x1

    invoke-static {v12, v0, v1, v11}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v12, v1}, Lcom/stripe/android/link/ui/CommonKt;->ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LQt0;->Y()V

    :cond_15
    :goto_b
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_16

    goto :goto_c

    :cond_16
    new-instance v12, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;

    move-object v0, v12

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;-><init>(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_c
    return-void
.end method

.method private static final CardEditBody$lambda$0(LsP5;)Lcom/stripe/android/ui/core/FormController;
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

.method private static final CardEditBody$lambda$6$lambda$2(LsP5;)Ljava/util/Map;
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

.method private static final CardEditBody$lambda$6$lambda$3(LsP5;)Z
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

.method private static final CardEditBody$lambda$6$lambda$4(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;
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

.method private static final CardEditBody$lambda$6$lambda$5(LsP5;)Z
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

.method public static final CardEditPreview(LEt0;I)V
    .locals 4

    const v0, -0x62c55c79

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

    const-string v2, "com.stripe.android.link.ui.cardedit.CardEditPreview (CardEditScreen.kt:44)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;->getLambda-3$link_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final DefaultPaymentMethodCheckbox(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, -0x2ea05425

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p5, 0xe

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x70

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x380

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0x1c00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x16db

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LEt0;->k()V

    goto/16 :goto_9

    :cond_9
    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.cardedit.DefaultPaymentMethodCheckbox (CardEditScreen.kt:173)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_c

    if-eqz p0, :cond_b

    goto :goto_6

    :cond_b
    move v3, v1

    goto :goto_7

    :cond_c
    :goto_6
    move v3, v0

    :goto_7
    if-nez p1, :cond_d

    if-nez p2, :cond_d

    move v5, v0

    goto :goto_8

    :cond_d
    move v5, v1

    :goto_8
    const/4 v0, 0x0

    const-string v2, "DEFAULT_PAYMENT_METHOD_CHECKBOX"

    sget v4, Lcom/stripe/android/link/R$string;->pm_set_as_default:I

    invoke-static {v4, p4, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const v6, 0x1e7b2b64

    invoke-interface {p4, v6}, LEt0;->F(I)V

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p4, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v6

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_e

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_f

    :cond_e
    new-instance v6, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$DefaultPaymentMethodCheckbox$1$1;

    invoke-direct {v6, p3, p0}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$DefaultPaymentMethodCheckbox$1$1;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    invoke-interface {p4, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x30

    const/4 v9, 0x1

    move-object v1, v0

    move-object v7, p4

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_9
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p4

    if-nez p4, :cond_11

    goto :goto_a

    :cond_11
    new-instance v6, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$DefaultPaymentMethodCheckbox$2;

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$DefaultPaymentMethodCheckbox$2;-><init>(ZZZLkotlin/jvm/functions/Function1;I)V

    invoke-interface {p4, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final synthetic access$CardEditBody$lambda$6$lambda$2(LsP5;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody$lambda$6$lambda$2(LsP5;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$DefaultPaymentMethodCheckbox(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->DefaultPaymentMethodCheckbox(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
