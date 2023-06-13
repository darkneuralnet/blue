.class public abstract LH91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lk41;

.field public b:I

.field public c:Ljava/util/List;

.field public d:Ljava/util/List;

.field public e:LSl2;

.field public f:LKr2;

.field public g:Z

.field public h:LH91;

.field public i:Ljava/util/ArrayList;

.field public j:LbC1;


# direct methods
.method public constructor <init>(Lk41;LbC1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LH91;->b:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LH91;->c:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LH91;->d:Ljava/util/List;

    new-instance v1, LSl2;

    invoke-direct {v1, v0}, LSl2;-><init>(I)V

    iput-object v1, p0, LH91;->e:LSl2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LH91;->i:Ljava/util/ArrayList;

    iput-object p2, p0, LH91;->j:LbC1;

    invoke-virtual {p0, p1}, LH91;->d(Lk41;)V

    invoke-virtual {p0}, LH91;->e()V

    return-void
.end method


# virtual methods
.method public a(LH91;)V
    .locals 1

    iget-object v0, p0, LH91;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lq91;ZZ)V
    .locals 1

    invoke-virtual {p1}, Lq91;->n()[LyB0;

    move-result-object p1

    if-eqz p2, :cond_0

    xor-int/lit8 p2, p3, 0x1

    :goto_0
    array-length p3, p1

    if-ge p2, p3, :cond_2

    iget-object p3, p0, LH91;->d:Ljava/util/List;

    aget-object v0, p1, p2

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    array-length p2, p1

    add-int/lit8 p2, p2, -0x2

    if-eqz p3, :cond_1

    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    :cond_1
    :goto_1
    if-ltz p2, :cond_2

    iget-object p3, p0, LH91;->d:Ljava/util/List;

    aget-object v0, p1, p2

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final c()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LH91;->b:I

    iget-object v0, p0, LH91;->a:Lk41;

    :cond_0
    invoke-virtual {v0}, Lv91;->g()LD83;

    move-result-object v1

    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v1

    check-cast v1, Ll41;

    invoke-virtual {v1, p0}, Ll41;->m(LH91;)I

    move-result v1

    iget v2, p0, LH91;->b:I

    if-le v1, v2, :cond_1

    iput v1, p0, LH91;->b:I

    :cond_1
    invoke-virtual {p0, v0}, LH91;->i(Lk41;)Lk41;

    move-result-object v0

    iget-object v1, p0, LH91;->a:Lk41;

    if-ne v0, v1, :cond_0

    iget v0, p0, LH91;->b:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, LH91;->b:I

    return-void
.end method

.method public d(Lk41;)V
    .locals 3

    iput-object p1, p0, LH91;->a:Lk41;

    const/4 v0, 0x1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lk41;->k()LH91;

    move-result-object v1

    if-eq v1, p0, :cond_1

    iget-object v1, p0, LH91;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lv91;->f()LSl2;

    move-result-object v1

    invoke-virtual {v1}, LSl2;->g()Z

    move-result v2

    invoke-static {v2}, LKo;->c(Z)V

    invoke-virtual {p0, v1}, LH91;->l(LSl2;)V

    invoke-virtual {p1}, Lk41;->e()Lq91;

    move-result-object v1

    invoke-virtual {p1}, Lk41;->p()Z

    move-result v2

    invoke-virtual {p0, v1, v2, v0}, LH91;->b(Lq91;ZZ)V

    invoke-virtual {p0, p1, p0}, LH91;->n(Lk41;LH91;)V

    invoke-virtual {p0, p1}, LH91;->i(Lk41;)Lk41;

    move-result-object p1

    iget-object v0, p0, LH91;->a:Lk41;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/locationtech/jts/geom/TopologyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Directed Edge visited twice during ring-building at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv91;->c()LyB0;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    const-string v0, "Found null DirectedEdge"

    invoke-direct {p1, v0}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, LH91;->f:LKr2;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LH91;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [LyB0;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LH91;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LH91;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LyB0;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LH91;->j:LbC1;

    invoke-virtual {v1, v0}, LbC1;->j([LyB0;)LKr2;

    move-result-object v0

    iput-object v0, p0, LH91;->f:LKr2;

    invoke-virtual {v0}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-static {v0}, LDy3;->c([LyB0;)Z

    move-result v0

    iput-boolean v0, p0, LH91;->g:Z

    return-void
.end method

.method public f(I)LyB0;
    .locals 1

    iget-object v0, p0, LH91;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyB0;

    return-object p1
.end method

.method public g()LKr2;
    .locals 1

    iget-object v0, p0, LH91;->f:LKr2;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LH91;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, LH91;->c()V

    :cond_0
    iget v0, p0, LH91;->b:I

    return v0
.end method

.method public abstract i(Lk41;)Lk41;
.end method

.method public j()LH91;
    .locals 1

    iget-object v0, p0, LH91;->h:LH91;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LH91;->g:Z

    return v0
.end method

.method public l(LSl2;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LH91;->m(LSl2;I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LH91;->m(LSl2;I)V

    return-void
.end method

.method public m(LSl2;I)V
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p1, p2, v0}, LSl2;->e(II)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LH91;->e:LSl2;

    invoke-virtual {v1, p2}, LSl2;->d(I)I

    move-result v1

    if-ne v1, v0, :cond_1

    iget-object v0, p0, LH91;->e:LSl2;

    invoke-virtual {v0, p2, p1}, LSl2;->n(II)V

    :cond_1
    return-void
.end method

.method public abstract n(Lk41;LH91;)V
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, LH91;->a:Lk41;

    :cond_0
    invoke-virtual {v0}, Lk41;->e()Lq91;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LSD1;->g(Z)V

    invoke-virtual {v0}, Lk41;->m()Lk41;

    move-result-object v0

    iget-object v1, p0, LH91;->a:Lk41;

    if-ne v0, v1, :cond_0

    return-void
.end method

.method public p(LH91;)V
    .locals 0

    iput-object p1, p0, LH91;->h:LH91;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, LH91;->a(LH91;)V

    :cond_0
    return-void
.end method

.method public q(LbC1;)LCX3;
    .locals 3

    iget-object v0, p0, LH91;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [LKr2;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LH91;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LH91;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LH91;

    invoke-virtual {v2}, LH91;->g()LKr2;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LH91;->g()LKr2;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object p1

    return-object p1
.end method
