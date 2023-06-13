.class public final Lcom/stripe/android/StripePaymentController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/PaymentController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/StripePaymentController$Companion;,
        Lcom/stripe/android/StripePaymentController$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 {2\u00020\u0001:\u0001{Ba\u0012\u0006\u0010w\u001a\u00020v\u0012\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020 0G\u0012\u0006\u0010K\u001a\u00020J\u0012\u0008\u0008\u0002\u0010M\u001a\u00020:\u0012\u0008\u0008\u0002\u0010x\u001a\u00020X\u0012\u0008\u0008\u0002\u0010P\u001a\u00020O\u0012\u0008\u0008\u0002\u0010S\u001a\u00020R\u0012\u0008\u0008\u0002\u0010V\u001a\u00020U\u0012\u0008\u0008\u0002\u0010Y\u001a\u00020X\u00a2\u0006\u0004\u0008y\u0010zJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010\"\u001a\u00020\u00112\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u001e\u0010(\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%H\u0016J\u0008\u0010)\u001a\u00020\u0011H\u0016J+\u0010+\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J+\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/J#\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u0010\u0008J3\u00105\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106J+\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00087\u0010\u0013J\u001a\u0010;\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010<\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010=\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u00109\u001a\u0004\u0018\u000108H\u0016J\u001b\u0010>\u001a\u00020\u00172\u0006\u00109\u001a\u000208H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010?J\u001b\u0010A\u001a\u00020@2\u0006\u00109\u001a\u000208H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008A\u0010?J\u001b\u0010B\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010?J+\u0010E\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010FR\u001a\u0010H\u001a\u0008\u0012\u0004\u0012\u00020 0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010M\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0014\u0010g\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010NR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010h8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010u\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006|"
    }
    d2 = {
        "Lcom/stripe/android/StripePaymentController;",
        "Lcom/stripe/android/PaymentController;",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "confirmStripeIntentParams",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "requestOptions",
        "Lcom/stripe/android/model/PaymentIntent;",
        "confirmPaymentIntent",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "Lcom/stripe/android/model/SetupIntent;",
        "confirmSetupIntent",
        "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "host",
        "Lcom/stripe/android/model/Source;",
        "source",
        "",
        "onSourceRetrieved",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentIntent",
        "Lcom/stripe/android/AlipayAuthenticator;",
        "authenticator",
        "Lcom/stripe/android/PaymentIntentResult;",
        "authenticateAlipay",
        "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "requestCode",
        "",
        "throwable",
        "handleError",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "returnUrl",
        "logReturnUrl",
        "Lu5;",
        "activityResultCaller",
        "Lt5;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "activityResultCallback",
        "registerLaunchersWithActivityResultCaller",
        "unregisterLaunchers",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "startConfirmAndAuth",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmPaymentIntentParams",
        "confirmAndAuthenticateAlipay",
        "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/WeChatPayNextAction;",
        "confirmWeChatPay",
        "clientSecret",
        "Lcom/stripe/android/PaymentController$StripeIntentType;",
        "type",
        "startAuth",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startAuthenticateSource",
        "Landroid/content/Intent;",
        "data",
        "",
        "shouldHandlePaymentResult",
        "shouldHandleSetupResult",
        "shouldHandleSourceResult",
        "getPaymentIntentResult",
        "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/SetupIntentResult;",
        "getSetupIntentResult",
        "getAuthenticateSourceResult",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "handleNextAction",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "publishableKeyProvider",
        "Lkotlin/jvm/functions/Function0;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "enableLogging",
        "Z",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "Lcom/stripe/android/networking/AlipayRepository;",
        "alipayRepository",
        "Lcom/stripe/android/networking/AlipayRepository;",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "failureMessageFactory",
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;",
        "paymentIntentFlowResultProcessor",
        "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;",
        "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;",
        "setupIntentFlowResultProcessor",
        "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;",
        "Lcom/stripe/android/payments/DefaultReturnUrl;",
        "defaultReturnUrl",
        "Lcom/stripe/android/payments/DefaultReturnUrl;",
        "isInstantApp",
        "LB5;",
        "Lcom/stripe/android/PaymentRelayStarter$Args;",
        "paymentRelayLauncher",
        "LB5;",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/PaymentRelayStarter;",
        "paymentRelayStarterFactory",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "threeDs1IntentReturnUrlMap",
        "Ljava/util/Map;",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "authenticatorRegistry",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "Landroid/content/Context;",
        "context",
        "workContext",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripePaymentController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripePaymentController.kt\ncom/stripe/android/StripePaymentController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,593:1\n1#2:594\n*E\n"
    }
.end annotation


# static fields
.field private static final CHALLENGE_DELAY:J

.field public static final Companion:Lcom/stripe/android/StripePaymentController$Companion;

.field private static final EXPAND_PAYMENT_METHOD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final PAYMENT_REQUEST_CODE:I = 0xc350

.field private static final REQUIRED_ERROR:Ljava/lang/String; = "API request returned an invalid response."

.field public static final SETUP_REQUEST_CODE:I = 0xc351

.field public static final SOURCE_REQUEST_CODE:I = 0xc352


# instance fields
.field private final alipayRepository:Lcom/stripe/android/networking/AlipayRepository;

.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

.field private final defaultReturnUrl:Lcom/stripe/android/payments/DefaultReturnUrl;

.field private final enableLogging:Z

.field private final failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

.field private final isInstantApp:Z

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final paymentIntentFlowResultProcessor:Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;

.field private paymentRelayLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentRelayStarterFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
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

.field private final setupIntentFlowResultProcessor:Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final threeDs1IntentReturnUrlMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/StripePaymentController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/StripePaymentController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/StripePaymentController;->Companion:Lcom/stripe/android/StripePaymentController$Companion;

    const-string v0, "payment_method"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/StripePaymentController;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/StripePaymentController;->CHALLENGE_DELAY:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/networking/AlipayRepository;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v10, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v1, p8

    move-object/from16 v13, p9

    const-string v2, "context"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "publishableKeyProvider"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "stripeRepository"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "workContext"

    move-object/from16 v14, p5

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "analyticsRequestExecutor"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentAnalyticsRequestFactory"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "alipayRepository"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "uiContext"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v10, v0, Lcom/stripe/android/StripePaymentController;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object v8, v0, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-boolean v9, v0, Lcom/stripe/android/StripePaymentController;->enableLogging:Z

    iput-object v11, v0, Lcom/stripe/android/StripePaymentController;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object v12, v0, Lcom/stripe/android/StripePaymentController;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object v1, v0, Lcom/stripe/android/StripePaymentController;->alipayRepository:Lcom/stripe/android/networking/AlipayRepository;

    iput-object v13, v0, Lcom/stripe/android/StripePaymentController;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    invoke-direct {v1, v7}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/stripe/android/StripePaymentController;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    new-instance v15, Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;

    sget-object v6, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v6, v9}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v5

    move-object v1, v15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v8, v6

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    iput-object v15, v0, Lcom/stripe/android/StripePaymentController;->paymentIntentFlowResultProcessor:Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;

    new-instance v15, Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;

    invoke-virtual {v8, v9}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v5

    move-object v1, v15

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    iput-object v15, v0, Lcom/stripe/android/StripePaymentController;->setupIntentFlowResultProcessor:Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;

    sget-object v1, Lcom/stripe/android/payments/DefaultReturnUrl;->Companion:Lcom/stripe/android/payments/DefaultReturnUrl$Companion;

    invoke-virtual {v1, v7}, Lcom/stripe/android/payments/DefaultReturnUrl$Companion;->create(Landroid/content/Context;)Lcom/stripe/android/payments/DefaultReturnUrl;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/StripePaymentController;->defaultReturnUrl:Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-static/range {p1 .. p1}, Lg52;->c(Landroid/content/Context;)Z

    move-result v15

    iput-boolean v15, v0, Lcom/stripe/android/StripePaymentController;->isInstantApp:Z

    new-instance v1, Lcom/stripe/android/StripePaymentController$paymentRelayStarterFactory$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/StripePaymentController$paymentRelayStarterFactory$1;-><init>(Lcom/stripe/android/StripePaymentController;)V

    iput-object v1, v0, Lcom/stripe/android/StripePaymentController;->paymentRelayStarterFactory:Lkotlin/jvm/functions/Function1;

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v8, v0, Lcom/stripe/android/StripePaymentController;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    sget-object v1, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->Companion:Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;

    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->getDefaultProductUsageTokens$payments_core_release()Ljava/util/Set;

    move-result-object v16

    move-object/from16 v3, p3

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object v9, v8

    move-object/from16 v8, p9

    move-object/from16 v11, v16

    move v12, v15

    invoke-virtual/range {v1 .. v12}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;->createInstance(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Z)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/StripePaymentController;->authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v6, v1

    goto :goto_0

    :cond_0
    move/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    new-instance v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    sget-object v2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v2, v6}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context.applicationContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LAS5;

    move-object v4, p2

    invoke-direct {v3, p2}, LAS5;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;LY94;)V

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object v4, p2

    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    new-instance v1, Lcom/stripe/android/networking/DefaultAlipayRepository;

    move-object v5, p3

    invoke-direct {v1, p3}, Lcom/stripe/android/networking/DefaultAlipayRepository;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    move-object v10, v1

    goto :goto_4

    :cond_4
    move-object v5, p3

    move-object/from16 v10, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    move-object v11, v0

    goto :goto_5

    :cond_5
    move-object/from16 v11, p9

    :goto_5
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/StripePaymentController;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/StripePaymentController;->_init_$lambda$0(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$authenticateAlipay(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/StripePaymentController;->authenticateAlipay(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$confirmPaymentIntent(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/StripePaymentController;->confirmPaymentIntent(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$confirmSetupIntent(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/StripePaymentController;->confirmSetupIntent(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCHALLENGE_DELAY$cp()J
    .locals 2

    sget-wide v0, Lcom/stripe/android/StripePaymentController;->CHALLENGE_DELAY:J

    return-wide v0
.end method

.method public static final synthetic access$getEXPAND_PAYMENT_METHOD$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/stripe/android/StripePaymentController;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getPaymentRelayLauncher$p(Lcom/stripe/android/StripePaymentController;)LB5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/StripePaymentController;->paymentRelayLauncher:LB5;

    return-object p0
.end method

.method public static final synthetic access$getPaymentRelayStarterFactory$p(Lcom/stripe/android/StripePaymentController;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/StripePaymentController;->paymentRelayStarterFactory:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$handleError(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/StripePaymentController;->handleError(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onSourceRetrieved(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/StripePaymentController;->onSourceRetrieved(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final authenticateAlipay(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentIntent;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->I$0:I

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/StripePaymentController;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$2:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/StripePaymentController;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p4, p0, Lcom/stripe/android/StripePaymentController;->alipayRepository:Lcom/stripe/android/networking/AlipayRepository;

    iput-object p0, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->label:I

    invoke-interface {p4, p1, p2, p3, v0}, Lcom/stripe/android/networking/AlipayRepository;->authenticate(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    move-object p2, p0

    :goto_1
    check-cast p4, Lcom/stripe/android/model/AlipayAuthResult;

    invoke-virtual {p4}, Lcom/stripe/android/model/AlipayAuthResult;->getOutcome()I

    move-result p4

    iget-object v2, p2, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, ""

    :cond_5
    sget-object v4, Lcom/stripe/android/StripePaymentController;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput-object p2, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->L$2:Ljava/lang/Object;

    iput p4, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->I$0:I

    iput v3, v0, Lcom/stripe/android/StripePaymentController$authenticateAlipay$1;->label:I

    invoke-virtual {v2, p1, p3, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->retrievePaymentIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move v6, p4

    move-object p4, p1

    move p1, v6

    :goto_2
    if-eqz p4, :cond_7

    check-cast p4, Lcom/stripe/android/model/PaymentIntent;

    new-instance p3, Lcom/stripe/android/PaymentIntentResult;

    iget-object p2, p2, Lcom/stripe/android/StripePaymentController;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    invoke-virtual {p2, p4, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p4, p1, p2}, Lcom/stripe/android/PaymentIntentResult;-><init>(Lcom/stripe/android/model/PaymentIntent;ILjava/lang/String;)V

    return-object p3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final confirmPaymentIntent(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/PaymentIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1, v3}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->withShouldUseStripeSdk(Z)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    sget-object v2, Lcom/stripe/android/StripePaymentController;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput v3, v0, Lcom/stripe/android/StripePaymentController$confirmPaymentIntent$1;->label:I

    invoke-virtual {p3, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeRepository;->confirmPaymentIntent$payments_core_release(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    return-object p3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "API request returned an invalid response."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final confirmSetupIntent(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/SetupIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1, v3}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->withShouldUseStripeSdk(Z)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    sget-object v2, Lcom/stripe/android/StripePaymentController;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput v3, v0, Lcom/stripe/android/StripePaymentController$confirmSetupIntent$1;->label:I

    invoke-virtual {p3, p1, p2, v2, v0}, Lcom/stripe/android/networking/StripeRepository;->confirmSetupIntent$payments_core_release(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    return-object p3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "API request returned an invalid response."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/PaymentController;
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/StripePaymentController;->Companion:Lcom/stripe/android/StripePaymentController$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/StripePaymentController$Companion;->create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/PaymentController;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;Z)Lcom/stripe/android/PaymentController;
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/StripePaymentController;->Companion:Lcom/stripe/android/StripePaymentController$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/stripe/android/StripePaymentController$Companion;->create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;Z)Lcom/stripe/android/PaymentController;

    move-result-object p0

    return-object p0
.end method

.method private final handleError(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "I",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/stripe/android/StripePaymentController$handleError$2;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/StripePaymentController$handleError$2;-><init>(Lcom/stripe/android/StripePaymentController;Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Throwable;ILkotlin/coroutines/Continuation;)V

    invoke-static {v0, v7, p4}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final logReturnUrl(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->defaultReturnUrl:Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-virtual {v0}, Lcom/stripe/android/payments/DefaultReturnUrl;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/stripe/android/StripePaymentController;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method private final onSourceRetrieved(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/Source;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    invoke-interface {v0, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;->getAuthenticator(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->authenticate(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public confirmAndAuthenticateAlipay(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/AlipayAuthenticator;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/StripePaymentController;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$1:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/AlipayAuthenticator;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$1:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lcom/stripe/android/StripePaymentController;->confirmPaymentIntent(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    check-cast p4, Lcom/stripe/android/model/PaymentIntent;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/StripePaymentController$confirmAndAuthenticateAlipay$1;->label:I

    invoke-direct {p1, p4, p2, p3, v0}, Lcom/stripe/android/StripePaymentController;->authenticateAlipay(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p4
.end method

.method public confirmWeChatPay(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/WeChatPayNextAction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput v3, v0, Lcom/stripe/android/StripePaymentController$confirmWeChatPay$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/StripePaymentController;->confirmPaymentIntent(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p3}, Lcom/stripe/android/model/PaymentIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    instance-of p1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/stripe/android/model/WeChatPayNextAction;

    invoke-virtual {p3}, Lcom/stripe/android/model/PaymentIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;

    invoke-virtual {p2}, Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;->getWeChat()Lcom/stripe/android/model/WeChat;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/model/WeChatPayNextAction;-><init>(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/WeChat;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to confirm Payment Intent with WeChatPay SDK"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAuthenticateSourceResult(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Source;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;

    iget v3, v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->Companion:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->getSourceId$payments_core_release()Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    if-nez v4, :cond_3

    move-object v4, v6

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->getClientSecret()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    goto :goto_1

    :cond_4
    move-object v6, v7

    :goto_1
    new-instance v13, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v7, v0, Lcom/stripe/android/StripePaymentController;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->getStripeAccountId$payments_core_release()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lcom/stripe/android/StripePaymentController;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v14, v0, Lcom/stripe/android/StripePaymentController;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v15, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1e

    const/16 v21, 0x0

    invoke-static/range {v14 .. v21}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v7

    invoke-interface {v1, v7}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    iget-object v1, v0, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput v5, v2, Lcom/stripe/android/StripePaymentController$getAuthenticateSourceResult$1;->label:I

    invoke-virtual {v1, v4, v6, v13, v2}, Lcom/stripe/android/networking/StripeRepository;->retrieveSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    return-object v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getPaymentIntentResult(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/PaymentIntentResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->paymentIntentFlowResultProcessor:Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;

    sget-object v1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->Companion:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->processResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getSetupIntentResult(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/SetupIntentResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/APIConnectionException;,
            Lcom/stripe/android/core/exception/APIException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->setupIntentFlowResultProcessor:Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;

    sget-object v1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->Companion:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->processResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public handleNextAction(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    invoke-interface {v0, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;->getAuthenticator(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->authenticate(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public registerLaunchersWithActivityResultCaller(Lu5;Lt5;)V
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

    new-instance v0, Lcom/stripe/android/PaymentRelayContract;

    invoke-direct {v0}, Lcom/stripe/android/PaymentRelayContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/StripePaymentController;->paymentRelayLauncher:LB5;

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/payments/core/ActivityResultLauncherHost;->onNewActivityResultCaller(Lu5;Lt5;)V

    return-void
.end method

.method public shouldHandlePaymentResult(ILandroid/content/Intent;)Z
    .locals 1

    const v0, 0xc350

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public shouldHandleSetupResult(ILandroid/content/Intent;)Z
    .locals 1

    const v0, 0xc351

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public shouldHandleSourceResult(ILandroid/content/Intent;)Z
    .locals 1

    const v0, 0xc352

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public startAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lcom/stripe/android/PaymentController$StripeIntentType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v0, p5

    instance-of v3, v0, Lcom/stripe/android/StripePaymentController$startAuth$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/StripePaymentController$startAuth$1;

    iget v4, v3, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/StripePaymentController$startAuth$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/StripePaymentController$startAuth$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v12, v3

    iget-object v0, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v13

    iget v3, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    const/4 v14, 0x4

    const/4 v15, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v8, :cond_4

    if-eq v3, v9, :cond_3

    if-eq v3, v15, :cond_2

    if-ne v3, v14, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-object v2, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/PaymentController$StripeIntentType;

    iget-object v3, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v5, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/StripePaymentController;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v11, v2

    move-object v10, v3

    move-object v2, v4

    move v14, v8

    goto :goto_2

    :cond_4
    iget-object v2, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/PaymentController$StripeIntentType;

    iget-object v3, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v5, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/StripePaymentController;

    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v11, v2

    move-object v10, v3

    move-object v2, v4

    move v14, v8

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object v11, v2

    move-object v10, v3

    move-object v2, v4

    move v14, v8

    goto/16 :goto_6

    :cond_5
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lcom/stripe/android/StripePaymentController$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v8, :cond_8

    if-ne v0, v9, :cond_7

    iget-object v3, v1, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const/4 v6, 0x0

    const/4 v0, 0x4

    const/16 v16, 0x0

    iput-object v1, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    iput-object v2, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    iput-object v10, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    iput-object v11, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    iput v9, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v7, v12

    move v14, v8

    move v8, v0

    move-object/from16 v9, v16

    :try_start_3
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/networking/StripeRepository;->retrieveSetupIntent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v13, :cond_6

    return-object v13

    :cond_6
    move-object v5, v1

    :goto_2
    :try_start_4
    check-cast v0, Lcom/stripe/android/model/StripeIntent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :cond_7
    move v14, v8

    :try_start_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    move v14, v8

    iget-object v3, v1, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    iput-object v1, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    iput-object v2, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    iput-object v10, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    iput-object v11, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    iput v14, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v7, v12

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/networking/StripeRepository;->retrievePaymentIntent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-ne v0, v13, :cond_9

    return-object v13

    :cond_9
    move-object v5, v1

    :goto_3
    :try_start_6
    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    :goto_4
    if-eqz v0, :cond_a

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_7

    :cond_a
    const-string v0, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_5

    :catchall_3
    move-exception v0

    move v14, v8

    :goto_5
    move-object v5, v1

    :goto_6
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_b

    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    iput v15, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    invoke-virtual {v5, v2, v0, v10, v12}, Lcom/stripe/android/StripePaymentController;->handleNextAction(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_e

    return-object v13

    :cond_b
    sget-object v0, Lcom/stripe/android/StripePaymentController$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v0, v0, v6

    if-eq v0, v14, :cond_d

    const/4 v6, 0x2

    if-ne v0, v6, :cond_c

    const v0, 0xc351

    goto :goto_8

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    const v0, 0xc350

    :goto_8
    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$0:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$1:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$2:Ljava/lang/Object;

    iput-object v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->L$3:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v12, Lcom/stripe/android/StripePaymentController$startAuth$1;->label:I

    invoke-direct {v5, v2, v0, v3, v12}, Lcom/stripe/android/StripePaymentController;->handleError(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_e

    return-object v13

    :cond_e
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public startAuthenticateSource(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/Source;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v0, p4

    instance-of v3, v0, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;

    iget v4, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget-object v2, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v5, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v8, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/StripePaymentController;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v10, v5

    goto :goto_5

    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/stripe/android/StripePaymentController;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v9, v1, Lcom/stripe/android/StripePaymentController;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1e

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v5

    invoke-interface {v0, v5}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/StripePaymentController;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v9, ""

    if-nez v5, :cond_5

    move-object v5, v9

    :cond_5
    :try_start_2
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/Source;->getClientSecret()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_6

    goto :goto_2

    :cond_6
    move-object v9, v10

    :goto_2
    iput-object v1, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$0:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v10, p1

    :try_start_3
    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$1:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$2:Ljava/lang/Object;

    iput v8, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    invoke-virtual {v0, v5, v9, v2, v3}, Lcom/stripe/android/networking/StripeRepository;->retrieveSource$payments_core_release(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v4, :cond_7

    return-object v4

    :cond_7
    move-object v8, v1

    move-object v5, v10

    :goto_3
    if-eqz v0, :cond_8

    :try_start_4
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_6

    :cond_8
    const-string v0, "Required value was null."

    new-instance v9, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object/from16 v10, p1

    :goto_4
    move-object v8, v1

    :goto_5
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v10

    :goto_6
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    const/4 v10, 0x0

    if-nez v9, :cond_9

    check-cast v0, Lcom/stripe/android/model/Source;

    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$2:Ljava/lang/Object;

    iput v7, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    invoke-direct {v8, v5, v0, v2, v3}, Lcom/stripe/android/StripePaymentController;->onSourceRetrieved(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    return-object v4

    :cond_9
    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->L$2:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/StripePaymentController$startAuthenticateSource$1;->label:I

    const v0, 0xc352

    invoke-direct {v8, v5, v0, v9, v3}, Lcom/stripe/android/StripePaymentController;->handleError(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    return-object v4

    :cond_a
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public startConfirmAndAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;

    iget v1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;-><init>(Lcom/stripe/android/StripePaymentController;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    iget-object v2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v5, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/StripePaymentController;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, p4

    move-object p4, p1

    move-object p1, v2

    move-object v2, v8

    goto/16 :goto_7

    :cond_4
    iget-object p1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    iget-object v2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v5, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/StripePaymentController;

    :try_start_1
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v8, p4

    move-object p4, p1

    move-object p1, v2

    move-object v2, v8

    goto :goto_6

    :catchall_0
    move-exception p4

    move-object v8, p4

    move-object p4, p1

    move-object p1, v2

    move-object v2, v8

    goto/16 :goto_9

    :cond_5
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-interface {p2}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p4}, Lcom/stripe/android/StripePaymentController;->logReturnUrl(Ljava/lang/String;)V

    iget-boolean p4, p0, Lcom/stripe/android/StripePaymentController;->isInstantApp:Z

    if-eqz p4, :cond_6

    invoke-interface {p2}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object p4

    goto :goto_5

    :cond_6
    invoke-interface {p2}, Lcom/stripe/android/model/ConfirmStripeIntentParams;->getReturnUrl()Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_8

    invoke-static {p4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    move v2, v6

    :goto_3
    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    move-object p4, v7

    :goto_4
    if-nez p4, :cond_a

    iget-object p4, p0, Lcom/stripe/android/StripePaymentController;->defaultReturnUrl:Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-virtual {p4}, Lcom/stripe/android/payments/DefaultReturnUrl;->getValue()Ljava/lang/String;

    move-result-object p4

    :cond_a
    :goto_5
    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    instance-of v2, p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz v2, :cond_c

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-virtual {v2, p4}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->setReturnUrl(Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    iput-object p0, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    invoke-direct {p0, v2, p3, v0}, Lcom/stripe/android/StripePaymentController;->confirmPaymentIntent(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    move-object v5, p0

    :goto_6
    :try_start_3
    check-cast v2, Lcom/stripe/android/model/StripeIntent;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v2

    goto :goto_9

    :cond_c
    :try_start_4
    instance-of v2, p2, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz v2, :cond_e

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-virtual {v2, p4}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->setReturnUrl(Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    iput-object p0, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    invoke-direct {p0, v2, p3, v0}, Lcom/stripe/android/StripePaymentController;->confirmSetupIntent(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v2, v1, :cond_d

    return-object v1

    :cond_d
    move-object v5, p0

    :goto_7
    :try_start_5
    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    :goto_8
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_a

    :cond_e
    :try_start_6
    new-instance v2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v2

    move-object v5, p0

    :goto_9
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_a
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_11

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v2}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p2

    if-eqz p2, :cond_10

    instance-of p2, p2, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;

    if-eqz p2, :cond_10

    invoke-interface {v2}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_10

    iget-object v3, v5, Lcom/stripe/android/StripePaymentController;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    if-nez p4, :cond_f

    const-string p4, ""

    :cond_f
    invoke-interface {v3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    invoke-virtual {v5, p1, v2, p3, v0}, Lcom/stripe/android/StripePaymentController;->handleNextAction(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_12

    return-object v1

    :cond_11
    sget-object p3, Lcom/stripe/android/StripePaymentController;->Companion:Lcom/stripe/android/StripePaymentController$Companion;

    invoke-virtual {p3, p2}, Lcom/stripe/android/StripePaymentController$Companion;->getRequestCode$payments_core_release(Lcom/stripe/android/model/ConfirmStripeIntentParams;)I

    move-result p2

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->L$4:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/StripePaymentController$startConfirmAndAuth$1;->label:I

    invoke-direct {v5, p1, p2, v6, v0}, Lcom/stripe/android/StripePaymentController;->handleError(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_12

    return-object v1

    :cond_12
    :goto_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public unregisterLaunchers()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->paymentRelayLauncher:LB5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB5;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/StripePaymentController;->paymentRelayLauncher:LB5;

    iget-object v0, p0, Lcom/stripe/android/StripePaymentController;->authenticatorRegistry:Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    invoke-interface {v0}, Lcom/stripe/android/payments/core/ActivityResultLauncherHost;->onLauncherInvalidated()V

    return-void
.end method
