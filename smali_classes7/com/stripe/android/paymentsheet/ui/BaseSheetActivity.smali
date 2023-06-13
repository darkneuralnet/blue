.class public abstract Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;,
        Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$ToolbarResources;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultType:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/appcompat/app/AppCompatActivity;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008 \u0018\u0000 ;*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0002;<B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010/\u001a\u0002002\u0006\u00101\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u00102J\u0008\u00103\u001a\u000200H\u0016J\u0012\u00104\u001a\u0002002\u0008\u00105\u001a\u0004\u0018\u000106H\u0014J\u0015\u00107\u001a\u0002002\u0006\u00101\u001a\u00028\u0000H&\u00a2\u0006\u0002\u00102J\u0008\u00108\u001a\u000200H\u0002J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020\u0016H\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R/\u0010\u0008\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t8@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u000b\u0010\u0003\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0012\u0010)\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0007R\u0012\u0010+\u001a\u00020,X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;",
        "ResultType",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "bottomSheet",
        "Landroid/view/ViewGroup;",
        "getBottomSheet",
        "()Landroid/view/ViewGroup;",
        "bottomSheetBehavior",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "kotlin.jvm.PlatformType",
        "getBottomSheetBehavior$paymentsheet_release$annotations",
        "getBottomSheetBehavior$paymentsheet_release",
        "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "bottomSheetBehavior$delegate",
        "Lkotlin/Lazy;",
        "bottomSheetController",
        "Lcom/stripe/android/paymentsheet/BottomSheetController;",
        "getBottomSheetController",
        "()Lcom/stripe/android/paymentsheet/BottomSheetController;",
        "bottomSheetController$delegate",
        "earlyExitDueToIllegalState",
        "",
        "getEarlyExitDueToIllegalState",
        "()Z",
        "setEarlyExitDueToIllegalState",
        "(Z)V",
        "formArgs",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "getFormArgs",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "setFormArgs",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V",
        "linkHandler",
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "getLinkHandler",
        "()Lcom/stripe/android/paymentsheet/LinkHandler;",
        "linkLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "getLinkLauncher",
        "()Lcom/stripe/android/link/LinkPaymentLauncher;",
        "rootView",
        "getRootView",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "closeSheet",
        "",
        "result",
        "(Ljava/lang/Object;)V",
        "finish",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setActivityResult",
        "setSheetWidthForTablets",
        "updateRootViewClickHandling",
        "isProcessing",
        "Companion",
        "ToolbarResources",
        "paymentsheet_release"
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
        "SMAP\nBaseSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetActivity.kt\ncom/stripe/android/paymentsheet/ui/BaseSheetActivity\n+ 2 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,168:1\n16#2,11:169\n16#2,11:180\n*S KotlinDebug\n*F\n+ 1 BaseSheetActivity.kt\ncom/stripe/android/paymentsheet/ui/BaseSheetActivity\n*L\n80#1:169,11\n90#1:180,11\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;

.field public static final EXTRA_STARTER_ARGS:Ljava/lang/String; = "com.stripe.android.paymentsheet.extra_starter_args"

.field public static final TABLET_WIDTH_RATIO:D = 0.6


# instance fields
.field private final bottomSheetBehavior$delegate:Lkotlin/Lazy;

.field private final bottomSheetController$delegate:Lkotlin/Lazy;

.field private earlyExitDueToIllegalState:Z

.field private formArgs:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->Companion:Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$bottomSheetBehavior$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$bottomSheetBehavior$2;-><init>(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->bottomSheetBehavior$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$bottomSheetController$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$bottomSheetController$2;-><init>(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->bottomSheetController$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$updateRootViewClickHandling(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->updateRootViewClickHandling(Z)V

    return-void
.end method

.method public static synthetic getBottomSheetBehavior$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getBottomSheetController()Lcom/stripe/android/paymentsheet/BottomSheetController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->bottomSheetController$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/BottomSheetController;

    return-object v0
.end method

.method private final setSheetWidthForTablets()V
    .locals 6

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/paymentsheet/R$bool;->isTablet:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-static {v0}, LgO6;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    move-result-object v0

    const-string v1, "windowManager.currentWindowMetrics"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LoE;->a(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-static {}, LpE;->a()I

    move-result v2

    invoke-static {v1, v2}, LWB6;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object v1

    const-string v2, "windowMetrics.windowInse\u2026Insets.Type.systemBars())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LhO6;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-static {v1}, LZ61;->a(Landroid/graphics/Insets;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v1}, Lb71;->a(Landroid/graphics/Insets;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    iget v2, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I

    or-int/lit8 v2, v2, 0x1

    iput v2, v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I

    int-to-double v2, v0

    const-wide v4, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final updateRootViewClickHandling(Z)V
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object p1

    new-instance v0, LqE;

    invoke-direct {v0, p0}, LqE;-><init>(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    :goto_0
    return-void
.end method

.method private static final updateRootViewClickHandling$lambda$3(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onUserCancel()V

    return-void
.end method

.method public static synthetic v(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->updateRootViewClickHandling$lambda$3(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final closeSheet(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultType;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->setActivityResult(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheetController()Lcom/stripe/android/paymentsheet/BottomSheetController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/BottomSheetController;->hide()V

    return-void
.end method

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

.method public abstract getBottomSheet()Landroid/view/ViewGroup;
.end method

.method public final getBottomSheetBehavior$paymentsheet_release()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->bottomSheetBehavior$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-object v0
.end method

.method public final getEarlyExitDueToIllegalState()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->earlyExitDueToIllegalState:Z

    return v0
.end method

.method public final getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->formArgs:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method public final getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    return-object v0
.end method

.method public final getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v0

    return-object v0
.end method

.method public abstract getRootView()Landroid/view/ViewGroup;
.end method

.method public abstract getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 15

    move-object v6, p0

    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-boolean v0, v6, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->earlyExitDueToIllegalState:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v7, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v7}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheetController()Lcom/stripe/android/paymentsheet/BottomSheetController;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/BottomSheetController;->setup(Landroid/view/ViewGroup;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheetController()Lcom/stripe/android/paymentsheet/BottomSheetController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/BottomSheetController;->getShouldFinish$paymentsheet_release()LEu1;

    move-result-object v3

    sget-object v8, Landroidx/lifecycle/f$b;->e:Landroidx/lifecycle/f$b;

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v12, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1;

    const/4 v4, 0x0

    move-object v0, v12

    move-object v1, p0

    move-object v2, v8

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    const-string v1, "onBackPressedDispatcher"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$2;-><init>(Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getProcessing()LtP5;

    move-result-object v3

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v9

    new-instance v12, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$2;

    const/4 v4, 0x0

    move-object v0, v12

    move-object v1, p0

    move-object v2, v8

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$2;-><init>(LLifecycleOwner;Landroidx/lifecycle/f$b;LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;)V

    invoke-static/range {v9 .. v14}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "baseContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/stripe/android/uicore/StripeThemeKt;->isSystemDarkTheme(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->getBottomSheet()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->getColors(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->getSurface()I

    move-result v0

    invoke-static {v0}, Lvm0;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lvm0;->h(J)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->setSheetWidthForTablets()V

    return-void
.end method

.method public abstract setActivityResult(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultType;)V"
        }
    .end annotation
.end method

.method public final setEarlyExitDueToIllegalState(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->earlyExitDueToIllegalState:Z

    return-void
.end method

.method public final setFormArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;->formArgs:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-void
.end method
