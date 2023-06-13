.class public final Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;",
        "element",
        "",
        "AuBecsDebitMandateElementUI",
        "(Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;LEt0;I)V",
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
        "SMAP\nAuBecsDebitMandateElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuBecsDebitMandateElementUI.kt\ncom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,26:1\n154#2:27\n*S KotlinDebug\n*F\n+ 1 AuBecsDebitMandateElementUI.kt\ncom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt\n*L\n23#1:27\n*E\n"
    }
.end annotation


# direct methods
.method public static final AuBecsDebitMandateElementUI(Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "element"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x3203283b

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUI (AuBecsDebitMandateElementUI.kt:15)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget v2, Lcom/stripe/android/ui/core/R$string;->au_becs_mandate:I

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;->getMerchantName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    const-string v5, ""

    :cond_1
    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/16 v5, 0x40

    invoke-static {v2, v4, v15, v5}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-static {v4, v15, v5}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v6

    invoke-virtual {v4, v15, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v4

    invoke-virtual {v4}, LGc6;->d()LG26;

    move-result-object v8

    sget-object v4, LgV2;->b0:LgV2$a;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v4, v10, v5, v3, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v14, 0x30

    const/16 v16, 0x1e4

    move-object v3, v2

    move-object v13, v15

    move-object v2, v15

    move/from16 v15, v16

    invoke-static/range {v3 .. v15}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt$AuBecsDebitMandateElementUI$1;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt$AuBecsDebitMandateElementUI$1;-><init>(Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
