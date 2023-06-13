.class public final Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "text",
        "",
        "GooglePayDividerUi",
        "(Ljava/lang/String;LEt0;II)V",
        "GooglePayDividerLine",
        "(LEt0;I)V",
        "paymentsheet_release"
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
        "SMAP\nGooglePayDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayDivider.kt\ncom/stripe/android/paymentsheet/ui/GooglePayDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,57:1\n154#2:58\n154#2:91\n174#2:97\n68#3,5:59\n73#3:90\n77#3:96\n75#4:64\n76#4,11:66\n89#4:95\n76#5:65\n460#6,13:77\n473#6,3:92\n*S KotlinDebug\n*F\n+ 1 GooglePayDivider.kt\ncom/stripe/android/paymentsheet/ui/GooglePayDividerKt\n*L\n29#1:58\n38#1:91\n53#1:97\n25#1:59,5\n25#1:90\n25#1:96\n25#1:64\n25#1:66,11\n25#1:95\n25#1:65\n25#1:77,13\n25#1:92,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final GooglePayDividerLine(LEt0;I)V
    .locals 11

    const v0, 0x357b05b6

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.GooglePayDividerLine (GooglePayDivider.kt:43)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-virtual {v0, p0, v1}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lpm0;->b:Lpm0$a;

    invoke-virtual {v2}, Lpm0$a;->a()J

    move-result-wide v3

    const v5, 0x3e4ccccd    # 0.2f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    goto :goto_1

    :cond_3
    sget-object v2, Lpm0;->b:Lpm0$a;

    invoke-virtual {v2}, Lpm0$a;->h()J

    move-result-wide v3

    const v5, 0x3e4ccccd    # 0.2f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-static {v0, p0, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v2, v0}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ld10;->a(LgV2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt$GooglePayDividerLine$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt$GooglePayDividerLine$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method public static final GooglePayDividerUi(Ljava/lang/String;LEt0;II)V
    .locals 28

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, -0x74e4be3b

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v3

    and-int/lit8 v4, v0, 0xe

    const/4 v7, 0x2

    if-nez v4, :cond_2

    and-int/lit8 v4, v1, 0x1

    if-nez v4, :cond_0

    move-object/from16 v4, p0

    invoke-interface {v3, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v4, p0

    :cond_1
    move v5, v7

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v5, 0xb

    if-ne v6, v7, :cond_4

    invoke-interface {v3}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v3}, LEt0;->k()V

    move-object v2, v3

    goto/16 :goto_6

    :cond_4
    :goto_2
    invoke-interface {v3}, LEt0;->J()V

    and-int/lit8 v6, v0, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_6

    invoke-interface {v3}, LEt0;->l()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v3}, LEt0;->k()V

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_7

    goto :goto_4

    :cond_6
    :goto_3
    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_7

    sget v4, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_or_pay_with_card:I

    invoke-static {v4, v3, v8}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    and-int/lit8 v5, v5, -0xf

    :cond_7
    move-object/from16 v27, v4

    move v15, v5

    invoke-interface {v3}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.GooglePayDividerUi (GooglePayDivider.kt:21)"

    invoke-static {v2, v15, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->e()LK9;

    move-result-object v2

    sget-object v9, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v14, 0x0

    invoke-static {v9, v4, v5, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v5, 0x12

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v5

    const v6, 0x2bb5b5d7

    invoke-interface {v3, v6}, LEt0;->F(I)V

    const/4 v6, 0x6

    invoke-static {v2, v8, v3, v6}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v2

    const v6, -0x4ee9b9da

    invoke-interface {v3, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v3, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v3, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v3, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v14

    instance-of v14, v14, Llm;

    if-nez v14, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v3, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_a
    invoke-interface {v3}, LEt0;->e()V

    :goto_5
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v2, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v13, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v13, v10, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v13, v11, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v2, v3, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v3, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v3, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, 0x18720b7f

    invoke-interface {v3, v2}, LEt0;->F(I)V

    invoke-static {v3, v8}, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt;->GooglePayDividerLine(LEt0;I)V

    sget-object v2, LTM2;->a:LTM2;

    sget v8, LTM2;->b:I

    invoke-virtual {v2, v3, v8}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->c()LG26;

    move-result-object v22

    invoke-static {v2, v3, v8}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v5

    invoke-virtual {v2, v3, v8}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->n()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v2, 0x0

    invoke-static/range {v9 .. v14}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v8

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    invoke-static {v8, v9, v4, v7, v2}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v4

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v2, 0x0

    move/from16 v23, v15

    move-object v15, v2

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    and-int/lit8 v24, v23, 0xe

    const/16 v25, 0x0

    const/16 v26, 0x7ff8

    move-object v2, v3

    move-object/from16 v3, v27

    move-object/from16 v23, v2

    invoke-static/range {v3 .. v26}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

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
    move-object/from16 v4, v27

    :goto_6
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt$GooglePayDividerUi$2;

    invoke-direct {v3, v4, v0, v1}, Lcom/stripe/android/paymentsheet/ui/GooglePayDividerKt$GooglePayDividerUi$2;-><init>(Ljava/lang/String;II)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method
