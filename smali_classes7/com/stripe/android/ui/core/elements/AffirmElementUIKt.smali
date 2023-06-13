.class public final Lcom/stripe/android/ui/core/elements/AffirmElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "AffirmElementUI",
        "(LEt0;I)V",
        "payments-ui-core_release"
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
        "SMAP\nAffirmElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AffirmElementUI.kt\ncom/stripe/android/ui/core/elements/AffirmElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,31:1\n154#2:32\n*S KotlinDebug\n*F\n+ 1 AffirmElementUI.kt\ncom/stripe/android/ui/core/elements/AffirmElementUIKt\n*L\n28#1:32\n*E\n"
    }
.end annotation


# direct methods
.method public static final AffirmElementUI(LEt0;I)V
    .locals 14

    const v0, -0xa4ce6e1

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:16)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget v0, Lcom/stripe/android/ui/core/R$string;->affirm_buy_now_pay_later:I

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    new-instance v8, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    sget v3, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_affirm_logo:I

    sget v4, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_affirm:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;-><init>(IILsm0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "affirm"

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget-object v2, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v2, p0, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v5

    invoke-virtual {v2, p0, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v2

    invoke-virtual {v2}, LGc6;->j()LG26;

    move-result-object v7

    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v2, v10, v4, v8, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget v4, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;->$stable:I

    or-int/2addr v1, v4

    shl-int/lit8 v1, v1, 0x6

    or-int/lit8 v12, v1, 0x30

    const/16 v13, 0x1e0

    move-object v1, v0

    move-wide v4, v5

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move v9, v10

    move-object v10, v11

    move-object v11, p0

    invoke-static/range {v1 .. v13}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/ui/core/elements/AffirmElementUIKt$AffirmElementUI$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/AffirmElementUIKt$AffirmElementUI$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method
