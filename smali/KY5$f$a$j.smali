.class public final LKY5$f$a$j;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKY5$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"
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
    c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9"
    f = "TapGestureDetector.kt"
    i = {}
    l = {
        0x9d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LZC0;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "LjX3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic n:LO14;


# direct methods
.method public constructor <init>(LZC0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;LO14;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCe3;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "LjX3;",
            ">;",
            "LO14;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LKY5$f$a$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LKY5$f$a$j;->j:LZC0;

    iput-object p2, p0, LKY5$f$a$j;->k:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, LKY5$f$a$j;->l:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, LKY5$f$a$j;->m:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p5, p0, LKY5$f$a$j;->n:LO14;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v7, LKY5$f$a$j;

    iget-object v1, p0, LKY5$f$a$j;->j:LZC0;

    iget-object v2, p0, LKY5$f$a$j;->k:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, LKY5$f$a$j;->l:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, LKY5$f$a$j;->m:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, p0, LKY5$f$a$j;->n:LO14;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LKY5$f$a$j;-><init>(LZC0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;LO14;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v7, LKY5$f$a$j;->i:Ljava/lang/Object;

    return-object v7
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

    invoke-virtual {p0, p1, p2}, LKY5$f$a$j;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LKY5$f$a$j;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LKY5$f$a$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LKY5$f$a$j;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LKY5$f$a$j;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LKY5$f$a$j;->i:Ljava/lang/Object;

    check-cast p1, LWu;

    iput v2, p0, LKY5$f$a$j;->h:I

    invoke-static {p1, v3, p0, v2, v3}, LKY5;->l(LWu;LaX3;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LjX3;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LjX3;->a()V

    iget-object v4, p0, LKY5$f$a$j;->j:LZC0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, LKY5$f$a$j$a;

    iget-object v0, p0, LKY5$f$a$j;->n:LO14;

    invoke-direct {v7, v0, v3}, LKY5$f$a$j$a;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object v0, p0, LKY5$f$a$j;->k:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, LjX3;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_3
    iget-object v4, p0, LKY5$f$a$j;->j:LZC0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, LKY5$f$a$j$b;

    iget-object p1, p0, LKY5$f$a$j;->n:LO14;

    invoke-direct {v7, p1, v3}, LKY5$f$a$j$b;-><init>(LO14;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object p1, p0, LKY5$f$a$j;->l:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_4

    iget-object v0, p0, LKY5$f$a$j;->m:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, LjX3;

    invoke-virtual {v0}, LjX3;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_4
    :goto_1
    return-object v3
.end method
