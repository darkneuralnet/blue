.class public final Lcom/stripe/android/view/AddPaymentMethodListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u001e\u00a2\u0006\u0004\u00080\u00101J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R*\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u0010\u0010\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/view/AddPaymentMethodListAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "getItemCount",
        "position",
        "",
        "getItemId",
        "holder",
        "",
        "onBindViewHolder",
        "updateSelected$payments_core_release",
        "(I)V",
        "updateSelected",
        "notifyAdapterItemChanged",
        "Lcom/stripe/android/view/ThemeConfig;",
        "themeConfig",
        "Lcom/stripe/android/view/ThemeConfig;",
        "getThemeConfig",
        "()Lcom/stripe/android/view/ThemeConfig;",
        "",
        "Lcom/stripe/android/view/Bank;",
        "items",
        "Ljava/util/List;",
        "getItems",
        "()Ljava/util/List;",
        "Lkotlin/Function1;",
        "itemSelectedCallback",
        "Lkotlin/jvm/functions/Function1;",
        "getItemSelectedCallback",
        "()Lkotlin/jvm/functions/Function1;",
        "Lcom/stripe/android/model/BankStatuses;",
        "bankStatuses",
        "Lcom/stripe/android/model/BankStatuses;",
        "getBankStatuses$payments_core_release",
        "()Lcom/stripe/android/model/BankStatuses;",
        "setBankStatuses$payments_core_release",
        "(Lcom/stripe/android/model/BankStatuses;)V",
        "value",
        "selectedPosition",
        "I",
        "getSelectedPosition",
        "()I",
        "setSelectedPosition",
        "<init>",
        "(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "BankViewHolder",
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
.field private bankStatuses:Lcom/stripe/android/model/BankStatuses;

.field private final itemSelectedCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/view/Bank;",
            ">;"
        }
    .end annotation
.end field

.field private selectedPosition:I

.field private final themeConfig:Lcom/stripe/android/view/ThemeConfig;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/ThemeConfig;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/view/Bank;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "themeConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemSelectedCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    iput-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->items:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->itemSelectedCallback:Lkotlin/jvm/functions/Function1;

    const/4 p1, -0x1

    iput p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->selectedPosition:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->setHasStableIds(Z)V

    return-void
.end method

.method public static synthetic o(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->onBindViewHolder$lambda$0(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->setSelectedPosition(I)V

    return-void
.end method


# virtual methods
.method public final getBankStatuses$payments_core_release()Lcom/stripe/android/model/BankStatuses;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->bankStatuses:Lcom/stripe/android/model/BankStatuses;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemSelectedCallback()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->itemSelectedCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/view/Bank;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedPosition()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->selectedPosition:I

    return v0
.end method

.method public final getThemeConfig()Lcom/stripe/android/view/ThemeConfig;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    return-object v0
.end method

.method public final notifyAdapterItemChanged(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/Bank;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v2, Lr7;

    invoke-direct {v2, p0, p1}, Lr7;-><init>(Lcom/stripe/android/view/AddPaymentMethodListAdapter;Landroidx/recyclerview/widget/RecyclerView$D;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    check-cast p1, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;

    iget v1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->selectedPosition:I

    const/4 v2, 0x1

    if-ne p2, v1, :cond_0

    move p2, v2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->setSelected$payments_core_release(Z)V

    iget-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->bankStatuses:Lcom/stripe/android/model/BankStatuses;

    if-eqz p2, :cond_1

    invoke-virtual {p2, v0}, Lcom/stripe/android/model/BankStatuses;->isOnline$payments_core_release(Lcom/stripe/android/view/Bank;)Z

    move-result v2

    :cond_1
    invoke-virtual {p1, v0, v2}, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->update(Lcom/stripe/android/view/Bank;Z)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/stripe/android/databinding/BankItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/BankItemBinding;

    move-result-object p1

    const-string v0, "inflate(\n               \u2026      false\n            )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    invoke-direct {p2, p1, v0}, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;-><init>(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V

    return-object p2
.end method

.method public final setBankStatuses$payments_core_release(Lcom/stripe/android/model/BankStatuses;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->bankStatuses:Lcom/stripe/android/model/BankStatuses;

    return-void
.end method

.method public final setSelectedPosition(I)V
    .locals 2

    iget v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->selectedPosition:I

    if-eq p1, v0, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->itemSelectedCallback:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->selectedPosition:I

    return-void
.end method

.method public final updateSelected$payments_core_release(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->setSelectedPosition(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    return-void
.end method
