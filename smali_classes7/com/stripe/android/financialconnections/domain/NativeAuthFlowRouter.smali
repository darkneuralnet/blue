.class public final Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
        "",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "debugConfiguration",
        "Lcom/stripe/android/financialconnections/debug/DebugConfiguration;",
        "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V",
        "logExposure",
        "",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "nativeAuthFlowEnabled",
        "",
        "nativeKillSwitchActive",
        "Companion",
        "financial-connections_release"
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
        "SMAP\nNativeAuthFlowRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n1#2:51\n187#3,3:52\n*S KotlinDebug\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n*L\n41#1:52,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

.field private static final EXPERIMENT_VALUE_NATIVE_TREATMENT:Ljava/lang/String; = "treatment"

.field private static final FEATURE_KEY_NATIVE_KILLSWITCH:Ljava/lang/String; = "bank_connections_mobile_native_version_killswitch"


# instance fields
.field private final debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->Companion:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V
    .locals 1

    const-string v0, "eventTracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    return-void
.end method

.method private final nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 5

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getFeatures()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "bank_connections_mobile_native_version_killswitch"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v0

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    :cond_4
    :goto_1
    return v0
.end method


# virtual methods
.method public final logExposure(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/debug/DebugConfiguration;->getOverridenNative$financial_connections_release()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    sget-object v1, Lcom/stripe/android/financialconnections/utils/Experiment;->CONNECTIONS_MOBILE_NATIVE:Lcom/stripe/android/financialconnections/utils/Experiment;

    invoke-static {v0, v1, p1, p2}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->trackExposure(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/Experiment;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final nativeAuthFlowEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 2

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/debug/DebugConfiguration;->getOverridenNative$financial_connections_release()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    sget-object v1, Lcom/stripe/android/financialconnections/utils/Experiment;->CONNECTIONS_MOBILE_NATIVE:Lcom/stripe/android/financialconnections/utils/Experiment;

    invoke-static {p1, v1}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->experimentAssignment(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/utils/Experiment;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "treatment"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
