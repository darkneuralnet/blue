.class public final Lcom/stripe/android/core/networking/RequestExecutorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aA\u0010\u0000\u001a\u0002H\u0001\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\nH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "executeRequestWithModelJsonParser",
        "Response",
        "Lcom/stripe/android/core/model/StripeModel;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "stripeErrorJsonParser",
        "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "responseJsonParser",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "stripe-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final executeRequestWithModelJsonParser(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "+TResponse;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TResponse;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;

    iget v1, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;

    invoke-direct {v0, p4}, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$2:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    iget-object p0, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$1:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/core/networking/StripeRequest;

    iget-object p0, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$0:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iput-object p1, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/core/networking/RequestExecutorKt$executeRequestWithModelJsonParser$1;->label:I

    invoke-interface {p0, p2, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    if-nez p4, :cond_7

    check-cast p0, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lcom/stripe/android/core/exception/APIException;

    invoke-static {p0}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/StripeError;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/RequestId;->getValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    move-object v2, p1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p2

    :cond_5
    invoke-static {p0}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    if-eqz p1, :cond_6

    return-object p1

    :cond_6
    new-instance p1, Lcom/stripe/android/core/exception/APIException;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " returns null for "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x17

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_7
    new-instance p0, Lcom/stripe/android/core/exception/APIConnectionException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to execute "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p4}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method
