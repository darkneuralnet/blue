.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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
        "SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,299:1\n67#2,6:300\n73#2:332\n77#2:464\n75#3:306\n76#3,11:308\n75#3:346\n76#3,11:348\n75#3:380\n76#3,11:382\n75#3:415\n76#3,11:417\n89#3:448\n89#3:453\n89#3:458\n89#3:463\n76#4:307\n76#4:347\n76#4:381\n76#4:416\n76#4:442\n76#4:444\n460#5,13:319\n36#5:333\n460#5,13:359\n460#5,13:393\n460#5,13:428\n473#5,3:445\n473#5,3:450\n473#5,3:455\n473#5,3:460\n1057#6,6:334\n74#7,6:340\n80#7:372\n73#7,7:408\n80#7:441\n84#7:449\n84#7:459\n154#8:373\n154#8:407\n154#8:443\n75#9,6:374\n81#9:406\n85#9:454\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1\n*L\n157#1:300,6\n157#1:332\n157#1:464\n157#1:306\n157#1:308,11\n168#1:346\n168#1:348,11\n176#1:380\n176#1:382,11\n186#1:415\n186#1:417,11\n186#1:448\n176#1:453\n168#1:458\n157#1:463\n157#1:307\n168#1:347\n176#1:381\n186#1:416\n191#1:442\n200#1:444\n157#1:319,13\n172#1:333\n168#1:359,13\n176#1:393,13\n186#1:428,13\n186#1:445,3\n176#1:450,3\n168#1:455,3\n157#1:460,3\n172#1:334,6\n168#1:340,6\n168#1:372\n186#1:408,7\n186#1:441\n186#1:449\n168#1:459\n178#1:373\n183#1:407\n197#1:443\n176#1:374,6\n176#1:406\n176#1:454\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $enabled:Z

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $expanded:Z

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $merchantName:Ljava/lang/String;

.field final synthetic $modifier:LgV2;

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z

.field final synthetic $signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

.field final synthetic $toggleExpanded:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LgV2;Lkotlin/jvm/functions/Function0;IZZLjava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;Lcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;IZZ",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Landroidx/compose/ui/focus/h;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Z",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$modifier:LgV2;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$toggleExpanded:Lkotlin/jvm/functions/Function0;

    iput p3, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$$dirty:I

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$expanded:Z

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$enabled:Z

    iput-object p6, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$merchantName:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p8, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-object p9, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    iput-object p10, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p11, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p12, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$requiresNameCollection:Z

    iput-object p13, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 66

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous> (LinkInlineSignup.kt:155)"

    const v4, 0x6c020617

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$modifier:LgV2;

    sget-object v15, LTM2;->a:LTM2;

    sget v13, LTM2;->b:I

    or-int/lit8 v2, v13, 0x30

    const/4 v12, 0x0

    invoke-static {v15, v12, v14, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStroke(LTM2;ZLEt0;I)LeZ;

    move-result-object v2

    invoke-static {v15, v14, v13}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v3

    invoke-static {v1, v2, v3}, LdZ;->f(LgV2;LeZ;Lhy5;)LgV2;

    move-result-object v1

    invoke-static {v15, v14, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v2

    invoke-static {v15, v14, v13}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$toggleExpanded:Lkotlin/jvm/functions/Function0;

    iget v10, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$$dirty:I

    iget-boolean v11, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$expanded:Z

    iget-boolean v9, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$enabled:Z

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$merchantName:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v6, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    iget-object v4, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-object/from16 v16, v8

    iget-boolean v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$requiresNameCollection:Z

    move/from16 v17, v8

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    const v12, 0x2bb5b5d7

    invoke-interface {v14, v12}, LEt0;->F(I)V

    sget-object v12, LK9;->a:LK9$a;

    invoke-virtual {v12}, LK9$a;->n()LK9;

    move-result-object v0

    move-object/from16 v18, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v14, v3}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v0

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    move-object/from16 v20, v4

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    move-object/from16 v21, v5

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v22, LBt0;->M:LBt0$a;

    move-object/from16 v23, v6

    invoke-virtual/range {v22 .. v22}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    move-object/from16 v24, v7

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v22 .. v22}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v0, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v4, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v5, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v0, v14, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v1, -0x7f65a980

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Lf10;->a:Lf10;

    const v1, 0x6c014451

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v7, LgV2;->b0:LgV2$a;

    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-static {v7, v6, v5, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    invoke-static {v15, v14, v13}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkShapes;->getSmall()Lbc5;

    move-result-object v3

    invoke-static {v1, v3}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v25

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v1, 0x44faf204

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_5

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_6

    :cond_5
    new-instance v3, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$1$1;

    invoke-direct {v3, v2}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v14, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    move-object/from16 v29, v3

    check-cast v29, Lkotlin/jvm/functions/Function0;

    const/16 v30, 0x7

    const/16 v31, 0x0

    invoke-static/range {v25 .. v31}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    const v3, -0x1cd0f17e

    invoke-interface {v14, v3}, LEt0;->F(I)V

    sget-object v32, Llo;->a:Llo;

    invoke-virtual/range {v32 .. v32}, Llo;->g()Llo$l;

    move-result-object v2

    invoke-virtual {v12}, LK9$a;->j()LK9$b;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    invoke-virtual/range {v22 .. v22}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v0, v2, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v0, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v14, v0}, LEt0;->F(I)V

    sget-object v37, LQm0;->a:LQm0;

    const v1, 0x9c6369b

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v7, v1}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    const v2, 0x2952b718

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-virtual/range {v32 .. v32}, Llo;->f()Llo$d;

    move-result-object v2

    invoke-virtual {v12}, LK9$a;->k()LK9$c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    invoke-virtual/range {v22 .. v22}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v3

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v14, v3}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_a
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v0, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v14, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v0, -0x7570dd49

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const/4 v2, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v28

    const/16 v29, 0x0

    const/16 v30, 0xb

    const/16 v31, 0x0

    move-object/from16 v25, v7

    invoke-static/range {v25 .. v31}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v3

    shr-int/lit8 v0, v10, 0x12

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x1b0

    shr-int/lit8 v1, v10, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v6, v0, v1

    const/4 v0, 0x0

    move v1, v11

    move-object/from16 v25, v18

    const v4, -0x4ee9b9da

    const v5, -0x1cd0f17e

    move-object/from16 v26, v20

    move v4, v9

    move-object/from16 v27, v21

    move-object/from16 v5, p1

    move-object/from16 v28, v23

    move-object/from16 v30, v7

    move-object/from16 v29, v24

    move v7, v0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/menu/CheckboxKt;->Checkbox(ZLkotlin/jvm/functions/Function1;LgV2;ZLEt0;II)V

    const v0, -0x1cd0f17e

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-virtual/range {v32 .. v32}, Llo;->g()Llo$l;

    move-result-object v0

    invoke-virtual {v12}, LK9$a;->j()LK9$b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v14, v2}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v0

    const v1, -0x4ee9b9da

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {v14, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v2

    invoke-interface {v14, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJq6;

    invoke-virtual/range {v22 .. v22}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-static/range {v30 .. v30}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v14, v4}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_c
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_4
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v4

    invoke-virtual/range {v22 .. v22}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v4, v0, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v1, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v22 .. v22}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v14, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x7e244d7f

    invoke-interface {v14, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/link/R$string;->inline_sign_up_header:I

    invoke-static {v0, v14, v12}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v14, v13}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v0

    invoke-virtual {v0}, LGc6;->c()LG26;

    move-result-object v38

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    sget-object v0, LJw1;->c:LJw1$a;

    invoke-virtual {v0}, LJw1$a;->a()LJw1;

    move-result-object v43

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const-wide/16 v48, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const-wide/16 v59, 0x0

    const/16 v61, 0x0

    const v62, 0x3fffb

    const/16 v63, 0x0

    invoke-static/range {v38 .. v63}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v20

    invoke-virtual {v15, v14, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->i()J

    move-result-wide v38

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v40

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0xe

    invoke-static/range {v38 .. v45}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    move-object/from16 v33, v8

    move-object/from16 v31, v16

    move/from16 v32, v17

    move-object v8, v0

    move/from16 v34, v9

    move-object v9, v0

    const-wide/16 v16, 0x0

    move v0, v10

    move/from16 v35, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move/from16 v36, v12

    move-object/from16 v12, v16

    move/from16 v64, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v65, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x7ffa

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget v1, Lcom/stripe/android/link/R$string;->sign_up_message:I

    const/4 v14, 0x1

    new-array v2, v14, [Ljava/lang/Object;

    aput-object v31, v2, v36

    const/16 v3, 0x40

    move-object/from16 v15, p1

    invoke-static {v1, v2, v15, v3}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v30

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v4, v14, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    move/from16 v4, v64

    move-object/from16 v3, v65

    invoke-virtual {v3, v15, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->c()LG26;

    move-result-object v20

    invoke-virtual {v3, v15, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->i()J

    move-result-wide v4

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/4 v7, 0x0

    const/16 v10, 0xe

    invoke-static/range {v4 .. v11}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v22, 0x30

    const/16 v24, 0x7ff8

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v1, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2;

    move-object/from16 v16, v1

    move/from16 v17, v34

    move-object/from16 v18, v29

    move-object/from16 v19, v28

    move-object/from16 v20, v27

    move/from16 v21, v0

    move-object/from16 v22, v26

    move-object/from16 v23, v25

    move/from16 v24, v32

    move-object/from16 v25, v33

    invoke-direct/range {v16 .. v25}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2;-><init>(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;ILcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/TextFieldController;)V

    const v2, 0x18b164c3

    move-object/from16 v11, p1

    const/4 v7, 0x1

    invoke-static {v11, v2, v7, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    shr-int/lit8 v0, v0, 0xf

    and-int/lit8 v0, v0, 0x70

    const v1, 0x180006

    or-int v9, v1, v0

    const/16 v10, 0x1e

    move-object/from16 v1, v37

    move/from16 v2, v35

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    :goto_5
    return-void
.end method
