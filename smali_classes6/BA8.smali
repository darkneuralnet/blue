.class public final LBA8;
.super LLE2;
.source "SourceFile"


# static fields
.field public static final j:LsY1;

.field public static k:Z


# instance fields
.field public final d:LXx;

.field public final e:LgH8;

.field public final f:Len9;

.field public final g:Lqn9;

.field public final h:LbU;

.field public i:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LsY1;->b()LsY1;

    move-result-object v0

    sput-object v0, LBA8;->j:LsY1;

    const/4 v0, 0x1

    sput-boolean v0, LBA8;->k:Z

    return-void
.end method

.method public constructor <init>(LyU2;LXx;LgH8;Len9;)V
    .locals 1

    invoke-direct {p0}, LLE2;-><init>()V

    new-instance v0, LbU;

    invoke-direct {v0}, LbU;-><init>()V

    iput-object v0, p0, LBA8;->h:LbU;

    const-string v0, "MlKitContext can not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "BarcodeScannerOptions can not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LBA8;->d:LXx;

    iput-object p3, p0, LBA8;->e:LgH8;

    iput-object p4, p0, LBA8;->f:Len9;

    invoke-virtual {p1}, LyU2;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lqn9;->a(Landroid/content/Context;)Lqn9;

    move-result-object p1

    iput-object p1, p0, LBA8;->g:Lqn9;

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
    iget-object v0, p0, LBA8;->e:LgH8;

    invoke-interface {v0}, LgH8;->zzc()Z

    move-result v0

    iput-boolean v0, p0, LBA8;->i:Z
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
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LBA8;->e:LgH8;

    invoke-interface {v0}, LgH8;->zzb()V

    const/4 v0, 0x1

    sput-boolean v0, LBA8;->k:Z

    iget-object v0, p0, LBA8;->f:Len9;

    new-instance v1, LW59;

    invoke-direct {v1}, LW59;-><init>()V

    iget-boolean v2, p0, LBA8;->i:Z

    if-eqz v2, :cond_0

    sget-object v2, Ly59;->e:Ly59;

    goto :goto_0

    :cond_0
    sget-object v2, Ly59;->d:Ly59;

    :goto_0
    invoke-virtual {v1, v2}, LW59;->e(Ly59;)LW59;

    new-instance v2, LK79;

    invoke-direct {v2}, LK79;-><init>()V

    iget-object v3, p0, LBA8;->d:LXx;

    invoke-static {v3}, LCC7;->c(LXx;)LLk9;

    move-result-object v3

    invoke-virtual {v2, v3}, LK79;->i(LLk9;)LK79;

    invoke-virtual {v2}, LK79;->j()LY79;

    move-result-object v2

    invoke-virtual {v1, v2}, LW59;->g(LY79;)LW59;

    invoke-static {v1}, Lwn9;->d(LW59;)LRl9;

    move-result-object v1

    sget-object v2, LO59;->n:LO59;

    invoke-virtual {v0, v1, v2}, Len9;->d(LRl9;LO59;)V
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

    invoke-virtual {p0, p1}, LBA8;->l(Lg32;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j(JLG59;LJQ7;LJQ7;Lg32;)LRl9;
    .locals 2

    new-instance v0, LK79;

    invoke-direct {v0}, LK79;-><init>()V

    new-instance v1, LG39;

    invoke-direct {v1}, LG39;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, LG39;->c(Ljava/lang/Long;)LG39;

    invoke-virtual {v1, p3}, LG39;->d(LG59;)LG39;

    sget-boolean p1, LBA8;->k:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, LG39;->e(Ljava/lang/Boolean;)LG39;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, LG39;->a(Ljava/lang/Boolean;)LG39;

    invoke-virtual {v1, p1}, LG39;->b(Ljava/lang/Boolean;)LG39;

    invoke-virtual {v1}, LG39;->f()LY39;

    move-result-object p1

    invoke-virtual {v0, p1}, LK79;->h(LY39;)LK79;

    iget-object p1, p0, LBA8;->d:LXx;

    invoke-static {p1}, LCC7;->c(LXx;)LLk9;

    move-result-object p1

    invoke-virtual {v0, p1}, LK79;->i(LLk9;)LK79;

    invoke-virtual {p4}, LJQ7;->g()LDR7;

    move-result-object p1

    invoke-virtual {v0, p1}, LK79;->e(LDR7;)LK79;

    invoke-virtual {p5}, LJQ7;->g()LDR7;

    move-result-object p1

    invoke-virtual {v0, p1}, LK79;->f(LDR7;)LK79;

    invoke-virtual {p6}, Lg32;->g()I

    move-result p1

    sget-object p2, LBA8;->j:LsY1;

    invoke-virtual {p2, p6}, LsY1;->d(Lg32;)I

    move-result p2

    new-instance p3, Lf29;

    invoke-direct {p3}, Lf29;-><init>()V

    const/4 p4, -0x1

    if-eq p1, p4, :cond_4

    const/16 p4, 0x23

    if-eq p1, p4, :cond_3

    const p4, 0x32315659

    if-eq p1, p4, :cond_2

    const/16 p4, 0x10

    if-eq p1, p4, :cond_1

    const/16 p4, 0x11

    if-eq p1, p4, :cond_0

    sget-object p1, Lp29;->c:Lp29;

    goto :goto_0

    :cond_0
    sget-object p1, Lp29;->e:Lp29;

    goto :goto_0

    :cond_1
    sget-object p1, Lp29;->d:Lp29;

    goto :goto_0

    :cond_2
    sget-object p1, Lp29;->f:Lp29;

    goto :goto_0

    :cond_3
    sget-object p1, Lp29;->g:Lp29;

    goto :goto_0

    :cond_4
    sget-object p1, Lp29;->i:Lp29;

    :goto_0
    invoke-virtual {p3, p1}, Lf29;->a(Lp29;)Lf29;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lf29;->b(Ljava/lang/Integer;)Lf29;

    invoke-virtual {p3}, Lf29;->d()LJ29;

    move-result-object p1

    invoke-virtual {v0, p1}, LK79;->g(LJ29;)LK79;

    new-instance p1, LW59;

    invoke-direct {p1}, LW59;-><init>()V

    iget-boolean p2, p0, LBA8;->i:Z

    if-eqz p2, :cond_5

    sget-object p2, Ly59;->e:Ly59;

    goto :goto_1

    :cond_5
    sget-object p2, Ly59;->d:Ly59;

    :goto_1
    invoke-virtual {p1, p2}, LW59;->e(Ly59;)LW59;

    invoke-virtual {v0}, LK79;->j()LY79;

    move-result-object p2

    invoke-virtual {p1, p2}, LW59;->g(LY79;)LW59;

    invoke-static {p1}, Lwn9;->d(LW59;)LRl9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k(LP58;ILs19;)LRl9;
    .locals 2

    new-instance v0, LW59;

    invoke-direct {v0}, LW59;-><init>()V

    iget-boolean v1, p0, LBA8;->i:Z

    if-eqz v1, :cond_0

    sget-object v1, Ly59;->e:Ly59;

    goto :goto_0

    :cond_0
    sget-object v1, Ly59;->d:Ly59;

    :goto_0
    invoke-virtual {v0, v1}, LW59;->e(Ly59;)LW59;

    new-instance v1, LV48;

    invoke-direct {v1}, LV48;-><init>()V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, LV48;->a(Ljava/lang/Integer;)LV48;

    invoke-virtual {v1, p1}, LV48;->c(LP58;)LV48;

    invoke-virtual {v1, p3}, LV48;->b(Ls19;)LV48;

    invoke-virtual {v1}, LV48;->e()Lp78;

    move-result-object p1

    invoke-virtual {v0, p1}, LW59;->d(Lp78;)LW59;

    invoke-static {v0}, Lwn9;->d(LW59;)LRl9;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized l(Lg32;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v0, p0, LBA8;->h:LbU;

    invoke-virtual {v0, p1}, LbU;->a(Lg32;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, LBA8;->e:LgH8;

    invoke-interface {v0, p1}, LgH8;->a(Lg32;)Ljava/util/List;

    move-result-object v8

    sget-object v1, LG59;->c:LG59;

    move-object v0, p0

    move-wide v2, v6

    move-object v4, p1

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, LBA8;->m(LG59;JLg32;Ljava/util/List;)V

    const/4 v0, 0x0

    sput-boolean v0, LBA8;->k:Z
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v8

    :catch_0
    move-exception v0

    move-object v8, v0

    :try_start_2
    invoke-virtual {v8}, Lcom/google/mlkit/common/MlKitException;->a()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    sget-object v0, LG59;->m:LG59;

    goto :goto_0

    :cond_0
    sget-object v0, LG59;->r0:LG59;

    :goto_0
    move-object v1, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, v6

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, LBA8;->m(LG59;JLg32;Ljava/util/List;)V

    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final m(LG59;JLg32;Ljava/util/List;)V
    .locals 27

    move-object/from16 v8, p0

    new-instance v9, LJQ7;

    invoke-direct {v9}, LJQ7;-><init>()V

    new-instance v10, LJQ7;

    invoke-direct {v10}, LJQ7;-><init>()V

    if-eqz p5, :cond_0

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBx;

    invoke-virtual {v1}, LBx;->d()I

    move-result v2

    invoke-static {v2}, LCC7;->a(I)Lv79;

    move-result-object v2

    invoke-virtual {v9, v2}, LJQ7;->e(Ljava/lang/Object;)LJQ7;

    invoke-virtual {v1}, LBx;->f()I

    move-result v1

    invoke-static {v1}, LCC7;->b(I)LC79;

    move-result-object v1

    invoke-virtual {v10, v1}, LJQ7;->e(Ljava/lang/Object;)LJQ7;

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v18, v0, p2

    new-instance v11, Lzm8;

    move-object v0, v11

    move-object/from16 v1, p0

    move-wide/from16 v2, v18

    move-object/from16 v4, p1

    move-object v5, v9

    move-object v6, v10

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lzm8;-><init>(LBA8;JLG59;LJQ7;LJQ7;Lg32;)V

    iget-object v0, v8, LBA8;->f:Len9;

    sget-object v1, LO59;->l:LO59;

    invoke-virtual {v0, v11, v1}, Len9;->f(LYm9;LO59;)V

    new-instance v0, Lj58;

    invoke-direct {v0}, Lj58;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lj58;->e(LG59;)Lj58;

    sget-boolean v2, LBA8;->k:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lj58;->f(Ljava/lang/Boolean;)Lj58;

    iget-object v2, v8, LBA8;->d:LXx;

    invoke-static {v2}, LCC7;->c(LXx;)LLk9;

    move-result-object v2

    invoke-virtual {v0, v2}, Lj58;->g(LLk9;)Lj58;

    invoke-virtual {v9}, LJQ7;->g()LDR7;

    move-result-object v2

    invoke-virtual {v0, v2}, Lj58;->c(LDR7;)Lj58;

    invoke-virtual {v10}, LJQ7;->g()LDR7;

    move-result-object v2

    invoke-virtual {v0, v2}, Lj58;->d(LDR7;)Lj58;

    invoke-virtual {v0}, Lj58;->h()LP58;

    move-result-object v14

    new-instance v0, Lzt8;

    invoke-direct {v0, v8}, Lzt8;-><init>(LBA8;)V

    iget-object v12, v8, LBA8;->f:Len9;

    sget-object v13, LO59;->A1:LO59;

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, LMm9;

    move-object v11, v3

    move-wide/from16 v15, v18

    move-object/from16 v17, v0

    invoke-direct/range {v11 .. v17}, LMm9;-><init>(Len9;LO59;Ljava/lang/Object;JLzt8;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v25

    iget-boolean v0, v8, LBA8;->i:Z

    sub-long v23, v25, v18

    iget-object v2, v8, LBA8;->g:Lqn9;

    const/4 v3, 0x1

    if-eq v3, v0, :cond_1

    const/16 v0, 0x5eed

    goto :goto_1

    :cond_1
    const/16 v0, 0x5eee

    :goto_1
    move/from16 v21, v0

    invoke-virtual/range {p1 .. p1}, LG59;->zza()I

    move-result v22

    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v26}, Lqn9;->c(IIJJ)V

    return-void
.end method
