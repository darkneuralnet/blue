.class public final LyP7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhe8;

.field public b:Lam8;

.field public final c:LOg7;

.field public final d:LJy9;


# direct methods
.method public constructor <init>()V
    .locals 4

    new-instance v0, Lhe8;

    invoke-direct {v0}, Lhe8;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LyP7;->a:Lhe8;

    iget-object v1, v0, Lhe8;->b:Lam8;

    invoke-virtual {v1}, Lam8;->a()Lam8;

    move-result-object v1

    iput-object v1, p0, LyP7;->b:Lam8;

    new-instance v1, LOg7;

    invoke-direct {v1}, LOg7;-><init>()V

    iput-object v1, p0, LyP7;->c:LOg7;

    new-instance v1, LJy9;

    invoke-direct {v1}, LJy9;-><init>()V

    iput-object v1, p0, LyP7;->d:LJy9;

    new-instance v1, Loe7;

    invoke-direct {v1, p0}, Loe7;-><init>(LyP7;)V

    iget-object v2, v0, Lhe8;->d:LpH8;

    const-string v3, "internal.registerCallback"

    invoke-virtual {v2, v3, v1}, LpH8;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v1, LLB7;

    invoke-direct {v1, p0}, LLB7;-><init>(LyP7;)V

    iget-object v0, v0, Lhe8;->d:LpH8;

    const-string v2, "internal.eventLogger"

    invoke-virtual {v0, v2, v1}, LpH8;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method public final a()LOg7;
    .locals 1

    iget-object v0, p0, LyP7;->c:LOg7;

    return-object v0
.end method

.method public final synthetic b()Len7;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Ldu9;

    iget-object v1, p0, LyP7;->d:LJy9;

    invoke-direct {v0, v1}, Ldu9;-><init>(LJy9;)V

    return-object v0
.end method

.method public final c(Lsr8;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzd;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LyP7;->a:Lhe8;

    iget-object v0, v0, Lhe8;->b:Lam8;

    invoke-virtual {v0}, Lam8;->a()Lam8;

    move-result-object v0

    iput-object v0, p0, LyP7;->b:Lam8;

    invoke-virtual {p1}, Lsr8;->D()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LyP7;->a:Lhe8;

    iget-object v2, p0, LyP7;->b:Lam8;

    const/4 v3, 0x0

    new-array v4, v3, [LDs8;

    invoke-interface {v0, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LDs8;

    invoke-virtual {v1, v2, v0}, Lhe8;->a(Lam8;[LDs8;)LXs7;

    move-result-object v0

    instance-of v0, v0, Lnl7;

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lsr8;->B()Luq8;

    move-result-object p1

    invoke-virtual {p1}, Luq8;->E()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq8;

    invoke-virtual {v0}, LVq8;->D()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, LVq8;->C()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDs8;

    iget-object v4, p0, LyP7;->a:Lhe8;

    iget-object v5, p0, LyP7;->b:Lam8;

    const/4 v6, 0x1

    new-array v6, v6, [LDs8;

    aput-object v2, v6, v3

    invoke-virtual {v4, v5, v6}, Lhe8;->a(Lam8;[LDs8;)LXs7;

    move-result-object v2

    instance-of v4, v2, Lzq7;

    if-eqz v4, :cond_4

    iget-object v4, p0, LyP7;->b:Lam8;

    invoke-virtual {v4, v0}, Lam8;->h(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v0}, Lam8;->d(Ljava/lang/String;)LXs7;

    move-result-object v4

    instance-of v5, v4, Len7;

    if-eqz v5, :cond_3

    check-cast v4, Len7;

    :goto_1
    if-eqz v4, :cond_2

    iget-object v5, p0, LyP7;->b:Lam8;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v5, v2}, Len7;->d(Lam8;Ljava/util/List;)LXs7;

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Rule function is undefined: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid function name: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid rule definition"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Program loading failed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzd;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final d(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 1

    iget-object v0, p0, LyP7;->a:Lhe8;

    iget-object v0, v0, Lhe8;->d:LpH8;

    invoke-virtual {v0, p1, p2}, LpH8;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public final e(LPf7;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzd;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LyP7;->c:LOg7;

    invoke-virtual {v0, p1}, LOg7;->d(LPf7;)V

    iget-object p1, p0, LyP7;->a:Lhe8;

    iget-object p1, p1, Lhe8;->c:Lam8;

    const-string v0, "runtime.counter"

    new-instance v1, Lkm7;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v1, v2}, Lkm7;-><init>(Ljava/lang/Double;)V

    invoke-virtual {p1, v0, v1}, Lam8;->g(Ljava/lang/String;LXs7;)V

    iget-object p1, p0, LyP7;->d:LJy9;

    iget-object v0, p0, LyP7;->b:Lam8;

    invoke-virtual {v0}, Lam8;->a()Lam8;

    move-result-object v0

    iget-object v1, p0, LyP7;->c:LOg7;

    invoke-virtual {p1, v0, v1}, LJy9;->b(Lam8;LOg7;)V

    invoke-virtual {p0}, LyP7;->g()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, LyP7;->f()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzd;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LyP7;->c:LOg7;

    invoke-virtual {v0}, LOg7;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, LyP7;->c:LOg7;

    invoke-virtual {v0}, LOg7;->b()LPf7;

    move-result-object v1

    invoke-virtual {v0}, LOg7;->a()LPf7;

    move-result-object v0

    invoke-virtual {v1, v0}, LPf7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
