.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final getManifestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;"
        }
    .end annotation
.end field

.field private final localeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeNetworkClientProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->contextProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->loggerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->getManifestProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->localeProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->configurationProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->stripeNetworkClientProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
            ">;)",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static providesAnalyticsTracker(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/GetManifest;Ljava/util/Locale;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/networking/StripeNetworkClient;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 7

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->providesAnalyticsTracker(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/GetManifest;Ljava/util/Locale;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/networking/StripeNetworkClient;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Application;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->getManifestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->localeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Locale;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->configurationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->stripeNetworkClientProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/core/networking/StripeNetworkClient;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->providesAnalyticsTracker(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/GetManifest;Ljava/util/Locale;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/networking/StripeNetworkClient;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->get()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    return-object v0
.end method
