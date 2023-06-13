.class public final synthetic Lr7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

.field public final synthetic c:Landroidx/recyclerview/widget/RecyclerView$D;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7;->b:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    iput-object p2, p0, Lr7;->c:Landroidx/recyclerview/widget/RecyclerView$D;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lr7;->b:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    iget-object v1, p0, Lr7;->c:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->o(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V

    return-void
.end method
