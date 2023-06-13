.class public final Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u0008\u0010\u000b\u001a\u00020\u000cH\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0008H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "imageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V",
        "create",
        "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "isDarkTheme",
        "",
        "loadPaymentOption",
        "Landroid/graphics/drawable/Drawable;",
        "paymentOption",
        "(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentsheet_release"
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
.field private final imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V
    .locals 1

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    return-void
.end method

.method public static final synthetic access$loadPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadPaymentOption$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final isDarkTheme()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final loadPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getLightThemeIconUrl$paymentsheet_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getDarkThemeIconUrl$paymentsheet_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->isDarkTheme()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-static {p0, p1, v1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {p0, p1, v0, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method private static final loadPaymentOption$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;

    invoke-direct {v0, p3}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->L$1:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    iget-object p0, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$loadPaymentOption$loadIcon$1;->label:I

    invoke-virtual {p3, p2, v0}, Lcom/stripe/android/uicore/image/StripeImageLoader;->load-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const/4 p2, 0x0

    :cond_4
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_5

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    invoke-direct {p1, p0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_5
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->loadPaymentOption$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private static final loadPaymentOption$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentOption;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getDrawableResourceId()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LuM4;->f(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 7

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v2, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_google_pay_mark:I

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->google_pay:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const-string v0, "getString(R.string.google_pay)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_1

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v2, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_link:I

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->link:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$2;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$2;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const-string v0, "getString(R.string.link)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getSavedPaymentMethodIcon(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    move v2, v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getLabel(Lcom/stripe/android/model/PaymentMethod;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    move-object v3, p1

    new-instance v6, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$3;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$3;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_1

    :cond_4
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getCardBrandIcon(Lcom/stripe/android/model/CardBrand;)I

    move-result v2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->resources:Landroid/content/res/Resources;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getLast4()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->createCardLabel(Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$4;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$4;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getIconResource()I

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getLabel()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$5;

    invoke-direct {v5, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$5;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;->getIconResource()I

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;->getLabelResource()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$6;

    invoke-direct {v5, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$6;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    goto :goto_1

    :cond_7
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-eqz v0, :cond_8

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getIconResource()I

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getLabelResource()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$7;

    invoke-direct {v5, p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$7;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentOption;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
