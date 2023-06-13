.class public final Lcom/stripe/android/view/PaymentAuthWebViewActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0008\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0001\u00a2\u0006\u0002\u0008\"J\u0012\u0010#\u001a\u00020\u00192\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0008\u0010*\u001a\u00020\u0019H\u0014J\u0010\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020-H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0008\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentAuthWebViewActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "_args",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "get_args",
        "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "_args$delegate",
        "Lkotlin/Lazy;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "logger$delegate",
        "viewBinding",
        "Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;",
        "viewBinding$delegate",
        "viewModel",
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;",
        "viewModel$delegate",
        "cancelIntentSource",
        "",
        "createResultIntent",
        "Landroid/content/Intent;",
        "paymentFlowResult",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "customizeToolbar",
        "onAuthComplete",
        "error",
        "",
        "onAuthComplete$payments_core_release",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "",
        "menu",
        "Landroid/view/Menu;",
        "onDestroy",
        "onOptionsItemSelected",
        "item",
        "Landroid/view/MenuItem;",
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
        "SMAP\nPaymentAuthWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,189:1\n75#2,13:190\n*S KotlinDebug\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n*L\n38#1:190,13\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _args$delegate:Lkotlin/Lazy;

.field private final logger$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$viewBinding$2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$_args$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$_args$2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->_args$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$logger$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$logger$2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->logger$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$viewModel$2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$cancelIntentSource(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->cancelIntentSource()V

    return-void
.end method

.method public static final synthetic access$getLogger(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/core/Logger;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewBinding(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get_args(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private final cancelIntentSource()V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getCancellationResult$payments_core_release()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Intent().putExtras(paymentFlowResult.toBundle())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final customizeToolbar()V
    .locals 4

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#customizeToolbar()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getToolbarTitle$payments_core_release()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    sget-object v2, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;->getText$payments_core_release()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;->getToolbarCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object v0

    invoke-virtual {v2, p0, v3, v0}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->buildStyledText(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getToolbarBackgroundColor$payments_core_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    sget-object v1, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    invoke-virtual {v1, p0, v0}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->setStatusBarColor(Landroidx/appcompat/app/AppCompatActivity;I)V

    :cond_1
    return-void
.end method

.method private final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->logger$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method private final getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    return-object v0
.end method

.method private final get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->_args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    return-object v0
.end method

.method private static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V
    .locals 11

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logError()V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v1

    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x71

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->copy$default(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logComplete()V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 14

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onCreate()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->getRoot()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->customizeToolbar()V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v1

    const-string v0, "onBackPressedDispatcher"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;

    invoke-direct {v4, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$1;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v10

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object p1

    const-string v0, "PaymentAuthWebViewActivity#onCreate() - clientSecret is blank"

    invoke-interface {p1, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    new-instance v9, LuX2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v0}, LuX2;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    new-instance v1, LCL3;

    invoke-direct {v1, v0}, LCL3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, p0, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewClient;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v8

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getReturnUrl()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$1;

    invoke-direct {v12, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$1;-><init>(Ljava/lang/Object;)V

    new-instance v13, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$2;

    invoke-direct {v13, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$2;-><init>(Ljava/lang/Object;)V

    move-object v7, v0

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/view/PaymentAuthWebViewClient;-><init>(Lcom/stripe/android/core/Logger;LuX2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$3;

    invoke-direct {v2, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$3;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewClient;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/PaymentAuthWebView;->setOnLoadBlank$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v1, Lcom/stripe/android/view/PaymentAuthWebChromeClient;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/view/PaymentAuthWebChromeClient;-><init>(Landroid/app/Activity;Lcom/stripe/android/core/Logger;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logStart()V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getExtraHeaders()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onCreateOptionsMenu()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$menu;->payment_auth_web_view_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getButtonText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating close button text"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    sget v1, Lcom/stripe/android/R$id;->action_close:I

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webViewContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebView;->destroy()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onOptionsItemSelected()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/stripe/android/R$id;->action_close:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->cancelIntentSource()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
