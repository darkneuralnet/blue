.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0015J\u0008\u0010\n\u001a\u00020\u0002H\u0014J\u0008\u0010\u000b\u001a\u00020\u0002H\u0016R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R(\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R!\u0010 \u001a\u00020\u001b8@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u000e\u0012\u0004\u0008\u001f\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "",
        "setFadeAnimations",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "result",
        "finishWithResult",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "onDestroy",
        "finish",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "starterArgs$delegate",
        "Lkotlin/Lazy;",
        "getStarterArgs",
        "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "starterArgs",
        "Landroidx/lifecycle/u$b;",
        "viewModelFactory",
        "Landroidx/lifecycle/u$b;",
        "getViewModelFactory$payments_core_release",
        "()Landroidx/lifecycle/u$b;",
        "setViewModelFactory$payments_core_release",
        "(Landroidx/lifecycle/u$b;)V",
        "getViewModelFactory$payments_core_release$annotations",
        "()V",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;",
        "viewModel$delegate",
        "getViewModel$payments_core_release",
        "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;",
        "getViewModel$payments_core_release$annotations",
        "viewModel",
        "<init>",
        "Companion",
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
        "SMAP\nPaymentLauncherConfirmationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,104:1\n75#2,13:105\n*S KotlinDebug\n*F\n+ 1 PaymentLauncherConfirmationActivity.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity\n*L\n31#1:105,13\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

.field public static final EMPTY_ARG_ERROR:Ljava/lang/String; = "PaymentLauncherConfirmationActivity was started without arguments"


# instance fields
.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/u$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$starterArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$starterArgs$2;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->starterArgs$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$viewModelFactory$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$viewModelFactory$1;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$viewModel$2;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method public static final synthetic access$getStarterArgs(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private final finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finish()V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    return-object v0
.end method

.method public static synthetic getViewModel$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getViewModelFactory$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private static final onCreate$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final setFadeAnimations()V
    .locals 2

    sget-object v0, Lcom/stripe/android/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/utils/AnimationConstants;

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_IN()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_OUT()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->onCreate$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->setFadeAnimations()V

    return-void
.end method

.method public final getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    return-object v0
.end method

.method public final getViewModelFactory$payments_core_release()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SourceLockedOrientationActivity"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->setFadeAnimations()V

    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getStarterArgs()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "PaymentLauncherConfirmationActivity was started without arguments"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    const-string v1, "onBackPressedDispatcher"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$1;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$1;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->getPaymentLauncherResult$payments_core_release()LuX2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$3;

    invoke-direct {v1, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$onCreate$3;-><init>(Ljava/lang/Object;)V

    new-instance v2, LxM3;

    invoke-direct {v2, v1}, LxM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->register$payments_core_release(Lu5;)V

    sget-object v0, Lcom/stripe/android/view/AuthActivityStarterHost;->Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;->create$payments_core_release(Landroidx/activity/ComponentActivity;)Lcom/stripe/android/view/AuthActivityStarterHost;

    move-result-object v0

    instance-of v1, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;->getConfirmStripeIntentParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->confirmStripeIntent$payments_core_release(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    goto :goto_1

    :cond_2
    instance-of v1, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;->getPaymentIntentClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->handleNextActionForStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    goto :goto_1

    :cond_3
    instance-of v1, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;->getSetupIntentClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->handleNextActionForStripeIntent$payments_core_release(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-direct {p1, v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finishWithResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->getViewModel$payments_core_release()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;->cleanUp$payments_core_release()V

    return-void
.end method

.method public final setViewModelFactory$payments_core_release(Landroidx/lifecycle/u$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-void
.end method
