.class public final Lqs4$j;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqs4;->j0(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.runtime.Recomposer$recompositionRunner$2"
    f = "Recomposer.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x382
    }
    m = "invokeSuspend"
    n = {
        "callingJob",
        "unregisterApplyObserver"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1416\n33#3,6:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n893#1:1409\n903#1:1416\n894#1:1410,6\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lqs4;

.field public final synthetic l:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZC0;",
            "LIV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LIV2;


# direct methods
.method public constructor <init>(Lqs4;Lkotlin/jvm/functions/Function3;LIV2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqs4;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZC0;",
            "-",
            "LIV2;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LIV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lqs4$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqs4$j;->k:Lqs4;

    iput-object p2, p0, Lqs4$j;->l:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lqs4$j;->m:LIV2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lqs4$j;

    iget-object v1, p0, Lqs4$j;->k:Lqs4;

    iget-object v2, p0, Lqs4$j;->l:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lqs4$j;->m:LIV2;

    invoke-direct {v0, v1, v2, v3, p2}, Lqs4$j;-><init>(Lqs4;Lkotlin/jvm/functions/Function3;LIV2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lqs4$j;->j:Ljava/lang/Object;

    return-object v0
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

    invoke-virtual {p0, p1, p2}, Lqs4$j;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lqs4$j;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lqs4$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lqs4$j;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lqs4$j;->i:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lqs4$j;->h:Ljava/lang/Object;

    check-cast v0, Lge3;

    iget-object v1, p0, Lqs4$j;->j:Ljava/lang/Object;

    check-cast v1, Lzh2;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lqs4$j;->j:Ljava/lang/Object;

    check-cast p1, LZC0;

    invoke-interface {p1}, LZC0;->K()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, LKh2;->n(Lkotlin/coroutines/CoroutineContext;)Lzh2;

    move-result-object v1

    iget-object p1, p0, Lqs4$j;->k:Lqs4;

    invoke-static {p1, v1}, Lqs4;->M(Lqs4;Lzh2;)V

    sget-object p1, LsM5;->e:LsM5$a;

    new-instance v4, Lqs4$j$b;

    iget-object v5, p0, Lqs4$j;->k:Lqs4;

    invoke-direct {v4, v5}, Lqs4$j$b;-><init>(Lqs4;)V

    invoke-virtual {p1, v4}, LsM5$a;->e(Lkotlin/jvm/functions/Function2;)Lge3;

    move-result-object p1

    sget-object v4, Lqs4;->v:Lqs4$a;

    iget-object v5, p0, Lqs4$j;->k:Lqs4;

    invoke-static {v5}, Lqs4;->A(Lqs4;)Lqs4$c;

    move-result-object v5

    invoke-static {v4, v5}, Lqs4$a;->a(Lqs4$a;Lqs4$c;)V

    :try_start_1
    iget-object v4, p0, Lqs4$j;->k:Lqs4;

    invoke-static {v4}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lqs4$j;->k:Lqs4;

    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-static {v5}, Lqs4;->z(Lqs4;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_2

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LnB0;

    invoke-interface {v8}, LnB0;->x()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit v4

    new-instance v4, Lqs4$j$a;

    iget-object v5, p0, Lqs4$j;->l:Lkotlin/jvm/functions/Function3;

    iget-object v6, p0, Lqs4$j;->m:LIV2;

    invoke-direct {v4, v5, v6, v2}, Lqs4$j$a;-><init>(Lkotlin/jvm/functions/Function3;LIV2;Lkotlin/coroutines/Continuation;)V

    iput-object v1, p0, Lqs4$j;->j:Ljava/lang/Object;

    iput-object p1, p0, Lqs4$j;->h:Ljava/lang/Object;

    iput v3, p0, Lqs4$j;->i:I

    invoke-static {v4, p0}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-interface {v0}, Lge3;->dispose()V

    iget-object p1, p0, Lqs4$j;->k:Lqs4;

    invoke-static {p1}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lqs4$j;->k:Lqs4;

    monitor-enter p1

    :try_start_4
    invoke-static {v0}, Lqs4;->B(Lqs4;)Lzh2;

    move-result-object v3

    if-ne v3, v1, :cond_4

    invoke-static {v0, v2}, Lqs4;->P(Lqs4;Lzh2;)V

    :cond_4
    invoke-static {v0}, Lqs4;->r(Lqs4;)LWc0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p1

    sget-object p1, Lqs4;->v:Lqs4$a;

    iget-object v0, p0, Lqs4$j;->k:Lqs4;

    invoke-static {v0}, Lqs4;->A(Lqs4;)Lqs4$c;

    move-result-object v0

    invoke-static {p1, v0}, Lqs4$a;->b(Lqs4$a;Lqs4$c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    monitor-exit p1

    throw v0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v4

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_2
    invoke-interface {v0}, Lge3;->dispose()V

    iget-object v0, p0, Lqs4$j;->k:Lqs4;

    invoke-static {v0}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Lqs4$j;->k:Lqs4;

    monitor-enter v0

    :try_start_6
    invoke-static {v3}, Lqs4;->B(Lqs4;)Lzh2;

    move-result-object v4

    if-ne v4, v1, :cond_5

    invoke-static {v3, v2}, Lqs4;->P(Lqs4;Lzh2;)V

    :cond_5
    invoke-static {v3}, Lqs4;->r(Lqs4;)LWc0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    monitor-exit v0

    sget-object v0, Lqs4;->v:Lqs4$a;

    iget-object v1, p0, Lqs4$j;->k:Lqs4;

    invoke-static {v1}, Lqs4;->A(Lqs4;)Lqs4$c;

    move-result-object v1

    invoke-static {v0, v1}, Lqs4$a;->b(Lqs4$a;Lqs4$c;)V

    throw p1

    :catchall_4
    move-exception p1

    monitor-exit v0

    throw p1
.end method
