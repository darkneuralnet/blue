.class public final Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;
.super Lco/bird/android/persistence/area/impl/AreaDatabase;
.source "SourceFile"


# instance fields
.field public volatile q:LXm;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/persistence/area/impl/AreaDatabase;-><init>()V

    return-void
.end method

.method public static synthetic D(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic E(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic F(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic G(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic H(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic I(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic J(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic K(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;LmV5;)LmV5;
    .locals 0

    iput-object p1, p0, LEb5;->a:LmV5;

    return-object p1
.end method

.method public static synthetic L(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;LmV5;)V
    .locals 0

    invoke-virtual {p0, p1}, LEb5;->u(LmV5;)V

    return-void
.end method

.method public static synthetic M(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic N(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LEb5;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public C()LXm;
    .locals 1

    iget-object v0, p0, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;->q:LXm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;->q:LXm;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;->q:LXm;

    if-nez v0, :cond_1

    new-instance v0, LYm;

    invoke-direct {v0, p0}, LYm;-><init>(LEb5;)V

    iput-object v0, p0, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;->q:LXm;

    :cond_1
    iget-object v0, p0, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;->q:LXm;

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
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Lq72;

    const-string v3, "area"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Lq72;-><init>(LEb5;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public f(LfT0;)LnV5;
    .locals 4

    new-instance v0, LGb5;

    new-instance v1, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl$a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lco/bird/android/persistence/area/impl/AreaDatabase_Impl$a;-><init>(Lco/bird/android/persistence/area/impl/AreaDatabase_Impl;I)V

    const-string v2, "3ff962d986233e40c6d03620266af9c1"

    const-string v3, "32c4e9edcd83688427f576010fcb3351"

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

    const-class v1, LXm;

    invoke-static {}, LYm;->r()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
