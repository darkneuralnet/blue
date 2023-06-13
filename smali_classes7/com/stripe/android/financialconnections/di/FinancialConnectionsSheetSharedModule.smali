.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u00082\u00103J%\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u000c\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J:\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0007J\u0008\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0007J\u0017\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020\'H\u0001\u00a2\u0006\u0004\u0008*\u0010+J!\u00101\u001a\u00020.2\u0006\u0010-\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008/\u00100\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;",
        "",
        "",
        "publishableKey",
        "stripeAccountId",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "providesApiOptions$financial_connections_release",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "providesApiOptions",
        "Lbi2;",
        "providesJson$financial_connections_release",
        "()Lbi2;",
        "providesJson",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "provideStripeNetworkClient",
        "Landroid/app/Application;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Ljava/util/Locale;",
        "locale",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "configuration",
        "stripeNetworkClient",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "providesAnalyticsTracker",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "providesApiRequestFactory",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "provideConnectionsRepository",
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;",
        "defaultFinancialConnectionsEventReporter",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "provideEventReporter",
        "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
        "executor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "providesAnalyticsRequestExecutor$financial_connections_release",
        "(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "providesAnalyticsRequestExecutor",
        "application",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "provideAnalyticsRequestFactory$financial_connections_release",
        "(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "provideAnalyticsRequestFactory",
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->provideAnalyticsRequestFactory$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final provideAnalyticsRequestFactory$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "$publishableKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final provideAnalyticsRequestFactory$financial_connections_release(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    sget-object v2, Lcom/stripe/android/core/utils/ContextUtils;->INSTANCE:Lcom/stripe/android/core/utils/ContextUtils;

    invoke-virtual {v2, p1}, Lcom/stripe/android/core/utils/ContextUtils;->getPackageInfo(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    new-instance v2, Lim1;

    invoke-direct {v2, p2}, Lim1;-><init>(Ljava/lang/String;)V

    new-instance p2, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    invoke-direct {p2, v0, p1, v1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;LY94;)V

    return-object p2
.end method

.method public final provideConnectionsRepository(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final provideEventReporter(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "defaultFinancialConnectionsEventReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final provideStripeNetworkClient(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/core/networking/StripeNetworkClient;
    .locals 9
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final providesAnalyticsRequestExecutor$financial_connections_release(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "executor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final providesAnalyticsTracker(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/GetManifest;Ljava/util/Locale;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/networking/StripeNetworkClient;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    move-object v5, p4

    new-instance p4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    const-string v0, "locale ?: Locale.getDefault()"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p4

    move-object v1, p6

    move-object v2, p3

    move-object v3, p5

    move-object v4, p2

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Landroid/content/Context;)V

    return-object p4
.end method

.method public final providesApiOptions$financial_connections_release(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final providesApiRequestFactory()Lcom/stripe/android/core/networking/ApiRequest$Factory;
    .locals 7
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v6, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    const/4 v1, 0x0

    new-instance v0, Lcom/stripe/android/core/ApiVersion;

    const-string v2, "financial_connections_client_api_beta=v1"

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/stripe/android/core/ApiVersion;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final providesJson$financial_connections_release()Lbi2;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LJi2;->b(Lbi2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lbi2;

    move-result-object v0

    return-object v0
.end method
