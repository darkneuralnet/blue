.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements LNN2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0012\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0008\u0010\u0010\u001a\u00020\u0003H\u0016R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00178FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\"\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\r0\r0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\"\u0010!\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\r0\r0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "LNN2;",
        "",
        "Loading",
        "(LEt0;I)V",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "result",
        "finishWithResult",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "onResume",
        "Landroid/content/Intent;",
        "intent",
        "onNewIntent",
        "invalidate",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getViewModel",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "viewModel",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "args$delegate",
        "Lkotlin/properties/ReadOnlyProperty;",
        "getArgs",
        "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "args",
        "LB5;",
        "kotlin.jvm.PlatformType",
        "startBrowserForResult",
        "LB5;",
        "startNativeAuthFlowForResult",
        "<init>",
        "()V",
        "financial-connections_release"
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
        "SMAP\nFinancialConnectionsSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt\n*L\n1#1,129:1\n26#2,11:130\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity\n*L\n33#1:130,11\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final args$delegate:Lkotlin/properties/ReadOnlyProperty;

.field private final startBrowserForResult:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final startNativeAuthFlowForResult:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-string v2, "args"

    const-string v3, "getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;"

    const-class v4, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-class v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;

    invoke-direct {v1, v0, p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$special$$inlined$viewModelLazy$default$1;-><init>(Lkotlin/reflect/KClass;Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-static {}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->argsOrNull()Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->args$delegate:Lkotlin/properties/ReadOnlyProperty;

    new-instance v0, Lz5;

    invoke-direct {v0}, Lz5;-><init>()V

    new-instance v1, Lam1;

    invoke-direct {v1, p0}, Lam1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v0

    const-string v1, "registerForActivityResul\u2026serActivityResult()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startBrowserForResult:LB5;

    new-instance v0, Lz5;

    invoke-direct {v0}, Lz5;-><init>()V

    new-instance v1, Lbm1;

    invoke-direct {v1, p0}, Lbm1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v0

    const-string v1, "registerForActivityResul\u2026eAuthFlowResult(it)\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startNativeAuthFlowForResult:LB5;

    return-void
.end method

.method private final Loading(LEt0;I)V
    .locals 3

    const v0, 0x6e3d91d7

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0x1

    if-nez v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.Loading (FinancialConnectionsSheetActivity.kt:60)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/ComposableSingletons$FinancialConnectionsSheetActivityKt;->INSTANCE:Lcom/stripe/android/financialconnections/ComposableSingletons$FinancialConnectionsSheetActivityKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ComposableSingletons$FinancialConnectionsSheetActivityKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->FinancialConnectionsTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$Loading$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$Loading(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->Loading(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getStartBrowserForResult$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)LB5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startBrowserForResult:LB5;

    return-object p0
.end method

.method public static final synthetic access$getStartNativeAuthFlowForResult$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)LB5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startNativeAuthFlowForResult:LB5;

    return-object p0
.end method

.method private final finishWithResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final startBrowserForResult$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onBrowserActivityResult$financial_connections_release()V

    return-void
.end method

.method private static final startNativeAuthFlowForResult$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onNativeAuthFlowResult$financial_connections_release(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic v(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startNativeAuthFlowForResult$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic w(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->startBrowserForResult$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method


# virtual methods
.method public collectLatest(LEu1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LNN2$a;->a(LNN2;LEu1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public final getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->args$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    return-object v0
.end method

.method public getMavericksViewInternalViewModel()LON2;
    .locals 1

    invoke-static {p0}, LNN2$a;->b(LNN2;)LON2;

    move-result-object v0

    return-object v0
.end method

.method public getMvrxViewId()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LNN2$a;->c(LNN2;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubscriptionLifecycleOwner()LLifecycleOwner;
    .locals 1

    invoke-static {p0}, LNN2$a;->d(LNN2;)LLifecycleOwner;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    return-object v0
.end method

.method public invalidate()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$invalidate$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    invoke-static {v0, v1}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public onAsync(LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+",
            "Ldp<",
            "+TT;>;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, LNN2$a;->e(LNN2;LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;

    invoke-direct {v5, p0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LNN2$a;->n(LNN2;LRN2;La01;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onActivityRecreated$financial_connections_release()V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v2

    const-string p1, "onBackPressedDispatcher"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$2;

    invoke-direct {v5, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$2;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lbf3;->b(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LVe3;

    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$3;

    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$onCreate$3;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;)V

    const v0, 0x360c7b6b

    const/4 v2, 0x1

    invoke-static {v0, v2, p1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p1

    invoke-static {p0, v1, p1, v2, v1}, LMs0;->b(Landroidx/activity/ComponentActivity;LYt0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public onEach(LRN2;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            ">(",
            "LRN2<",
            "TS;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TS;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LNN2$a;->f(LNN2;LRN2;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TA;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, LNN2$a;->g(LNN2;LRN2;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function2;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function3;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function3<",
            "-TA;-TB;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, LNN2$a;->h(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function3;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function4<",
            "-TA;-TB;-TC;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p6}, LNN2$a;->i(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function5;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function5<",
            "-TA;-TB;-TC;-TD;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p7}, LNN2$a;->j(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function5;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function6;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function6<",
            "-TA;-TB;-TC;-TD;-TE;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p8}, LNN2$a;->k(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function6;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function7;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TF;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function7<",
            "-TA;-TB;-TC;-TD;-TE;-TF;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p9}, LNN2$a;->l(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function7;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onEach(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function8;)Lzh2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            "F:",
            "Ljava/lang/Object;",
            "G:",
            "Ljava/lang/Object;",
            ">(",
            "LRN2<",
            "TS;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TB;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TC;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TD;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TE;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TF;>;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TG;>;",
            "La01;",
            "Lkotlin/jvm/functions/Function8<",
            "-TA;-TB;-TC;-TD;-TE;-TF;-TG;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    invoke-static/range {p0 .. p10}, LNN2$a;->m(LNN2;LRN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function8;)Lzh2;

    move-result-object p1

    return-object p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->handleOnNewIntent$financial_connections_release(Landroid/content/Intent;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onResume$financial_connections_release()V

    return-void
.end method

.method public postInvalidate()V
    .locals 0

    invoke-static {p0}, LNN2$a;->o(LNN2;)V

    return-void
.end method

.method public uniqueOnly(Ljava/lang/String;)LRd6;
    .locals 0

    invoke-static {p0, p1}, LNN2$a;->p(LNN2;Ljava/lang/String;)LRd6;

    move-result-object p1

    return-object p1
.end method
