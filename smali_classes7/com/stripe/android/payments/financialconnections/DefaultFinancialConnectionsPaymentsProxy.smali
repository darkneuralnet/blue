.class public final Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;",
        "financialConnectionsSheet",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;)V",
        "present",
        "",
        "financialConnectionsSessionClientSecret",
        "",
        "publishableKey",
        "stripeAccountId",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final financialConnectionsSheet:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;)V
    .locals 1

    const-string v0, "financialConnectionsSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;->financialConnectionsSheet:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    return-void
.end method


# virtual methods
.method public present(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "financialConnectionsSessionClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/financialconnections/DefaultFinancialConnectionsPaymentsProxy;->financialConnectionsSheet:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-direct {v1, p1, p2, p3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void
.end method
