.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LPD3;",
        "paddingValues",
        "",
        "invoke",
        "(LPD3;LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,261:1\n74#2,6:262\n80#2:294\n74#2,6:295\n80#2:327\n84#2:334\n84#2:339\n75#3:268\n76#3,11:270\n75#3:301\n76#3,11:303\n89#3:333\n89#3:338\n76#4:269\n76#4:302\n460#5,13:281\n460#5,13:314\n473#5,3:330\n473#5,3:335\n141#6,2:328\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1\n*L\n161#1:262,6\n161#1:294\n167#1:295,6\n167#1:327\n167#1:334\n161#1:339\n161#1:268\n161#1:270,11\n167#1:301\n167#1:303,11\n167#1:333\n161#1:338\n161#1:269\n167#1:302\n161#1:281,13\n167#1:314,13\n167#1:330,3\n161#1:335,3\n192#1:328,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/ComposableSingletons$PollingScreenKt$lambda-4$1;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "paddingValues"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0xe

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v2, v2, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-4.<anonymous> (PollingScreen.kt:159)"

    const v4, -0x67f26775

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v13, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v13, v1, v2, v3}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static {v4, v0}, LND3;->h(LgV2;LPD3;)LgV2;

    move-result-object v0

    const v4, -0x1cd0f17e

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v11, Llo;->a:Llo;

    invoke-virtual {v11}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v12, LK9;->a:LK9$a;

    invoke-virtual {v12}, LK9$a;->j()LK9$b;

    move-result-object v6

    const/4 v14, 0x0

    invoke-static {v5, v6, v15, v14}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v10, -0x4ee9b9da

    invoke-interface {v15, v10}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v15, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_3
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v5, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v5, v15, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v10, -0x455f09d5

    invoke-interface {v15, v10}, LEt0;->F(I)V

    sget-object v24, LQm0;->a:LQm0;

    const v5, 0xc411a01

    invoke-interface {v15, v5}, LEt0;->F(I)V

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/16 v17, 0x0

    move-object/from16 v5, v24

    move-object v6, v13

    const v0, -0x4ee9b9da

    move-object/from16 v10, v17

    invoke-static/range {v5 .. v10}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v5

    invoke-static {v5, v15, v14}, LDN5;->a(LgV2;LEt0;I)V

    invoke-virtual {v12}, LK9$a;->g()LK9$b;

    move-result-object v5

    invoke-static {v13, v1, v2, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget v2, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_top:I

    invoke-static {v2, v15, v14}, LH24;->a(ILEt0;I)F

    move-result v2

    sget v3, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_outer_spacing_horizontal:I

    invoke-static {v3, v15, v14}, LH24;->a(ILEt0;I)F

    move-result v3

    invoke-static {v1, v3, v2}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v1

    invoke-interface {v15, v4}, LEt0;->F(I)V

    invoke-virtual {v11}, Llo;->g()Llo$l;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v2, v5, v15, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {v15, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LEt0;->h()V

    invoke-interface/range {p2 .. p2}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v15, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_8
    invoke-interface/range {p2 .. p2}, LEt0;->e()V

    :goto_4
    invoke-interface/range {p2 .. p2}, LEt0;->L()V

    invoke-static/range {p2 .. p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v2, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v5, v0, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v4, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface/range {p2 .. p2}, LEt0;->q()V

    invoke-static/range {p2 .. p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v15, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x768c1389

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_polling_failure:I

    invoke-static {v0, v15, v14}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v12, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->getExtended-D9Ej5fM()F

    move-result v9

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v5, v13

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x1b8

    const/16 v9, 0x78

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->upi_polling_payment_failed_title:I

    invoke-static {v0, v15, v14}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget-object v4, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v4, v15, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->h()LG26;

    move-result-object v19

    sget-object v25, Lr06;->b:Lr06$a;

    invoke-virtual/range {v25 .. v25}, Lr06$a;->a()I

    move-result v16

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->getNormal-D9Ej5fM()F

    move-result v9

    move-object v5, v13

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const-wide/16 v5, 0x0

    move v12, v2

    move-wide v2, v5

    move-object v11, v4

    move-wide v4, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v17, 0x0

    move-object/from16 v26, v11

    move-object/from16 v11, v17

    invoke-static/range {v16 .. v16}, Lr06;->g(I)Lr06;

    move-result-object v16

    move/from16 v27, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v28, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x30

    const/16 v22, 0x0

    const/16 v23, 0x7dfc

    move-object/from16 v20, p2

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->upi_polling_payment_failed_message:I

    move-object/from16 v15, p2

    const/4 v13, 0x0

    invoke-static {v0, v15, v13}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v25 .. v25}, Lr06$a;->a()I

    move-result v12

    invoke-static {v12}, Lr06;->g(I)Lr06;

    move-result-object v12

    move-object/from16 v14, v26

    move/from16 v13, v27

    invoke-virtual {v14, v15, v13}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v13

    invoke-virtual {v13}, LGc6;->c()LG26;

    move-result-object v13

    invoke-virtual {v13}, LG26;->n()J

    move-result-wide v13

    invoke-static {v13, v14}, LN26;->b(J)V

    invoke-static {v13, v14}, LM26;->f(J)J

    move-result-wide v1

    invoke-static {v13, v14}, LM26;->h(J)F

    move-result v3

    const v13, 0x3fa66666    # 1.3f

    mul-float/2addr v3, v13

    invoke-static {v1, v2, v3}, LN26;->i(JF)J

    move-result-wide v13

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v15

    move v15, v2

    const/16 v19, 0x0

    const/16 v21, 0x0

    const v23, 0xf9fe

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object/from16 v5, v24

    move-object/from16 v6, v28

    invoke-static/range {v5 .. v10}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->f()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_5
    return-void
.end method
