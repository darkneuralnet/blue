.class public final Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
        "Lcom/stripe/android/model/StripeIntent;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;

.field private final unsupportedAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->module:Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;

    iput-object p2, p0, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->unsupportedAuthenticatorProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;LY94;)Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;-><init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;LY94;)V

    return-object v0
.end method

.method public static provideWeChatAuthenticator$payments_core_release(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;->provideWeChatAuthenticator$payments_core_release(Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->module:Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;

    iget-object v1, p0, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->unsupportedAuthenticatorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;

    invoke-static {v0, v1}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->provideWeChatAuthenticator$payments_core_release(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->get()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;

    move-result-object v0

    return-object v0
.end method
