.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\u0012\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0015J\u0012\u0010\u0019\u001a\u00020\u000c2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\u000c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0008\u0010\u001e\u001a\u00020\u000cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "args",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "viewModel",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "finish",
        "",
        "finishWithResult",
        "result",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
        "onActivityResult",
        "requestCode",
        "",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onGooglePayResult",
        "payWithGoogle",
        "task",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/wallet/PaymentData;",
        "setFadeAnimations",
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
        "SMAP\nGooglePayLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n75#2,13:189\n1#3:202\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherActivity\n*L\n36#1:189,13\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;

.field private static final LOAD_PAYMENT_DATA_REQUEST_CODE:I = 0x115c
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$viewModel$2;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V

    new-instance v1, Landroidx/lifecycle/t;

    const-class v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    new-instance v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$3;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/t;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$payWithGoogle(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->payWithGoogle(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "extra_result"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finish()V

    return-void
.end method

.method private final getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    return-object v0
.end method

.method private static final onCreate$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final onGooglePayResult(Landroid/content/Intent;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/wallet/PaymentData;->s(Landroid/content/Intent;)Lcom/google/android/gms/wallet/PaymentData;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Google Pay data was not available"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void

    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentData;->u()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-virtual {p1, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createFromGooglePay(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/view/AuthActivityStarterHost;->Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    invoke-virtual {v1, p0}, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;->create$payments_core_release(Landroidx/activity/ComponentActivity;)Lcom/stripe/android/view/AuthActivityStarterHost;

    move-result-object v1

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onGooglePayResult$1;

    invoke-direct {v5, p0, v1, p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onGooglePayResult$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final payWithGoogle(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x115c

    invoke-static {p1, p0, v0}, Lat;->c(Lcom/google/android/gms/tasks/Task;Landroid/app/Activity;I)V

    return-void
.end method

.method private final setFadeAnimations()V
    .locals 2

    sget-object v0, Lcom/stripe/android/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/utils/AnimationConstants;

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_IN()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/utils/AnimationConstants;->getFADE_OUT()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->onCreate$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->setFadeAnimations()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x115c

    const/4 v1, 0x0

    if-ne p1, v0, :cond_5

    const/4 p1, -0x1

    if-eq p2, p1, :cond_4

    if-eqz p2, :cond_3

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    new-instance p3, Ljava/lang/RuntimeException;

    const-string v0, "Google Pay returned an expected result code."

    invoke-direct {p3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lat;->a(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    new-instance p3, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Google Pay failed with error: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;

    invoke-virtual {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->onGooglePayResult(Landroid/content/Intent;)V

    goto :goto_0

    :cond_5
    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    const/4 p2, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onActivityResult$1;

    invoke-direct {v3, p0, p1, p3, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onActivityResult$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SourceLockedOrientationActivity"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->setFadeAnimations()V

    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;->fromIntent$payments_core_release(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "GooglePayLauncherActivity was started without arguments."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_3

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "extra_status_bar_color"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->getGooglePayResult$payments_core_release()Landroidx/lifecycle/LiveData;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$3;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;)V

    new-instance v1, LhD1;

    invoke-direct {v1, v0}, LhD1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->getViewModel()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->getHasLaunched()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$4;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$onCreate$4;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    invoke-direct {p1, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finishWithResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method
