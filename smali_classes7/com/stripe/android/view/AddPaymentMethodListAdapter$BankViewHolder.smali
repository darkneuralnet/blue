.class public final Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/AddPaymentMethodListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BankViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lcom/stripe/android/view/Bank;",
        "bank",
        "",
        "isOnline",
        "",
        "update",
        "isSelected",
        "setSelected$payments_core_release",
        "(Z)V",
        "setSelected",
        "Lcom/stripe/android/databinding/BankItemBinding;",
        "viewBinding",
        "Lcom/stripe/android/databinding/BankItemBinding;",
        "Lcom/stripe/android/view/ThemeConfig;",
        "themeConfig",
        "Lcom/stripe/android/view/ThemeConfig;",
        "Landroid/content/res/Resources;",
        "resources",
        "Landroid/content/res/Resources;",
        "<init>",
        "(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddPaymentMethodListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodListAdapter.kt\ncom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,110:1\n262#2,2:111\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethodListAdapter.kt\ncom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder\n*L\n106#1:111,2\n*E\n"
    }
.end annotation


# instance fields
.field private final resources:Landroid/content/res/Resources;

.field private final themeConfig:Lcom/stripe/android/view/ThemeConfig;

.field private final viewBinding:Lcom/stripe/android/databinding/BankItemBinding;


# direct methods
.method public constructor <init>(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V
    .locals 1

    const-string v0, "viewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/databinding/BankItemBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iput-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const-string p2, "itemView.resources"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->resources:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final setSelected$payments_core_release(Z)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/BankItemBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/ThemeConfig;->getTextColor$payments_core_release(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/BankItemBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/view/ThemeConfig;->getTintColor$payments_core_release(Z)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v0, v1}, LxY1;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/BankItemBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "viewBinding.checkIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final update(Lcom/stripe/android/view/Bank;Z)V
    .locals 5

    const-string v0, "bank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/BankItemBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/view/Bank;->getDisplayName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/stripe/android/R$string;->fpx_bank_offline:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-interface {p1}, Lcom/stripe/android/view/Bank;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p2, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p1}, Lcom/stripe/android/view/Bank;->getBrandIconResId()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;->viewBinding:Lcom/stripe/android/databinding/BankItemBinding;

    iget-object p2, p2, Lcom/stripe/android/databinding/BankItemBinding;->icon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    :cond_1
    return-void
.end method
