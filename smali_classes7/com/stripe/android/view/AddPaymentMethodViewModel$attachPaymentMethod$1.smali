.class public final Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/AddPaymentMethodViewModel;->attachPaymentMethod$payments_core_release(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/PaymentMethod;)Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1",
        "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;",
        "onError",
        "",
        "errorCode",
        "",
        "errorMessage",
        "",
        "stripeError",
        "Lcom/stripe/android/core/StripeError;",
        "onPaymentMethodRetrieved",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
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
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/view/AddPaymentMethodViewModel;


# direct methods
.method public constructor <init>(LuX2;Lcom/stripe/android/view/AddPaymentMethodViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LuX2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;",
            "Lcom/stripe/android/view/AddPaymentMethodViewModel;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;->$resultData:LuX2;

    iput-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;->this$0:Lcom/stripe/android/view/AddPaymentMethodViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)V
    .locals 3

    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;->$resultData:LuX2;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, Ljava/lang/RuntimeException;

    iget-object v2, p0, Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;->this$0:Lcom/stripe/android/view/AddPaymentMethodViewModel;

    invoke-static {v2}, Lcom/stripe/android/view/AddPaymentMethodViewModel;->access$getErrorMessageTranslator$p(Lcom/stripe/android/view/AddPaymentMethodViewModel;)Lcom/stripe/android/view/i18n/ErrorMessageTranslator;

    move-result-object v2

    invoke-interface {v2, p1, p2, p3}, Lcom/stripe/android/view/i18n/ErrorMessageTranslator;->translate(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onPaymentMethodRetrieved(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1;->$resultData:LuX2;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
