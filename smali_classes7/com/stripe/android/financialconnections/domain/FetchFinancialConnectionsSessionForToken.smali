.class public final Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
        "",
        "connectionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V",
        "invoke",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "Lcom/stripe/android/model/Token;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFetchFinancialConnectionsSessionForToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchFinancialConnectionsSessionForToken.kt\ncom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"
    }
.end annotation


# instance fields
.field private final connectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V
    .locals 1

    const-string v0, "connectionsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;->connectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lcom/stripe/android/model/Token;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;->connectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken$invoke$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsSession(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getParsedToken$financial_connections_release()Lcom/stripe/android/model/Token;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Could not extract Token from FinancialConnectionsSession."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
