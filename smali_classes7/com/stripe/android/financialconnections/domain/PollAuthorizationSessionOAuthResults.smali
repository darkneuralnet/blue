.class public final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
        "session",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private static final Companion:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;

.field private static final MAX_TRIES:I = 0x12c
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final POLLING_TIME_MS:J = 0x7d0L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->Companion:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-void
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/16 v0, 0x12c

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x7d0

    new-instance v5, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$2;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$2;-><init>(Lkotlin/coroutines/Continuation;)V

    new-instance v7, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;

    invoke-direct {v7, p0, p1, v6}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$invoke$3;-><init>(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v6, v7

    move-object v7, p2

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/utils/ErrorsKt;->retryOnException$default(IJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
