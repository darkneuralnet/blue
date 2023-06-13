.class public final Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
        "",
        "financialConnectionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "session",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V
    .locals 1

    const-string v0, "financialConnectionsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v6, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v7, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v23, v7

    move-object v7, v4

    move-object v4, v6

    move-object/from16 v6, v23

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v6, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v7, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v4, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    new-instance v7, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    move-object/from16 v8, p1

    iput-object v8, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    invoke-interface {v1, v7, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsAccounts(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    move-object v7, v0

    move-object v6, v8

    :goto_1
    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v4, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v23, v7

    move-object v7, v4

    move-object v4, v6

    move-object/from16 v6, v23

    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/16 v9, 0x64

    if-ge v8, v9, :cond_6

    iget-object v1, v6, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    new-instance v8, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v6, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    invoke-interface {v1, v8, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsAccounts(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    :goto_3
    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v7, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    new-instance v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v8

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getUrl()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getTotalCount()Ljava/lang/Integer;

    move-result-object v11

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getLivemode()Z

    move-result v14

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x764

    const/16 v22, 0x0

    move-object v9, v1

    move-object v10, v3

    move-object v11, v2

    invoke-direct/range {v9 .. v22}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_7
    move-object/from16 v8, p1

    move-object v1, v8

    :goto_4
    return-object v1
.end method
