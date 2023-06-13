.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->AutocompleteScreenUI(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;LEt0;I)V
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
        "SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,235:1\n154#2:236\n79#3,2:237\n81#3:265\n85#3:270\n75#4:239\n76#4,11:241\n89#4:269\n76#5:240\n460#6,13:252\n473#6,3:266\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3\n*L\n110#1:236\n102#1:237,2\n102#1:265\n102#1:270\n102#1:239\n102#1:241,11\n102#1:269\n102#1:240\n102#1:252,13\n102#1:266,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;->$viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:95)"

    const v2, 0x6fa51c50

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    invoke-static {p1, p2}, LwS0;->a(LEt0;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, -0x2c5ce4a4

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-static {v0, p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v0

    invoke-interface {p1}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    const v0, -0x2c5ce45a

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-static {v0, p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getMaterialColors()LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->n()J

    move-result-wide v0

    const v2, 0x3d8f5c29    # 0.07f

    invoke-static {v0, v1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->darken-DxMtmZc(JF)J

    move-result-wide v0

    invoke-interface {p1}, LEt0;->Q()V

    :goto_1
    move-wide v3, v0

    sget-object v0, LK9;->a:LK9$a;

    invoke-virtual {v0}, LK9$a;->h()LK9$c;

    move-result-object v0

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->b()Llo$e;

    move-result-object v1

    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v5}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-static {v2}, LqC6;->a(LgV2;)LgV2;

    move-result-object v2

    invoke-static {v2}, LqC6;->b(LgV2;)LgV2;

    move-result-object v2

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v2, v3, v6, v4, v5}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3;->$viewModel:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    const v4, 0x2952b718

    invoke-interface {p1, v4}, LEt0;->F(I)V

    const/16 v4, 0x36

    invoke-static {v1, v0, p1, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v0

    const v1, -0x4ee9b9da

    invoke-interface {p1, v1}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {p1, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p1, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {p1}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_4

    invoke-static {}, Lyt0;->c()V

    :cond_4
    invoke-interface {p1}, LEt0;->h()V

    invoke-interface {p1}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {p1, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_5
    invoke-interface {p1}, LEt0;->e()V

    :goto_2
    invoke-interface {p1}, LEt0;->L()V

    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v0, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v1, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v4, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v7, v5, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p1}, LEt0;->q()V

    invoke-static {p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, p1, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p1, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v0, 0x7ae33b4

    invoke-interface {p1, v0}, LEt0;->F(I)V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3$1$1;

    invoke-direct {v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3$1$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt;->EnterManuallyText(Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->f()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method
