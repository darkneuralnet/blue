.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010=\u001a\u00020>H\u0002J\u0008\u0010?\u001a\u00020>H\u0002J\u0008\u0010@\u001a\u00020>H\u0002J\u0012\u0010A\u001a\u00020>2\u0008\u0010B\u001a\u0004\u0018\u00010CH\u0014J\u0008\u0010D\u001a\u00020>H\u0014J\u0008\u0010E\u001a\u00020>H\u0016J\u0008\u0010F\u001a\u00020>H\u0014J\u0008\u0010G\u001a\u00020>H\u0014J\u0010\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020MH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0008\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0008\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0008\u001a\u0004\u0008\u001f\u0010 R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0008\u001a\u0004\u0008&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u0008\u001a\u0004\u0008+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010\u0008\u001a\u0004\u00080\u00101R\u001b\u00103\u001a\u0002048@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010\u0008\u001a\u0004\u00085\u00106R\u001b\u00108\u001a\u0002098@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010\u0008\u001a\u0004\u0008:\u0010;\u00a8\u0006O"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "challengeActionHandler",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "getChallengeActionHandler",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "challengeActionHandler$delegate",
        "Lkotlin/Lazy;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "getErrorReporter",
        "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "errorReporter$delegate",
        "errorRequestExecutor",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;",
        "getErrorRequestExecutor",
        "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;",
        "errorRequestExecutor$delegate",
        "fragment",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;",
        "getFragment$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;",
        "fragment$delegate",
        "fragmentViewBinding",
        "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;",
        "getFragmentViewBinding$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;",
        "fragmentViewBinding$delegate",
        "keyboardController",
        "Lcom/stripe/android/stripe3ds2/views/KeyboardController;",
        "getKeyboardController",
        "()Lcom/stripe/android/stripe3ds2/views/KeyboardController;",
        "keyboardController$delegate",
        "progressDialog",
        "Landroid/app/Dialog;",
        "progressDialogFactory",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;",
        "getProgressDialogFactory",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;",
        "progressDialogFactory$delegate",
        "transactionTimer",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "getTransactionTimer",
        "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "transactionTimer$delegate",
        "viewArgs",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
        "getViewArgs",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
        "viewArgs$delegate",
        "viewBinding",
        "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;",
        "getViewBinding$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;",
        "viewBinding$delegate",
        "viewModel",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;",
        "getViewModel$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;",
        "viewModel$delegate",
        "configureHeaderZone",
        "",
        "dismissDialog",
        "dismissKeyboard",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onLowMemory",
        "onPause",
        "onResume",
        "onTrimMemory",
        "level",
        "",
        "startFragment",
        "cres",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;

.field private static final WORK_CONTEXT:LSC0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final challengeActionHandler$delegate:Lkotlin/Lazy;

.field private final errorReporter$delegate:Lkotlin/Lazy;

.field private final errorRequestExecutor$delegate:Lkotlin/Lazy;

.field private final fragment$delegate:Lkotlin/Lazy;

.field private final fragmentViewBinding$delegate:Lkotlin/Lazy;

.field private final keyboardController$delegate:Lkotlin/Lazy;

.field private progressDialog:Landroid/app/Dialog;

.field private final progressDialogFactory$delegate:Lkotlin/Lazy;

.field private final transactionTimer$delegate:Lkotlin/Lazy;

.field private final viewArgs$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->WORK_CONTEXT:LSC0;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$transactionTimer$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$transactionTimer$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->transactionTimer$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$errorReporter$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$errorReporter$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->errorReporter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$fragment$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$fragment$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->fragment$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$fragmentViewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$fragmentViewBinding$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->fragmentViewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewBinding$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->challengeActionHandler$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$errorRequestExecutor$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$errorRequestExecutor$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->errorRequestExecutor$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewModel$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$viewArgs$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewArgs$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$keyboardController$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$keyboardController$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->keyboardController$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$progressDialogFactory$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$progressDialogFactory$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->progressDialogFactory$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$dismissDialog(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->dismissDialog()V

    return-void
.end method

.method public static final synthetic access$dismissKeyboard(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->dismissKeyboard()V

    return-void
.end method

.method public static final synthetic access$getChallengeActionHandler(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getChallengeActionHandler()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getErrorReporter()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getErrorRequestExecutor(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getErrorRequestExecutor()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getProgressDialogFactory(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getProgressDialogFactory()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTransactionTimer(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getTransactionTimer()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewArgs(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWORK_CONTEXT$cp()LSC0;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->WORK_CONTEXT:LSC0;

    return-object v0
.end method

.method public static final synthetic access$setProgressDialog$p(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->progressDialog:Landroid/app/Dialog;

    return-void
.end method

.method public static final synthetic access$startFragment(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->startFragment(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V

    return-void
.end method

.method private final configureHeaderZone()V
    .locals 4

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getUiCustomization$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getUiCustomization$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {v2, v3}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->customize(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Luh0;

    invoke-direct {v1, v0, p0}, Luh0;-><init>(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method private static final configureHeaderZone$lambda$5(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;->INSTANCE:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;

    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->submit(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V

    return-void
.end method

.method private final dismissDialog()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->progressDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->progressDialog:Landroid/app/Dialog;

    return-void
.end method

.method private final dismissKeyboard()V
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getKeyboardController()Lcom/stripe/android/stripe3ds2/views/KeyboardController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/KeyboardController;->hide()V

    return-void
.end method

.method private final getChallengeActionHandler()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->challengeActionHandler$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    return-object v0
.end method

.method private final getErrorReporter()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->errorReporter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    return-object v0
.end method

.method private final getErrorRequestExecutor()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->errorRequestExecutor$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    return-object v0
.end method

.method private final getKeyboardController()Lcom/stripe/android/stripe3ds2/views/KeyboardController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->keyboardController$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/KeyboardController;

    return-object v0
.end method

.method private final getProgressDialogFactory()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->progressDialogFactory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;

    return-object v0
.end method

.method private final getTransactionTimer()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->transactionTimer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    return-object v0
.end method

.method private final getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    return-object v0
.end method

.method private static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private final startFragment(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "supportFragmentManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object v0

    const-string v1, "beginTransaction()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->INSTANCE:Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->getSLIDE_IN()I

    move-result v2

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->getSLIDE_OUT()I

    move-result v3

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->getSLIDE_IN()I

    move-result v4

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->getSLIDE_OUT()I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/fragment/app/m;->x(IIII)Landroidx/fragment/app/m;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;->fragmentContainer:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "arg_cres"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v2}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p1

    const-class v2, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;

    invoke-virtual {v0, v1, v2, p1}, Landroidx/fragment/app/m;->v(ILjava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->i()I

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->onCreate$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->configureHeaderZone$lambda$5(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final getFragment$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->fragment$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;

    return-object v0
.end method

.method public final getFragmentViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->fragmentViewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    return-object v0
.end method

.method public final getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;

    return-object v0
.end method

.method public final getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getUiCustomization$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getTransactionTimer()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getErrorRequestExecutor()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getErrorReporter()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    move-result-object v6

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getChallengeActionHandler()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    move-result-object v7

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v9

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getCresData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v8

    sget-object v10, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->WORK_CONTEXT:LSC0;

    new-instance v1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->z1(Landroidx/fragment/app/e;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    invoke-virtual {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->c(LVe3;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getSubmitClicked()Landroidx/lifecycle/LiveData;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    new-instance v2, Lqh0;

    invoke-direct {v2, v1}, Lqh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getShouldFinish()Landroidx/lifecycle/LiveData;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$3;

    invoke-direct {v1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$3;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V

    new-instance v2, Lrh0;

    invoke-direct {v2, v1}, Lrh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->configureHeaderZone()V

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v1, ""

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getNextScreen()Landroidx/lifecycle/LiveData;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$4;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$4;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    new-instance v3, Lsh0;

    invoke-direct {v3, v2}, Lsh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewArgs()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getCresData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onNextScreen(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getTimeout()Landroidx/lifecycle/LiveData;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$5;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$onCreate$5;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    new-instance v0, Lth0;

    invoke-direct {v0, v1}, Lth0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->dismissDialog()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onMemoryEvent()V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->setShouldRefreshUi(Z)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->dismissKeyboard()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getShouldRefreshUi()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onRefreshUi()V

    :cond_0
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onTrimMemory(I)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onMemoryEvent()V

    return-void
.end method
