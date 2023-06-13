.class public abstract Lcom/stripe/android/payments/core/injection/AuthenticationModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008!\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/AuthenticationModule;",
        "",
        "()V",
        "binds3DS1Authenticator",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;",
        "Lcom/stripe/android/model/StripeIntent;",
        "webIntentAuthenticator",
        "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
        "bindsAlipayRedirectAuthenticator",
        "bindsCashAppRedirectAuthenticator",
        "bindsOxxoAuthenticator",
        "oxxoAuthenticator",
        "Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;",
        "bindsRedirectAuthenticator",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/core/injection/AuthenticationModule;->Companion:Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract binds3DS1Authenticator(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;
        value = Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;
    .end annotation

    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsAlipayRedirectAuthenticator(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;
        value = Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;
    .end annotation

    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsCashAppRedirectAuthenticator(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;
        value = Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;
    .end annotation

    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsOxxoAuthenticator(Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;
        value = Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;
    .end annotation

    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsRedirectAuthenticator(Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;
        value = Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;
    .end annotation

    .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation
.end method
