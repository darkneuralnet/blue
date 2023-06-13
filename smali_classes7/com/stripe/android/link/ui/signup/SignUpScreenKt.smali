.class public final Lcom/stripe/android/link/ui/signup/SignUpScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a_\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0015H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0017\u001a1\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "SignUpBodyPreview",
        "(LEt0;I)V",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "SignUpBody",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V",
        "",
        "merchantName",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "emailController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "phoneNumberController",
        "nameController",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "signUpState",
        "",
        "isReadyToSignUp",
        "requiresNameCollection",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Lkotlin/Function0;",
        "onSignUpClick",
        "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "enabled",
        "Landroidx/compose/ui/focus/h;",
        "focusRequester",
        "EmailCollectionSection",
        "(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;LEt0;II)V",
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
        "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,240:1\n81#2,11:241\n1057#3,6:252\n154#4:258\n154#4:291\n154#4:292\n154#4:293\n154#4:294\n154#4:295\n154#4:296\n68#5,5:259\n73#5:290\n77#5:301\n75#6:264\n76#6,11:266\n89#6:300\n76#7:265\n460#8,13:277\n473#8,3:297\n76#9:302\n76#9:303\n76#9:304\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt\n*L\n75#1:241,11\n202#1:252,6\n207#1:258\n224#1:291\n226#1:292\n227#1:293\n228#1:294\n229#1:295\n235#1:296\n204#1:259,5\n204#1:290\n204#1:301\n204#1:264\n204#1:266,11\n204#1:300\n204#1:265\n204#1:277,13\n204#1:297,3\n79#1:302\n80#1:303\n81#1:304\n*E\n"
    }
.end annotation


# direct methods
.method public static final EmailCollectionSection(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;LEt0;II)V
    .locals 17

    move-object/from16 v3, p2

    const-string v0, "emailController"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1b40c990

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_1

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_0

    new-instance v4, Landroidx/compose/ui/focus/h;

    invoke-direct {v4}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_0
    check-cast v4, Landroidx/compose/ui/focus/h;

    move-object v13, v4

    goto :goto_0

    :cond_1
    move-object/from16 v13, p3

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.link.ui.signup.EmailCollectionSection (SignUpScreen.kt:197)"

    move/from16 v14, p5

    invoke-static {v0, v14, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_1

    :cond_2
    move/from16 v14, p5

    :goto_1
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    const/4 v15, 0x1

    const/4 v12, 0x0

    invoke-static {v0, v4, v15, v12}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const/4 v11, 0x0

    int-to-float v10, v11

    invoke-static {v10}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v5}, LND3;->i(LgV2;F)LgV2;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->f()LK9;

    move-result-object v5

    const v6, 0x2bb5b5d7

    invoke-interface {v1, v6}, LEt0;->F(I)V

    const/4 v6, 0x6

    invoke-static {v5, v11, v1, v6}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v1, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v1, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v9, LBt0;->M:LBt0$a;

    invoke-virtual {v9}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v1, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_4
    invoke-interface {v1}, LEt0;->e()V

    :goto_2
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual {v9}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v12, v5, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v12, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v1, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const v4, -0x7f65a980

    invoke-interface {v1, v4}, LEt0;->F(I)V

    sget-object v4, Lf10;->a:Lf10;

    const v4, 0x2efae976

    invoke-interface {v1, v4}, LEt0;->F(I)V

    sget-object v4, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPhoneOrName:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v3, v4, :cond_5

    sget-object v4, LFY1;->b:LFY1$a;

    invoke-virtual {v4}, LFY1$a;->d()I

    move-result v4

    goto :goto_3

    :cond_5
    sget-object v4, LFY1;->b:LFY1$a;

    invoke-virtual {v4}, LFY1$a;->b()I

    move-result v4

    :goto_3
    move v5, v4

    if-eqz p0, :cond_6

    sget-object v4, Lcom/stripe/android/link/ui/signup/SignUpState;->VerifyingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eq v3, v4, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v11

    :goto_4
    invoke-static {v0, v13}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v12, 0x8

    const/16 v15, 0x30

    move-object/from16 v4, p1

    move/from16 v16, v10

    move-object v10, v1

    move v11, v12

    const/4 v2, 0x0

    move v12, v15

    invoke-static/range {v4 .. v12}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    sget-object v4, Lcom/stripe/android/link/ui/signup/SignUpState;->VerifyingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v3, v4, :cond_7

    const/16 v4, 0x20

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static/range {v16 .. v16}, Lk61;->g(F)F

    move-result v4

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v6

    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v0, v4, v6, v7, v5}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v0

    sget-object v4, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$2$1;->INSTANCE:Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$2$1;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v0, v6, v4, v5, v2}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v4

    sget-object v0, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v0, v1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/theme/LinkColors;->getProgressIndicator-0d7_KjU()J

    move-result-wide v5

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v7

    const/16 v9, 0x180

    const/4 v10, 0x0

    move-object v8, v1

    invoke-static/range {v4 .. v10}, LK74;->b(LgV2;JFLEt0;II)V

    :cond_7
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_9

    goto :goto_5

    :cond_9
    new-instance v8, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;

    move-object v0, v8

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v13

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;-><init>(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final SignUpBody(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "injector"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x6d1cb55a

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v14

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.signup.SignUpBody (SignUpScreen.kt:71)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    invoke-direct {v6, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v2, 0x671a9c9b

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v2, Lpv2;->a:Lpv2;

    const/4 v11, 0x6

    invoke-virtual {v2, v14, v11}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v4

    if-eqz v4, :cond_4

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

    const-class v3, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    const v9, 0x9048

    const/4 v10, 0x0

    move-object v8, v14

    invoke-static/range {v3 .. v10}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v2

    invoke-interface {v14}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getSignUpState()LtP5;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x1

    invoke-static {v3, v4, v14, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->isReadyToSignUp()LtP5;

    move-result-object v7

    invoke-static {v7, v4, v14, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getErrorMessage()LtP5;

    move-result-object v8

    invoke-static {v8, v4, v14, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v4

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getMerchantName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v6

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v8

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v9

    invoke-static {v3}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/signup/SignUpState;

    move-result-object v10

    invoke-static {v7}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody$lambda$1(LsP5;)Z

    move-result v12

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getRequiresNameCollection()Z

    move-result v13

    invoke-static {v4}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody$lambda$2(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v15

    new-instance v7, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$1;

    invoke-direct {v7, v2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$1;-><init>(Ljava/lang/Object;)V

    sget v2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->$stable:I

    shl-int/lit8 v3, v2, 0x3

    sget v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/2addr v4, v11

    or-int/2addr v3, v4

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v2, v3

    move-object v3, v5

    move-object v4, v6

    move-object v5, v8

    move-object v6, v9

    move-object v11, v7

    move-object v7, v10

    move v8, v12

    move v9, v13

    move-object v10, v15

    move-object v12, v14

    move v13, v2

    invoke-static/range {v3 .. v13}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final SignUpBody(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "ZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "merchantName"

    move-object/from16 v13, p0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailController"

    move-object/from16 v14, p1

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumberController"

    move-object/from16 v15, p2

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameController"

    move-object/from16 v12, p3

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    move-object/from16 v11, p4

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSignUpClick"

    move-object/from16 v10, p8

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x32f7c963

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v9

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.signup.SignUpBody (SignUpScreen.kt:97)"

    move/from16 v8, p10

    invoke-static {v0, v8, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v8, p10

    :goto_0
    sget-object v0, Lkv2;->a:Lkv2;

    sget v1, Lkv2;->c:I

    invoke-virtual {v0, v9, v1}, Lkv2;->b(LEt0;I)LnN5;

    move-result-object v0

    new-instance v7, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;

    move-object v1, v7

    move-object/from16 v2, p0

    move-object/from16 v3, p4

    move-object/from16 v4, p7

    move-object/from16 v5, p1

    move/from16 v6, p10

    move-object v13, v7

    move/from16 v7, p5

    move-object/from16 v8, p8

    move-object v14, v9

    move-object v9, v0

    move-object/from16 v10, p2

    move/from16 v11, p6

    move-object/from16 v12, p3

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;-><init>(Ljava/lang/String;Lcom/stripe/android/link/ui/signup/SignUpState;Lcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/elements/TextFieldController;IZLkotlin/jvm/functions/Function0;LnN5;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V

    const v0, 0x1ce62d3a

    const/4 v1, 0x1

    invoke-static {v14, v0, v1, v13}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v14, v1}, Lcom/stripe/android/link/ui/CommonKt;->ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v12, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;

    move-object v1, v12

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v0, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final SignUpBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            ">;)",
            "Lcom/stripe/android/link/ui/signup/SignUpState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object p0
.end method

.method private static final SignUpBody$lambda$1(LsP5;)Z
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

.method private static final SignUpBody$lambda$2(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;
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

.method private static final SignUpBodyPreview(LEt0;I)V
    .locals 4

    const v0, -0x158a03b5

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

    const-string v2, "com.stripe.android.link.ui.signup.SignUpBodyPreview (SignUpScreen.kt:52)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/signup/ComposableSingletons$SignUpScreenKt;->INSTANCE:Lcom/stripe/android/link/ui/signup/ComposableSingletons$SignUpScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/signup/ComposableSingletons$SignUpScreenKt;->getLambda-2$link_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBodyPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBodyPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$SignUpBodyPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBodyPreview(LEt0;I)V

    return-void
.end method
