.class public final Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "applicationId",
        "",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "getRepository",
        "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "allowManualEntry",
        "",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toDomainException",
        "Lcom/stripe/android/core/exception/StripeException;",
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
.field private final applicationId:Ljava/lang/String;

.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->applicationId:Ljava/lang/String;

    return-void
.end method

.method private final toDomainException(Lcom/stripe/android/core/exception/StripeException;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/core/exception/StripeException;
    .locals 8

    invoke-virtual {p1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v3, "institution_unavailable"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "expected_to_be_available_at"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    :cond_1
    const-string v0, "true"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_4

    new-instance v0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;

    invoke-direct {v0, p3, p2, p1}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V

    goto :goto_3

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;

    const/4 v4, 0x1

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    sget-object v3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v2, v3}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v5

    move-object v1, v0

    move-object v2, p3

    move v3, p2

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V

    :goto_3
    move-object p1, v0

    :cond_5
    return-object p1
.end method


# virtual methods
.method public final getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object v0
.end method

.method public final getRepository()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p2, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->applicationId:Ljava/lang/String;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->Z$0:Z

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    invoke-interface {p3, v2, v4, p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->postAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    :try_end_2
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p3

    :catch_1
    move-exception p3

    move-object v0, p0

    :goto_2
    invoke-direct {v0, p3, p2, p1}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->toDomainException(Lcom/stripe/android/core/exception/StripeException;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
