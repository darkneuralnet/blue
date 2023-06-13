.class final Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.link.ui.wallet.WalletViewModel$loadPaymentDetails$2"
    f = "WalletViewModel.kt"
    i = {}
    l = {
        0x158
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,418:1\n230#2,5:419\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2\n*L\n346#1:419,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $initialSetup:Z

.field final synthetic $selectedItem:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletViewModel;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$initialSetup:Z

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$selectedItem:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$initialSetup:Z

    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$selectedItem:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-static {p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iput v2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->label:I

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/account/LinkAccountManager;->listPaymentDetails-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->this$0:Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$initialSetup:Z

    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;->$selectedItem:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_5

    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails;

    invoke-static {v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->access$get_uiState$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)LGX2;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v6, p1, v3}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->updateWithResponse(Lcom/stripe/android/model/ConsumerPaymentDetails;Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v6

    invoke-interface {v5, v4, v6}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getPrefilledCardParams$link_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->access$getNavigator$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/model/Navigator;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/LinkScreen$PaymentMethod;-><init>(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->addNewPaymentMethod(Z)V

    goto :goto_1

    :cond_5
    invoke-static {v0, v4}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->access$onFatal(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/Throwable;)V

    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
