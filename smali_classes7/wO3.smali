.class public final synthetic LwO3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/PaymentMethodsAdapter;

.field public final synthetic c:Landroidx/recyclerview/widget/RecyclerView$D;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter;

    iput-object p2, p0, LwO3;->c:Landroidx/recyclerview/widget/RecyclerView$D;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LwO3;->b:Lcom/stripe/android/view/PaymentMethodsAdapter;

    iget-object v1, p0, LwO3;->c:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->p(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V

    return-void
.end method
