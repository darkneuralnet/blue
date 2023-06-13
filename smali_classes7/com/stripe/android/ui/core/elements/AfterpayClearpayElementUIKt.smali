.class public final Lcom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;",
        "element",
        "",
        "AfterpayClearpayElementUI",
        "(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;LEt0;I)V",
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
        "SMAP\nAfterpayClearpayElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AfterpayClearpayElementUI.kt\ncom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n76#2:61\n154#3:62\n*S KotlinDebug\n*F\n+ 1 AfterpayClearpayElementUI.kt\ncom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt\n*L\n27#1:61\n53#1:62\n*E\n"
    }
.end annotation


# direct methods
.method public static final AfterpayClearpayElementUI(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;LEt0;I)V
    .locals 37

    move-object/from16 v0, p1

    move/from16 v1, p3

    const-string v2, "element"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x74c81b95

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:22)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "context.resources"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;->getLabel(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "<img/>"

    const-string v6, "<img src=\"afterpay\"/>"

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v2, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    sget-object v4, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;->Companion:Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;->isClearpay$payments_ui_core_release()Z

    move-result v5

    if-eqz v5, :cond_1

    sget v5, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_clearpay_logo:I

    goto :goto_0

    :cond_1
    sget v5, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_afterpay_logo:I

    :goto_0
    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;->isClearpay$payments_ui_core_release()Z

    move-result v4

    if-eqz v4, :cond_2

    sget v4, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_clearpay:I

    goto :goto_1

    :cond_2
    sget v4, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_afterpay:I

    :goto_1
    sget-object v6, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-virtual {v6, v15, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v8

    invoke-virtual {v8}, LMm0;->n()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v8

    if-eqz v8, :cond_3

    const/4 v8, 0x0

    goto :goto_2

    :cond_3
    sget-object v9, Lsm0;->b:Lsm0$a;

    sget-object v8, Lpm0;->b:Lpm0$a;

    invoke-virtual {v8}, Lpm0$a;->h()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Lsm0$a;->b(Lsm0$a;JIILjava/lang/Object;)Lsm0;

    move-result-object v8

    :goto_2
    invoke-direct {v2, v5, v4, v8}, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;-><init>(IILsm0;)V

    const-string v4, "afterpay"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v8

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    invoke-static {v4}, Lk61;->g(F)F

    move-result v10

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v2, v8, v9, v10, v4}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v4

    invoke-static {v6, v15, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v8

    invoke-virtual {v6, v15, v7}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v2

    invoke-virtual {v2}, LGc6;->j()LG26;

    move-result-object v2

    new-instance v10, LGN5;

    move-object/from16 v16, v10

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x3fff

    const/16 v36, 0x0

    invoke-direct/range {v16 .. v36}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, LXU3;->a:LXU3$a;

    invoke-virtual {v6}, LXU3$a;->b()I

    move-result v11

    const/4 v12, 0x0

    sget v6, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;->$stable:I

    or-int/lit8 v6, v6, 0x0

    shl-int/lit8 v6, v6, 0x6

    const v7, 0x180030

    or-int/2addr v6, v7

    shl-int/lit8 v7, v1, 0xf

    const/high16 v13, 0x70000

    and-int/2addr v7, v13

    or-int v14, v6, v7

    const/16 v16, 0x100

    move-wide v6, v8

    move-object v8, v2

    move/from16 v9, p0

    move-object v13, v15

    move-object v2, v15

    move/from16 v15, v16

    invoke-static/range {v3 .. v15}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    new-instance v3, Lcom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1;

    move/from16 v4, p0

    invoke-direct {v3, v4, v0, v1}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1;-><init>(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method
