.class public final Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001aC\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aq\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001c2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "Preview",
        "(LEt0;I)V",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkPaymentLauncher",
        "",
        "enabled",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "onStateChanged",
        "LgV2;",
        "modifier",
        "LinkInlineSignup",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;ZLkotlin/jvm/functions/Function2;LgV2;LEt0;II)V",
        "",
        "merchantName",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "emailController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "phoneNumberController",
        "nameController",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "signUpState",
        "expanded",
        "requiresNameCollection",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Lkotlin/Function0;",
        "toggleExpanded",
        "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LgV2;LEt0;III)V",
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
        "SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,299:1\n81#2,11:300\n76#3:311\n1057#4,6:312\n76#5:318\n76#5:319\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt\n*L\n95#1:300,11\n106#1:311\n145#1:312,6\n99#1:318\n100#1:319\n*E\n"
    }
.end annotation


# direct methods
.method public static final LinkInlineSignup(Lcom/stripe/android/link/LinkPaymentLauncher;ZLkotlin/jvm/functions/Function2;LgV2;LEt0;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "-",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "linkPaymentLauncher"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStateChanged"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x745c3aa9

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_0

    sget-object v4, LgV2;->b0:LgV2$a;

    goto :goto_0

    :cond_0
    move-object/from16 v4, p3

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:87)"

    invoke-static {v0, v5, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/LinkPaymentLauncher;->getComponent$link_release()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    new-instance v9, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;

    move-result-object v6

    invoke-direct {v9, v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;-><init>(Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v6, 0x671a9c9b

    invoke-interface {v2, v6}, LEt0;->F(I)V

    sget-object v6, Lpv2;->a:Lpv2;

    const/4 v14, 0x6

    invoke-virtual {v6, v2, v14}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v7

    if-eqz v7, :cond_6

    const/4 v8, 0x0

    instance-of v6, v7, Landroidx/lifecycle/e;

    if-eqz v6, :cond_3

    move-object v6, v7

    check-cast v6, Landroidx/lifecycle/e;

    invoke-interface {v6}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v6

    const-string v10, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    sget-object v6, LFE0$a;->b:LFE0$a;

    :goto_1
    move-object v10, v6

    const-class v6, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    const v12, 0x9048

    const/4 v13, 0x0

    move-object v11, v2

    invoke-static/range {v6 .. v13}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v6

    invoke-interface {v2}, LEt0;->Q()V

    check-cast v6, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getViewState()LtP5;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x1

    invoke-static {v7, v8, v2, v9, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getErrorMessage()LtP5;

    move-result-object v11

    invoke-static {v11, v8, v2, v9, v10}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v9

    invoke-static {v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v10

    new-instance v11, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$1;

    invoke-direct {v11, v3, v0, v7, v8}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;LsP5;Lkotlin/coroutines/Continuation;)V

    const/16 v0, 0x40

    invoke-static {v10, v11, v2, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v10

    invoke-interface {v2, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LBv1;

    sget-object v11, Lkv2;->a:Lkv2;

    sget v12, Lkv2;->c:I

    invoke-virtual {v11, v2, v12}, Lkv2;->b(LEt0;I)LnN5;

    move-result-object v11

    invoke-static {v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getSignUpState$link_release()Lcom/stripe/android/link/ui/signup/SignUpState;

    move-result-object v12

    new-instance v13, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$2;

    invoke-direct {v13, v10, v11, v7, v8}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$2;-><init>(LBv1;LnN5;LsP5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v12, v13, v2, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v8

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v10

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v11

    invoke-static {v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getSignUpState$link_release()Lcom/stripe/android/link/ui/signup/SignUpState;

    move-result-object v12

    invoke-static {v7}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$link_release()Z

    move-result v13

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getRequiresNameCollection()Z

    move-result v15

    invoke-static {v9}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$1(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v16

    new-instance v9, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$3;

    invoke-direct {v9, v6}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$1$3;-><init>(Ljava/lang/Object;)V

    sget v6, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->$stable:I

    shl-int/lit8 v7, v6, 0x3

    sget v17, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 v14, v17, 0x6

    or-int/2addr v7, v14

    shl-int/lit8 v6, v6, 0x9

    or-int/2addr v6, v7

    shl-int/lit8 v7, v5, 0xc

    const/high16 v14, 0x70000

    and-int/2addr v7, v14

    or-int v18, v6, v7

    shr-int/lit8 v6, v5, 0x9

    and-int/lit8 v19, v6, 0xe

    const/16 v20, 0x0

    move-object v6, v0

    move-object v7, v8

    move-object v8, v10

    move-object v0, v9

    move-object v9, v11

    move-object v10, v12

    move/from16 v11, p1

    move v12, v13

    move v13, v15

    move-object/from16 v14, v16

    move-object v15, v0

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    invoke-static/range {v6 .. v20}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LgV2;LEt0;III)V

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_5

    goto :goto_3

    :cond_5
    new-instance v8, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$2;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$2;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;ZLkotlin/jvm/functions/Function2;LgV2;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final LinkInlineSignup(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LgV2;LEt0;III)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "ZZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "III)V"
        }
    .end annotation

    move/from16 v14, p12

    const-string v0, "merchantName"

    move-object/from16 v15, p0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailController"

    move-object/from16 v13, p1

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumberController"

    move-object/from16 v12, p2

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameController"

    move-object/from16 v11, p3

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleExpanded"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3cc703a9

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v8

    move/from16 v7, p14

    and-int/lit16 v1, v7, 0x400

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p10

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:131)"

    move/from16 v6, p13

    invoke-static {v0, v14, v6, v1}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_1

    :cond_1
    move/from16 v6, p13

    :goto_1
    invoke-interface {v8}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    new-instance v0, Landroidx/compose/ui/focus/h;

    invoke-direct {v0}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v8, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/focus/h;

    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$3;

    const/4 v2, 0x0

    move/from16 v4, p6

    invoke-direct {v1, v4, v5, v2}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$3;-><init>(ZLandroidx/compose/ui/focus/h;Lkotlin/coroutines/Continuation;)V

    shr-int/lit8 v2, v14, 0x12

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x40

    invoke-static {v0, v1, v8, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    const/4 v3, 0x1

    new-array v2, v3, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    sget-object v1, LWz0;->a:LWz0;

    sget v3, LWz0;->b:I

    if-eqz p5, :cond_3

    invoke-virtual {v1, v8, v3}, LWz0;->c(LEt0;I)F

    move-result v1

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v8, v3}, LWz0;->b(LEt0;I)F

    move-result v1

    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    new-instance v3, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4;

    move-object v0, v3

    move-object/from16 v1, v16

    move-object v14, v2

    move-object/from16 v2, p9

    move-object v15, v3

    move-object/from16 p10, v14

    const/4 v14, 0x1

    move/from16 v3, p12

    move/from16 v4, p6

    move-object/from16 v17, v5

    move/from16 v5, p5

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v18, v8

    move-object/from16 v8, p4

    move-object/from16 v9, v17

    move-object/from16 v10, p8

    move-object/from16 v11, p2

    move/from16 v12, p7

    move-object/from16 v13, p3

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4;-><init>(LgV2;Lkotlin/jvm/functions/Function0;IZZLjava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;Lcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V

    const v0, -0x28f1c797

    move-object/from16 v1, v18

    invoke-static {v1, v0, v14, v15}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x38

    move-object/from16 v3, p10

    invoke-static {v3, v0, v1, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v15

    if-nez v15, :cond_5

    goto :goto_3

    :cond_5
    new-instance v14, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$5;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, v16

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v19, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$5;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LgV2;III)V

    move-object/from16 v0, v19

    invoke-interface {v15, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method private static final LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;)",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    return-object p0
.end method

.method private static final LinkInlineSignup$lambda$2$lambda$1(LsP5;)Lcom/stripe/android/link/ui/ErrorMessage;
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

.method private static final Preview(LEt0;I)V
    .locals 4

    const v0, -0x5f2d6c77

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

    const-string v2, "com.stripe.android.link.ui.inline.Preview (LinkInlineSignup.kt:65)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupKt;->INSTANCE:Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupKt;->getLambda-2$link_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$Preview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$Preview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->LinkInlineSignup$lambda$2$lambda$0(LsP5;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$Preview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt;->Preview(LEt0;I)V

    return-void
.end method
