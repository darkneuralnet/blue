.class public final Lcom/stripe/android/view/AddPaymentMethodFpxView;
.super Lcom/stripe/android/view/AddPaymentMethodView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/view/AddPaymentMethodFpxView;",
        "Lcom/stripe/android/view/AddPaymentMethodView;",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V",
        "createParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "fpxAdapter",
        "Lcom/stripe/android/view/AddPaymentMethodListAdapter;",
        "fpxBankStatuses",
        "Lcom/stripe/android/model/BankStatuses;",
        "viewModel",
        "Lcom/stripe/android/view/FpxViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/view/FpxViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getItem",
        "Lcom/stripe/android/view/FpxBank;",
        "position",
        "onFpxBankStatusesUpdated",
        "",
        "updateStatuses",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddPaymentMethodFpxView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodFpxView.kt\ncom/stripe/android/view/AddPaymentMethodFpxView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1#2:105\n819#3:106\n847#3,2:107\n1855#3,2:109\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethodFpxView.kt\ncom/stripe/android/view/AddPaymentMethodFpxView\n*L\n85#1:106\n85#1:107,2\n88#1:109,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;


# instance fields
.field private final fpxAdapter:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

.field private fpxBankStatuses:Lcom/stripe/android/model/BankStatuses;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->Companion:Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/AddPaymentMethodFpxView;-><init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/AddPaymentMethodFpxView;-><init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/AddPaymentMethodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lcom/stripe/android/model/BankStatuses;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-direct {p2, p3, v0, p3}, Lcom/stripe/android/model/BankStatuses;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxBankStatuses:Lcom/stripe/android/model/BankStatuses;

    new-instance p2, Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    new-instance p3, Lcom/stripe/android/view/ThemeConfig;

    invoke-direct {p3, p1}, Lcom/stripe/android/view/ThemeConfig;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/stripe/android/view/FpxBank;->values()[Lcom/stripe/android/view/FpxBank;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/view/AddPaymentMethodFpxView$fpxAdapter$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/AddPaymentMethodFpxView$fpxAdapter$1;-><init>(Lcom/stripe/android/view/AddPaymentMethodFpxView;)V

    invoke-direct {p2, p3, v1, v2}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;-><init>(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iput-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxAdapter:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    new-instance p3, Lcom/stripe/android/view/AddPaymentMethodFpxView$viewModel$2;

    invoke-direct {p3, p1}, Lcom/stripe/android/view/AddPaymentMethodFpxView$viewModel$2;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->viewModel$delegate:Lkotlin/Lazy;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p3

    invoke-static {p3, p0, v0}, Lcom/stripe/android/databinding/BankListPaymentMethodBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/BankListPaymentMethodBinding;

    move-result-object p3

    const-string v1, "inflate(\n            act\u2026           true\n        )"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lcom/stripe/android/R$id;->stripe_payment_methods_add_fpx:I

    invoke-virtual {p0, v1}, Landroid/view/View;->setId(I)V

    invoke-direct {p0}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->getViewModel()Lcom/stripe/android/view/FpxViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/FpxViewModel;->getFpxBankStatues$payments_core_release()Landroidx/lifecycle/LiveData;

    move-result-object v1

    new-instance v2, Lq7;

    invoke-direct {v2, p0}, Lq7;-><init>(Lcom/stripe/android/view/AddPaymentMethodFpxView;)V

    invoke-virtual {v1, p1, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    iget-object p3, p3, Lcom/stripe/android/databinding/BankListPaymentMethodBinding;->bankList:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance p1, Landroidx/recyclerview/widget/g;

    invoke-direct {p1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-direct {p0}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->getViewModel()Lcom/stripe/android/view/FpxViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/FpxViewModel;->getSelectedPosition$payments_core_release()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->updateSelected$payments_core_release(I)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/AddPaymentMethodFpxView;-><init>(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/AddPaymentMethodFpxView;Lcom/stripe/android/model/BankStatuses;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V

    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/view/AddPaymentMethodFpxView;)Lcom/stripe/android/view/FpxViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->getViewModel()Lcom/stripe/android/view/FpxViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getItem(I)Lcom/stripe/android/view/FpxBank;
    .locals 1

    invoke-static {}, Lcom/stripe/android/view/FpxBank;->values()[Lcom/stripe/android/view/FpxBank;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final getViewModel()Lcom/stripe/android/view/FpxViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/FpxViewModel;

    return-object v0
.end method

.method private final onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->updateStatuses(Lcom/stripe/android/model/BankStatuses;)V

    :cond_0
    return-void
.end method

.method private final updateStatuses(Lcom/stripe/android/model/BankStatuses;)V
    .locals 4

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxBankStatuses:Lcom/stripe/android/model/BankStatuses;

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxAdapter:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->setBankStatuses$payments_core_release(Lcom/stripe/android/model/BankStatuses;)V

    invoke-static {}, Lcom/stripe/android/view/FpxBank;->values()[Lcom/stripe/android/view/FpxBank;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->getIndices([Ljava/lang/Object;)Lkotlin/ranges/IntRange;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {p0, v3}, Lcom/stripe/android/view/AddPaymentMethodFpxView;->getItem(I)Lcom/stripe/android/view/FpxBank;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/stripe/android/model/BankStatuses;->isOnline$payments_core_release(Lcom/stripe/android/view/Bank;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxAdapter:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->notifyAdapterItemChanged(I)V

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public getCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodFpxView;->fpxAdapter:Lcom/stripe/android/view/AddPaymentMethodListAdapter;

    invoke-virtual {v0}, Lcom/stripe/android/view/AddPaymentMethodListAdapter;->getSelectedPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {}, Lcom/stripe/android/view/FpxBank;->values()[Lcom/stripe/android/view/FpxBank;

    move-result-object v1

    aget-object v0, v1, v0

    sget-object v1, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    new-instance v2, Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;

    invoke-virtual {v0}, Lcom/stripe/android/view/FpxBank;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    :cond_2
    return-object v2
.end method
