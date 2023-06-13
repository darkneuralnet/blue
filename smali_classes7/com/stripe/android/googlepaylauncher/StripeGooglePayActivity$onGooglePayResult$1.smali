.class final Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->onGooglePayResult(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Result<",
        "+",
        "Lcom/stripe/android/model/PaymentMethod;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "result",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "kotlin.jvm.PlatformType",
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
.field final synthetic $shippingInformation:Lcom/stripe/android/model/ShippingInformation;

.field final synthetic this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;Lcom/stripe/android/model/ShippingInformation;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;->$shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;->invoke(Lkotlin/Result;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Result;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;->this$0:Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$onGooglePayResult$1;->$shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_0

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v0, p1, v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$onPaymentMethodCreated(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$getViewModel(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->setPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    invoke-static {v0}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;->access$getViewModel(Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;)Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;->updateGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;)V

    :cond_1
    :goto_0
    return-void
.end method
