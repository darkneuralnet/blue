.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u000c\u0010\u0015\u001a\u00020\u0011*\u00020\u0016H\u0002J\u000c\u0010\u0015\u001a\u00020\u0011*\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "financialConnectionsPaymentsProxy",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;",
        "starterArgs",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "getStarterArgs",
        "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "starterArgs$delegate",
        "Lkotlin/Lazy;",
        "viewModel",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        "viewModel$delegate",
        "initConnectionsPaymentsProxy",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "launch",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;",
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
        "SMAP\nCollectBankAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,69:1\n75#2,13:70\n*S KotlinDebug\n*F\n+ 1 CollectBankAccountActivity.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity\n*L\n25#1:70,13\n*E\n"
    }
.end annotation


# instance fields
.field private financialConnectionsPaymentsProxy:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$starterArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$starterArgs$2;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->starterArgs$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$viewModel$2;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getStarterArgs(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V

    return-void
.end method

.method public static final synthetic access$launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    return-object v0
.end method

.method private final initConnectionsPaymentsProxy()V
    .locals 7

    sget-object v0, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;->Companion:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;

    new-instance v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$initConnectionsPaymentsProxy$1;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$initConnectionsPaymentsProxy$1;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;->create$default(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy$Companion;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->financialConnectionsPaymentsProxy:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    return-void
.end method

.method private final launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;->getResult()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final launch(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->financialConnectionsPaymentsProxy:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;

    if-nez v0, :cond_0

    const-string v0, "financialConnectionsPaymentsProxy"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getFinancialConnectionsSessionSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;->getStripeAccountId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;->present(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->initConnectionsPaymentsProxy()V

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity$onCreate$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p1, v0}, Lzq2;->e(Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method
