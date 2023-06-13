.class public final Landroidx/camera/core/internal/CameraUseCaseAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/internal/CameraUseCaseAdapter$a;,
        Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraException;,
        Landroidx/camera/core/internal/CameraUseCaseAdapter$b;
    }
.end annotation


# instance fields
.field public final b:LLb0;

.field public final c:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "LLb0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lxb0;

.field public final e:LVf6;

.field public final f:Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lkb0;

.field public j:LEs6;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyb0;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroidx/camera/core/impl/c;

.field public final m:Ljava/lang/Object;

.field public n:Z

.field public o:Landroidx/camera/core/impl/f;

.field public p:Landroidx/camera/core/p;

.field public q:LyR5;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Lkb0;Lxb0;LVf6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "LLb0;",
            ">;",
            "Lkb0;",
            "Lxb0;",
            "LVf6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->k:Ljava/util/List;

    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->o:Landroidx/camera/core/impl/f;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLb0;

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->c:Ljava/util/LinkedHashSet;

    new-instance p1, Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

    invoke-direct {p1, v0}, Landroidx/camera/core/internal/CameraUseCaseAdapter$a;-><init>(Ljava/util/LinkedHashSet;)V

    iput-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->f:Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

    iput-object p2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->i:Lkb0;

    iput-object p3, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->d:Lxb0;

    iput-object p4, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->e:LVf6;

    return-void
.end method

.method public static J(Landroidx/camera/core/p;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/core/h;

    return p0
.end method

.method public static K(Landroidx/camera/core/p;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/core/l;

    return p0
.end method

.method public static L(Landroidx/camera/core/p;)Z
    .locals 0

    instance-of p0, p0, LyR5;

    return p0
.end method

.method public static synthetic M(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/o$g;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method public static synthetic N(Landroidx/camera/core/o;)V
    .locals 4

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p0}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Ltc0;

    invoke-direct {v3, v1, v0}, Ltc0;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v1, v2, v3}, Landroidx/camera/core/o;->A(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lrz0;)V

    return-void
.end method

.method public static R(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyb0;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)",
            "Ljava/util/List<",
            "Lyb0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/camera/core/p;->N(Lyb0;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyb0;

    invoke-virtual {v3}, Lyb0;->e()I

    move-result v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/p;->x(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " already has effect"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {v1, v3}, Landroidx/camera/core/p;->N(Lyb0;)V

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static T(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyb0;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->R(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-static {p0, v0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->R(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unused effects: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "CameraUseCaseAdapter"

    invoke-static {p1, p0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/o;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->N(Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic g(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/o$g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->M(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/o$g;)V

    return-void
.end method

.method public static r(Ljava/util/Collection;Landroidx/camera/core/p;LyR5;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;",
            "Landroidx/camera/core/p;",
            "LyR5;",
            ")",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, LyR5;->Y()Ljava/util/Set;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_1
    return-object v0
.end method

.method public static t(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    new-instance p0, Landroid/graphics/Matrix;

    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    return-object p0
.end method

.method public static z(Ljava/util/LinkedHashSet;)Landroidx/camera/core/internal/CameraUseCaseAdapter$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "LLb0;",
            ">;)",
            "Landroidx/camera/core/internal/CameraUseCaseAdapter$a;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter$a;-><init>(Ljava/util/LinkedHashSet;)V

    return-object v0
.end method


# virtual methods
.method public A()Landroidx/camera/core/internal/CameraUseCaseAdapter$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->f:Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

    return-object v0
.end method

.method public final B(Ljava/util/Collection;LVf6;LVf6;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;",
            "LVf6;",
            "LVf6;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "Landroidx/camera/core/internal/CameraUseCaseAdapter$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    new-instance v2, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, p2}, Landroidx/camera/core/p;->j(ZLVf6;)Landroidx/camera/core/impl/s;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v1, v4, p3}, Landroidx/camera/core/p;->j(ZLVf6;)Landroidx/camera/core/impl/s;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;-><init>(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final C(Z)I
    .locals 7

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyb0;

    invoke-virtual {v3}, Lyb0;->e()I

    move-result v5

    invoke-static {v5}, LVY5;->d(I)I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_0

    if-nez v2, :cond_1

    move v4, v6

    :cond_1
    const-string v2, "Can only have one sharing effect."

    invoke-static {v4, v2}, LHZ3;->j(ZLjava/lang/String;)V

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lyb0;->e()I

    move-result v4

    :goto_1
    if-eqz p1, :cond_4

    or-int/lit8 v4, v4, 0x3

    :cond_4
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final D(Ljava/util/Collection;Z)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;Z)",
            "Ljava/util/Set<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0, p2}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->C(Z)I

    move-result p2

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-static {v1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->L(Landroidx/camera/core/p;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "Only support one level of sharing for now."

    invoke-static {v2, v3}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {v1, p2}, Landroidx/camera/core/p;->x(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public E()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final F()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object v2

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

.method public final G()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    invoke-interface {v1}, Landroidx/camera/core/impl/c;->E()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final H(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/p;

    invoke-static {v3}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->K(Landroidx/camera/core/p;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    invoke-static {v3}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->J(Landroidx/camera/core/p;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    move v0, v4

    :cond_3
    return v0
.end method

.method public final I(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/p;

    invoke-static {v3}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->K(Landroidx/camera/core/p;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    invoke-static {v3}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->J(Landroidx/camera/core/p;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v1, v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    move v0, v4

    :cond_3
    return v0
.end method

.method public O(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, v1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->U(Ljava/util/Collection;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final P()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->o:Landroidx/camera/core/impl/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->o:Landroidx/camera/core/impl/f;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/CameraControlInternal;->f(Landroidx/camera/core/impl/f;)V

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

.method public Q(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyb0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->k:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public S(LEs6;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public U(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->V(Ljava/util/Collection;Z)V

    return-void
.end method

.method public V(Ljava/util/Collection;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    iget-object v9, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->s(Ljava/util/Collection;)Landroidx/camera/core/p;

    move-result-object v0

    invoke-virtual/range {p0 .. p2}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->x(Ljava/util/Collection;Z)LyR5;

    move-result-object v10

    invoke-static {v8, v0, v10}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->r(Ljava/util/Collection;Landroidx/camera/core/p;LyR5;)Ljava/util/Collection;

    move-result-object v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v12, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    new-instance v13, Ljava/util/ArrayList;

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v13, v11}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    invoke-interface {v1}, Landroidx/camera/core/impl/c;->j()LVf6;

    move-result-object v1

    iget-object v2, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->e:LVf6;

    invoke-virtual {v7, v12, v1, v2}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->B(Ljava/util/Collection;LVf6;LVf6;)Ljava/util/Map;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x2

    :try_start_1
    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->i:Lkb0;

    invoke-interface {v1}, Lkb0;->c()I

    move-result v1

    if-ne v1, v6, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->d()LKb0;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v1, p0

    move-object v4, v12

    move v15, v6

    move-object v6, v14

    :try_start_2
    invoke-virtual/range {v1 .. v6}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->u(ZLKb0;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v7, v1, v11}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->W(Ljava/util/Map;Ljava/util/Collection;)V

    iget-object v2, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->k:Ljava/util/List;

    invoke-static {v2, v11, v8}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->T(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/p;

    iget-object v4, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-virtual {v3, v4}, Landroidx/camera/core/p;->R(LLb0;)V

    goto :goto_1

    :cond_1
    iget-object v2, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v2, v13}, LLb0;->p(Ljava/util/Collection;)V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/p;

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    iget-object v6, v4, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;->a:Landroidx/camera/core/impl/s;

    iget-object v4, v4, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;->b:Landroidx/camera/core/impl/s;

    invoke-virtual {v3, v5, v6, v4}, Landroidx/camera/core/p;->b(LLb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)V

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBR5;

    invoke-static {v4}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBR5;

    invoke-virtual {v3, v4}, Landroidx/camera/core/p;->T(LBR5;)V

    goto :goto_2

    :cond_2
    iget-boolean v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

    if-eqz v1, :cond_3

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1, v12}, LLb0;->o(Ljava/util/Collection;)V

    :cond_3
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/p;

    invoke-virtual {v2}, Landroidx/camera/core/p;->D()V

    goto :goto_3

    :cond_4
    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-interface {v1, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iput-object v0, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->p:Landroidx/camera/core/p;

    iput-object v10, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->q:LyR5;

    monitor-exit v9

    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    move v15, v6

    :goto_4
    if-nez p2, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->F()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v7, Landroidx/camera/core/internal/CameraUseCaseAdapter;->i:Lkb0;

    invoke-interface {v1}, Lkb0;->c()I

    move-result v1

    if-eq v1, v15, :cond_5

    const/4 v1, 0x1

    invoke-virtual {v7, v8, v1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->V(Ljava/util/Collection;Z)V

    monitor-exit v9

    return-void

    :cond_5
    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final W(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "LBR5;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->d()LKb0;

    move-result-object v1

    invoke-interface {v1}, LJb0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    const-string v1, "CameraUseCaseAdapter"

    const-string v3, "The lens facing is null, probably an external."

    invoke-static {v1, v3}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    move v4, v2

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/CameraControlInternal;->h()Landroid/graphics/Rect;

    move-result-object v3

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    invoke-virtual {v1}, LEs6;->a()Landroid/util/Rational;

    move-result-object v5

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->d()LKb0;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    invoke-virtual {v2}, LEs6;->c()I

    move-result v2

    invoke-interface {v1, v2}, LJb0;->e(I)I

    move-result v6

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    invoke-virtual {v1}, LEs6;->d()I

    move-result v7

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->j:LEs6;

    invoke-virtual {v1}, LEs6;->b()I

    move-result v8

    move-object v9, p1

    invoke-static/range {v3 .. v9}, LGs6;->a(Landroid/graphics/Rect;ZLandroid/util/Rational;IIILjava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/p;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-static {v3}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroidx/camera/core/p;->Q(Landroid/graphics/Rect;)V

    iget-object v3, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v3}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v3

    invoke-interface {v3}, Landroidx/camera/core/impl/CameraControlInternal;->h()Landroid/graphics/Rect;

    move-result-object v3

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBR5;

    invoke-static {v4}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBR5;

    invoke-virtual {v4}, LBR5;->c()Landroid/util/Size;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->t(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/camera/core/p;->O(Landroid/graphics/Matrix;)V

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a()Landroidx/camera/core/CameraControl;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v0}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v0

    return-object v0
.end method

.method public b()LJb0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v0}, LLb0;->d()LKb0;

    move-result-object v0

    return-object v0
.end method

.method public f(Landroidx/camera/core/impl/c;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    if-nez p1, :cond_0

    :try_start_0
    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object p1

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    invoke-interface {v1}, Landroidx/camera/core/impl/c;->v()LiW1;

    move-result-object v1

    invoke-interface {p1}, Landroidx/camera/core/impl/c;->v()LiW1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Need to unbind all use cases before binding with extension enabled"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->l:Landroidx/camera/core/impl/c;

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1, p1}, LLb0;->f(Landroidx/camera/core/impl/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, v1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->U(Ljava/util/Collection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v1, v2}, LLb0;->o(Ljava/util/Collection;)V

    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->P()V

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/p;

    invoke-virtual {v2}, Landroidx/camera/core/p;->D()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v1}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/CameraControlInternal;->j()Landroidx/camera/core/impl/f;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->o:Landroidx/camera/core/impl/f;

    invoke-interface {v1}, Landroidx/camera/core/impl/CameraControlInternal;->k()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public n(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    invoke-interface {v0, p1}, LLb0;->n(Z)V

    return-void
.end method

.method public s(Ljava/util/Collection;)Landroidx/camera/core/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)",
            "Landroidx/camera/core/p;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->G()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->I(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->p:Landroidx/camera/core/p;

    invoke-static {p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->K(Landroidx/camera/core/p;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->p:Landroidx/camera/core/p;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->w()Landroidx/camera/core/l;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->H(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->p:Landroidx/camera/core/p;

    invoke-static {p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->J(Landroidx/camera/core/p;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->p:Landroidx/camera/core/p;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->v()Landroidx/camera/core/h;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final u(ZLKb0;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LKb0;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "Landroidx/camera/core/internal/CameraUseCaseAdapter$b;",
            ">;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/p;",
            "LBR5;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, LKb0;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/p;

    iget-object v4, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->d:Lxb0;

    invoke-virtual {v3}, Landroidx/camera/core/p;->l()I

    move-result v5

    invoke-virtual {v3}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object v6

    invoke-interface {v4, p1, v1, v5, v6}, Lxb0;->a(ZLjava/lang/String;ILandroid/util/Size;)LDV5;

    move-result-object v4

    invoke-virtual {v3}, Landroidx/camera/core/p;->l()I

    move-result v5

    invoke-virtual {v3}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object v6

    invoke-virtual {v3}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v7

    const/4 v8, 0x0

    invoke-interface {v7, v8}, Landroidx/camera/core/impl/s;->M(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v7

    invoke-static {v4, v5, v6, v7}, Lsp;->a(LDV5;ILandroid/util/Size;Landroid/util/Range;)Lsp;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/camera/core/p;->d()LBR5;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, LsV5;

    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b()LJb0;

    move-result-object v5

    check-cast v5, LKb0;

    invoke-direct {v4, v5}, LsV5;-><init>(LKb0;)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/camera/core/p;

    invoke-interface {p5, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;

    iget-object v7, v6, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;->a:Landroidx/camera/core/impl/s;

    iget-object v6, v6, Landroidx/camera/core/internal/CameraUseCaseAdapter$b;->b:Landroidx/camera/core/impl/s;

    invoke-virtual {v5, p2, v7, v6}, Landroidx/camera/core/p;->z(LKb0;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/s;

    move-result-object v6

    invoke-interface {p4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v6}, LsV5;->f(Landroidx/camera/core/impl/s;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->d:Lxb0;

    invoke-interface {p2, p1, v1, v0, v3}, Lxb0;->b(ZLjava/lang/String;Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/core/p;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LBR5;

    invoke-interface {v2, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-object v2
.end method

.method public final v()Landroidx/camera/core/h;
    .locals 2

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    const-string v1, "ImageCapture-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->n(Ljava/lang/String;)Landroidx/camera/core/h$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/h$g;->e()Landroidx/camera/core/h;

    move-result-object v0

    return-object v0
.end method

.method public final w()Landroidx/camera/core/l;
    .locals 2

    new-instance v0, Landroidx/camera/core/l$a;

    invoke-direct {v0}, Landroidx/camera/core/l$a;-><init>()V

    const-string v1, "Preview-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/l$a;->k(Ljava/lang/String;)Landroidx/camera/core/l$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/l$a;->e()Landroidx/camera/core/l;

    move-result-object v0

    new-instance v1, Lsc0;

    invoke-direct {v1}, Lsc0;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/camera/core/l;->i0(Landroidx/camera/core/l$c;)V

    return-object v0
.end method

.method public final x(Ljava/util/Collection;Z)LyR5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;Z)",
            "LyR5;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->D(Ljava/util/Collection;Z)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p2

    const/4 v1, 0x2

    if-ge p2, v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->q:LyR5;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LyR5;->Y()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->q:LyR5;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :cond_1
    new-instance p2, LyR5;

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    iget-object v2, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->e:LVf6;

    invoke-direct {p2, v1, p1, v2}, LyR5;-><init>(LLb0;Ljava/util/Set;LVf6;)V

    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public y()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->b:LLb0;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->h:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v2}, LLb0;->p(Ljava/util/Collection;)V

    invoke-virtual {p0}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->m()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/camera/core/internal/CameraUseCaseAdapter;->n:Z

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
