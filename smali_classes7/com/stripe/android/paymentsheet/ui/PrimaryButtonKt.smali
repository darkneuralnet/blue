.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "label",
        "",
        "LabelUI",
        "(Ljava/lang/String;LEt0;I)V",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private static final LabelUI(Ljava/lang/String;LEt0;I)V
    .locals 8

    const v0, -0x545e7623

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0xb

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.LabelUI (PrimaryButton.kt:242)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;

    invoke-direct {v4, p0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;-><init>(Ljava/lang/String;I)V

    const v1, 0x31e53ef

    const/4 v5, 0x1

    invoke-static {p1, v1, v5, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v1, v0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$2;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final synthetic access$LabelUI(Ljava/lang/String;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt;->LabelUI(Ljava/lang/String;LEt0;I)V

    return-void
.end method
