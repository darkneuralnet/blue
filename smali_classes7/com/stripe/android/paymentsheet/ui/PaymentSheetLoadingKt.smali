.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "",
        "PaymentSheetLoading",
        "(LgV2;LEt0;II)V",
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
        "SMAP\nPaymentSheetLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetLoading.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,36:1\n68#2,5:37\n73#2:68\n77#2:73\n75#3:42\n76#3,11:44\n89#3:72\n76#4:43\n460#5,13:55\n473#5,3:69\n*S KotlinDebug\n*F\n+ 1 PaymentSheetLoading.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt\n*L\n23#1:37,5\n23#1:68\n23#1:73\n23#1:42\n23#1:44,11\n23#1:72\n23#1:43\n23#1:55,13\n23#1:69,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentSheetLoading(LgV2;LEt0;II)V
    .locals 11

    const v0, -0x72686e07

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0xe

    if-nez v3, :cond_2

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_1
    and-int/lit8 v3, v3, 0xb

    if-ne v3, v2, :cond_4

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_4

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, LgV2;->b0:LgV2$a;

    :cond_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PaymentSheetLoading (PaymentSheetLoading.kt:15)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget v0, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_container_height:I

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LH24;->a(ILEt0;I)F

    move-result v0

    sget v2, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_indicator_size:I

    invoke-static {v2, p1, v1}, LH24;->a(ILEt0;I)F

    move-result v2

    sget v3, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_indicator_stroke_width:I

    invoke-static {v3, p1, v1}, LH24;->a(ILEt0;I)F

    move-result v4

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->e()LK9;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {p0, v5, v7, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    invoke-static {v5, v0}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    const v5, 0x2bb5b5d7

    invoke-interface {p1, v5}, LEt0;->F(I)V

    const/4 v5, 0x6

    invoke-static {v3, v1, p1, v5}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {p1, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {p1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {p1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {p1, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p1}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {p1}, LEt0;->h()V

    invoke-interface {p1}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {p1, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_8
    invoke-interface {p1}, LEt0;->e()V

    :goto_3
    invoke-interface {p1}, LEt0;->L()V

    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p1}, LEt0;->q()V

    invoke-static {p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v3, p1, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p1, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x763aa833

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-virtual {v0, p1, v1}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->i()J

    move-result-wide v5

    invoke-static {p0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v1

    const/4 v0, 0x0

    const/4 v7, 0x0

    move-wide v2, v5

    move-object v5, p1

    move v6, v0

    invoke-static/range {v1 .. v7}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->f()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_5

    :cond_a
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt$PaymentSheetLoading$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt$PaymentSheetLoading$2;-><init>(LgV2;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
