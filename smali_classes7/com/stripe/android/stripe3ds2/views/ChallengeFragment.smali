.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;,
        Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 b2\u00020\u0001:\u0001bBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010I\u001a\u00020JJ&\u0010K\u001a\u00020J2\u0008\u0010)\u001a\u0004\u0018\u00010*2\u0008\u0010$\u001a\u0004\u0018\u00010%2\u0008\u00103\u001a\u0004\u0018\u000104H\u0002J\u0008\u0010L\u001a\u00020JH\u0002J\u0008\u0010M\u001a\u00020JH\u0002J\u0010\u0010N\u001a\u00020J2\u0006\u0010O\u001a\u00020PH\u0002J\u0008\u0010Q\u001a\u00020JH\u0016J\u0010\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010R\u001a\u00020J2\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010W\u001a\u00020J2\u0006\u0010X\u001a\u00020Y2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010Z\u001a\u00020J2\u0006\u0010S\u001a\u00020TH\u0002J\u001a\u0010[\u001a\u00020J2\u0006\u0010\\\u001a\u00020]2\u0008\u0010^\u001a\u0004\u0018\u00010_H\u0016J\u0006\u0010`\u001a\u00020JJ\u0008\u0010a\u001a\u00020JH\u0002R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001a\u001a\u0004\u0008!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u001a\u001a\u0004\u0008&\u0010\'R\u001d\u0010)\u001a\u0004\u0018\u00010*8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u001a\u001a\u0004\u0008+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010\u001a\u001a\u0004\u00080\u00101R\u001d\u00103\u001a\u0004\u0018\u0001048@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010\u001a\u001a\u0004\u00085\u00106R\u000e\u00108\u001a\u000209X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008>\u0010\u001a\u001a\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020;8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010=R\u0014\u0010A\u001a\u00020\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR\u001b\u0010D\u001a\u00020E8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u0010\u001a\u001a\u0004\u0008F\u0010GR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;",
        "Landroidx/fragment/app/Fragment;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "transactionTimer",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "errorRequestExecutor",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "challengeActionHandler",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "initialUiType",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "intentData",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V",
        "_viewBinding",
        "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;",
        "brandZoneView",
        "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;",
        "getBrandZoneView",
        "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;",
        "brandZoneView$delegate",
        "Lkotlin/Lazy;",
        "challengeAction",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
        "getChallengeAction",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
        "challengeEntryViewFactory",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;",
        "getChallengeEntryViewFactory",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;",
        "challengeEntryViewFactory$delegate",
        "challengeZoneSelectView",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;",
        "getChallengeZoneSelectView$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;",
        "challengeZoneSelectView$delegate",
        "challengeZoneTextView",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;",
        "getChallengeZoneTextView$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;",
        "challengeZoneTextView$delegate",
        "challengeZoneView",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;",
        "getChallengeZoneView",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;",
        "challengeZoneView$delegate",
        "challengeZoneWebView",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;",
        "getChallengeZoneWebView$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;",
        "challengeZoneWebView$delegate",
        "cresData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "uiTypeCode",
        "",
        "getUiTypeCode",
        "()Ljava/lang/String;",
        "uiTypeCode$delegate",
        "userEntry",
        "getUserEntry$3ds2sdk_release",
        "viewBinding",
        "getViewBinding$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;",
        "viewModel",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;",
        "getViewModel$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;",
        "viewModel$delegate",
        "clickSubmitButton",
        "",
        "configure",
        "configureChallengeZoneView",
        "configureInformationZoneView",
        "onChallengeRequestResult",
        "result",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
        "onDestroyView",
        "onError",
        "data",
        "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;",
        "throwable",
        "",
        "onSuccess",
        "creqData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "onTimeout",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "refreshUi",
        "updateBrandZoneImages",
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
.field public static final ARG_CRES:Ljava/lang/String; = "arg_cres"

.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;


# instance fields
.field private _viewBinding:Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

.field private final brandZoneView$delegate:Lkotlin/Lazy;

.field private final challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

.field private final challengeEntryViewFactory$delegate:Lkotlin/Lazy;

.field private final challengeZoneSelectView$delegate:Lkotlin/Lazy;

.field private final challengeZoneTextView$delegate:Lkotlin/Lazy;

.field private final challengeZoneView$delegate:Lkotlin/Lazy;

.field private final challengeZoneWebView$delegate:Lkotlin/Lazy;

.field private cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

.field private final initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field private final intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

.field private final transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

.field private final uiTypeCode$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeActionHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/stripe3ds2/R$layout;->stripe_challenge_fragment:I

    invoke-direct {p0, v0}, Landroidx/fragment/app/Fragment;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$uiTypeCode$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$uiTypeCode$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiTypeCode$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$viewModel$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$viewModel$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    const-class p2, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$special$$inlined$activityViewModels$default$1;

    invoke-direct {p3, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance p4, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$special$$inlined$activityViewModels$default$2;

    const/4 p5, 0x0

    invoke-direct {p4, p5, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    invoke-static {p0, p2, p3, p4, p1}, LGy1;->b(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->viewModel$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeEntryViewFactory$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeEntryViewFactory$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeEntryViewFactory$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneView$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneView$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneView$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$brandZoneView$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$brandZoneView$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->brandZoneView$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneTextView$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneTextView$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneTextView$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneSelectView$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneSelectView$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneSelectView$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneWebView$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$challengeZoneWebView$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneWebView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic A9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onViewCreated$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onViewCreated$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->updateBrandZoneImages$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic E9(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configureChallengeZoneView$lambda$7(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic N6(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configureChallengeZoneView$lambda$8(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a5(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configure$lambda$3(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getChallengeActionHandler$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    return-object p0
.end method

.method public static final synthetic access$getChallengeEntryViewFactory(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeEntryViewFactory()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCresData$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getTransactionTimer$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    return-object p0
.end method

.method public static final synthetic access$getUiCustomization$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    return-object p0
.end method

.method public static final synthetic access$getWorkContext$p(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public static final synthetic access$onChallengeRequestResult(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onChallengeRequestResult(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;)V

    return-void
.end method

.method private final configure(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V
    .locals 3

    const-string v0, "cresData"

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p2, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v1

    :cond_0
    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getSubmitAuthenticationLabel()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p3, v2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButton(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getResendInformationLabel()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p3, v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setResendButtonLabel(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    goto/16 :goto_3

    :cond_2
    if-eqz p2, :cond_5

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p2, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v1

    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getSubmitAuthenticationLabel()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p3, v2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButton(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p2, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p2

    :goto_1
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getResendInformationLabel()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p3, v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setResendButtonLabel(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    goto :goto_3

    :cond_5
    if-eqz p3, :cond_6

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoHeaderText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButton(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    new-instance p1, Lwh0;

    invoke-direct {p1, p0}, Lwh0;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-virtual {p3, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getBrandZoneView()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p1, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_7
    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-ne p1, p2, :cond_9

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez p2, :cond_8

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-object v1, p2

    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getOobContinueLabel()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p3, v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButton(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    :cond_9
    :goto_3
    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configureChallengeZoneView()V

    return-void
.end method

.method private static final configure$lambda$3(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeAction()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onSubmitClicked(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V

    return-void
.end method

.method private final configureChallengeZoneView()V
    .locals 5

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v2, 0x0

    const-string v3, "cresData"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getChallengeInfoHeader()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoHeaderText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getChallengeInfoText()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getShouldShowChallengeInfoTextIndicator()Z

    move-result v1

    if-eqz v1, :cond_3

    sget v1, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_indicator:I

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoTextIndicator(I)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getWhitelistingInfoText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {v3, v4}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setWhitelistingLabel(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    new-instance v1, Lxh0;

    invoke-direct {v1, p0}, Lxh0;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButtonClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    new-instance v1, Lyh0;

    invoke-direct {v1, p0}, Lyh0;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setResendButtonClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final configureChallengeZoneView$lambda$7(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeAction()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onSubmitClicked(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V

    return-void
.end method

.method private static final configureChallengeZoneView$lambda$8(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;->INSTANCE:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;

    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->submit(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V

    return-void
.end method

.method private final configureInformationZoneView()V
    .locals 6

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->caInformationZone:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    const-string v1, "viewBinding.caInformationZone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v2, 0x0

    const-string v3, "cresData"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getWhyInfoLabel()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v4, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1
    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getWhyInfoText()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v5

    invoke-virtual {v0, v1, v4, v5}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->setWhyInfo(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getExpandInfoLabel()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, v4

    :goto_0
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getExpandInfoText()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->setExpandInfo(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getAccentColor()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->setToggleColor$3ds2sdk_release(I)V

    :cond_4
    return-void
.end method

.method private final getBrandZoneView()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->brandZoneView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    return-object v0
.end method

.method private final getChallengeAction()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v0, :cond_0

    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUserEntry$3ds2sdk_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;->INSTANCE:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUserEntry$3ds2sdk_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;-><init>(Ljava/lang/String;)V

    :goto_1
    return-object v0
.end method

.method private final getChallengeEntryViewFactory()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeEntryViewFactory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;

    return-object v0
.end method

.method private final getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    return-object v0
.end method

.method private final getUiTypeCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiTypeCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final onChallengeRequestResult(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;)V
    .locals 1

    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCreqData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCresData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onSuccess(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onError(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onTimeout(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private final onError(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {v1, p1, v2, v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onFinish(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->stopTimer()V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {v1, p1, v2, v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onFinish(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    return-void
.end method

.method private final onSuccess(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V
    .locals 2

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->isChallengeCompleted()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->stopTimer()V

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getCancelReason()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUiTypeCode()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {p1, p2, v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getTransStatus()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    const-string p2, "Y"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUiTypeCode()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {p1, p2, v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUiTypeCode()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {p1, p2, v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onFinish(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onNextScreen(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V

    :goto_1
    return-void
.end method

.method private final onTimeout(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->stopTimer()V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->errorRequestExecutor:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    invoke-interface {v0, p1}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getUiTypeCode()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->initialUiType:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->onFinish(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    return-void
.end method

.method private static final onViewCreated$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onViewCreated$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onViewCreated$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic t8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onViewCreated$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final updateBrandZoneImages()V
    .locals 6

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->caBrandZone:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    const-string v1, "viewBinding.caBrandZone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;->getIssuerImageView$3ds2sdk_release()Landroid/widget/ImageView;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v4, 0x0

    const-string v5, "cresData"

    if-nez v3, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getIssuerImage()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;->getPaymentSystemImageView$3ds2sdk_release()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v2, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getPaymentSystemImage()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v3, v1, v4}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getImage(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;I)Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$updateBrandZoneImages$1$1;

    invoke-direct {v4, v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$updateBrandZoneImages$1$1;-><init>(Landroid/widget/ImageView;)V

    new-instance v2, Lvh0;

    invoke-direct {v2, v4}, Lvh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private static final updateBrandZoneImages$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final clickSubmitButton()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeAction()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->submit(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V

    return-void
.end method

.method public final getChallengeZoneSelectView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneSelectView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;

    return-object v0
.end method

.method public final getChallengeZoneTextView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;

    return-object v0
.end method

.method public final getChallengeZoneWebView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->challengeZoneWebView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    return-object v0
.end method

.method public final getUserEntry$3ds2sdk_release()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    const/4 v2, 0x1

    const-string v3, ""

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    move-object v1, v3

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneWebView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->getUserEntry()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneSelectView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getUserEntry()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneTextView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;->getUserEntry()Ljava/lang/String;

    move-result-object v1

    :cond_5
    :goto_1
    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v3, v1

    :goto_2
    return-object v3
.end method

.method public final getViewBinding$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->_viewBinding:Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->_viewBinding:Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "arg_cres"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Could not start challenge screen. Challenge response data was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->_viewBinding:Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getChallengeText()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    new-instance v1, Lzh0;

    invoke-direct {v1, v0}, Lzh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getRefreshUi()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$2;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    new-instance v1, LAh0;

    invoke-direct {v1, v0}, LAh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getViewModel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->getChallengeRequestResult()Landroidx/lifecycle/LiveData;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()LLifecycleOwner;

    move-result-object p2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$onViewCreated$3;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;)V

    new-instance v1, LBh0;

    invoke-direct {v1, v0}, LBh0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->updateBrandZoneImages()V

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneTextView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneSelectView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;

    move-result-object p2

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneWebView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configure(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->configureInformationZoneView()V

    return-void
.end method

.method public final refreshUi()V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    const/4 v1, 0x0

    const-string v2, "cresData"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    sget-object v3, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Html:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getAcsHtmlRefresh()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v5

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v4

    :goto_1
    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneWebView$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v3, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v1, v3

    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getAcsHtmlRefresh()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->loadHtml(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v0, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    sget-object v3, Lcom/stripe/android/stripe3ds2/transactions/UiType;->OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    if-ne v0, v3, :cond_b

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v0, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_7
    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getChallengeAdditionalInfoText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    move v4, v5

    :cond_9
    :goto_3
    if-nez v4, :cond_b

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    if-nez v3, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    move-object v1, v3

    :goto_4
    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->getChallengeAdditionalInfoText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;->getChallengeZoneView()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoTextIndicator(I)V

    :cond_b
    :goto_5
    return-void
.end method
