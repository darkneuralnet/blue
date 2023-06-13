.class public interface abstract Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008H\'J\u0008\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\'J\u0012\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0010H\'J\u0012\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0013H\'J\u0018\u0010\u0014\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\'J\u0018\u0010\u0017\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0018H\'J\u001a\u0010\u0019\u001a\u00020\u00002\u0010\u0008\u0001\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0018H\'J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\'J\u0012\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u0013H\'\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;",
        "",
        "addressRepository",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestFactory",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "build",
        "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
        "configuration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "context",
        "Landroid/content/Context;",
        "enableLogging",
        "",
        "ioContext",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "productUsage",
        "",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "stripeAccountIdProvider",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "uiContext",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract addressRepository(Lcom/stripe/android/uicore/address/AddressRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
.end method

.method public abstract configuration(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract enableLogging(Z)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
