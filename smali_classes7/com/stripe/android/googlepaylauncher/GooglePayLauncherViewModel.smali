.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$WhenMappings;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0000\u0018\u0000 N2\u00020\u0001:\u0002NOBG\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008L\u0010MJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0008J#\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J#\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R(\u0010B\u001a\u0010\u0012\u000c\u0012\n A*\u0004\u0018\u00010\u00020\u00020@8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER$\u0010K\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010J\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
        "LOr6;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
        "result",
        "",
        "updateResult",
        "",
        "isReadyToPay",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "args",
        "Lorg/json/JSONObject;",
        "createPaymentDataRequest",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "",
        "currencyCode",
        "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;",
        "createTransactionInfo$payments_core_release",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;",
        "createTransactionInfo",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/wallet/PaymentData;",
        "createLoadPaymentDataTask",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "host",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "params",
        "confirmStripeIntent",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "requestCode",
        "Landroid/content/Intent;",
        "data",
        "onConfirmResult",
        "getResultFromConfirmation$payments_core_release",
        "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getResultFromConfirmation",
        "LEP3;",
        "paymentsClient",
        "LEP3;",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "Lcom/stripe/android/PaymentController;",
        "paymentController",
        "Lcom/stripe/android/PaymentController;",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "googlePayJsonFactory",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "googlePayRepository",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "LuX2;",
        "_googleResult",
        "LuX2;",
        "Landroidx/lifecycle/LiveData;",
        "kotlin.jvm.PlatformType",
        "googlePayResult",
        "Landroidx/lifecycle/LiveData;",
        "getGooglePayResult$payments_core_release",
        "()Landroidx/lifecycle/LiveData;",
        "value",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "hasLaunched",
        "<init>",
        "(LEP3;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/p;)V",
        "Companion",
        "Factory",
        "payments-core_release"
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
        "SMAP\nGooglePayLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n+ 2 Transformations.kt\nandroidx/lifecycle/TransformationsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n92#2:294\n1#3:295\n*S KotlinDebug\n*F\n+ 1 GooglePayLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel\n*L\n62#1:294\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

.field public static final HAS_LAUNCHED_KEY:Ljava/lang/String; = "has_launched"


# instance fields
.field private final _googleResult:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

.field private final googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

.field private final googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

.field private final googlePayResult:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentController:Lcom/stripe/android/PaymentController;

.field private final paymentsClient:LEP3;

.field private final requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;

    return-void
.end method

.method public constructor <init>(LEP3;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/p;)V
    .locals 1

    const-string v0, "paymentsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentController"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayJsonFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentsClient:LEP3;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iput-object p4, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p5, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iput-object p6, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    iput-object p7, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    iput-object p8, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:LuX2;

    invoke-static {p1}, Lu96;->a(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    const-string p2, "distinctUntilChanged(this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayResult:Landroidx/lifecycle/LiveData;

    return-void
.end method

.method public static final synthetic access$get_googleResult$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)LuX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:LuX2;

    return-object p0
.end method


# virtual methods
.method public final confirmStripeIntent(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    if-eqz v2, :cond_0

    sget-object v3, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xfc

    const/4 v13, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v3 .. v13}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createWithPaymentMethodCreateParams$default(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    if-eqz v2, :cond_2

    sget-object v3, Lcom/stripe/android/model/ConfirmSetupIntentParams;->Companion:Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;->create$default(Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object v1

    :goto_0
    iget-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iget-object v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object v4, p1

    move-object/from16 v5, p3

    invoke-interface {v2, p1, v1, v3, v5}, Lcom/stripe/android/PaymentController;->startConfirmAndAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final createLoadPaymentDataTask(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    check-cast v0, LEP3;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->label:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->isReadyToPay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentsClient:LEP3;

    iget-object v4, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iput-object p1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createLoadPaymentDataTask$1;->label:I

    invoke-virtual {v2, v4, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createPaymentDataRequest(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_2
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/wallet/PaymentDataRequest;->s(Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentDataRequest;

    move-result-object p1

    invoke-virtual {v0, p1}, LEP3;->j(Lcom/google/android/gms/wallet/PaymentDataRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "paymentsClient.loadPayme\u2026)\n            )\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Google Pay is unavailable."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final createPaymentDataRequest(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lorg/json/JSONObject;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    iget v4, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v3

    iget-object v2, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v12, :cond_2

    if-ne v4, v11, :cond_1

    iget-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iget-object v3, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    iget-object v3, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    if-eqz v2, :cond_7

    iget-object v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    iput-object v0, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    iput v12, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository;->retrievePaymentIntent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    :cond_4
    move-object v3, v0

    :goto_1
    if-eqz v2, :cond_6

    check-cast v2, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v4, ""

    :cond_5
    invoke-virtual {v3, v2, v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    move-result-object v2

    goto :goto_3

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Could not retrieve PaymentIntent."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    instance-of v2, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    if-eqz v2, :cond_c

    iget-object v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    iput-object v0, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$0:Ljava/lang/Object;

    iput-object v1, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->L$1:Ljava/lang/Object;

    iput v11, v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$createPaymentDataRequest$1;->label:I

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/networking/StripeRepository;->retrieveSetupIntent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    return-object v3

    :cond_8
    move-object v3, v0

    :goto_2
    if-eqz v2, :cond_b

    check-cast v2, Lcom/stripe/android/model/SetupIntent;

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getCurrencyCode$payments_core_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    move-result-object v2

    :goto_3
    move-object v13, v3

    move-object v3, v2

    move-object v2, v13

    iget-object v2, v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    new-instance v7, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v7, v4}, Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;-><init>(Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->isRequired$payments_core_release()Z

    move-result v5

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->getFormat$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;

    move-result-object v6

    sget-object v8, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v8, v6

    if-eq v6, v12, :cond_a

    if-ne v6, v11, :cond_9

    sget-object v6, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Full:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    goto :goto_4

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    sget-object v6, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;->Min:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;

    :goto_4
    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;->isPhoneNumberRequired$payments_core_release()Z

    move-result v8

    invoke-direct {v4, v5, v6, v8}, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;-><init>(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->isEmailRequired()Z

    move-result v6

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getAllowCreditCards()Z

    move-result v1

    const/4 v5, 0x0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v8

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v2 .. v10}, Lcom/stripe/android/GooglePayJsonFactory;->createPaymentDataRequest$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;Ljava/lang/Boolean;ILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    return-object v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Could not retrieve SetupIntent."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final createTransactionInfo$payments_core_release(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;
    .locals 11

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currencyCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    sget-object v3, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v5

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-int p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v6, p1

    const/4 v7, 0x0

    sget-object v8, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;->CompleteImmediatePurchase:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p2

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;-><init>(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;

    sget-object v3, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Estimated:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->args:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;->getConfig$payments_core_release()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;->getMerchantCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v5

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    sget-object v8, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;->Default:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p2

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;-><init>(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getGooglePayResult$payments_core_release()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayResult:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getHasLaunched()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getResultFromConfirmation$payments_core_release(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_2
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {p3, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandlePaymentResult(ILandroid/content/Intent;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iput v4, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/PaymentController;->getPaymentIntentResult(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;

    goto :goto_3

    :cond_5
    iget-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    invoke-interface {p3, p1, p2}, Lcom/stripe/android/PaymentController;->shouldHandleSetupResult(ILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->paymentController:Lcom/stripe/android/PaymentController;

    iput v3, v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$getResultFromConfirmation$1;->label:I

    invoke-interface {p1, p2, v0}, Lcom/stripe/android/PaymentController;->getSetupIntentResult(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;

    :goto_3
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected confirmation result."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_5

    :cond_8
    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    invoke-direct {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    :goto_5
    return-object p1
.end method

.method public final isReadyToPay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->googlePayRepository:Lcom/stripe/android/googlepaylauncher/GooglePayRepository;

    invoke-interface {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->isReady()LEu1;

    move-result-object v0

    invoke-static {v0, p1}, LVu1;->w(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onConfirmResult(ILandroid/content/Intent;)V
    .locals 7

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$onConfirmResult$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$onConfirmResult$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final setHasLaunched(Z)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final updateResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->_googleResult:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
