.class public Lxu6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLb0;


# instance fields
.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "LMV5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LVf6;

.field public final f:LLb0;

.field public final g:Lpa0;


# direct methods
.method public constructor <init>(LLb0;Ljava/util/Set;LVf6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLb0;",
            "Ljava/util/Set<",
            "Landroidx/camera/core/p;",
            ">;",
            "LVf6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxu6;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxu6;->d:Ljava/util/Map;

    invoke-virtual {p0}, Lxu6;->r()Lpa0;

    move-result-object v0

    iput-object v0, p0, Lxu6;->g:Lpa0;

    iput-object p1, p0, Lxu6;->f:LLb0;

    iput-object p3, p0, Lxu6;->e:LVf6;

    iput-object p2, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/p;

    iget-object p3, p0, Lxu6;->d:Ljava/util/Map;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static D(Lxa0;Landroidx/camera/core/impl/q;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpa0;

    new-instance v2, Lyu6;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/d;->g()LxY5;

    move-result-object v3

    invoke-direct {v2, v3, p0}, Lyu6;-><init>(LxY5;Lxa0;)V

    invoke-virtual {v1, v2}, Lpa0;->b(Lxa0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static t(Landroidx/camera/core/p;)Landroidx/camera/core/impl/DeferrableSurface;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/DeferrableSurface;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static w(Ljava/util/Set;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/s<",
            "*>;>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/s;

    invoke-interface {v1}, Landroidx/camera/core/impl/s;->L()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method


# virtual methods
.method public A(Landroidx/camera/core/impl/l;)V
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/p;

    iget-object v3, p0, Lxu6;->f:LLb0;

    invoke-interface {v3}, LLb0;->d()LKb0;

    move-result-object v3

    const/4 v4, 0x1

    iget-object v5, p0, Lxu6;->e:LVf6;

    invoke-virtual {v2, v4, v5}, Landroidx/camera/core/p;->j(ZLVf6;)Landroidx/camera/core/impl/s;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Landroidx/camera/core/p;->z(LKb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/s;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lxu6;->f:LLb0;

    invoke-interface {v2}, LLb0;->d()LKb0;

    move-result-object v2

    const/16 v3, 0x22

    invoke-interface {v2, v3}, LKb0;->l(I)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lxu6;->f:LLb0;

    invoke-interface {v2}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/impl/CameraControlInternal;->h()Landroid/graphics/Rect;

    move-result-object v2

    invoke-static {v2}, Lp96;->j(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v2

    sget-object v3, Landroidx/camera/core/impl/k;->u:Landroidx/camera/core/impl/f$a;

    invoke-static {v1, v2, v0}, LLL4;->a(Ljava/util/List;Landroid/util/Size;Ljava/util/Set;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v3, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object v1, Landroidx/camera/core/impl/s;->z:Landroidx/camera/core/impl/f$a;

    invoke-static {v0}, Lxu6;->w(Ljava/util/Set;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-void
.end method

.method public B()V
    .locals 2

    iget-object v0, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-virtual {v1}, Landroidx/camera/core/p;->I()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C()V
    .locals 2

    iget-object v0, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-virtual {v1}, Landroidx/camera/core/p;->J()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public E(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "LMV5;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lxu6;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lxu6;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lxu6;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMV5;

    invoke-virtual {v0}, LMV5;->n()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/p;->Q(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, LMV5;->t()LBR5;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/p;->T(LBR5;)V

    invoke-virtual {v1}, Landroidx/camera/core/p;->D()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F()V
    .locals 2

    iget-object v0, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-virtual {v1, p0}, Landroidx/camera/core/p;->R(LLb0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroidx/camera/core/p;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0, p1}, Lxu6;->z(Landroidx/camera/core/p;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lxu6;->y(Landroidx/camera/core/p;)LMV5;

    move-result-object v0

    invoke-static {p1}, Lxu6;->t(Landroidx/camera/core/p;)Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0, p1}, Lxu6;->s(LMV5;Landroidx/camera/core/impl/DeferrableSurface;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LMV5;->l()V

    :goto_0
    return-void
.end method

.method public d()LKb0;
    .locals 1

    iget-object v0, p0, Lxu6;->f:LLb0;

    invoke-interface {v0}, LLb0;->d()LKb0;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroidx/camera/core/p;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0, p1}, Lxu6;->z(Landroidx/camera/core/p;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxu6;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lxu6;->t(Landroidx/camera/core/p;)Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lxu6;->y(Landroidx/camera/core/p;)LMV5;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lxu6;->s(LMV5;Landroidx/camera/core/impl/DeferrableSurface;)V

    :cond_1
    return-void
.end method

.method public h(Landroidx/camera/core/p;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0, p1}, Lxu6;->y(Landroidx/camera/core/p;)LMV5;

    move-result-object v0

    invoke-virtual {v0}, LMV5;->w()V

    invoke-virtual {p0, p1}, Lxu6;->z(Landroidx/camera/core/p;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lxu6;->t(Landroidx/camera/core/p;)Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0, p1}, Lxu6;->s(LMV5;Landroidx/camera/core/impl/DeferrableSurface;)V

    :cond_1
    return-void
.end method

.method public i(Landroidx/camera/core/p;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0, p1}, Lxu6;->z(Landroidx/camera/core/p;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxu6;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lxu6;->y(Landroidx/camera/core/p;)LMV5;

    move-result-object p1

    invoke-virtual {p1}, LMV5;->l()V

    return-void
.end method

.method public j()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LLb0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxu6;->f:LLb0;

    invoke-interface {v0}, LLb0;->j()LZd3;

    move-result-object v0

    return-object v0
.end method

.method public k()Landroidx/camera/core/impl/CameraControlInternal;
    .locals 1

    iget-object v0, p0, Lxu6;->f:LLb0;

    invoke-interface {v0}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    const/4 v2, 0x1

    iget-object v3, p0, Lxu6;->e:LVf6;

    invoke-virtual {v1, v2, v3}, Landroidx/camera/core/p;->j(ZLVf6;)Landroidx/camera/core/impl/s;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, v2}, Landroidx/camera/core/p;->b(LLb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public r()Lpa0;
    .locals 1

    new-instance v0, Lxu6$a;

    invoke-direct {v0, p0}, Lxu6$a;-><init>(Lxu6;)V

    return-object v0
.end method

.method public final s(LMV5;Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 0

    invoke-virtual {p1}, LMV5;->w()V

    :try_start_0
    invoke-virtual {p1, p2}, LMV5;->C(Landroidx/camera/core/impl/DeferrableSurface;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public u()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxu6;->b:Ljava/util/Set;

    return-object v0
.end method

.method public v(LMV5;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "LYV5$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/p;

    instance-of v3, v2, Landroidx/camera/core/l;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x2

    :goto_1
    move v4, v3

    invoke-virtual {v2, p0}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v9

    const/16 v5, 0x22

    invoke-virtual {p1}, LMV5;->n()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {p1}, LMV5;->n()Landroid/graphics/Rect;

    move-result-object v3

    invoke-static {v3}, Lp96;->j(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static/range {v4 .. v9}, LYV5$d;->h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)LYV5$d;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public x()Lpa0;
    .locals 1

    iget-object v0, p0, Lxu6;->g:Lpa0;

    return-object v0
.end method

.method public final y(Landroidx/camera/core/p;)LMV5;
    .locals 1

    iget-object v0, p0, Lxu6;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMV5;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final z(Landroidx/camera/core/p;)Z
    .locals 1

    iget-object v0, p0, Lxu6;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
