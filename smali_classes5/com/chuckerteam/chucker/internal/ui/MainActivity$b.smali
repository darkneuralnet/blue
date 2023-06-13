.class public final Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/chuckerteam/chucker/internal/ui/MainActivity;->F(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1"
    f = "MainActivity.kt"
    i = {}
    l = {
        0xce,
        0xd4,
        0xd5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LFy5;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/chuckerteam/chucker/internal/ui/MainActivity;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chuckerteam/chucker/internal/ui/MainActivity;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LFy5;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    iput-object p2, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->j:Landroid/content/Context;

    iput-object p3, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->k:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->l:Ljava/lang/String;

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

    new-instance p1, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->j:Landroid/content/Context;

    iget-object v3, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->k:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->l:Ljava/lang/String;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;-><init>(Lcom/chuckerteam/chucker/internal/ui/MainActivity;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->h:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    invoke-static {p1}, Lcom/chuckerteam/chucker/internal/ui/MainActivity;->E(Lcom/chuckerteam/chucker/internal/ui/MainActivity;)LfH2;

    move-result-object p1

    iput v4, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->h:I

    invoke-virtual {p1, p0}, LfH2;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->j:Landroid/content/Context;

    sget v1, Lal4;->chucker_export_empty_text:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "applicationContext.getSt\u2026hucker_export_empty_text)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0, v2, v6, v5}, Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;->x(Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;Ljava/lang/String;IILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->k:Lkotlin/jvm/functions/Function2;

    iput v6, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->h:I

    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    check-cast p1, LFy5;

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v1

    new-instance v4, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b$a;

    iget-object v7, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    iget-object v8, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->l:Ljava/lang/String;

    invoke-direct {v4, p1, v7, v8, v5}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b$a;-><init>(LFy5;Lcom/chuckerteam/chucker/internal/ui/MainActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput v3, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->h:I

    invoke-static {v1, v4, p0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    check-cast p1, Landroid/content/Intent;

    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    :cond_8
    iget-object p1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->i:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$b;->j:Landroid/content/Context;

    sget v1, Lal4;->chucker_export_no_file:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "applicationContext.getSt\u2026g.chucker_export_no_file)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0, v2, v6, v5}, Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;->x(Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;Ljava/lang/String;IILjava/lang/Object;)V

    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
