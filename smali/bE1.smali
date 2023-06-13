.class public LbE1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxm5;
.implements LEC6;
.implements LAh1;


# static fields
.field public static final k:Ljava/lang/String;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LaD6;

.field public final d:LFC6;

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LHG6;",
            ">;"
        }
    .end annotation
.end field

.field public f:LuZ0;

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:LjP5;

.field public j:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "GreedyScheduler"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LbE1;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Ll66;LaD6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LbE1;->e:Ljava/util/Set;

    new-instance v0, LjP5;

    invoke-direct {v0}, LjP5;-><init>()V

    iput-object v0, p0, LbE1;->i:LjP5;

    iput-object p1, p0, LbE1;->b:Landroid/content/Context;

    iput-object p4, p0, LbE1;->c:LaD6;

    new-instance p1, LGC6;

    invoke-direct {p1, p3, p0}, LGC6;-><init>(Ll66;LEC6;)V

    iput-object p1, p0, LbE1;->d:LFC6;

    new-instance p1, LuZ0;

    invoke-virtual {p2}, Landroidx/work/a;->k()Lfd5;

    move-result-object p2

    invoke-direct {p1, p0, p2}, LuZ0;-><init>(LbE1;Lfd5;)V

    iput-object p1, p0, LbE1;->f:LuZ0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbE1;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LHG6;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHG6;

    invoke-static {v0}, LKG6;->a(LHG6;)LTC6;

    move-result-object v0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v2, LbE1;->k:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Constraints not met: Cancelling work ID "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LbE1;->i:LjP5;

    invoke-virtual {v1, v0}, LjP5;->b(LTC6;)LiP5;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LbE1;->c:LaD6;

    invoke-virtual {v1, v0}, LaD6;->D(LiP5;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public varargs b([LHG6;)V
    .locals 11

    iget-object v0, p0, LbE1;->j:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LbE1;->g()V

    :cond_0
    iget-object v0, p0, LbE1;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, LbE1;->k:Ljava/lang/String;

    const-string v1, "Ignoring schedule request in a secondary process"

    invoke-virtual {p1, v0, v1}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, LbE1;->h()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    aget-object v4, p1, v3

    invoke-static {v4}, LKG6;->a(LHG6;)LTC6;

    move-result-object v5

    iget-object v6, p0, LbE1;->i:LjP5;

    invoke-virtual {v6, v5}, LjP5;->a(LTC6;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v4}, LHG6;->c()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v9, v4, LHG6;->b:LUC6$a;

    sget-object v10, LUC6$a;->b:LUC6$a;

    if-ne v9, v10, :cond_7

    cmp-long v5, v7, v5

    if-gez v5, :cond_3

    iget-object v5, p0, LbE1;->f:LuZ0;

    if-eqz v5, :cond_7

    invoke-virtual {v5, v4}, LuZ0;->a(LHG6;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v4}, LHG6;->h()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v4, LHG6;->j:Llz0;

    invoke-virtual {v5}, Llz0;->h()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v5

    sget-object v6, LbE1;->k:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Requires device idle."

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    iget-object v5, v4, LHG6;->j:Llz0;

    invoke-virtual {v5}, Llz0;->e()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v5

    sget-object v6, LbE1;->k:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Requires ContentUri triggers."

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v4, v4, LHG6;->a:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v5, p0, LbE1;->i:LjP5;

    invoke-static {v4}, LKG6;->a(LHG6;)LTC6;

    move-result-object v6

    invoke-virtual {v5, v6}, LjP5;->a(LTC6;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v5

    sget-object v6, LbE1;->k:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Starting work for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v4, LHG6;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, LbE1;->c:LaD6;

    iget-object v6, p0, LbE1;->i:LjP5;

    invoke-virtual {v6, v4}, LjP5;->e(LHG6;)LiP5;

    move-result-object v4

    invoke-virtual {v5, v4}, LaD6;->A(LiP5;)V

    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    iget-object p1, p0, LbE1;->h:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    const-string v2, ","

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    sget-object v3, LbE1;->k:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Starting tracking for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LbE1;->e:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LbE1;->d:LFC6;

    iget-object v1, p0, LbE1;->e:Ljava/util/Set;

    invoke-interface {v0, v1}, LFC6;->a(Ljava/lang/Iterable;)V

    :cond_9
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(LTC6;Z)V
    .locals 0

    iget-object p2, p0, LbE1;->i:LjP5;

    invoke-virtual {p2, p1}, LjP5;->b(LTC6;)LiP5;

    invoke-virtual {p0, p1}, LbE1;->i(LTC6;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LbE1;->j:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LbE1;->g()V

    :cond_0
    iget-object v0, p0, LbE1;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, LbE1;->k:Ljava/lang/String;

    const-string v1, "Ignoring schedule request in non-main process"

    invoke-virtual {p1, v0, v1}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, LbE1;->h()V

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LbE1;->k:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cancelling work ID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LbE1;->f:LuZ0;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LuZ0;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LbE1;->i:LjP5;

    invoke-virtual {v0, p1}, LjP5;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiP5;

    iget-object v1, p0, LbE1;->c:LaD6;

    invoke-virtual {v1, v0}, LaD6;->D(LiP5;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public f(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LHG6;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHG6;

    invoke-static {v0}, LKG6;->a(LHG6;)LTC6;

    move-result-object v0

    iget-object v1, p0, LbE1;->i:LjP5;

    invoke-virtual {v1, v0}, LjP5;->a(LTC6;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v2, LbE1;->k:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Constraints met: Scheduling work ID "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LbE1;->c:LaD6;

    iget-object v2, p0, LbE1;->i:LjP5;

    invoke-virtual {v2, v0}, LjP5;->d(LTC6;)LiP5;

    move-result-object v0

    invoke-virtual {v1, v0}, LaD6;->A(LiP5;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, LbE1;->c:LaD6;

    invoke-virtual {v0}, LaD6;->n()Landroidx/work/a;

    move-result-object v0

    iget-object v1, p0, LbE1;->b:Landroid/content/Context;

    invoke-static {v1, v0}, LR64;->b(Landroid/content/Context;Landroidx/work/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LbE1;->j:Ljava/lang/Boolean;

    return-void
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, LbE1;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LbE1;->c:LaD6;

    invoke-virtual {v0}, LaD6;->r()Li74;

    move-result-object v0

    invoke-virtual {v0, p0}, Li74;->g(LAh1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LbE1;->g:Z

    :cond_0
    return-void
.end method

.method public final i(LTC6;)V
    .locals 6

    iget-object v0, p0, LbE1;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LbE1;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHG6;

    invoke-static {v2}, LKG6;->a(LHG6;)LTC6;

    move-result-object v3

    invoke-virtual {v3, p1}, LTC6;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v3, LbE1;->k:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Stopping tracking for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LbE1;->e:Ljava/util/Set;

    invoke-interface {p1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LbE1;->d:LFC6;

    iget-object v1, p0, LbE1;->e:Ljava/util/Set;

    invoke-interface {p1, v1}, LFC6;->a(Ljava/lang/Iterable;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
