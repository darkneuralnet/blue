.class public final synthetic Lgm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm1;->b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lgm1;->b:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->a(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method
