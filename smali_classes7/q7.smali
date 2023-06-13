.class public final synthetic Lq7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/AddPaymentMethodFpxView;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/AddPaymentMethodFpxView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7;->b:Lcom/stripe/android/view/AddPaymentMethodFpxView;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq7;->b:Lcom/stripe/android/view/AddPaymentMethodFpxView;

    check-cast p1, Lcom/stripe/android/model/BankStatuses;

    invoke-static {v0, p1}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->a(Lcom/stripe/android/view/AddPaymentMethodFpxView;Lcom/stripe/android/model/BankStatuses;)V

    return-void
.end method
