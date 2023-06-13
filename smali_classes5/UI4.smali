.class public LUI4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements LCq2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUI4$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/content/ComponentCallbacks2;",
        "LCq2;"
    }
.end annotation


# static fields
.field public static final m:LYI4;

.field public static final n:LYI4;

.field public static final o:LYI4;


# instance fields
.field public final b:Lcom/bumptech/glide/a;

.field public final c:Landroid/content/Context;

.field public final d:Lwq2;

.field public final e:LmJ4;

.field public final f:LXI4;

.field public final g:LTY5;

.field public final h:Ljava/lang/Runnable;

.field public final i:LDy0;

.field public final j:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:LYI4;

.field public l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, LYI4;->G0(Ljava/lang/Class;)LYI4;

    move-result-object v0

    invoke-virtual {v0}, LLD;->d0()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sput-object v0, LUI4;->m:LYI4;

    const-class v0, LuC1;

    invoke-static {v0}, LYI4;->G0(Ljava/lang/Class;)LYI4;

    move-result-object v0

    invoke-virtual {v0}, LLD;->d0()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sput-object v0, LUI4;->n:LYI4;

    sget-object v0, LB41;->c:LB41;

    invoke-static {v0}, LYI4;->H0(LB41;)LYI4;

    move-result-object v0

    sget-object v1, LP24;->e:LP24;

    invoke-virtual {v0, v1}, LLD;->o0(LP24;)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LLD;->x0(Z)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sput-object v0, LUI4;->o:LYI4;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Lwq2;LXI4;Landroid/content/Context;)V
    .locals 7

    new-instance v4, LmJ4;

    invoke-direct {v4}, LmJ4;-><init>()V

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->g()LEy0;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, LUI4;-><init>(Lcom/bumptech/glide/a;Lwq2;LXI4;LmJ4;LEy0;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Lwq2;LXI4;LmJ4;LEy0;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LTY5;

    invoke-direct {v0}, LTY5;-><init>()V

    iput-object v0, p0, LUI4;->g:LTY5;

    new-instance v0, LUI4$a;

    invoke-direct {v0, p0}, LUI4$a;-><init>(LUI4;)V

    iput-object v0, p0, LUI4;->h:Ljava/lang/Runnable;

    iput-object p1, p0, LUI4;->b:Lcom/bumptech/glide/a;

    iput-object p2, p0, LUI4;->d:Lwq2;

    iput-object p3, p0, LUI4;->f:LXI4;

    iput-object p4, p0, LUI4;->e:LmJ4;

    iput-object p6, p0, LUI4;->c:Landroid/content/Context;

    invoke-virtual {p6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p6, LUI4$b;

    invoke-direct {p6, p0, p4}, LUI4$b;-><init>(LUI4;LmJ4;)V

    invoke-interface {p5, p3, p6}, LEy0;->a(Landroid/content/Context;LDy0$a;)LDy0;

    move-result-object p3

    iput-object p3, p0, LUI4;->i:LDy0;

    invoke-static {}, Lpi6;->q()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-static {v0}, Lpi6;->u(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Lwq2;->a(LCq2;)V

    :goto_0
    invoke-interface {p2, p3}, Lwq2;->a(LCq2;)V

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bumptech/glide/c;->c()Ljava/util/List;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, LUI4;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/c;->d()LYI4;

    move-result-object p2

    invoke-virtual {p0, p2}, LUI4;->p(LYI4;)V

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/a;->o(LUI4;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)LrI4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "LrI4<",
            "TResourceType;>;"
        }
    .end annotation

    new-instance v0, LrI4;

    iget-object v1, p0, LUI4;->b:Lcom/bumptech/glide/a;

    iget-object v2, p0, LUI4;->c:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, LrI4;-><init>(Lcom/bumptech/glide/a;LUI4;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public b()LrI4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrI4<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, LUI4;->a(Ljava/lang/Class;)LrI4;

    move-result-object v0

    sget-object v1, LUI4;->m:LYI4;

    invoke-virtual {v0, v1}, LrI4;->G0(LLD;)LrI4;

    move-result-object v0

    return-object v0
.end method

.method public c()LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrI4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, LUI4;->a(Ljava/lang/Class;)LrI4;

    move-result-object v0

    return-object v0
.end method

.method public d(LLY5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLY5<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LUI4;->s(LLY5;)V

    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LUI4;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public declared-synchronized f()LYI4;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->k:LYI4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public g(Ljava/lang/Class;)LK96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LK96<",
            "*TT;>;"
        }
    .end annotation

    iget-object v0, p0, LUI4;->b:Lcom/bumptech/glide/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/c;->e(Ljava/lang/Class;)LK96;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/net/Uri;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LrI4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LUI4;->c()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->U0(Landroid/net/Uri;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/io/File;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "LrI4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LUI4;->c()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->V0(Ljava/io/File;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Integer;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "LrI4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LUI4;->c()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->X0(Ljava/lang/Integer;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/String;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LrI4<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LUI4;->c()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized l()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->e:LmJ4;

    invoke-virtual {v0}, LmJ4;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized m()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LUI4;->l()V

    iget-object v0, p0, LUI4;->f:LXI4;

    invoke-interface {v0}, LXI4;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUI4;

    invoke-virtual {v1}, LUI4;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized n()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->e:LmJ4;

    invoke-virtual {v0}, LmJ4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized o()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->e:LmJ4;

    invoke-virtual {v0}, LmJ4;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized onDestroy()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0}, LTY5;->onDestroy()V

    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0}, LTY5;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLY5;

    invoke-virtual {p0, v1}, LUI4;->d(LLY5;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0}, LTY5;->a()V

    iget-object v0, p0, LUI4;->e:LmJ4;

    invoke-virtual {v0}, LmJ4;->b()V

    iget-object v0, p0, LUI4;->d:Lwq2;

    invoke-interface {v0, p0}, Lwq2;->b(LCq2;)V

    iget-object v0, p0, LUI4;->d:Lwq2;

    iget-object v1, p0, LUI4;->i:LDy0;

    invoke-interface {v0, v1}, Lwq2;->b(LCq2;)V

    iget-object v0, p0, LUI4;->h:Ljava/lang/Runnable;

    invoke-static {v0}, Lpi6;->v(Ljava/lang/Runnable;)V

    iget-object v0, p0, LUI4;->b:Lcom/bumptech/glide/a;

    invoke-virtual {v0, p0}, Lcom/bumptech/glide/a;->s(LUI4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public declared-synchronized onStart()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LUI4;->o()V

    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0}, LTY5;->onStart()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onStop()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LUI4;->n()V

    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0}, LTY5;->onStop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x3c

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, LUI4;->l:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LUI4;->m()V

    :cond_0
    return-void
.end method

.method public declared-synchronized p(LYI4;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, LLD;->h()LLD;

    move-result-object p1

    check-cast p1, LYI4;

    invoke-virtual {p1}, LLD;->e()LLD;

    move-result-object p1

    check-cast p1, LYI4;

    iput-object p1, p0, LUI4;->k:LYI4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized q(LLY5;LnI4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLY5<",
            "*>;",
            "LnI4;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0, p1}, LTY5;->c(LLY5;)V

    iget-object p1, p0, LUI4;->e:LmJ4;

    invoke-virtual {p1, p2}, LmJ4;->g(LnI4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized r(LLY5;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLY5<",
            "*>;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, LLY5;->getRequest()LnI4;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v2, p0, LUI4;->e:LmJ4;

    invoke-virtual {v2, v0}, LmJ4;->a(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LUI4;->g:LTY5;

    invoke-virtual {v0, p1}, LTY5;->d(LLY5;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LLY5;->setRequest(LnI4;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final s(LLY5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLY5<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LUI4;->r(LLY5;)Z

    move-result v0

    invoke-interface {p1}, LLY5;->getRequest()LnI4;

    move-result-object v1

    if-nez v0, :cond_0

    iget-object v0, p0, LUI4;->b:Lcom/bumptech/glide/a;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/a;->p(LLY5;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LLY5;->setRequest(LnI4;)V

    invoke-interface {v1}, LnI4;->clear()V

    :cond_0
    return-void
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LUI4;->e:LmJ4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LUI4;->f:LXI4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
