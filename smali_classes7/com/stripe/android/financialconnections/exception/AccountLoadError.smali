.class public final Lcom/stripe/android/financialconnections/exception/AccountLoadError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/AccountLoadError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "allowManualEntry",
        "",
        "canRetry",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V",
        "getAllowManualEntry",
        "()Z",
        "getCanRetry",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
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
.field private final allowManualEntry:Z

.field private final canRetry:Z

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;


# direct methods
.method public constructor <init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AccountLoadError"

    invoke-direct {p0, v0, p4}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->allowManualEntry:Z

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->canRetry:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-void
.end method


# virtual methods
.method public final getAllowManualEntry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->allowManualEntry:Z

    return v0
.end method

.method public final getCanRetry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->canRetry:Z

    return v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method
