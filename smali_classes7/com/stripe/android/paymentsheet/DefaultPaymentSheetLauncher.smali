.class public final Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001%B%\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u0019\u0008\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eB\u0019\u0008\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u0018\u0010!B!\u0008\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u0018\u0010$J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000c8\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u0012\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "mode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "configuration",
        "",
        "present",
        "LB5;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "activityResultLauncher",
        "LB5;",
        "",
        "injectorKey",
        "Ljava/lang/String;",
        "getInjectorKey$annotations",
        "()V",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;",
        "paymentSheetLauncherComponent",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(LB5;LLifecycleOwner;Landroid/app/Application;)V",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "callback",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "Landroidx/activity/result/ActivityResultRegistry;",
        "registry",
        "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "Injector",
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
.field private final activityResultLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final injectorKey:Ljava/lang/String;

.field private final paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;


# direct methods
.method public constructor <init>(LB5;LLifecycleOwner;Landroid/app/Application;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;",
            "LLifecycleOwner;",
            "Landroid/app/Application;",
            ")V"
        }
    .end annotation

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "application"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activityResultLauncher:LB5;

    sget-object p1, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->INSTANCE:Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->nextKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->injectorKey:Ljava/lang/String;

    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent;->builder()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;

    move-result-object v1

    invoke-interface {v1, p3}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3, v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;->injectorKey(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;

    move-result-object p3

    invoke-interface {p3}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;->build()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->paymentSheetLauncherComponent:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;

    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;

    invoke-direct {v1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;-><init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;)V

    invoke-virtual {p1, v1, v0}, Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;->register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V

    invoke-interface {p2}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;-><init>()V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    new-instance v1, LoY0;

    invoke-direct {v1, p2}, LoY0;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p2

    const-string v0, "activity.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "activity.application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1, v0}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(LB5;LLifecycleOwner;Landroid/app/Application;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    new-instance v1, LpY0;

    invoke-direct {v1, p3}, LpY0;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, p2, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Landroidx/activity/result/ActivityResultRegistry;Lt5;)LB5;

    move-result-object p2

    const-string p3, "fragment.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p3

    const-string v0, "fragment.requireActivity().application"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(LB5;LLifecycleOwner;Landroid/app/Application;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    new-instance v1, LnY0;

    invoke-direct {v1, p2}, LnY0;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p2

    const-string v0, "fragment.registerForActi\u2026SheetResult(it)\n        }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "fragment.requireActivity().application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1, v0}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(LB5;LLifecycleOwner;Landroid/app/Application;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$2(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic b(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method private static synthetic getInjectorKey$annotations()V
    .locals 0
    .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
    .end annotation

    return-void
.end method


# virtual methods
.method public present(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 8

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->injectorKey:Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activityResultLauncher:LB5;

    invoke-virtual {p1, v0}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method
