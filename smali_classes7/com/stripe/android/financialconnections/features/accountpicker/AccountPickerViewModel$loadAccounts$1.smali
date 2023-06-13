.class final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V
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
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
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
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
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
    c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1"
    f = "AccountPickerViewModel.kt"
    i = {
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x3b,
        0x3c,
        0x40,
        0x46,
        0x64
    }
    m = "invokeSuspend"
    n = {
        "state",
        "manifest",
        "activeInstitution",
        "activeAuthSession",
        "startTime$iv",
        "manifest",
        "activeInstitution",
        "activeAuthSession",
        "partnerAccountList"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n*L\n1#1,323:1\n6#2,4:324\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n*L\n63#1:324,4\n*E\n"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_a

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    check-cast v8, Lkotlin/Result;

    invoke-virtual {v8}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_3

    :cond_2
    iget-wide v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->J$0:J

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v9

    move-object v9, v2

    move-object/from16 v2, p1

    goto :goto_2

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    iput v7, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-virtual {v2, v0}, LRN2;->awaitState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_0
    check-cast v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;

    move-result-object v8

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-virtual {v8, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_7

    return-object v1

    :cond_7
    :goto_1
    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v8

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v9

    if-eqz v9, :cond_12

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-static {v10}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getPollAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    move-result-object v10

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getCanRetry()Z

    move-result v2

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    iput-wide v11, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->J$0:J

    iput v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-virtual {v10, v2, v6, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v10, v6

    move-wide v5, v11

    :goto_2
    check-cast v2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v5

    invoke-static {v11, v12}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_a

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v2

    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v6, v13, v11, v12}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;-><init>(Ljava/lang/String;J)V

    iput-object v10, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-interface {v2, v6, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    move-object v2, v5

    move-object v5, v8

    move-object v4, v9

    move-object v6, v10

    :goto_3
    move-object v9, v4

    move-object v8, v5

    move-object v10, v6

    move-object v5, v2

    :cond_a
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v2, v5, v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$buildAccountList(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_c

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_4

    :cond_b
    move v12, v4

    goto :goto_5

    :cond_c
    :goto_4
    move v12, v7

    :goto_5
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v2

    if-eqz v2, :cond_d

    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->RADIO:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    goto :goto_6

    :cond_d
    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->CHECKBOXES:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    :goto_6
    move-object v14, v2

    sget-object v2, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;->Companion:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;

    invoke-virtual {v2, v10}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;->fromManifest(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v15

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getInstitutionSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result v2

    if-eqz v2, :cond_e

    move/from16 v20, v7

    goto :goto_7

    :cond_e
    move/from16 v20, v4

    :goto_7
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v16

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getInstitutionSkipAccountSelection()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v7, :cond_f

    move/from16 v19, v7

    goto :goto_8

    :cond_f
    move/from16 v19, v4

    :goto_8
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getBusinessName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v17, v2

    goto :goto_9

    :cond_10
    move/from16 v17, v4

    :goto_9
    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    move-object v11, v2

    invoke-direct/range {v11 .. v20}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;

    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v5, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;->label:I

    invoke-interface {v4, v5, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_11

    return-object v1

    :cond_11
    move-object v1, v2

    :goto_a
    return-object v1

    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
