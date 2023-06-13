.class public final Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;
.super Lco/bird/android/persistence/bird/impl/BirdDatabase;
.source "SourceFile"


# instance fields
.field public volatile q:LbL;

.field public volatile r:LJM;

.field public volatile s:Li40;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/persistence/bird/impl/BirdDatabase;-><init>()V

    return-void
.end method

.method public static synthetic F(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic G(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic H(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic I(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic J(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic K(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic L(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic M(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;LmV5;)LmV5;
    .locals 0

    iput-object p1, p0, LEb5;->a:LmV5;

    return-object p1
.end method

.method public static synthetic N(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;LmV5;)V
    .locals 0

    invoke-virtual {p0, p1}, LEb5;->u(LmV5;)V

    return-void
.end method

.method public static synthetic O(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic P(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public C()LbL;
    .locals 1

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->q:LbL;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->q:LbL;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->q:LbL;

    if-nez v0, :cond_1

    new-instance v0, LcL;

    invoke-direct {v0, p0}, LcL;-><init>(LEb5;)V

    iput-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->q:LbL;

    :cond_1
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->q:LbL;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public D()LJM;
    .locals 1

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->r:LJM;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->r:LJM;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->r:LJM;

    if-nez v0, :cond_1

    new-instance v0, LKM;

    invoke-direct {v0, p0}, LKM;-><init>(LEb5;)V

    iput-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->r:LJM;

    :cond_1
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->r:LJM;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public E()Li40;
    .locals 1

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->s:Li40;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->s:Li40;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->s:Li40;

    if-nez v0, :cond_1

    new-instance v0, Lj40;

    invoke-direct {v0, p0}, Lj40;-><init>(LEb5;)V

    iput-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->s:Li40;

    :cond_1
    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->s:Li40;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Lq72;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Lq72;

    const-string v3, "bird_map_markers"

    const-string v4, "bulk_scan_purpose_bird"

    const-string v5, "bird"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Lq72;-><init>(LEb5;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public f(LfT0;)LnV5;
    .locals 4

    new-instance v0, LGb5;

    new-instance v1, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;-><init>(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;I)V

    const-string v2, "e99b26f117bbff9b672a4a1d58cce5de"

    const-string v3, "da662aea2677732ab03a0005b410c7d4"

    invoke-direct {v0, p1, v1, v2, v3}, LGb5;-><init>(LfT0;LGb5$b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, LfT0;->a:Landroid/content/Context;

    invoke-static {v1}, LnV5$b;->a(Landroid/content/Context;)LnV5$b$a;

    move-result-object v1

    iget-object v2, p1, LfT0;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, LnV5$b$a;->d(Ljava/lang/String;)LnV5$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LnV5$b$a;->c(LnV5$a;)LnV5$b$a;

    move-result-object v0

    invoke-virtual {v0}, LnV5$b$a;->b()LnV5$b;

    move-result-object v0

    iget-object p1, p1, LfT0;->c:LnV5$c;

    invoke-interface {p1, v0}, LnV5$c;->a(LnV5$b;)LnV5;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LTq;",
            ">;",
            "LTq;",
            ">;)",
            "Ljava/util/List<",
            "LcU2;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    new-array p1, p1, [LcU2;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public n()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LTq;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public o()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, LbL;

    invoke-static {}, LcL;->r()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LJM;

    invoke-static {}, LKM;->r()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li40;

    invoke-static {}, Lj40;->j()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
