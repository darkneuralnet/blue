.class public abstract Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008 \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u0010\u0019\u001a\u00020\u0016H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "viewBinding",
        "Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;",
        "setViewBinding",
        "(Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;)V",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroyView",
        "",
        "onViewCreated",
        "view",
        "setupPrimaryButton",
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
        "SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment\n+ 2 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,95:1\n16#2,11:96\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment\n*L\n38#1:96,11\n*E\n"
    }
.end annotation


# instance fields
.field private viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method private final setupPrimaryButton()V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;->primaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    sget-object v1, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonColor()Landroid/content/res/ColorStateList;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "requireActivity().baseContext"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    const-string v1, "valueOf(\n               \u2026aseContext)\n            )"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, v2, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setAppearanceConfiguration(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/res/ColorStateList;)V

    return-void
.end method


# virtual methods
.method public final getViewBinding()Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    return-object v0
.end method

.method public abstract getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->setupPrimaryButton()V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrimaryButtonUiState()LtP5;

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

    new-instance v7, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final setViewBinding(Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    return-void
.end method
