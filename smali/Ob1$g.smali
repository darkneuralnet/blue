.class public LOb1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOb1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Landroid/view/Surface;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public d:Llb1$b$a;

.field public e:Ljava/util/concurrent/Executor;

.field public final synthetic f:LOb1;


# direct methods
.method public constructor <init>(LOb1;)V
    .locals 0

    iput-object p1, p0, LOb1$g;->f:LOb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOb1$g;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LOb1$g;->c:Ljava/util/Set;

    return-void
.end method

.method public static synthetic b(Llb1$b$a;Landroid/view/Surface;)V
    .locals 0

    invoke-static {p0, p1}, LOb1$g;->c(Llb1$b$a;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic c(Llb1$b$a;Landroid/view/Surface;)V
    .locals 0

    invoke-interface {p0, p1}, Llb1$b$a;->a(Landroid/view/Surface;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Llb1$b$a;)V
    .locals 2

    iget-object v0, p0, LOb1$g;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb1$b$a;

    iput-object v1, p0, LOb1$g;->d:Llb1$b$a;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iput-object v1, p0, LOb1$g;->e:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LOb1$g;->b:Landroid/view/Surface;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2, v1}, LOb1$g;->d(Ljava/util/concurrent/Executor;Llb1$b$a;Landroid/view/Surface;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Ljava/util/concurrent/Executor;Llb1$b$a;Landroid/view/Surface;)V
    .locals 1

    :try_start_0
    new-instance v0, Lgc1;

    invoke-direct {v0, p2, p3}, Lgc1;-><init>(Llb1$b$a;Landroid/view/Surface;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, LOb1$g;->f:LOb1;

    iget-object p2, p2, LOb1;->a:Ljava/lang/String;

    const-string p3, "Unable to post to the supplied executor."

    invoke-static {p2, p3, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, LOb1$g;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOb1$g;->b:Landroid/view/Surface;

    const/4 v2, 0x0

    iput-object v2, p0, LOb1$g;->b:Landroid/view/Surface;

    new-instance v2, Ljava/util/HashSet;

    iget-object v3, p0, LOb1$g;->c:Ljava/util/Set;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, LOb1$g;->c:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-class v0, Ljc1;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, Ljc1;

    iget-object v1, p0, LOb1$g;->a:Ljava/lang/Object;

    monitor-enter v1

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, LOb1$g;->b:Landroid/view/Surface;

    if-nez v0, :cond_0

    invoke-static {}, LOb1$c;->a()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, LOb1$g;->b:Landroid/view/Surface;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LOb1$g;->f:LOb1;

    iget-object v2, v2, LOb1;->e:Landroid/media/MediaCodec;

    iget-object v3, p0, LOb1$g;->b:Landroid/view/Surface;

    invoke-static {v2, v3}, LOb1$c;->b(Landroid/media/MediaCodec;Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LOb1$g;->b:Landroid/view/Surface;

    if-eqz v0, :cond_2

    iget-object v2, p0, LOb1$g;->c:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, LOb1$g;->f:LOb1;

    iget-object v0, v0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, LOb1$g;->b:Landroid/view/Surface;

    :goto_1
    iget-object v2, p0, LOb1$g;->d:Llb1$b$a;

    iget-object v3, p0, LOb1$g;->e:Ljava/util/concurrent/Executor;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v3, v2, v0}, LOb1$g;->d(Ljava/util/concurrent/Executor;Llb1$b$a;Landroid/view/Surface;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
