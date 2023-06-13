.class final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->confirmStripeIntent$payments_core_release(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;)V
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
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
    c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1"
    f = "PaymentLauncherViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x71,
        0x7b
    }
    m = "invokeSuspend"
    n = {
        "returnUrl"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncherViewModel.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;",
            "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    iput-object p2, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    iput-object p3, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    iget-object v3, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->L$0:Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->L$0:Ljava/lang/Object;

    check-cast p1, LZC0;

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$getSavedStateHandle$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)Landroidx/lifecycle/p;

    move-result-object p1

    const-string v1, "key_has_started"

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1, v1, v5}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    invoke-interface {v1}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$logReturnUrl(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$isInstantApp$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    invoke-interface {p1}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object p1

    :cond_3
    :goto_0
    move-object v1, p1

    goto :goto_4

    :cond_4
    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    invoke-interface {p1}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    move v1, v4

    :goto_2
    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v2

    :goto_3
    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$getDefaultReturnUrl$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)Lcom/stripe/android/payments/DefaultReturnUrl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/DefaultReturnUrl;->getValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_4
    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$confirmStripeIntentParams:Lcom/stripe/android/model/ConfirmStripeIntentParams;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iput-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->label:I

    invoke-static {p1, v5, v1, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$confirmIntent(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_5
    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :goto_6
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    iget-object v4, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_b

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object v6

    if-eqz v6, :cond_a

    instance-of v6, v6, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;

    if-eqz v6, :cond_a

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-static {v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$getThreeDs1IntentReturnUrlMap$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)Ljava/util/Map;

    move-result-object v7

    if-nez v1, :cond_9

    const-string v1, ""

    :cond_9
    invoke-interface {v7, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-static {v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$getAuthenticatorRegistry$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;->getAuthenticator(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object v1

    invoke-static {v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->access$getApiRequestOptionsProvider$p(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)LY94;

    move-result-object v4

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    const-string v6, "apiRequestOptionsProvider.get()"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iput-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$confirmStripeIntent$1;->label:I

    invoke-virtual {v1, v5, p1, v4, p0}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->authenticate(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    return-object v0

    :cond_b
    invoke-virtual {v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->getPaymentLauncherResult$payments_core_release()LuX2;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-direct {v0, v6}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    :cond_c
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
