.class public final Ldq5$c;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq5;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LWp5;",
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
        "LWp5;",
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
    c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2"
    f = "Scrollable.kt"
    i = {}
    l = {
        0x1ba
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:J

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ldq5;

.field public final synthetic n:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic o:J


# direct methods
.method public constructor <init>(Ldq5;Lkotlin/jvm/internal/Ref$LongRef;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq5;",
            "Lkotlin/jvm/internal/Ref$LongRef;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ldq5$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq5$c;->m:Ldq5;

    iput-object p2, p0, Ldq5$c;->n:Lkotlin/jvm/internal/Ref$LongRef;

    iput-wide p3, p0, Ldq5$c;->o:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v6, Ldq5$c;

    iget-object v1, p0, Ldq5$c;->m:Ldq5;

    iget-object v2, p0, Ldq5$c;->n:Lkotlin/jvm/internal/Ref$LongRef;

    iget-wide v3, p0, Ldq5$c;->o:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldq5$c;-><init>(Ldq5;Lkotlin/jvm/internal/Ref$LongRef;JLkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Ldq5$c;->l:Ljava/lang/Object;

    return-object v6
.end method

.method public final e(LWp5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWp5;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ldq5$c;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Ldq5$c;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldq5$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWp5;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Ldq5$c;->e(LWp5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldq5$c;->k:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Ldq5$c;->j:J

    iget-object v2, p0, Ldq5$c;->i:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v3, p0, Ldq5$c;->h:Ljava/lang/Object;

    check-cast v3, Ldq5;

    iget-object v4, p0, Ldq5$c;->l:Ljava/lang/Object;

    check-cast v4, Ldq5;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Ldq5$c;->l:Ljava/lang/Object;

    check-cast p1, LWp5;

    new-instance v1, Ldq5$c$a;

    iget-object v3, p0, Ldq5$c;->m:Ldq5;

    invoke-direct {v1, v3, p1}, Ldq5$c$a;-><init>(Ldq5;LWp5;)V

    new-instance p1, Ldq5$c$b;

    iget-object v3, p0, Ldq5$c;->m:Ldq5;

    invoke-direct {p1, v3, v1}, Ldq5$c$b;-><init>(Ldq5;Lkotlin/jvm/functions/Function1;)V

    iget-object v3, p0, Ldq5$c;->m:Ldq5;

    iget-object v1, p0, Ldq5$c;->n:Lkotlin/jvm/internal/Ref$LongRef;

    iget-wide v4, p0, Ldq5$c;->o:J

    invoke-virtual {v3}, Ldq5;->c()Lcu1;

    move-result-object v6

    iget-wide v7, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v3, v4, v5}, Ldq5;->o(J)F

    move-result v4

    invoke-virtual {v3, v4}, Ldq5;->j(F)F

    move-result v4

    iput-object v3, p0, Ldq5$c;->l:Ljava/lang/Object;

    iput-object v3, p0, Ldq5$c;->h:Ljava/lang/Object;

    iput-object v1, p0, Ldq5$c;->i:Ljava/lang/Object;

    iput-wide v7, p0, Ldq5$c;->j:J

    iput v2, p0, Ldq5$c;->k:I

    invoke-interface {v6, p1, v4, p0}, Lcu1;->a(LWp5;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v2, v1

    move-object v4, v3

    move-wide v0, v7

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v4, p1}, Ldq5;->j(F)F

    move-result p1

    invoke-virtual {v3, v0, v1, p1}, Ldq5;->r(JF)J

    move-result-wide v0

    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
