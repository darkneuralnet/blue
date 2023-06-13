.class public final Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/analytics/LinkEventsReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000fH\u0002J\u0008\u0010\u001a\u001a\u00020\u0015H\u0016J\u0008\u0010\u001b\u001a\u00020\u0015H\u0016J\u0008\u0010\u001c\u001a\u00020\u0015H\u0016J\u0008\u0010\u001d\u001a\u00020\u0015H\u0016J\u0008\u0010\u001e\u001a\u00020\u0015H\u0016J\u0008\u0010\u001f\u001a\u00020\u0015H\u0016J\u0008\u0010 \u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0008\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V",
        "signupStartMillis",
        "",
        "Ljava/lang/Long;",
        "durationInSecondsFromStart",
        "",
        "",
        "",
        "start",
        "(Ljava/lang/Long;)Ljava/util/Map;",
        "fireEvent",
        "",
        "event",
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "additionalParams",
        "",
        "on2FACancel",
        "on2FAComplete",
        "on2FAFailure",
        "on2FAStart",
        "on2FAStartFailure",
        "onAccountLookupFailure",
        "onInlineSignupCheckboxChecked",
        "onSignupCompleted",
        "isInline",
        "",
        "onSignupFailure",
        "onSignupFlowPresented",
        "onSignupStarted",
        "link_release"
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
        "SMAP\nDefaultLinkEventsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLinkEventsReporter.kt\ncom/stripe/android/link/analytics/DefaultLinkEventsReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
    }
.end annotation


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private signupStartMillis:Ljava/lang/Long;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p3, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p4, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method private final durationInSecondsFromStart(Ljava/lang/Long;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

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

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    long-to-float p1, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string v0, "duration"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private final fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/analytics/LinkEvent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {p1}, Lcom/stripe/android/core/networking/AnalyticsEvent;->getEventName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Link event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$fireEvent$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$fireEvent$1;-><init>(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static synthetic fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public on2FACancel()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAComplete()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAFailure()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAStart()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public on2FAStartFailure()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onAccountLookupFailure()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onInlineSignupCheckboxChecked()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onSignupCompleted(Z)V
    .locals 1

    sget-object p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;

    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->signupStartMillis:Ljava/lang/Long;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->durationInSecondsFromStart(Ljava/lang/Long;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent(Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->signupStartMillis:Ljava/lang/Long;

    return-void
.end method

.method public onSignupFailure(Z)V
    .locals 2

    sget-object p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onSignupFlowPresented()V
    .locals 3

    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public onSignupStarted(Z)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->signupStartMillis:Ljava/lang/Long;

    sget-object p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;->fireEvent$default(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;Lcom/stripe/android/link/analytics/LinkEvent;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
