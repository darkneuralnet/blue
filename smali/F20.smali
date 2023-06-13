.class public final LF20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE20;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "LF20;",
        "LE20;",
        "LOs4;",
        "rect",
        "",
        "b",
        "(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LLX2;",
        "LH20;",
        "a",
        "LLX2;",
        "c",
        "()LLX2;",
        "modifiers",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,154:1\n1182#2:155\n1161#2,2:156\n460#3,11:158\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n122#1:155\n122#1:156,2\n125#1:158,11\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "LH20;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLX2;

    const/16 v1, 0x10

    new-array v1, v1, [LH20;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LF20;->a:LLX2;

    return-void
.end method


# virtual methods
.method public b(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOs4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LF20$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LF20$a;

    iget v1, v0, LF20$a;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LF20$a;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, LF20$a;

    invoke-direct {v0, p0, p2}, LF20$a;-><init>(LF20;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LF20$a;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LF20$a;->n:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LF20$a;->k:I

    iget v2, v0, LF20$a;->j:I

    iget-object v4, v0, LF20$a;->i:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    iget-object v5, v0, LF20$a;->h:Ljava/lang/Object;

    check-cast v5, LOs4;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p2, v5

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, LF20;->a:LLX2;

    invoke-virtual {p2}, LLX2;->u()I

    move-result v2

    if-lez v2, :cond_5

    invoke-virtual {p2}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p2

    const/4 v4, 0x0

    move-object v6, p2

    move-object p2, p1

    move p1, v4

    move-object v4, v6

    :cond_3
    aget-object v5, v4, p1

    check-cast v5, LH20;

    iput-object p2, v0, LF20$a;->h:Ljava/lang/Object;

    iput-object v4, v0, LF20$a;->i:Ljava/lang/Object;

    iput v2, v0, LF20$a;->j:I

    iput p1, v0, LF20$a;->k:I

    iput v3, v0, LF20$a;->n:I

    invoke-virtual {v5, p2, v0}, LH20;->h(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    add-int/2addr p1, v3

    if-lt p1, v2, :cond_3

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final c()LLX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LLX2<",
            "LH20;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LF20;->a:LLX2;

    return-object v0
.end method
