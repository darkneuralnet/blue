.class public final LC43;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\'\u0010(J#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR*\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u0011\u0010&\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u001a\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006)"
    }
    d2 = {
        "LC43;",
        "",
        "LCe3;",
        "available",
        "LH43;",
        "source",
        "d",
        "(JI)J",
        "consumed",
        "b",
        "(JJI)J",
        "Lro6;",
        "c",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "LZC0;",
        "Lkotlin/jvm/functions/Function0;",
        "getCalculateNestedScrollScope$ui_release",
        "()Lkotlin/jvm/functions/Function0;",
        "g",
        "(Lkotlin/jvm/functions/Function0;)V",
        "calculateNestedScrollScope",
        "LZC0;",
        "f",
        "()LZC0;",
        "h",
        "(LZC0;)V",
        "originNestedScrollScope",
        "LB43;",
        "LB43;",
        "getParent$ui_release",
        "()LB43;",
        "i",
        "(LB43;)V",
        "parent",
        "e",
        "coroutineScope",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "LZC0;",
            ">;"
        }
    .end annotation
.end field

.field public b:LZC0;

.field public c:LB43;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LC43$a;

    invoke-direct {v0, p0}, LC43$a;-><init>(LC43;)V

    iput-object v0, p0, LC43;->a:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p5, LC43$b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LC43$b;

    iget v1, v0, LC43$b;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC43$b;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LC43$b;

    invoke-direct {v0, p0, p5}, LC43$b;-><init>(LC43;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p5, v6, LC43$b;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LC43$b;->j:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, LC43;->c:LB43;

    if-eqz v1, :cond_4

    iput v2, v6, LC43$b;->j:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v1 .. v6}, LB43;->a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    check-cast p5, Lro6;

    invoke-virtual {p5}, Lro6;->o()J

    move-result-wide p1

    goto :goto_2

    :cond_4
    sget-object p1, Lro6;->b:Lro6$a;

    invoke-virtual {p1}, Lro6$a;->a()J

    move-result-wide p1

    :goto_2
    invoke-static {p1, p2}, Lro6;->b(J)Lro6;

    move-result-object p1

    return-object p1
.end method

.method public final b(JJI)J
    .locals 6

    iget-object v0, p0, LC43;->c:LB43;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, LB43;->h(JJI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lro6;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LC43$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LC43$c;

    iget v1, v0, LC43$c;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC43$c;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LC43$c;

    invoke-direct {v0, p0, p3}, LC43$c;-><init>(LC43;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, LC43$c;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LC43$c;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, LC43;->c:LB43;

    if-eqz p3, :cond_4

    iput v3, v0, LC43$c;->j:I

    invoke-interface {p3, p1, p2, v0}, LB43;->j(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lro6;

    invoke-virtual {p3}, Lro6;->o()J

    move-result-wide p1

    goto :goto_2

    :cond_4
    sget-object p1, Lro6;->b:Lro6$a;

    invoke-virtual {p1}, Lro6$a;->a()J

    move-result-wide p1

    :goto_2
    invoke-static {p1, p2}, Lro6;->b(J)Lro6;

    move-result-object p1

    return-object p1
.end method

.method public final d(JI)J
    .locals 1

    iget-object v0, p0, LC43;->c:LB43;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, LB43;->k(JI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final e()LZC0;
    .locals 2

    iget-object v0, p0, LC43;->a:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZC0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()LZC0;
    .locals 1

    iget-object v0, p0, LC43;->b:LZC0;

    return-object v0
.end method

.method public final g(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "LZC0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC43;->a:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final h(LZC0;)V
    .locals 0

    iput-object p1, p0, LC43;->b:LZC0;

    return-void
.end method

.method public final i(LB43;)V
    .locals 0

    iput-object p1, p0, LC43;->c:LB43;

    return-void
.end method
