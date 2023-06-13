.class public final LE26$b;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE26;->c(LtX3;LgW2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LWu;",
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
        "LWu;",
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
    c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2"
    f = "TextSelectionMouseDetector.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x59,
        0x60,
        0x6f
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "clicksCounter",
        "$this$awaitEachGesture",
        "clicksCounter",
        "$this$awaitEachGesture",
        "clicksCounter"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LgW2;


# direct methods
.method public constructor <init>(LgW2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgW2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LE26$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LE26$b;->k:LgW2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, LE26$b;

    iget-object v1, p0, LE26$b;->k:LgW2;

    invoke-direct {v0, v1, p2}, LE26$b;-><init>(LgW2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, LE26$b;->j:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWu;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LE26$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LE26$b;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LE26$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LE26$b;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LE26$b;->i:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, LE26$b;->h:Ljava/lang/Object;

    check-cast v1, Lek0;

    iget-object v5, p0, LE26$b;->j:Ljava/lang/Object;

    check-cast v5, LWu;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_2
    iget-object v1, p0, LE26$b;->h:Ljava/lang/Object;

    check-cast v1, Lek0;

    iget-object v5, p0, LE26$b;->j:Ljava/lang/Object;

    check-cast v5, LWu;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LE26$b;->j:Ljava/lang/Object;

    check-cast p1, LWu;

    new-instance v1, Lek0;

    invoke-interface {p1}, LWu;->s()LJq6;

    move-result-object v5

    invoke-direct {v1, v5}, Lek0;-><init>(LJq6;)V

    :goto_1
    move-object v5, p0

    :goto_2
    iput-object p1, v5, LE26$b;->j:Ljava/lang/Object;

    iput-object v1, v5, LE26$b;->h:Ljava/lang/Object;

    iput v4, v5, LE26$b;->i:I

    invoke-static {p1, v5}, LE26;->a(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_4

    return-object v0

    :cond_4
    move-object v11, v5

    move-object v5, p1

    move-object p1, v6

    move-object v6, v11

    :goto_3
    check-cast p1, LYW3;

    invoke-virtual {v1, p1}, Lek0;->d(LYW3;)V

    invoke-virtual {p1}, LYW3;->c()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LjX3;

    invoke-static {p1}, Lz16;->a(LYW3;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, v6, LE26$b;->k:LgW2;

    invoke-virtual {v7}, LjX3;->f()J

    move-result-wide v8

    invoke-interface {p1, v8, v9}, LgW2;->d(J)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v7}, LjX3;->a()V

    invoke-virtual {v7}, LjX3;->e()J

    move-result-wide v7

    new-instance p1, LE26$b$a;

    iget-object v9, v6, LE26$b;->k:LgW2;

    invoke-direct {p1, v9}, LE26$b$a;-><init>(LgW2;)V

    iput-object v5, v6, LE26$b;->j:Ljava/lang/Object;

    iput-object v1, v6, LE26$b;->h:Ljava/lang/Object;

    iput v3, v6, LE26$b;->i:I

    invoke-static {v5, v7, v8, p1, v6}, Lq61;->f(LWu;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_5
    invoke-virtual {v1}, Lek0;->a()I

    move-result p1

    if-eq p1, v4, :cond_7

    if-eq p1, v3, :cond_6

    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->f()LPr5;

    move-result-object p1

    goto :goto_4

    :cond_6
    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->g()LPr5;

    move-result-object p1

    goto :goto_4

    :cond_7
    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->e()LPr5;

    move-result-object p1

    :goto_4
    iget-object v8, v6, LE26$b;->k:LgW2;

    invoke-virtual {v7}, LjX3;->f()J

    move-result-wide v9

    invoke-interface {v8, v9, v10, p1}, LgW2;->a(JLPr5;)Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v7}, LjX3;->a()V

    invoke-virtual {v7}, LjX3;->e()J

    move-result-wide v7

    new-instance v9, LE26$b$b;

    iget-object v10, v6, LE26$b;->k:LgW2;

    invoke-direct {v9, v10, p1}, LE26$b$b;-><init>(LgW2;LPr5;)V

    iput-object v5, v6, LE26$b;->j:Ljava/lang/Object;

    iput-object v1, v6, LE26$b;->h:Ljava/lang/Object;

    iput v2, v6, LE26$b;->i:I

    invoke-static {v5, v7, v8, v9, v6}, Lq61;->f(LWu;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    move-object p1, v5

    move-object v5, v6

    goto/16 :goto_2
.end method
