.class public final LfX3$b$a$a;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfX3$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1"
    f = "PointerIcon.kt"
    i = {
        0x0
    }
    l = {
        0x5b
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:LgX3;

.field public final synthetic l:LdX3;


# direct methods
.method public constructor <init>(ZLgX3;LdX3;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LgX3;",
            "LdX3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LfX3$b$a$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, LfX3$b$a$a;->j:Z

    iput-object p2, p0, LfX3$b$a$a;->k:LgX3;

    iput-object p3, p0, LfX3$b$a$a;->l:LdX3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, LfX3$b$a$a;

    iget-boolean v1, p0, LfX3$b$a$a;->j:Z

    iget-object v2, p0, LfX3$b$a$a;->k:LgX3;

    iget-object v3, p0, LfX3$b$a$a;->l:LdX3;

    invoke-direct {v0, v1, v2, v3, p2}, LfX3$b$a$a;-><init>(ZLgX3;LdX3;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, LfX3$b$a$a;->i:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LfX3$b$a$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LfX3$b$a$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LfX3$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWu;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LfX3$b$a$a;->e(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LfX3$b$a$a;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LfX3$b$a$a;->i:Ljava/lang/Object;

    check-cast v1, LWu;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LfX3$b$a$a;->i:Ljava/lang/Object;

    check-cast p1, LWu;

    move-object v1, p1

    move-object p1, p0

    :goto_0
    iget-boolean v3, p1, LfX3$b$a$a;->j:Z

    if-eqz v3, :cond_2

    sget-object v3, LaX3;->c:LaX3;

    goto :goto_1

    :cond_2
    sget-object v3, LaX3;->b:LaX3;

    :goto_1
    iput-object v1, p1, LfX3$b$a$a;->i:Ljava/lang/Object;

    iput v2, p1, LfX3$b$a$a;->h:I

    invoke-interface {v1, v3, p1}, LWu;->r0(LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v11, v0

    move-object v0, p1

    move-object p1, v3

    move-object v3, v1

    move-object v1, v11

    :goto_2
    check-cast p1, LYW3;

    invoke-virtual {p1}, LYW3;->f()I

    move-result v4

    sget-object v5, LbX3;->a:LbX3$a;

    invoke-virtual {v5}, LbX3$a;->e()I

    move-result v6

    invoke-static {v4, v6}, LbX3;->i(II)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {p1}, LYW3;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LjX3;

    invoke-interface {v3}, LWu;->a()J

    move-result-wide v7

    sget-object v9, LxB5;->b:LxB5$a;

    invoke-virtual {v9}, LxB5$a;->b()J

    move-result-wide v9

    invoke-static {v4, v7, v8, v9, v10}, LZW3;->f(LjX3;JJ)Z

    move-result v4

    if-eqz v4, :cond_4

    move v6, v2

    :cond_4
    invoke-virtual {p1}, LYW3;->f()I

    move-result p1

    invoke-virtual {v5}, LbX3$a;->b()I

    move-result v4

    invoke-static {p1, v4}, LbX3;->i(II)Z

    move-result p1

    if-nez p1, :cond_5

    if-nez v6, :cond_5

    iget-object p1, v0, LfX3$b$a$a;->k:LgX3;

    iget-object v4, v0, LfX3$b$a$a;->l:LdX3;

    invoke-interface {p1, v4}, LgX3;->a(LdX3;)V

    :cond_5
    move-object p1, v0

    move-object v0, v1

    move-object v1, v3

    goto :goto_0
.end method
