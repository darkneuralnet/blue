.class public final synthetic LtO3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/PaymentMethodsActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtO3;->b:Lcom/stripe/android/view/PaymentMethodsActivity;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LtO3;->b:Lcom/stripe/android/view/PaymentMethodsActivity;

    check-cast p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V

    return-void
.end method
