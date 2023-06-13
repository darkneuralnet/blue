.class final Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/BillingAddressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/core/model/CountryCode;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "newCountryCode",
        "Lcom/stripe/android/core/model/CountryCode;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/core/model/CountryCode;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->invoke(Lcom/stripe/android/core/model/CountryCode;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 5

    const-string v0, "newCountryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$updateStateView(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Lcom/stripe/android/core/model/CountryCode;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$updatePostalCodeView(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Lcom/stripe/android/core/model/CountryCode;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$get_address$p(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)LuX2;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$createAddress(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Lcom/stripe/android/model/Address;

    move-result-object v1

    invoke-virtual {v0, v1}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$getPostalCodeValidator$p(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Lcom/stripe/android/view/PostalCodeValidator;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getPostalCodeView$paymentsheet_release()Lcom/stripe/android/view/StripeEditText;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$getValue(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/view/PostalCodeValidator;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;->this$0:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getPostalCodeViewListener$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v3, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->access$getLocale(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;->onCountryChanged(Lcom/stripe/android/core/model/Country;Z)V

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getPostalCodeView$paymentsheet_release()Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void
.end method
