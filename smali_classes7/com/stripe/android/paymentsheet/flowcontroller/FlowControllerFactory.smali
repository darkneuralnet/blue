.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B!\u0008\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u001bB!\u0008\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;",
        "create",
        "LXr6;",
        "viewModelStoreOwner",
        "LXr6;",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "LLifecycleOwner;",
        "Lu5;",
        "activityResultCaller",
        "Lu5;",
        "Lkotlin/Function0;",
        "",
        "statusBarColor",
        "Lkotlin/jvm/functions/Function0;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
        "paymentOptionCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "paymentResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "<init>",
        "(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final activityResultCaller:Lu5;

.field private final lifecycleOwner:LLifecycleOwner;

.field private final paymentOptionCallback:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

.field private final paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

.field private final statusBarColor:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModelStoreOwner:LXr6;


# direct methods
.method public constructor <init>(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXr6;",
            "LLifecycleOwner;",
            "Lu5;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCaller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusBarColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionCallback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->viewModelStoreOwner:LXr6;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->lifecycleOwner:LLifecycleOwner;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->activityResultCaller:Lu5;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->statusBarColor:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentOptionCallback:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 8

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$1;

    invoke-direct {v5, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$1;-><init>(Landroidx/activity/ComponentActivity;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 8

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentResultCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$2;

    invoke-direct {v5, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory$2;-><init>(Landroidx/fragment/app/Fragment;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;-><init>(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    return-void
.end method


# virtual methods
.method public final create()Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;
    .locals 7

    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->Companion:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->viewModelStoreOwner:LXr6;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->lifecycleOwner:LLifecycleOwner;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->activityResultCaller:Lu5;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->statusBarColor:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentOptionCallback:Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;->paymentResultCallback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;->getInstance(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object v0

    return-object v0
.end method
