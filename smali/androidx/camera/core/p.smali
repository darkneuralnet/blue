.class public abstract Landroidx/camera/core/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/p$c;,
        Landroidx/camera/core/p$d;,
        Landroidx/camera/core/p$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/p$d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;

.field public c:Landroidx/camera/core/p$c;

.field public d:Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end field

.field public e:Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end field

.field public f:Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end field

.field public g:LBR5;

.field public h:Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end field

.field public i:Landroid/graphics/Rect;

.field public j:Landroid/graphics/Matrix;

.field public k:LLb0;

.field public l:Lyb0;

.field public m:Landroidx/camera/core/impl/q;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/p;->b:Ljava/lang/Object;

    sget-object v0, Landroidx/camera/core/p$c;->c:Landroidx/camera/core/p$c;

    iput-object v0, p0, Landroidx/camera/core/p;->c:Landroidx/camera/core/p$c;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/p;->j:Landroid/graphics/Matrix;

    invoke-static {}, Landroidx/camera/core/impl/q;->a()Landroidx/camera/core/impl/q;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/p;->m:Landroidx/camera/core/impl/q;

    iput-object p1, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    iput-object p1, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    sget-object v0, Landroidx/camera/core/p$c;->b:Landroidx/camera/core/p$c;

    iput-object v0, p0, Landroidx/camera/core/p;->c:Landroidx/camera/core/p$c;

    invoke-virtual {p0}, Landroidx/camera/core/p;->D()V

    return-void
.end method

.method public final B()V
    .locals 1

    sget-object v0, Landroidx/camera/core/p$c;->c:Landroidx/camera/core/p$c;

    iput-object v0, p0, Landroidx/camera/core/p;->c:Landroidx/camera/core/p$c;

    invoke-virtual {p0}, Landroidx/camera/core/p;->D()V

    return-void
.end method

.method public final C()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/p$d;->h(Landroidx/camera/core/p;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 2

    sget-object v0, Landroidx/camera/core/p$a;->a:[I

    iget-object v1, p0, Landroidx/camera/core/p;->c:Landroidx/camera/core/p$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/p$d;->g(Landroidx/camera/core/p;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/p$d;->i(Landroidx/camera/core/p;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final E()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/p$d;->c(Landroidx/camera/core/p;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F()V
    .locals 0

    return-void
.end method

.method public G()V
    .locals 0

    return-void
.end method

.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "Landroidx/camera/core/impl/s$a<",
            "***>;)",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method

.method public I()V
    .locals 0

    return-void
.end method

.method public J()V
    .locals 0

    return-void
.end method

.method public K(LBR5;)LBR5;
    .locals 0

    return-object p1
.end method

.method public L()V
    .locals 0

    return-void
.end method

.method public final M(Landroidx/camera/core/p$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public N(Lyb0;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lyb0;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->x(I)Z

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
    invoke-static {v0}, LHZ3;->a(Z)V

    iput-object p1, p0, Landroidx/camera/core/p;->l:Lyb0;

    return-void
.end method

.method public O(Landroid/graphics/Matrix;)V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Landroidx/camera/core/p;->j:Landroid/graphics/Matrix;

    return-void
.end method

.method public P(I)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/k;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->s(I)I

    move-result v0

    if-eq v0, v1, :cond_1

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object v0

    invoke-static {v0, p1}, LWf6;->a(Landroidx/camera/core/impl/s$a;I)V

    invoke-interface {v0}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    iput-object p1, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    goto :goto_1

    :cond_2
    invoke-interface {p1}, LLb0;->d()LKb0;

    move-result-object p1

    iget-object v0, p0, Landroidx/camera/core/p;->d:Landroidx/camera/core/impl/s;

    iget-object v1, p0, Landroidx/camera/core/p;->h:Landroidx/camera/core/impl/s;

    invoke-virtual {p0, p1, v0, v1}, Landroidx/camera/core/p;->z(LKb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/s;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/p;->i:Landroid/graphics/Rect;

    return-void
.end method

.method public final R(LLb0;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->L()V

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LXf6;->O(Landroidx/camera/core/p$b;)Landroidx/camera/core/p$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/p$b;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Landroidx/camera/core/p;->k:LLb0;

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, LHZ3;->a(Z)V

    iget-object p1, p0, Landroidx/camera/core/p;->k:LLb0;

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->M(Landroidx/camera/core/p$d;)V

    iput-object v1, p0, Landroidx/camera/core/p;->k:LLb0;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Landroidx/camera/core/p;->g:LBR5;

    iput-object v1, p0, Landroidx/camera/core/p;->i:Landroid/graphics/Rect;

    iget-object p1, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    iput-object p1, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    iput-object v1, p0, Landroidx/camera/core/p;->d:Landroidx/camera/core/impl/s;

    iput-object v1, p0, Landroidx/camera/core/p;->h:Landroidx/camera/core/impl/s;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public S(Landroidx/camera/core/impl/q;)V
    .locals 2

    iput-object p1, p0, Landroidx/camera/core/p;->m:Landroidx/camera/core/impl/q;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->e()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/DeferrableSurface;->p(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public T(LBR5;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->K(LBR5;)LBR5;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/p;->g:LBR5;

    return-void
.end method

.method public final a(Landroidx/camera/core/p$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(LLb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLb0;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/p;->k:LLb0;

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->a(Landroidx/camera/core/p$d;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p2, p0, Landroidx/camera/core/p;->d:Landroidx/camera/core/impl/s;

    iput-object p3, p0, Landroidx/camera/core/p;->h:Landroidx/camera/core/impl/s;

    invoke-interface {p1}, LLb0;->d()LKb0;

    move-result-object p2

    iget-object p3, p0, Landroidx/camera/core/p;->d:Landroidx/camera/core/impl/s;

    iget-object v0, p0, Landroidx/camera/core/p;->h:Landroidx/camera/core/impl/s;

    invoke-virtual {p0, p2, p3, v0}, Landroidx/camera/core/p;->z(LKb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/s;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    const/4 p3, 0x0

    invoke-interface {p2, p3}, LXf6;->O(Landroidx/camera/core/p$b;)Landroidx/camera/core/p$b;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, LLb0;->d()LKb0;

    move-result-object p1

    invoke-interface {p2, p1}, Landroidx/camera/core/p$b;->a(LJb0;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/p;->F()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    check-cast v0, Landroidx/camera/core/impl/k;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->p(I)I

    move-result v0

    return v0
.end method

.method public d()LBR5;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->g:LBR5;

    return-object v0
.end method

.method public e()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->g:LBR5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f()LLb0;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/p;->k:LLb0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g()Landroidx/camera/core/impl/CameraControlInternal;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/p;->k:LLb0;

    if-nez v1, :cond_0

    sget-object v1, Landroidx/camera/core/impl/CameraControlInternal;->a:Landroidx/camera/core/impl/CameraControlInternal;

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-interface {v1}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No camera attached to use case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLb0;

    invoke-interface {v0}, LLb0;->d()LKb0;

    move-result-object v0

    invoke-interface {v0}, LKb0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/camera/core/impl/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    return-object v0
.end method

.method public abstract j(ZLVf6;)Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LVf6;",
            ")",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end method

.method public k()Lyb0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->l:Lyb0;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    invoke-interface {v0}, Landroidx/camera/core/impl/j;->l()I

    move-result v0

    return v0
.end method

.method public m()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    check-cast v0, Landroidx/camera/core/impl/k;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->y(I)I

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<UnknownUseCase-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LRY5;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public o(LLb0;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result p1

    return p1
.end method

.method public p(LLb0;Z)I
    .locals 2

    invoke-interface {p1}, LLb0;->d()LKb0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->t()I

    move-result v1

    invoke-interface {v0, v1}, LJb0;->e(I)I

    move-result v0

    invoke-interface {p1}, LLb0;->q()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    neg-int p1, v0

    invoke-static {p1}, Lp96;->s(I)I

    move-result v0

    :cond_1
    return v0
.end method

.method public q()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->j:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public r()Landroidx/camera/core/impl/q;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->m:Landroidx/camera/core/impl/q;

    return-object v0
.end method

.method public s()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public t()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/p;->f:Landroidx/camera/core/impl/s;

    check-cast v0, Landroidx/camera/core/impl/k;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->s(I)I

    move-result v0

    return v0
.end method

.method public abstract u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "Landroidx/camera/core/impl/s$a<",
            "***>;"
        }
    .end annotation
.end method

.method public v()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/p;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method public w(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public x(I)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->s()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p1, v1}, LVY5;->e(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public y(LLb0;)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->m()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, LLb0;->e()Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown mirrorMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public z(LKb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-static {p3}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p3

    sget-object v0, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/m;->X(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object p3

    :goto_0
    iget-object v0, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    invoke-interface {v0}, Landroidx/camera/core/impl/p;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/f$a;

    iget-object v2, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    invoke-interface {v2, v1}, Landroidx/camera/core/impl/p;->h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/p;->e:Landroidx/camera/core/impl/s;

    invoke-interface {v3, v1}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p3, v1, v2, v3}, Landroidx/camera/core/impl/m;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    invoke-interface {p2}, Landroidx/camera/core/impl/p;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/f$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/f$a;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/f$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2, v1}, Landroidx/camera/core/impl/p;->h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;

    move-result-object v2

    invoke-interface {p2, v1}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p3, v1, v2, v3}, Landroidx/camera/core/impl/m;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object p2, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/n;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/n;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/m;->X(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    :cond_4
    sget-object p2, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/n;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/n;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/m;

    invoke-virtual {p2}, Landroidx/camera/core/m;->e()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Landroidx/camera/core/impl/s;->C:Landroidx/camera/core/impl/f$a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p2, v0}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p0, p3}, Landroidx/camera/core/p;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/p;->H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method
