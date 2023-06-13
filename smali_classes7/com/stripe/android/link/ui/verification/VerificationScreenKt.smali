.class public final Lcom/stripe/android/link/ui/verification/VerificationScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aM\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000e2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000eH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010 \u001a-\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000c2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000eH\u0003\u00a2\u0006\u0004\u0008!\u0010\"\u001a-\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000c2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000eH\u0003\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "",
        "VerificationBodyPreview",
        "(LEt0;I)V",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "VerificationBodyFullFlow",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V",
        "",
        "headerStringResId",
        "messageStringResId",
        "",
        "showChangeEmailMessage",
        "Lkotlin/Function0;",
        "onVerificationCompleted",
        "VerificationBody",
        "(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "",
        "redactedPhoneNumber",
        "email",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "otpElement",
        "isProcessing",
        "isSendingNewCode",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Landroidx/compose/ui/focus/h;",
        "focusRequester",
        "onBack",
        "onChangeEmailClick",
        "onResendCodeClick",
        "(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "ChangeEmailRow",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V",
        "onClick",
        "ResendCodeButton",
        "(ZZLkotlin/jvm/functions/Function0;LEt0;I)V",
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
        "SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,312:1\n81#2,11:313\n76#3:324\n76#3:325\n76#3:340\n76#3:380\n25#4:326\n460#4,13:352\n473#4,3:367\n460#4,13:392\n473#4,3:409\n1057#5,6:327\n154#6:333\n154#6:366\n154#6:372\n154#6:373\n154#6:406\n154#6:407\n154#6:408\n76#7,5:334\n81#7:365\n85#7:371\n75#8:339\n76#8,11:341\n89#8:370\n75#8:379\n76#8,11:381\n89#8:412\n68#9,5:374\n73#9:405\n77#9:413\n76#10:414\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt\n*L\n103#1:313,11\n116#1:324\n117#1:325\n238#1:340\n271#1:380\n118#1:326\n238#1:352,13\n238#1:367,3\n271#1:392,13\n271#1:409,3\n118#1:327,6\n239#1:333\n253#1:366\n273#1:372\n275#1:373\n299#1:406\n305#1:407\n307#1:408\n238#1:334,5\n238#1:365\n238#1:371\n238#1:339\n238#1:341,11\n238#1:370\n271#1:379\n271#1:381,11\n271#1:412\n271#1:374,5\n271#1:405\n271#1:413\n110#1:414\n*E\n"
    }
.end annotation


# direct methods
.method private static final ChangeEmailRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v9, p2

    move/from16 v10, p4

    const v2, 0x5b061e22

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v8

    and-int/lit8 v3, v10, 0xe

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-interface {v8, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move v3, v10

    :goto_1
    and-int/lit8 v5, v10, 0x70

    if-nez v5, :cond_3

    invoke-interface {v8, v1}, LEt0;->o(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v10, 0x380

    if-nez v5, :cond_5

    invoke-interface {v8, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v3, v3, 0x2db

    const/16 v5, 0x92

    if-ne v3, v5, :cond_7

    invoke-interface {v8}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v8}, LEt0;->k()V

    move-object v2, v8

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v5, "com.stripe.android.link.ui.verification.ChangeEmailRow (VerificationScreen.kt:232)"

    invoke-static {v2, v10, v3, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v3, 0xe

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v6, v3, v7, v5}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->b()Llo$e;

    move-result-object v5

    const v6, 0x2952b718

    invoke-interface {v8, v6}, LEt0;->F(I)V

    sget-object v6, LK9;->a:LK9$a;

    invoke-virtual {v6}, LK9$a;->k()LK9$c;

    move-result-object v6

    const/4 v11, 0x6

    invoke-static {v5, v6, v8, v11}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v8, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v8, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v11

    invoke-interface {v8, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v8, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v13, LBt0;->M:LBt0$a;

    invoke-virtual {v13}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v8}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v8}, LEt0;->h()V

    invoke-interface {v8}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v8, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_a
    invoke-interface {v8}, LEt0;->e()V

    :goto_5
    invoke-interface {v8}, LEt0;->L()V

    invoke-static {v8}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v14

    invoke-virtual {v13}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v5, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v11, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v12, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v8}, LEt0;->q()V

    invoke-static {v8}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v3, v5, v8, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v8, v3}, LEt0;->F(I)V

    const v3, -0x286e2e7f

    invoke-interface {v8, v3}, LEt0;->F(I)V

    sget-object v3, Lad5;->a:Lad5;

    const v5, 0x72105f86

    invoke-interface {v8, v5}, LEt0;->F(I)V

    sget v5, Lcom/stripe/android/link/R$string;->verification_not_email:I

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v6

    const/16 v11, 0x40

    invoke-static {v5, v7, v8, v11}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v11

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v2, v5, v6}, LZc5;->a(LgV2;FZ)LgV2;

    move-result-object v12

    sget-object v7, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-virtual {v7, v8, v5}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->h()J

    move-result-wide v13

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    sget-object v3, Ln26;->a:Ln26$a;

    invoke-virtual {v3}, Ln26$a;->b()I

    move-result v26

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    invoke-virtual {v7, v8, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v3

    invoke-virtual {v3}, LGc6;->d()LG26;

    move-result-object v30

    const/16 v32, 0x0

    const/16 v33, 0xc30

    const/16 v34, 0x57f8

    move-object/from16 v31, v8

    invoke-static/range {v11 .. v34}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget v3, Lcom/stripe/android/link/R$string;->verification_change_email:I

    invoke-static {v3, v8, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v31

    int-to-float v3, v4

    invoke-static {v3}, Lk61;->g(F)F

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xe

    move-object v11, v2

    invoke-static/range {v11 .. v17}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    xor-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move v15, v5

    move-object v5, v6

    move-object/from16 v6, p2

    move-object v13, v7

    move v7, v11

    move-object v11, v8

    move-object v8, v12

    invoke-static/range {v2 .. v8}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v12

    invoke-static {v13, v11, v15}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getActionLabel-0d7_KjU()J

    move-result-wide v2

    move-object v4, v13

    move-wide v13, v2

    const-wide/16 v2, 0x0

    move v5, v15

    move-wide v15, v2

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    invoke-virtual {v4, v11, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v2

    invoke-virtual {v2}, LGc6;->d()LG26;

    move-result-object v30

    const/16 v32, 0x0

    const/16 v33, 0xc00

    const/16 v34, 0x5ff8

    move-object v2, v11

    move-object/from16 v11, v31

    move-object/from16 v31, v2

    invoke-static/range {v11 .. v34}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v2}, LEt0;->Q()V

    invoke-interface {v2}, LEt0;->Q()V

    invoke-interface {v2}, LEt0;->Q()V

    invoke-interface {v2}, LEt0;->f()V

    invoke-interface {v2}, LEt0;->Q()V

    invoke-interface {v2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_6
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$ChangeEmailRow$2;

    invoke-direct {v3, v0, v1, v9, v10}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$ChangeEmailRow$2;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final ResendCodeButton(ZZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v9, p2

    move/from16 v10, p4

    const v2, -0x64a287b3

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v3, v10, 0xe

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move v3, v10

    :goto_1
    and-int/lit8 v4, v10, 0x70

    if-nez v4, :cond_3

    invoke-interface {v15, v1}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v10, 0x380

    if-nez v4, :cond_5

    invoke-interface {v15, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v3, v3, 0x2db

    const/16 v4, 0x92

    if-ne v3, v4, :cond_7

    invoke-interface {v15}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LEt0;->k()V

    move-object v3, v15

    goto/16 :goto_9

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.verification.ResendCodeButton (VerificationScreen.kt:265)"

    invoke-static {v2, v10, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    sget-object v14, LgV2;->b0:LgV2$a;

    const/16 v17, 0x0

    const/16 v2, 0xc

    int-to-float v11, v2

    invoke-static {v11}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v22, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v3, 0x1

    int-to-float v4, v3

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    sget-object v8, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-static {v8, v15, v7}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v5

    invoke-static {v8, v15, v7}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/link/theme/LinkShapes;->getExtraSmall()Lbc5;

    move-result-object v3

    invoke-static {v2, v4, v5, v6, v3}, LdZ;->g(LgV2;FJLhy5;)LgV2;

    move-result-object v2

    invoke-static {v8, v15, v7}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkShapes;->getExtraSmall()Lbc5;

    move-result-object v3

    invoke-static {v2, v3}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v2

    const/4 v6, 0x0

    if-nez v0, :cond_9

    if-nez v1, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    move v3, v6

    :goto_5
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    move v13, v6

    move-object/from16 v6, p2

    move v12, v7

    move/from16 v7, v16

    move-object/from16 v35, v8

    move-object/from16 v8, v17

    invoke-static/range {v2 .. v8}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->e()LK9;

    move-result-object v3

    const v4, 0x2bb5b5d7

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const/4 v4, 0x6

    invoke-static {v3, v13, v15, v4}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v15, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v15, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LEt0;->e()V

    :goto_6
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v8, v3, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v3, v15, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v15, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v15, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, -0x1becbf9

    invoke-interface {v15, v2}, LEt0;->F(I)V

    if-eqz v0, :cond_c

    const v3, 0x7bdbe3cd

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v3, LWz0;->a:LWz0;

    sget v4, LWz0;->b:I

    invoke-virtual {v3, v15, v4}, LWz0;->b(LEt0;I)F

    move-result v3

    invoke-interface {v15}, LEt0;->Q()V

    goto :goto_7

    :cond_c
    if-eqz v1, :cond_d

    const v3, 0x7bdbe416

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-interface {v15}, LEt0;->Q()V

    const/4 v3, 0x0

    goto :goto_7

    :cond_d
    const v3, 0x7bdbe436

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v3, LWz0;->a:LWz0;

    sget v4, LWz0;->b:I

    invoke-virtual {v3, v15, v4}, LWz0;->c(LEt0;I)F

    move-result v3

    invoke-interface {v15}, LEt0;->Q()V

    :goto_7
    sget v4, Lcom/stripe/android/link/R$string;->verification_resend:I

    const/4 v5, 0x0

    invoke-static {v4, v15, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    move v5, v11

    move-object v11, v4

    move-object/from16 v4, v35

    invoke-virtual {v4, v15, v12}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v6

    invoke-virtual {v6}, LGc6;->e()LG26;

    move-result-object v30

    invoke-virtual {v4, v15, v12}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v6

    invoke-virtual {v6}, LMm0;->g()J

    move-result-wide v6

    move-object v8, v14

    const/4 v2, 0x2

    move-wide v13, v6

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v8, v5, v6}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v5

    invoke-static {v5, v3}, LU9;->a(LgV2;F)LgV2;

    move-result-object v3

    move v5, v12

    move-object v12, v3

    const-wide/16 v6, 0x0

    move-object v3, v15

    move-wide v15, v6

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x7ff8

    move-object/from16 v31, v3

    invoke-static/range {v11 .. v34}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-virtual {v4, v3, v5}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->g()J

    move-result-wide v12

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v14

    const/16 v2, 0x12

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v8, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    if-eqz v1, :cond_e

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    invoke-static {v2, v4}, LU9;->a(LgV2;F)LgV2;

    move-result-object v11

    const/16 v16, 0x180

    const/16 v17, 0x0

    move-object v15, v3

    invoke-static/range {v11 .. v17}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_9
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_a

    :cond_10
    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$ResendCodeButton$2;

    invoke-direct {v3, v0, v1, v9, v10}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$ResendCodeButton$2;-><init>(ZZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final VerificationBody(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/core/injection/NonFallbackInjector;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    const-string v0, "linkAccount"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injector"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2ad2f468

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p8, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object/from16 v6, p5

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v8, "com.stripe.android.link.ui.verification.VerificationBody (VerificationScreen.kt:94)"

    invoke-static {v0, v7, v2, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    new-instance v11, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    invoke-direct {v11, v4, v5}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v0, 0x671a9c9b

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, Lpv2;->a:Lpv2;

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v9

    if-eqz v9, :cond_7

    const/4 v10, 0x0

    instance-of v0, v9, Landroidx/lifecycle/e;

    if-eqz v0, :cond_2

    move-object v0, v9

    check-cast v0, Landroidx/lifecycle/e;

    invoke-interface {v0}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v0

    const-string v2, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    sget-object v0, LFE0$a;->b:LFE0$a;

    :goto_1
    move-object v12, v0

    const-class v8, Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    const v14, 0x9048

    const/4 v15, 0x0

    move-object v13, v1

    invoke-static/range {v8 .. v15}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v0

    invoke-interface {v1}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getViewState()LtP5;

    move-result-object v2

    const/16 v8, 0x8

    const/4 v9, 0x1

    invoke-static {v2, v3, v1, v8, v9}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v2

    if-eqz v6, :cond_3

    invoke-virtual {v0, v6}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->setOnVerificationCompleted(Lkotlin/jvm/functions/Function0;)V

    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Landroid/content/Context;

    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LBv1;

    const v9, -0x1d58f75c

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_4

    new-instance v9, Landroidx/compose/ui/focus/h;

    invoke-direct {v9}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v1, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {v1}, LEt0;->Q()V

    move-object/from16 v17, v9

    check-cast v17, Landroidx/compose/ui/focus/h;

    sget-object v9, Lkv2;->a:Lkv2;

    sget v10, Lkv2;->c:I

    invoke-virtual {v9, v1, v10}, Lkv2;->b(LEt0;I)LnN5;

    move-result-object v10

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v11, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;

    invoke-direct {v11, v8, v10, v2, v3}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;-><init>(LBv1;LnN5;LsP5;Lkotlin/coroutines/Continuation;)V

    const/16 v15, 0x40

    invoke-static {v9, v11, v1, v15}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->getRequestFocus()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    new-instance v12, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$3;

    const/16 v16, 0x0

    move-object v8, v12

    move-object/from16 v9, v17

    move-object v11, v0

    move-object v3, v12

    move-object v12, v2

    move-object v4, v13

    move-object/from16 v13, v16

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$3;-><init>(Landroidx/compose/ui/focus/h;LnN5;Lcom/stripe/android/link/ui/verification/VerificationViewModel;LsP5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v4, v3, v1, v15}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->getDidSendNewCode()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$4;

    const/4 v8, 0x0

    invoke-direct {v4, v14, v0, v2, v8}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$4;-><init>(Landroid/content/Context;Lcom/stripe/android/link/ui/verification/VerificationViewModel;LsP5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v4, v1, v15}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/model/LinkAccount;->getRedactedPhoneNumber()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v13

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing()Z

    move-result v14

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode()Z

    move-result v15

    invoke-static {v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->getErrorMessage()Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v16

    new-instance v2, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$5;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$5;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$6;

    invoke-direct {v3, v0}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$6;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$7;

    invoke-direct {v4, v0}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$7;-><init>(Ljava/lang/Object;)V

    and-int/lit8 v0, v7, 0xe

    and-int/lit8 v8, v7, 0x70

    or-int/2addr v0, v8

    and-int/lit16 v8, v7, 0x380

    or-int/2addr v0, v8

    sget v8, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v8, v8, 0xf

    or-int/2addr v0, v8

    sget v8, Landroidx/compose/ui/focus/h;->c:I

    shl-int/lit8 v8, v8, 0x1b

    or-int v22, v0, v8

    const/16 v23, 0x0

    move/from16 v8, p0

    move/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v1

    invoke-static/range {v8 .. v23}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_6

    goto :goto_2

    :cond_6
    new-instance v10, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$8;

    move-object v0, v10

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$8;-><init>(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "ZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Landroidx/compose/ui/focus/h;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v15, p3

    move-object/from16 v14, p4

    move-object/from16 v13, p5

    move-object/from16 v12, p9

    move-object/from16 v11, p10

    move-object/from16 v10, p11

    move-object/from16 v9, p12

    move/from16 v8, p14

    move/from16 v7, p15

    const-string v0, "redactedPhoneNumber"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otpElement"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusRequester"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onChangeEmailClick"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResendCodeClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xf3146ca

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v6

    and-int/lit8 v1, v8, 0xe

    move/from16 v5, p0

    if-nez v1, :cond_1

    invoke-interface {v6, v5}, LEt0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v4, v8, 0x70

    const/16 v16, 0x20

    const/16 v17, 0x10

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-interface {v6, v4}, LEt0;->r(I)Z

    move-result v18

    if-eqz v18, :cond_2

    move/from16 v18, v16

    goto :goto_2

    :cond_2
    move/from16 v18, v17

    :goto_2
    or-int v1, v1, v18

    goto :goto_3

    :cond_3
    move/from16 v4, p1

    :goto_3
    and-int/lit16 v2, v8, 0x380

    const/16 v18, 0x100

    const/16 v19, 0x80

    if-nez v2, :cond_5

    move/from16 v2, p2

    invoke-interface {v6, v2}, LEt0;->o(Z)Z

    move-result v20

    if-eqz v20, :cond_4

    move/from16 v20, v18

    goto :goto_4

    :cond_4
    move/from16 v20, v19

    :goto_4
    or-int v1, v1, v20

    goto :goto_5

    :cond_5
    move/from16 v2, p2

    :goto_5
    and-int/lit16 v3, v8, 0x1c00

    if-nez v3, :cond_7

    invoke-interface {v6, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_6

    :cond_6
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v1, v3

    :cond_7
    const v3, 0xe000

    and-int/2addr v3, v8

    if-nez v3, :cond_9

    invoke-interface {v6, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_7

    :cond_8
    const/16 v3, 0x2000

    :goto_7
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x70000

    and-int/2addr v3, v8

    if-nez v3, :cond_b

    invoke-interface {v6, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v3, 0x10000

    :goto_8
    or-int/2addr v1, v3

    :cond_b
    const/high16 v3, 0x380000

    and-int/2addr v3, v8

    if-nez v3, :cond_d

    move/from16 v3, p6

    invoke-interface {v6, v3}, LEt0;->o(Z)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v21, 0x80000

    :goto_9
    or-int v1, v1, v21

    goto :goto_a

    :cond_d
    move/from16 v3, p6

    :goto_a
    const/high16 v21, 0x1c00000

    and-int v21, v8, v21

    move/from16 v0, p7

    if-nez v21, :cond_f

    invoke-interface {v6, v0}, LEt0;->o(Z)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v22, 0x400000

    :goto_b
    or-int v1, v1, v22

    :cond_f
    const/high16 v22, 0xe000000

    and-int v22, v8, v22

    move-object/from16 v15, p8

    if-nez v22, :cond_11

    invoke-interface {v6, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_10

    const/high16 v22, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v22, 0x2000000

    :goto_c
    or-int v1, v1, v22

    :cond_11
    const/high16 v22, 0x70000000

    and-int v22, v8, v22

    if-nez v22, :cond_13

    invoke-interface {v6, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_12

    const/high16 v22, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v22, 0x10000000

    :goto_d
    or-int v1, v1, v22

    :cond_13
    and-int/lit8 v22, v7, 0xe

    if-nez v22, :cond_15

    invoke-interface {v6, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_14

    const/16 v20, 0x4

    goto :goto_e

    :cond_14
    const/16 v20, 0x2

    :goto_e
    or-int v20, v7, v20

    goto :goto_f

    :cond_15
    move/from16 v20, v7

    :goto_f
    and-int/lit8 v22, v7, 0x70

    if-nez v22, :cond_17

    invoke-interface {v6, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_16

    goto :goto_10

    :cond_16
    move/from16 v16, v17

    :goto_10
    or-int v20, v20, v16

    :cond_17
    and-int/lit16 v0, v7, 0x380

    if-nez v0, :cond_19

    invoke-interface {v6, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_11

    :cond_18
    move/from16 v18, v19

    :goto_11
    or-int v0, v20, v18

    goto :goto_12

    :cond_19
    move/from16 v0, v20

    :goto_12
    const v16, 0x5b6db6db

    and-int v2, v1, v16

    const v3, 0x12492492

    if-ne v2, v3, :cond_1b

    and-int/lit16 v2, v0, 0x2db

    const/16 v3, 0x92

    if-ne v2, v3, :cond_1b

    invoke-interface {v6}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-interface {v6}, LEt0;->k()V

    move-object v1, v6

    goto :goto_14

    :cond_1b
    :goto_13
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_1c

    const-string v2, "com.stripe.android.link.ui.verification.VerificationBody (VerificationScreen.kt:163)"

    const v3, 0xf3146ca

    invoke-static {v3, v1, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1c
    shl-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0x70

    const/4 v3, 0x0

    const/4 v15, 0x1

    invoke-static {v3, v11, v6, v2, v15}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;

    move/from16 v20, v0

    move-object v0, v3

    move v2, v1

    move/from16 v1, p0

    move-object/from16 v23, v3

    move/from16 v3, p1

    move-object/from16 v4, p3

    move/from16 v5, p2

    move-object/from16 v24, v6

    move-object/from16 v6, p4

    move/from16 v7, p6

    move-object/from16 v8, p11

    move/from16 v9, v20

    move-object/from16 v10, p8

    move/from16 v11, p7

    move-object/from16 v12, p12

    move-object/from16 v13, p5

    move-object/from16 v14, p9

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;-><init>(IIILjava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;ILcom/stripe/android/link/ui/ErrorMessage;ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/focus/h;)V

    const v0, -0x51bfe7ad

    move-object/from16 v2, v23

    move-object/from16 v1, v24

    invoke-static {v1, v0, v15, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lcom/stripe/android/link/ui/CommonKt;->ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LQt0;->Y()V

    :cond_1d
    :goto_14
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v15

    if-nez v15, :cond_1e

    goto :goto_15

    :cond_1e
    new-instance v14, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;

    move-object v0, v14

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v25, v14

    move/from16 v14, p14

    move-object/from16 v26, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;-><init>(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    move-object/from16 v1, v25

    move-object/from16 v0, v26

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_15
    return-void
.end method

.method private static final VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;)",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    return-object p0
.end method

.method public static final VerificationBodyFullFlow(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V
    .locals 10

    const-string v0, "linkAccount"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x67faaba7

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.verification.VerificationBodyFullFlow (VerificationScreen.kt:79)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget v1, Lcom/stripe/android/link/R$string;->verification_header:I

    sget v2, Lcom/stripe/android/link/R$string;->verification_message:I

    const/4 v3, 0x1

    const/4 v6, 0x0

    const v8, 0x9180

    const/16 v9, 0x20

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBodyFullFlow$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBodyFullFlow$1;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final VerificationBodyPreview(LEt0;I)V
    .locals 4

    const v0, -0x3db3ee38

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

    const-string v2, "com.stripe.android.link.ui.verification.VerificationBodyPreview (VerificationScreen.kt:56)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt;->INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt;->getLambda-2$link_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBodyPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBodyPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$ChangeEmailRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->ChangeEmailRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ResendCodeButton(ZZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->ResendCodeButton(ZZLkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$VerificationBodyPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBodyPreview(LEt0;I)V

    return-void
.end method
