.class public final Lcom/stripe/android/view/ShippingMethodAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0014\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007\u00a2\u0006\u0004\u0008,\u0010-J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u00148\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR6\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001b2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001b8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R*\u0010#\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u0013\u0010+\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/view/ShippingMethodAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;",
        "",
        "getItemCount",
        "position",
        "",
        "getItemId",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "i",
        "onCreateViewHolder",
        "holder",
        "",
        "onBindViewHolder",
        "Lcom/stripe/android/model/ShippingMethod;",
        "shippingMethod",
        "setSelected$payments_core_release",
        "(Lcom/stripe/android/model/ShippingMethod;)V",
        "setSelected",
        "Lkotlin/Function1;",
        "onShippingMethodSelectedCallback",
        "Lkotlin/jvm/functions/Function1;",
        "getOnShippingMethodSelectedCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnShippingMethodSelectedCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "value",
        "shippingMethods",
        "Ljava/util/List;",
        "getShippingMethods$payments_core_release",
        "()Ljava/util/List;",
        "setShippingMethods$payments_core_release",
        "(Ljava/util/List;)V",
        "selectedIndex",
        "I",
        "getSelectedIndex$payments_core_release",
        "()I",
        "setSelectedIndex$payments_core_release",
        "(I)V",
        "getSelectedShippingMethod",
        "()Lcom/stripe/android/model/ShippingMethod;",
        "selectedShippingMethod",
        "<init>",
        "()V",
        "ShippingMethodViewHolder",
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
.field private onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ShippingMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic selectedIndex:I

.field private shippingMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    sget-object v0, Lcom/stripe/android/view/ShippingMethodAdapter$onShippingMethodSelectedCallback$1;->INSTANCE:Lcom/stripe/android/view/ShippingMethodAdapter$onShippingMethodSelectedCallback$1;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->setHasStableIds(Z)V

    return-void
.end method

.method public static synthetic o(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->onBindViewHolder$lambda$0(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ShippingMethodAdapter;->setSelectedIndex$payments_core_release(I)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingMethod;->hashCode()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getOnShippingMethodSelectedCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ShippingMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSelectedIndex$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->selectedIndex:I

    return v0
.end method

.method public final getSelectedShippingMethod()Lcom/stripe/android/model/ShippingMethod;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    iget v1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->selectedIndex:I

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public final getShippingMethods$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->onBindViewHolder(Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->selectedIndex:I

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->setSelected(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;->getShippingMethodView$payments_core_release()Lcom/stripe/android/view/ShippingMethodView;

    move-result-object p2

    new-instance v0, Lnz5;

    invoke-direct {v0, p0, p1}, Lnz5;-><init>(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;
    .locals 7

    const-string p2, "viewGroup"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;

    new-instance v6, Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p1, "viewGroup.context"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/view/ShippingMethodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v6}, Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;-><init>(Lcom/stripe/android/view/ShippingMethodView;)V

    return-object p2
.end method

.method public final setOnShippingMethodSelectedCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ShippingMethod;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setSelected$payments_core_release(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 1

    const-string v0, "shippingMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ShippingMethodAdapter;->setSelectedIndex$payments_core_release(I)V

    return-void
.end method

.method public final setSelectedIndex$payments_core_release(I)V
    .locals 2

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->selectedIndex:I

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    iput p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->selectedIndex:I

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->onShippingMethodSelectedCallback:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setShippingMethods$payments_core_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodAdapter;->setSelectedIndex$payments_core_release(I)V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->shippingMethods:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method
