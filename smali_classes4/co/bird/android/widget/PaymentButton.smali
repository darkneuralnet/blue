.class public final Lco/bird/android/widget/PaymentButton;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\u0008\u0008\u0002\u0010.\u001a\u00020\u0013\u00a2\u0006\u0004\u0008/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006J\u000e\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0013J$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001eR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\"R\u0014\u0010%\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R\u0014\u0010\'\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\"R\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lco/bird/android/widget/PaymentButton;",
        "Landroid/widget/RelativeLayout;",
        "",
        "setDefaultFromPaymentLanding",
        "",
        "isGooglePay",
        "",
        "brand",
        "last4CardNumber",
        "setAdyenCard",
        "Lcom/stripe/android/model/Card;",
        "card",
        "setStripeCard",
        "Lcom/stripe/android/model/PaymentMethod;",
        "method",
        "setStripePaymentMethod",
        "email",
        "setPaypal",
        "a",
        "",
        "message",
        "b",
        "show",
        "c",
        "drawableId",
        "setEndIcon",
        "Lcom/stripe/android/model/CardBrand;",
        "last4",
        "d",
        "Landroid/widget/TextView;",
        "Landroid/widget/TextView;",
        "textView",
        "subtitleView",
        "Landroid/widget/ImageView;",
        "Landroid/widget/ImageView;",
        "iconView",
        "e",
        "rightArrowView",
        "f",
        "endIconView",
        "g",
        "endLabelView",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/TextView;


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

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/PaymentButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/PaymentButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    sget v0, Lmk4;->view_payment_button:I

    invoke-virtual {p3, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p3, Lzi4;->text:I

    invoke-static {p0, p3}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    sget v0, Lzi4;->subtitle:I

    invoke-static {p0, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    sget v0, Lzi4;->icon:I

    invoke-static {p0, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    sget v1, Lzi4;->rightArrow:I

    invoke-static {p0, v1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lco/bird/android/widget/PaymentButton;->e:Landroid/widget/ImageView;

    sget v1, Lzi4;->endIcon:I

    invoke-static {p0, v1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lco/bird/android/widget/PaymentButton;->f:Landroid/widget/ImageView;

    sget v1, Lzi4;->endLabel:I

    invoke-static {p0, v1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lco/bird/android/widget/PaymentButton;->g:Landroid/widget/TextView;

    sget-object v1, LKl4;->PaymentButton:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v1, "context.obtainStyledAttr\u2026.styleable.PaymentButton)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget v1, LKl4;->PaymentButton_paymentIcon:I

    const/4 v2, -0x1

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eq v1, v2, :cond_0

    invoke-static {p1, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    sget p1, LKl4;->PaymentButton_paymentEndIcon:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eq p1, v2, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/PaymentButton;->setEndIcon(I)V

    :cond_1
    sget p1, LKl4;->PaymentButton_paymentShowNextArrow:I

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/PaymentButton;->c(Z)V

    sget p1, LKl4;->PaymentButton_paymentText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
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
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/PaymentButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final c(Z)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/PaymentButton;->setEndIcon(I)V

    :cond_0
    iget-object v1, p0, Lco/bird/android/widget/PaymentButton;->e:Landroid/widget/ImageView;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v0, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final d(ZLcom/stripe/android/model/CardBrand;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v4, Lnl4;->credit_card_google_pay_short_name:I

    invoke-virtual {p3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lnl4;->credit_card_short_name:I

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p2, v6, v2

    aput-object p3, v6, v1

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    invoke-static {p3}, Ltu6;->l(Landroid/view/View;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-static {p3, v1, v2, v3, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    sget p1, Lrg4;->ic_google_pay_mark_800_gray:I

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_2
    invoke-static {p2}, Lxf0;->a(Lcom/stripe/android/model/CardBrand;)I

    move-result p1

    :goto_1
    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setAdyenCard(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "brand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4CardNumber"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lnl4;->credit_card_google_pay_short_name:I

    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lnl4;->credit_card_short_name:I

    new-array v7, v4, [Ljava/lang/Object;

    aput-object v0, v7, v3

    aput-object p3, v7, v2

    invoke-virtual {v5, v6, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    invoke-static {p3}, Ltu6;->l(Landroid/view/View;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-static {p3, v2, v3, v4, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p3, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    sget p1, Lrg4;->ic_google_pay_mark_800_gray:I

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lxf0;->b(Ljava/lang/String;)I

    move-result p1

    :goto_1
    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setDefaultFromPaymentLanding()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->g:Landroid/widget/TextView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->change_default:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->e:Landroid/widget/ImageView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final setEndIcon(I)V
    .locals 5

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-virtual {p0, v1}, Lco/bird/android/widget/PaymentButton;->c(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lvi;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final setPaypal(Ljava/lang/String;)V
    .locals 2

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    sget v1, Lnl4;->payment_paypal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    sget v1, Lrg4;->ic_paypal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/widget/PaymentButton;->b:Landroid/widget/TextView;

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/widget/PaymentButton;->d:Landroid/widget/ImageView;

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/widget/PaymentButton;->c:Landroid/widget/TextView;

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final setStripeCard(Lcom/stripe/android/model/Card;)V
    .locals 2

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LES5;->b(Lcom/stripe/android/model/Card;)Z

    move-result v0

    invoke-virtual {p1}, Lcom/stripe/android/model/Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Card;->getLast4()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lco/bird/android/widget/PaymentButton;->d(ZLcom/stripe/android/model/CardBrand;Ljava/lang/String;)V

    return-void
.end method

.method public final setStripePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 3

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod$Card;->wallet:Lcom/stripe/android/model/wallets/Wallet;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    instance-of v1, v1, Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;

    if-eqz p1, :cond_1

    iget-object v2, p1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, v1, v2, v0}, Lco/bird/android/widget/PaymentButton;->d(ZLcom/stripe/android/model/CardBrand;Ljava/lang/String;)V

    return-void
.end method
