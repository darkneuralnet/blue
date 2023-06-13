.class final Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
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
    c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3"
    f = "PollAttachPaymentAccount.kt"
    i = {}
    l = {
        0x1f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field final synthetic $allowManualEntry:Z

.field final synthetic $params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
            "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$allowManualEntry:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$allowManualEntry:Z

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;-><init>(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)V

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object v3

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$params:Lcom/stripe/android/financialconnections/model/PaymentAccountParams;

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    iput v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->label:I

    move-object v7, p0

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$DefaultImpls;->postLinkAccountSessionPaymentAccount$default(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount$invoke$3;->$allowManualEntry:Z

    invoke-static {v0, p1, v1, v2}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->access$toDomainException(Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
