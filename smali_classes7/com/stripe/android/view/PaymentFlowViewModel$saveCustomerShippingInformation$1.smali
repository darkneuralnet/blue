.class public final Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentFlowViewModel;->saveCustomerShippingInformation$payments_core_release(Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1",
        "Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;",
        "onCustomerRetrieved",
        "",
        "customer",
        "Lcom/stripe/android/model/Customer;",
        "onError",
        "errorCode",
        "",
        "errorMessage",
        "",
        "stripeError",
        "Lcom/stripe/android/core/StripeError;",
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
.field final synthetic $resultData:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/view/PaymentFlowViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/PaymentFlowViewModel;LuX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/PaymentFlowViewModel;",
            "LuX2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->this$0:Lcom/stripe/android/view/PaymentFlowViewModel;

    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->$resultData:LuX2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V
    .locals 2

    const-string v0, "customer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->this$0:Lcom/stripe/android/view/PaymentFlowViewModel;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentFlowViewModel;->setShippingInfoSubmitted$payments_core_release(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->$resultData:LuX2;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)V
    .locals 0

    const-string p1, "errorMessage"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->this$0:Lcom/stripe/android/view/PaymentFlowViewModel;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/PaymentFlowViewModel;->setShippingInfoSubmitted$payments_core_release(Z)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;->$resultData:LuX2;

    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p3, Ljava/lang/RuntimeException;

    invoke-direct {p3, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p2

    invoke-virtual {p1, p2}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
