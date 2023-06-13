.class public final Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0087\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0019\u0010\u0004\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0008\u0008\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0008\u0008\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ5\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u00062\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J#\u0010\'\u001a\u00020(2\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J(\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.H\u0002J\u001b\u0010$\u001a\u00020%2\u0008\u00100\u001a\u0004\u0018\u00010#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J#\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0008\u00100\u001a\u0004\u0018\u00010#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J#\u00106\u001a\u0002072\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J1\u00108\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010!\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J#\u0010:\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0008\u0010;\u001a\u0004\u0018\u00010#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J7\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0008\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0008\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006@"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "appName",
        "",
        "prefsRepositoryFactory",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "googlePayRepositoryFactory",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "stripeIntentValidator",
        "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "lpmRepository",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "accountStatusProvider",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)V",
        "create",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "customerConfig",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "isGooglePayReady",
        "",
        "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLinkConfiguration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "determineDefaultPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "isLinkReady",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentSheetConfiguration",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "load",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLinkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "retrieveCustomerPaymentMethods",
        "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveElementsSession",
        "configuration",
        "retrieveSavedPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "prefsRepository",
        "(Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentsheet_release"
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
        "SMAP\nPaymentSheetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1603#2,9:305\n1855#2:314\n1856#2:316\n1612#2:317\n766#2:318\n857#2,2:319\n1#3:315\n*S KotlinDebug\n*F\n+ 1 PaymentSheetLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader\n*L\n172#1:305,9\n172#1:314\n172#1:316\n172#1:317\n181#1:318\n181#1:319,2\n172#1:315\n*E\n"
    }
.end annotation


# instance fields
.field private final accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

.field private final appName:Ljava/lang/String;

.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

.field private final prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)V
    .locals 1
    .param p10    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "appName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsRepositoryFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepositoryFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSessionRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeIntentValidator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountStatusProvider"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->appName:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->logger:Lcom/stripe/android/core/Logger;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    return-void
.end method

.method public static final synthetic access$create(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->create(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createLinkConfiguration(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->createLinkConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPrefsRepositoryFactory$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->prefsRepositoryFactory:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$isGooglePayReady(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->isGooglePayReady(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadLinkState(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->loadLinkState(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveCustomerPaymentMethods(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->retrieveCustomerPaymentMethods(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveElementsSession(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->retrieveElementsSession(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveSavedPaymentSelection(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->retrieveSavedPaymentSelection(Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final create(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)V

    invoke-static {v7, p5}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final createLinkConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;

    iget v4, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->label:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v4, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/StripeIntent;

    iget-object v6, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v3, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v6

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v7

    :goto_1
    const/4 v5, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->isCheckboxSelected()Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_4
    move v8, v5

    :goto_2
    if-eqz v8, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getPhoneNumber()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_6
    move-object v8, v7

    :goto_3
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->isCheckboxSelected()Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Ljava/util/Map;

    move-result-object v2

    goto :goto_4

    :cond_8
    move-object v2, v7

    :goto_4
    if-eqz v1, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_9

    goto :goto_5

    :cond_9
    move-object/from16 v9, p2

    move-object v4, v0

    move-object v15, v2

    move-object v12, v5

    goto :goto_7

    :cond_a
    :goto_5
    if-eqz v1, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v5

    iput-object v0, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$1:Ljava/lang/Object;

    move-object/from16 v11, p2

    iput-object v11, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$3:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->L$4:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$createLinkConfiguration$1;->label:I

    invoke-interface {v9, v10, v5, v3}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->retrieveCustomer(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_b

    return-object v4

    :cond_b
    move-object v4, v0

    move-object v5, v11

    :goto_6
    check-cast v3, Lcom/stripe/android/model/Customer;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/stripe/android/model/Customer;->getEmail()Ljava/lang/String;

    move-result-object v3

    move-object v15, v2

    move-object v12, v3

    move-object v9, v5

    goto :goto_7

    :cond_c
    move-object/from16 v11, p2

    move-object v4, v0

    move-object v5, v11

    :cond_d
    move-object v15, v2

    move-object v9, v5

    move-object v12, v7

    :goto_7
    move-object v13, v8

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_f

    :cond_e
    iget-object v2, v4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->appName:Ljava/lang/String;

    :cond_f
    move-object v10, v2

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_8

    :cond_10
    move-object v11, v7

    :goto_8
    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v7

    :cond_11
    move-object v14, v7

    new-instance v1, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-object v8, v1

    invoke-direct/range {v8 .. v15}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;-><init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method private final determineDefaultPaymentSelection(ZZLjava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-direct {p1, p2, p3, v0, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    :cond_2
    :goto_0
    return-object v1
.end method

.method private final isGooglePayReady(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getEnvironment()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->googlePayRepositoryFactory:Lkotlin/jvm/functions/Function1;

    sget-object v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v4, :cond_4

    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    :goto_1
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()LEu1;

    move-result-object p1

    if-eqz p1, :cond_6

    iput v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$isGooglePayReady$1;->label:I

    invoke-static {p1, v0}, LVu1;->w(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    move v3, v4

    :cond_6
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final loadLinkState(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->createLinkConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->accountStatusProvider:Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$loadLinkState$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;->invoke(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p2

    :goto_2
    check-cast p3, Lcom/stripe/android/link/model/AccountStatus;

    sget-object p2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    if-eq p2, v4, :cond_9

    if-eq p2, v3, :cond_8

    const/4 p3, 0x3

    if-eq p2, p3, :cond_8

    const/4 p3, 0x4

    if-eq p2, p3, :cond_7

    const/4 p3, 0x5

    if-ne p2, p3, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_3
    sget-object p2, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->LoggedOut:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    goto :goto_4

    :cond_8
    sget-object p2, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->NeedsVerification:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    goto :goto_4

    :cond_9
    sget-object p2, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->LoggedIn:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    :goto_4
    new-instance p3, Lcom/stripe/android/paymentsheet/state/LinkState;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentsheet/state/LinkState;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)V

    return-object p3
.end method

.method private final retrieveCustomerPaymentMethods(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    invoke-static {p1, p2, p4}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getSupportedSavedCustomerPMs(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Companion:Lcom/stripe/android/model/PaymentMethod$Type$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v2, p4}, Lcom/stripe/android/model/PaymentMethod$Type$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;->label:I

    invoke-interface {p1, p3, p2, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->getPaymentMethods(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p4, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object p4, p3

    check-cast p4, Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {p4}, Lcom/stripe/android/model/PaymentMethod;->hasExpectedDetails()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p4, p4, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eq p4, v0, :cond_7

    move p4, v3

    goto :goto_4

    :cond_7
    const/4 p4, 0x0

    :goto_4
    if-eqz p4, :cond_6

    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    return-object p1
.end method

.method private final retrieveElementsSession(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->elementsSessionRepository:Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveElementsSession$1;->label:I

    invoke-virtual {p3, p1, p2, v0}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;->get(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p3, Lcom/stripe/android/model/ElementsSession;

    iget-object p2, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->getPaymentMethodSpecs()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->update(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V

    iget-object p2, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->lpmRepository:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->getServerSpecLoadingState()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    move-result-object p2

    instance-of p2, p2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;

    if-eqz p2, :cond_4

    iget-object p2, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onLpmSpecFailure()V

    :cond_4
    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->stripeIntentValidator:Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;->requireValid(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    return-object p1
.end method

.method private final retrieveSavedPaymentSelection(Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            "ZZ",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->Z$1:Z

    iget-boolean p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$2:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Ljava/util/List;

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/PrefsRepository;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$2:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->Z$0:Z

    iput-boolean p3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->Z$1:Z

    iput v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->label:I

    invoke-interface {p1, p2, p3, v0}, Lcom/stripe/android/paymentsheet/PrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p5, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    sget-object v4, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    invoke-static {p5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    return-object p5

    :cond_5
    invoke-direct {v2, p2, p3, p4}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->determineDefaultPaymentSelection(ZZLjava/util/List;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p4

    invoke-interface {p1, p4}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    const/4 p4, 0x0

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;->label:I

    invoke-interface {p1, p2, p3, v0}, Lcom/stripe/android/paymentsheet/PrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    return-object p5
.end method


# virtual methods
.method public load(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
