.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008!\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0008\u0010\t\u001a\u00020\u0004H\u0016R(\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000b\u0010\u000c\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;",
        "Landroidx/activity/ComponentActivity;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "result",
        "",
        "setResult",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "finish",
        "Landroidx/lifecycle/u$b;",
        "viewModelFactory",
        "Landroidx/lifecycle/u$b;",
        "getViewModelFactory$paymentsheet_release",
        "()Landroidx/lifecycle/u$b;",
        "setViewModelFactory$paymentsheet_release",
        "(Landroidx/lifecycle/u$b;)V",
        "getViewModelFactory$paymentsheet_release$annotations",
        "()V",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "starterArgs$delegate",
        "getStarterArgs",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "starterArgs",
        "LOY2;",
        "navController",
        "LOY2;",
        "<init>",
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
        "SMAP\nAddressElementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,163:1\n75#2,13:164\n*S KotlinDebug\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity\n*L\n46#1:164,13\n*E\n"
    }
.end annotation


# instance fields
.field private navController:LOY2;

.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/u$b;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModelFactory$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModelFactory$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModelFactory$2;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModelFactory$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$viewModel$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$starterArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$starterArgs$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->starterArgs$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getNavController$p(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)LOY2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->navController:LOY2;

    return-object p0
.end method

.method public static final synthetic access$getStarterArgs(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setNavController$p(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;LOY2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->navController:LOY2;

    return-void
.end method

.method public static final synthetic access$setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    return-object v0
.end method

.method public static synthetic getViewModelFactory$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;->getResultCode$paymentsheet_release()I

    move-result v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    invoke-direct {v2, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic setResult$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    sget-object v0, Lcom/stripe/android/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/utils/AnimationConstants;

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_IN()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_OUT()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final getViewModelFactory$paymentsheet_release()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, LjB6;->b(Landroid/view/Window;Z)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->parseAppearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->getStarterArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getStatusBarColor$paymentsheet_release()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->setResult$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    const v2, 0x7468f458

    invoke-static {v2, v0, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v1

    invoke-static {p0, p1, v1, v0, p1}, LMs0;->b(Landroidx/activity/ComponentActivity;LYt0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final setViewModelFactory$paymentsheet_release(Landroidx/lifecycle/u$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-void
.end method
