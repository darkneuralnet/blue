.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2;->invoke(LTe;LEt0;I)V
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
        "SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,299:1\n74#2,6:300\n80#2:332\n84#2:338\n75#3:306\n76#3,11:308\n89#3:337\n76#4:307\n460#5,13:319\n473#5,3:334\n154#6:333\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2\n*L\n240#1:300,6\n240#1:332\n240#1:338\n240#1:306\n240#1:308,11\n240#1:337\n240#1:307\n240#1:319,13\n240#1:334,3\n271#1:333\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $enabled:Z

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z


# direct methods
.method public constructor <init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$requiresNameCollection:Z

    iput p4, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$$dirty:I

    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p6, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->invoke(LTe;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LEt0;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v11, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignup.kt:238)"

    const v3, -0x51421dd8

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v12, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x1

    invoke-static {v12, v1, v10, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-boolean v9, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$enabled:Z

    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-boolean v13, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$requiresNameCollection:Z

    iget v14, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$$dirty:I

    iget-object v15, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    const v3, -0x1cd0f17e

    invoke-interface {v11, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->j()LK9$b;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v3, v4, v11, v7}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v11, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v11, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v11, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v11, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v11, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_0
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v7, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, v11, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v11, v1}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v11, v1}, LEt0;->F(I)V

    sget-object v10, LQm0;->a:LQm0;

    const v1, 0x410cb8f2

    invoke-interface {v11, v1}, LEt0;->F(I)V

    const/4 v3, 0x0

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getInitialPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    move v4, v7

    :goto_1
    if-eqz v13, :cond_4

    sget-object v1, LFY1;->b:LFY1$a;

    invoke-virtual {v1}, LFY1$a;->d()I

    move-result v1

    goto :goto_2

    :cond_4
    sget-object v1, LFY1;->b:LFY1$a;

    invoke-virtual {v1}, LFY1$a;->b()I

    move-result v1

    :goto_2
    move v5, v1

    shr-int/lit8 v1, v14, 0xf

    and-int/lit8 v1, v1, 0xe

    sget v6, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v1, v6

    shr-int/lit8 v6, v14, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int v16, v1, v6

    const/16 v17, 0x4

    move v1, v9

    move-object/from16 v6, p2

    move/from16 v7, v16

    move-object v0, v8

    move/from16 v8, v17

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V

    const v1, -0x6d74729b

    invoke-interface {v11, v1}, LEt0;->F(I)V

    const/16 v8, 0x8

    if-eqz v13, :cond_5

    sget-object v1, LFY1;->b:LFY1$a;

    invoke-virtual {v1}, LFY1$a;->b()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    shr-int/lit8 v1, v14, 0x9

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v13, v1, 0x8

    const/16 v14, 0x38

    move-object v1, v15

    move v3, v9

    move-object/from16 v7, p2

    move v15, v8

    move v8, v13

    move v9, v14

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    goto :goto_3

    :cond_5
    move v15, v8

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v1, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v0, -0x3e1e46e6

    const/4 v7, 0x1

    invoke-static {v11, v0, v7, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const v9, 0x180006

    const/16 v0, 0x1e

    move-object v1, v10

    move-object/from16 v8, p2

    move v10, v0

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    const/4 v5, 0x0

    int-to-float v0, v15

    invoke-static {v0}, Lk61;->g(F)F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    move-object v4, v12

    invoke-static/range {v4 .. v10}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v0

    sget-object v1, Lr06;->b:Lr06$a;

    invoke-virtual {v1}, Lr06$a;->d()I

    move-result v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {v0, v1, v11, v2, v3}, Lcom/stripe/android/link/ui/LinkTermsKt;->LinkTerms-5stqomU(LgV2;ILEt0;II)V

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
