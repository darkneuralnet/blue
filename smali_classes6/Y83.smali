.class public LY83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY83$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LEl0;",
        ">",
        "Ljava/lang/Object;",
        "LF9<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:LQN5;


# instance fields
.field public final a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "LY83$a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:LOW3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOW3<",
            "LY83$a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LQN5;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-direct {v0, v1, v2}, LQN5;-><init>(D)V

    sput-object v0, LY83;->c:LQN5;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LY83;->a:Ljava/util/Collection;

    new-instance v0, LOW3;

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/16 v6, 0x0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, LOW3;-><init>(DDDD)V

    iput-object v0, p0, LY83;->b:LOW3;

    return-void
.end method

.method public static bridge synthetic a()LQN5;
    .locals 1

    sget-object v0, LY83;->c:LQN5;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LY83;->b:LOW3;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY83$a;

    invoke-static {v3}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(LEl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    new-instance v0, LY83$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LY83$a;-><init>(LEl0;LX83;)V

    iget-object p1, p0, LY83;->b:LOW3;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LY83;->b:LOW3;

    invoke-virtual {v1, v0}, LOW3;->a(LOW3$a;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public clearItems()V
    .locals 2

    iget-object v0, p0, LY83;->b:LOW3;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    iget-object v1, p0, LY83;->b:LOW3;

    invoke-virtual {v1}, LOW3;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEl0;

    invoke-virtual {p0, v0}, LY83;->c(LEl0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(LEl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    new-instance v0, LY83$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LY83$a;-><init>(LEl0;LX83;)V

    iget-object p1, p0, LY83;->b:LOW3;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LY83;->b:LOW3;

    invoke-virtual {v1, v0}, LOW3;->e(LOW3$a;)Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public f(D)Ljava/util/Set;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    double-to-int v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    int-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v4, v2

    const-wide/high16 v2, 0x4070000000000000L    # 256.0

    div-double/2addr v4, v2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iget-object v7, v1, LY83;->b:LOW3;

    monitor-enter v7

    :try_start_0
    iget-object v8, v1, LY83;->a:Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LY83$a;

    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v9}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v10

    invoke-interface {v10}, LEl0;->shouldCluster()Z

    move-result v10

    if-nez v10, :cond_1

    invoke-static {v9}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, LY83$a;->c()LGW3;

    move-result-object v10

    invoke-virtual {v1, v10, v4, v5}, LY83;->h(LGW3;D)Lx00;

    move-result-object v10

    iget-object v11, v1, LY83;->b:LOW3;

    invoke-virtual {v11, v10}, LOW3;->f(Lx00;)Ljava/util/Collection;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_2

    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v11, LNP5;

    invoke-static {v9}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v12

    invoke-interface {v12}, LEl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    invoke-direct {v11, v12}, LNP5;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-interface {v2, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY83$a;

    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Double;

    invoke-virtual {v13}, LY83$a;->c()LGW3;

    move-result-object v15

    move-wide/from16 p1, v4

    invoke-virtual {v9}, LY83$a;->c()LGW3;

    move-result-object v4

    invoke-virtual {v1, v15, v4}, LY83;->i(LGW3;LGW3;)D

    move-result-wide v4

    if-eqz v14, :cond_5

    invoke-static {v13}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v15

    invoke-interface {v15}, LEl0;->shouldCluster()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    cmpg-double v14, v14, v4

    if-gez v14, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {v6, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LNP5;

    if-eqz v14, :cond_5

    invoke-static {v13}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v15

    invoke-virtual {v14, v15}, LNP5;->d(LEl0;)Z

    goto :goto_4

    :cond_4
    :goto_3
    move-wide/from16 v4, p1

    goto :goto_2

    :cond_5
    :goto_4
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-interface {v3, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, LY83$a;->d(LY83$a;)LEl0;

    move-result-object v4

    invoke-virtual {v11, v4}, LNP5;->c(LEl0;)Z

    invoke-interface {v6, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    move-wide/from16 p1, v4

    invoke-interface {v0, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-wide/from16 v4, p1

    goto/16 :goto_0

    :cond_7
    monitor-exit v7

    return-object v2

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g(LEl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    new-instance v0, LY83$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LY83$a;-><init>(LEl0;LX83;)V

    iget-object p1, p0, LY83;->b:LOW3;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LY83;->b:LOW3;

    invoke-virtual {v1, v0}, LOW3;->e(LOW3$a;)Z

    iget-object v1, p0, LY83;->a:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LY83;->b:LOW3;

    invoke-virtual {v1, v0}, LOW3;->a(LOW3$a;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final h(LGW3;D)Lx00;
    .locals 10

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p2, v0

    new-instance v9, Lx00;

    iget-wide v0, p1, LGW3;->a:D

    sub-double v2, v0, p2

    add-double v4, v0, p2

    iget-wide v0, p1, LGW3;->b:D

    sub-double v6, v0, p2

    add-double p1, v0, p2

    move-object v0, v9

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v6

    move-wide v7, p1

    invoke-direct/range {v0 .. v8}, Lx00;-><init>(DDDD)V

    return-object v9
.end method

.method public final i(LGW3;LGW3;)D
    .locals 6

    iget-wide v0, p1, LGW3;->a:D

    iget-wide v2, p2, LGW3;->a:D

    sub-double v4, v0, v2

    sub-double/2addr v0, v2

    mul-double/2addr v4, v0

    iget-wide v0, p1, LGW3;->b:D

    iget-wide p1, p2, LGW3;->b:D

    sub-double v2, v0, p1

    sub-double/2addr v0, p1

    mul-double/2addr v2, v0

    add-double/2addr v4, v2

    return-wide v4
.end method
