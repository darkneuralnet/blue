.class public final Lcom/stripe/android/ui/core/elements/MandateTextUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/MandateTextElement;",
        "element",
        "",
        "MandateTextUI",
        "(Lcom/stripe/android/ui/core/elements/MandateTextElement;LEt0;I)V",
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
        "SMAP\nMandateTextUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MandateTextUI.kt\ncom/stripe/android/ui/core/elements/MandateTextUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,28:1\n154#2:29\n*S KotlinDebug\n*F\n+ 1 MandateTextUI.kt\ncom/stripe/android/ui/core/elements/MandateTextUIKt\n*L\n24#1:29\n*E\n"
    }
.end annotation


# direct methods
.method public static final MandateTextUI(Lcom/stripe/android/ui/core/elements/MandateTextElement;LEt0;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "element"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x43f6ab38

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.ui.core.elements.MandateTextUI (MandateTextUI.kt:15)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/MandateTextElement;->getStringResId()I

    move-result v2

    const/4 v4, 0x1

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/MandateTextElement;->getMerchantName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    const-string v5, ""

    :cond_1
    const/4 v6, 0x0

    aput-object v5, v3, v6

    const/16 v5, 0x40

    invoke-static {v2, v3, v15, v5}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v3

    sget-object v2, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-virtual {v2, v15, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v6

    invoke-virtual {v6}, LGc6;->d()LG26;

    move-result-object v22

    invoke-static {v2, v15, v5}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v5

    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v7, 0x8

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v2, v9, v7, v4, v8}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v7, Lcom/stripe/android/ui/core/elements/MandateTextUIKt$MandateTextUI$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/MandateTextUIKt$MandateTextUI$1;

    invoke-static {v2, v4, v7}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v4

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    move-object/from16 v27, v15

    move-object v15, v2

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x7ff8

    move-object/from16 v23, v27

    invoke-static/range {v3 .. v26}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface/range {v27 .. v27}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lcom/stripe/android/ui/core/elements/MandateTextUIKt$MandateTextUI$2;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/ui/core/elements/MandateTextUIKt$MandateTextUI$2;-><init>(Lcom/stripe/android/ui/core/elements/MandateTextElement;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
