.class public final Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$PaymentLauncherComponentImpl;,
        Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$PaymentLauncherViewModelSubcomponentImpl;,
        Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$PaymentLauncherViewModelSubcomponentBuilder;,
        Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;-><init>(LyN0;)V

    return-object v0
.end method
