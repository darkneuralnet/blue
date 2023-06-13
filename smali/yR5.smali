.class public LyR5;
.super Landroidx/camera/core/p;
.source "SourceFile"


# static fields
.field public static final s:LAR5;


# instance fields
.field public final n:Lxu6;

.field public o:LYV5;

.field public p:LYV5;

.field public q:LMV5;

.field public r:LMV5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LzR5;

    invoke-direct {v0}, LzR5;-><init>()V

    invoke-virtual {v0}, LzR5;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    new-instance v1, LAR5;

    invoke-static {v0}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v0

    invoke-direct {v1, v0}, LAR5;-><init>(Landroidx/camera/core/impl/n;)V

    sput-object v1, LyR5;->s:LAR5;

    return-void
.end method

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

    new-instance v0, Lxu6;

    invoke-direct {v0, p1, p2, p3}, Lxu6;-><init>(LLb0;Ljava/util/Set;LVf6;)V

    invoke-direct {p0, v0}, LyR5;-><init>(Lxu6;)V

    return-void
.end method

.method public constructor <init>(Lxu6;)V
    .locals 1

    sget-object v0, LyR5;->s:LAR5;

    invoke-direct {p0, v0}, Landroidx/camera/core/p;-><init>(Landroidx/camera/core/impl/s;)V

    iput-object p1, p0, LyR5;->n:Lxu6;

    return-void
.end method

.method public static synthetic U(LyR5;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LyR5;->b0(Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method private synthetic b0(Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-virtual {p0}, LyR5;->W()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LyR5;->X(Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_0
    return-void
.end method


# virtual methods
.method public F()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/p;->F()V

    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0}, Lxu6;->m()V

    return-void
.end method

.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 1
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

    iget-object p1, p0, LyR5;->n:Lxu6;

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxu6;->A(Landroidx/camera/core/impl/l;)V

    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method

.method public I()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/p;->I()V

    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0}, Lxu6;->B()V

    return-void
.end method

.method public J()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/p;->J()V

    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0}, Lxu6;->C()V

    return-void
.end method

.method public K(LBR5;)LBR5;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, LyR5;->X(Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->A()V

    return-object p1
.end method

.method public L()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/p;->L()V

    invoke-virtual {p0}, LyR5;->W()V

    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0}, Lxu6;->F()V

    return-void
.end method

.method public final V(Landroidx/camera/core/impl/q$b;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/q$b;",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "LBR5;",
            ")V"
        }
    .end annotation

    new-instance v0, LxR5;

    invoke-direct {v0, p0, p2, p3, p4}, LxR5;-><init>(LyR5;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    return-void
.end method

.method public final W()V
    .locals 2

    iget-object v0, p0, LyR5;->q:LMV5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMV5;->h()V

    iput-object v1, p0, LyR5;->q:LMV5;

    :cond_0
    iget-object v0, p0, LyR5;->r:LMV5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LMV5;->h()V

    iput-object v1, p0, LyR5;->r:LMV5;

    :cond_1
    iget-object v0, p0, LyR5;->p:LYV5;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYV5;->h()V

    iput-object v1, p0, LyR5;->p:LYV5;

    :cond_2
    iget-object v0, p0, LyR5;->o:LYV5;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LYV5;->h()V

    iput-object v1, p0, LyR5;->o:LYV5;

    :cond_3
    return-void
.end method

.method public final X(Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)Landroidx/camera/core/impl/q;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "LBR5;",
            ")",
            "Landroidx/camera/core/impl/q;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLb0;

    new-instance v10, LMV5;

    const/4 v2, 0x3

    const/16 v3, 0x22

    invoke-virtual {p0}, Landroidx/camera/core/p;->q()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-interface {v0}, LLb0;->q()Z

    move-result v6

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0, v1}, LyR5;->Z(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v10

    move-object v4, p3

    invoke-direct/range {v1 .. v9}, LMV5;-><init>(IILBR5;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IZ)V

    iput-object v10, p0, LyR5;->q:LMV5;

    invoke-virtual {p0, v10, v0}, LyR5;->a0(LMV5;LLb0;)LMV5;

    move-result-object v1

    iput-object v1, p0, LyR5;->r:LMV5;

    new-instance v1, LYV5;

    invoke-static {}, LLY0$a;->a()LUV5;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LYV5;-><init>(LLb0;LUV5;)V

    iput-object v1, p0, LyR5;->p:LYV5;

    iget-object v0, p0, LyR5;->n:Lxu6;

    iget-object v1, p0, LyR5;->r:LMV5;

    invoke-virtual {v0, v1}, Lxu6;->v(LMV5;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LyR5;->p:LYV5;

    iget-object v2, p0, LyR5;->r:LMV5;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2, v3}, LYV5$b;->c(LMV5;Ljava/util/List;)LYV5$b;

    move-result-object v2

    invoke-virtual {v1, v2}, LYV5;->l(LYV5$b;)LYV5$c;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/p;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMV5;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0, v2}, Lxu6;->E(Ljava/util/Map;)V

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    iget-object v1, p0, LyR5;->q:LMV5;

    invoke-virtual {v1}, LMV5;->o()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    iget-object v1, p0, LyR5;->n:Lxu6;

    invoke-virtual {v1}, Lxu6;->x()Lpa0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->i(Lpa0;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {p0, v0, p1, p2, p3}, LyR5;->V(Landroidx/camera/core/impl/q$b;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    return-object p1
.end method

.method public Y()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LyR5;->n:Lxu6;

    invoke-virtual {v0}, Lxu6;->u()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final Z(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final a0(LMV5;LLb0;)LMV5;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, LYV5;

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v1

    invoke-virtual {v1}, Lyb0;->a()LUV5;

    move-result-object v1

    invoke-direct {v0, p2, v1}, LYV5;-><init>(LLb0;LUV5;)V

    iput-object v0, p0, LyR5;->o:LYV5;

    invoke-static {p1}, LYV5$d;->i(LMV5;)LYV5$d;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, LYV5$b;->c(LMV5;Ljava/util/List;)LYV5$b;

    move-result-object p1

    iget-object v0, p0, LyR5;->o:LYV5;

    invoke-virtual {v0, p1}, LYV5;->l(LYV5$b;)LYV5$c;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMV5;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
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

    sget-object v0, LVf6$b;->e:LVf6$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, LVf6;->a(LVf6$b;I)Landroidx/camera/core/impl/f;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, LyR5;->s:LAR5;

    invoke-virtual {p1}, LAR5;->B()Landroidx/camera/core/impl/f;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/f;->N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, LyR5;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    :goto_0
    return-object p1
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

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "Landroidx/camera/core/impl/s$a<",
            "***>;"
        }
    .end annotation

    new-instance v0, LzR5;

    invoke-static {p1}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p1

    invoke-direct {v0, p1}, LzR5;-><init>(Landroidx/camera/core/impl/m;)V

    return-object v0
.end method
