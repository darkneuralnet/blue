.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "isEnabled",
        "",
        "text",
        "Lkotlin/Function0;",
        "",
        "onButtonClick",
        "AddressElementPrimaryButton",
        "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V",
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
        "SMAP\nAddressElementPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,84:1\n76#2:85\n174#3:86\n*S KotlinDebug\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt\n*L\n37#1:85\n41#1:86\n*E\n"
    }
.end annotation


# direct methods
.method public static final AddressElementPrimaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v15, p4

    const-string v0, "text"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onButtonClick"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2e440c7b

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v11

    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_1

    invoke-interface {v11, v12}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v2, v15, 0x70

    if-nez v2, :cond_3

    invoke-interface {v11, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v15, 0x380

    if-nez v2, :cond_5

    invoke-interface {v11, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    move v7, v1

    and-int/lit16 v1, v7, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {v11}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v11}, LEt0;->k()V

    move-object v15, v11

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AddressElementPrimaryButton (AddressElementPrimaryButton.kt:29)"

    invoke-static {v0, v7, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {v11, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->getBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Lvm0;->b(I)J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Lvm0;->b(I)J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Lvm0;->b(I)J

    move-result-wide v3

    invoke-static {v2, v3, v4}, LfZ;->a(FJ)LeZ;

    move-result-object v4

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v0

    invoke-static {v0}, Lcc5;->a(F)Lbc5;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v0

    const/4 v8, 0x1

    if-eqz v0, :cond_9

    new-array v2, v8, [Lew1;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lqw1;->b(ILJw1;IIILjava/lang/Object;)Lew1;

    move-result-object v0

    const/16 v16, 0x0

    aput-object v0, v2, v16

    invoke-static {v2}, Llw1;->b([Lew1;)Lkw1;

    move-result-object v0

    goto :goto_5

    :cond_9
    sget-object v0, Lkw1;->c:Lkw1$a;

    invoke-virtual {v0}, Lkw1$a;->a()LUX5;

    move-result-object v0

    :goto_5
    move-object/from16 v24, v0

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontSize-XSAIIZE()J

    move-result-wide v19

    new-instance v42, LG26;

    move-object/from16 v16, v42

    const-wide/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const v40, 0x3ffdd

    const/16 v41, 0x0

    invoke-direct/range {v16 .. v41}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v2, v8, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    sget-object v1, LWz0;->a:LWz0;

    sget v8, LWz0;->b:I

    if-eqz v12, :cond_a

    invoke-virtual {v1, v11, v8}, LWz0;->c(LEt0;I)F

    move-result v1

    goto :goto_6

    :cond_a
    invoke-virtual {v1, v11, v8}, LWz0;->b(LEt0;I)F

    move-result v1

    :goto_6
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    new-instance v8, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;

    move-object v0, v8

    move-object/from16 v1, p2

    move-object v12, v2

    move/from16 v2, p0

    move-object v13, v8

    const/4 v14, 0x1

    move-object/from16 v8, p1

    move-object v15, v11

    move-object/from16 v11, v42

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1;-><init>(Lkotlin/jvm/functions/Function0;ZLbc5;LeZ;JILjava/lang/String;JLG26;)V

    const v0, -0x31a7f93b

    invoke-static {v15, v0, v14, v13}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v12, v0, v15, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_7
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$2;

    move/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$2;-><init>(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method
