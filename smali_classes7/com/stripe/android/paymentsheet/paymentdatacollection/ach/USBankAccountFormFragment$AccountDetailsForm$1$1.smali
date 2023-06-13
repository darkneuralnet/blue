.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V
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
        "SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,486:1\n154#2:487\n154#2:551\n154#2:552\n154#2:558\n154#2:559\n79#3,2:488\n81#3:516\n74#3,7:517\n81#3:550\n85#3:557\n85#3:572\n75#4:490\n76#4,11:492\n75#4:524\n76#4,11:526\n89#4:556\n89#4:571\n76#5:491\n76#5:525\n460#6,13:503\n460#6,13:537\n473#6,3:553\n50#6:560\n49#6:561\n473#6,3:568\n1057#7,6:562\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1\n*L\n369#1:487\n378#1:551\n379#1:552\n391#1:558\n392#1:559\n366#1:488,2\n366#1:516\n373#1:517,7\n373#1:550\n373#1:557\n366#1:572\n366#1:490\n366#1:492,11\n373#1:524\n373#1:526,11\n373#1:556\n366#1:571\n366#1:491\n373#1:525\n366#1:503,13\n373#1:537,13\n373#1:553,3\n394#1:560\n394#1:561\n366#1:568,3\n394#1:562,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bankIcon:I

.field final synthetic $bankName:Ljava/lang/String;

.field final synthetic $last4:Ljava/lang/String;

.field final synthetic $openDialog:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $processing:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;LEX2;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$processing:LsP5;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$openDialog:LEX2;

    iput p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$bankIcon:I

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$bankName:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$last4:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 29

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

    const-string v3, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.AccountDetailsForm.<anonymous>.<anonymous> (USBankAccountFormFragment.kt:364)"

    const v4, 0x3a3768cb

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v15, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v3

    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->d()Llo$e;

    move-result-object v5

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$processing:LsP5;

    iget-object v12, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$openDialog:LEX2;

    iget v6, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$bankIcon:I

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$bankName:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;->$last4:Ljava/lang/String;

    const v7, 0x2952b718

    invoke-interface {v14, v7}, LEt0;->F(I)V

    const/16 v8, 0x36

    invoke-static {v5, v3, v14, v8}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {v14, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v14, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v14, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v0

    instance-of v0, v0, Llm;

    if-nez v0, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v14, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_1
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v0, v3, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v8, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v9, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v0, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v0, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v3, Lad5;->a:Lad5;

    const v3, 0x5a55a8e7

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v2

    const v3, 0x2952b718

    invoke-interface {v14, v3}, LEt0;->F(I)V

    invoke-virtual {v4}, Llo;->f()Llo$d;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v14, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

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

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v15}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, LEt0;->v()Llm;

    move-result-object v1

    instance-of v1, v1, Llm;

    if-nez v1, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LEt0;->h()V

    invoke-interface/range {p1 .. p1}, LEt0;->t()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v14, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface/range {p1 .. p1}, LEt0;->e()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LEt0;->L()V

    invoke-static/range {p1 .. p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v1, v2, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v1, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p1 .. p1}, LEt0;->q()V

    invoke-static/range {p1 .. p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v1, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, 0x58e01803

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-static {v6, v14, v9}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v15, v0}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    const/16 v3, 0x38

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v0, 0x1b8

    const/16 v16, 0x78

    move-object/from16 v8, p1

    move v9, v0

    move-object v0, v10

    move/from16 v10, v16

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \u2022\u2022\u2022\u2022"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/high16 v25, 0x3f000000    # 0.5f

    const/high16 v26, 0x3f800000    # 1.0f

    if-eqz v0, :cond_7

    move/from16 v0, v25

    goto :goto_3

    :cond_7
    move/from16 v0, v26

    :goto_3
    invoke-static {v15, v0}, LU9;->a(LgV2;F)LgV2;

    move-result-object v2

    sget-object v0, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-static {v0, v14, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v0, 0x0

    move-object/from16 v27, v12

    move-object v12, v0

    move-object/from16 p2, v13

    move-object v13, v0

    const-wide/16 v16, 0x0

    move-object v0, v14

    move-object/from16 v28, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    sget v1, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_clear:I

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x14

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v4

    move-object/from16 v5, v28

    invoke-static {v5, v4}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v4

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v4, v3}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_8

    move/from16 v4, v25

    goto :goto_4

    :cond_8
    move/from16 v4, v26

    :goto_4
    invoke-static {v3, v4}, LU9;->a(LgV2;F)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v3, 0x1e7b2b64

    invoke-interface {v0, v3}, LEt0;->F(I)V

    move-object/from16 v3, p2

    invoke-interface {v0, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 v9, v27

    invoke-interface {v0, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_9

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_a

    :cond_9
    new-instance v10, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1;

    invoke-direct {v10, v3, v9}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1;-><init>(LsP5;LEX2;)V

    invoke-interface {v0, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    move-object v9, v10

    check-cast v9, Lkotlin/jvm/functions/Function0;

    const/4 v10, 0x7

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v10, 0x78

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->f()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_5
    return-void
.end method
