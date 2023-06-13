.class public final Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/analytics/EventReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B1\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u0014H\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\u0008\u0010 \u001a\u0004\u0018\u00010!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010#\u001a\u00020\u00142\u0008\u0010 \u001a\u0004\u0018\u00010!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "mode",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "eventTimeProvider",
        "Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)V",
        "paymentSheetShownMillis",
        "",
        "Ljava/lang/Long;",
        "durationMillisFrom",
        "start",
        "(Ljava/lang/Long;)Ljava/lang/Long;",
        "fireEvent",
        "",
        "event",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "onAutofill",
        "type",
        "",
        "onDismiss",
        "onInit",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "onLpmSpecFailure",
        "onPaymentFailure",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "currency",
        "onPaymentSuccess",
        "onSelectPaymentOption",
        "onShowExistingPaymentOptions",
        "linkEnabled",
        "",
        "activeLinkSession",
        "onShowNewPaymentOptionForm",
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
        "SMAP\nDefaultEventReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEventReporter.kt\ncom/stripe/android/paymentsheet/analytics/DefaultEventReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"
    }
.end annotation


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final eventTimeProvider:Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

.field private final mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private paymentSheetShownMillis:Ljava/lang/Long;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTimeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->eventTimeProvider:Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method private final durationMillisFrom(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->eventTimeProvider:Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method private final fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireEvent$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public onAutofill(Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$AutofillEvent;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onDismiss()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onInit(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onLpmSpecFailure()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$LpmSerializeFailureEvent;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentFailure(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V
    .locals 7

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentSheetShownMillis:Ljava/lang/Long;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationMillisFrom(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v3

    sget-object v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;->Failure:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;

    new-instance v6, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;

    move-object v0, v6

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Ljava/lang/Long;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-direct {p0, v6}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V
    .locals 6

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->isGooglePay$paymentsheet_release()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    if-eqz v1, :cond_2

    sget-object p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    :cond_2
    move-object v4, p1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentSheetShownMillis:Ljava/lang/Long;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->durationMillisFrom(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v3

    sget-object v2, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;->Success:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;

    new-instance p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Ljava/lang/Long;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onSelectPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V
    .locals 2

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1, p1, p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowExistingPaymentOptions(ZZLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->eventTimeProvider:Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentSheetShownMillis:Ljava/lang/Long;

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;ZZLjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method

.method public onShowNewPaymentOptionForm(ZZLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->eventTimeProvider:Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->paymentSheetShownMillis:Ljava/lang/Long;

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->mode:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;ZZLjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;->fireEvent(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;)V

    return-void
.end method
