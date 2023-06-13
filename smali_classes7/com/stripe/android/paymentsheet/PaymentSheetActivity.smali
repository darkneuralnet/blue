.class public final Lcom/stripe/android/paymentsheet/PaymentSheetActivity;
.super Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity<",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 72\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007\u00a2\u0006\u0004\u00086\u0010\u001bJ \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002J\u000c\u0010\u000e\u001a\u00060\u000cj\u0002`\rH\u0002J\u0012\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0008\u0010\u0014\u001a\u00020\nH\u0014R!\u0010\u001c\u001a\u00020\u00158@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u0012\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u0019R(\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u001e\u0010\u001f\u0012\u0004\u0008$\u0010\u001b\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0017\u001a\u0004\u0008\'\u0010(R\u001d\u0010-\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010\u0017\u001a\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010\u0017\u001a\u0004\u00080\u00101R\u001b\u00105\u001a\u00020.8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u0010\u0017\u001a\u0004\u00084\u00101\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetActivity;",
        "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResult;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "initializeArgs-d1pmJ48",
        "()Ljava/lang/Object;",
        "initializeArgs",
        "",
        "error",
        "",
        "finishWithError",
        "Ljava/lang/IllegalArgumentException;",
        "Lkotlin/IllegalArgumentException;",
        "defaultInitializationError",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "result",
        "setActivityResult",
        "onDestroy",
        "Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "getViewBinding$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;",
        "getViewBinding$paymentsheet_release$annotations",
        "()V",
        "viewBinding",
        "Landroidx/lifecycle/u$b;",
        "viewModelFactory",
        "Landroidx/lifecycle/u$b;",
        "getViewModelFactory$paymentsheet_release",
        "()Landroidx/lifecycle/u$b;",
        "setViewModelFactory$paymentsheet_release",
        "(Landroidx/lifecycle/u$b;)V",
        "getViewModelFactory$paymentsheet_release$annotations",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "viewModel",
        "starterArgs$delegate",
        "getStarterArgs",
        "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "starterArgs",
        "Landroid/view/ViewGroup;",
        "rootView$delegate",
        "getRootView",
        "()Landroid/view/ViewGroup;",
        "rootView",
        "bottomSheet$delegate",
        "getBottomSheet",
        "bottomSheet",
        "<init>",
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
        "SMAP\nPaymentSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetActivity.kt\ncom/stripe/android/paymentsheet/PaymentSheetActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,125:1\n75#2,13:126\n16#3,11:139\n*S KotlinDebug\n*F\n+ 1 PaymentSheetActivity.kt\ncom/stripe/android/paymentsheet/PaymentSheetActivity\n*L\n31#1:126,13\n72#1:139,11\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;

.field public static final EXTRA_STARTER_ARGS:Ljava/lang/String; = "com.stripe.android.paymentsheet.extra_starter_args"


# instance fields
.field private final bottomSheet$delegate:Lkotlin/Lazy;

.field private final rootView$delegate:Lkotlin/Lazy;

.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/u$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewBinding$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewModelFactory$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewModelFactory$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$viewModel$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$starterArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$starterArgs$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->starterArgs$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$rootView$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$rootView$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$bottomSheet$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$bottomSheet$2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->bottomSheet$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$closeSheet(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->closeSheet(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getStarterArgs(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object p0

    return-object p0
.end method

.method private final defaultInitializationError()Ljava/lang/IllegalArgumentException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PaymentSheet started without arguments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final finishWithError(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->defaultInitializationError()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->setActivityResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->finish()V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    return-object v0
.end method

.method public static synthetic getViewBinding$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getViewModelFactory$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final initializeArgs-d1pmJ48()Ljava/lang/Object;
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->defaultInitializationError()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getInitializationMode$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;->validate$paymentsheet_release()V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->validate(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/InvalidParameterException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->setEarlyExitDueToIllegalState(Z)V

    return-object v0
.end method


# virtual methods
.method public getBottomSheet()Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->bottomSheet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-bottomSheet>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public getRootView()Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;

    return-object v0
.end method

.method public getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelFactory$paymentsheet_release()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->initializeArgs-d1pmJ48()Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->finishWithError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->registerFromActivity(Lu5;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object p1

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;

    invoke-direct {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v2

    new-instance v3, LAP3;

    invoke-direct {v3, v2}, LAP3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    invoke-virtual {p0, v1, v3}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v1

    const-string v2, "registerForActivityResul\u2026lePayResult\n            )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->setupGooglePay(LZC0;LB5;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getStatusBarColor$paymentsheet_release()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;->getRoot()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;->content:Landroidx/compose/ui/platform/ComposeView;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$onCreate$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    const v1, -0x32e02893

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getPaymentSheetResult$paymentsheet_release()LTy5;

    move-result-object p1

    invoke-static {p1}, LVu1;->v(LEu1;)LEu1;

    move-result-object v3

    sget-object v2, Landroidx/lifecycle/f$b;->e:Landroidx/lifecycle/f$b;

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1;

    const/4 v4, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/paymentsheet/PaymentSheetActivity;)V

    const/4 v0, 0x3

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getEarlyExitDueToIllegalState()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->unregisterFromActivity()V

    :cond_0
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public setActivityResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Result;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Result;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic setActivityResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->setActivityResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public final setViewModelFactory$paymentsheet_release(Landroidx/lifecycle/u$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-void
.end method
