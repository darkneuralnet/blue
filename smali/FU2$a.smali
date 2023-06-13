.class public final LFU2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB43;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFU2;->a(LtX5;LEy3;)LB43;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u0010*\u00020\u000bH\u0003\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u0010*\u00020\u0002H\u0003\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0014\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "FU2$a",
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
        "j",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "d",
        "(F)J",
        "e",
        "(J)F",
        "c",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LtX5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtX5<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic c:LEy3;


# direct methods
.method public constructor <init>(LtX5;LEy3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX5<",
            "*>;",
            "LEy3;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LFU2$a;->b:LtX5;

    iput-object p2, p0, LFU2$a;->c:LEy3;

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

    instance-of p1, p5, LFU2$a$a;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, LFU2$a$a;

    iget p2, p1, LFU2$a$a;->k:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, LFU2$a$a;->k:I

    goto :goto_0

    :cond_0
    new-instance p1, LFU2$a$a;

    invoke-direct {p1, p0, p5}, LFU2$a$a;-><init>(LFU2$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, p1, LFU2$a$a;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p5

    iget v0, p1, LFU2$a$a;->k:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, LFU2$a$a;->h:J

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LFU2$a;->b:LtX5;

    invoke-virtual {p0, p3, p4}, LFU2$a;->e(J)F

    move-result v0

    iput-wide p3, p1, LFU2$a$a;->h:J

    iput v1, p1, LFU2$a$a;->k:I

    invoke-virtual {p2, v0, p1}, LtX5;->E(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_3

    return-object p5

    :cond_3
    :goto_1
    invoke-static {p3, p4}, Lro6;->b(J)Lro6;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)F
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "offsetToFloat"
    .end annotation

    iget-object v0, p0, LFU2$a;->c:LEy3;

    sget-object v1, LEy3;->c:LEy3;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(F)J
    .locals 4

    iget-object v0, p0, LFU2$a;->c:LEy3;

    sget-object v1, LEy3;->c:LEy3;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    sget-object v3, LEy3;->b:LEy3;

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    invoke-static {v1, p1}, LGe3;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)F
    .locals 2
    .annotation build Lkotlin/jvm/JvmName;
        name = "velocityToFloat"
    .end annotation

    iget-object v0, p0, LFU2$a;->c:LEy3;

    sget-object v1, LEy3;->c:LEy3;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Lro6;->h(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lro6;->i(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public h(JJI)J
    .locals 0

    sget-object p1, LH43;->a:LH43$a;

    invoke-virtual {p1}, LH43$a;->a()I

    move-result p1

    invoke-static {p5, p1}, LH43;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LFU2$a;->b:LtX5;

    invoke-virtual {p0, p3, p4}, LFU2$a;->c(J)F

    move-result p2

    invoke-virtual {p1, p2}, LtX5;->i(F)F

    move-result p1

    invoke-virtual {p0, p1}, LFU2$a;->d(F)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public j(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p3, LFU2$a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LFU2$a$b;

    iget v1, v0, LFU2$a$b;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LFU2$a$b;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, LFU2$a$b;

    invoke-direct {v0, p0, p3}, LFU2$a$b;-><init>(LFU2$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, LFU2$a$b;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LFU2$a$b;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, LFU2$a$b;->h:J

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LFU2$a;->e(J)F

    move-result p3

    iget-object v2, p0, LFU2$a;->b:LtX5;

    invoke-virtual {v2}, LtX5;->x()F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v4, p3, v4

    if-gez v4, :cond_3

    iget-object v4, p0, LFU2$a;->b:LtX5;

    invoke-virtual {v4}, LtX5;->r()F

    move-result v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    iget-object v2, p0, LFU2$a;->b:LtX5;

    iput-wide p1, v0, LFU2$a$b;->h:J

    iput v3, v0, LFU2$a$b;->k:I

    invoke-virtual {v2, p3, v0}, LtX5;->E(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_3
    sget-object p1, Lro6;->b:Lro6$a;

    invoke-virtual {p1}, Lro6$a;->a()J

    move-result-wide p1

    :cond_4
    :goto_1
    invoke-static {p1, p2}, Lro6;->b(J)Lro6;

    move-result-object p1

    return-object p1
.end method

.method public k(JI)J
    .locals 0

    invoke-virtual {p0, p1, p2}, LFU2$a;->c(J)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_0

    sget-object p2, LH43;->a:LH43$a;

    invoke-virtual {p2}, LH43$a;->a()I

    move-result p2

    invoke-static {p3, p2}, LH43;->d(II)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LFU2$a;->b:LtX5;

    invoke-virtual {p2, p1}, LtX5;->i(F)F

    move-result p1

    invoke-virtual {p0, p1}, LFU2$a;->d(F)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method
