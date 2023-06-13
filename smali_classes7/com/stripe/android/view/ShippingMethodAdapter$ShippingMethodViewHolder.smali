.class public final Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/ShippingMethodAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShippingMethodViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lcom/stripe/android/model/ShippingMethod;",
        "shippingMethod",
        "",
        "setShippingMethod",
        "",
        "selected",
        "setSelected",
        "Lcom/stripe/android/view/ShippingMethodView;",
        "shippingMethodView",
        "Lcom/stripe/android/view/ShippingMethodView;",
        "getShippingMethodView$payments_core_release",
        "()Lcom/stripe/android/view/ShippingMethodView;",
        "<init>",
        "(Lcom/stripe/android/view/ShippingMethodView;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/ShippingMethodView;)V
    .locals 1

    const-string v0, "shippingMethodView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    return-void
.end method


# virtual methods
.method public final getShippingMethodView$payments_core_release()Lcom/stripe/android/view/ShippingMethodView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    return-object v0
.end method

.method public final setSelected(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ShippingMethodView;->setSelected(Z)V

    return-void
.end method

.method public final setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 1

    const-string v0, "shippingMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ShippingMethodView;->setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V

    return-void
.end method
