.class public final Lt16$a$b$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt16$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1"
    f = "TextFieldPressGestureFilter.kt"
    i = {}
    l = {
        0x44
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public synthetic j:J

.field public final synthetic k:LZC0;

.field public final synthetic l:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LrX2;


# direct methods
.method public constructor <init>(LZC0;LEX2;LrX2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LEX2<",
            "LQ14;",
            ">;",
            "LrX2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lt16$a$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt16$a$b$a;->k:LZC0;

    iput-object p2, p0, Lt16$a$b$a;->l:LEX2;

    iput-object p3, p0, Lt16$a$b$a;->m:LrX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, v0, v1, p3}, Lt16$a$b$a;->invoke-d-4ec7I(LN14;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-d-4ec7I(LN14;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
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

    new-instance v0, Lt16$a$b$a;

    iget-object v1, p0, Lt16$a$b$a;->k:LZC0;

    iget-object v2, p0, Lt16$a$b$a;->l:LEX2;

    iget-object v3, p0, Lt16$a$b$a;->m:LrX2;

    invoke-direct {v0, v1, v2, v3, p4}, Lt16$a$b$a;-><init>(LZC0;LEX2;LrX2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lt16$a$b$a;->i:Ljava/lang/Object;

    iput-wide p2, v0, Lt16$a$b$a;->j:J

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lt16$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt16$a$b$a;->h:I

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

    iget-object p1, p0, Lt16$a$b$a;->i:Ljava/lang/Object;

    check-cast p1, LN14;

    iget-wide v5, p0, Lt16$a$b$a;->j:J

    iget-object v1, p0, Lt16$a$b$a;->k:LZC0;

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lt16$a$b$a$a;

    iget-object v4, p0, Lt16$a$b$a;->l:LEX2;

    iget-object v7, p0, Lt16$a$b$a;->m:LrX2;

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v8}, Lt16$a$b$a$a;-><init>(LEX2;JLrX2;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x3

    const/4 v12, 0x0

    move-object v7, v1

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move v11, v3

    invoke-static/range {v7 .. v12}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iput v2, p0, Lt16$a$b$a;->h:I

    invoke-interface {p1, p0}, LN14;->H0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lt16$a$b$a;->k:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lt16$a$b$a$b;

    iget-object v4, p0, Lt16$a$b$a;->l:LEX2;

    iget-object v5, p0, Lt16$a$b$a;->m:LrX2;

    const/4 v6, 0x0

    invoke-direct {v3, v4, p1, v5, v6}, Lt16$a$b$a$b;-><init>(LEX2;ZLrX2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
