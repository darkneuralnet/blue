.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3;->invoke(LPm0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LTe;",
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
        "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,240:1\n74#2,6:241\n80#2:273\n84#2:286\n75#3:247\n76#3,11:249\n89#3:285\n76#4:248\n460#5,13:260\n50#5:274\n49#5:275\n473#5,3:282\n1057#6,6:276\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3\n*L\n146#1:241,6\n146#1:273\n146#1:286\n146#1:247\n146#1:249,11\n146#1:285\n146#1:248\n146#1:260,13\n187#1:274\n187#1:275\n146#1:282,3\n187#1:276,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $isReadyToSignUp:Z

.field final synthetic $keyboardController:LnN5;

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


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/ErrorMessage;ZLkotlin/jvm/functions/Function0;LnN5;ILcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LnN5;",
            "I",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Z",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$isReadyToSignUp:Z

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$keyboardController:LnN5;

    iput p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$$dirty:I

    iput-object p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$requiresNameCollection:Z

    iput-object p8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->invoke(LTe;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v11, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:144)"

    const v3, 0xa9b614b

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-boolean v12, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$isReadyToSignUp:Z

    iget-object v13, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iget-object v14, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$keyboardController:LnN5;

    iget v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$$dirty:I

    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-boolean v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$requiresNameCollection:Z

    iget-object v7, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    const v8, -0x1cd0f17e

    invoke-interface {v11, v8}, LEt0;->F(I)V

    sget-object v8, Llo;->a:Llo;

    invoke-virtual {v8}, Llo;->g()Llo$l;

    move-result-object v8

    sget-object v9, LK9;->a:LK9$a;

    invoke-virtual {v9}, LK9$a;->j()LK9$b;

    move-result-object v9

    const/4 v15, 0x0

    invoke-static {v8, v9, v11, v15}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v8

    const v9, -0x4ee9b9da

    invoke-interface {v11, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v11, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v11, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v11, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_0
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v0, v8, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v0, v9, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v0, v10, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v0, v4, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v0, v11, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v11, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v11, v0}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v0, -0x68de396b

    invoke-interface {v11, v0}, LEt0;->F(I)V

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;

    invoke-direct {v0, v5, v6, v3, v7}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZILcom/stripe/android/uicore/elements/TextFieldController;)V

    const v3, 0x5bf8b041    # 1.39999175E17f

    const/4 v4, 0x1

    invoke-static {v11, v3, v4, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v3, 0x6

    invoke-static {v0, v11, v3}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lkotlin/jvm/functions/Function2;LEt0;I)V

    if-eqz v2, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$2;

    invoke-direct {v7, v2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$2;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v2, -0xe53bf43

    const/4 v8, 0x1

    invoke-static {v11, v2, v8, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const v9, 0x180006

    const/16 v10, 0x1e

    move v2, v0

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    sget v0, Lcom/stripe/android/link/R$string;->sign_up:I

    const/4 v1, 0x0

    invoke-static {v0, v11, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v12, :cond_4

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :goto_2
    move-object v2, v0

    const v0, 0x1e7b2b64

    invoke-interface {v11, v0}, LEt0;->F(I)V

    invoke-interface {v11, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_5

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_6

    :cond_5
    new-instance v3, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$3$1;

    invoke-direct {v3, v13, v14}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$3$1;-><init>(Lkotlin/jvm/functions/Function0;LnN5;)V

    invoke-interface {v11, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    return-void
.end method
