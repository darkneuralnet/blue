.class public final Landroidx/camera/lifecycle/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Landroidx/camera/lifecycle/b;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lzc0$b;

.field public c:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lyc0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

.field public f:Lyc0;

.field public g:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/lifecycle/b;

    invoke-direct {v0}, Landroidx/camera/lifecycle/b;-><init>()V

    sput-object v0, Landroidx/camera/lifecycle/b;->h:Landroidx/camera/lifecycle/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/b;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/lifecycle/b;->b:Lzc0$b;

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/lifecycle/b;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v0, Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-direct {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;-><init>()V

    iput-object v0, p0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    return-void
.end method

.method public static synthetic a(Lyc0;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/b;->l(Lyc0;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/lifecycle/b;Lyc0;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/lifecycle/b;->m(Lyc0;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Lyc0;)Landroidx/camera/lifecycle/b;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/b;->k(Landroid/content/Context;Lyc0;)Landroidx/camera/lifecycle/b;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/camera/lifecycle/b;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Landroidx/camera/lifecycle/b;->h:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0, p0}, Landroidx/camera/lifecycle/b;->i(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, Ln64;

    invoke-direct {v1, p0}, Ln64;-><init>(Landroid/content/Context;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {v0, v1, p0}, LIA1;->o(Lcom/google/common/util/concurrent/ListenableFuture;LxA1;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroid/content/Context;Lyc0;)Landroidx/camera/lifecycle/b;
    .locals 1

    sget-object v0, Landroidx/camera/lifecycle/b;->h:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0, p1}, Landroidx/camera/lifecycle/b;->o(Lyc0;)V

    invoke-static {p0}, LdB0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/camera/lifecycle/b;->p(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic l(Lyc0;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lyc0;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method private synthetic m(Lyc0;LO80$a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/b;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v1}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v1

    new-instance v2, Lp64;

    invoke-direct {v2, p1}, Lp64;-><init>(Lyc0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object v1

    new-instance v2, Landroidx/camera/lifecycle/b$a;

    invoke-direct {v2, p0, p2, p1}, Landroidx/camera/lifecycle/b$a;-><init>(Landroidx/camera/lifecycle/b;LO80$a;Lyc0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v1, v2, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "ProcessCameraProvider-initializeCameraX"

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public d(LLifecycleOwner;Lic0;LYf6;)Lna0;
    .locals 7

    invoke-virtual {p0}, Landroidx/camera/lifecycle/b;->g()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/lifecycle/b;->n(I)V

    invoke-virtual {p3}, LYf6;->c()LEs6;

    move-result-object v4

    invoke-virtual {p3}, LYf6;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p3}, LYf6;->b()Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x0

    new-array v0, v0, [Landroidx/camera/core/p;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    check-cast v6, [Landroidx/camera/core/p;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Landroidx/camera/lifecycle/b;->e(LLifecycleOwner;Lic0;LEs6;Ljava/util/List;[Landroidx/camera/core/p;)Lna0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs e(LLifecycleOwner;Lic0;LEs6;Ljava/util/List;[Landroidx/camera/core/p;)Lna0;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "Lic0;",
            "LEs6;",
            "Ljava/util/List<",
            "Lyb0;",
            ">;[",
            "Landroidx/camera/core/p;",
            ")",
            "Lna0;"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    invoke-static {}, LO36;->a()V

    invoke-static/range {p2 .. p2}, Lic0$a;->c(Lic0;)Lic0$a;

    move-result-object v3

    array-length v4, v2

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v2, v6

    invoke-virtual {v8}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v8

    invoke-interface {v8, v7}, Landroidx/camera/core/impl/s;->w(Lic0;)Lic0;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lic0;->c()Ljava/util/LinkedHashSet;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LGb0;

    invoke-virtual {v3, v8}, Lic0$a;->a(LGb0;)Lic0$a;

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lic0$a;->b()Lic0;

    move-result-object v3

    iget-object v4, v0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v4}, Lyc0;->f()Lfc0;

    move-result-object v4

    invoke-virtual {v4}, Lfc0;->a()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-virtual {v3, v4}, Lic0;->a(Ljava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-static {v3}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->z(Ljava/util/LinkedHashSet;)Landroidx/camera/core/internal/CameraUseCaseAdapter$a;

    move-result-object v4

    iget-object v6, v0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v6, p1, v4}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->c(LLifecycleOwner;Landroidx/camera/core/internal/CameraUseCaseAdapter$a;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v4

    iget-object v6, v0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v6}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->e()Ljava/util/Collection;

    move-result-object v6

    array-length v8, v2

    move v9, v5

    :goto_2
    if-ge v9, v8, :cond_5

    aget-object v10, v2, v9

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/camera/lifecycle/LifecycleCamera;

    invoke-virtual {v12, v10}, Landroidx/camera/lifecycle/LifecycleCamera;->w(Landroidx/camera/core/p;)Z

    move-result v13

    if-eqz v13, :cond_2

    if-ne v12, v4, :cond_3

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v10, v2, v5

    const-string v3, "Use case %s already bound to a different lifecycle."

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_5
    if-nez v4, :cond_6

    iget-object v4, v0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    new-instance v5, Landroidx/camera/core/internal/CameraUseCaseAdapter;

    iget-object v6, v0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v6}, Lyc0;->e()LFb0;

    move-result-object v6

    invoke-interface {v6}, LFb0;->c()Lkb0;

    move-result-object v6

    iget-object v8, v0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v8}, Lyc0;->d()Lxb0;

    move-result-object v8

    iget-object v9, v0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v9}, Lyc0;->h()LVf6;

    move-result-object v9

    invoke-direct {v5, v3, v6, v8, v9}, Landroidx/camera/core/internal/CameraUseCaseAdapter;-><init>(Ljava/util/LinkedHashSet;Lkb0;Lxb0;LVf6;)V

    invoke-virtual {v4, p1, v5}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->b(LLifecycleOwner;Landroidx/camera/core/internal/CameraUseCaseAdapter;)Landroidx/camera/lifecycle/LifecycleCamera;

    move-result-object v4

    :cond_6
    invoke-virtual/range {p2 .. p2}, Lic0;->c()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGb0;

    invoke-interface {v3}, LGb0;->getIdentifier()LiW1;

    move-result-object v5

    sget-object v6, LGb0;->a:LiW1;

    if-eq v5, v6, :cond_7

    invoke-interface {v3}, LGb0;->getIdentifier()LiW1;

    move-result-object v3

    invoke-static {v3}, LEi1;->a(Ljava/lang/Object;)Lab0;

    move-result-object v3

    invoke-virtual {v4}, Landroidx/camera/lifecycle/LifecycleCamera;->b()LJb0;

    move-result-object v5

    iget-object v6, v0, Landroidx/camera/lifecycle/b;->g:Landroid/content/Context;

    invoke-interface {v3, v5, v6}, Lab0;->b(LJb0;Landroid/content/Context;)Landroidx/camera/core/impl/c;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    if-nez v7, :cond_9

    move-object v7, v3

    goto :goto_4

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot apply multiple extended camera configs at the same time."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-virtual {v4, v7}, Landroidx/camera/lifecycle/LifecycleCamera;->f(Landroidx/camera/core/impl/c;)V

    array-length v1, v2

    if-nez v1, :cond_b

    return-object v4

    :cond_b
    iget-object v8, v0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-static/range {p5 .. p5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    iget-object v1, v0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v1}, Lyc0;->e()LFb0;

    move-result-object v1

    invoke-interface {v1}, LFb0;->c()Lkb0;

    move-result-object v13

    move-object v9, v4

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-virtual/range {v8 .. v13}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->a(Landroidx/camera/lifecycle/LifecycleCamera;LEs6;Ljava/util/List;Ljava/util/Collection;Lkb0;)V

    return-object v4

    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Provided camera selector unable to resolve a camera for the given use case"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public varargs f(LLifecycleOwner;Lic0;[Landroidx/camera/core/p;)Lna0;
    .locals 7

    invoke-virtual {p0}, Landroidx/camera/lifecycle/b;->g()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/lifecycle/b;->n(I)V

    const/4 v4, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Landroidx/camera/lifecycle/b;->e(LLifecycleOwner;Lic0;LEs6;Ljava/util/List;[Landroidx/camera/core/p;)Lna0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lyc0;->e()LFb0;

    move-result-object v0

    invoke-interface {v0}, LFb0;->c()Lkb0;

    move-result-object v0

    invoke-interface {v0}, Lkb0;->c()I

    move-result v0

    return v0
.end method

.method public final i(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lyc0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/b;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lyc0;

    iget-object v2, p0, Landroidx/camera/lifecycle/b;->b:Lzc0$b;

    invoke-direct {v1, p1, v2}, Lyc0;-><init>(Landroid/content/Context;Lzc0$b;)V

    new-instance p1, Lo64;

    invoke-direct {p1, p0, v1}, Lo64;-><init>(Landroidx/camera/lifecycle/b;Lyc0;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/lifecycle/b;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j(Lic0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraInfoUnavailableException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    invoke-virtual {v0}, Lyc0;->f()Lfc0;

    move-result-object v0

    invoke-virtual {v0}, Lfc0;->a()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {p1, v0}, Lic0;->e(Ljava/util/LinkedHashSet;)LLb0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final n(I)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lyc0;->e()LFb0;

    move-result-object v0

    invoke-interface {v0}, LFb0;->c()Lkb0;

    move-result-object v0

    invoke-interface {v0, p1}, Lkb0;->d(I)V

    return-void
.end method

.method public final o(Lyc0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/b;->f:Lyc0;

    return-void
.end method

.method public final p(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/b;->g:Landroid/content/Context;

    return-void
.end method

.method public varargs q([Landroidx/camera/core/p;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/lifecycle/b;->g()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->k(Ljava/util/Collection;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "unbind usecase is not supported in concurrent camera mode, call unbindAll() first"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r()V
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/camera/lifecycle/b;->n(I)V

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    invoke-virtual {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->l()V

    return-void
.end method
