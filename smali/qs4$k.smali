.class public final Lqs4$k;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqs4;->m0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"
    }
    d2 = {
        "LZC0;",
        "LIV2;",
        "parentFrameClock",
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
    c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2"
    f = "Recomposer.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x1ec,
        0x1fe
    }
    m = "invokeSuspend"
    n = {
        "parentFrameClock",
        "toRecompose",
        "toInsert",
        "toApply",
        "toLateApply",
        "toComplete",
        "parentFrameClock",
        "toRecompose",
        "toInsert",
        "toApply",
        "toLateApply",
        "toComplete"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n33#3,6:1411\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n496#1:1409\n485#1:1410\n486#1:1411,6\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lqs4;


# direct methods
.method public constructor <init>(Lqs4;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqs4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lqs4$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqs4$k;->o:Lqs4;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqs4$k;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic f(Ljava/util/List;Lqs4;)V
    .locals 0

    invoke-static {p0, p1}, Lqs4$k;->i(Ljava/util/List;Lqs4;)V

    return-void
.end method

.method public static final h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnB0;",
            ">;",
            "Ljava/util/List<",
            "LjW2;",
            ">;",
            "Ljava/util/List<",
            "LnB0;",
            ">;",
            "Ljava/util/Set<",
            "LnB0;",
            ">;",
            "Ljava/util/Set<",
            "LnB0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/Set;->clear()V

    invoke-interface {p4}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public static final i(Ljava/util/List;Lqs4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LjW2;",
            ">;",
            "Lqs4;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->clear()V

    invoke-static {p1}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lqs4;->w(Lqs4;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LjW2;

    move-object v5, p0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lqs4;->w(Lqs4;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final g(LZC0;LIV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LIV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lqs4$k;

    iget-object v0, p0, Lqs4$k;->o:Lqs4;

    invoke-direct {p1, v0, p3}, Lqs4$k;-><init>(Lqs4;Lkotlin/coroutines/Continuation;)V

    iput-object p2, p1, Lqs4$k;->n:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lqs4$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, LIV2;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lqs4$k;->g(LZC0;LIV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lqs4$k;->m:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Lqs4$k;->l:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    iget-object v5, v1, Lqs4$k;->k:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v1, Lqs4$k;->j:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v1, Lqs4$k;->i:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v1, Lqs4$k;->h:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lqs4$k;->n:Ljava/lang/Object;

    check-cast v9, LIV2;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v1

    move-object v14, v6

    move v6, v3

    move-object/from16 v16, v9

    move-object v9, v2

    move-object/from16 v2, v16

    move-object/from16 v17, v8

    move-object v8, v5

    move-object/from16 v5, v17

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lqs4$k;->l:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    iget-object v5, v1, Lqs4$k;->k:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v1, Lqs4$k;->j:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v1, Lqs4$k;->i:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v1, Lqs4$k;->h:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lqs4$k;->n:Ljava/lang/Object;

    check-cast v9, LIV2;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v1

    move-object v10, v2

    move-object v15, v5

    move-object v14, v6

    move-object v13, v7

    move-object v12, v8

    move-object v2, v9

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v1, Lqs4$k;->n:Ljava/lang/Object;

    check-cast v2, LIV2;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    move-object v10, v1

    :goto_0
    iget-object v11, v10, Lqs4$k;->o:Lqs4;

    invoke-static {v11}, Lqs4;->C(Lqs4;)Z

    move-result v11

    if-eqz v11, :cond_7

    iget-object v11, v10, Lqs4$k;->o:Lqs4;

    iput-object v2, v10, Lqs4$k;->n:Ljava/lang/Object;

    iput-object v5, v10, Lqs4$k;->h:Ljava/lang/Object;

    iput-object v6, v10, Lqs4$k;->i:Ljava/lang/Object;

    iput-object v7, v10, Lqs4$k;->j:Ljava/lang/Object;

    iput-object v8, v10, Lqs4$k;->k:Ljava/lang/Object;

    iput-object v9, v10, Lqs4$k;->l:Ljava/lang/Object;

    iput v4, v10, Lqs4$k;->m:I

    invoke-static {v11, v10}, Lqs4;->q(Lqs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_3

    return-object v0

    :cond_3
    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    move-object v15, v8

    move-object v11, v10

    move-object v10, v9

    :goto_1
    iget-object v5, v11, Lqs4$k;->o:Lqs4;

    invoke-static {v5}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v11, Lqs4$k;->o:Lqs4;

    monitor-enter v5

    :try_start_0
    invoke-static {v6}, Lqs4;->x(Lqs4;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_4

    invoke-static {v6}, Lqs4;->L(Lqs4;)V

    invoke-static {v6}, Lqs4;->x(Lqs4;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_4

    move v8, v4

    :cond_4
    monitor-exit v5

    if-eqz v8, :cond_5

    move-object v9, v10

    move-object v10, v11

    move-object v5, v12

    move-object v6, v13

    move-object v7, v14

    move-object v8, v15

    goto :goto_0

    :cond_5
    new-instance v9, Lqs4$k$a;

    iget-object v6, v11, Lqs4$k;->o:Lqs4;

    move-object v5, v9

    move-object v7, v12

    move-object v8, v13

    move-object v4, v9

    move-object v9, v15

    move-object/from16 p1, v10

    move-object v10, v14

    move-object v3, v11

    move-object/from16 v11, p1

    invoke-direct/range {v5 .. v11}, Lqs4$k$a;-><init>(Lqs4;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V

    iput-object v2, v3, Lqs4$k;->n:Ljava/lang/Object;

    iput-object v12, v3, Lqs4$k;->h:Ljava/lang/Object;

    iput-object v13, v3, Lqs4$k;->i:Ljava/lang/Object;

    iput-object v14, v3, Lqs4$k;->j:Ljava/lang/Object;

    iput-object v15, v3, Lqs4$k;->k:Ljava/lang/Object;

    move-object/from16 v9, p1

    iput-object v9, v3, Lqs4$k;->l:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v3, Lqs4$k;->m:I

    invoke-interface {v2, v4, v3}, LIV2;->m(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_6

    return-object v0

    :cond_6
    move-object v10, v3

    move-object v5, v12

    move-object v7, v13

    move-object v8, v15

    :goto_2
    iget-object v3, v10, Lqs4$k;->o:Lqs4;

    invoke-static {v3}, Lqs4;->s(Lqs4;)V

    move v3, v6

    move-object v6, v7

    move-object v7, v14

    const/4 v4, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
