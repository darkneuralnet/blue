.class public final Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "allowManualEntry",
        "",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V",
        "getAllowManualEntry",
        "()Z",
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

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "InstitutionUnplannedDowntimeError"

    invoke-direct {p0, v0, p3}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->allowManualEntry:Z

    return-void
.end method


# virtual methods
.method public final getAllowManualEntry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->allowManualEntry:Z

    return v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method
