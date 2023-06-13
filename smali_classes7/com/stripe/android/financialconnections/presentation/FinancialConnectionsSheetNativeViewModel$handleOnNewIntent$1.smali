.class final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->handleOnNewIntent(Landroid/content/Intent;)V
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
    c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1"
    f = "FinancialConnectionsSheetNativeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $intent:Landroid/content/Intent;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

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

    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;-><init>(Landroid/content/Intent;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->label:I

    if-nez v0, :cond_b

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->$intent:Landroid/content/Intent;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    const-string v0, "authentication_return"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$1;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_2

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getUriUtils$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getApplicationId$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;->access$baseUrl(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/utils/UriUtils;->compareSchemeAuthorityAndPath(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getUriUtils$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/utils/UriUtils;->getQueryParameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x6f4abffd

    if-eq v1, v2, :cond_7

    const v2, -0x5185d186

    if-eq v1, v2, :cond_5

    const v2, -0x40c3ce76

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "failure"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$4;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$4;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_5
    const-string v1, "cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    sget-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$3;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_7
    const-string v1, "success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$2;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$2;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_9
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$5;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$5;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_a
    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$6;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
