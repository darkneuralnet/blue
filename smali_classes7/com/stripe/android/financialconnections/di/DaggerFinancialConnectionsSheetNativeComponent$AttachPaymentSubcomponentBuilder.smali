.class final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AttachPaymentSubcomponentBuilder"
.end annotation


# instance fields
.field private final financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

.field private initialState:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;


# direct methods
.method private constructor <init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LRI0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    const-class v1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentImpl;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentImpl;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;LSI0;)V

    return-object v0
.end method

.method public initialState(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;)Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->initialState:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;

    return-object p0
.end method

.method public bridge synthetic initialState(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;->initialState(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;)Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method
