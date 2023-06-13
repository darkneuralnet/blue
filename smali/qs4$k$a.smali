.class public final Lqs4$k$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqs4$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "frameTime",
        "",
        "a",
        "(J)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1408:1\n46#2,5:1409\n46#2,3:1414\n50#2:1430\n70#3:1417\n70#3:1431\n70#3:1448\n33#4,6:1418\n33#4,6:1424\n33#4,6:1432\n33#4,6:1438\n1855#5,2:1444\n1855#5,2:1446\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$2\n*L\n514#1:1409,5\n524#1:1414,3\n524#1:1430\n527#1:1417\n558#1:1431\n632#1:1448\n530#1:1418,6\n539#1:1424,6\n559#1:1432,6\n591#1:1438,6\n606#1:1444,2\n620#1:1446,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lqs4;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LnB0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LjW2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LnB0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LnB0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LnB0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqs4;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqs4;",
            "Ljava/util/List<",
            "LnB0;",
            ">;",
            "Ljava/util/List<",
            "LjW2;",
            ">;",
            "Ljava/util/Set<",
            "LnB0;",
            ">;",
            "Ljava/util/List<",
            "LnB0;",
            ">;",
            "Ljava/util/Set<",
            "LnB0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqs4$k$a;->g:Lqs4;

    iput-object p2, p0, Lqs4$k$a;->h:Ljava/util/List;

    iput-object p3, p0, Lqs4$k$a;->i:Ljava/util/List;

    iput-object p4, p0, Lqs4$k$a;->j:Ljava/util/Set;

    iput-object p5, p0, Lqs4$k$a;->k:Ljava/util/List;

    iput-object p6, p0, Lqs4$k$a;->l:Ljava/util/Set;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lqs4$k$a;->g:Lqs4;

    invoke-static {v0}, Lqs4;->t(Lqs4;)LM20;

    move-result-object v0

    invoke-virtual {v0}, LM20;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Recomposer:animation"

    iget-object v2, v1, Lqs4$k$a;->g:Lqs4;

    sget-object v3, Lc66;->a:Lc66;

    invoke-virtual {v3, v0}, Lc66;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :try_start_0
    invoke-static {v2}, Lqs4;->t(Lqs4;)LM20;

    move-result-object v0

    move-wide/from16 v5, p1

    invoke-virtual {v0, v5, v6}, LM20;->v(J)V

    sget-object v0, LsM5;->e:LsM5$a;

    invoke-virtual {v0}, LsM5$a;->g()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v4}, Lc66;->b(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lc66;->a:Lc66;

    invoke-virtual {v2, v4}, Lc66;->b(Ljava/lang/Object;)V

    throw v0

    :cond_0
    :goto_0
    const-string v0, "Recomposer:recompose"

    iget-object v2, v1, Lqs4$k$a;->g:Lqs4;

    iget-object v8, v1, Lqs4$k$a;->h:Ljava/util/List;

    iget-object v9, v1, Lqs4$k$a;->i:Ljava/util/List;

    iget-object v10, v1, Lqs4$k$a;->j:Ljava/util/Set;

    iget-object v11, v1, Lqs4$k$a;->k:Ljava/util/List;

    iget-object v12, v1, Lqs4$k$a;->l:Ljava/util/Set;

    sget-object v3, Lc66;->a:Lc66;

    invoke-virtual {v3, v0}, Lc66;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    :try_start_1
    invoke-static {v2}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    :try_start_2
    invoke-static {v2}, Lqs4;->L(Lqs4;)V

    invoke-static {v2}, Lqs4;->v(Lqs4;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LnB0;

    move-object v14, v8

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lqs4;->v(Lqs4;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    monitor-exit v3

    new-instance v0, LlW1;

    invoke-direct {v0}, LlW1;-><init>()V

    new-instance v3, LlW1;

    invoke-direct {v3}, LlW1;-><init>()V

    :cond_2
    move-object v4, v8

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_a

    move-object v4, v9

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_3

    goto/16 :goto_b

    :cond_3
    move-object v0, v11

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v2}, Lqs4;->W()J

    move-result-wide v3

    const-wide/16 v6, 0x1

    add-long/2addr v3, v6

    invoke-static {v2, v3, v4}, Lqs4;->N(Lqs4;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    :try_start_4
    move-object v0, v11

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v12, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v0, :cond_4

    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnB0;

    invoke-interface {v3}, LnB0;->t()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    :try_start_5
    invoke-interface {v11}, Ljava/util/List;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    :try_start_6
    invoke-static/range {v2 .. v7}, Lqs4;->h0(Lqs4;Ljava/lang/Exception;LnB0;ZILjava/lang/Object;)V

    invoke-static {v8, v9, v11, v10, v12}, Lqs4$k;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-interface {v11}, Ljava/util/List;->clear()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    :goto_3
    sget-object v0, Lc66;->a:Lc66;

    invoke-virtual {v0, v13}, Lc66;->b(Ljava/lang/Object;)V

    return-void

    :goto_4
    :try_start_8
    invoke-interface {v11}, Ljava/util/List;->clear()V

    throw v0

    :cond_5
    :goto_5
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_7

    :try_start_9
    invoke-static {v12, v10}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnB0;

    invoke-interface {v3}, LnB0;->k()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_6

    :cond_6
    :try_start_a
    invoke-interface {v10}, Ljava/util/Set;->clear()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_7

    :catch_1
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    :try_start_b
    invoke-static/range {v2 .. v7}, Lqs4;->h0(Lqs4;Ljava/lang/Exception;LnB0;ZILjava/lang/Object;)V

    invoke-static {v8, v9, v11, v10, v12}, Lqs4$k;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    invoke-interface {v10}, Ljava/util/Set;->clear()V

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-interface {v10}, Ljava/util/Set;->clear()V

    throw v0

    :cond_7
    :goto_7
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_9

    :try_start_d
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnB0;

    invoke-interface {v3}, LnB0;->d()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    goto :goto_8

    :cond_8
    :try_start_e
    invoke-interface {v12}, Ljava/util/Set;->clear()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    goto :goto_a

    :catchall_3
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    :try_start_f
    invoke-static/range {v2 .. v7}, Lqs4;->h0(Lqs4;Ljava/lang/Exception;LnB0;ZILjava/lang/Object;)V

    invoke-static {v8, v9, v11, v10, v12}, Lqs4$k;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    invoke-interface {v12}, Ljava/util/Set;->clear()V

    goto :goto_3

    :goto_9
    invoke-interface {v12}, Ljava/util/Set;->clear()V

    throw v0

    :cond_9
    :goto_a
    invoke-static {v2}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :try_start_11
    invoke-static {v2}, Lqs4;->r(Lqs4;)LWc0;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :try_start_12
    monitor-exit v3

    sget-object v0, LsM5;->e:LsM5$a;

    invoke-virtual {v0}, LsM5$a;->c()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    sget-object v0, Lc66;->a:Lc66;

    invoke-virtual {v0, v13}, Lc66;->b(Ljava/lang/Object;)V

    return-void

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_13
    monitor-exit v3

    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :cond_a
    :goto_b
    :try_start_14
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_c
    if-ge v6, v4, :cond_c

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LnB0;

    invoke-virtual {v3, v7}, LlW1;->add(Ljava/lang/Object;)Z

    invoke-static {v2, v7, v0}, Lqs4;->K(Lqs4;LnB0;LlW1;)LnB0;

    move-result-object v7

    if-eqz v7, :cond_b

    move-object v14, v11

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_4
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    :cond_b
    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    :cond_c
    :try_start_15
    invoke-interface {v8}, Ljava/util/List;->clear()V

    invoke-virtual {v0}, LlW1;->h()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-static {v2}, Lqs4;->E(Lqs4;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    :try_start_16
    invoke-static {v2}, Lqs4;->z(Lqs4;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const/4 v14, 0x0

    :goto_d
    if-ge v14, v7, :cond_e

    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LnB0;

    invoke-virtual {v3, v15}, LlW1;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_d

    invoke-interface {v15, v0}, LnB0;->b(Ljava/util/Set;)Z

    move-result v16

    if-eqz v16, :cond_d

    move-object v5, v8

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_e
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    :try_start_17
    monitor-exit v4

    goto :goto_e

    :catchall_5
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_f
    :goto_e
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    if-eqz v4, :cond_2

    :try_start_18
    invoke-static {v9, v2}, Lqs4$k;->f(Ljava/util/List;Lqs4;)V

    :goto_f
    move-object v4, v9

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_2

    invoke-static {v2, v9, v0}, Lqs4;->J(Lqs4;Ljava/util/List;LlW1;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v10, v4}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-static {v9, v2}, Lqs4$k;->f(Ljava/util/List;Lqs4;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_3
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    goto :goto_f

    :catch_3
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    :try_start_19
    invoke-static/range {v2 .. v7}, Lqs4;->h0(Lqs4;Ljava/lang/Exception;LnB0;ZILjava/lang/Object;)V

    invoke-static {v8, v9, v11, v10, v12}, Lqs4$k;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    goto/16 :goto_3

    :catchall_6
    move-exception v0

    goto :goto_10

    :catch_4
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    :try_start_1a
    invoke-static/range {v2 .. v7}, Lqs4;->h0(Lqs4;Ljava/lang/Exception;LnB0;ZILjava/lang/Object;)V

    invoke-static {v8, v9, v11, v10, v12}, Lqs4$k;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_6

    :try_start_1b
    invoke-interface {v8}, Ljava/util/List;->clear()V

    goto/16 :goto_3

    :goto_10
    invoke-interface {v8}, Ljava/util/List;->clear()V

    throw v0

    :catchall_7
    move-exception v0

    monitor-exit v3

    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    :catchall_8
    move-exception v0

    sget-object v2, Lc66;->a:Lc66;

    invoke-virtual {v2, v13}, Lc66;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lqs4$k$a;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
