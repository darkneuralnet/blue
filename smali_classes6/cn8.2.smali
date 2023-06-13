.class public final Lcn8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Lnl8<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "LOl8<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:LP78;

.field public final e:Lk69;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk69<",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LDu8;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LEv8;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LP78;LEv8;Ljava/util/Map;Ltw8;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LP78;",
            "LEv8;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LDu8;",
            ">;",
            "Ltw8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    iput-object p5, p0, Lcn8;->a:Ljava/util/Map;

    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    iput-object p5, p0, Lcn8;->b:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcn8;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lcn8;->d:LP78;

    iput-object p3, p0, Lcn8;->g:LEv8;

    iput-object p4, p0, Lcn8;->f:Ljava/util/Map;

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LyK8;->e(Z)V

    sget-object p1, LPm8;->a:LPm8;

    iput-object p1, p0, Lcn8;->e:Lk69;

    return-void
.end method


# virtual methods
.method public final a(LOl8;)Lnl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">(",
            "LOl8<",
            "TT;>;)",
            "Lnl8<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcn8;->b(LOl8;)Lnl8;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b(LOl8;)Lnl8;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">(",
            "LOl8<",
            "TT;>;)",
            "Lnl8<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, LOl8;->a()Landroid/net/Uri;

    move-result-object v8

    iget-object v2, v1, Lcn8;->a:Ljava/util/Map;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnl8;

    if-nez v2, :cond_4

    invoke-virtual/range {p1 .. p1}, LOl8;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    move-result v3

    const-string v4, "Uri must be hierarchical: %s"

    invoke-static {v3, v4, v2}, LyK8;->g(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LeM8;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, -0x1

    if-ne v5, v7, :cond_0

    const-string v3, ""

    goto :goto_0

    :cond_0
    add-int/2addr v5, v6

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v5, "pb"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "Uri extension must be .pb: %s"

    invoke-static {v3, v5, v2}, LyK8;->g(ZLjava/lang/String;Ljava/lang/Object;)V

    const-string v2, "singleproc"

    iget-object v3, v1, Lcn8;->f:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LDu8;

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    const-string v9, "No XDataStoreVariantFactory registered for ID %s"

    invoke-static {v6, v9, v2}, LyK8;->g(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LOl8;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LeM8;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    if-eq v4, v7, :cond_2

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v4, v2

    invoke-virtual/range {p1 .. p1}, LOl8;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object v2

    iget-object v5, v1, Lcn8;->e:Lk69;

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v6

    invoke-static {v2, v5, v6}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v12

    iget-object v5, v1, Lcn8;->c:Ljava/util/concurrent/Executor;

    iget-object v6, v1, Lcn8;->d:LP78;

    const/4 v7, 0x1

    move-object v2, v3

    move-object/from16 v3, p1

    invoke-virtual/range {v2 .. v7}, LDu8;->a(LOl8;Ljava/lang/String;Ljava/util/concurrent/Executor;LP78;I)Lpu8;

    move-result-object v10

    new-instance v2, Lnl8;

    iget-object v11, v1, Lcn8;->g:LEv8;

    invoke-virtual/range {p1 .. p1}, LOl8;->f()Z

    move-result v13

    invoke-virtual/range {p1 .. p1}, LOl8;->e()Z

    move-result v14

    const/4 v15, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, Lnl8;-><init>(Lpu8;LEv8;LMb9;ZZ[B)V

    invoke-virtual/range {p1 .. p1}, LOl8;->c()LZP8;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, v1, Lcn8;->c:Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Lal8;->a(Ljava/util/List;Ljava/util/concurrent/Executor;)Lal8;

    move-result-object v3

    invoke-virtual {v2, v3}, LOs8;->n(Lk69;)V

    :cond_3
    iget-object v3, v1, Lcn8;->a:Ljava/util/Map;

    invoke-interface {v3, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v1, Lcn8;->b:Ljava/util/Map;

    invoke-interface {v3, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-object v3, v1, Lcn8;->b:Ljava/util/Map;

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LOl8;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "Arguments must match previous call for Uri: %s"

    invoke-static {v0, v3, v8}, LyK8;->g(ZLjava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
