.class public final synthetic LvO3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2;


# instance fields
.field public final synthetic a:Lcom/stripe/android/view/PaymentMethodsAdapter;

.field public final synthetic b:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvO3;->a:Lcom/stripe/android/view/PaymentMethodsAdapter;

    iput-object p2, p0, LvO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lu2$a;)Z
    .locals 2

    iget-object v0, p0, LvO3;->a:Lcom/stripe/android/view/PaymentMethodsAdapter;

    iget-object v1, p0, LvO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    invoke-static {v0, v1, p1, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter;->q(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;Landroid/view/View;Lu2$a;)Z

    move-result p1

    return p1
.end method
