.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u0000 62\u00020\u0001:\u00016B\'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u00084\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010)\u001a\u00020(8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "",
        "source",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "accounts",
        "",
        "updateCachedAccounts",
        "clientSecret",
        "sessionId",
        "getOrFetchAccounts",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
        "paymentAccount",
        "consumerSessionClientSecret",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "postLinkAccountSessionPaymentAccount",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "selectAccounts",
        "",
        "updateLocalCache",
        "postAuthorizationSessionSelectedAccounts",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "getRequestExecutor",
        "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "getApiRequestFactory",
        "()Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getApiOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "LSX2;",
        "mutex",
        "LSX2;",
        "getMutex",
        "()LSX2;",
        "cachedAccounts",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsAccountsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n107#2,10:165\n1559#3:175\n1590#3,4:176\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n*L\n77#1:165,10\n133#1:175\n133#1:176,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

.field public static final PARAM_SELECTED_ACCOUNTS:Ljava/lang/String; = "selected_accounts"

.field private static final accountsSessionUrl:Ljava/lang/String;

.field private static final attachPaymentAccountUrl:Ljava/lang/String;

.field private static final authorizationSessionSelectedAccountsUrl:Ljava/lang/String;


# instance fields
.field private final apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private cachedAccounts:Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:LSX2;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

    sget-object v0, Lcom/stripe/android/core/networking/ApiRequest;->Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/connections/auth_sessions/accounts"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->accountsSessionUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/link_account_sessions/attach_payment_account"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->attachPaymentAccountUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/v1/connections/auth_sessions/selected_accounts"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->authorizationSessionSelectedAccountsUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p1, p2}, LUX2;->b(ZILjava/lang/Object;)LSX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->mutex:LSX2;

    return-void
.end method

.method public static final synthetic access$getAccountsSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->accountsSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getAttachPaymentAccountUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->attachPaymentAccountUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getAuthorizationSessionSelectedAccountsUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->authorizationSessionSelectedAccountsUrl:Ljava/lang/String;

    return-object v0
.end method

.method private final updateCachedAccounts(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updating local partner accounts from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->cachedAccounts:Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    return-void
.end method


# virtual methods
.method public final getApiOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object v0
.end method

.method public final getApiRequestFactory()Lcom/stripe/android/core/networking/ApiRequest$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-object v0
.end method

.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final getMutex()LSX2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->mutex:LSX2;

    return-object v0
.end method

.method public getOrFetchAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, LSX2;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$3:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->mutex:LSX2;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->label:I

    invoke-interface {p3, v5, v0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    move-object v2, p1

    move-object p1, p3

    :goto_1
    :try_start_1
    iget-object p3, v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->cachedAccounts:Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    if-nez p3, :cond_6

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1;->label:I

    invoke-virtual {v4, v2, p2, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->postAuthorizationSessionAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    return-object p3

    :goto_3
    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    throw p2
.end method

.method public final getRequestExecutor()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    return-object v0
.end method

.method public postAuthorizationSessionAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v5, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->accountsSessionUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p3, 0x2

    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p3, v2

    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p3, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;->serializer()LKj2;

    move-result-object p3

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    const-string v0, "getOrFetchAccounts"

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;)V

    return-object p3
.end method

.method public postAuthorizationSessionSelectedAccounts(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    invoke-direct {v2, p0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->Z$0:Z

    iget-object v2, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v6, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v7, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->authorizationSessionSelectedAccountsUrl:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    const-string v4, "id"

    move-object/from16 v9, p2

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x0

    aput-object v4, v1, v9

    const-string v4, "client_secret"

    move-object/from16 v10, p1

    invoke-static {v4, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v5

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v4, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v9, 0x1

    if-gez v9, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v11, Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "selected_accounts["

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "]"

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v12

    goto :goto_1

    :cond_4
    invoke-static {v1, v10}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    invoke-static/range {v6 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v1

    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v6, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;->serializer()LKj2;

    move-result-object v6

    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->L$0:Ljava/lang/Object;

    move/from16 v7, p4

    iput-boolean v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->Z$0:Z

    iput v5, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    invoke-virtual {v4, v1, v6, v2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    move-object v2, v0

    move v3, v7

    :goto_2
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    if-eqz v3, :cond_6

    const-string v3, "postAuthorizationSessionSelectedAccounts"

    invoke-direct {v2, v3, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;)V

    :cond_6
    return-object v1
.end method

.method public postLinkAccountSessionPaymentAccount(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->attachPaymentAccountUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p3, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->Companion:Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;->serializer()LKj2;

    move-result-object p3

    invoke-virtual {p2, p1, p3, p4}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
