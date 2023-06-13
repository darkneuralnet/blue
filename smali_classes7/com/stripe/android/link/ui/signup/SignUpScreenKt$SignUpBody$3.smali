.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V
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
        "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,240:1\n154#2:241\n154#2:242\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3\n*L\n115#1:241\n124#1:242\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $isReadyToSignUp:Z

.field final synthetic $keyboardController:LnN5;

.field final synthetic $merchantName:Ljava/lang/String;

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $onSignUpClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z

.field final synthetic $signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/ui/signup/SignUpState;Lcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/elements/TextFieldController;IZLkotlin/jvm/functions/Function0;LnN5;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "IZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LnN5;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Z",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$merchantName:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$$dirty:I

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$isReadyToSignUp:Z

    iput-object p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$keyboardController:LnN5;

    iput-object p9, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p10, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$requiresNameCollection:Z

    iput-object p11, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v10, p2

    const-string v1, "$this$ScrollableTopLevelColumn"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0xe

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-interface {v10, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, v1, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous> (SignUpScreen.kt:110)"

    const v5, 0x1ce62d3a

    invoke-static {v5, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget v3, Lcom/stripe/android/link/R$string;->sign_up_header:I

    const/4 v9, 0x0

    invoke-static {v3, v10, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    sget-object v3, LgV2;->b0:LgV2$a;

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v4

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v5, v4, v8, v6}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v13

    sget-object v4, Lr06;->b:Lr06$a;

    invoke-virtual {v4}, Lr06$a;->a()I

    move-result v7

    sget-object v14, LTM2;->a:LTM2;

    sget v15, LTM2;->b:I

    invoke-virtual {v14, v10, v15}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LGc6;->g()LG26;

    move-result-object v31

    invoke-virtual {v14, v10, v15}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LMm0;->g()J

    move-result-wide v16

    move-object/from16 v36, v14

    move/from16 v37, v15

    move-wide/from16 v14, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static {v7}, Lr06;->g(I)Lr06;

    move-result-object v24

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x30

    const/16 v34, 0x0

    const/16 v35, 0x7df8

    move-object/from16 v32, p2

    invoke-static/range {v12 .. v35}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget v7, Lcom/stripe/android/link/R$string;->sign_up_message:I

    new-array v12, v8, [Ljava/lang/Object;

    iget-object v13, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$merchantName:Ljava/lang/String;

    aput-object v13, v12, v9

    const/16 v13, 0x40

    invoke-static {v7, v12, v10, v13}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v3, v5, v8, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v13

    const/4 v14, 0x0

    invoke-static {v2}, Lk61;->g(F)F

    move-result v15

    const/16 v16, 0x0

    const/16 v2, 0x1e

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v17

    const/16 v18, 0x5

    invoke-static/range {v13 .. v19}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v13

    invoke-virtual {v4}, Lr06$a;->a()I

    move-result v2

    move-object/from16 v3, v36

    move/from16 v4, v37

    invoke-virtual {v3, v10, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->c()LG26;

    move-result-object v31

    invoke-virtual {v3, v10, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->h()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static {v2}, Lr06;->g(I)Lr06;

    move-result-object v24

    invoke-static/range {v12 .. v35}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    new-instance v2, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$1;

    iget-object v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v4, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$$dirty:I

    invoke-direct {v2, v3, v4, v5}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$1;-><init>(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;I)V

    const v3, 0x757a51e6

    invoke-static {v10, v3, v8, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v10, v3}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lkotlin/jvm/functions/Function2;LEt0;I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    sget-object v12, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPhoneOrName:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eq v2, v12, :cond_5

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-eqz v2, :cond_5

    move v2, v8

    goto :goto_3

    :cond_5
    move v2, v9

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$2;

    iget-object v13, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    invoke-direct {v7, v13}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$2;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v13, 0x3d039162

    invoke-static {v10, v13, v8, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const/high16 v13, 0x180000

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v13, v1

    const/16 v14, 0x1e

    move-object/from16 v1, p1

    move v15, v8

    move-object/from16 v8, p2

    move/from16 v16, v9

    move v9, v13

    move-object v11, v10

    move v10, v14

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v1, v12, :cond_6

    move v2, v15

    goto :goto_4

    :cond_6
    move/from16 v2, v16

    :goto_4
    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;

    iget-object v7, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-boolean v8, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$isReadyToSignUp:Z

    iget-object v9, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iget-object v10, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$keyboardController:LnN5;

    iget v12, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$$dirty:I

    iget-object v14, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-boolean v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$requiresNameCollection:Z

    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    move-object/from16 v16, v1

    move-object/from16 v17, v7

    move/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move/from16 v21, v12

    move-object/from16 v22, v14

    move/from16 v23, v6

    move-object/from16 v24, v5

    invoke-direct/range {v16 .. v24}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;ZLkotlin/jvm/functions/Function0;LnN5;ILcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V

    const v5, 0xa9b614b

    invoke-static {v11, v5, v15, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const/16 v10, 0x1e

    move-object/from16 v1, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, p2

    move v9, v13

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_5
    return-void
.end method
