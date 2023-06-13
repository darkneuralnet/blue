.class public final Lw96;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTy5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LTy5<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lw96;",
        "T",
        "LTy5;",
        "LGu1;",
        "collector",
        "",
        "collect",
        "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LEu1;",
        "b",
        "LEu1;",
        "flow",
        "LZC0;",
        "c",
        "LZC0;",
        "scope",
        "d",
        "Ljava/lang/Object;",
        "_current",
        "initial",
        "<init>",
        "(Ljava/lang/Object;LEu1;LZC0;)V",
        "coroutine_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:LZC0;

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LEu1;LZC0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LEu1<",
            "+TT;>;",
            "LZC0;",
            ")V"
        }
    .end annotation

    const-string v0, "flow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw96;->b:LEu1;

    iput-object p3, p0, Lw96;->c:LZC0;

    iput-object p1, p0, Lw96;->d:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic e(Lw96;)LEu1;
    .locals 0

    iget-object p0, p0, Lw96;->b:LEu1;

    return-object p0
.end method

.method public static final synthetic f(Lw96;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lw96;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lw96$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw96$a;

    iget v1, v0, Lw96$a;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw96$a;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw96$a;

    invoke-direct {v0, p0, p2}, Lw96$a;-><init>(Lw96;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lw96$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw96$a;->j:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lw96;->c:LZC0;

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    iget-object v3, p0, Lw96;->b:LEu1;

    new-instance v5, Lw96$b;

    invoke-direct {v5, p0, v2}, Lw96$b;-><init>(Lw96;Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v5}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v2

    sget-object v5, Ljz5;->a:Ljz5$a;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v3

    invoke-static {v2, p2, v3, v4}, LVu1;->N(LEu1;LZC0;Ljz5;I)LTy5;

    move-result-object p2

    iput v4, v0, Lw96$a;->j:I

    invoke-interface {p2, p1, v0}, LTy5;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_5
    new-instance p2, Lw96$c;

    invoke-direct {p2, p0, p1, v2}, Lw96$c;-><init>(Lw96;LGu1;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lw96$a;->j:I

    invoke-static {p2, v0}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
