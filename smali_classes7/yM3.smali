.class public final synthetic LyM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyM3;->b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LyM3;->b:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-interface {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method
