.class public final Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "error",
        "LgV2;",
        "modifier",
        "",
        "ErrorMessage",
        "(Ljava/lang/String;LgV2;LEt0;II)V",
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
        "SMAP\nErrorMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorMessage.kt\ncom/stripe/android/paymentsheet/ui/ErrorMessageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,47:1\n76#2:48\n76#2:49\n36#3:50\n36#3:57\n1057#4,6:51\n1057#4,3:58\n1060#4,3:63\n174#5:61\n88#6:62\n*S KotlinDebug\n*F\n+ 1 ErrorMessage.kt\ncom/stripe/android/paymentsheet/ui/ErrorMessageKt\n*L\n22#1:48\n23#1:49\n26#1:50\n32#1:57\n26#1:51,6\n32#1:58,3\n32#1:63,3\n35#1:61\n35#1:62\n*E\n"
    }
.end annotation


# direct methods
.method public static final ErrorMessage(Ljava/lang/String;LgV2;LEt0;II)V
    .locals 26

    move-object/from16 v1, p0

    move/from16 v0, p3

    move/from16 v15, p4

    const-string v2, "error"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0xda34a06

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v3, v15, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v0, 0xe

    if-nez v3, :cond_2

    invoke-interface {v13, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    and-int/lit8 v4, v15, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v0, 0x70

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v13, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    move v14, v3

    and-int/lit8 v3, v14, 0x5b

    const/16 v6, 0x12

    if-ne v3, v6, :cond_7

    invoke-interface {v13}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v13}, LEt0;->k()V

    move-object/from16 v25, v13

    goto/16 :goto_7

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    sget-object v3, LgV2;->b0:LgV2$a;

    move-object/from16 v24, v3

    goto :goto_6

    :cond_8
    move-object/from16 v24, v5

    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:17)"

    invoke-static {v2, v14, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v13, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    sget-object v6, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-static {v6, v13, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeTypography(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v4

    sget v5, Lcom/stripe/android/uicore/StripeTypography;->$stable:I

    const v5, 0x44faf204

    invoke-interface {v13, v5}, LEt0;->F(I)V

    invoke-interface {v13, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_a

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_d

    :cond_a
    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static {v2, v8}, LuM4;->h(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v2

    if-nez v2, :cond_c

    :cond_b
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_c
    move-object v9, v2

    invoke-interface {v13, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_d
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v9, Landroid/graphics/Typeface;

    invoke-interface {v13, v5}, LEt0;->F(I)V

    invoke-interface {v13, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_e

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_f

    :cond_e
    sget-object v2, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTypography;->getSmallFontSize-XSAIIZE()J

    move-result-wide v10

    invoke-static {v10, v11}, LM26;->h(J)F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeTypography;->getFontSizeMultiplier()F

    move-result v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-interface {v3, v2}, Lg01;->s0(F)J

    move-result-wide v2

    invoke-static {v2, v3}, LM26;->b(J)LM26;

    move-result-object v5

    invoke-interface {v13, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v5, LM26;

    invoke-virtual {v5}, LM26;->k()J

    move-result-wide v4

    invoke-virtual {v6, v13, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->d()J

    move-result-wide v2

    const-string v6, "typeface"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, LXd;->a(Landroid/graphics/Typeface;)Lkw1;

    move-result-object v8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v25, v13

    move/from16 v20, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    and-int/lit8 v21, v20, 0xe

    and-int/lit8 v20, v20, 0x70

    or-int v21, v21, v20

    const/16 v22, 0x0

    const v23, 0xffb0

    move-object/from16 v0, p0

    move-object/from16 v1, v24

    move-object/from16 v20, v25

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    move-object/from16 v5, v24

    :goto_7
    invoke-interface/range {v25 .. v25}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_8

    :cond_11
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt$ErrorMessage$1;

    move-object/from16 v2, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct {v1, v2, v5, v3, v4}, Lcom/stripe/android/paymentsheet/ui/ErrorMessageKt$ErrorMessage$1;-><init>(Ljava/lang/String;LgV2;II)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method
