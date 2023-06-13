.class public final LF76$f;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF76;->ia(LxL3;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "LG76;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "",
        "LG76;",
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
    c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$processPayload$2"
    f = "TransactionPayloadFragment.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xff
    }
    m = "invokeSuspend"
    n = {
        "result",
        "responseBitmap"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransactionPayloadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n*L\n269#1:341,2\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public final synthetic k:LxL3;

.field public final synthetic l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

.field public final synthetic m:Z

.field public final synthetic n:LF76;


# direct methods
.method public constructor <init>(LxL3;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLF76;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxL3;",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            "Z",
            "LF76;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LF76$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LF76$f;->k:LxL3;

    iput-object p2, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    iput-boolean p3, p0, LF76$f;->m:Z

    iput-object p4, p0, LF76$f;->n:LF76;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, LF76$f;

    iget-object v1, p0, LF76$f;->k:LxL3;

    iget-object v2, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    iget-boolean v3, p0, LF76$f;->m:Z

    iget-object v4, p0, LF76$f;->n:LF76;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LF76$f;-><init>(LxL3;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLF76;Lkotlin/coroutines/Continuation;)V

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
            "Ljava/util/List<",
            "LG76;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LF76$f;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LF76$f;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LF76$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LF76$f;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF76$f;->j:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LF76$f;->i:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, LF76$f;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p0, LF76$f;->k:LxL3;

    sget-object v3, LxL3;->b:LxL3;

    if-ne p1, v3, :cond_3

    iget-object p1, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {p1, v2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestHeadersString(Z)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {v3}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isRequestBodyEncoded()Z

    move-result v3

    iget-boolean v4, p0, LF76$f;->m:Z

    if-eqz v4, :cond_2

    iget-object v4, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    iget-object v5, p0, LF76$f;->n:LF76;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getSpannedRequestBody(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_0

    :cond_2
    iget-object v4, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {v4}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getRequestBody()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    const-string v4, ""

    goto :goto_0

    :cond_3
    iget-object p1, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {p1, v2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseHeadersString(Z)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {v3}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->isResponseBodyEncoded()Z

    move-result v3

    iget-object v4, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    iget-object v5, p0, LF76$f;->n:LF76;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getSpannedResponseBody(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    :cond_4
    :goto_0
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/2addr v5, v2

    if-eqz v5, :cond_5

    new-instance v5, LG76$b;

    const/4 v6, 0x0

    invoke-static {p1, v6}, LwN1;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    const-string v6, "fromHtml(\n              \u2026                        )"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p1}, LG76$b;-><init>(Landroid/text/Spanned;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object p1, p0, LF76$f;->l:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getResponseImageBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v5, p0, LF76$f;->k:LxL3;

    sget-object v6, LxL3;->c:LxL3;

    if-ne v5, v6, :cond_7

    if-eqz p1, :cond_7

    iput-object v1, p0, LF76$f;->h:Ljava/lang/Object;

    iput-object p1, p0, LF76$f;->i:Ljava/lang/Object;

    iput v2, p0, LF76$f;->j:I

    invoke-static {p1, p0}, LpU;->d(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v2

    :goto_1
    check-cast p1, Ljava/lang/Double;

    new-instance v2, LG76$c;

    invoke-direct {v2, v0, p1}, LG76$c;-><init>(Landroid/graphics/Bitmap;Ljava/lang/Double;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1

    :cond_7
    const-string p1, "valueOf(text)"

    if-eqz v3, :cond_8

    iget-object v0, p0, LF76$f;->n:LF76;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lal4;->chucker_body_omitted:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "requireContext().getStri\u2026ing.chucker_body_omitted)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LG76$a;

    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, LG76$a;-><init>(Landroid/text/SpannableStringBuilder;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, LF76$f;->n:LF76;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lal4;->chucker_body_empty:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "requireContext().getStri\u2026tring.chucker_body_empty)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LG76$a;

    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, LG76$a;-><init>(Landroid/text/SpannableStringBuilder;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    iget-object p1, p0, LF76$f;->n:LF76;

    invoke-static {p1, v4}, LF76;->E9(LF76;Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v2, LG76$a;

    instance-of v3, v0, Landroid/text/SpannableStringBuilder;

    if-eqz v3, :cond_a

    check-cast v0, Landroid/text/SpannableStringBuilder;

    goto :goto_3

    :cond_a
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    :goto_3
    const-string v3, "if (it is SpannableStrin\u2026                        }"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, LG76$a;-><init>(Landroid/text/SpannableStringBuilder;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    :goto_4
    return-object v1
.end method
