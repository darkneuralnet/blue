.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;
.super Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
        "Lcom/stripe/android/model/StripeIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J+\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0008\u0010\u0011\u001a\u00020\u0008H\u0016R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "host",
        "authenticatable",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "requestOptions",
        "",
        "performAuthentication",
        "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lu5;",
        "activityResultCaller",
        "Lt5;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "activityResultCallback",
        "onNewActivityResultCaller",
        "onLauncherInvalidated",
        "LB5;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
        "pollingLauncher",
        "LB5;",
        "<init>",
        "()V",
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
.field private pollingLauncher:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;-><init>()V

    return-void
.end method


# virtual methods
.method public onLauncherInvalidated()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;->pollingLauncher:LB5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB5;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;->pollingLauncher:LB5;

    return-void
.end method

.method public onNewActivityResultCaller(Lu5;Lt5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu5;",
            "Lt5<",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lu5;->registerForActivityResult(Lv5;Lt5;)LB5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;->pollingLauncher:LB5;

    return-void
.end method

.method public performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/view/AuthActivityStarterHost;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x12c

    const/4 v4, 0x5

    const/16 v5, 0xc

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;-><init>(Ljava/lang/String;Ljava/lang/Integer;III)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;->pollingLauncher:LB5;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, LB5;->a(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;->performAuthentication(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
