.class public final Landroidx/work/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/a$b;,
        Landroidx/work/a$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:LQG6;

.field public final d:Li32;

.field public final e:Lfd5;

.field public final f:Lrz0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrz0<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lrz0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrz0<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z


# direct methods
.method public constructor <init>(Landroidx/work/a$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Landroidx/work/a$b;->a:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/work/a;->a(Z)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/a;->a:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Landroidx/work/a;->a:Ljava/util/concurrent/Executor;

    :goto_0
    iget-object v0, p1, Landroidx/work/a$b;->d:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/a;->m:Z

    invoke-virtual {p0, v0}, Landroidx/work/a;->a(Z)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/a;->b:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Landroidx/work/a;->m:Z

    iput-object v0, p0, Landroidx/work/a;->b:Ljava/util/concurrent/Executor;

    :goto_1
    iget-object v0, p1, Landroidx/work/a$b;->b:LQG6;

    if-nez v0, :cond_2

    invoke-static {}, LQG6;->c()LQG6;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/a;->c:LQG6;

    goto :goto_2

    :cond_2
    iput-object v0, p0, Landroidx/work/a;->c:LQG6;

    :goto_2
    iget-object v0, p1, Landroidx/work/a$b;->c:Li32;

    if-nez v0, :cond_3

    invoke-static {}, Li32;->c()Li32;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/a;->d:Li32;

    goto :goto_3

    :cond_3
    iput-object v0, p0, Landroidx/work/a;->d:Li32;

    :goto_3
    iget-object v0, p1, Landroidx/work/a$b;->e:Lfd5;

    if-nez v0, :cond_4

    new-instance v0, LvY0;

    invoke-direct {v0}, LvY0;-><init>()V

    iput-object v0, p0, Landroidx/work/a;->e:Lfd5;

    goto :goto_4

    :cond_4
    iput-object v0, p0, Landroidx/work/a;->e:Lfd5;

    :goto_4
    iget v0, p1, Landroidx/work/a$b;->i:I

    iput v0, p0, Landroidx/work/a;->i:I

    iget v0, p1, Landroidx/work/a$b;->j:I

    iput v0, p0, Landroidx/work/a;->j:I

    iget v0, p1, Landroidx/work/a$b;->k:I

    iput v0, p0, Landroidx/work/a;->k:I

    iget v0, p1, Landroidx/work/a$b;->l:I

    iput v0, p0, Landroidx/work/a;->l:I

    iget-object v0, p1, Landroidx/work/a$b;->f:Lrz0;

    iput-object v0, p0, Landroidx/work/a;->f:Lrz0;

    iget-object v0, p1, Landroidx/work/a$b;->g:Lrz0;

    iput-object v0, p0, Landroidx/work/a;->g:Lrz0;

    iget-object p1, p1, Landroidx/work/a$b;->h:Ljava/lang/String;

    iput-object p1, p0, Landroidx/work/a;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/util/concurrent/Executor;
    .locals 2

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/work/a;->b(Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    return-object p1
.end method

.method public final b(Z)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0, p0, p1}, Landroidx/work/a$a;-><init>(Landroidx/work/a;Z)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public e()Lrz0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrz0<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/a;->f:Lrz0;

    return-object v0
.end method

.method public f()Li32;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->d:Li32;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Landroidx/work/a;->k:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Landroidx/work/a;->l:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Landroidx/work/a;->j:I

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Landroidx/work/a;->i:I

    return v0
.end method

.method public k()Lfd5;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->e:Lfd5;

    return-object v0
.end method

.method public l()Lrz0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrz0<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/a;->g:Lrz0;

    return-object v0
.end method

.method public m()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public n()LQG6;
    .locals 1

    iget-object v0, p0, Landroidx/work/a;->c:LQG6;

    return-object v0
.end method
