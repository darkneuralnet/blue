.class public final Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJN\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        "",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "(Lcom/stripe/android/networking/StripeRepository;)V",
        "forPaymentIntent",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/FinancialConnectionsSession;",
        "publishableKey",
        "",
        "clientSecret",
        "customerName",
        "customerEmail",
        "stripeAccountId",
        "forPaymentIntent-hUnOzRk",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forSetupIntent",
        "forSetupIntent-hUnOzRk",
        "payments-core_release"
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
        "SMAP\nCreateFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateFinancialConnectionsSession.kt\ncom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"
    }
.end annotation


# instance fields
.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-void
.end method


# virtual methods
.method public final forPaymentIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p6

    instance-of v3, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    iget v4, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    :try_start_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v2, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    new-instance v5, Lcom/stripe/android/model/PaymentIntent$ClientSecret;

    invoke-direct {v5, v0}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->getPaymentIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    invoke-direct {v7, v0, v8, v9}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v0

    move-object v9, p1

    move-object/from16 v10, p5

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v6, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forPaymentIntent$1;->label:I

    invoke-virtual {v2, v5, v7, v0, v3}, Lcom/stripe/android/networking/StripeRepository;->createPaymentIntentFinancialConnectionsSession$payments_core_release(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    check-cast v2, Lcom/stripe/android/model/FinancialConnectionsSession;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_2
    check-cast v0, Lcom/stripe/android/model/FinancialConnectionsSession;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/InternalError;

    const-string v2, "Error creating session for PaymentIntent"

    invoke-direct {v0, v2}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_5
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method public final forSetupIntent-hUnOzRk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p6

    instance-of v3, v2, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    iget v4, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    :try_start_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v2, v1, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    new-instance v5, Lcom/stripe/android/model/SetupIntent$ClientSecret;

    invoke-direct {v5, v0}, Lcom/stripe/android/model/SetupIntent$ClientSecret;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/stripe/android/model/SetupIntent$ClientSecret;->getSetupIntentId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    invoke-direct {v7, v0, v8, v9}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v0

    move-object v9, p1

    move-object/from16 v10, p5

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v6, v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession$forSetupIntent$1;->label:I

    invoke-virtual {v2, v5, v7, v0, v3}, Lcom/stripe/android/networking/StripeRepository;->createSetupIntentFinancialConnectionsSession$payments_core_release(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    check-cast v2, Lcom/stripe/android/model/FinancialConnectionsSession;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_2
    check-cast v0, Lcom/stripe/android/model/FinancialConnectionsSession;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/InternalError;

    const-string v2, "Error creating session for SetupIntent"

    invoke-direct {v0, v2}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :cond_5
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    return-object v0
.end method
