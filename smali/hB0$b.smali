.class public final LhB0$b;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhB0;->c0(ZZZ)V
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
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"
    }
    d2 = {
        "",
        "K",
        "V",
        "LZC0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1"
    f = "ContiguousPagedList.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:LhB0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhB0<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Z

.field public final synthetic l:Z


# direct methods
.method public constructor <init>(ZLhB0;ZZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LhB0<",
            "TK;TV;>;ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LhB0$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, LhB0$b;->i:Z

    iput-object p2, p0, LhB0$b;->j:LhB0;

    iput-boolean p3, p0, LhB0$b;->k:Z

    iput-boolean p4, p0, LhB0$b;->l:Z

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

    new-instance p1, LhB0$b;

    iget-boolean v1, p0, LhB0$b;->i:Z

    iget-object v2, p0, LhB0$b;->j:LhB0;

    iget-boolean v3, p0, LhB0$b;->k:Z

    iget-boolean v4, p0, LhB0$b;->l:Z

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LhB0$b;-><init>(ZLhB0;ZZLkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, LhB0$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LhB0$b;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LhB0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LhB0$b;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, LhB0$b;->h:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-boolean p1, p0, LhB0$b;->i:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LhB0$b;->j:LhB0;

    invoke-virtual {p1}, LhB0;->e0()LZD3$a;

    move-result-object p1

    invoke-virtual {p1}, LZD3$a;->c()V

    :cond_0
    iget-boolean p1, p0, LhB0$b;->k:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, LhB0$b;->j:LhB0;

    invoke-static {p1, v0}, LhB0;->Z(LhB0;Z)V

    :cond_1
    iget-boolean p1, p0, LhB0$b;->l:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, LhB0$b;->j:LhB0;

    invoke-static {p1, v0}, LhB0;->a0(LhB0;Z)V

    :cond_2
    iget-object p1, p0, LhB0$b;->j:LhB0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LhB0;->b0(LhB0;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
