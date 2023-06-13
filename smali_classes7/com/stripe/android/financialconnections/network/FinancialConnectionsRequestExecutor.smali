.class public final Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J/\u0010\r\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "",
        "response",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "handleApiError",
        "Response",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "request",
        "LKj2;",
        "responseSerializer",
        "execute",
        "(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "Lbi2;",
        "json",
        "Lbi2;",
        "<init>",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lbi2;)V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final json:Lbi2;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lbi2;)V
    .locals 1

    const-string v0, "stripeNetworkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->json:Lbi2;

    return-void
.end method

.method private final handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Exception;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/RequestId;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    new-instance v0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;-><init>()V

    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/StripeError;

    move-result-object v2

    const/16 p1, 0xca

    if-eq v4, p1, :cond_4

    const/16 p1, 0x1ad

    if-eq v4, p1, :cond_3

    const/16 p1, 0x190

    if-eq v4, p1, :cond_4

    const/16 p1, 0x191

    if-eq v4, p1, :cond_2

    const/16 p1, 0x193

    if-eq v4, p1, :cond_1

    const/16 p1, 0x194

    if-eq v4, p1, :cond_4

    new-instance p1, Lcom/stripe/android/core/exception/APIException;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/stripe/android/core/exception/RateLimitException;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    throw p1
.end method


# virtual methods
.method public final execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "LKj2<",
            "TResponse;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TResponse;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, LKj2;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$execute$1;->label:I

    invoke-interface {p3, p1, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p3

    move-object v0, p0

    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :goto_3
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result p1

    const/16 v1, 0xca

    if-eq p1, v1, :cond_6

    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->json:Lbi2;

    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->getBody()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lbi2;->b(LE01;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-direct {v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;

    move-result-object p1

    throw p1

    :cond_6
    invoke-direct {v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;

    move-result-object p1

    throw p1

    :cond_7
    new-instance p2, Lcom/stripe/android/core/exception/APIConnectionException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to execute "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v1}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
