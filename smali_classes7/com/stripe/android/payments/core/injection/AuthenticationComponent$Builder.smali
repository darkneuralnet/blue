.class public interface abstract Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/AuthenticationComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000cH\'J\u0012\u0010\r\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\'J\u0012\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000cH\'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\'J\u0018\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u001c\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0018H\'J\u0012\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u001aH\'J\u0012\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001aH\'\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;",
        "",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestFactory",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "build",
        "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;",
        "context",
        "Landroid/content/Context;",
        "enableLogging",
        "",
        "injectorKey",
        "id",
        "",
        "isInstantApp",
        "productUsage",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "threeDs1IntentReturnUrlMap",
        "",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
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


# virtual methods
.method public abstract analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract enableLogging(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract injectorKey(Ljava/lang/String;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract isInstantApp(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
