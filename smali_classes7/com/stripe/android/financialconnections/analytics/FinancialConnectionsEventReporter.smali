.class public interface abstract Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "",
        "onPresented",
        "",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "onResult",
        "financialConnectionsSheetResult",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
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


# virtual methods
.method public abstract onPresented(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
.end method

.method public abstract onResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
.end method
