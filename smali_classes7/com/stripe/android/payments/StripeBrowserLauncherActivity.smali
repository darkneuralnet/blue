.class public final Lcom/stripe/android/payments/StripeBrowserLauncherActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014J\u0012\u0010\r\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/payments/StripeBrowserLauncherActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "viewModel",
        "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "onResult",
        "activityResult",
        "Landroidx/activity/result/ActivityResult;",
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
        "SMAP\nStripeBrowserLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,74:1\n75#2,13:75\n*S KotlinDebug\n*F\n+ 1 StripeBrowserLauncherActivity.kt\ncom/stripe/android/payments/StripeBrowserLauncherActivity\n*L\n26#1:75,13\n*E\n"
    }
.end annotation


# instance fields
.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    sget-object v0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$viewModel$2;->INSTANCE:Lcom/stripe/android/payments/StripeBrowserLauncherActivity$viewModel$2;

    if-nez v0, :cond_0

    new-instance v0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    :cond_0
    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    return-object v0
.end method

.method private final onResult(Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static synthetic v(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->onResult(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lcom/stripe/android/auth/PaymentBrowserAuthContract;->Companion:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;->parseArgs$payments_core_release(Landroid/content/Intent;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->getResultIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->getHasLaunched()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_1
    new-instance v0, Lz5;

    invoke-direct {v0}, Lz5;-><init>()V

    new-instance v1, LtS5;

    invoke-direct {v1, p0}, LtS5;-><init>(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;)V

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v0

    const-string v1, "registerForActivityResul\u2026 ::onResult\n            )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->createLaunchIntent(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p1}, LB5;->a(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->getViewModel()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;->setHasLaunched(Z)V

    :goto_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method
