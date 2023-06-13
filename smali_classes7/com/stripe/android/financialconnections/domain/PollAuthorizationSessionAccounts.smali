.class public final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\u00020\u000f*\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "canRetry",
        "",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toDomainException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "businessName",
        "",
        "allowManualEntry",
        "Companion",
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


# static fields
.field private static final Companion:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;

.field private static final MAX_TRIES:I = 0xa
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final POLLING_TIME_MS:J = 0x7d0L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->Companion:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-void
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    return-object p0
.end method

.method public static final synthetic access$toDomainException(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p0

    return-object p0
.end method

.method private final toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;
    .locals 6

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "reason"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no_supported_payment_method_type_accounts_found"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object p4

    if-eqz p4, :cond_2

    const-string v0, "total_accounts_count"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-eqz p4, :cond_2

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    goto :goto_1

    :cond_2
    const/4 p4, 0x0

    :goto_1
    move v2, p4

    if-nez p3, :cond_3

    const-string p3, ""

    :cond_3
    move-object v4, p3

    new-instance p3, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;

    move-object v0, p3

    move v1, p5

    move-object v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;-><init>(ZILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    goto :goto_2

    :cond_4
    new-instance p3, Lcom/stripe/android/financialconnections/exception/AccountLoadError;

    invoke-direct {p3, p5, p4, p2, p1}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;-><init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V

    :goto_2
    move-object p1, p3

    :goto_3
    return-object p1
.end method


# virtual methods
.method public final invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/16 v0, 0xa

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x7d0

    new-instance v5, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$2;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$2;-><init>(Lkotlin/coroutines/Continuation;)V

    new-instance v7, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;

    invoke-direct {v7, p2, p0, p1, v6}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;ZLkotlin/coroutines/Continuation;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v6, v7

    move-object v7, p3

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/utils/ErrorsKt;->retryOnException$default(IJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
