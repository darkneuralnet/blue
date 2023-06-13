.class final Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->authenticate(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "Authenticatable",
        "LZC0;",
        "",
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
    c = "com.stripe.android.payments.core.authentication.PaymentAuthenticator$authenticate$2"
    f = "PaymentAuthenticator.kt"
    i = {}
    l = {
        0x23
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $authenticatable:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TAuthenticatable;"
        }
    .end annotation
.end field

.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field final synthetic $lifecycleOwner:LLifecycleOwner;

.field final synthetic $requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "TAuthenticatable;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LLifecycleOwner;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "TAuthenticatable;>;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "TAuthenticatable;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$lifecycleOwner:LLifecycleOwner;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->this$0:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$authenticatable:Ljava/lang/Object;

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance p1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$lifecycleOwner:LLifecycleOwner;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->this$0:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$authenticatable:Ljava/lang/Object;

    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;-><init>(LLifecycleOwner;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$lifecycleOwner:LLifecycleOwner;

    new-instance v1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2$1;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->this$0:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v6, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$authenticatable:Ljava/lang/Object;

    iget-object v7, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2$1;-><init>(Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    iput v2, p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator$authenticate$2;->label:I

    invoke-static {p1, v1, p0}, Landroidx/lifecycle/m;->b(LLifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
