.class final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ManualEntrySubcomponentBuilder"
.end annotation


# instance fields
.field private final financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

.field private initialState:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;


# direct methods
.method private constructor <init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LZI0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    const-class v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentImpl;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentImpl;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;LaJ0;)V

    return-object v0
.end method

.method public initialState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    return-object p0
.end method

.method public bridge synthetic initialState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;->initialState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method
