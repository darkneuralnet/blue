.class public final Lcom/stripe/android/view/MaskedCardView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/MaskedCardView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0008\u0010$\u001a\u00020\u001bH\u0002J\u0008\u0010%\u001a\u00020\u001bH\u0002J\u0008\u0010&\u001a\u00020\u001bH\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\u00108G@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/view/MaskedCardView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "<set-?>",
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrand",
        "getCardBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cardDisplayFactory",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "",
        "last4",
        "getLast4",
        "()Ljava/lang/String;",
        "themeConfig",
        "Lcom/stripe/android/view/ThemeConfig;",
        "viewBinding",
        "Lcom/stripe/android/databinding/MaskedCardViewBinding;",
        "getViewBinding$payments_core_release",
        "()Lcom/stripe/android/databinding/MaskedCardViewBinding;",
        "applyTint",
        "",
        "imageView",
        "Landroid/widget/ImageView;",
        "setPaymentMethod",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "setSelected",
        "selected",
        "",
        "updateBrandIcon",
        "updateCheckMark",
        "updateUi",
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
.field private cardBrand:Lcom/stripe/android/model/CardBrand;

.field private final cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

.field private last4:Ljava/lang/String;

.field private final themeConfig:Lcom/stripe/android/view/ThemeConfig;

.field private final viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/stripe/android/databinding/MaskedCardViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/MaskedCardViewBinding;

    move-result-object p2

    const-string p3, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;

    new-instance p3, Lcom/stripe/android/view/ThemeConfig;

    invoke-direct {p3, p1}, Lcom/stripe/android/view/ThemeConfig;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/stripe/android/view/MaskedCardView;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    new-instance p1, Lcom/stripe/android/view/CardDisplayTextFactory;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "resources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, p3}, Lcom/stripe/android/view/CardDisplayTextFactory;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V

    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    iget-object p1, p2, Lcom/stripe/android/databinding/MaskedCardViewBinding;->brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p3, "viewBinding.brandIcon"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->applyTint(Landroid/widget/ImageView;)V

    iget-object p1, p2, Lcom/stripe/android/databinding/MaskedCardViewBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p2, "viewBinding.checkIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->applyTint(Landroid/widget/ImageView;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final applyTint(Landroid/widget/ImageView;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ThemeConfig;->getTintColor$payments_core_release(Z)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p1, v0}, LxY1;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private final updateBrandIcon()V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/MaskedCardViewBinding;->brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    sget-object v3, Lcom/stripe/android/view/MaskedCardView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_unknown:I

    goto :goto_0

    :pswitch_1
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_cartebancaire_template_32:I

    goto :goto_0

    :pswitch_2
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_unionpay_template_32:I

    goto :goto_0

    :pswitch_3
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_mastercard_template_32:I

    goto :goto_0

    :pswitch_4
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_visa_template_32:I

    goto :goto_0

    :pswitch_5
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_diners_template_32:I

    goto :goto_0

    :pswitch_6
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_jcb_template_32:I

    goto :goto_0

    :pswitch_7
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_discover_template_32:I

    goto :goto_0

    :pswitch_8
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_amex_template_32:I

    :goto_0
    invoke-static {v1, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final updateCheckMark()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/MaskedCardViewBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final updateUi()V
    .locals 5

    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateBrandIcon()V

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/MaskedCardViewBinding;->details:Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    iget-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v3, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/view/CardDisplayTextFactory;->createStyled$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Z)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getCardBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewBinding$payments_core_release()Lcom/stripe/android/databinding/MaskedCardViewBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/MaskedCardViewBinding;

    return-object v0
.end method

.method public final setPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_1
    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateUi()V

    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCheckMark()V

    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateUi()V

    return-void
.end method
