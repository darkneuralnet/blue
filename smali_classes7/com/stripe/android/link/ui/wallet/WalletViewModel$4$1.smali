.class final Lcom/stripe/android/link/ui/wallet/WalletViewModel$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletViewModel$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
        "kotlin.jvm.PlatformType",
        "it",
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
.field final synthetic this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4$1;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4$1;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    check-cast p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;->getItemId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, p1, v0, v1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Cancelled;->INSTANCE:Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Cancelled;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    instance-of p2, p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4$1;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    check-cast p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;->getError()Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->access$onError(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/link/ui/ErrorMessage;)V

    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4$1;->emit(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
