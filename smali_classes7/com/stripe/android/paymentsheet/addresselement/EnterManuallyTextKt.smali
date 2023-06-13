.class public final Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onClick",
        "EnterManuallyText",
        "(Lkotlin/jvm/functions/Function0;LEt0;I)V",
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
        "SMAP\nEnterManuallyText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterManuallyText.kt\ncom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n916#2:32\n36#3:33\n1057#4,6:34\n*S KotlinDebug\n*F\n+ 1 EnterManuallyText.kt\ncom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt\n*L\n16#1:32\n27#1:33\n27#1:34,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final EnterManuallyText(Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "onClick"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x2e4bdbf8

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v3, v1, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v14, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0xb

    if-ne v5, v4, :cond_3

    invoke-interface {v14}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v14}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.addresselement.EnterManuallyText (EnterManuallyText.kt:11)"

    invoke-static {v2, v3, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    const v2, 0x3f393480

    invoke-interface {v14, v2}, LEt0;->F(I)V

    new-instance v2, LDf$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, LDf$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_enter_address_manually:I

    invoke-static {v3, v14, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LDf$a;->i(Ljava/lang/String;)V

    invoke-virtual {v2}, LDf$a;->l()LDf;

    move-result-object v3

    invoke-interface {v14}, LEt0;->Q()V

    sget-object v2, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-virtual {v2, v14, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v6

    invoke-virtual {v6}, LGc6;->c()LG26;

    move-result-object v15

    sget-object v6, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/StripeTypography;->getLargeFontSize-XSAIIZE()J

    move-result-wide v18

    invoke-virtual {v2, v14, v5}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->j()J

    move-result-wide v16

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const v39, 0x3fffc

    const/16 v40, 0x0

    invoke-static/range {v15 .. v40}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v2, 0x44faf204

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-interface {v14, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_5

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v10, v2, :cond_6

    :cond_5
    new-instance v10, Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt$EnterManuallyText$2$1;

    invoke-direct {v10, v0}, Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt$EnterManuallyText$2$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v14, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v14}, LEt0;->Q()V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/16 v13, 0x7a

    move-object v11, v14

    invoke-static/range {v3 .. v13}, Lck0;->a(LDf;LgV2;LG26;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_8

    goto :goto_4

    :cond_8
    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt$EnterManuallyText$3;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/EnterManuallyTextKt$EnterManuallyText$3;-><init>(Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method
