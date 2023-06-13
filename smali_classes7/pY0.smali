.class public final synthetic LpY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpY0;->b:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LpY0;->b:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->a(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method
