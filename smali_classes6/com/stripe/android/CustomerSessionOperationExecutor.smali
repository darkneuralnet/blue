.class public final Lcom/stripe/android/CustomerSessionOperationExecutor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0008\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\n\u0008\u0000\u0010\u0017*\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001cH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\r2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u0004\u0018\u00010\u000c2\u0006\u0010#\u001a\u00020\u00112\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00050%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/CustomerSessionOperationExecutor;",
        "",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "publishableKey",
        "",
        "stripeAccountId",
        "listeners",
        "",
        "Lcom/stripe/android/CustomerSession$RetrievalListener;",
        "onCustomerUpdated",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/Customer;",
        "",
        "(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V",
        "execute",
        "ephemeralKey",
        "Lcom/stripe/android/EphemeralKey;",
        "operation",
        "Lcom/stripe/android/EphemeralOperation;",
        "execute$payments_core_release",
        "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getListener",
        "L",
        "operationId",
        "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;",
        "onCustomerRetrieved",
        "result",
        "Lkotlin/Result;",
        "(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V",
        "onError",
        "listener",
        "error",
        "",
        "retrieveCustomerWithKey",
        "key",
        "productUsage",
        "",
        "(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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


# static fields
.field private static final Companion:Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;

.field private static final REQUIRED_ERROR:Ljava/lang/String; = "API request returned an invalid response."
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final listeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/CustomerSession$RetrievalListener;",
            ">;"
        }
    .end annotation
.end field

.field private final onCustomerUpdated:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/Customer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/CustomerSessionOperationExecutor;->Companion:Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/CustomerSession$RetrievalListener;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listeners"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCustomerUpdated"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p2, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->listeners:Ljava/util/Map;

    iput-object p5, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->onCustomerUpdated:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final synthetic access$getListener(Lcom/stripe/android/CustomerSessionOperationExecutor;Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/CustomerSessionOperationExecutor;->getListener(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onCustomerRetrieved(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/CustomerSessionOperationExecutor;->onCustomerRetrieved(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/CustomerSession$RetrievalListener;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/CustomerSessionOperationExecutor;->onError(Lcom/stripe/android/CustomerSession$RetrievalListener;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$retrieveCustomerWithKey(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/CustomerSessionOperationExecutor;->retrieveCustomerWithKey(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getListener(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L::Lcom/stripe/android/CustomerSession$RetrievalListener;",
            ">(",
            "Ljava/lang/String;",
            ")T",
            "L;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->listeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/CustomerSession$RetrievalListener;

    return-object p1
.end method

.method private final onCustomerRetrieved(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralOperation;->getId$payments_core_release()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/CustomerSessionOperationExecutor;->getListener(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    check-cast p2, Lcom/stripe/android/model/Customer;

    iget-object v0, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->onCustomerUpdated:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;->onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/CustomerSessionOperationExecutor;->onError(Lcom/stripe/android/CustomerSession$RetrievalListener;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final onError(Lcom/stripe/android/CustomerSession$RetrievalListener;Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p2, Lcom/stripe/android/core/exception/StripeException;

    const-string v1, ""

    if-eqz v0, :cond_1

    if-eqz p1, :cond_3

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/StripeException;->getStatusCode()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    check-cast p2, Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/stripe/android/CustomerSession$RetrievalListener;->onError(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, p2

    :goto_1
    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v1, p2}, Lcom/stripe/android/CustomerSession$RetrievalListener;->onError(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)V

    :cond_3
    :goto_2
    return-void
.end method

.method private final retrieveCustomerWithKey(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/EphemeralKey;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/StripeException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1, p2, v8, p3}, Lcom/stripe/android/networking/StripeRepository;->retrieveCustomer(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final synthetic execute$payments_core_release(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p3

    instance-of v3, v0, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;

    iget v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    iget v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    const-string v13, "API request returned an invalid response."

    const/4 v14, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_20

    :pswitch_1
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1d

    :catchall_0
    move-exception v0

    goto/16 :goto_1e

    :pswitch_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1c

    :pswitch_3
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_19

    :catchall_1
    move-exception v0

    goto/16 :goto_1a

    :pswitch_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_5
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_15

    :catchall_2
    move-exception v0

    goto/16 :goto_16

    :pswitch_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_14

    :pswitch_7
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto/16 :goto_11

    :catchall_3
    move-exception v0

    goto/16 :goto_12

    :pswitch_8
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_9
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto/16 :goto_d

    :catchall_4
    move-exception v0

    goto/16 :goto_e

    :pswitch_a
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_b
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_5
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto/16 :goto_9

    :catchall_5
    move-exception v0

    goto/16 :goto_a

    :pswitch_c
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_d
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_6
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto/16 :goto_5

    :catchall_6
    move-exception v0

    goto/16 :goto_6

    :pswitch_e
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_f
    iget-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/EphemeralOperation;

    iget-object v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/CustomerSessionOperationExecutor;

    :try_start_7
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_1

    :catchall_7
    move-exception v0

    goto :goto_2

    :pswitch_10
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$RetrieveKey;

    if-eqz v0, :cond_4

    :try_start_8
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v0

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object/from16 v4, p1

    invoke-direct {v1, v4, v0, v3}, Lcom/stripe/android/CustomerSessionOperationExecutor;->retrieveCustomerWithKey(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-ne v0, v12, :cond_1

    return-object v12

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v0, :cond_2

    :try_start_9
    check-cast v0, Lcom/stripe/android/model/Customer;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    :catchall_8
    move-exception v0

    move-object v4, v1

    :goto_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$2;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$2;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_3

    return-object v12

    :cond_3
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_4
    move-object/from16 v4, p1

    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$AddSource;

    if-eqz v0, :cond_8

    :try_start_a
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/EphemeralOperation$Customer$AddSource;

    invoke-virtual {v8}, Lcom/stripe/android/EphemeralOperation$Customer$AddSource;->getSourceId()Ljava/lang/String;

    move-result-object v8

    move-object v9, v2

    check-cast v9, Lcom/stripe/android/EphemeralOperation$Customer$AddSource;

    invoke-virtual {v9}, Lcom/stripe/android/EphemeralOperation$Customer$AddSource;->getSourceType()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v10

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v11, v3

    invoke-virtual/range {v4 .. v11}, Lcom/stripe/android/networking/StripeRepository;->addCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    if-ne v0, v12, :cond_5

    return-object v12

    :cond_5
    move-object v4, v1

    :goto_5
    if-eqz v0, :cond_6

    :try_start_b
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_7

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_9
    move-exception v0

    move-object v4, v1

    :goto_6
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$3;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$3;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_7

    return-object v12

    :cond_7
    :goto_8
    return-object v0

    :cond_8
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;

    if-eqz v0, :cond_c

    :try_start_c
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;

    invoke-virtual {v8}, Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;->getSourceId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v9

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v10, v3

    invoke-virtual/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository;->deleteCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    if-ne v0, v12, :cond_9

    return-object v12

    :cond_9
    move-object v4, v1

    :goto_9
    if-eqz v0, :cond_a

    :try_start_d
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_b

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_a
    move-exception v0

    move-object v4, v1

    :goto_a
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_b
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$4;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$4;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_b

    return-object v12

    :cond_b
    :goto_c
    return-object v0

    :cond_c
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;

    if-eqz v0, :cond_10

    :try_start_e
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;

    invoke-virtual {v8}, Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v9

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v10, v3

    invoke-virtual/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository;->attachPaymentMethod(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    if-ne v0, v12, :cond_d

    return-object v12

    :cond_d
    move-object v4, v1

    :goto_d
    if-eqz v0, :cond_e

    :try_start_f
    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_f

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :catchall_b
    move-exception v0

    move-object v4, v1

    :goto_e
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_f
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$5;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$5;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v0, 0x8

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_f

    return-object v12

    :cond_f
    :goto_10
    return-object v0

    :cond_10
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;

    if-eqz v0, :cond_14

    :try_start_10
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iget-object v5, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;

    invoke-virtual {v7}, Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v8

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v4, 0x9

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v9, v3

    invoke-virtual/range {v4 .. v9}, Lcom/stripe/android/networking/StripeRepository;->detachPaymentMethod(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    if-ne v0, v12, :cond_11

    return-object v12

    :cond_11
    move-object v4, v1

    :goto_11
    if-eqz v0, :cond_12

    :try_start_11
    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_13

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :catchall_c
    move-exception v0

    move-object v4, v1

    :goto_12
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_13
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$6;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$6;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v0, 0xa

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_13

    return-object v12

    :cond_13
    :goto_14
    return-object v0

    :cond_14
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;

    if-eqz v0, :cond_17

    :try_start_12
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    new-instance v11, Lcom/stripe/android/model/ListPaymentMethodsParams;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v6

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;

    invoke-virtual {v5}, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;->getType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v7

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;

    invoke-virtual {v5}, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;->getLimit$payments_core_release()Ljava/lang/Integer;

    move-result-object v8

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;

    invoke-virtual {v5}, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;->getEndingBefore$payments_core_release()Ljava/lang/String;

    move-result-object v9

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;

    invoke-virtual {v5}, Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;->getStartingAfter$payments_core_release()Ljava/lang/String;

    move-result-object v10

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/model/ListPaymentMethodsParams;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    new-instance v8, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v8

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v4, 0xb

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v5, v11

    move-object v9, v3

    invoke-virtual/range {v4 .. v9}, Lcom/stripe/android/networking/StripeRepository;->getPaymentMethods(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    if-ne v0, v12, :cond_15

    return-object v12

    :cond_15
    move-object v4, v1

    :goto_15
    :try_start_13
    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    goto :goto_17

    :catchall_d
    move-exception v0

    move-object v4, v1

    :goto_16
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_17
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$7;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$7;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v0, 0xc

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_16

    return-object v12

    :cond_16
    :goto_18
    return-object v0

    :cond_17
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;

    if-eqz v0, :cond_1b

    :try_start_14
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;

    invoke-virtual {v8}, Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;->getSourceId()Ljava/lang/String;

    move-result-object v8

    move-object v9, v2

    check-cast v9, Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;

    invoke-virtual {v9}, Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;->getSourceType()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v10

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v4, 0xd

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v11, v3

    invoke-virtual/range {v4 .. v11}, Lcom/stripe/android/networking/StripeRepository;->setDefaultCustomerSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    if-ne v0, v12, :cond_18

    return-object v12

    :cond_18
    move-object v4, v1

    :goto_19
    if-eqz v0, :cond_19

    :try_start_15
    check-cast v0, Lcom/stripe/android/model/Customer;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1b

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    :catchall_e
    move-exception v0

    move-object v4, v1

    :goto_1a
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1b
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$8;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$8;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v0, 0xe

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1a

    return-object v12

    :cond_1a
    :goto_1c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_1b
    instance-of v0, v2, Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;

    if-eqz v0, :cond_1f

    :try_start_16
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getObjectId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->publishableKey:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/EphemeralOperation;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v7

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;

    invoke-virtual {v8}, Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;->getShippingInformation()Lcom/stripe/android/model/ShippingInformation;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v16

    iget-object v4, v1, Lcom/stripe/android/CustomerSessionOperationExecutor;->stripeAccountId:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v9

    move-object/from16 v17, v4

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v4, 0xf

    iput v4, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    move-object v4, v0

    move-object v10, v3

    invoke-virtual/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository;->setCustomerShippingInfo$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    if-ne v0, v12, :cond_1c

    return-object v12

    :cond_1c
    move-object v4, v1

    :goto_1d
    if-eqz v0, :cond_1d

    :try_start_17
    check-cast v0, Lcom/stripe/android/model/Customer;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1f

    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    :catchall_f
    move-exception v0

    move-object v4, v1

    :goto_1e
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1f
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$9;

    invoke-direct {v6, v4, v2, v0, v14}, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$9;-><init>(Lcom/stripe/android/CustomerSessionOperationExecutor;Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->L$1:Ljava/lang/Object;

    const/16 v0, 0x10

    iput v0, v3, Lcom/stripe/android/CustomerSessionOperationExecutor$execute$1;->label:I

    invoke-static {v5, v6, v3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1e

    return-object v12

    :cond_1e
    :goto_20
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_1f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
