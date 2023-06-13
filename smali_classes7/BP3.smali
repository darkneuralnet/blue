.class public final synthetic LBP3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBP3;->b:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LBP3;->b:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method
