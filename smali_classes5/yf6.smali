.class public Lyf6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LVv;

.field public final c:LQg1;

.field public final d:LFG6;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:LBX5;

.field public final g:Lbl0;

.field public final h:Lbl0;

.field public final i:LGk0;


# direct methods
.method public constructor <init>(Landroid/content/Context;LVv;LQg1;LFG6;Ljava/util/concurrent/Executor;LBX5;Lbl0;Lbl0;LGk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf6;->a:Landroid/content/Context;

    iput-object p2, p0, Lyf6;->b:LVv;

    iput-object p3, p0, Lyf6;->c:LQg1;

    iput-object p4, p0, Lyf6;->d:LFG6;

    iput-object p5, p0, Lyf6;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lyf6;->f:LBX5;

    iput-object p7, p0, Lyf6;->g:Lbl0;

    iput-object p8, p0, Lyf6;->h:Lbl0;

    iput-object p9, p0, Lyf6;->i:LGk0;

    return-void
.end method

.method public static synthetic a(Lyf6;LT96;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lyf6;->t(LT96;ILjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lyf6;LT96;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lyf6;->l(LT96;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyf6;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lyf6;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lyf6;LT96;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lyf6;->m(LT96;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lyf6;Ljava/lang/Iterable;LT96;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lyf6;->n(Ljava/lang/Iterable;LT96;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lyf6;LT96;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lyf6;->r(LT96;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lyf6;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lyf6;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lyf6;LT96;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lyf6;->s(LT96;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lyf6;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lyf6;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(LT96;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lyf6;->c:LQg1;

    invoke-interface {v0, p1}, LQg1;->q2(LT96;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(LT96;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lyf6;->c:LQg1;

    invoke-interface {v0, p1}, LQg1;->E1(LT96;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;LT96;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyf6;->c:LQg1;

    invoke-interface {v0, p1}, LQg1;->w2(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lyf6;->c:LQg1;

    iget-object v0, p0, Lyf6;->g:Lbl0;

    invoke-interface {v0}, Lbl0;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, LQg1;->w1(LT96;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyf6;->c:LQg1;

    invoke-interface {v0, p1}, LQg1;->D1(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyf6;->i:LGk0;

    invoke-interface {v0}, LGk0;->a()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lyf6;->i:LGk0;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lox2$b;->h:Lox2$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, LGk0;->d(JLox2$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(LT96;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyf6;->c:LQg1;

    iget-object v1, p0, Lyf6;->g:Lbl0;

    invoke-interface {v1}, Lbl0;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, LQg1;->w1(LT96;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(LT96;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyf6;->d:LFG6;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, LFG6;->a(LT96;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(LT96;ILjava/lang/Runnable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lyf6;->f:LBX5;

    iget-object v1, p0, Lyf6;->c:LQg1;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lxf6;

    invoke-direct {v2, v1}, Lxf6;-><init>(LQg1;)V

    invoke-interface {v0, v2}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lyf6;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lyf6;->f:LBX5;

    new-instance v1, Lof6;

    invoke-direct {v1, p0, p1, p2}, Lof6;-><init>(Lyf6;LT96;I)V

    invoke-interface {v0, v1}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lyf6;->u(LT96;I)LXv;
    :try_end_0
    .catch Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Lyf6;->d:LFG6;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, LFG6;->a(LT96;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(LS96;)LJg1;
    .locals 4

    iget-object v0, p0, Lyf6;->f:LBX5;

    iget-object v1, p0, Lyf6;->i:LGk0;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lvf6;

    invoke-direct {v2, v1}, Lvf6;-><init>(LGk0;)V

    invoke-interface {v0, v2}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJk0;

    invoke-static {}, LJg1;->a()LJg1$a;

    move-result-object v1

    iget-object v2, p0, Lyf6;->g:Lbl0;

    invoke-interface {v2}, Lbl0;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LJg1$a;->i(J)LJg1$a;

    move-result-object v1

    iget-object v2, p0, Lyf6;->h:Lbl0;

    invoke-interface {v2}, Lbl0;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LJg1$a;->k(J)LJg1$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, LJg1$a;->j(Ljava/lang/String;)LJg1$a;

    move-result-object v1

    new-instance v2, Lkb1;

    const-string v3, "proto"

    invoke-static {v3}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v3

    invoke-virtual {v0}, LJk0;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lkb1;-><init>(LPc1;[B)V

    invoke-virtual {v1, v2}, LJg1$a;->h(Lkb1;)LJg1$a;

    move-result-object v0

    invoke-virtual {v0}, LJg1$a;->d()LJg1;

    move-result-object v0

    invoke-interface {p1, v0}, LS96;->b(LJg1;)LJg1;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lyf6;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(LT96;I)LXv;
    .locals 11

    iget-object v0, p0, Lyf6;->b:LVv;

    invoke-virtual {p1}, LT96;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LVv;->get(Ljava/lang/String;)LS96;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, LXv;->e(J)LXv;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Lyf6;->f:LBX5;

    new-instance v2, Lnf6;

    invoke-direct {v2, p0, p1}, Lnf6;-><init>(Lyf6;LT96;)V

    invoke-interface {v1, v2}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lyf6;->f:LBX5;

    new-instance v2, Lpf6;

    invoke-direct {v2, p0, p1}, Lpf6;-><init>(Lyf6;LT96;)V

    invoke-interface {v1, v2}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, LRx2;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, LXv;->a()LXv;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LkR3;

    invoke-virtual {v3}, LkR3;->b()LJg1;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, LT96;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lyf6;->j(LS96;)LJg1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, LWv;->a()LWv$a;

    move-result-object v2

    invoke-virtual {v2, v1}, LWv$a;->b(Ljava/lang/Iterable;)LWv$a;

    move-result-object v1

    invoke-virtual {p1}, LT96;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, LWv$a;->c([B)LWv$a;

    move-result-object v1

    invoke-virtual {v1}, LWv$a;->a()LWv;

    move-result-object v1

    invoke-interface {v0, v1}, LS96;->a(LWv;)LXv;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, LXv;->c()LXv$a;

    move-result-object v1

    sget-object v2, LXv$a;->c:LXv$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Lyf6;->f:LBX5;

    new-instance v1, Lqf6;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lqf6;-><init>(Lyf6;Ljava/lang/Iterable;LT96;J)V

    invoke-interface {v0, v1}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    iget-object v0, p0, Lyf6;->d:LFG6;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, LFG6;->b(LT96;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Lyf6;->f:LBX5;

    new-instance v2, Lrf6;

    invoke-direct {v2, p0, v6}, Lrf6;-><init>(Lyf6;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    invoke-virtual {v3}, LXv;->c()LXv$a;

    move-result-object v1

    sget-object v2, LXv$a;->b:LXv$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, LXv;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, LT96;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lyf6;->f:LBX5;

    new-instance v5, Lsf6;

    invoke-direct {v5, p0}, Lsf6;-><init>(Lyf6;)V

    invoke-interface {v4, v5}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, LXv;->c()LXv$a;

    move-result-object v1

    sget-object v2, LXv$a;->e:LXv$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LkR3;

    invoke-virtual {v4}, LkR3;->b()LJg1;

    move-result-object v4

    invoke-virtual {v4}, LJg1;->j()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v2, p0, Lyf6;->f:LBX5;

    new-instance v4, Ltf6;

    invoke-direct {v4, p0, v1}, Ltf6;-><init>(Lyf6;Ljava/util/Map;)V

    invoke-interface {v2, v4}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Lyf6;->f:LBX5;

    new-instance v0, Luf6;

    invoke-direct {v0, p0, p1, v8, v9}, Luf6;-><init>(Lyf6;LT96;J)V

    invoke-interface {p2, v0}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(LT96;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lyf6;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lwf6;

    invoke-direct {v1, p0, p1, p2, p3}, Lwf6;-><init>(Lyf6;LT96;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
