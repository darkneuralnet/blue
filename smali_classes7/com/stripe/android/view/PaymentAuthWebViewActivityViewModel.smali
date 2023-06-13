.class public final Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;,
        Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u0008\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001a\u001a\u0004\u0008#\u0010\u001cR\u0014\u0010\'\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0014\u0010+\u001a\u00020(8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;",
        "LOr6;",
        "Lcom/stripe/android/core/networking/AnalyticsRequest;",
        "request",
        "",
        "fireAnalytics",
        "logStart",
        "logError",
        "logComplete",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "args",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "",
        "",
        "extraHeaders$delegate",
        "Lkotlin/Lazy;",
        "getExtraHeaders",
        "()Ljava/util/Map;",
        "extraHeaders",
        "buttonText",
        "Ljava/lang/String;",
        "getButtonText$payments_core_release",
        "()Ljava/lang/String;",
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;",
        "toolbarTitle",
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;",
        "getToolbarTitle$payments_core_release",
        "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;",
        "toolbarBackgroundColor",
        "getToolbarBackgroundColor$payments_core_release",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "getPaymentResult$payments_core_release",
        "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "paymentResult",
        "Landroid/content/Intent;",
        "getCancellationResult$payments_core_release",
        "()Landroid/content/Intent;",
        "cancellationResult",
        "<init>",
        "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V",
        "Factory",
        "ToolbarTitleData",
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
        "SMAP\nPaymentAuthWebViewActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivityViewModel.kt\ncom/stripe/android/view/PaymentAuthWebViewActivityViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
    }
.end annotation


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

.field private final synthetic buttonText:Ljava/lang/String;

.field private final extraHeaders$delegate:Lkotlin/Lazy;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final synthetic toolbarBackgroundColor:Ljava/lang/String;

.field private final synthetic toolbarTitle:Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;


# direct methods
.method public constructor <init>(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V
    .locals 4

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    iput-object p2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object p2, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$extraHeaders$2;->INSTANCE:Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$extraHeaders$2;

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->extraHeaders$delegate:Lkotlin/Lazy;

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;->getButtonText()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, p3

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v0

    :goto_1
    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, v1

    :goto_2
    iput-object p2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->buttonText:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;->getHeaderText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    move p3, v0

    :cond_4
    if-nez p3, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_6

    new-instance p3, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;

    const-string v0, "it"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v2, p2}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V

    goto :goto_4

    :cond_6
    move-object p3, v1

    :goto_4
    iput-object p3, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->toolbarTitle:Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;

    invoke-virtual {p1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;->getBackgroundColor()Ljava/lang/String;

    move-result-object v1

    :cond_7
    iput-object v1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->toolbarBackgroundColor:Ljava/lang/String;

    return-void
.end method

.method private final fireAnalytics(Lcom/stripe/android/core/networking/AnalyticsRequest;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method


# virtual methods
.method public final getButtonText$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic getCancellationResult$payments_core_release()Landroid/content/Intent;
    .locals 11

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getShouldCancelIntentOnUserNavigation()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x3

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :goto_0
    const/4 v4, 0x0

    iget-object v5, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v5}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getShouldCancelSource()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x75

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->copy$default(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->toBundle()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Intent().putExtras(\n    \u2026.toBundle()\n            )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getExtraHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->extraHeaders$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final synthetic getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;
    .locals 11

    new-instance v10, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v5, v0

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->args:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x2e

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10
.end method

.method public final getToolbarBackgroundColor$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->toolbarBackgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getToolbarTitle$payments_core_release()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->toolbarTitle:Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;

    return-object v0
.end method

.method public final logComplete()V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->fireAnalytics(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method public final logError()V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->fireAnalytics(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method public final logStart()V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->fireAnalytics(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    iget-object v1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->fireAnalytics(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method
