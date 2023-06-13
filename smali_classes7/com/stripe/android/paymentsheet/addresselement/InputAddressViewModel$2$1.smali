.class final Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "addressDetails",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $formControllerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->$formControllerProvider:LY94;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1, v0, p2, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap$default(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$get_formController$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)LGX2;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->$formControllerProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    invoke-static {v4}, LTr6;->a(LOr6;)LZC0;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewModelScope(LZC0;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v3

    const-string v4, ""

    invoke-interface {v3, v4}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->merchantName(Ljava/lang/String;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->shippingValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-static {v4, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->access$buildFormSpec(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Z)Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->initialValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->build()Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;->getFormController()Lcom/stripe/android/ui/core/FormController;

    move-result-object p1

    invoke-interface {v2, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2$1;->emit(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
