.class final Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->PaymentMethodUI-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZILgV2;Lkotlin/jvm/functions/Function1;LEt0;III)V
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
        "SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n50#2:275\n49#2:276\n460#2,13:302\n460#2,13:335\n473#2,3:349\n473#2,3:355\n1057#3,6:277\n74#4,6:283\n80#4:315\n84#4:359\n75#5:289\n76#5,11:291\n75#5:322\n76#5,11:324\n89#5:352\n89#5:358\n76#6:290\n76#6:323\n67#7,6:316\n73#7:348\n77#7:353\n154#8:354\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1\n*L\n207#1:275\n207#1:276\n202#1:302,13\n212#1:335,13\n212#1:349,3\n202#1:355,3\n207#1:277,6\n202#1:283,6\n202#1:315\n202#1:359\n202#1:289\n202#1:291,11\n212#1:322\n212#1:324,11\n212#1:352\n202#1:358\n202#1:290\n212#1:323\n212#1:316,6\n212#1:348\n212#1:353\n234#1:354\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $$dirty1:I

.field final synthetic $color:J

.field final synthetic $iconRes:I

.field final synthetic $iconUrl:Ljava/lang/String;

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $isEnabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $itemIndex:I

.field final synthetic $onItemSelectedListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tintOnSelected:Z

.field final synthetic $title:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZLkotlin/jvm/functions/Function1;IIILjava/lang/String;JILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;III",
            "Ljava/lang/String;",
            "JI",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Z)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$isSelected:Z

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$isEnabled:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$itemIndex:I

    iput p5, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$$dirty1:I

    iput p6, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$$dirty:I

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$title:Ljava/lang/String;

    iput-wide p8, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$color:J

    iput p10, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$iconRes:I

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$iconUrl:Ljava/lang/String;

    iput-object p12, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p13, p0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$tintOnSelected:Z

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v10, p1

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.PaymentMethodUI.<anonymous> (PaymentMethodsUI.kt:200)"

    const v4, -0x19e7fd8d

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v9, LgV2;->b0:LgV2$a;

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$isSelected:Z

    iget-boolean v13, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$isEnabled:Z

    const/4 v14, 0x0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$itemIndex:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$onItemSelectedListener:Lkotlin/jvm/functions/Function1;

    iget v4, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$itemIndex:I

    const v5, 0x1e7b2b64

    invoke-interface {v10, v5}, LEt0;->F(I)V

    invoke-interface {v10, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1$1$1;

    invoke-direct {v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v10, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    move-object v15, v2

    check-cast v15, Lkotlin/jvm/functions/Function0;

    const/16 v16, 0x4

    const/16 v17, 0x0

    move-object v11, v9

    invoke-static/range {v11 .. v17}, LGr5;->c(LgV2;ZZLCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    iget-object v15, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$title:Ljava/lang/String;

    iget-wide v13, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$color:J

    iget-boolean v12, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$isEnabled:Z

    iget v11, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$$dirty:I

    iget v2, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$iconRes:I

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$iconUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-boolean v5, v0, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1;->$tintOnSelected:Z

    const v6, -0x1cd0f17e

    invoke-interface {v10, v6}, LEt0;->F(I)V

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->g()Llo$l;

    move-result-object v6

    sget-object v7, LK9;->a:LK9$a;

    invoke-virtual {v7}, LK9$a;->j()LK9$b;

    move-result-object v8

    const/4 v0, 0x0

    invoke-static {v6, v8, v10, v0}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v6

    const v8, -0x4ee9b9da

    invoke-interface {v10, v8}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v10, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v0

    invoke-interface {v10, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm2;

    move/from16 v17, v12

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v10, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v18, LBt0;->M:LBt0$a;

    move-object/from16 v19, v15

    invoke-virtual/range {v18 .. v18}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    move-wide/from16 v20, v13

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v10, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_6
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual/range {v18 .. v18}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v6, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v13, v8, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v13, v0, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v13, v12, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v0, v10, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v10, v0}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v10, v1}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, -0x9a3fe17

    invoke-interface {v10, v1}, LEt0;->F(I)V

    sget-object v12, Lcom/stripe/android/paymentsheet/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/Spacing;

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/Spacing;->getIconSize-D9Ej5fM()F

    move-result v1

    invoke-static {v9, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v22

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/Spacing;->getCardLeadingInnerPadding-D9Ej5fM()F

    move-result v23

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/Spacing;->getCardLeadingInnerPadding-D9Ej5fM()F

    move-result v24

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0xc

    const/16 v28, 0x0

    invoke-static/range {v22 .. v28}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const v6, 0x2bb5b5d7

    invoke-interface {v10, v6}, LEt0;->F(I)V

    invoke-virtual {v7}, LK9$a;->n()LK9;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v7, v10, v7}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v6

    const v7, -0x4ee9b9da

    invoke-interface {v10, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v10, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v10, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v10, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    invoke-virtual/range {v18 .. v18}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v10, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v14

    invoke-virtual/range {v18 .. v18}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v6, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v14, v7, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v14, v8, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v14, v13, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v6, v10, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v10, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {v10, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x64312def

    invoke-interface {v10, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, v11, 0x3

    and-int/lit8 v1, v0, 0xe

    and-int/lit8 v6, v0, 0x70

    or-int/2addr v1, v6

    sget v6, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    const/4 v15, 0x6

    shl-int/2addr v6, v15

    or-int/2addr v1, v6

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v1

    shr-int/lit8 v1, v11, 0xc

    and-int/lit16 v1, v1, 0x1c00

    or-int v8, v0, v1

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-wide/from16 v5, v20

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/PaymentMethodsUIKt;->access$PaymentMethodIconUi-qFjXxE8(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZJLEt0;I)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    int-to-float v0, v15

    invoke-static {v0}, Lk61;->g(F)F

    move-result v13

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/Spacing;->getCardLeadingInnerPadding-D9Ej5fM()F

    move-result v0

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/Spacing;->getCardLeadingInnerPadding-D9Ej5fM()F

    move-result v14

    const/4 v1, 0x0

    const/16 v16, 0x8

    const/4 v2, 0x0

    move v3, v11

    move-object v11, v9

    move/from16 v6, v17

    move v12, v0

    move-wide/from16 v4, v20

    move v7, v15

    move-object/from16 v0, v19

    move v15, v1

    move-object/from16 v17, v2

    invoke-static/range {v11 .. v17}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v8

    const/4 v1, 0x0

    shr-int/lit8 v2, v3, 0x9

    and-int/lit8 v2, v2, 0x70

    const v9, 0xe000

    shr-int/2addr v3, v7

    and-int/2addr v3, v9

    or-int v9, v2, v3

    const/4 v11, 0x1

    move-object v2, v0

    move-wide v3, v4

    move-object v5, v8

    move-object/from16 v7, p1

    move v8, v9

    move v9, v11

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;->LpmSelectorText-T042LqI(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_3
    return-void
.end method
