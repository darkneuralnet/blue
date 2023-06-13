.class public final Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;-><init>(LZC0;LLifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lu5;Ljava/lang/String;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;LY94;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "onDestroy",
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
.field final synthetic $activityResultCaller:Lu5;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;Lu5;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->$activityResultCaller:Lu5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(LLifecycleOwner;)V
    .locals 7

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$getPaymentLauncherFactory$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$1;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$1;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)V

    new-instance v2, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$2;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-direct {v2, v3}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$2;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)V

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->$activityResultCaller:Lu5;

    new-instance v4, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    new-instance v6, LlX0;

    invoke-direct {v6, v5}, LlX0;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)V

    invoke-interface {v3, v4, v6}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object v3

    const-string v4, "activityResultCaller.reg\u2026                        )"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;->create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/extensions/StripePaymentLauncherKtxKt;->registerPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$setPaymentLauncher$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$getLinkLauncher$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->$activityResultCaller:Lu5;

    new-instance v1, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$5;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1$onCreate$5;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/link/LinkPaymentLauncher;->register(Lu5;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$getPaymentLauncher$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/extensions/StripePaymentLauncherKtxKt;->unregisterPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$setPaymentLauncher$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$1;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;->access$getLinkLauncher$p(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;)Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->unregister()V

    return-void
.end method

.method public bridge synthetic onPause(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onPause(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onResume(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onResume(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onStart(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onStop(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    return-void
.end method
