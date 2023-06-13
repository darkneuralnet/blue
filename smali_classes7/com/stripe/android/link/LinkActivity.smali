.class public final Lcom/stripe/android/link/LinkActivity;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008*\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0008\u0010\u000c\u001a\u00020\u0004H\u0014J\u0008\u0010\r\u001a\u00020\u0004H\u0016R(\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR(\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u001e\u0010\u001f\u0012\u0004\u0008$\u0010\u0016\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0019\u001a\u0004\u0008\'\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivity;",
        "Landroidx/activity/ComponentActivity;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "result",
        "",
        "dismiss",
        "LEu1;",
        "",
        "isRootScreenFlow",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "onDestroy",
        "finish",
        "Landroidx/lifecycle/u$b;",
        "viewModelFactory",
        "Landroidx/lifecycle/u$b;",
        "getViewModelFactory$link_release",
        "()Landroidx/lifecycle/u$b;",
        "setViewModelFactory$link_release",
        "(Landroidx/lifecycle/u$b;)V",
        "getViewModelFactory$link_release$annotations",
        "()V",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getViewModel",
        "()Lcom/stripe/android/link/LinkActivityViewModel;",
        "viewModel",
        "LOY2;",
        "navController",
        "LOY2;",
        "getNavController",
        "()LOY2;",
        "setNavController",
        "(LOY2;)V",
        "getNavController$annotations",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "starterArgs$delegate",
        "getStarterArgs",
        "()Lcom/stripe/android/link/LinkActivityContract$Args;",
        "starterArgs",
        "<init>",
        "link_release"
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,276:1\n75#2,13:277\n47#3:290\n49#3:294\n50#4:291\n55#4:293\n106#5:292\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity\n*L\n66#1:277,13\n274#1:290\n274#1:294\n274#1:291\n274#1:293\n274#1:292\n*E\n"
    }
.end annotation


# instance fields
.field public navController:LOY2;

.field private final starterArgs$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;

.field private viewModelFactory:Landroidx/lifecycle/u$b;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$Factory;

    new-instance v1, Lcom/stripe/android/link/LinkActivity$viewModelFactory$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/link/LinkActivity$viewModelFactory$1;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivityViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    new-instance v0, Lcom/stripe/android/link/LinkActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkActivity$viewModel$2;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/link/LinkActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/link/LinkActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/link/LinkActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/link/LinkActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/link/LinkActivity;->viewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/link/LinkActivity$starterArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkActivity$starterArgs$2;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkActivity;->starterArgs$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$dismiss(Lcom/stripe/android/link/LinkActivity;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivity;->dismiss(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getStarterArgs(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->getStarterArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/link/LinkActivity;)Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isRootScreenFlow(Lcom/stripe/android/link/LinkActivity;)LEu1;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->isRootScreenFlow()LEu1;

    move-result-object p0

    return-object p0
.end method

.method private final dismiss(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 3

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult;->getResultCode()I

    move-result v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Lcom/stripe/android/link/LinkActivityContract$Result;

    invoke-direct {v2, p1}, Lcom/stripe/android/link/LinkActivityContract$Result;-><init>(Lcom/stripe/android/link/LinkActivityResult;)V

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Result;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->finish()V

    return-void
.end method

.method public static synthetic getNavController$annotations()V
    .locals 0

    return-void
.end method

.method private final getStarterArgs()Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->starterArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel;

    return-object v0
.end method

.method public static synthetic getViewModelFactory$link_release$annotations()V
    .locals 0

    return-void
.end method

.method private final isRootScreenFlow()LEu1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivity;->getNavController()LOY2;

    move-result-object v0

    invoke-virtual {v0}, LDY2;->z()LEu1;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/link/LinkActivity$isRootScreenFlow$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lcom/stripe/android/link/LinkActivity$isRootScreenFlow$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/link/LinkActivity;)V

    return-object v1
.end method


# virtual methods
.method public finish()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    sget v1, Lcom/stripe/android/link/R$anim;->slide_down:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final getNavController()LOY2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->navController:LOY2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navController"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModelFactory$link_release()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcom/stripe/android/link/R$anim;->slide_up:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    new-instance p1, Lcom/stripe/android/link/LinkActivity$onCreate$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/LinkActivity$onCreate$1;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    const v0, 0x5a46c849

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v1, v0}, LMs0;->b(Landroidx/activity/ComponentActivity;LYt0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityViewModel;->getNavigator()Lcom/stripe/android/link/model/Navigator;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/link/LinkActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkActivity$onCreate$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/model/Navigator;->setOnDismiss(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/LinkActivityViewModel;->setupPaymentLauncher(Lu5;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/link/LinkActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkActivity$onCreate$3;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivity;->getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityViewModel;->unregisterFromActivity()V

    return-void
.end method

.method public final setNavController(LOY2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->navController:LOY2;

    return-void
.end method

.method public final setViewModelFactory$link_release(Landroidx/lifecycle/u$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity;->viewModelFactory:Landroidx/lifecycle/u$b;

    return-void
.end method
