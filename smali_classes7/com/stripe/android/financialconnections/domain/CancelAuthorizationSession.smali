.class public final Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
        "",
        "coordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "authorizationSessionId",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCancelAuthorizationSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancelAuthorizationSession.kt\ncom/stripe/android/financialconnections/domain/CancelAuthorizationSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"
    }
.end annotation


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 1

    const-string v0, "coordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v2

    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->label:I

    invoke-interface {p2, v2, p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->cancelAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    move-object v2, p2

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->coordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->invoke()LBX2;

    move-result-object p1

    sget-object v2, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;->INSTANCE:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession$invoke$1;->label:I

    invoke-interface {p1, v2, v0}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p2

    :goto_2
    return-object p1
.end method
