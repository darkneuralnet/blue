.class final Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->create(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$2"
    f = "DefaultAuthenticationRequestParametersFactory.kt"
    i = {}
    l = {
        0x88
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $directoryServerId:Ljava/lang/String;

.field final synthetic $directoryServerPublicKey:Ljava/security/PublicKey;

.field final synthetic $keyId:Ljava/lang/String;

.field final synthetic $sdkPublicKey:Ljava/security/PublicKey;

.field final synthetic $sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;",
            "Ljava/security/PublicKey;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/security/PublicKey;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkPublicKey:Ljava/security/PublicKey;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$keyId:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerId:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerPublicKey:Ljava/security/PublicKey;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkPublicKey:Ljava/security/PublicKey;

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$keyId:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerId:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerPublicKey:Ljava/security/PublicKey;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$0:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v0

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$0:Ljava/lang/Object;

    check-cast p1, LZC0;

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerPublicKey:Ljava/security/PublicKey;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerId:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$keyId:Ljava/lang/String;

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->access$getJweEncrypter$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/security/JweEncrypter;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->getDeviceDataJson$3ds2sdk_release()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v5, p1, v1, v3, v4}, Lcom/stripe/android/stripe3ds2/security/JweEncrypter;->encrypt(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerId:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$keyId:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->access$getErrorReporter$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    move-result-object v1

    new-instance v7, Ljava/lang/RuntimeException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n                    keyId="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n                    sdkTransactionId="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n                    "

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v1, v7}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    :cond_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    invoke-static {v3}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->access$getAppInfoRepository$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

    move-result-object v3

    iput-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->label:I

    invoke-interface {v3, p0}, Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move-object v10, v2

    move-object v2, p1

    move-object p1, v10

    :goto_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/AppInfo;->getSdkAppId()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->access$getSdkReferenceNumber$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Ljava/lang/String;

    move-result-object v4

    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$sdkPublicKey:Ljava/security/PublicKey;

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$keyId:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    iget-object v7, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->$directoryServerId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->getKeyUse$3ds2sdk_release(Ljava/lang/String;)LRk2;

    move-result-object v6

    invoke-virtual {p1, v0, v5, v6}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;->createPublicJwk$3ds2sdk_release(Ljava/security/PublicKey;Ljava/lang/String;LRk2;)Lfh2;

    move-result-object p1

    invoke-virtual {p1}, Lfh2;->n()Ljava/lang/String;

    move-result-object v5

    const-string p1, "createPublicJwk(\n       \u2026         ).toJSONString()"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->access$getMessageVersionRegistry$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;->getCurrent()Ljava/lang/String;

    move-result-object v6

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {p1, v1}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
