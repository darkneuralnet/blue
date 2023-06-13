.class public final Lcom/stripe/android/view/ShippingMethodView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/view/ShippingMethodView;",
        "Landroid/widget/RelativeLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "colorUtils",
        "Lcom/stripe/android/view/StripeColorUtils;",
        "selectedColorInt",
        "unselectedTextColorPrimaryInt",
        "unselectedTextColorSecondaryInt",
        "viewBinding",
        "Lcom/stripe/android/databinding/ShippingMethodViewBinding;",
        "setSelected",
        "",
        "selected",
        "",
        "setShippingMethod",
        "shippingMethod",
        "Lcom/stripe/android/model/ShippingMethod;",
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
.field private final colorUtils:Lcom/stripe/android/view/StripeColorUtils;

.field private final selectedColorInt:I

.field private final unselectedTextColorPrimaryInt:I

.field private final unselectedTextColorSecondaryInt:I

.field private final viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;


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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/ShippingMethodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/ShippingMethodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lcom/stripe/android/view/StripeColorUtils;

    invoke-direct {p2, p1}, Lcom/stripe/android/view/StripeColorUtils;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/view/ShippingMethodView;->colorUtils:Lcom/stripe/android/view/StripeColorUtils;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    invoke-static {p3, p0}, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    move-result-object p3

    const-string v0, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    invoke-virtual {p2}, Lcom/stripe/android/view/StripeColorUtils;->getColorAccent()I

    move-result p3

    invoke-virtual {p2}, Lcom/stripe/android/view/StripeColorUtils;->getTextColorPrimary()I

    move-result v0

    invoke-virtual {p2}, Lcom/stripe/android/view/StripeColorUtils;->getTextColorSecondary()I

    move-result p2

    sget-object v1, Lcom/stripe/android/view/StripeColorUtils;->Companion:Lcom/stripe/android/view/StripeColorUtils$Companion;

    invoke-virtual {v1, p3}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_0

    sget p3, Lcom/stripe/android/R$color;->stripe_accent_color_default:I

    invoke-static {p1, p3}, LNA0;->c(Landroid/content/Context;I)I

    move-result p3

    :cond_0
    iput p3, p0, Lcom/stripe/android/view/ShippingMethodView;->selectedColorInt:I

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorTransparent(I)Z

    move-result p3

    if-eqz p3, :cond_1

    sget p3, Lcom/stripe/android/R$color;->stripe_color_text_unselected_primary_default:I

    invoke-static {p1, p3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    :cond_1
    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->unselectedTextColorPrimaryInt:I

    invoke-virtual {v1, p2}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorTransparent(I)Z

    move-result p3

    if-eqz p3, :cond_2

    sget p2, Lcom/stripe/android/R$color;->stripe_color_text_unselected_secondary_default:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    :cond_2
    iput p2, p0, Lcom/stripe/android/view/ShippingMethodView;->unselectedTextColorSecondaryInt:I

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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/ShippingMethodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public setSelected(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->name:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->selectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->description:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->selectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->price:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->selectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->selectedIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->name:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->unselectedTextColorPrimaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->description:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->unselectedTextColorSecondaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->price:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->unselectedTextColorPrimaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object p1, p1, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->selectedIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 5

    const-string v0, "shippingMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->name:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingMethod;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->description:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingMethod;->getDetail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->viewBinding:Lcom/stripe/android/databinding/ShippingMethodViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/ShippingMethodViewBinding;->price:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingMethod;->getAmount()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingMethod;->getCurrency()Ljava/util/Currency;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/stripe/android/R$string;->price_free:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "context.getString(R.string.price_free)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, p1, v3}, Lcom/stripe/android/view/PaymentUtils;->formatPriceStringUsingFree(JLjava/util/Currency;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
