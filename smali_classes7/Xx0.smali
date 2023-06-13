.class public final synthetic LXx0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/link/confirmation/ConfirmationManager;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/confirmation/ConfirmationManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXx0;->b:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LXx0;->b:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    invoke-static {v0, p1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->a(Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method
