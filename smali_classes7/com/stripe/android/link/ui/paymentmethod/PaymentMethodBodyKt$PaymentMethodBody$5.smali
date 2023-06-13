.class final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->PaymentMethodBody(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V
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
        "SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n154#2:289\n154#2:290\n154#2:291\n154#2:339\n154#2:340\n76#3,5:292\n81#3:323\n85#3:338\n75#4:297\n76#4,11:299\n89#4:337\n76#5:298\n460#6,13:310\n50#6:325\n49#6:326\n473#6,3:334\n1855#7:324\n1856#7:333\n1057#8,6:327\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5\n*L\n170#1:289\n179#1:290\n180#1:291\n195#1:339\n199#1:340\n176#1:292,5\n176#1:323\n176#1:338\n176#1:297\n176#1:299,11\n176#1:337\n176#1:298\n176#1:310,13\n187#1:325\n187#1:326\n176#1:334,3\n182#1:324\n182#1:333\n187#1:327,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $formContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPaymentMethodSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSecondaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $primaryButtonLabel:Ljava/lang/String;

.field final synthetic $primaryButtonState:Lcom/stripe/android/link/ui/PrimaryButtonState;

.field final synthetic $secondaryButtonLabel:Ljava/lang/String;

.field final synthetic $selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

.field final synthetic $supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
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
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$supportedPaymentMethods:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonState:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iput-object p6, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput p7, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$$dirty:I

    iput-object p8, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$secondaryButtonLabel:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onSecondaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onPaymentMethodSelected:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$formContent:Lkotlin/jvm/functions/Function3;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 31

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

    goto/16 :goto_7

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody.<anonymous> (PaymentMethodBody.kt:165)"

    const v5, 0x76a0ca50

    invoke-static {v5, v14, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget v2, Lcom/stripe/android/link/R$string;->add_payment_method:I

    const/4 v11, 0x0

    invoke-static {v2, v15, v11}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    sget-object v12, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v6

    const/4 v7, 0x0

    const/16 v4, 0x20

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v8

    const/4 v9, 0x5

    const/4 v10, 0x0

    move-object v4, v12

    invoke-static/range {v4 .. v10}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    move/from16 v26, v3

    move-object v3, v4

    sget-object v4, Lr06;->b:Lr06$a;

    invoke-virtual {v4}, Lr06$a;->a()I

    move-result v16

    sget-object v4, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-virtual {v4, v15, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v6

    invoke-virtual {v6}, LGc6;->g()LG26;

    move-result-object v21

    invoke-virtual {v4, v15, v5}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->g()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v17, 0x0

    move/from16 v28, v11

    move-object/from16 v27, v12

    move-wide/from16 v11, v17

    const/16 v17, 0x0

    move/from16 v29, v13

    move-object/from16 v13, v17

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move/from16 v30, v14

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

    const v2, -0x2e2faabd

    move-object/from16 v11, p2

    invoke-interface {v11, v2}, LEt0;->F(I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$supportedPaymentMethods:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x6

    const/4 v13, 0x1

    if-le v2, v13, :cond_b

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, v27

    invoke-static {v4, v2, v13, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x7

    const/16 v20, 0x0

    invoke-static/range {v14 .. v20}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, Llo;->a:Llo;

    const/16 v4, 0x14

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-virtual {v3, v4}, Llo;->n(F)Llo$e;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$supportedPaymentMethods:Ljava/util/List;

    iget-object v14, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    iget-object v15, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonState:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iget-object v10, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onPaymentMethodSelected:Lkotlin/jvm/functions/Function1;

    const v5, 0x2952b718

    invoke-interface {v11, v5}, LEt0;->F(I)V

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->k()LK9$c;

    move-result-object v5

    invoke-static {v3, v5, v11, v12}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {v11, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v11, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v11, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v11, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v9, v3, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v3, v11, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v11, v2}, LEt0;->F(I)V

    const v2, -0x286e2e7f

    invoke-interface {v11, v2}, LEt0;->F(I)V

    sget-object v12, Lad5;->a:Lad5;

    const v2, -0x49f49b71

    invoke-interface {v11, v2}, LEt0;->F(I)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    if-ne v3, v14, :cond_7

    move v4, v13

    goto :goto_5

    :cond_7
    move/from16 v4, v28

    :goto_5
    invoke-virtual {v15}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v2

    xor-int/lit8 v5, v2, 0x1

    const v2, 0x1e7b2b64

    invoke-interface {v11, v2}, LEt0;->F(I)V

    invoke-interface {v11, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v11, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_8

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_9

    :cond_8
    new-instance v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1;

    invoke-direct {v6, v10, v3}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;)V

    invoke-interface {v11, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    const/4 v7, 0x0

    const/4 v9, 0x6

    const/16 v17, 0x10

    move-object v2, v12

    move-object/from16 v8, p2

    move-object/from16 v18, v10

    move/from16 v10, v17

    invoke-static/range {v2 .. v10}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt;->access$PaymentMethodTypeCell(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    move-object/from16 v10, v18

    goto :goto_4

    :cond_a
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    const v2, -0x2e2fa7bc

    invoke-interface {v11, v2}, LEt0;->F(I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getShowsForm()Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, LgV2;->b0:LgV2$a;

    invoke-static/range {v26 .. v26}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, v11, v4}, LDN5;->a(LgV2;LEt0;I)V

    new-instance v3, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$2;

    iget-object v5, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$formContent:Lkotlin/jvm/functions/Function3;

    iget v6, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$$dirty:I

    move/from16 v7, v30

    invoke-direct {v3, v5, v1, v7, v6}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$2;-><init>(Lkotlin/jvm/functions/Function3;LPm0;II)V

    const v5, -0x2f9e440a

    invoke-static {v11, v5, v13, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    invoke-static {v3, v11, v4}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lkotlin/jvm/functions/Function2;LEt0;I)V

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v11, v4}, LDN5;->a(LgV2;LEt0;I)V

    goto :goto_6

    :cond_c
    move/from16 v7, v30

    :goto_6
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    iget-object v2, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-eqz v2, :cond_d

    move/from16 v28, v13

    :cond_d
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v8, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$3;

    invoke-direct {v8, v2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$3;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v2, 0x1b0d6728

    invoke-static {v11, v2, v13, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    const/high16 v2, 0x180000

    and-int/lit8 v7, v7, 0xe

    or-int v9, v7, v2

    const/16 v10, 0x1e

    move-object/from16 v1, p1

    move/from16 v2, v28

    move-object v7, v8

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonLabel:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonState:Lcom/stripe/android/link/ui/PrimaryButtonState;

    iget-object v3, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iget-object v4, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getPrimaryButtonStartIconResourceId()Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$selectedPaymentMethod:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getPrimaryButtonEndIconResourceId()Ljava/lang/Integer;

    move-result-object v5

    iget v6, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$$dirty:I

    shr-int/lit8 v7, v6, 0x6

    and-int/lit8 v7, v7, 0xe

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    shr-int/lit8 v6, v6, 0xf

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v7, v6

    const/4 v8, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$primaryButtonState:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v1

    xor-int/2addr v1, v13

    iget-object v2, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$secondaryButtonLabel:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$onSecondaryButtonClick:Lkotlin/jvm/functions/Function0;

    iget v4, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5;->$$dirty:I

    shr-int/lit8 v5, v4, 0x9

    and-int/lit8 v5, v5, 0x70

    shr-int/lit8 v4, v4, 0x12

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v4, v5

    invoke-static {v1, v2, v3, v11, v4}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->SecondaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LQt0;->Y()V

    :cond_e
    :goto_7
    return-void
.end method
