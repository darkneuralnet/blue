.class public final Lcom/stripe/android/paymentsheet/ui/LoadingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "Loading",
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
        "SMAP\nLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loading.kt\ncom/stripe/android/paymentsheet/ui/LoadingKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,41:1\n79#2,2:42\n81#2:70\n85#2:75\n75#3:44\n76#3,11:46\n89#3:74\n76#4:45\n460#5,13:57\n473#5,3:71\n*S KotlinDebug\n*F\n+ 1 Loading.kt\ncom/stripe/android/paymentsheet/ui/LoadingKt\n*L\n20#1:42,2\n20#1:70\n20#1:75\n20#1:44\n20#1:46,11\n20#1:74\n20#1:45\n20#1:57,13\n20#1:71,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final Loading(LEt0;I)V
    .locals 10

    const v0, 0x1890a890

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.Loading (Loading.kt:18)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LgV2;->b0:LgV2$a;

    sget v1, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_container_height:I

    const/4 v2, 0x0

    invoke-static {v1, p0, v2}, LH24;->a(ILEt0;I)F

    move-result v1

    invoke-static {v0, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v5, v3, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v3

    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->b()Llo$e;

    move-result-object v4

    const v5, 0x2952b718

    invoke-interface {p0, v5}, LEt0;->F(I)V

    const/16 v5, 0x36

    invoke-static {v4, v3, p0, v5}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {p0, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {p0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {p0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {p0, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {p0}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p0}, LEt0;->h()V

    invoke-interface {p0}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {p0, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p0}, LEt0;->e()V

    :goto_1
    invoke-interface {p0}, LEt0;->L()V

    invoke-static {p0}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v3, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v8, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p0}, LEt0;->q()V

    invoke-static {p0}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v3, p0, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {p0, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {p0, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v1, 0x6b53bbac

    invoke-interface {p0, v1}, LEt0;->F(I)V

    sget-object v1, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v1, p0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v1

    sget v3, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_indicator_size:I

    invoke-static {v3, p0, v2}, LH24;->a(ILEt0;I)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    if-eqz v1, :cond_5

    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-virtual {v1}, Lpm0$a;->a()J

    move-result-wide v3

    goto :goto_2

    :cond_5
    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-virtual {v1}, Lpm0$a;->h()J

    move-result-wide v3

    :goto_2
    sget v1, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_loading_indicator_stroke_width:I

    invoke-static {v1, p0, v2}, LH24;->a(ILEt0;I)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-wide v2, v3

    move v4, v5

    move-object v5, p0

    invoke-static/range {v1 .. v7}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->f()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/LoadingKt$Loading$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/LoadingKt$Loading$2;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method
