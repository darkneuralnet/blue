.class public interface abstract Lcom/stripe/android/payments/core/injection/AuthenticationComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/payments/core/injection/AuthenticationModule;,
        Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule;,
        Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;",
        "",
        "registry",
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
        "getRegistry",
        "()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
        "inject",
        "",
        "stripe3ds2TransactionViewModelFactory",
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;",
        "Builder",
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
.method public abstract getRegistry()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
.end method

.method public abstract inject(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;)V
.end method
