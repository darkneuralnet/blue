.class final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
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
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
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
    c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$3"
    f = "PollAuthorizationSessionAccounts.kt"
    i = {}
    l = {
        0x26
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $canRetry:Z

.field final synthetic $manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$canRetry:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$canRetry:Z

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;ZLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->label:I

    const-string v2, "Required value was null."

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v1, p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    invoke-static {v4}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object p1

    iput v3, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->label:I

    invoke-interface {v1, v4, p1, p0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->postAuthorizationSessionAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v0

    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1f

    const/4 v11, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/stripe/android/financialconnections/exception/AccountLoadError;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$canRetry:Z

    invoke-direct {v2, v3, v0, p1, v1}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;-><init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V

    throw v2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->this$0:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v2

    sget-object p1, Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1, v3}, Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;->getBusinessName(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$canRetry:Z

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;->$manifest:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->access$toDomainException(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
