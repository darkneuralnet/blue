.class public final Lcom/stripe/android/CustomerSession$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/CustomerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0007J\r\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0008\u0013J\u0008\u0010\u0014\u001a\u00020\u0015H\u0002J\u0008\u0010\u0016\u001a\u00020\u0011H\u0007J\u0008\u0010\u0017\u001a\u00020\u000bH\u0007J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/CustomerSession$Companion;",
        "",
        "()V",
        "CUSTOMER_CACHE_DURATION_MILLISECONDS",
        "",
        "KEEP_ALIVE_TIME",
        "",
        "KEEP_ALIVE_TIME_UNIT",
        "Ljava/util/concurrent/TimeUnit;",
        "THREAD_POOL_SIZE",
        "instance",
        "Lcom/stripe/android/CustomerSession;",
        "getInstance$payments_core_release",
        "()Lcom/stripe/android/CustomerSession;",
        "setInstance$payments_core_release",
        "(Lcom/stripe/android/CustomerSession;)V",
        "cancelCallbacks",
        "",
        "clearInstance",
        "clearInstance$payments_core_release",
        "createCoroutineDispatcher",
        "Lkotlin/coroutines/CoroutineContext;",
        "endCustomerSession",
        "getInstance",
        "initCustomerSession",
        "context",
        "Landroid/content/Context;",
        "ephemeralKeyProvider",
        "Lcom/stripe/android/EphemeralKeyProvider;",
        "shouldPrefetchEphemeralKey",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/CustomerSession$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$createCoroutineDispatcher(Lcom/stripe/android/CustomerSession$Companion;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/CustomerSession$Companion;->createCoroutineDispatcher()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method private final createCoroutineDispatcher()Lkotlin/coroutines/CoroutineContext;
    .locals 8

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x3

    const/4 v2, 0x3

    const-wide/16 v3, 0x2

    invoke-static {}, Lcom/stripe/android/CustomerSession;->access$getKEEP_ALIVE_TIME_UNIT$cp()Ljava/util/concurrent/TimeUnit;

    move-result-object v5

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    invoke-static {v7}, LKh1;->b(Ljava/util/concurrent/ExecutorService;)LEh1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic initCustomerSession$default(Lcom/stripe/android/CustomerSession$Companion;Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/CustomerSession$Companion;->initCustomerSession(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;Z)V

    return-void
.end method


# virtual methods
.method public final cancelCallbacks()V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession$Companion;->getInstance$payments_core_release()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/CustomerSession;->cancel$payments_core_release()V

    :cond_0
    return-void
.end method

.method public final synthetic clearInstance$payments_core_release()V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession$Companion;->cancelCallbacks()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/CustomerSession$Companion;->setInstance$payments_core_release(Lcom/stripe/android/CustomerSession;)V

    return-void
.end method

.method public final endCustomerSession()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession$Companion;->clearInstance$payments_core_release()V

    return-void
.end method

.method public final getInstance()Lcom/stripe/android/CustomerSession;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/CustomerSession$Companion;->getInstance$payments_core_release()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to get instance of CustomerSession without initialization."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getInstance$payments_core_release()Lcom/stripe/android/CustomerSession;
    .locals 1

    invoke-static {}, Lcom/stripe/android/CustomerSession;->access$getInstance$cp()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    return-object v0
.end method

.method public final initCustomerSession(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ephemeralKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/CustomerSession$Companion;->initCustomerSession$default(Lcom/stripe/android/CustomerSession$Companion;Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;ZILjava/lang/Object;)V

    return-void
.end method

.method public final initCustomerSession(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;Z)V
    .locals 23
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    const-string v2, "context"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ephemeralKeyProvider"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Lcom/stripe/android/StripeOperationIdFactory;

    invoke-direct {v14}, Lcom/stripe/android/StripeOperationIdFactory;-><init>()V

    sget-object v13, Lcom/stripe/android/CustomerSession$Companion$initCustomerSession$timeSupplier$1;->INSTANCE:Lcom/stripe/android/CustomerSession$Companion$initCustomerSession$timeSupplier$1;

    new-instance v12, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;

    move/from16 v2, p3

    invoke-direct {v12, v0, v2, v14, v13}, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;-><init>(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V

    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, v15}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v11

    new-instance v10, Lcom/stripe/android/CustomerSession;

    new-instance v18, Lcom/stripe/android/networking/StripeApiRepository;

    move-object/from16 v0, v18

    new-instance v3, Lcom/stripe/android/CustomerSession$Companion$initCustomerSession$1;

    move-object v2, v3

    invoke-direct {v3, v11}, Lcom/stripe/android/CustomerSession$Companion$initCustomerSession$1;-><init>(Lcom/stripe/android/PaymentConfiguration;)V

    sget-object v3, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 p2, v10

    move-object/from16 v10, v16

    move-object/from16 v19, v11

    move-object/from16 v11, v16

    move-object/from16 v20, v12

    move-object/from16 v12, v16

    move-object/from16 v21, v13

    move-object/from16 v13, v16

    move-object/from16 v22, v14

    move-object/from16 v14, v16

    move-object/from16 v15, v16

    const/16 v16, 0x7ff8

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v4

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/CustomerSession$Companion;->createCoroutineDispatcher()Lkotlin/coroutines/CoroutineContext;

    move-result-object v5

    move-object/from16 v0, p2

    move-object/from16 v2, v18

    move-object/from16 v6, v22

    move-object/from16 v7, v21

    move-object/from16 v8, v20

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/CustomerSession;-><init>(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/EphemeralKeyManager$Factory;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/stripe/android/CustomerSession$Companion;->setInstance$payments_core_release(Lcom/stripe/android/CustomerSession;)V

    return-void
.end method

.method public final setInstance$payments_core_release(Lcom/stripe/android/CustomerSession;)V
    .locals 0

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$setInstance$cp(Lcom/stripe/android/CustomerSession;)V

    return-void
.end method
