.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;
.super Lcom/google/android/material/bottomsheet/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u0008\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;",
        "Lcom/google/android/material/bottomsheet/b;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "uiState",
        "",
        "handleUiState",
        "finishWithSuccess",
        "finishWithCancellation",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "paymentFlowResult",
        "finishWithResult",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "view",
        "onViewCreated",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
        "args$delegate",
        "Lkotlin/Lazy;",
        "getArgs",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "viewModel",
        "<init>",
        "()V",
        "Companion",
        "paymentsheet_release"
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
        "SMAP\nPollingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,122:1\n106#2,15:123\n*S KotlinDebug\n*F\n+ 1 PollingFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment\n*L\n32#1:123,15\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;

.field public static final KEY_FRAGMENT_RESULT:Ljava/lang/String; = "KEY_FRAGMENT_RESULT_PollingFragment"


# instance fields
.field private final args$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/b;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$args$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$args$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->args$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$viewModel$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    const-class v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    invoke-static {p0, v2, v3, v4, v0}, LGy1;->b(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleUiState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->handleUiState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;)V

    return-void
.end method

.method private final finishWithCancellation()V
    .locals 11

    new-instance v10, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x74

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->finishWithResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V
    .locals 1

    const-string v0, "KEY_FRAGMENT_RESULT_PollingFragment"

    invoke-virtual {p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p0, v0, p1}, Liy1;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final finishWithSuccess()V
    .locals 11

    new-instance v10, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7c

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->finishWithResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V

    return-void
.end method

.method private final getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    return-object v0
.end method

.method private final handleUiState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;)V
    .locals 2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->getPollingState()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Success:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->finishWithSuccess()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->getPollingState()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Canceled:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->finishWithCancellation()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string p2, "requireContext()"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onCreateView$1$1;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onCreateView$1$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;)V

    const p3, 0x50cc8eb9

    const/4 v0, 0x1

    invoke-static {p3, v0, p2}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object p1

    const-string p2, "requireActivity().onBackPressedDispatcher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object p2

    const/4 v0, 0x0

    sget-object v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onViewCreated$1;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onViewCreated$1;

    invoke-static {p1, p2, v0, v1}, Lbf3;->a(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;)LVe3;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object p1

    const-string p2, "viewLifecycleOwner"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onViewCreated$2;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$onViewCreated$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
