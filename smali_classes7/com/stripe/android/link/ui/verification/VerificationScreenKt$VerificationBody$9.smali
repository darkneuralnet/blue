.class final Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,312:1\n154#2:313\n154#2:314\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9\n*L\n185#1:313\n194#1:314\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $$dirty1:I

.field final synthetic $email:Ljava/lang/String;

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $headerStringResId:I

.field final synthetic $isProcessing:Z

.field final synthetic $isSendingNewCode:Z

.field final synthetic $messageStringResId:I

.field final synthetic $onChangeEmailClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onResendCodeClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $redactedPhoneNumber:Ljava/lang/String;

.field final synthetic $showChangeEmailMessage:Z


# direct methods
.method public constructor <init>(IIILjava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;ILcom/stripe/android/link/ui/ErrorMessage;ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/focus/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "Landroidx/compose/ui/focus/h;",
            ")V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$headerStringResId:I

    iput p2, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    iput p3, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$messageStringResId:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$redactedPhoneNumber:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$showChangeEmailMessage:Z

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$email:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isProcessing:Z

    iput-object p8, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty1:I

    iput-object p10, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-boolean p11, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isSendingNewCode:Z

    iput-object p12, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iput-object p14, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$focusRequester:Landroidx/compose/ui/focus/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    const-string v2, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v14, v2

    goto :goto_1

    :cond_1
    move/from16 v14, p3

    :goto_1
    and-int/lit8 v2, v14, 0x5b

    const/16 v13, 0x12

    if-ne v2, v13, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous> (VerificationScreen.kt:180)"

    const v5, -0x51bfe7ad

    invoke-static {v5, v14, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    iget v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$headerStringResId:I

    iget v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    and-int/lit8 v4, v4, 0xe

    invoke-static {v2, v15, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    sget-object v11, LgV2;->b0:LgV2$a;

    int-to-float v12, v3

    invoke-static {v12}, Lk61;->g(F)F

    move-result v3

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    invoke-static {v11, v10, v3, v9, v8}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v26, Lr06;->b:Lr06$a;

    invoke-virtual/range {v26 .. v26}, Lr06$a;->a()I

    move-result v16

    sget-object v6, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-virtual {v6, v15, v7}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v4

    invoke-virtual {v4}, LGc6;->g()LG26;

    move-result-object v21

    invoke-virtual {v6, v15, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->g()J

    move-result-wide v4

    const-wide/16 v17, 0x0

    move-object/from16 v27, v6

    move/from16 v28, v7

    move-wide/from16 v6, v17

    const/16 v17, 0x0

    move-object/from16 v8, v17

    move-object/from16 v9, v17

    move-object/from16 v10, v17

    const-wide/16 v17, 0x0

    move-object/from16 v30, v11

    move/from16 v31, v12

    move-wide/from16 v11, v17

    const/16 v17, 0x0

    move/from16 v32, v13

    move-object/from16 v13, v17

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move/from16 v33, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x30

    const/16 v24, 0x0

    const/16 v25, 0x7df8

    move-object/from16 v22, p2

    invoke-static/range {v2 .. v25}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    iget v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$messageStringResId:I

    const/4 v15, 0x1

    new-array v3, v15, [Ljava/lang/Object;

    iget-object v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$redactedPhoneNumber:Ljava/lang/String;

    const/16 v29, 0x0

    aput-object v4, v3, v29

    iget v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v4, v4, 0x40

    move-object/from16 v14, p2

    invoke-static {v2, v3, v14, v4}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v30

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v5, v15, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static/range {v31 .. v31}, Lk61;->g(F)F

    move-result v8

    const/4 v9, 0x0

    const/16 v3, 0x14

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v10

    const/4 v11, 0x5

    const/4 v12, 0x0

    invoke-static/range {v6 .. v12}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v3

    invoke-virtual/range {v26 .. v26}, Lr06$a;->a()I

    move-result v16

    move-object/from16 v4, v27

    move/from16 v5, v28

    invoke-virtual {v4, v14, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v6

    invoke-virtual {v6}, LGc6;->c()LG26;

    move-result-object v21

    invoke-virtual {v4, v14, v5}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->h()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    invoke-static/range {v2 .. v25}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    new-instance v2, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$1;

    iget-boolean v3, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isProcessing:Z

    iget-object v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iget-object v5, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$focusRequester:Landroidx/compose/ui/focus/h;

    iget v6, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$1;-><init>(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/focus/h;I)V

    const v3, -0x2a929ca5

    move-object/from16 v11, p2

    const/4 v4, 0x1

    invoke-static {v11, v3, v4, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v11, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->DefaultStripeTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V

    const v2, -0x7d47e8e3

    invoke-interface {v11, v2}, LEt0;->F(I)V

    iget-boolean v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$showChangeEmailMessage:Z

    if-eqz v2, :cond_5

    iget-object v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$email:Ljava/lang/String;

    iget-boolean v3, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isProcessing:Z

    iget-object v5, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    iget v6, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    shr-int/lit8 v7, v6, 0xc

    and-int/lit8 v7, v7, 0xe

    shr-int/lit8 v6, v6, 0xf

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v6, v7

    iget v7, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty1:I

    shl-int/lit8 v7, v7, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v6, v7

    invoke-static {v2, v3, v5, v11, v6}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->access$ChangeEmailRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    iget-object v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-eqz v2, :cond_6

    move/from16 v29, v4

    :cond_6
    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$2;

    invoke-direct {v8, v2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$2;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v2, 0x52acb52b

    invoke-static {v11, v2, v4, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    const/high16 v2, 0x180000

    and-int/lit8 v4, v33, 0xe

    or-int v9, v4, v2

    const/16 v10, 0x1e

    move-object/from16 v1, p1

    move/from16 v2, v29

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    iget-boolean v1, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isProcessing:Z

    iget-boolean v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$isSendingNewCode:Z

    iget-object v3, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    iget v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty:I

    shr-int/lit8 v5, v4, 0x12

    and-int/lit8 v5, v5, 0xe

    shr-int/lit8 v4, v4, 0x12

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v5

    iget v5, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9;->$$dirty1:I

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    invoke-static {v1, v2, v3, v11, v4}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->access$ResendCodeButton(ZZLkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
