.class public final Lt16$a$b$a$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt16$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1"
    f = "TextFieldPressGestureFilter.kt"
    i = {
        0x1
    }
    l = {
        0x3d,
        0x41
    }
    m = "invokeSuspend"
    n = {
        "interaction"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:J

.field public final synthetic l:LrX2;


# direct methods
.method public constructor <init>(LEX2;JLrX2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LQ14;",
            ">;J",
            "LrX2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lt16$a$b$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt16$a$b$a$a;->j:LEX2;

    iput-wide p2, p0, Lt16$a$b$a$a;->k:J

    iput-object p4, p0, Lt16$a$b$a$a;->l:LrX2;

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

    new-instance p1, Lt16$a$b$a$a;

    iget-object v1, p0, Lt16$a$b$a$a;->j:LEX2;

    iget-wide v2, p0, Lt16$a$b$a$a;->k:J

    iget-object v4, p0, Lt16$a$b$a$a;->l:LrX2;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt16$a$b$a$a;-><init>(LEX2;JLrX2;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lt16$a$b$a$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lt16$a$b$a$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lt16$a$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lt16$a$b$a$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt16$a$b$a$a;->i:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lt16$a$b$a$a;->h:Ljava/lang/Object;

    check-cast v0, LQ14;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt16$a$b$a$a;->h:Ljava/lang/Object;

    check-cast v1, LEX2;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lt16$a$b$a$a;->j:LEX2;

    invoke-interface {p1}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQ14;

    if-eqz p1, :cond_5

    iget-object v1, p0, Lt16$a$b$a$a;->l:LrX2;

    iget-object v5, p0, Lt16$a$b$a$a;->j:LEX2;

    new-instance v6, LP14;

    invoke-direct {v6, p1}, LP14;-><init>(LQ14;)V

    if-eqz v1, :cond_4

    iput-object v5, p0, Lt16$a$b$a$a;->h:Ljava/lang/Object;

    iput v4, p0, Lt16$a$b$a$a;->i:I

    invoke-interface {v1, v6, p0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v1, v5

    :goto_0
    move-object v5, v1

    :cond_4
    invoke-interface {v5, v2}, LEX2;->setValue(Ljava/lang/Object;)V

    :cond_5
    new-instance p1, LQ14;

    iget-wide v4, p0, Lt16$a$b$a$a;->k:J

    invoke-direct {p1, v4, v5, v2}, LQ14;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Lt16$a$b$a$a;->l:LrX2;

    if-eqz v1, :cond_7

    iput-object p1, p0, Lt16$a$b$a$a;->h:Ljava/lang/Object;

    iput v3, p0, Lt16$a$b$a$a;->i:I

    invoke-interface {v1, p1, p0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    :goto_1
    move-object p1, v0

    :cond_7
    iget-object v0, p0, Lt16$a$b$a$a;->j:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
