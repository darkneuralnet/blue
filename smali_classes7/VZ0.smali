.class public final synthetic LVZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;

.field public final synthetic c:Lcom/stripe/android/model/PaymentMethod;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVZ0;->b:Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;

    iput-object p2, p0, LVZ0;->c:Lcom/stripe/android/model/PaymentMethod;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, LVZ0;->b:Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;

    iget-object v1, p0, LVZ0;->c:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v0, v1, p1, p2}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->b(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V

    return-void
.end method
