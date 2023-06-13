.class public final LNh0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNh0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "R",
        "value",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lzh2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:LZC0;

.field public final synthetic d:LNh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LNh0<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final synthetic e:LGu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGu1<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;LZC0;LNh0;LGu1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lzh2;",
            ">;",
            "LZC0;",
            "LNh0<",
            "TT;TR;>;",
            "LGu1<",
            "-TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, LNh0$a$a;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, LNh0$a$a;->c:LZC0;

    iput-object p3, p0, LNh0$a$a;->d:LNh0;

    iput-object p4, p0, LNh0$a$a;->e:LGu1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LNh0$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LNh0$a$a$b;

    iget v1, v0, LNh0$a$a$b;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LNh0$a$a$b;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, LNh0$a$a$b;

    invoke-direct {v0, p0, p2}, LNh0$a$a$b;-><init>(LNh0$a$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LNh0$a$a$b;->k:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LNh0$a$a$b;->m:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LNh0$a$a$b;->j:Ljava/lang/Object;

    check-cast p1, Lzh2;

    iget-object p1, v0, LNh0$a$a$b;->i:Ljava/lang/Object;

    iget-object v0, v0, LNh0$a$a$b;->h:Ljava/lang/Object;

    check-cast v0, LNh0$a$a;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LNh0$a$a;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lzh2;

    if-eqz p2, :cond_3

    new-instance v2, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    invoke-direct {v2}, Lkotlinx/coroutines/flow/internal/ChildCancelledException;-><init>()V

    invoke-interface {p2, v2}, Lzh2;->f(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, LNh0$a$a$b;->h:Ljava/lang/Object;

    iput-object p1, v0, LNh0$a$a$b;->i:Ljava/lang/Object;

    iput-object p2, v0, LNh0$a$a$b;->j:Ljava/lang/Object;

    iput v3, v0, LNh0$a$a$b;->m:I

    invoke-interface {p2, v0}, Lzh2;->P(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, LNh0$a$a;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v0, LNh0$a$a;->c:LZC0;

    const/4 v2, 0x0

    sget-object v3, LbD0;->e:LbD0;

    new-instance v4, LNh0$a$a$a;

    iget-object v5, v0, LNh0$a$a;->d:LNh0;

    iget-object v0, v0, LNh0$a$a;->e:LGu1;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v0, p1, v6}, LNh0$a$a$a;-><init>(LNh0;LGu1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x1

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
