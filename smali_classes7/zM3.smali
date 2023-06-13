.class public final synthetic LzM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzM3;->b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LzM3;->b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    check-cast p1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V

    return-void
.end method
