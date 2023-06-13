.class public final LZp5$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB43;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp5;->m(LsP5;Z)LB43;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Zp5$k",
        "LB43;",
        "LCe3;",
        "available",
        "LH43;",
        "source",
        "k",
        "(JI)J",
        "consumed",
        "h",
        "(JJI)J",
        "Lro6;",
        "a",
        "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ldq5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(LsP5;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ldq5;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, LZp5$k;->b:LsP5;

    iput-boolean p2, p0, LZp5$k;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lro6;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p5, LZp5$k$a;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, LZp5$k$a;

    iget p2, p1, LZp5$k$a;->l:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, LZp5$k$a;->l:I

    goto :goto_0

    :cond_0
    new-instance p1, LZp5$k$a;

    invoke-direct {p1, p0, p5}, LZp5$k$a;-><init>(LZp5$k;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, p1, LZp5$k$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p5

    iget v0, p1, LZp5$k$a;->l:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, LZp5$k$a;->i:J

    iget-object p1, p1, LZp5$k$a;->h:Ljava/lang/Object;

    check-cast p1, LZp5$k;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-boolean p2, p0, LZp5$k;->c:Z

    if-eqz p2, :cond_4

    iget-object p2, p0, LZp5$k;->b:LsP5;

    invoke-interface {p2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldq5;

    iput-object p0, p1, LZp5$k$a;->h:Ljava/lang/Object;

    iput-wide p3, p1, LZp5$k$a;->i:J

    iput v1, p1, LZp5$k$a;->l:I

    invoke-virtual {p2, p3, p4, p1}, Ldq5;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p5, :cond_3

    return-object p5

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Lro6;

    invoke-virtual {p2}, Lro6;->o()J

    move-result-wide v0

    invoke-static {p3, p4, v0, v1}, Lro6;->k(JJ)J

    move-result-wide p2

    goto :goto_2

    :cond_4
    sget-object p1, Lro6;->b:Lro6$a;

    invoke-virtual {p1}, Lro6$a;->a()J

    move-result-wide p2

    move-object p1, p0

    :goto_2
    invoke-static {p2, p3}, Lro6;->b(J)Lro6;

    move-result-object p2

    iget-object p1, p1, LZp5$k;->b:LsP5;

    invoke-virtual {p2}, Lro6;->o()J

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldq5;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ldq5;->i(Z)V

    return-object p2
.end method

.method public h(JJI)J
    .locals 0

    iget-boolean p1, p0, LZp5$k;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LZp5$k;->b:LsP5;

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldq5;

    invoke-virtual {p1, p3, p4}, Ldq5;->h(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public k(JI)J
    .locals 0

    sget-object p1, LH43;->a:LH43$a;

    invoke-virtual {p1}, LH43$a;->b()I

    move-result p1

    invoke-static {p3, p1}, LH43;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LZp5$k;->b:LsP5;

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldq5;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ldq5;->i(Z)V

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    return-wide p1
.end method
