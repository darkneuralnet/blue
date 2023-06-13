.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;
.super Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;",
        "Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;",
        "()V",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "paymentsheet_release"
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
        "SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,95:1\n172#2,9:96\n16#3,11:105\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment\n*L\n62#1:96,9\n69#1:105,11\n*E\n"
    }
.end annotation


# instance fields
.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;-><init>()V

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;

    const-class v1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$2;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    invoke-static {p0, v1, v2, v3, v0}, LGy1;->b(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v0

    return-object v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getBuyButtonState()LEu1;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object v1

    const-string p1, "viewLifecycleOwner"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Landroidx/lifecycle/f$b;->e:Landroidx/lifecycle/f$b;

    invoke-static {v1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
