.class public final LTr5$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTr5$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "LCe3;",
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


# instance fields
.field public final synthetic b:Lne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne<",
            "LCe3;",
            "Ltf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:LZC0;


# direct methods
.method public constructor <init>(Lne;LZC0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne<",
            "LCe3;",
            "Ltf;",
            ">;",
            "LZC0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LTr5$d$b;->b:Lne;

    iput-object p2, p0, LTr5$d$b;->c:LZC0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LTr5$d$b;->b:Lne;

    invoke-virtual {v0}, Lne;->n()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCe3;

    invoke-virtual {v0}, LCe3;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, LGe3;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LGe3;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LTr5$d$b;->b:Lne;

    invoke-virtual {v0}, Lne;->n()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCe3;

    invoke-virtual {v0}, LCe3;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->p(J)F

    move-result v0

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v1, p0, LTr5$d$b;->c:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, LTr5$d$b$a;

    iget-object p3, p0, LTr5$d$b;->b:Lne;

    const/4 v0, 0x0

    invoke-direct {v4, p3, p1, p2, v0}, LTr5$d$b$a;-><init>(Lne;JLkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_1
    iget-object v0, p0, LTr5$d$b;->b:Lne;

    invoke-static {p1, p2}, LCe3;->d(J)LCe3;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Lne;->u(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, LTr5$d$b;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
