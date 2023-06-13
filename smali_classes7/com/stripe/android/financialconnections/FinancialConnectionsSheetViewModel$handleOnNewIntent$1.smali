.class final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->handleOnNewIntent$financial_connections_release(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "",
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
    c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$1"
    f = "FinancialConnectionsSheetViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x1c6,
        0x131
    }
    m = "invokeSuspend"
    n = {
        "$this$withLock_u24default$iv",
        "$this$withLock_u24default$iv",
        "receivedUrl"
    }
    s = {
        "L$0",
        "L$0",
        "L$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,448:1\n107#2,10:449\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1\n*L\n303#1:449,10\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $intent:Landroid/content/Intent;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$2:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$0:Ljava/lang/Object;

    check-cast v2, LSX2;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_b

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$1:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$0:Ljava/lang/Object;

    check-cast v5, LSX2;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$getMutex$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)LSX2;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->label:I

    invoke-interface {p1, v4, p0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v1

    move-object v1, v5

    :goto_0
    if-eqz v3, :cond_4

    :try_start_1
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v1, v3}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$toUriOrNull(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    goto/16 :goto_b

    :cond_4
    move-object v3, v4

    :goto_1
    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->L$2:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;->label:I

    invoke-virtual {v1, p0}, LRN2;->awaitState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_5

    return-object v0

    :cond_5
    move-object v0, v3

    move-object v12, v2

    move-object v2, p1

    move-object p1, v12

    :goto_2
    :try_start_2
    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_6
    move-object v3, v4

    :goto_3
    const-string v5, "native-redirect"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v5, "/"

    if-eqz v3, :cond_7

    :try_start_3
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "receivedUrl.toString()"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$getApplicationId$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stripe-auth://native-redirect/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$onStartApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_7
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_8
    move-object v3, v4

    :goto_4
    const-string v6, "link-accounts"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_9
    move-object v3, v4

    :goto_5
    invoke-static {v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$getApplicationId$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/authentication_return"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {v1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$onFinishApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/net/Uri;)V

    goto/16 :goto_a

    :cond_a
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object v3

    goto :goto_6

    :cond_b
    move-object v3, v4

    :goto_6
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSuccessUrl()Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    :cond_c
    move-object v5, v4

    :goto_7
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {v1, p1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V

    goto :goto_a

    :cond_d
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object v0

    goto :goto_8

    :cond_e
    move-object v0, v4

    :goto_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getCancelUrl()Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    :cond_f
    move-object v3, v4

    :goto_9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    goto :goto_a

    :cond_10
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1;

    invoke-static {v1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$setState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance v3, Ljava/lang/Exception;

    const-string v5, "Error processing FinancialConnectionsSheet intent"

    invoke-direct {v3, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v3}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1, p1, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->access$finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    :goto_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v2, v4}, LSX2;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :goto_b
    invoke-interface {v2, v4}, LSX2;->b(Ljava/lang/Object;)V

    throw p1
.end method
