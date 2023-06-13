.class public final Lak0$d$c$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0$d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LN14;",
        "LCe3;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1"
    f = "Clickable.kt"
    i = {}
    l = {
        0x9f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public synthetic j:J

.field public final synthetic k:Z

.field public final synthetic l:LrX2;

.field public final synthetic m:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic n:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LrX2;",
            "LEX2<",
            "LQ14;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lak0$d$c$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lak0$d$c$a;->k:Z

    iput-object p2, p0, Lak0$d$c$a;->l:LrX2;

    iput-object p3, p0, Lak0$d$c$a;->m:LEX2;

    iput-object p4, p0, Lak0$d$c$a;->n:LsP5;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LN14;

    check-cast p2, LCe3;

    invoke-virtual {p2}, LCe3;->x()J

    move-result-wide v0

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, v0, v1, p3}, Lak0$d$c$a;->invoke-d-4ec7I(LN14;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-d-4ec7I(LN14;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN14;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v6, Lak0$d$c$a;

    iget-boolean v1, p0, Lak0$d$c$a;->k:Z

    iget-object v2, p0, Lak0$d$c$a;->l:LrX2;

    iget-object v3, p0, Lak0$d$c$a;->m:LEX2;

    iget-object v4, p0, Lak0$d$c$a;->n:LsP5;

    move-object v0, v6

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lak0$d$c$a;-><init>(ZLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lak0$d$c$a;->i:Ljava/lang/Object;

    iput-wide p2, v6, Lak0$d$c$a;->j:J

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v6, p1}, Lak0$d$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lak0$d$c$a;->h:I

    const/4 v2, 0x1

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

    iget-object p1, p0, Lak0$d$c$a;->i:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LN14;

    iget-wide v4, p0, Lak0$d$c$a;->j:J

    iget-boolean p1, p0, Lak0$d$c$a;->k:Z

    if-eqz p1, :cond_2

    iget-object v6, p0, Lak0$d$c$a;->l:LrX2;

    iget-object v7, p0, Lak0$d$c$a;->m:LEX2;

    iget-object v8, p0, Lak0$d$c$a;->n:LsP5;

    iput v2, p0, Lak0$d$c$a;->h:I

    move-object v9, p0

    invoke-static/range {v3 .. v9}, Lak0;->i(LN14;JLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
