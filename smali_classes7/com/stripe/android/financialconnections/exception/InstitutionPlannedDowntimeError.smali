.class public final Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "allowManualEntry",
        "",
        "isToday",
        "backUpAt",
        "",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V",
        "getAllowManualEntry",
        "()Z",
        "getBackUpAt",
        "()J",
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

.field private final backUpAt:J

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final isToday:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "InstitutionPlannedDowntimeError"

    invoke-direct {p0, v0, p6}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->allowManualEntry:Z

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->isToday:Z

    iput-wide p4, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->backUpAt:J

    return-void
.end method


# virtual methods
.method public final getAllowManualEntry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->allowManualEntry:Z

    return v0
.end method

.method public final getBackUpAt()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->backUpAt:J

    return-wide v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final isToday()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->isToday:Z

    return v0
.end method
