.class public final Lcom/stripe/android/view/PaymentMethodsActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentMethodsActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002J\u0008\u00102\u001a\u000203H\u0002J\u0008\u00104\u001a\u000203H\u0002J\u001c\u00105\u001a\u0002032\u0008\u00106\u001a\u0004\u0018\u0001072\u0008\u0008\u0002\u00108\u001a\u000209H\u0002J\u0015\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0001\u00a2\u0006\u0002\u0008=J\u0010\u0010>\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J\u0012\u0010?\u001a\u0002032\u0008\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0008\u0010B\u001a\u000203H\u0014J\u0008\u0010C\u001a\u00020\u001fH\u0016J\u0008\u0010D\u001a\u000203H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0008\u001a\u0004\u0008\u0015\u0010\u0016R*\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0008\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0008\u001a\u0004\u0008!\u0010\"R\u001b\u0010$\u001a\u00020%8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0008\u001a\u0004\u0008&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u0008\u001a\u0004\u0008+\u0010,\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentMethodsActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "adapter",
        "Lcom/stripe/android/view/PaymentMethodsAdapter;",
        "getAdapter",
        "()Lcom/stripe/android/view/PaymentMethodsAdapter;",
        "adapter$delegate",
        "Lkotlin/Lazy;",
        "alertDisplayer",
        "Lcom/stripe/android/view/AlertDisplayer;",
        "getAlertDisplayer",
        "()Lcom/stripe/android/view/AlertDisplayer;",
        "alertDisplayer$delegate",
        "args",
        "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;",
        "getArgs",
        "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;",
        "args$delegate",
        "cardDisplayTextFactory",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "getCardDisplayTextFactory",
        "()Lcom/stripe/android/view/CardDisplayTextFactory;",
        "cardDisplayTextFactory$delegate",
        "customerSession",
        "Lkotlin/Result;",
        "Lcom/stripe/android/CustomerSession;",
        "getCustomerSession-d1pmJ48",
        "()Ljava/lang/Object;",
        "customerSession$delegate",
        "earlyExitDueToIllegalState",
        "",
        "startedFromPaymentSession",
        "getStartedFromPaymentSession",
        "()Z",
        "startedFromPaymentSession$delegate",
        "viewBinding",
        "Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;",
        "getViewBinding$payments_core_release",
        "()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;",
        "viewBinding$delegate",
        "viewModel",
        "Lcom/stripe/android/view/PaymentMethodsViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/view/PaymentMethodsViewModel;",
        "viewModel$delegate",
        "createFooterView",
        "Landroid/view/View;",
        "contentRoot",
        "Landroid/view/ViewGroup;",
        "fetchCustomerPaymentMethods",
        "",
        "finishWithGooglePay",
        "finishWithResult",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "resultCode",
        "",
        "onAddPaymentMethodResult",
        "result",
        "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;",
        "onAddPaymentMethodResult$payments_core_release",
        "onAddedPaymentMethod",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onSupportNavigateUp",
        "setupRecyclerView",
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
        "SMAP\nPaymentMethodsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,304:1\n75#2,13:305\n262#3,2:318\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity\n*L\n62#1:305,13\n142#1:318,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/view/PaymentMethodsActivity$Companion;

.field public static final PRODUCT_TOKEN:Ljava/lang/String; = "PaymentMethodsActivity"


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;

.field private final alertDisplayer$delegate:Lkotlin/Lazy;

.field private final args$delegate:Lkotlin/Lazy;

.field private final cardDisplayTextFactory$delegate:Lkotlin/Lazy;

.field private final customerSession$delegate:Lkotlin/Lazy;

.field private earlyExitDueToIllegalState:Z

.field private final startedFromPaymentSession$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/PaymentMethodsActivity;->Companion:Lcom/stripe/android/view/PaymentMethodsActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/PaymentMethodsActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$viewBinding$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$startedFromPaymentSession$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$startedFromPaymentSession$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->startedFromPaymentSession$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$customerSession$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$customerSession$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->customerSession$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$cardDisplayTextFactory$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$cardDisplayTextFactory$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->cardDisplayTextFactory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$alertDisplayer$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$alertDisplayer$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->alertDisplayer$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$args$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$args$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->args$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$viewModel$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/view/PaymentMethodsViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/view/PaymentMethodsActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/view/PaymentMethodsActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$adapter$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$adapter$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithGooglePay(Lcom/stripe/android/view/PaymentMethodsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithGooglePay()V

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/PaymentMethod;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithResult(Lcom/stripe/android/model/PaymentMethod;I)V

    return-void
.end method

.method public static final synthetic access$getAdapter(Lcom/stripe/android/view/PaymentMethodsActivity;)Lcom/stripe/android/view/PaymentMethodsAdapter;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAlertDisplayer(Lcom/stripe/android/view/PaymentMethodsActivity;)Lcom/stripe/android/view/AlertDisplayer;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAlertDisplayer()Lcom/stripe/android/view/AlertDisplayer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getArgs(Lcom/stripe/android/view/PaymentMethodsActivity;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCustomerSession-d1pmJ48(Lcom/stripe/android/view/PaymentMethodsActivity;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getCustomerSession-d1pmJ48()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStartedFromPaymentSession(Lcom/stripe/android/view/PaymentMethodsActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getStartedFromPaymentSession()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/view/PaymentMethodsActivity;)Lcom/stripe/android/view/PaymentMethodsViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final createFooterView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getPaymentMethodsFooterLayoutId()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getPaymentMethodsFooterLayoutId()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, Lcom/stripe/android/R$id;->stripe_payment_methods_footer:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0xf

    invoke-static {v0, v1}, LWr2;->d(Landroid/widget/TextView;I)Z

    invoke-static {p1}, Lbq6;->j(Landroid/view/View;)V

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    return-object p1
.end method

.method private final fetchCustomerPaymentMethods()V
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentMethodsViewModel;->getPaymentMethods$payments_core_release()Landroidx/lifecycle/LiveData;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivity$fetchCustomerPaymentMethods$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$fetchCustomerPaymentMethods$1;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    new-instance v2, LqO3;

    invoke-direct {v2, v1}, LqO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    return-void
.end method

.method private static final fetchCustomerPaymentMethods$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final finishWithGooglePay()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3, v2}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;-><init>(Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;->toBundle()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/model/PaymentMethod;I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getUseGooglePay$payments_core_release()Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, p1, v2}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;-><init>(Lcom/stripe/android/model/PaymentMethod;Z)V

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static synthetic finishWithResult$default(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/PaymentMethod;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, -0x1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithResult(Lcom/stripe/android/model/PaymentMethod;I)V

    return-void
.end method

.method private final getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PaymentMethodsAdapter;

    return-object v0
.end method

.method private final getAlertDisplayer()Lcom/stripe/android/view/AlertDisplayer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->alertDisplayer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/AlertDisplayer;

    return-object v0
.end method

.method private final getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    return-object v0
.end method

.method private final getCardDisplayTextFactory()Lcom/stripe/android/view/CardDisplayTextFactory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->cardDisplayTextFactory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardDisplayTextFactory;

    return-object v0
.end method

.method private final getCustomerSession-d1pmJ48()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->customerSession$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getStartedFromPaymentSession()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->startedFromPaymentSession$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PaymentMethodsViewModel;

    return-object v0
.end method

.method private final onAddedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 3

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->isReusable:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->fetchCustomerPaymentMethods()V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PaymentMethodsViewModel;->onPaymentMethodAdded$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v0, v2}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithResult$default(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/PaymentMethod;IILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static final onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final setupRecyclerView()V
    .locals 8

    new-instance v7, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v2

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getCardDisplayTextFactory()Lcom/stripe/android/view/CardDisplayTextFactory;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getCustomerSession-d1pmJ48()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentMethodsViewModel;->getProductUsage$payments_core_release()Ljava/util/Set;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$deletePaymentMethodDialogFactory$1;

    invoke-direct {v6, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$deletePaymentMethodDialogFactory$1;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;-><init>(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$1;

    invoke-direct {v1, p0, v7}, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$1;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->setListener$payments_core_release(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentMethodsRecyclerView;->setPaymentMethodSelectedCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getCanDeletePaymentMethods$payments_core_release()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    new-instance v1, Lcom/stripe/android/view/PaymentMethodSwipeCallback;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/view/SwipeToDeleteCallbackListener;

    invoke-direct {v3, v7}, Lcom/stripe/android/view/SwipeToDeleteCallbackListener;-><init>(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;)V

    invoke-direct {v1, p0, v2, v3}, Lcom/stripe/android/view/PaymentMethodSwipeCallback;-><init>(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentMethodsRecyclerView;->attachItemTouchHelper$payments_core_release(Landroidx/recyclerview/widget/l$h;)V

    :cond_0
    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->onCreate$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->fetchCustomerPaymentMethods$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    return-object v0
.end method

.method public final onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;

    invoke-virtual {p1}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->onAddedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getCustomerSession-d1pmJ48()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithResult(Lcom/stripe/android/model/PaymentMethod;I)V

    return-void

    :cond_0
    new-instance p1, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$1;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-static {p0, p1}, Lcom/stripe/android/utils/ActivityUtilsKt;->argsAreInvalid(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->earlyExitDueToIllegalState:Z

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->getRoot()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getArgs()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getWindowFlags$payments_core_release()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/Window;->addFlags(I)V

    :cond_2
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v3

    const-string p1, "onBackPressedDispatcher"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$3;

    invoke-direct {v6, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$3;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsViewModel;->getSnackbarData$payments_core_release()LuX2;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$4;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$4;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    new-instance v3, LrO3;

    invoke-direct {v3, v2}, LrO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsViewModel;->getProgressData$payments_core_release()LuX2;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$5;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$5;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    new-instance v3, LsO3;

    invoke-direct {v3, v2}, LsO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setupRecyclerView()V

    new-instance p1, Lcom/stripe/android/view/AddPaymentMethodContract;

    invoke-direct {p1}, Lcom/stripe/android/view/AddPaymentMethodContract;-><init>()V

    new-instance v2, LtO3;

    invoke-direct {v2, p0}, LtO3;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    invoke-virtual {p0, p1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    const-string v2, "registerForActivityResul\u2026entMethodResult\n        )"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getAddPaymentMethodArgs()Landroidx/lifecycle/LiveData;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$6;

    invoke-direct {v3, p1}, Lcom/stripe/android/view/PaymentMethodsActivity$onCreate$6;-><init>(LB5;)V

    new-instance p1, LuO3;

    invoke-direct {p1, v3}, LuO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, p0, p1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/ActionBar;->v(Z)V

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/ActionBar;->x(Z)V

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->footerContainer:Landroid/widget/FrameLayout;

    const-string v1, "viewBinding.footerContainer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->createFooterView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setAccessibilityTraversalBefore(I)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setAccessibilityTraversalAfter(I)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->footerContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->footerContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->fetchCustomerPaymentMethods()V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;->recycler:Lcom/stripe/android/view/PaymentMethodsRecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->requestFocusFromTouch()Z

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->earlyExitDueToIllegalState:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getViewModel()Lcom/stripe/android/view/PaymentMethodsViewModel;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getSelectedPaymentMethod$payments_core_release()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentMethodsViewModel;->setSelectedPaymentMethodId$payments_core_release(Ljava/lang/String;)V

    :cond_1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getAdapter()Lcom/stripe/android/view/PaymentMethodsAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getSelectedPaymentMethod$payments_core_release()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithResult(Lcom/stripe/android/model/PaymentMethod;I)V

    const/4 v0, 0x1

    return v0
.end method
