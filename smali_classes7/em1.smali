.class public final synthetic Lem1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lem1;->b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lem1;->b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;->b(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V

    return-void
.end method
