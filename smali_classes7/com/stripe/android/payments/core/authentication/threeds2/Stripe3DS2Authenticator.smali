.class public final Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;
.super Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
        "Lcom/stripe/android/model/StripeIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BE\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u000e\u0008\u0001\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b\u0012\u000e\u0008\u0001\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001e\u00a2\u0006\u0004\u0008/\u00100J\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0008\u0010\n\u001a\u00020\u0008H\u0016J+\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R0\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008#\u0010$\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lu5;",
        "activityResultCaller",
        "Lt5;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "activityResultCallback",
        "",
        "onNewActivityResultCaller",
        "onLauncherInvalidated",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "host",
        "authenticatable",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "requestOptions",
        "performAuthentication",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/PaymentAuthConfig;",
        "config",
        "Lcom/stripe/android/PaymentAuthConfig;",
        "",
        "enableLogging",
        "Z",
        "",
        "injectorKey",
        "Ljava/lang/String;",
        "Lkotlin/Function0;",
        "publishableKeyProvider",
        "Lkotlin/jvm/functions/Function0;",
        "",
        "productUsage",
        "Ljava/util/Set;",
        "LB5;",
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;",
        "stripe3ds2CompletionLauncher",
        "LB5;",
        "getStripe3ds2CompletionLauncher$payments_core_release",
        "()LB5;",
        "setStripe3ds2CompletionLauncher$payments_core_release",
        "(LB5;)V",
        "getStripe3ds2CompletionLauncher$payments_core_release$annotations",
        "()V",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;",
        "stripe3ds2CompletionStarterFactory",
        "Lkotlin/jvm/functions/Function1;",
        "<init>",
        "(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final config:Lcom/stripe/android/PaymentAuthConfig;

.field private final enableLogging:Z

.field private final injectorKey:Ljava/lang/String;

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripe3ds2CompletionLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final stripe3ds2CompletionStarterFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/PaymentAuthConfig;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injectorKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->config:Lcom/stripe/android/PaymentAuthConfig;

    iput-boolean p2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->enableLogging:Z

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->injectorKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->productUsage:Ljava/util/Set;

    new-instance p1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1;-><init>(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;)V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionStarterFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic getStripe3ds2CompletionLauncher$payments_core_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getStripe3ds2CompletionLauncher$payments_core_release()LB5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5<",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionLauncher:LB5;

    return-object v0
.end method

.method public onLauncherInvalidated()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionLauncher:LB5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB5;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionLauncher:LB5;

    return-void
.end method

.method public onNewActivityResultCaller(Lu5;Lt5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu5;",
            "Lt5<",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionLauncher:LB5;

    return-void
.end method

.method public performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionStarterFactory:Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;

    new-instance v13, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;

    sget-object v3, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;->Companion:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId$Companion;->create()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->config:Lcom/stripe/android/PaymentAuthConfig;

    invoke-virtual {v4}, Lcom/stripe/android/PaymentAuthConfig;->getStripe3ds2Config$payments_core_release()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    iget-boolean v8, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->enableLogging:Z

    invoke-virtual {p1}, Lcom/stripe/android/view/AuthActivityStarterHost;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v9

    iget-object v10, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->injectorKey:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->productUsage:Ljava/util/Set;

    move-object v2, v13

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    invoke-interface {v1, v13}, Lcom/stripe/android/view/AuthActivityStarter;->start(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public bridge synthetic performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setStripe3ds2CompletionLauncher$payments_core_release(LB5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;->stripe3ds2CompletionLauncher:LB5;

    return-void
.end method
