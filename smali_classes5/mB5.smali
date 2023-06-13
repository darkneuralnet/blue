.class public final LmB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnI4;
.implements LFB5;
.implements LZL4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LmB5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LnI4;",
        "LFB5;",
        "LZL4;"
    }
.end annotation


# static fields
.field public static final E:Z


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Ljava/lang/RuntimeException;

.field public a:I

.field public final b:Ljava/lang/String;

.field public final c:LLP5;

.field public final d:Ljava/lang/Object;

.field public final e:LTI4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTI4<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final f:LEI4;

.field public final g:Landroid/content/Context;

.field public final h:Lcom/bumptech/glide/c;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final k:LLD;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLD<",
            "*>;"
        }
    .end annotation
.end field

.field public final l:I

.field public final m:I

.field public final n:LP24;

.field public final o:LLY5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLY5<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LTI4<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field public final q:LI96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI96<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/concurrent/Executor;

.field public s:LVL4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVL4<",
            "TR;>;"
        }
    .end annotation
.end field

.field public t:LDd1$d;

.field public u:J

.field public volatile v:LDd1;

.field public w:LmB5$a;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Landroid/graphics/drawable/Drawable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "GlideRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, LmB5;->E:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LLD;IILP24;LLY5;LTI4;Ljava/util/List;LEI4;LDd1;LI96;Ljava/util/concurrent/Executor;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "LLD<",
            "*>;II",
            "LP24;",
            "LLY5<",
            "TR;>;",
            "LTI4<",
            "TR;>;",
            "Ljava/util/List<",
            "LTI4<",
            "TR;>;>;",
            "LEI4;",
            "LDd1;",
            "LI96<",
            "-TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v1, LmB5;->E:Z

    if-eqz v1, :cond_0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, LmB5;->b:Ljava/lang/String;

    invoke-static {}, LLP5;->a()LLP5;

    move-result-object v1

    iput-object v1, v0, LmB5;->c:LLP5;

    move-object v1, p3

    iput-object v1, v0, LmB5;->d:Ljava/lang/Object;

    move-object v1, p1

    iput-object v1, v0, LmB5;->g:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, LmB5;->h:Lcom/bumptech/glide/c;

    move-object v2, p4

    iput-object v2, v0, LmB5;->i:Ljava/lang/Object;

    move-object v2, p5

    iput-object v2, v0, LmB5;->j:Ljava/lang/Class;

    move-object v2, p6

    iput-object v2, v0, LmB5;->k:LLD;

    move v2, p7

    iput v2, v0, LmB5;->l:I

    move v2, p8

    iput v2, v0, LmB5;->m:I

    move-object v2, p9

    iput-object v2, v0, LmB5;->n:LP24;

    move-object v2, p10

    iput-object v2, v0, LmB5;->o:LLY5;

    move-object v2, p11

    iput-object v2, v0, LmB5;->e:LTI4;

    move-object v2, p12

    iput-object v2, v0, LmB5;->p:Ljava/util/List;

    move-object/from16 v2, p13

    iput-object v2, v0, LmB5;->f:LEI4;

    move-object/from16 v2, p14

    iput-object v2, v0, LmB5;->v:LDd1;

    move-object/from16 v2, p15

    iput-object v2, v0, LmB5;->q:LI96;

    move-object/from16 v2, p16

    iput-object v2, v0, LmB5;->r:Ljava/util/concurrent/Executor;

    sget-object v2, LmB5$a;->b:LmB5$a;

    iput-object v2, v0, LmB5;->w:LmB5$a;

    iget-object v2, v0, LmB5;->D:Ljava/lang/RuntimeException;

    if-nez v2, :cond_1

    invoke-virtual {p2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/d;

    move-result-object v1

    const-class v2, Lcom/bumptech/glide/b$c;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Glide request origin trace"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, LmB5;->D:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method

.method public static u(IF)I
    .locals 1

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p0, p0

    mul-float/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static x(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LLD;IILP24;LLY5;LTI4;Ljava/util/List;LEI4;LDd1;LI96;Ljava/util/concurrent/Executor;)LmB5;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/c;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "LLD<",
            "*>;II",
            "LP24;",
            "LLY5<",
            "TR;>;",
            "LTI4<",
            "TR;>;",
            "Ljava/util/List<",
            "LTI4<",
            "TR;>;>;",
            "LEI4;",
            "LDd1;",
            "LI96<",
            "-TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LmB5<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    new-instance v17, LmB5;

    move-object/from16 v0, v17

    invoke-direct/range {v0 .. v16}, LmB5;-><init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LLD;IILP24;LLY5;LTI4;Ljava/util/List;LEI4;LDd1;LI96;Ljava/util/concurrent/Executor;)V

    return-object v17
.end method


# virtual methods
.method public final A()V
    .locals 2

    invoke-virtual {p0}, LmB5;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LmB5;->i:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-virtual {p0}, LmB5;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0}, LmB5;->o()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, LmB5;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_3
    iget-object v1, p0, LmB5;->o:LLY5;

    invoke-interface {v1, v0}, LLY5;->onLoadFailed(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public a()Z
    .locals 3

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->e:LmB5$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Lcom/bumptech/glide/load/engine/GlideException;)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, LmB5;->y(Lcom/bumptech/glide/load/engine/GlideException;I)V

    return-void
.end method

.method public c(LVL4;LZS0;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "*>;",
            "LZS0;",
            "Z)V"
        }
    .end annotation

    iget-object v0, p0, LmB5;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iput-object v0, p0, LmB5;->t:LDd1$d;

    if-nez p1, :cond_0

    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected to receive a Resource<R> with an object of "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LmB5;->j:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " inside, but instead got null."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LmB5;->b(Lcom/bumptech/glide/load/engine/GlideException;)V

    monitor-exit v1

    return-void

    :cond_0
    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, p0, LmB5;->j:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LmB5;->l()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v3, :cond_2

    :try_start_2
    iput-object v0, p0, LmB5;->s:LVL4;

    sget-object p2, LmB5$a;->e:LmB5$a;

    iput-object p2, p0, LmB5;->w:LmB5$a;

    const-string p2, "GlideRequest"

    iget p3, p0, LmB5;->a:I

    invoke-static {p2, p3}, LNC1;->f(Ljava/lang/String;I)V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, LmB5;->v:LDd1;

    invoke-virtual {p2, p1}, LDd1;->k(LVL4;)V

    return-void

    :cond_2
    :try_start_3
    invoke-virtual {p0, p1, v2, p2, p3}, LmB5;->z(LVL4;Ljava/lang/Object;LZS0;Z)V

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :cond_3
    :goto_0
    :try_start_4
    iput-object v0, p0, LmB5;->s:LVL4;

    new-instance p2, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected to receive an object of "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LmB5;->j:Ljava/lang/Class;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but instead got "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, ""

    :goto_1
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "} inside Resource{"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "}."

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_5

    const-string v0, ""

    goto :goto_2

    :cond_5
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_2
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LmB5;->b(Lcom/bumptech/glide/load/engine/GlideException;)V

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object p2, p0, LmB5;->v:LDd1;

    invoke-virtual {p2, p1}, LDd1;->k(LVL4;)V

    return-void

    :catchall_0
    move-exception p2

    move-object v0, p1

    move-object p1, p2

    goto :goto_3

    :catchall_1
    move-exception p1

    :goto_3
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v0, :cond_6

    iget-object p2, p0, LmB5;->v:LDd1;

    invoke-virtual {p2, v0}, LDd1;->k(LVL4;)V

    :cond_6
    throw p1
.end method

.method public clear()V
    .locals 5

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LmB5;->h()V

    iget-object v1, p0, LmB5;->c:LLP5;

    invoke-virtual {v1}, LLP5;->c()V

    iget-object v1, p0, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->g:LmB5$a;

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, LmB5;->m()V

    iget-object v1, p0, LmB5;->s:LVL4;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput-object v3, p0, LmB5;->s:LVL4;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {p0}, LmB5;->j()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, LmB5;->o:LLY5;

    invoke-virtual {p0}, LmB5;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-interface {v3, v4}, LLY5;->onLoadCleared(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const-string v3, "GlideRequest"

    iget v4, p0, LmB5;->a:I

    invoke-static {v3, v4}, LNC1;->f(Ljava/lang/String;I)V

    iput-object v2, p0, LmB5;->w:LmB5$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    iget-object v0, p0, LmB5;->v:LDd1;

    invoke-virtual {v0, v1}, LDd1;->k(LVL4;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public d(II)V
    .locals 24

    move-object/from16 v15, p0

    iget-object v0, v15, LmB5;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v14, v15, LmB5;->d:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    sget-boolean v0, LmB5;->E:Z

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got onSizeReady in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v15, LmB5;->u:J

    invoke-static {v2, v3}, Ltx2;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, LmB5;->t(Ljava/lang/String;)V

    :cond_0
    iget-object v1, v15, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->d:LmB5$a;

    if-eq v1, v2, :cond_1

    monitor-exit v14

    return-void

    :cond_1
    sget-object v13, LmB5$a;->c:LmB5$a;

    iput-object v13, v15, LmB5;->w:LmB5$a;

    iget-object v1, v15, LmB5;->k:LLD;

    invoke-virtual {v1}, LLD;->M()F

    move-result v1

    move/from16 v2, p1

    invoke-static {v2, v1}, LmB5;->u(IF)I

    move-result v2

    iput v2, v15, LmB5;->A:I

    move/from16 v2, p2

    invoke-static {v2, v1}, LmB5;->u(IF)I

    move-result v1

    iput v1, v15, LmB5;->B:I

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished setup for calling load in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v15, LmB5;->u:J

    invoke-static {v2, v3}, Ltx2;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, LmB5;->t(Ljava/lang/String;)V

    :cond_2
    iget-object v1, v15, LmB5;->v:LDd1;

    iget-object v2, v15, LmB5;->h:Lcom/bumptech/glide/c;

    iget-object v3, v15, LmB5;->i:Ljava/lang/Object;

    iget-object v4, v15, LmB5;->k:LLD;

    invoke-virtual {v4}, LLD;->J()Lak2;

    move-result-object v4

    iget v5, v15, LmB5;->A:I

    iget v6, v15, LmB5;->B:I

    iget-object v7, v15, LmB5;->k:LLD;

    invoke-virtual {v7}, LLD;->I()Ljava/lang/Class;

    move-result-object v7

    iget-object v8, v15, LmB5;->j:Ljava/lang/Class;

    iget-object v9, v15, LmB5;->n:LP24;

    iget-object v10, v15, LmB5;->k:LLD;

    invoke-virtual {v10}, LLD;->q()LB41;

    move-result-object v10

    iget-object v11, v15, LmB5;->k:LLD;

    invoke-virtual {v11}, LLD;->O()Ljava/util/Map;

    move-result-object v11

    iget-object v12, v15, LmB5;->k:LLD;

    invoke-virtual {v12}, LLD;->a0()Z

    move-result v12

    move-object/from16 v16, v13

    iget-object v13, v15, LmB5;->k:LLD;

    invoke-virtual {v13}, LLD;->W()Z

    move-result v13

    move/from16 v21, v0

    iget-object v0, v15, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->A()Lsy3;

    move-result-object v0

    move-object/from16 p1, v0

    iget-object v0, v15, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->U()Z

    move-result v0

    move/from16 p2, v0

    iget-object v0, v15, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->Q()Z

    move-result v0

    move/from16 v17, v0

    iget-object v0, v15, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->P()Z

    move-result v0

    move/from16 v18, v0

    iget-object v0, v15, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->z()Z

    move-result v0

    move/from16 v19, v0

    iget-object v0, v15, LmB5;->r:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v22, v16

    move-object/from16 v23, v14

    move-object/from16 v14, p1

    move/from16 v15, p2

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move-object/from16 v19, p0

    move-object/from16 v20, v0

    :try_start_1
    invoke-virtual/range {v1 .. v20}, LDd1;->f(Lcom/bumptech/glide/c;Ljava/lang/Object;Lak2;IILjava/lang/Class;Ljava/lang/Class;LP24;LB41;Ljava/util/Map;ZZLsy3;ZZZZLZL4;Ljava/util/concurrent/Executor;)LDd1$d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v1, p0

    :try_start_2
    iput-object v0, v1, LmB5;->t:LDd1$d;

    iget-object v0, v1, LmB5;->w:LmB5$a;

    move-object/from16 v2, v22

    if-eq v0, v2, :cond_3

    const/4 v0, 0x0

    iput-object v0, v1, LmB5;->t:LDd1$d;

    :cond_3
    if-eqz v21, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished onSizeReady in "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, LmB5;->u:J

    invoke-static {v2, v3}, Ltx2;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LmB5;->t(Ljava/lang/String;)V

    :cond_4
    monitor-exit v23

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object/from16 v23, v14

    move-object v1, v15

    :goto_0
    monitor-exit v23
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    goto :goto_0
.end method

.method public e(LnI4;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, LmB5;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    iget-object v2, v1, LmB5;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v4, v1, LmB5;->l:I

    iget v5, v1, LmB5;->m:I

    iget-object v6, v1, LmB5;->i:Ljava/lang/Object;

    iget-object v7, v1, LmB5;->j:Ljava/lang/Class;

    iget-object v8, v1, LmB5;->k:LLD;

    iget-object v9, v1, LmB5;->n:LP24;

    iget-object v10, v1, LmB5;->p:Ljava/util/List;

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    goto :goto_0

    :cond_1
    move v10, v3

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    check-cast v0, LmB5;

    iget-object v11, v0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v11

    :try_start_1
    iget v2, v0, LmB5;->l:I

    iget v12, v0, LmB5;->m:I

    iget-object v13, v0, LmB5;->i:Ljava/lang/Object;

    iget-object v14, v0, LmB5;->j:Ljava/lang/Class;

    iget-object v15, v0, LmB5;->k:LLD;

    iget-object v3, v0, LmB5;->n:LP24;

    iget-object v0, v0, LmB5;->p:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v4, v2, :cond_3

    if-ne v5, v12, :cond_3

    invoke-static {v6, v13}, Lpi6;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v8, v15}, LLD;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-ne v9, v3, :cond_3

    if-ne v10, v0, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    return v3

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public f()Z
    .locals 3

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->g:LmB5$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LmB5;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()V
    .locals 2

    iget-boolean v0, p0, LmB5;->C:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()V
    .locals 5

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LmB5;->h()V

    iget-object v1, p0, LmB5;->c:LLP5;

    invoke-virtual {v1}, LLP5;->c()V

    invoke-static {}, Ltx2;->b()J

    move-result-wide v1

    iput-wide v1, p0, LmB5;->u:J

    iget-object v1, p0, LmB5;->i:Ljava/lang/Object;

    if-nez v1, :cond_2

    iget v1, p0, LmB5;->l:I

    iget v2, p0, LmB5;->m:I

    invoke-static {v1, v2}, Lpi6;->t(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, LmB5;->l:I

    iput v1, p0, LmB5;->A:I

    iget v1, p0, LmB5;->m:I

    iput v1, p0, LmB5;->B:I

    :cond_0
    invoke-virtual {p0}, LmB5;->p()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    :goto_0
    new-instance v2, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v3, "Received null model"

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, LmB5;->y(Lcom/bumptech/glide/load/engine/GlideException;I)V

    monitor-exit v0

    return-void

    :cond_2
    iget-object v2, p0, LmB5;->w:LmB5$a;

    sget-object v3, LmB5$a;->c:LmB5$a;

    if-eq v2, v3, :cond_8

    sget-object v4, LmB5$a;->e:LmB5$a;

    if-ne v2, v4, :cond_3

    iget-object v1, p0, LmB5;->s:LVL4;

    sget-object v2, LZS0;->f:LZS0;

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, LmB5;->c(LVL4;LZS0;Z)V

    monitor-exit v0

    return-void

    :cond_3
    invoke-virtual {p0, v1}, LmB5;->n(Ljava/lang/Object;)V

    const-string v1, "GlideRequest"

    invoke-static {v1}, LNC1;->b(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, LmB5;->a:I

    sget-object v1, LmB5$a;->d:LmB5$a;

    iput-object v1, p0, LmB5;->w:LmB5$a;

    iget v2, p0, LmB5;->l:I

    iget v4, p0, LmB5;->m:I

    invoke-static {v2, v4}, Lpi6;->t(II)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, LmB5;->l:I

    iget v4, p0, LmB5;->m:I

    invoke-virtual {p0, v2, v4}, LmB5;->d(II)V

    goto :goto_1

    :cond_4
    iget-object v2, p0, LmB5;->o:LLY5;

    invoke-interface {v2, p0}, LLY5;->getSize(LFB5;)V

    :goto_1
    iget-object v2, p0, LmB5;->w:LmB5$a;

    if-eq v2, v3, :cond_5

    if-ne v2, v1, :cond_6

    :cond_5
    invoke-virtual {p0}, LmB5;->k()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, LmB5;->o:LLY5;

    invoke-virtual {p0}, LmB5;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, LLY5;->onLoadStarted(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    sget-boolean v1, LmB5;->E:Z

    if-eqz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished run method in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LmB5;->u:J

    invoke-static {v2, v3}, Ltx2;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LmB5;->t(Ljava/lang/String;)V

    :cond_7
    monitor-exit v0

    return-void

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isComplete()Z
    .locals 3

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->e:LmB5$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isRunning()Z
    .locals 3

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->w:LmB5$a;

    sget-object v2, LmB5$a;->c:LmB5$a;

    if-eq v1, v2, :cond_1

    sget-object v2, LmB5$a;->d:LmB5$a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->b(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public final k()Z
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->c(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public final l()Z
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LEI4;->g(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public final m()V
    .locals 1

    invoke-virtual {p0}, LmB5;->h()V

    iget-object v0, p0, LmB5;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v0, p0, LmB5;->o:LLY5;

    invoke-interface {v0, p0}, LLY5;->removeCallback(LFB5;)V

    iget-object v0, p0, LmB5;->t:LDd1$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDd1$d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LmB5;->t:LDd1$d;

    :cond_0
    return-void
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LmB5;->p:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTI4;

    instance-of v2, v1, Lti1;

    if-eqz v2, :cond_1

    check-cast v1, Lti1;

    invoke-virtual {v1, p1}, Lti1;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final o()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LmB5;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->t()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->r()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->r()I

    move-result v0

    invoke-virtual {p0, v0}, LmB5;->s(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->x:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, LmB5;->x:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final p()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LmB5;->z:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->w()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->z:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->y()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->y()I

    move-result v0

    invoke-virtual {p0, v0}, LmB5;->s(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->z:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, LmB5;->z:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LmB5;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LmB5;->clear()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final q()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LmB5;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->D()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->G()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->G()I

    move-result v0

    invoke-virtual {p0, v0}, LmB5;->s(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LmB5;->y:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, LmB5;->y:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LEI4;->getRoot()LEI4;

    move-result-object v0

    invoke-interface {v0}, LEI4;->a()Z

    move-result v0

    if-nez v0, :cond_0

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

.method public final s(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->N()Landroid/content/res/Resources$Theme;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LmB5;->k:LLD;

    invoke-virtual {v0}, LLD;->N()Landroid/content/res/Resources$Theme;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LmB5;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    :goto_0
    iget-object v1, p0, LmB5;->h:Lcom/bumptech/glide/c;

    invoke-static {v1, p1, v0}, LS61;->a(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final t(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " this: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LmB5;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GlideRequest"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->i:Ljava/lang/Object;

    iget-object v2, p0, LmB5;->j:Ljava/lang/Class;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[model="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcodeClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, LEI4;->h(LnI4;)V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, LmB5;->f:LEI4;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, LEI4;->d(LnI4;)V

    :cond_0
    return-void
.end method

.method public final y(Lcom/bumptech/glide/load/engine/GlideException;I)V
    .locals 8

    iget-object v0, p0, LmB5;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v0, p0, LmB5;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LmB5;->D:Ljava/lang/RuntimeException;

    invoke-virtual {p1, v1}, Lcom/bumptech/glide/load/engine/GlideException;->k(Ljava/lang/Exception;)V

    iget-object v1, p0, LmB5;->h:Lcom/bumptech/glide/c;

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->h()I

    move-result v1

    if-gt v1, p2, :cond_0

    const-string p2, "Glide"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Load failed for ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LmB5;->i:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "] with dimensions ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LmB5;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LmB5;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    if-gt v1, p2, :cond_0

    const-string p2, "Glide"

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;->g(Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    iput-object p2, p0, LmB5;->t:LDd1$d;

    sget-object p2, LmB5$a;->f:LmB5$a;

    iput-object p2, p0, LmB5;->w:LmB5$a;

    invoke-virtual {p0}, LmB5;->v()V

    const/4 p2, 0x1

    iput-boolean p2, p0, LmB5;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, LmB5;->p:Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LTI4;

    iget-object v5, p0, LmB5;->i:Ljava/lang/Object;

    iget-object v6, p0, LmB5;->o:LLY5;

    invoke-virtual {p0}, LmB5;->r()Z

    move-result v7

    invoke-interface {v4, p1, v5, v6, v7}, LTI4;->a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;LLY5;Z)Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_0

    :cond_1
    move v3, v1

    :cond_2
    iget-object v2, p0, LmB5;->e:LTI4;

    if-eqz v2, :cond_3

    iget-object v4, p0, LmB5;->i:Ljava/lang/Object;

    iget-object v5, p0, LmB5;->o:LLY5;

    invoke-virtual {p0}, LmB5;->r()Z

    move-result v6

    invoke-interface {v2, p1, v4, v5, v6}, LTI4;->a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;LLY5;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move p2, v1

    :goto_1
    or-int p1, v3, p2

    if-nez p1, :cond_4

    invoke-virtual {p0}, LmB5;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :try_start_2
    iput-boolean v1, p0, LmB5;->C:Z

    const-string p1, "GlideRequest"

    iget p2, p0, LmB5;->a:I

    invoke-static {p1, p2}, LNC1;->f(Ljava/lang/String;I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, LmB5;->C:Z

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final z(LVL4;Ljava/lang/Object;LZS0;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TR;>;TR;",
            "LZS0;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0}, LmB5;->r()Z

    move-result p4

    sget-object v0, LmB5$a;->e:LmB5$a;

    iput-object v0, p0, LmB5;->w:LmB5$a;

    iput-object p1, p0, LmB5;->s:LVL4;

    iget-object p1, p0, LmB5;->h:Lcom/bumptech/glide/c;

    invoke-virtual {p1}, Lcom/bumptech/glide/c;->h()I

    move-result p1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Finished loading "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " from "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LmB5;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with size ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LmB5;->A:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LmB5;->B:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] in "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LmB5;->u:J

    invoke-static {v0, v1}, Ltx2;->a(J)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Glide"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, LmB5;->w()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LmB5;->C:Z

    const/4 v6, 0x0

    :try_start_0
    iget-object v0, p0, LmB5;->p:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v8, v6

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTI4;

    iget-object v2, p0, LmB5;->i:Ljava/lang/Object;

    iget-object v3, p0, LmB5;->o:LLY5;

    move-object v1, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, LTI4;->onResourceReady(Ljava/lang/Object;Ljava/lang/Object;LLY5;LZS0;Z)Z

    move-result v0

    or-int/2addr v8, v0

    goto :goto_0

    :cond_1
    move v8, v6

    :cond_2
    iget-object v0, p0, LmB5;->e:LTI4;

    if-eqz v0, :cond_3

    iget-object v2, p0, LmB5;->i:Ljava/lang/Object;

    iget-object v3, p0, LmB5;->o:LLY5;

    move-object v1, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, LTI4;->onResourceReady(Ljava/lang/Object;Ljava/lang/Object;LLY5;LZS0;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move p1, v6

    :goto_1
    or-int/2addr p1, v8

    if-nez p1, :cond_4

    iget-object p1, p0, LmB5;->q:LI96;

    invoke-interface {p1, p3, p4}, LI96;->a(LZS0;Z)LG96;

    move-result-object p1

    iget-object p3, p0, LmB5;->o:LLY5;

    invoke-interface {p3, p2, p1}, LLY5;->onResourceReady(Ljava/lang/Object;LG96;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    iput-boolean v6, p0, LmB5;->C:Z

    const-string p1, "GlideRequest"

    iget p2, p0, LmB5;->a:I

    invoke-static {p1, p2}, LNC1;->f(Ljava/lang/String;I)V

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v6, p0, LmB5;->C:Z

    throw p1
.end method
