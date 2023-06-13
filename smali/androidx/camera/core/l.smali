.class public final Landroidx/camera/core/l;
.super Landroidx/camera/core/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/l$c;,
        Landroidx/camera/core/l$b;,
        Landroidx/camera/core/l$a;
    }
.end annotation


# static fields
.field public static final u:Landroidx/camera/core/l$b;

.field public static final v:Ljava/util/concurrent/Executor;


# instance fields
.field public n:Landroidx/camera/core/l$c;

.field public o:Ljava/util/concurrent/Executor;

.field public p:Landroidx/camera/core/impl/DeferrableSurface;

.field public q:LMV5;

.field public r:Landroidx/camera/core/o;

.field public s:Landroid/util/Size;

.field public t:LYV5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/l$b;

    invoke-direct {v0}, Landroidx/camera/core/l$b;-><init>()V

    sput-object v0, Landroidx/camera/core/l;->u:Landroidx/camera/core/l$b;

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/l;->v:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/o;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/p;-><init>(Landroidx/camera/core/impl/s;)V

    sget-object p1, Landroidx/camera/core/l;->v:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/camera/core/l;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic U(Landroidx/camera/core/l;LMV5;LLb0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/l;->d0(LMV5;LLb0;)V

    return-void
.end method

.method public static synthetic V(Landroidx/camera/core/l;Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/l;->c0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method public static synthetic W(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/l;->e0(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V

    return-void
.end method

.method private synthetic c0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/l;->Z(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_0
    return-void
.end method

.method private synthetic d0(LMV5;LLb0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/l;->f0(LMV5;LLb0;)V

    return-void
.end method

.method public static synthetic e0(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/l$c;->a(Landroidx/camera/core/o;)V

    return-void
.end method


# virtual methods
.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 3
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

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/m;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/m;->a()Landroid/util/Size;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/k;->r:Landroidx/camera/core/impl/f$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroidx/camera/core/m$a;->b(Landroidx/camera/core/m;)Landroidx/camera/core/m$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/camera/core/m$a;->c(Landroid/util/Size;)Landroidx/camera/core/m$a;

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/m$a;->a()Landroidx/camera/core/m;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_0
    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method

.method public K(LBR5;)LBR5;
    .locals 2

    invoke-virtual {p1}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/l;->s:Landroid/util/Size;

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/o;

    invoke-virtual {p0, v0, v1, p1}, Landroidx/camera/core/l;->l0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V

    return-object p1
.end method

.method public L()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/l;->Y()V

    return-void
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/camera/core/p;->Q(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroidx/camera/core/l;->h0()V

    return-void
.end method

.method public final X(Landroidx/camera/core/impl/q$b;Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/core/l;->p:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    :cond_0
    new-instance v0, LX14;

    invoke-direct {v0, p0, p2, p3, p4}, LX14;-><init>(Landroidx/camera/core/l;Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    return-void
.end method

.method public final Y()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/l;->p:Landroidx/camera/core/impl/DeferrableSurface;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    iput-object v1, p0, Landroidx/camera/core/l;->p:Landroidx/camera/core/impl/DeferrableSurface;

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/l;->t:LYV5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYV5;->h()V

    iput-object v1, p0, Landroidx/camera/core/l;->t:LYV5;

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/l;->q:LMV5;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LMV5;->h()V

    iput-object v1, p0, Landroidx/camera/core/l;->q:LMV5;

    :cond_2
    iput-object v1, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    return-void
.end method

.method public Z(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 5

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/l;->a0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LO36;->a()V

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/l;->Y()V

    new-instance v1, Landroidx/camera/core/o;

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v3

    new-instance v4, LU14;

    invoke-direct {v4, p0}, LU14;-><init>(Landroidx/camera/core/l;)V

    invoke-direct {v1, v2, v3, v4}, Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Ljava/lang/Runnable;)V

    iput-object v1, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    iget-object v2, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/l;->g0()V

    :cond_1
    invoke-virtual {v1}, Landroidx/camera/core/o;->l()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/l;->p:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/camera/core/l;->X(Landroidx/camera/core/impl/q$b;Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V

    invoke-virtual {p3}, LBR5;->b()Landroid/util/Range;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/q$b;->r(Landroid/util/Range;)Landroidx/camera/core/impl/q$b;

    return-object v0
.end method

.method public final a0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 11

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, LLb0;

    invoke-virtual {p0}, Landroidx/camera/core/l;->Y()V

    new-instance v2, LYV5;

    invoke-virtual {v0}, Lyb0;->a()LUV5;

    move-result-object v0

    invoke-direct {v2, v1, v0}, LYV5;-><init>(LLb0;LUV5;)V

    iput-object v2, p0, Landroidx/camera/core/l;->t:LYV5;

    iget-object v0, p0, Landroidx/camera/core/l;->q:LMV5;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    new-instance v0, LMV5;

    const/4 v3, 0x1

    const/16 v4, 0x22

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-interface {v1}, LLb0;->q()Z

    move-result v7

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/camera/core/l;->b0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v2

    invoke-virtual {p0, v1, v2}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result v9

    invoke-virtual {p0, v1}, Landroidx/camera/core/l;->k0(LLb0;)Z

    move-result v10

    move-object v2, v0

    move-object v5, p3

    invoke-direct/range {v2 .. v10}, LMV5;-><init>(IILBR5;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IZ)V

    iput-object v0, p0, Landroidx/camera/core/l;->q:LMV5;

    new-instance v2, LU14;

    invoke-direct {v2, p0}, LU14;-><init>(Landroidx/camera/core/l;)V

    invoke-virtual {v0, v2}, LMV5;->e(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/camera/core/l;->q:LMV5;

    invoke-static {v0}, LYV5$d;->i(LMV5;)LYV5$d;

    move-result-object v0

    iget-object v2, p0, Landroidx/camera/core/l;->q:LMV5;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, LYV5$b;->c(LMV5;Ljava/util/List;)LYV5$b;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/l;->t:LYV5;

    invoke-virtual {v3, v2}, LYV5;->l(LYV5$b;)LYV5$c;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMV5;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LW14;

    invoke-direct {v2, p0, v0, v1}, LW14;-><init>(Landroidx/camera/core/l;LMV5;LLb0;)V

    invoke-virtual {v0, v2}, LMV5;->e(Ljava/lang/Runnable;)V

    iget-object v2, p0, Landroidx/camera/core/l;->q:LMV5;

    invoke-virtual {v2}, LMV5;->o()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/core/l;->p:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0, v1}, LMV5;->j(LLb0;)Landroidx/camera/core/o;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    iget-object v0, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/l;->g0()V

    :cond_1
    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/camera/core/l;->X(Landroidx/camera/core/impl/q$b;Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V

    return-object v0
.end method

.method public final b0(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f0(LMV5;LLb0;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1, p2}, LMV5;->j(LLb0;)Landroidx/camera/core/o;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    invoke-virtual {p0}, Landroidx/camera/core/l;->g0()V

    :cond_0
    return-void
.end method

.method public final g0()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/l$c;

    iget-object v1, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    invoke-static {v1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/o;

    iget-object v2, p0, Landroidx/camera/core/l;->o:Ljava/util/concurrent/Executor;

    new-instance v3, LV14;

    invoke-direct {v3, v0, v1}, LV14;-><init>(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Landroidx/camera/core/l;->h0()V

    return-void
.end method

.method public final h0()V
    .locals 5

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    iget-object v2, p0, Landroidx/camera/core/l;->s:Landroid/util/Size;

    invoke-virtual {p0, v2}, Landroidx/camera/core/l;->b0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/l;->r:Landroidx/camera/core/o;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    iget-object v1, p0, Landroidx/camera/core/l;->t:LYV5;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/p;->c()I

    move-result v4

    invoke-interface {v0}, LLb0;->q()Z

    move-result v0

    invoke-static {v2, v1, v4, v0}, Landroidx/camera/core/o$h;->e(Landroid/graphics/Rect;IIZ)Landroidx/camera/core/o$h;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroidx/camera/core/o;->C(Landroidx/camera/core/o$h;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/l;->q:LMV5;

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v2

    invoke-virtual {p0, v0, v2}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result v0

    invoke-virtual {v1, v0}, LMV5;->D(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public i0(Landroidx/camera/core/l$c;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/l;->v:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/l;->j0(Ljava/util/concurrent/Executor;Landroidx/camera/core/l$c;)V

    return-void
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

    sget-object v0, LVf6$b;->c:LVf6$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, LVf6;->a(LVf6$b;I)Landroidx/camera/core/impl/f;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/camera/core/l;->u:Landroidx/camera/core/l$b;

    invoke-virtual {p1}, Landroidx/camera/core/l$b;->a()Landroidx/camera/core/impl/o;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/f;->N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/l;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j0(Ljava/util/concurrent/Executor;Landroidx/camera/core/l$c;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    invoke-virtual {p0}, Landroidx/camera/core/p;->B()V

    goto :goto_0

    :cond_0
    iput-object p2, p0, Landroidx/camera/core/l;->n:Landroidx/camera/core/l$c;

    iput-object p1, p0, Landroidx/camera/core/l;->o:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Landroidx/camera/core/p;->A()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/o;

    invoke-virtual {p0}, Landroidx/camera/core/p;->d()LBR5;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/camera/core/l;->l0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final k0(LLb0;)Z
    .locals 1

    invoke-interface {p1}, LLb0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final l0(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/l;->Z(Ljava/lang/String;Landroidx/camera/core/impl/o;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    return-void
.end method

.method public s()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview:"

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

    invoke-static {p1}, Landroidx/camera/core/l$a;->f(Landroidx/camera/core/impl/f;)Landroidx/camera/core/l$a;

    move-result-object p1

    return-object p1
.end method
