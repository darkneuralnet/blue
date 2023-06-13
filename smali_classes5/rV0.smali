.class public LrV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJS0$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Luj1$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LrV0$h;,
        LrV0$g;,
        LrV0$e;,
        LrV0$b;,
        LrV0$d;,
        LrV0$f;,
        LrV0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LJS0$a;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "LrV0<",
        "*>;>;",
        "Luj1$f;"
    }
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:LZS0;

.field public C:LIS0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LIS0<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile D:LJS0;

.field public volatile E:Z

.field public volatile F:Z

.field public G:Z

.field public final b:LoV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoV0<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LLP5;

.field public final e:LrV0$e;

.field public final f:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "LrV0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final g:LrV0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrV0$d<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:LrV0$f;

.field public i:Lcom/bumptech/glide/c;

.field public j:Lak2;

.field public k:LP24;

.field public l:LHd1;

.field public m:I

.field public n:I

.field public o:LB41;

.field public p:Lsy3;

.field public q:LrV0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrV0$b<",
            "TR;>;"
        }
    .end annotation
.end field

.field public r:I

.field public s:LrV0$h;

.field public t:LrV0$g;

.field public u:J

.field public v:Z

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Thread;

.field public y:Lak2;

.field public z:Lak2;


# direct methods
.method public constructor <init>(LrV0$e;LgY3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrV0$e;",
            "LgY3<",
            "LrV0<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LoV0;

    invoke-direct {v0}, LoV0;-><init>()V

    iput-object v0, p0, LrV0;->b:LoV0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LrV0;->c:Ljava/util/List;

    invoke-static {}, LLP5;->a()LLP5;

    move-result-object v0

    iput-object v0, p0, LrV0;->d:LLP5;

    new-instance v0, LrV0$d;

    invoke-direct {v0}, LrV0$d;-><init>()V

    iput-object v0, p0, LrV0;->g:LrV0$d;

    new-instance v0, LrV0$f;

    invoke-direct {v0}, LrV0$f;-><init>()V

    iput-object v0, p0, LrV0;->h:LrV0$f;

    iput-object p1, p0, LrV0;->e:LrV0$e;

    iput-object p2, p0, LrV0;->f:LgY3;

    return-void
.end method


# virtual methods
.method public final E()V
    .locals 4

    iget-object v0, p0, LrV0;->h:LrV0$f;

    invoke-virtual {v0}, LrV0$f;->e()V

    iget-object v0, p0, LrV0;->g:LrV0$d;

    invoke-virtual {v0}, LrV0$d;->a()V

    iget-object v0, p0, LrV0;->b:LoV0;

    invoke-virtual {v0}, LoV0;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LrV0;->E:Z

    const/4 v1, 0x0

    iput-object v1, p0, LrV0;->i:Lcom/bumptech/glide/c;

    iput-object v1, p0, LrV0;->j:Lak2;

    iput-object v1, p0, LrV0;->p:Lsy3;

    iput-object v1, p0, LrV0;->k:LP24;

    iput-object v1, p0, LrV0;->l:LHd1;

    iput-object v1, p0, LrV0;->q:LrV0$b;

    iput-object v1, p0, LrV0;->s:LrV0$h;

    iput-object v1, p0, LrV0;->D:LJS0;

    iput-object v1, p0, LrV0;->x:Ljava/lang/Thread;

    iput-object v1, p0, LrV0;->y:Lak2;

    iput-object v1, p0, LrV0;->A:Ljava/lang/Object;

    iput-object v1, p0, LrV0;->B:LZS0;

    iput-object v1, p0, LrV0;->C:LIS0;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, LrV0;->u:J

    iput-boolean v0, p0, LrV0;->F:Z

    iput-object v1, p0, LrV0;->w:Ljava/lang/Object;

    iget-object v0, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LrV0;->f:LgY3;

    invoke-interface {v0, p0}, LgY3;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final F(LrV0$g;)V
    .locals 0

    iput-object p1, p0, LrV0;->t:LrV0$g;

    iget-object p1, p0, LrV0;->q:LrV0$b;

    invoke-interface {p1, p0}, LrV0$b;->d(LrV0;)V

    return-void
.end method

.method public final H()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, LrV0;->x:Ljava/lang/Thread;

    invoke-static {}, Ltx2;->b()J

    move-result-wide v0

    iput-wide v0, p0, LrV0;->u:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, LrV0;->F:Z

    if-nez v1, :cond_1

    iget-object v1, p0, LrV0;->D:LJS0;

    if-eqz v1, :cond_1

    iget-object v0, p0, LrV0;->D:LJS0;

    invoke-interface {v0}, LJS0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, LrV0;->s:LrV0$h;

    invoke-virtual {p0, v1}, LrV0;->k(LrV0$h;)LrV0$h;

    move-result-object v1

    iput-object v1, p0, LrV0;->s:LrV0$h;

    invoke-virtual {p0}, LrV0;->j()LJS0;

    move-result-object v1

    iput-object v1, p0, LrV0;->D:LJS0;

    iget-object v1, p0, LrV0;->s:LrV0$h;

    sget-object v2, LrV0$h;->e:LrV0$h;

    if-ne v1, v2, :cond_0

    sget-object v0, LrV0$g;->c:LrV0$g;

    invoke-virtual {p0, v0}, LrV0;->F(LrV0$g;)V

    return-void

    :cond_1
    iget-object v1, p0, LrV0;->s:LrV0$h;

    sget-object v2, LrV0$h;->g:LrV0$h;

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, LrV0;->F:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, LrV0;->s()V

    :cond_3
    return-void
.end method

.method public final J(Ljava/lang/Object;LZS0;Lit2;)LVL4;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "ResourceType:",
            "Ljava/lang/Object;",
            ">(TData;",
            "LZS0;",
            "Lit2<",
            "TData;TResourceType;TR;>;)",
            "LVL4<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    invoke-virtual {p0, p2}, LrV0;->l(LZS0;)Lsy3;

    move-result-object v2

    iget-object v0, p0, LrV0;->i:Lcom/bumptech/glide/c;

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->i()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/a;

    move-result-object p1

    :try_start_0
    iget v3, p0, LrV0;->m:I

    iget v4, p0, LrV0;->n:I

    new-instance v5, LrV0$c;

    invoke-direct {v5, p0, p2}, LrV0$c;-><init>(LrV0;LZS0;)V

    move-object v0, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lit2;->a(Lcom/bumptech/glide/load/data/a;Lsy3;IILsV0$a;)LVL4;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/a;->cleanup()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/a;->cleanup()V

    throw p2
.end method

.method public final K()V
    .locals 3

    sget-object v0, LrV0$a;->a:[I

    iget-object v1, p0, LrV0;->t:LrV0$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LrV0;->i()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LrV0;->t:LrV0$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, LrV0;->H()V

    goto :goto_0

    :cond_2
    sget-object v0, LrV0$h;->b:LrV0$h;

    invoke-virtual {p0, v0}, LrV0;->k(LrV0$h;)LrV0$h;

    move-result-object v0

    iput-object v0, p0, LrV0;->s:LrV0$h;

    invoke-virtual {p0}, LrV0;->j()LJS0;

    move-result-object v0

    iput-object v0, p0, LrV0;->D:LJS0;

    invoke-virtual {p0}, LrV0;->H()V

    :goto_0
    return-void
.end method

.method public final L()V
    .locals 3

    iget-object v0, p0, LrV0;->d:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-boolean v0, p0, LrV0;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, LrV0;->E:Z

    return-void
.end method

.method public M()Z
    .locals 2

    sget-object v0, LrV0$h;->b:LrV0$h;

    invoke-virtual {p0, v0}, LrV0;->k(LrV0$h;)LrV0$h;

    move-result-object v0

    sget-object v1, LrV0$h;->c:LrV0$h;

    if-eq v0, v1, :cond_1

    sget-object v1, LrV0$h;->d:LrV0$h;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public a(Lak2;Ljava/lang/Exception;LIS0;LZS0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "Ljava/lang/Exception;",
            "LIS0<",
            "*>;",
            "LZS0;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, LIS0;->cleanup()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3}, LIS0;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p1, p4, p2}, Lcom/bumptech/glide/load/engine/GlideException;->j(Lak2;LZS0;Ljava/lang/Class;)V

    iget-object p1, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, LrV0;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    sget-object p1, LrV0$g;->c:LrV0$g;

    invoke-virtual {p0, p1}, LrV0;->F(LrV0$g;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LrV0;->H()V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LrV0;->F:Z

    iget-object v0, p0, LrV0;->D:LJS0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LJS0;->cancel()V

    :cond_0
    return-void
.end method

.method public c(Lak2;Ljava/lang/Object;LIS0;LZS0;Lak2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "Ljava/lang/Object;",
            "LIS0<",
            "*>;",
            "LZS0;",
            "Lak2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LrV0;->y:Lak2;

    iput-object p2, p0, LrV0;->A:Ljava/lang/Object;

    iput-object p3, p0, LrV0;->C:LIS0;

    iput-object p4, p0, LrV0;->B:LZS0;

    iput-object p5, p0, LrV0;->z:Lak2;

    iget-object p2, p0, LrV0;->b:LoV0;

    invoke-virtual {p2}, LoV0;->c()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, LrV0;->G:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, LrV0;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    sget-object p1, LrV0$g;->d:LrV0$g;

    invoke-virtual {p0, p1}, LrV0;->F(LrV0$g;)V

    goto :goto_0

    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    invoke-static {p1}, LNC1;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, LrV0;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LNC1;->e()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, LNC1;->e()V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LrV0;

    invoke-virtual {p0, p1}, LrV0;->f(LrV0;)I

    move-result p1

    return p1
.end method

.method public d()V
    .locals 1

    sget-object v0, LrV0$g;->c:LrV0$g;

    invoke-virtual {p0, v0}, LrV0;->F(LrV0$g;)V

    return-void
.end method

.method public e()LLP5;
    .locals 1

    iget-object v0, p0, LrV0;->d:LLP5;

    return-object v0
.end method

.method public f(LrV0;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrV0<",
            "*>;)I"
        }
    .end annotation

    invoke-virtual {p0}, LrV0;->m()I

    move-result v0

    invoke-virtual {p1}, LrV0;->m()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LrV0;->r:I

    iget p1, p1, LrV0;->r:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final g(LIS0;Ljava/lang/Object;LZS0;)LVL4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "LIS0<",
            "*>;TData;",
            "LZS0;",
            ")",
            "LVL4<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-interface {p1}, LIS0;->cleanup()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Ltx2;->b()J

    move-result-wide v0

    invoke-virtual {p0, p2, p3}, LrV0;->h(Ljava/lang/Object;LZS0;)LVL4;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded result "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v0, v1}, LrV0;->o(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-interface {p1}, LIS0;->cleanup()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, LIS0;->cleanup()V

    throw p2
.end method

.method public final h(Ljava/lang/Object;LZS0;)LVL4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "LZS0;",
            ")",
            "LVL4<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/load/engine/GlideException;
        }
    .end annotation

    iget-object v0, p0, LrV0;->b:LoV0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LoV0;->h(Ljava/lang/Class;)Lit2;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, LrV0;->J(Ljava/lang/Object;LZS0;Lit2;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public final i()V
    .locals 4

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, LrV0;->u:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LrV0;->A:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cache key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LrV0;->y:Lak2;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", fetcher: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LrV0;->C:LIS0;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Retrieved data"

    invoke-virtual {p0, v3, v0, v1, v2}, LrV0;->p(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, LrV0;->C:LIS0;

    iget-object v1, p0, LrV0;->A:Ljava/lang/Object;

    iget-object v2, p0, LrV0;->B:LZS0;

    invoke-virtual {p0, v0, v1, v2}, LrV0;->g(LIS0;Ljava/lang/Object;LZS0;)LVL4;

    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LrV0;->z:Lak2;

    iget-object v2, p0, LrV0;->B:LZS0;

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/load/engine/GlideException;->i(Lak2;LZS0;)V

    iget-object v1, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, LrV0;->B:LZS0;

    iget-boolean v2, p0, LrV0;->G:Z

    invoke-virtual {p0, v0, v1, v2}, LrV0;->r(LVL4;LZS0;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LrV0;->H()V

    :goto_1
    return-void
.end method

.method public final j()LJS0;
    .locals 3

    sget-object v0, LrV0$a;->b:[I

    iget-object v1, p0, LrV0;->s:LrV0$h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LrV0;->s:LrV0$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, LCN5;

    iget-object v1, p0, LrV0;->b:LoV0;

    invoke-direct {v0, v1, p0}, LCN5;-><init>(LoV0;LJS0$a;)V

    return-object v0

    :cond_2
    new-instance v0, LBS0;

    iget-object v1, p0, LrV0;->b:LoV0;

    invoke-direct {v0, v1, p0}, LBS0;-><init>(LoV0;LJS0$a;)V

    return-object v0

    :cond_3
    new-instance v0, LXL4;

    iget-object v1, p0, LrV0;->b:LoV0;

    invoke-direct {v0, v1, p0}, LXL4;-><init>(LoV0;LJS0$a;)V

    return-object v0
.end method

.method public final k(LrV0$h;)LrV0$h;
    .locals 3

    sget-object v0, LrV0$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object p1, p0, LrV0;->o:LB41;

    invoke-virtual {p1}, LB41;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LrV0$h;->c:LrV0$h;

    goto :goto_0

    :cond_0
    sget-object p1, LrV0$h;->c:LrV0$h;

    invoke-virtual {p0, p1}, LrV0;->k(LrV0$h;)LrV0$h;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, LrV0$h;->g:LrV0$h;

    return-object p1

    :cond_3
    iget-boolean p1, p0, LrV0;->v:Z

    if-eqz p1, :cond_4

    sget-object p1, LrV0$h;->g:LrV0$h;

    goto :goto_1

    :cond_4
    sget-object p1, LrV0$h;->e:LrV0$h;

    :goto_1
    return-object p1

    :cond_5
    iget-object p1, p0, LrV0;->o:LB41;

    invoke-virtual {p1}, LB41;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, LrV0$h;->d:LrV0$h;

    goto :goto_2

    :cond_6
    sget-object p1, LrV0$h;->d:LrV0$h;

    invoke-virtual {p0, p1}, LrV0;->k(LrV0$h;)LrV0$h;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final l(LZS0;)Lsy3;
    .locals 3

    iget-object v0, p0, LrV0;->p:Lsy3;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    return-object v0

    :cond_0
    sget-object v1, LZS0;->e:LZS0;

    if-eq p1, v1, :cond_2

    iget-object p1, p0, LrV0;->b:LoV0;

    invoke-virtual {p1}, LoV0;->x()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    sget-object v1, Li61;->j:Liy3;

    invoke-virtual {v0, v1}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    return-object v0

    :cond_4
    new-instance v0, Lsy3;

    invoke-direct {v0}, Lsy3;-><init>()V

    iget-object v2, p0, LrV0;->p:Lsy3;

    invoke-virtual {v0, v2}, Lsy3;->d(Lsy3;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lsy3;->e(Liy3;Ljava/lang/Object;)Lsy3;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, LrV0;->k:LP24;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public n(Lcom/bumptech/glide/c;Ljava/lang/Object;LHd1;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZZLsy3;LrV0$b;I)LrV0;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "LHd1;",
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
            "*>;>;ZZZ",
            "Lsy3;",
            "LrV0$b<",
            "TR;>;I)",
            "LrV0<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LrV0;->b:LoV0;

    iget-object v15, v0, LrV0;->e:LrV0$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p15

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v15}, LoV0;->v(Lcom/bumptech/glide/c;Ljava/lang/Object;Lak2;IILB41;Ljava/lang/Class;Ljava/lang/Class;LP24;Lsy3;Ljava/util/Map;ZZLrV0$e;)V

    move-object/from16 v1, p1

    iput-object v1, v0, LrV0;->i:Lcom/bumptech/glide/c;

    move-object/from16 v1, p4

    iput-object v1, v0, LrV0;->j:Lak2;

    move-object/from16 v1, p9

    iput-object v1, v0, LrV0;->k:LP24;

    move-object/from16 v1, p3

    iput-object v1, v0, LrV0;->l:LHd1;

    move/from16 v1, p5

    iput v1, v0, LrV0;->m:I

    move/from16 v1, p6

    iput v1, v0, LrV0;->n:I

    move-object/from16 v1, p10

    iput-object v1, v0, LrV0;->o:LB41;

    move/from16 v1, p14

    iput-boolean v1, v0, LrV0;->v:Z

    move-object/from16 v1, p15

    iput-object v1, v0, LrV0;->p:Lsy3;

    move-object/from16 v1, p16

    iput-object v1, v0, LrV0;->q:LrV0$b;

    move/from16 v1, p17

    iput v1, v0, LrV0;->r:I

    sget-object v1, LrV0$g;->b:LrV0$g;

    iput-object v1, v0, LrV0;->t:LrV0$g;

    move-object/from16 v1, p2

    iput-object v1, v0, LrV0;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final o(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, LrV0;->p(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public final p(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Ltx2;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LrV0;->l:LHd1;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final q(LVL4;LZS0;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TR;>;",
            "LZS0;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0}, LrV0;->L()V

    iget-object v0, p0, LrV0;->q:LrV0$b;

    invoke-interface {v0, p1, p2, p3}, LrV0$b;->c(LVL4;LZS0;Z)V

    return-void
.end method

.method public final r(LVL4;LZS0;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TR;>;",
            "LZS0;",
            "Z)V"
        }
    .end annotation

    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    invoke-static {v0}, LNC1;->a(Ljava/lang/String;)V

    :try_start_0
    instance-of v0, p1, Lv22;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv22;

    invoke-interface {v0}, Lv22;->c()V

    :cond_0
    iget-object v0, p0, LrV0;->g:LrV0$d;

    invoke-virtual {v0}, LrV0$d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljx2;->f(LVL4;)Ljx2;

    move-result-object p1

    move-object v0, p1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, LrV0;->q(LVL4;LZS0;Z)V

    sget-object p1, LrV0$h;->f:LrV0$h;

    iput-object p1, p0, LrV0;->s:LrV0$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p1, p0, LrV0;->g:LrV0$d;

    invoke-virtual {p1}, LrV0$d;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LrV0;->g:LrV0$d;

    iget-object p2, p0, LrV0;->e:LrV0$e;

    iget-object p3, p0, LrV0;->p:Lsy3;

    invoke-virtual {p1, p2, p3}, LrV0$d;->b(LrV0$e;Lsy3;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {v0}, Ljx2;->h()V

    :cond_3
    invoke-virtual {p0}, LrV0;->t()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, LNC1;->e()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_4

    :try_start_3
    invoke-virtual {v0}, Ljx2;->h()V

    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {}, LNC1;->e()V

    throw p1
.end method

.method public run()V
    .locals 5

    const-string v0, "DecodeJob"

    iget-object v1, p0, LrV0;->t:LrV0$g;

    iget-object v2, p0, LrV0;->w:Ljava/lang/Object;

    const-string v3, "DecodeJob#run(reason=%s, model=%s)"

    invoke-static {v3, v1, v2}, LNC1;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, LrV0;->C:LIS0;

    :try_start_0
    iget-boolean v2, p0, LrV0;->F:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LrV0;->s()V
    :try_end_0
    .catch LJ80; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, LIS0;->cleanup()V

    :cond_0
    invoke-static {}, LNC1;->e()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p0}, LrV0;->K()V
    :try_end_1
    .catch LJ80; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, LIS0;->cleanup()V

    :cond_2
    invoke-static {}, LNC1;->e()V

    return-void

    :catchall_0
    move-exception v2

    const/4 v3, 0x3

    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, LrV0;->F:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LrV0;->s:LrV0$h;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget-object v0, p0, LrV0;->s:LrV0$h;

    sget-object v3, LrV0$h;->f:LrV0$h;

    if-eq v0, v3, :cond_4

    iget-object v0, p0, LrV0;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LrV0;->s()V

    :cond_4
    iget-boolean v0, p0, LrV0;->F:Z

    if-nez v0, :cond_5

    throw v2

    :cond_5
    throw v2

    :catch_0
    move-exception v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz v1, :cond_6

    invoke-interface {v1}, LIS0;->cleanup()V

    :cond_6
    invoke-static {}, LNC1;->e()V

    throw v0
.end method

.method public final s()V
    .locals 3

    invoke-virtual {p0}, LrV0;->L()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, LrV0;->c:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "Failed to load resource"

    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, LrV0;->q:LrV0$b;

    invoke-interface {v1, v0}, LrV0$b;->b(Lcom/bumptech/glide/load/engine/GlideException;)V

    invoke-virtual {p0}, LrV0;->u()V

    return-void
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, LrV0;->h:LrV0$f;

    invoke-virtual {v0}, LrV0$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrV0;->E()V

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, LrV0;->h:LrV0$f;

    invoke-virtual {v0}, LrV0$f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrV0;->E()V

    :cond_0
    return-void
.end method

.method public v(LZS0;LVL4;)LVL4;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "LZS0;",
            "LVL4<",
            "TZ;>;)",
            "LVL4<",
            "TZ;>;"
        }
    .end annotation

    invoke-interface {p2}, LVL4;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v0, LZS0;->e:LZS0;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, LrV0;->b:LoV0;

    invoke-virtual {v0, v8}, LoV0;->s(Ljava/lang/Class;)Lr96;

    move-result-object v0

    iget-object v2, p0, LrV0;->i:Lcom/bumptech/glide/c;

    iget v3, p0, LrV0;->m:I

    iget v4, p0, LrV0;->n:I

    invoke-interface {v0, v2, p2, v3, v4}, Lr96;->b(Landroid/content/Context;LVL4;II)LVL4;

    move-result-object v2

    move-object v7, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v7, v1

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {p2}, LVL4;->b()V

    :cond_1
    iget-object p2, p0, LrV0;->b:LoV0;

    invoke-virtual {p2, v0}, LoV0;->w(LVL4;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LrV0;->b:LoV0;

    invoke-virtual {p2, v0}, LoV0;->n(LVL4;)LeM4;

    move-result-object v1

    iget-object p2, p0, LrV0;->p:Lsy3;

    invoke-interface {v1, p2}, LeM4;->a(Lsy3;)Lfb1;

    move-result-object p2

    goto :goto_1

    :cond_2
    sget-object p2, Lfb1;->d:Lfb1;

    :goto_1
    move-object v10, v1

    iget-object v1, p0, LrV0;->b:LoV0;

    iget-object v2, p0, LrV0;->y:Lak2;

    invoke-virtual {v1, v2}, LoV0;->y(Lak2;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, LrV0;->o:LB41;

    invoke-virtual {v3, v1, p1, p2}, LB41;->d(ZLZS0;Lfb1;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    sget-object p1, LrV0$a;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    if-eq p1, v2, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    new-instance p1, LYL4;

    iget-object p2, p0, LrV0;->b:LoV0;

    invoke-virtual {p2}, LoV0;->b()Lto;

    move-result-object v2

    iget-object v3, p0, LrV0;->y:Lak2;

    iget-object v4, p0, LrV0;->j:Lak2;

    iget v5, p0, LrV0;->m:I

    iget v6, p0, LrV0;->n:I

    iget-object v9, p0, LrV0;->p:Lsy3;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, LYL4;-><init>(Lto;Lak2;Lak2;IILr96;Ljava/lang/Class;Lsy3;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown strategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, LCS0;

    iget-object p2, p0, LrV0;->y:Lak2;

    iget-object v1, p0, LrV0;->j:Lak2;

    invoke-direct {p1, p2, v1}, LCS0;-><init>(Lak2;Lak2;)V

    :goto_2
    invoke-static {v0}, Ljx2;->f(LVL4;)Ljx2;

    move-result-object v0

    iget-object p2, p0, LrV0;->g:LrV0$d;

    invoke-virtual {p2, p1, v10, v0}, LrV0$d;->d(Lak2;LeM4;Ljx2;)V

    goto :goto_3

    :cond_5
    new-instance p1, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    invoke-interface {v0}, LVL4;->get()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_6
    :goto_3
    return-object v0
.end method

.method public w(Z)V
    .locals 1

    iget-object v0, p0, LrV0;->h:LrV0$f;

    invoke-virtual {v0, p1}, LrV0$f;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LrV0;->E()V

    :cond_0
    return-void
.end method
