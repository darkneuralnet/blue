.class public final Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "parseAppearance",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "validate",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheetConfigurationKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetConfigurationKtx.kt\ncom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,104:1\n141#2,2:105\n*S KotlinDebug\n*F\n+ 1 PaymentSheetConfigurationKtx.kt\ncom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt\n*L\n100#1:105,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V
    .locals 47

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    sget-object v2, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsLight()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponent()I

    move-result v4

    invoke-static {v4}, Lvm0;->b(I)J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponentBorder()I

    move-result v6

    invoke-static {v6}, Lvm0;->b(I)J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponentDivider()I

    move-result v8

    invoke-static {v8}, Lvm0;->b(I)J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getOnComponent()I

    move-result v10

    invoke-static {v10}, Lvm0;->b(I)J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getSubtitle()I

    move-result v12

    invoke-static {v12}, Lvm0;->b(I)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPlaceholderText()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lvm0;->b(I)J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getAppBarIcon()I

    move-result v18

    invoke-static/range {v18 .. v18}, Lvm0;->b(I)J

    move-result-wide v18

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPrimary()I

    move-result v20

    invoke-static/range {v20 .. v20}, Lvm0;->b(I)J

    move-result-wide v21

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getSurface()I

    move-result v20

    invoke-static/range {v20 .. v20}, Lvm0;->b(I)J

    move-result-wide v31

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getOnSurface()I

    move-result v20

    invoke-static/range {v20 .. v20}, Lvm0;->b(I)J

    move-result-wide v41

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getError()I

    move-result v20

    invoke-static/range {v20 .. v20}, Lvm0;->b(I)J

    move-result-wide v33

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0xb9e

    const/16 v46, 0x0

    invoke-static/range {v21 .. v46}, LNm0;->h(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v20

    const/16 v21, 0x20

    const/16 v22, 0x0

    invoke-static/range {v3 .. v22}, Lcom/stripe/android/uicore/StripeColors;->copy-KvvhxLA$default(Lcom/stripe/android/uicore/StripeColors;JJJJJJJJLMm0;ILjava/lang/Object;)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/uicore/StripeTheme;->setColorsLightMutable(Lcom/stripe/android/uicore/StripeColors;)V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getColorsDark()Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponent()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponentBorder()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getComponentDivider()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getOnComponent()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v11

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getSubtitle()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPlaceholderText()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v17

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getAppBarIcon()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v19

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPrimary()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v21

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getSurface()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v31

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getOnSurface()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v41

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getError()I

    move-result v3

    invoke-static {v3}, Lvm0;->b(I)J

    move-result-wide v33

    invoke-static/range {v21 .. v46}, LNm0;->d(JJJJJJJJJJJJILjava/lang/Object;)LMm0;

    move-result-object v21

    const/16 v22, 0x20

    const/16 v23, 0x0

    invoke-static/range {v4 .. v23}, Lcom/stripe/android/uicore/StripeColors;->copy-KvvhxLA$default(Lcom/stripe/android/uicore/StripeColors;JJJJJJJJLMm0;ILjava/lang/Object;)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/uicore/StripeTheme;->setColorsDarkMutable(Lcom/stripe/android/uicore/StripeColors;)V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getShapes()Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->getCornerRadiusDp()F

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->getBorderStrokeWidthDp()F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/uicore/StripeShapes;->copy$default(Lcom/stripe/android/uicore/StripeShapes;FFFILjava/lang/Object;)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/uicore/StripeTheme;->setShapesMutable(Lcom/stripe/android/uicore/StripeShapes;)V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->getFontResId()Ljava/lang/Integer;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->getSizeScaleFactor()F

    move-result v8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v29, 0x3fbf7

    const/16 v30, 0x0

    invoke-static/range {v4 .. v30}, Lcom/stripe/android/uicore/StripeTypography;->copy-BZCqYng$default(Lcom/stripe/android/uicore/StripeTypography;IIIFJJJJJJLjava/lang/Integer;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;Lkw1;ILjava/lang/Object;)Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/uicore/StripeTheme;->setTypographyMutable(Lcom/stripe/android/uicore/StripeTypography;)V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v3

    new-instance v12, Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getBackground()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPrimary()I

    move-result v4

    :goto_0
    invoke-static {v4}, Lvm0;->b(I)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getOnBackground()I

    move-result v4

    invoke-static {v4}, Lvm0;->b(I)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsLight()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getBorder()I

    move-result v4

    invoke-static {v4}, Lvm0;->b(I)J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/uicore/PrimaryButtonColors;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/stripe/android/uicore/PrimaryButtonColors;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getBackground()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getPrimary()I

    move-result v5

    :goto_1
    invoke-static {v5}, Lvm0;->b(I)J

    move-result-wide v14

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getOnBackground()I

    move-result v5

    invoke-static {v5}, Lvm0;->b(I)J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getColorsDark()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->getBorder()I

    move-result v5

    invoke-static {v5}, Lvm0;->b(I)J

    move-result-wide v18

    const/16 v20, 0x0

    move-object v13, v4

    invoke-direct/range {v13 .. v20}, Lcom/stripe/android/uicore/PrimaryButtonColors;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/stripe/android/uicore/PrimaryButtonShape;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getShape()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;->getCornerRadiusDp()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->getCornerRadiusDp()F

    move-result v6

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getShape()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;->getBorderStrokeWidthDp()Ljava/lang/Float;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    goto :goto_3

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getShapes()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->getBorderStrokeWidthDp()F

    move-result v7

    :goto_3
    invoke-direct {v5, v6, v7}, Lcom/stripe/android/uicore/PrimaryButtonShape;-><init>(FF)V

    new-instance v6, Lcom/stripe/android/uicore/PrimaryButtonTypography;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;->getFontResId()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->getFontResId()Ljava/lang/Integer;

    move-result-object v7

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getPrimaryButton()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;->getFontSizeSp()Ljava/lang/Float;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, LN26;->e(F)J

    move-result-wide v1

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getTypography()Lcom/stripe/android/uicore/StripeTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTypography;->getLargeFontSize-XSAIIZE()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getTypography()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->getSizeScaleFactor()F

    move-result v1

    invoke-static {v8, v9}, LN26;->b(J)V

    invoke-static {v8, v9}, LM26;->f(J)J

    move-result-wide v10

    invoke-static {v8, v9}, LM26;->h(J)F

    move-result v2

    mul-float/2addr v2, v1

    invoke-static {v10, v11, v2}, LN26;->i(JF)J

    move-result-wide v1

    :goto_4
    const/4 v8, 0x0

    invoke-direct {v6, v7, v1, v2, v8}, Lcom/stripe/android/uicore/PrimaryButtonTypography;-><init>(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v12, v4, v5, v6}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->copy(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/StripeTheme;->setPrimaryButtonStyle(Lcom/stripe/android/uicore/PrimaryButtonStyle;)V

    return-void
.end method

.method public static final validate(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-nez v1, :cond_2

    return-void

    :cond_2
    new-instance p0, Ljava/security/InvalidParameterException;

    const-string v0, "When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string."

    invoke-direct {p0, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/security/InvalidParameterException;

    const-string v0, "When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string."

    invoke-direct {p0, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/security/InvalidParameterException;

    const-string v0, "When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string."

    invoke-direct {p0, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
