.class final Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/DefaultFraudDetectionDataRepository;->getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/networking/FraudDetectionData;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Lcom/stripe/android/networking/FraudDetectionData;",
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
    c = "com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2"
    f = "FraudDetectionDataRepository.kt"
    i = {
        0x0
    }
    l = {
        0x46,
        0x4c
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFraudDetectionDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRepository.kt\ncom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/DefaultFraudDetectionDataRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;

    iget-object v1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;-><init>(Lcom/stripe/android/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/networking/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast v1, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    check-cast p1, LZC0;

    iget-object v1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    invoke-static {v1}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->access$getLocalStore$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/FraudDetectionDataStore;

    move-result-object v1

    iput-object p1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    invoke-interface {v1, p0}, Lcom/stripe/android/FraudDetectionDataStore;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    check-cast p1, Lcom/stripe/android/networking/FraudDetectionData;

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->access$getTimestampSupplier$p()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lcom/stripe/android/networking/FraudDetectionData;->isExpired(J)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_4
    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->access$getStripeNetworkClient$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-result-object v4

    invoke-static {v1}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->access$getFraudDetectionDataRequestFactory$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;->create(Lcom/stripe/android/networking/FraudDetectionData;)Lcom/stripe/android/networking/FraudDetectionDataRequest;

    move-result-object p1

    iput-object v2, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->label:I

    invoke-interface {v4, p1, p0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-static {p1}, Lcom/stripe/android/FraudDetectionDataRepositoryKt;->access$fraudDetectionData(Lcom/stripe/android/core/networking/StripeResponse;)Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, p1

    :goto_4
    move-object p1, v2

    check-cast p1, Lcom/stripe/android/networking/FraudDetectionData;

    :cond_7
    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    invoke-static {v0}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->access$getCachedFraudDetectionData$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/networking/FraudDetectionData;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;->this$0:Lcom/stripe/android/DefaultFraudDetectionDataRepository;

    invoke-virtual {v0, p1}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->save(Lcom/stripe/android/networking/FraudDetectionData;)V

    :cond_8
    return-object p1
.end method
