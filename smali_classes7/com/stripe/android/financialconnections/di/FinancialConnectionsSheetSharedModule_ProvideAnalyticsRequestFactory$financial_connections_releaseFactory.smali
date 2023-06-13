.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->applicationProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->publishableKeyProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static provideAnalyticsRequestFactory$financial_connections_release(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->provideAnalyticsRequestFactory$financial_connections_release(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->applicationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->publishableKeyProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->provideAnalyticsRequestFactory$financial_connections_release(Landroid/app/Application;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory;->get()Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    move-result-object v0

    return-object v0
.end method
