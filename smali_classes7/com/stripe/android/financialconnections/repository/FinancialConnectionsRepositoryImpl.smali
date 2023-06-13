.class public final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V",
        "getFinancialConnectionsAccounts",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "getFinancialConnectionsAcccountsParams",
        "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;",
        "(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "clientSecret",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSessionOAuthResults",
        "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
        "sessionId",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postCompleteFinancialConnectionsSessions",
        "terminalError",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;

.field private static final authorizationSessionOAuthResultsUrl:Ljava/lang/String;

.field private static final authorizationSessionUrl:Ljava/lang/String;

.field private static final authorizeSessionUrl:Ljava/lang/String;

.field private static final completeUrl:Ljava/lang/String;

.field private static final listAccountsUrl:Ljava/lang/String;

.field private static final sessionReceiptUrl:Ljava/lang/String;


# instance fields
.field private final apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;

    sget-object v0, Lcom/stripe/android/core/networking/ApiRequest;->Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/link_account_sessions/list_accounts"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->listAccountsUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/link_account_sessions/session_receipt"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->sessionReceiptUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/connections/auth_sessions"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizationSessionUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/link_account_sessions/complete"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->completeUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/connections/auth_sessions/oauth_results"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizationSessionOAuthResultsUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/v1/connections/auth_sessions/authorized"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizeSessionUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-void
.end method

.method public static final synthetic access$getAuthorizationSessionOAuthResultsUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizationSessionOAuthResultsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getAuthorizationSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizationSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getAuthorizeSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizeSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getCompleteUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->completeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getListAccountsUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->listAccountsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getSessionReceiptUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->sessionReceiptUrl:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getFinancialConnectionsAccounts(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->listAccountsUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;->toParamMap()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$Companion;->serializer()LKj2;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getFinancialConnectionsSession(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->sessionReceiptUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const-string v3, "client_secret"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;->serializer()LKj2;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public postAuthorizationSessionOAuthResults(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->authorizationSessionOAuthResultsUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "id"

    invoke-static {v4, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v3, p2

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v0, Lcom/stripe/android/financialconnections/model/MixedOAuthParams;->Companion:Lcom/stripe/android/financialconnections/model/MixedOAuthParams$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/MixedOAuthParams$Companion;->serializer()LKj2;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public postCompleteFinancialConnectionsSessions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->completeUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "terminal_error"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v3, p2

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;->serializer()LKj2;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
