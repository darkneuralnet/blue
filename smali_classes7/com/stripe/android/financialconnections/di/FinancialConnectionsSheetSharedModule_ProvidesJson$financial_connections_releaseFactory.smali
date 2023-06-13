.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lbi2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory$InstanceHolder;->a()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;

    move-result-object v0

    return-object v0
.end method

.method public static providesJson$financial_connections_release()Lbi2;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->providesJson$financial_connections_release()Lbi2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbi2;

    return-object v0
.end method


# virtual methods
.method public get()Lbi2;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;->providesJson$financial_connections_release()Lbi2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;->get()Lbi2;

    move-result-object v0

    return-object v0
.end method
