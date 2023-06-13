.class public final LKh0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKh0;->g(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "LEu1;",
        "inner",
        "",
        "c",
        "(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lzh2;

.field public final synthetic c:Lts5;

.field public final synthetic d:Ln74;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln74<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic e:LCs5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCs5<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzh2;Lts5;Ln74;LCs5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzh2;",
            "Lts5;",
            "Ln74<",
            "-TT;>;",
            "LCs5<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LKh0$a;->b:Lzh2;

    iput-object p2, p0, LKh0$a;->c:Lts5;

    iput-object p3, p0, LKh0$a;->d:Ln74;

    iput-object p4, p0, LKh0$a;->e:LCs5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LKh0$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LKh0$a$b;

    iget v1, v0, LKh0$a$b;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LKh0$a$b;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, LKh0$a$b;

    invoke-direct {v0, p0, p2}, LKh0$a$b;-><init>(LKh0$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LKh0$a$b;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LKh0$a$b;->l:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LKh0$a$b;->i:Ljava/lang/Object;

    check-cast p1, LEu1;

    iget-object v0, v0, LKh0$a$b;->h:Ljava/lang/Object;

    check-cast v0, LKh0$a;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LKh0$a;->b:Lzh2;

    if-eqz p2, :cond_3

    invoke-static {p2}, LKh2;->l(Lzh2;)V

    :cond_3
    iget-object p2, p0, LKh0$a;->c:Lts5;

    iput-object p0, v0, LKh0$a$b;->h:Ljava/lang/Object;

    iput-object p1, v0, LKh0$a$b;->i:Ljava/lang/Object;

    iput v3, v0, LKh0$a$b;->l:I

    invoke-interface {p2, v0}, Lts5;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    iget-object v1, v0, LKh0$a;->d:Ln74;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, LKh0$a$a;

    iget-object p2, v0, LKh0$a;->e:LCs5;

    iget-object v0, v0, LKh0$a;->c:Lts5;

    const/4 v5, 0x0

    invoke-direct {v4, p1, p2, v0, v5}, LKh0$a$a;-><init>(LEu1;LCs5;Lts5;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEu1;

    invoke-virtual {p0, p1, p2}, LKh0$a;->c(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
