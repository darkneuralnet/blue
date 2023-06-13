.class public final LAt8;
.super LLE2;
.source "SourceFile"


# static fields
.field public static final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final k:LsY1;


# instance fields
.field public final d:Lhj1;

.field public final e:Ly49;

.field public final f:Lr59;

.field public final g:LGC7;

.field public h:Z

.field public final i:LbU;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, LAt8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v0

    sput-object v0, LAt8;->k:LsY1;

    return-void
.end method

.method public constructor <init>(Ly49;Lhj1;LGC7;)V
    .locals 1

    invoke-direct {p0}, LLE2;-><init>()V

    new-instance v0, LbU;

    invoke-direct {v0}, LbU;-><init>()V

    iput-object v0, p0, LAt8;->i:LbU;

    const-string v0, "FaceDetectorOptions can not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LAt8;->d:Lhj1;

    iput-object p1, p0, LAt8;->e:Ly49;

    iput-object p3, p0, LAt8;->g:LGC7;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object p1

    invoke-virtual {p1}, LyU2;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lr59;->a(Landroid/content/Context;)Lr59;

    move-result-object p1

    iput-object p1, p0, LAt8;->f:Lr59;

    return-void
.end method

.method public static k(Ljava/util/List;)V
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj1;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Ldj1;->f(I)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LAt8;->g:LGC7;

    invoke-interface {v0}, LGC7;->zzd()Z

    move-result v0

    iput-boolean v0, p0, LAt8;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LAt8;->g:LGC7;

    invoke-interface {v0}, LGC7;->zzb()V

    sget-object v0, LAt8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final bridge synthetic i(LNE2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    check-cast p1, Lg32;

    invoke-virtual {p0, p1}, LAt8;->j(Lg32;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized j(Lg32;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iget-object v0, v8, LAt8;->i:LbU;

    invoke-virtual {v0, v9}, LbU;->a(Lg32;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, v8, LAt8;->g:LGC7;

    invoke-interface {v0, v9}, LGC7;->a(Lg32;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "No detector is enabled"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    :goto_1
    move-object v9, v2

    move-wide/from16 v18, v10

    goto/16 :goto_5

    :cond_2
    if-nez v0, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_1

    :cond_3
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldj1;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldj1;

    invoke-virtual {v4}, Ldj1;->a()Landroid/graphics/Rect;

    move-result-object v13

    if-eqz v13, :cond_4

    invoke-virtual {v7}, Ldj1;->a()Landroid/graphics/Rect;

    move-result-object v13

    if-eqz v13, :cond_4

    invoke-virtual {v4}, Ldj1;->a()Landroid/graphics/Rect;

    move-result-object v13

    invoke-virtual {v7}, Ldj1;->a()Landroid/graphics/Rect;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v15

    if-eqz v15, :cond_4

    iget v15, v13, Landroid/graphics/Rect;->right:I

    iget v12, v14, Landroid/graphics/Rect;->right:I

    invoke-static {v15, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    iget v15, v13, Landroid/graphics/Rect;->left:I

    move-object/from16 v16, v3

    iget v3, v14, Landroid/graphics/Rect;->left:I

    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int/2addr v12, v3

    iget v3, v13, Landroid/graphics/Rect;->bottom:I

    iget v15, v14, Landroid/graphics/Rect;->bottom:I

    invoke-static {v3, v15}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget v15, v13, Landroid/graphics/Rect;->top:I

    move-object/from16 v17, v5

    iget v5, v14, Landroid/graphics/Rect;->top:I

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v5
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-int/2addr v3, v5

    mul-int/2addr v12, v3

    move-wide/from16 v18, v10

    int-to-double v9, v12

    :try_start_2
    iget v3, v13, Landroid/graphics/Rect;->right:I

    iget v5, v13, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v5

    iget v5, v13, Landroid/graphics/Rect;->bottom:I

    iget v11, v13, Landroid/graphics/Rect;->top:I

    sub-int/2addr v5, v11

    mul-int/2addr v3, v5

    int-to-double v11, v3

    iget v3, v14, Landroid/graphics/Rect;->right:I

    iget v5, v14, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v5

    iget v5, v14, Landroid/graphics/Rect;->bottom:I

    iget v13, v14, Landroid/graphics/Rect;->top:I

    sub-int/2addr v5, v13

    mul-int/2addr v3, v5

    int-to-double v13, v3

    add-double/2addr v11, v13

    sub-double/2addr v11, v9

    div-double/2addr v9, v11

    const-wide v11, 0x3fe3333333333333L    # 0.6

    cmpl-double v3, v9, v11

    if-lez v3, :cond_5

    invoke-virtual {v4}, Ldj1;->d()Landroid/util/SparseArray;

    move-result-object v3

    invoke-virtual {v7, v3}, Ldj1;->e(Landroid/util/SparseArray;)V

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move-wide/from16 v18, v10

    :cond_5
    :goto_4
    invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, p1

    move-object/from16 v3, v16

    move-object/from16 v5, v17

    move-wide/from16 v10, v18

    goto/16 :goto_3

    :cond_6
    move-object/from16 v16, v3

    move-wide/from16 v18, v10

    if-nez v6, :cond_7

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v9, p1

    move-object/from16 v3, v16

    move-wide/from16 v10, v18

    goto/16 :goto_2

    :cond_8
    move-wide/from16 v18, v10

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v9, v3

    :goto_5
    sget-object v2, LZN8;->c:LZN8;

    if-nez v0, :cond_9

    const/4 v6, 0x0

    goto :goto_6

    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v6, v0

    :goto_6
    if-nez v1, :cond_a

    const/4 v7, 0x0

    goto :goto_7

    :cond_a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    move v7, v0

    :goto_7
    move-object/from16 v1, p0

    move-wide/from16 v3, v18

    move-object/from16 v5, p1

    invoke-virtual/range {v1 .. v7}, LAt8;->n(LZN8;JLg32;II)V

    sget-object v0, LAt8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v9

    :catch_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    move-wide/from16 v18, v10

    :goto_8
    :try_start_3
    invoke-virtual {v0}, Lcom/google/mlkit/common/MlKitException;->a()I

    move-result v1

    const/16 v2, 0xe

    if-ne v1, v2, :cond_b

    sget-object v1, LZN8;->m:LZN8;

    goto :goto_9

    :cond_b
    sget-object v1, LZN8;->r0:LZN8;

    :goto_9
    move-object v2, v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v3, v18

    move-object/from16 v5, p1

    invoke-virtual/range {v1 .. v7}, LAt8;->n(LZN8;JLg32;II)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final synthetic l(JLZN8;IILg32;)Lz59;
    .locals 2

    new-instance v0, LWQ8;

    invoke-direct {v0}, LWQ8;-><init>()V

    new-instance v1, LpL8;

    invoke-direct {v1}, LpL8;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, LpL8;->c(Ljava/lang/Long;)LpL8;

    invoke-virtual {v1, p3}, LpL8;->d(LZN8;)LpL8;

    sget-object p1, LAt8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, LpL8;->e(Ljava/lang/Boolean;)LpL8;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, LpL8;->a(Ljava/lang/Boolean;)LpL8;

    invoke-virtual {v1, p1}, LpL8;->b(Ljava/lang/Boolean;)LpL8;

    invoke-virtual {v1}, LpL8;->f()LNL8;

    move-result-object p1

    invoke-virtual {v0, p1}, LWQ8;->g(LNL8;)LWQ8;

    iget-object p1, p0, LAt8;->d:Lhj1;

    invoke-static {p1}, LhH8;->a(Lhj1;)LWJ8;

    move-result-object p1

    invoke-virtual {v0, p1}, LWQ8;->e(LWJ8;)LWQ8;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, LWQ8;->d(Ljava/lang/Integer;)LWQ8;

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, LWQ8;->h(Ljava/lang/Integer;)LWQ8;

    sget-object p1, LAt8;->k:LsY1;

    invoke-virtual {p1, p6}, LsY1;->c(Lg32;)I

    move-result p2

    invoke-virtual {p1, p6}, LsY1;->d(Lg32;)I

    move-result p1

    new-instance p3, LiK8;

    invoke-direct {p3}, LiK8;-><init>()V

    const/4 p4, -0x1

    if-eq p2, p4, :cond_4

    const/16 p4, 0x23

    if-eq p2, p4, :cond_3

    const p4, 0x32315659

    if-eq p2, p4, :cond_2

    const/16 p4, 0x10

    if-eq p2, p4, :cond_1

    const/16 p4, 0x11

    if-eq p2, p4, :cond_0

    sget-object p2, LtK8;->c:LtK8;

    goto :goto_0

    :cond_0
    sget-object p2, LtK8;->e:LtK8;

    goto :goto_0

    :cond_1
    sget-object p2, LtK8;->d:LtK8;

    goto :goto_0

    :cond_2
    sget-object p2, LtK8;->f:LtK8;

    goto :goto_0

    :cond_3
    sget-object p2, LtK8;->g:LtK8;

    goto :goto_0

    :cond_4
    sget-object p2, LtK8;->i:LtK8;

    :goto_0
    invoke-virtual {p3, p2}, LiK8;->a(LtK8;)LiK8;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, LiK8;->b(Ljava/lang/Integer;)LiK8;

    invoke-virtual {p3}, LiK8;->d()LRK8;

    move-result-object p1

    invoke-virtual {v0, p1}, LWQ8;->f(LRK8;)LWQ8;

    invoke-virtual {v0}, LWQ8;->i()LqR8;

    move-result-object p1

    new-instance p2, LxO8;

    invoke-direct {p2}, LxO8;-><init>()V

    iget-boolean p3, p0, LAt8;->h:Z

    if-eqz p3, :cond_5

    sget-object p3, LgN8;->e:LgN8;

    goto :goto_1

    :cond_5
    sget-object p3, LgN8;->d:LgN8;

    :goto_1
    invoke-virtual {p2, p3}, LxO8;->e(LgN8;)LxO8;

    invoke-virtual {p2, p1}, LxO8;->g(LqR8;)LxO8;

    invoke-static {p2}, Lz59;->d(LxO8;)Lz59;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic m(LU18;ILfI8;)Lz59;
    .locals 2

    new-instance v0, LxO8;

    invoke-direct {v0}, LxO8;-><init>()V

    iget-boolean v1, p0, LAt8;->h:Z

    if-eqz v1, :cond_0

    sget-object v1, LgN8;->e:LgN8;

    goto :goto_0

    :cond_0
    sget-object v1, LgN8;->d:LgN8;

    :goto_0
    invoke-virtual {v0, v1}, LxO8;->e(LgN8;)LxO8;

    new-instance v1, Le18;

    invoke-direct {v1}, Le18;-><init>()V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Le18;->a(Ljava/lang/Integer;)Le18;

    invoke-virtual {v1, p1}, Le18;->c(LU18;)Le18;

    invoke-virtual {v1, p3}, Le18;->b(LfI8;)Le18;

    invoke-virtual {v1}, Le18;->e()Ly28;

    move-result-object p1

    invoke-virtual {v0, p1}, LxO8;->d(Ly28;)LxO8;

    invoke-static {v0}, Lz59;->d(LxO8;)Lz59;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized n(LZN8;JLg32;II)V
    .locals 27

    move-object/from16 v9, p0

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v18, v0, p2

    new-instance v0, LBm8;

    move-object v1, v0

    move-object/from16 v2, p0

    move-wide/from16 v3, v18

    move-object/from16 v5, p1

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p4

    invoke-direct/range {v1 .. v8}, LBm8;-><init>(LAt8;JLZN8;IILg32;)V

    iget-object v1, v9, LAt8;->e:Ly49;

    sget-object v2, LlO8;->d:LlO8;

    invoke-virtual {v1, v0, v2}, Ly49;->c(Li49;LlO8;)V

    new-instance v0, Lt18;

    invoke-direct {v0}, Lt18;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lt18;->c(LZN8;)Lt18;

    sget-object v2, LAt8;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lt18;->d(Ljava/lang/Boolean;)Lt18;

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lt18;->a(Ljava/lang/Integer;)Lt18;

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lt18;->e(Ljava/lang/Integer;)Lt18;

    iget-object v2, v9, LAt8;->d:Lhj1;

    invoke-static {v2}, LhH8;->a(Lhj1;)LWJ8;

    move-result-object v2

    invoke-virtual {v0, v2}, Lt18;->b(LWJ8;)Lt18;

    invoke-virtual {v0}, Lt18;->f()LU18;

    move-result-object v13

    new-instance v0, LOe8;

    invoke-direct {v0, v9}, LOe8;-><init>(LAt8;)V

    iget-object v11, v9, LAt8;->e:Ly49;

    sget-object v12, LlO8;->z1:LlO8;

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lz39;

    const/16 v17, 0x0

    move-object v10, v3

    move-wide/from16 v14, v18

    move-object/from16 v16, v0

    invoke-direct/range {v10 .. v17}, Lz39;-><init>(Ly49;LlO8;Ljava/lang/Object;JLOe8;[B)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v25

    iget-boolean v0, v9, LAt8;->h:Z

    sub-long v23, v25, v18

    iget-object v2, v9, LAt8;->f:Lr59;

    const/4 v3, 0x1

    if-eq v3, v0, :cond_0

    const/16 v0, 0x5eef

    goto :goto_0

    :cond_0
    const/16 v0, 0x5ef0

    :goto_0
    move/from16 v21, v0

    invoke-virtual/range {p1 .. p1}, LZN8;->zza()I

    move-result v22

    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v26}, Lr59;->c(IIJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
