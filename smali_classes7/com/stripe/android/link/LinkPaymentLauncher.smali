.class public final Lcom/stripe/android/link/LinkPaymentLauncher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/injection/NonFallbackInjectable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;,
        Lcom/stripe/android/link/LinkPaymentLauncher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u0081\u0001\u0008\u0001\u0012\u0006\u0010C\u001a\u00020B\u0012\u000e\u0008\u0001\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$\u0012\u000e\u0008\u0001\u0010)\u001a\u0008\u0012\u0004\u0012\u00020%0(\u0012\u0010\u0008\u0001\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0(\u0012\u0008\u0008\u0001\u0010,\u001a\u00020\u001b\u0012\u0008\u0008\u0001\u0010E\u001a\u00020D\u0012\u0008\u0008\u0001\u0010F\u001a\u00020D\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u00a2\u0006\u0004\u0008O\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010\u0014\u001a\u00020\tJ\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015J2\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ2\u0010#\u001a\u0008\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008!\u0010\"R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020%0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010*R\u0014\u0010,\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001a\u00101\u001a\u00020%8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u0012\u0004\u00083\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R(\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00088\u00109\u0012\u0004\u0008<\u00104\u001a\u0004\u0008:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006S"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "Lcom/stripe/android/core/injection/NonFallbackInjectable;",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "configuration",
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
        "getLinkPaymentLauncherComponent",
        "component",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "",
        "buildLinkComponent",
        "LEu1;",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "getAccountStatusFlow",
        "Lu5;",
        "activityResultCaller",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "callback",
        "register",
        "unregister",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "prefilledNewCardParams",
        "present",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "userInput",
        "Lkotlin/Result;",
        "",
        "signInWithUserInput-0E7RQCE",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "signInWithUserInput",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "attachNewCardToAccount-0E7RQCE",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachNewCardToAccount",
        "",
        "",
        "productUsage",
        "Ljava/util/Set;",
        "Lkotlin/Function0;",
        "publishableKeyProvider",
        "Lkotlin/jvm/functions/Function0;",
        "stripeAccountIdProvider",
        "enableLogging",
        "Z",
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;",
        "launcherComponentBuilder",
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;",
        "injectorKey",
        "Ljava/lang/String;",
        "getInjectorKey$annotations",
        "()V",
        "LGX2;",
        "componentFlow",
        "LGX2;",
        "emailFlow",
        "LEu1;",
        "getEmailFlow",
        "()LEu1;",
        "getEmailFlow$annotations",
        "LB5;",
        "linkActivityResultLauncher",
        "LB5;",
        "getComponent$link_release",
        "()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "ioContext",
        "uiContext",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "addressRepository",
        "<init>",
        "(Landroid/content/Context;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;)V",
        "Companion",
        "Configuration",
        "link_release"
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
        "SMAP\nLinkPaymentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkPaymentLauncher.kt\ncom/stripe/android/link/LinkPaymentLauncher\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n47#2:245\n49#2:249\n50#3:246\n55#3:248\n106#4:247\n1#5:250\n*S KotlinDebug\n*F\n+ 1 LinkPaymentLauncher.kt\ncom/stripe/android/link/LinkPaymentLauncher\n*L\n91#1:245\n91#1:249\n91#1:246\n91#1:248\n91#1:247\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/link/LinkPaymentLauncher$Companion;

.field public static final LINK_ENABLED:Z = true

.field private static final supportedFundingSources:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final componentFlow:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final emailFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final enableLogging:Z

.field private final injectorKey:Ljava/lang/String;

.field private final launcherComponentBuilder:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

.field private linkActivityResultLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

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

.field private final stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkPaymentLauncher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkPaymentLauncher;->Companion:Lcom/stripe/android/link/LinkPaymentLauncher$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    sget-object v0, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->Companion:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;->getAllTypes()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/LinkPaymentLauncher;->supportedFundingSources:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;)V
    .locals 1
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p7    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressRepository"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->productUsage:Ljava/util/Set;

    iput-object p3, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iput-boolean p5, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->enableLogging:Z

    invoke-static {}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;->builder()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p6}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p7}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p8}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p9}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p10}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p11}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->addressRepository(Lcom/stripe/android/uicore/address/AddressRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p5}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->enableLogging(Z)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p4}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->launcherComponentBuilder:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    sget-object p1, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    const-class p2, Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->nextKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->injectorKey:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->componentFlow:LGX2;

    invoke-static {p2}, LVu1;->v(LEu1;)LEu1;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/link/LinkPaymentLauncher$emailFlow$1;

    invoke-direct {p3, p1}, Lcom/stripe/android/link/LinkPaymentLauncher$emailFlow$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-static {p2, p5, p3, p4, p1}, LVu1;->B(LEu1;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)LEu1;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/link/LinkPaymentLauncher$special$$inlined$map$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/LinkPaymentLauncher$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->emailFlow:LEu1;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->register$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getSupportedFundingSources$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/LinkPaymentLauncher;->supportedFundingSources:Ljava/util/Set;

    return-object v0
.end method

.method private final buildLinkComponent(Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;Lcom/stripe/android/link/LinkActivityContract$Args;)V
    .locals 1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkComponentBuilder()Lcom/stripe/android/link/injection/LinkComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/LinkComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/LinkPaymentLauncher$buildLinkComponent$injector$1;-><init>(Lcom/stripe/android/link/injection/LinkComponent;)V

    sget-object p1, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->injectorKey:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic getEmailFlow$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getInjectorKey$annotations()V
    .locals 0
    .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
    .end annotation

    return-void
.end method

.method private final getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentLauncher;->getComponent$link_release()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->launcherComponentBuilder:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    invoke-interface {v0, p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->configuration(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object v0

    iget-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->componentFlow:LGX2;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public static synthetic present$default(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkPaymentLauncher;->present(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    return-void
.end method

.method private static final register$lambda$1(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final attachNewCardToAccount-0E7RQCE(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;

    iget v1, v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iput v3, v0, Lcom/stripe/android/link/LinkPaymentLauncher$attachNewCardToAccount$1;->label:I

    invoke-virtual {p1, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-gIAlu-s(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public bridge synthetic fallbackInitialize(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->fallbackInitialize(Lkotlin/Unit;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/injection/Injector;

    return-object p1
.end method

.method public fallbackInitialize(Lkotlin/Unit;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/injection/NonFallbackInjectable$DefaultImpls;->fallbackInitialize(Lcom/stripe/android/core/injection/NonFallbackInjectable;Lkotlin/Unit;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public final getAccountStatusFlow(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ")",
            "LEu1<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getAccountStatus()LEu1;

    move-result-object p1

    return-object p1
.end method

.method public final getComponent$link_release()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->componentFlow:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    return-object v0
.end method

.method public final getEmailFlow()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->emailFlow:LEu1;

    return-object v0
.end method

.method public final present(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;)V
    .locals 8

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    new-instance v7, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    iget-object v2, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->injectorKey:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->productUsage:Ljava/util/Set;

    iget-boolean v4, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->enableLogging:Z

    iget-object v1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, v7}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/LinkPaymentLauncher;->buildLinkComponent(Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;Lcom/stripe/android/link/LinkActivityContract$Args;)V

    iget-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:LB5;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, LB5;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final register(Lu5;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu5;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkActivityContract;-><init>()V

    new-instance v1, LOr2;

    invoke-direct {v1, p2}, LOr2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0, v1}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:LB5;

    return-void
.end method

.method public final signInWithUserInput-0E7RQCE(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;

    iget v1, v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getLinkPaymentLauncherComponent(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;->getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iput v3, v0, Lcom/stripe/android/link/LinkPaymentLauncher$signInWithUserInput$1;->label:I

    invoke-virtual {p1, p2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->signInWithUserInput-gIAlu-s(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final unregister()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:LB5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB5;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:LB5;

    return-void
.end method
