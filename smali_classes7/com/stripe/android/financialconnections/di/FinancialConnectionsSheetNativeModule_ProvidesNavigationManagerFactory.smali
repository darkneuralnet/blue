.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)V

    return-object v0
.end method

.method public static providesNavigationManager(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)Lcom/stripe/android/financialconnections/navigation/NavigationManager;
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;->providesNavigationManager()Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/navigation/NavigationManager;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;->providesNavigationManager(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;->get()Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    move-result-object v0

    return-object v0
.end method
