.class public final Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "allowManualEntry",
        "",
        "accountsCount",
        "",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "merchantName",
        "",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "(ZILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V",
        "getAccountsCount",
        "()I",
        "getAllowManualEntry",
        "()Z",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getMerchantName",
        "()Ljava/lang/String;",
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


# instance fields
.field private final accountsCount:I

.field private final allowManualEntry:Z

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final merchantName:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AccountNoneEligibleForPaymentMethodError"

    invoke-direct {p0, v0, p5}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->allowManualEntry:Z

    iput p2, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->accountsCount:I

    iput-object p3, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->merchantName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAccountsCount()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->accountsCount:I

    return v0
.end method

.method public final getAllowManualEntry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->allowManualEntry:Z

    return v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->merchantName:Ljava/lang/String;

    return-object v0
.end method
