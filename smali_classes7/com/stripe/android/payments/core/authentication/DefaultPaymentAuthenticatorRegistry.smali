.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;
.implements Lcom/stripe/android/core/injection/Injector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DBJ\u0008\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012/\u0008\u0001\u0010$\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u00080\u0007j\u0002`\t\u00a2\u0006\u0002\u0008\n0#\u00a2\u0006\u0004\u0008B\u0010CJ3\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0006\u001a\u000e\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003j\u0002`\u00052\u0015\u0010\u000b\u001a\u0011\u0012\u0004\u0012\u00020\u00080\u0007j\u0002`\t\u00a2\u0006\u0002\u0008\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000c2\u0012\u0010\u0006\u001a\u000e\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016J#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\u0008\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0008\u0010\u0019\u001a\u00020\u000cH\u0016J\u0014\u0010\u001c\u001a\u00020\u000c2\n\u0010\u001b\u001a\u0006\u0012\u0002\u0008\u00030\u001aH\u0016R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R;\u0010$\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u00080\u0007j\u0002`\t\u00a2\u0006\u0002\u0008\n0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R;\u0010\'\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u00080\u0007j\u0002`\t\u00a2\u0006\u0002\u0008\n0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R*\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010/8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00102\u001a\u0004\u00089\u00104\"\u0004\u0008:\u00106R(\u0010A\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020<0\u00070;8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008=\u0010>\u00a8\u0006E"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "Lcom/stripe/android/core/injection/Injector;",
        "Ljava/lang/Class;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "Lcom/stripe/android/payments/core/authentication/AuthenticatorKey;",
        "key",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lcom/stripe/android/payments/core/authentication/Authenticator;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "authenticator",
        "",
        "registerAuthenticator",
        "unregisterAuthenticator",
        "Authenticatable",
        "authenticatable",
        "getAuthenticator",
        "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;",
        "Lu5;",
        "activityResultCaller",
        "Lt5;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "activityResultCallback",
        "onNewActivityResultCaller",
        "onLauncherInvalidated",
        "Lcom/stripe/android/core/injection/Injectable;",
        "injectable",
        "inject",
        "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
        "noOpIntentAuthenticator",
        "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
        "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
        "sourceAuthenticator",
        "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
        "",
        "paymentAuthenticators",
        "Ljava/util/Map;",
        "",
        "additionalAuthenticators",
        "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;",
        "authenticationComponent",
        "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;",
        "getAuthenticationComponent",
        "()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;",
        "setAuthenticationComponent",
        "(Lcom/stripe/android/payments/core/injection/AuthenticationComponent;)V",
        "LB5;",
        "Lcom/stripe/android/PaymentRelayStarter$Args;",
        "paymentRelayLauncher",
        "LB5;",
        "getPaymentRelayLauncher$payments_core_release",
        "()LB5;",
        "setPaymentRelayLauncher$payments_core_release",
        "(LB5;)V",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "paymentBrowserAuthLauncher",
        "getPaymentBrowserAuthLauncher$payments_core_release",
        "setPaymentBrowserAuthLauncher$payments_core_release",
        "",
        "Lcom/stripe/android/core/model/StripeModel;",
        "getAllAuthenticators$payments_core_release",
        "()Ljava/util/Set;",
        "getAllAuthenticators$payments_core_release$annotations",
        "()V",
        "allAuthenticators",
        "<init>",
        "(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)V",
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
        "SMAP\nDefaultPaymentAuthenticatorRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPaymentAuthenticatorRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1855#2,2:182\n1855#2,2:184\n*S KotlinDebug\n*F\n+ 1 DefaultPaymentAuthenticatorRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry\n*L\n112#1:182,2\n126#1:184,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;


# instance fields
.field private final additionalAuthenticators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation
.end field

.field public authenticationComponent:Lcom/stripe/android/payments/core/injection/AuthenticationComponent;

.field private final noOpIntentAuthenticator:Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

.field private final paymentAuthenticators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation
.end field

.field private paymentBrowserAuthLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private paymentRelayLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final sourceAuthenticator:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->Companion:Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)V
    .locals 1
    .param p3    # Ljava/util/Map;
        .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "noOpIntentAuthenticator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceAuthenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAuthenticators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->noOpIntentAuthenticator:Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->sourceAuthenticator:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentAuthenticators:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->additionalAuthenticators:Ljava/util/Map;

    return-void
.end method

.method public static synthetic getAllAuthenticators$payments_core_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getAllAuthenticators$payments_core_release()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "+",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/SetsKt;->createSetBuilder()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->noOpIntentAuthenticator:Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->sourceAuthenticator:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentAuthenticators:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->additionalAuthenticators:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lkotlin/collections/SetsKt;->build(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getAuthenticationComponent()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->authenticationComponent:Lcom/stripe/android/payments/core/injection/AuthenticationComponent;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "authenticationComponent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAuthenticator(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Authenticatable:",
            "Ljava/lang/Object;",
            ">(TAuthenticatable;)",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "TAuthenticatable;>;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/model/StripeIntent;

    const-string v1, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable of com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry.getAuthenticator>"

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->noOpIntentAuthenticator:Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentAuthenticators:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->additionalAuthenticators:Ljava/util/Map;

    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->noOpIntentAuthenticator:Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

    :cond_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    instance-of v0, p1, Lcom/stripe/android/model/Source;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->sourceAuthenticator:Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No suitable PaymentAuthenticator for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getPaymentBrowserAuthLauncher$payments_core_release()LB5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentBrowserAuthLauncher:LB5;

    return-object v0
.end method

.method public final getPaymentRelayLauncher$payments_core_release()LB5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentRelayLauncher:LB5;

    return-object v0
.end method

.method public inject(Lcom/stripe/android/core/injection/Injectable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/Injectable<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "injectable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->getAuthenticationComponent()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/core/injection/AuthenticationComponent;->inject(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid Injectable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requested in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onLauncherInvalidated()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->getAllAuthenticators$payments_core_release()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    invoke-virtual {v1}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->onLauncherInvalidated()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentRelayLauncher:LB5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LB5;->c()V

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentBrowserAuthLauncher:LB5;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LB5;->c()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentRelayLauncher:LB5;

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentBrowserAuthLauncher:LB5;

    return-void
.end method

.method public onNewActivityResultCaller(Lu5;Lt5;)V
    .locals 2
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

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->getAllAuthenticators$payments_core_release()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;->onNewActivityResultCaller(Lu5;Lt5;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/PaymentRelayContract;

    invoke-direct {v0}, Lcom/stripe/android/PaymentRelayContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentRelayLauncher:LB5;

    new-instance v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract;

    invoke-direct {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentBrowserAuthLauncher:LB5;

    return-void
.end method

.method public registerAuthenticator(Ljava/lang/Class;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->additionalAuthenticators:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setAuthenticationComponent(Lcom/stripe/android/payments/core/injection/AuthenticationComponent;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->authenticationComponent:Lcom/stripe/android/payments/core/injection/AuthenticationComponent;

    return-void
.end method

.method public final setPaymentBrowserAuthLauncher$payments_core_release(LB5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentBrowserAuthLauncher:LB5;

    return-void
.end method

.method public final setPaymentRelayLauncher$payments_core_release(LB5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->paymentRelayLauncher:LB5;

    return-void
.end method

.method public unregisterAuthenticator(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;->additionalAuthenticators:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
