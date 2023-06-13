.class public final Lfp2$e;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp2;->d(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "LfE3$b$c<",
        "TKey;TValue;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"
    }
    d2 = {
        "",
        "Key",
        "Value",
        "LZC0;",
        "LfE3$b$c;",
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
    c = "androidx.paging.LegacyPagingSource$load$2"
    f = "LegacyPagingSource.kt"
    i = {}
    l = {
        0x70
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lfp2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfp2<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field public final synthetic j:LWS0$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWS0$f<",
            "TKey;>;"
        }
    .end annotation
.end field

.field public final synthetic k:LfE3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LfE3$a<",
            "TKey;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfp2;LWS0$f;LfE3$a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp2<",
            "TKey;TValue;>;",
            "LWS0$f<",
            "TKey;>;",
            "LfE3$a<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lfp2$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp2$e;->i:Lfp2;

    iput-object p2, p0, Lfp2$e;->j:LWS0$f;

    iput-object p3, p0, Lfp2$e;->k:LfE3$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lfp2$e;

    iget-object v0, p0, Lfp2$e;->i:Lfp2;

    iget-object v1, p0, Lfp2$e;->j:LWS0$f;

    iget-object v2, p0, Lfp2$e;->k:LfE3$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lfp2$e;-><init>(Lfp2;LWS0$f;LfE3$a;Lkotlin/coroutines/Continuation;)V

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
            "LfE3$b$c<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lfp2$e;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lfp2$e;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfp2$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lfp2$e;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfp2$e;->h:I

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

    iget-object p1, p0, Lfp2$e;->i:Lfp2;

    invoke-virtual {p1}, Lfp2;->g()LWS0;

    move-result-object p1

    iget-object v1, p0, Lfp2$e;->j:LWS0$f;

    iput v2, p0, Lfp2$e;->h:I

    invoke-virtual {p1, v1, p0}, LWS0;->h(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lfp2$e;->k:LfE3$a;

    check-cast p1, LWS0$a;

    new-instance v7, LfE3$b$c;

    iget-object v2, p1, LWS0$a;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    instance-of v1, v0, LfE3$a$c;

    if-eqz v1, :cond_3

    move-object v4, v3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LWS0$a;->d()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :goto_1
    iget-object v1, p1, LWS0$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    instance-of v0, v0, LfE3$a$a;

    if-eqz v0, :cond_4

    move-object v0, v3

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, LWS0$a;->c()Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-virtual {p1}, LWS0$a;->b()I

    move-result v5

    invoke-virtual {p1}, LWS0$a;->a()I

    move-result v6

    move-object v1, v7

    move-object v3, v4

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, LfE3$b$c;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V

    return-object v7
.end method
