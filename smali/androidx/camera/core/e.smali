.class public final Landroidx/camera/core/e;
.super Landroidx/camera/core/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/e$a;,
        Landroidx/camera/core/e$d;,
        Landroidx/camera/core/e$c;,
        Landroidx/camera/core/e$e;,
        Landroidx/camera/core/e$b;
    }
.end annotation


# static fields
.field public static final r:Landroidx/camera/core/e$d;

.field public static final s:Ljava/lang/Boolean;


# instance fields
.field public final n:Landroidx/camera/core/f;

.field public final o:Ljava/lang/Object;

.field public p:Landroidx/camera/core/e$a;

.field public q:Landroidx/camera/core/impl/DeferrableSurface;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/e$d;

    invoke-direct {v0}, Landroidx/camera/core/e$d;-><init>()V

    sput-object v0, Landroidx/camera/core/e;->r:Landroidx/camera/core/e$d;

    const/4 v0, 0x0

    sput-object v0, Landroidx/camera/core/e;->s:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/h;)V
    .locals 2

    invoke-direct {p0, p1}, Landroidx/camera/core/p;-><init>(Landroidx/camera/core/impl/s;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/e;->o:Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->R(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance p1, LDW1;

    invoke-direct {p1}, LDW1;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/camera/core/g;

    invoke-static {}, LAc0;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v1}, Lu36;->x(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/camera/core/g;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    :goto_0
    iget-object p1, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {p0}, Landroidx/camera/core/e;->c0()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/f;->t(I)V

    iget-object p1, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {p0}, Landroidx/camera/core/e;->e0()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/f;->u(Z)V

    return-void
.end method

.method public static synthetic U(Landroidx/camera/core/e;Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/e;->g0(Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method public static synthetic V(Landroidx/camera/core/e$a;Landroidx/camera/core/i;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/e;->h0(Landroidx/camera/core/e$a;Landroidx/camera/core/i;)V

    return-void
.end method

.method public static synthetic W(Landroidx/camera/core/n;Landroidx/camera/core/n;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/e;->f0(Landroidx/camera/core/n;Landroidx/camera/core/n;)V

    return-void
.end method

.method public static synthetic f0(Landroidx/camera/core/n;Landroidx/camera/core/n;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/n;->m()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/n;->m()V

    :cond_0
    return-void
.end method

.method private synthetic g0(Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/e;->X()V

    iget-object p4, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {p4}, Landroidx/camera/core/f;->g()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/e;->Y(Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_0
    return-void
.end method

.method public static synthetic h0(Landroidx/camera/core/e$a;Landroidx/camera/core/i;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/e$a;->d(Landroidx/camera/core/i;)V

    return-void
.end method


# virtual methods
.method public F()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v0}, Landroidx/camera/core/f;->f()V

    return-void
.end method

.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 4
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

    invoke-virtual {p0}, Landroidx/camera/core/e;->b0()Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1}, LKb0;->k()LTe4;

    move-result-object v1

    const-class v2, LDh3;

    invoke-virtual {v1, v2}, LTe4;->a(Ljava/lang/Class;)Z

    move-result v1

    iget-object v2, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_0
    invoke-virtual {v2, v1}, Landroidx/camera/core/f;->s(Z)V

    iget-object v0, p0, Landroidx/camera/core/e;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e;->p:Landroidx/camera/core/e$a;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroidx/camera/core/e$a;->b()Landroid/util/Size;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/f;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, LJb0;->e(I)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    const/16 v0, 0x5a

    if-ne p1, v0, :cond_2

    new-instance p1, Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v1, p1

    :cond_2
    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/p;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    invoke-interface {p1, v2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/m;

    invoke-virtual {p1}, Landroidx/camera/core/m;->c()Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p1}, Landroidx/camera/core/m$a;->b(Landroidx/camera/core/m;)Landroidx/camera/core/m$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/camera/core/m$a;->d(Landroid/util/Size;)Landroidx/camera/core/m$a;

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/m$a;->a()Landroidx/camera/core/m;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public K(LBR5;)LBR5;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Landroidx/camera/core/e;->Y(Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    return-object p1
.end method

.method public L()V
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/e;->X()V

    iget-object v0, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v0}, Landroidx/camera/core/f;->j()V

    return-void
.end method

.method public O(Landroid/graphics/Matrix;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/camera/core/p;->O(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v0, p1}, Landroidx/camera/core/f;->x(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/camera/core/p;->Q(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v0, p1}, Landroidx/camera/core/f;->y(Landroid/graphics/Rect;)V

    return-void
.end method

.method public X()V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/core/e;->q:Landroidx/camera/core/impl/DeferrableSurface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/core/e;->q:Landroidx/camera/core/impl/DeferrableSurface;

    :cond_0
    return-void
.end method

.method public Y(Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 11

    invoke-static {}, LO36;->a()V

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {}, LAc0;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p2, v1}, Lu36;->x(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Landroidx/camera/core/e;->Z()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/e;->a0()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    move v8, v2

    invoke-virtual {p2}, Landroidx/camera/core/impl/h;->T()LLX1;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, Landroidx/camera/core/n;

    invoke-virtual {p2}, Landroidx/camera/core/impl/h;->T()LLX1;

    move-result-object v4

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v7

    const-wide/16 v9, 0x0

    invoke-interface/range {v4 .. v10}, LLX1;->a(IIIIJ)LKX1;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/camera/core/n;-><init>(LKX1;)V

    goto :goto_1

    :cond_1
    new-instance v2, Landroidx/camera/core/n;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v6

    invoke-static {v4, v5, v6, v8}, LMX1;->a(IIII)LKX1;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/camera/core/n;-><init>(LKX1;)V

    :goto_1
    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroidx/camera/core/e;->d0(LLb0;)Z

    move-result v4

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v6

    :goto_3
    if-eqz v4, :cond_4

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v4

    :goto_4
    invoke-virtual {p0}, Landroidx/camera/core/e;->c0()I

    move-result v7

    const/4 v8, 0x2

    const/16 v9, 0x23

    if-ne v7, v8, :cond_5

    move v7, v3

    goto :goto_5

    :cond_5
    move v7, v9

    :goto_5
    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v10

    if-ne v10, v9, :cond_6

    invoke-virtual {p0}, Landroidx/camera/core/e;->c0()I

    move-result v10

    if-ne v10, v8, :cond_6

    move v8, v3

    goto :goto_6

    :cond_6
    move v8, v5

    :goto_6
    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v10

    if-ne v10, v9, :cond_8

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result v9

    if-nez v9, :cond_9

    :cond_7
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Landroidx/camera/core/e;->b0()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_7

    :cond_8
    move v3, v5

    :cond_9
    :goto_7
    if-nez v8, :cond_b

    if-eqz v3, :cond_a

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    new-instance v3, Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/n;->c()I

    move-result v5

    invoke-static {v6, v4, v7, v5}, LMX1;->a(IIII)LKX1;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/camera/core/n;-><init>(LKX1;)V

    :goto_9
    if-eqz v3, :cond_c

    iget-object v4, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v4, v3}, Landroidx/camera/core/f;->v(Landroidx/camera/core/n;)V

    :cond_c
    invoke-virtual {p0}, Landroidx/camera/core/e;->k0()V

    iget-object v4, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {v2, v4, v1}, Landroidx/camera/core/n;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    invoke-static {p2, v1}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v1

    iget-object v4, p0, Landroidx/camera/core/e;->q:Landroidx/camera/core/impl/DeferrableSurface;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    :cond_d
    new-instance v4, LNY1;

    invoke-virtual {v2}, Landroidx/camera/core/n;->a()Landroid/view/Surface;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v6

    invoke-direct {v4, v5, v0, v6}, LNY1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v4, p0, Landroidx/camera/core/e;->q:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v4}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v4, LyW1;

    invoke-direct {v4, v2, v3}, LyW1;-><init>(Landroidx/camera/core/n;Landroidx/camera/core/n;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, LBR5;->b()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/q$b;->r(Landroid/util/Range;)Landroidx/camera/core/impl/q$b;

    iget-object v0, p0, Landroidx/camera/core/e;->q:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/q$b;->k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    new-instance v0, LzW1;

    invoke-direct {v0, p0, p1, p2, p3}, LzW1;-><init>(Landroidx/camera/core/e;Ljava/lang/String;Landroidx/camera/core/impl/h;LBR5;)V

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    return-object v1
.end method

.method public Z()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->R(I)I

    move-result v0

    return v0
.end method

.method public a0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->S(I)I

    move-result v0

    return v0
.end method

.method public b0()Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    sget-object v1, Landroidx/camera/core/e;->s:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->U(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->V(I)I

    move-result v0

    return v0
.end method

.method public final d0(LLb0;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e;->e0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public e0()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/h;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/h;->W(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public i0(Ljava/util/concurrent/Executor;Landroidx/camera/core/e$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/e;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    new-instance v2, LAW1;

    invoke-direct {v2, p2}, LAW1;-><init>(Landroidx/camera/core/e$a;)V

    invoke-virtual {v1, p1, v2}, Landroidx/camera/core/f;->r(Ljava/util/concurrent/Executor;Landroidx/camera/core/e$a;)V

    iget-object p1, p0, Landroidx/camera/core/e;->p:Landroidx/camera/core/e$a;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/p;->A()V

    :cond_0
    iput-object p2, p0, Landroidx/camera/core/e;->p:Landroidx/camera/core/e$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j(ZLVf6;)Landroidx/camera/core/impl/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LVf6;",
            ")",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    sget-object v0, LVf6$b;->d:LVf6$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, LVf6;->a(LVf6$b;I)Landroidx/camera/core/impl/f;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/camera/core/e;->r:Landroidx/camera/core/e$d;

    invoke-virtual {p1}, Landroidx/camera/core/e$d;->a()Landroidx/camera/core/impl/h;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/f;->N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/e;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->P(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/e;->k0()V

    :cond_0
    return-void
.end method

.method public final k0()V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/camera/core/e;->n:Landroidx/camera/core/f;

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/f;->w(I)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageAnalysis:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/p;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "Landroidx/camera/core/impl/s$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/e$c;->f(Landroidx/camera/core/impl/f;)Landroidx/camera/core/e$c;

    move-result-object p1

    return-object p1
.end method
