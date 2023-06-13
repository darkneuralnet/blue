.class public final Lcom/stripe/android/view/CardDisplayTextFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\u0008\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\u0008\u0016J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "resources",
        "Landroid/content/res/Resources;",
        "themeConfig",
        "Lcom/stripe/android/view/ThemeConfig;",
        "(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V",
        "createStyled",
        "Landroid/text/SpannableString;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "last4",
        "",
        "isSelected",
        "",
        "createStyled$payments_core_release",
        "createUnstyled",
        "card",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "createUnstyled$payments_core_release",
        "setSpan",
        "",
        "displayString",
        "span",
        "Landroid/text/ParcelableSpan;",
        "start",
        "",
        "end",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final resources:Landroid/content/res/Resources;

.field private final themeConfig:Lcom/stripe/android/view/ThemeConfig;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "context.resources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/view/ThemeConfig;

    invoke-direct {v1, p1}, Lcom/stripe/android/view/ThemeConfig;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardDisplayTextFactory;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V
    .locals 1

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CardDisplayTextFactory;->resources:Landroid/content/res/Resources;

    iput-object p2, p0, Lcom/stripe/android/view/CardDisplayTextFactory;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    return-void
.end method

.method private final setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V
    .locals 1

    const/16 v0, 0x21

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method


# virtual methods
.method public final synthetic createStyled$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Z)Landroid/text/SpannableString;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v7, p3

    const-string v1, "brand"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v15, 0x0

    if-eqz p2, :cond_1

    invoke-static/range {p2 .. p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v15

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    const-string v13, "sans-serif-medium"

    if-eqz v3, :cond_2

    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v14}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/text/style/TypefaceSpan;

    invoke-direct {v3, v13}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2, v3, v15, v1}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    return-object v2

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/view/CardDisplayTextFactory;->resources:Landroid/content/res/Resources;

    sget v3, Lcom/stripe/android/R$string;->card_ending_in:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v14, v4, v15

    aput-object p2, v4, v2

    invoke-virtual {v1, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const-string v1, "resources.getString(R.st\u2026ing_in, brandText, last4)"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v12

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    const/4 v10, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v8, v12

    move-object v9, v14

    move v6, v11

    move v11, v3

    move-object v3, v12

    move v12, v4

    move-object v4, v13

    move-object v13, v5

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v5

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v5

    iget-object v9, v0, Lcom/stripe/android/view/CardDisplayTextFactory;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    invoke-virtual {v9, v7}, Lcom/stripe/android/view/ThemeConfig;->getTextColor$payments_core_release(Z)I

    move-result v9

    iget-object v10, v0, Lcom/stripe/android/view/CardDisplayTextFactory;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    invoke-virtual {v10, v7}, Lcom/stripe/android/view/ThemeConfig;->getTextAlphaColor$payments_core_release(Z)I

    move-result v7

    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-direct {v0, v10, v3, v15, v6}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    new-instance v3, Landroid/text/style/TypefaceSpan;

    invoke-direct {v3, v4}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v10, v3, v5, v8}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-direct {v0, v10, v3, v5, v8}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    new-instance v3, Landroid/text/style/TypefaceSpan;

    invoke-direct {v3, v4}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v10, v3, v1, v2}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-direct {v0, v10, v3, v1, v2}, Lcom/stripe/android/view/CardDisplayTextFactory;->setSpan(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V

    return-object v10
.end method

.method public final synthetic createUnstyled$payments_core_release(Lcom/stripe/android/model/PaymentMethod$Card;)Ljava/lang/String;
    .locals 5

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardDisplayTextFactory;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/stripe/android/R$string;->card_ending_in:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v3}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(\n   \u2026     card.last4\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
