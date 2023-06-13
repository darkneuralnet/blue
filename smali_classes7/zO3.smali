.class public final synthetic LzO3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/PaymentMethodsAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentMethodsAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LzO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter;

    invoke-static {v0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->r(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V

    return-void
.end method
