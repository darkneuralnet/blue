.class final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$3"
    f = "AttachPaymentViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3
    }
    l = {
        0x32,
        0x35,
        0x39,
        0x3f
    }
    m = "invokeSuspend"
    n = {
        "manifest",
        "authSession",
        "activeInstitution",
        "authSession",
        "startTime$iv",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "J$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAttachPaymentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n6#2,2:119\n9#2:122\n1#3:121\n*S KotlinDebug\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3\n*L\n56#1:119,2\n56#1:122\n*E\n"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const-string v5, "Required value was null."

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v8, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-wide v4, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->J$0:J

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v2

    move-object/from16 v2, p1

    goto/16 :goto_3

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v11, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;

    move-result-object v2

    iput v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->label:I

    invoke-virtual {v2, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_0
    move-object v10, v2

    check-cast v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v9

    if-eqz v9, :cond_d

    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v11}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getGetAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    move-result-object v11

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v12

    iput-object v10, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$2:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->label:I

    invoke-virtual {v11, v12, v0}, Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_6

    return-object v1

    :cond_6
    move-object/from16 v16, v9

    move-object v9, v2

    move-object/from16 v2, v16

    :goto_1
    check-cast v11, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-virtual {v11}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-ne v12, v8, :cond_7

    goto :goto_2

    :cond_7
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_c

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getLinkedAccountId()Ljava/lang/String;

    move-result-object v8

    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-static {v11}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    move-result-object v14

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v10

    new-instance v15, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;

    if-eqz v8, :cond_b

    invoke-direct {v15, v8}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;-><init>(Ljava/lang/String;)V

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    iput-object v11, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$2:Ljava/lang/Object;

    iput-wide v12, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->J$0:J

    iput v4, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->label:I

    invoke-virtual {v14, v10, v2, v15, v0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v8, v9

    move-wide v4, v12

    :goto_3
    check-cast v2, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    invoke-static {v11}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getGoNext$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;

    move-result-object v9

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v10

    if-nez v10, :cond_9

    sget-object v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_9
    invoke-static {v9, v10, v7, v6, v7}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v4

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->this$0:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v2

    new-instance v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8, v5, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;-><init>(Ljava/lang/String;J)V

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;->label:I

    invoke-interface {v2, v9, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    return-object v1

    :cond_a
    move-object v1, v4

    :goto_4
    return-object v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Failed requirement."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
