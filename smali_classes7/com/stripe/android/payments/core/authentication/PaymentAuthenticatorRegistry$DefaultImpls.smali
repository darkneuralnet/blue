.class public final Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static onLauncherInvalidated(Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/core/ActivityResultLauncherHost$DefaultImpls;->onLauncherInvalidated(Lcom/stripe/android/payments/core/ActivityResultLauncherHost;)V

    return-void
.end method

.method public static onNewActivityResultCaller(Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;Lu5;Lt5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
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

    invoke-static {p0, p1, p2}, Lcom/stripe/android/payments/core/ActivityResultLauncherHost$DefaultImpls;->onNewActivityResultCaller(Lcom/stripe/android/payments/core/ActivityResultLauncherHost;Lu5;Lt5;)V

    return-void
.end method
