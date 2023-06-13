.class public LDd1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGd1;
.implements LOP2$a;
.implements LJd1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDd1$b;,
        LDd1$a;,
        LDd1$c;,
        LDd1$d;
    }
.end annotation


# static fields
.field public static final i:Z


# instance fields
.field public final a:LUh2;

.field public final b:LId1;

.field public final c:LOP2;

.field public final d:LDd1$b;

.field public final e:LpM4;

.field public final f:LDd1$c;

.field public final g:LDd1$a;

.field public final h:LM2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, LDd1;->i:Z

    return-void
.end method

.method public constructor <init>(LOP2;Lz41$a;LKC1;LKC1;LKC1;LKC1;LUh2;LId1;LM2;LDd1$b;LDd1$a;LpM4;Z)V
    .locals 11

    move-object v7, p0

    move-object v8, p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v8, v7, LDd1;->c:LOP2;

    new-instance v9, LDd1$c;

    move-object v0, p2

    invoke-direct {v9, p2}, LDd1$c;-><init>(Lz41$a;)V

    iput-object v9, v7, LDd1;->f:LDd1$c;

    if-nez p9, :cond_0

    new-instance v0, LM2;

    move/from16 v1, p13

    invoke-direct {v0, v1}, LM2;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p9

    :goto_0
    iput-object v0, v7, LDd1;->h:LM2;

    invoke-virtual {v0, p0}, LM2;->f(LJd1$a;)V

    if-nez p8, :cond_1

    new-instance v0, LId1;

    invoke-direct {v0}, LId1;-><init>()V

    goto :goto_1

    :cond_1
    move-object/from16 v0, p8

    :goto_1
    iput-object v0, v7, LDd1;->b:LId1;

    if-nez p7, :cond_2

    new-instance v0, LUh2;

    invoke-direct {v0}, LUh2;-><init>()V

    goto :goto_2

    :cond_2
    move-object/from16 v0, p7

    :goto_2
    iput-object v0, v7, LDd1;->a:LUh2;

    if-nez p10, :cond_3

    new-instance v10, LDd1$b;

    move-object v0, v10

    move-object v1, p3

    move-object v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, LDd1$b;-><init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;)V

    goto :goto_3

    :cond_3
    move-object/from16 v10, p10

    :goto_3
    iput-object v10, v7, LDd1;->d:LDd1$b;

    if-nez p11, :cond_4

    new-instance v0, LDd1$a;

    invoke-direct {v0, v9}, LDd1$a;-><init>(LrV0$e;)V

    goto :goto_4

    :cond_4
    move-object/from16 v0, p11

    :goto_4
    iput-object v0, v7, LDd1;->g:LDd1$a;

    if-nez p12, :cond_5

    new-instance v0, LpM4;

    invoke-direct {v0}, LpM4;-><init>()V

    goto :goto_5

    :cond_5
    move-object/from16 v0, p12

    :goto_5
    iput-object v0, v7, LDd1;->e:LpM4;

    invoke-interface {p1, p0}, LOP2;->c(LOP2$a;)V

    return-void
.end method

.method public constructor <init>(LOP2;Lz41$a;LKC1;LKC1;LKC1;LKC1;Z)V
    .locals 14

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v13, p7

    invoke-direct/range {v0 .. v13}, LDd1;-><init>(LOP2;Lz41$a;LKC1;LKC1;LKC1;LKC1;LUh2;LId1;LM2;LDd1$b;LDd1$a;LpM4;Z)V

    return-void
.end method

.method public static j(Ljava/lang/String;JLak2;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Ltx2;->a(J)D

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, key: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Engine"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public a(Lak2;LJd1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "LJd1<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LDd1;->h:LM2;

    invoke-virtual {v0, p1}, LM2;->d(Lak2;)V

    invoke-virtual {p2}, LJd1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDd1;->c:LOP2;

    invoke-interface {v0, p1, p2}, LOP2;->e(Lak2;LVL4;)LVL4;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LDd1;->e:LpM4;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, LpM4;->a(LVL4;Z)V

    :goto_0
    return-void
.end method

.method public declared-synchronized b(LFd1;Lak2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFd1<",
            "*>;",
            "Lak2;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LDd1;->a:LUh2;

    invoke-virtual {v0, p2, p1}, LUh2;->d(Lak2;LFd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(LFd1;Lak2;LJd1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFd1<",
            "*>;",
            "Lak2;",
            "LJd1<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p3}, LJd1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDd1;->h:LM2;

    invoke-virtual {v0, p2, p3}, LM2;->a(Lak2;LJd1;)V

    :cond_0
    iget-object p3, p0, LDd1;->a:LUh2;

    invoke-virtual {p3, p2, p1}, LUh2;->d(Lak2;LFd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d(LVL4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LDd1;->e:LpM4;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, LpM4;->a(LVL4;Z)V

    return-void
.end method

.method public final e(Lak2;)LJd1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            ")",
            "LJd1<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LDd1;->c:LOP2;

    invoke-interface {v0, p1}, LOP2;->d(Lak2;)LVL4;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    instance-of v0, v2, LJd1;

    if-eqz v0, :cond_1

    move-object p1, v2

    check-cast p1, LJd1;

    goto :goto_0

    :cond_1
    new-instance v0, LJd1;

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v1, v0

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, LJd1;-><init>(LVL4;ZZLak2;LJd1$a;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public f(Lcom/bumptech/glide/c;Ljava/lang/Object;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZLsy3;ZZZZLZL4;Ljava/util/concurrent/Executor;)LDd1$d;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "Lak2;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "LP24;",
            "LB41;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lr96<",
            "*>;>;ZZ",
            "Lsy3;",
            "ZZZZ",
            "LZL4;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LDd1$d;"
        }
    .end annotation

    move-object/from16 v15, p0

    sget-boolean v0, LDd1;->i:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ltx2;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    move-wide v13, v0

    iget-object v0, v15, LDd1;->b:LId1;

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p10

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p13

    invoke-virtual/range {v0 .. v8}, LId1;->a(Ljava/lang/Object;Lak2;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lsy3;)LHd1;

    move-result-object v0

    monitor-enter p0

    move/from16 v12, p14

    :try_start_0
    invoke-virtual {v15, v0, v12, v13, v14}, LDd1;->i(LHd1;ZJ)LJd1;

    move-result-object v1

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v22, v13

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, v0

    invoke-virtual/range {v1 .. v23}, LDd1;->l(Lcom/bumptech/glide/c;Ljava/lang/Object;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZLsy3;ZZZZLZL4;Ljava/util/concurrent/Executor;LHd1;J)LDd1$d;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, LZS0;->f:LZS0;

    const/4 v2, 0x0

    move-object/from16 v3, p18

    invoke-interface {v3, v1, v0, v2}, LZL4;->c(LVL4;LZS0;Z)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g(Lak2;)LJd1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            ")",
            "LJd1<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LDd1;->h:LM2;

    invoke-virtual {v0, p1}, LM2;->e(Lak2;)LJd1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJd1;->c()V

    :cond_0
    return-object p1
.end method

.method public final h(Lak2;)LJd1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            ")",
            "LJd1<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LDd1;->e(Lak2;)LJd1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJd1;->c()V

    iget-object v1, p0, LDd1;->h:LM2;

    invoke-virtual {v1, p1, v0}, LM2;->a(Lak2;LJd1;)V

    :cond_0
    return-object v0
.end method

.method public final i(LHd1;ZJ)LJd1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHd1;",
            "ZJ)",
            "LJd1<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, LDd1;->g(Lak2;)LJd1;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-boolean v0, LDd1;->i:Z

    if-eqz v0, :cond_1

    const-string v0, "Loaded resource from active resources"

    invoke-static {v0, p3, p4, p1}, LDd1;->j(Ljava/lang/String;JLak2;)V

    :cond_1
    return-object p2

    :cond_2
    invoke-virtual {p0, p1}, LDd1;->h(Lak2;)LJd1;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-boolean v0, LDd1;->i:Z

    if-eqz v0, :cond_3

    const-string v0, "Loaded resource from cache"

    invoke-static {v0, p3, p4, p1}, LDd1;->j(Ljava/lang/String;JLak2;)V

    :cond_3
    return-object p2

    :cond_4
    return-object v0
.end method

.method public k(LVL4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "*>;)V"
        }
    .end annotation

    instance-of v0, p1, LJd1;

    if-eqz v0, :cond_0

    check-cast p1, LJd1;

    invoke-virtual {p1}, LJd1;->g()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l(Lcom/bumptech/glide/c;Ljava/lang/Object;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZLsy3;ZZZZLZL4;Ljava/util/concurrent/Executor;LHd1;J)LDd1$d;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "Lak2;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "LP24;",
            "LB41;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lr96<",
            "*>;>;ZZ",
            "Lsy3;",
            "ZZZZ",
            "LZL4;",
            "Ljava/util/concurrent/Executor;",
            "LHd1;",
            "J)",
            "LDd1$d;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    move-object/from16 v15, p20

    move-wide/from16 v13, p21

    iget-object v3, v0, LDd1;->a:LUh2;

    move/from16 v12, p17

    invoke-virtual {v3, v15, v12}, LUh2;->a(Lak2;Z)LFd1;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1, v2}, LFd1;->a(LZL4;Ljava/util/concurrent/Executor;)V

    sget-boolean v2, LDd1;->i:Z

    if-eqz v2, :cond_0

    const-string v2, "Added to existing load"

    invoke-static {v2, v13, v14, v15}, LDd1;->j(Ljava/lang/String;JLak2;)V

    :cond_0
    new-instance v2, LDd1$d;

    invoke-direct {v2, v0, v1, v3}, LDd1$d;-><init>(LDd1;LZL4;LFd1;)V

    return-object v2

    :cond_1
    iget-object v3, v0, LDd1;->d:LDd1$b;

    move-object/from16 v4, p20

    move/from16 v5, p14

    move/from16 v6, p15

    move/from16 v7, p16

    move/from16 v8, p17

    invoke-virtual/range {v3 .. v8}, LDd1$b;->a(Lak2;ZZZZ)LFd1;

    move-result-object v11

    move-object/from16 v19, v11

    iget-object v3, v0, LDd1;->g:LDd1$a;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p20

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    move-object v1, v11

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move-object v2, v15

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v17, p17

    move-object/from16 v18, p13

    invoke-virtual/range {v3 .. v19}, LDd1$a;->a(Lcom/bumptech/glide/c;Ljava/lang/Object;LHd1;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZZLsy3;LrV0$b;)LrV0;

    move-result-object v3

    iget-object v4, v0, LDd1;->a:LUh2;

    invoke-virtual {v4, v2, v1}, LUh2;->c(Lak2;LFd1;)V

    move-object v5, v1

    move-object v4, v2

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    invoke-virtual {v5, v1, v2}, LFd1;->a(LZL4;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v5, v3}, LFd1;->s(LrV0;)V

    sget-boolean v2, LDd1;->i:Z

    if-eqz v2, :cond_2

    const-string v2, "Started new load"

    move-wide/from16 v6, p21

    invoke-static {v2, v6, v7, v4}, LDd1;->j(Ljava/lang/String;JLak2;)V

    :cond_2
    new-instance v2, LDd1$d;

    invoke-direct {v2, v0, v1, v5}, LDd1$d;-><init>(LDd1;LZL4;LFd1;)V

    return-object v2
.end method
