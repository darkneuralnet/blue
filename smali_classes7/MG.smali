.class public final synthetic LMG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMG;->b:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, LMG;->b:Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->a(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V

    return-void
.end method
