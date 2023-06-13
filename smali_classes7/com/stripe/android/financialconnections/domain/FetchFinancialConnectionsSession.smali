.class public final Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
        "",
        "fetchPaginatedAccountsForSession",
        "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
        "financialConnectionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "clientSecret",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

.field private final financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V
    .locals 1

    const-string v0, "fetchPaginatedAccountsForSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;->fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsSession(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;->fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession$invoke$1;->label:I

    invoke-virtual {p1, p2, v0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p2
.end method
