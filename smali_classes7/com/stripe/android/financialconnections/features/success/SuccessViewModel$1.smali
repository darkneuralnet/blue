.class final Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V
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
        "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
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
        "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
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
    c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$1"
    f = "SuccessViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x33,
        0x37
    }
    m = "invokeSuspend"
    n = {
        "manifest"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

.field final synthetic $getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;-><init>(Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->I$0:I

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    invoke-virtual {p1, p0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSkipSuccessPane()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_1

    :cond_4
    move v1, v3

    :goto_1
    sget-object v5, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;->Companion:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;

    invoke-virtual {v5, p1}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;->fromManifest(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->$getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v7

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->L$1:Ljava/lang/Object;

    iput v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->I$0:I

    iput v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;->label:I

    invoke-virtual {v6, v7, p0}, Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5

    return-object v0

    :cond_5
    move v0, v1

    move-object v6, v5

    move-object v13, v2

    move-object v2, p1

    move-object p1, v13

    :goto_2
    move-object v9, p1

    check-cast v9, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getBusinessName()Ljava/lang/String;

    move-result-object v11

    sget-object p1, Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;

    invoke-virtual {p1, v2}, Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;->getDisconnectUrl(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getDisableLinkMoreAccounts()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v4

    if-ne p1, v4, :cond_6

    move p1, v4

    goto :goto_3

    :cond_6
    move p1, v3

    :goto_3
    if-eqz p1, :cond_7

    move v7, v4

    goto :goto_4

    :cond_7
    move v7, v3

    :goto_4
    new-instance p1, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    if-eqz v0, :cond_8

    move v12, v4

    goto :goto_5

    :cond_8
    move v12, v3

    :goto_5
    move-object v5, p1

    invoke-direct/range {v5 .. v12}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;-><init>(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object p1
.end method
