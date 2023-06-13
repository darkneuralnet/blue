.class public LnA3;
.super LFE1;
.source "SourceFile"


# instance fields
.field public d:[LyB0;

.field public e:Z

.field public f:LyB0;

.field public g:LqA3;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:LnA3;

.field public l:LoA3;

.field public m:LfO2;

.field public n:LnA3;


# direct methods
.method public constructor <init>(LyB0;LyB0;ZLqA3;[LyB0;)V
    .locals 0

    invoke-direct {p0, p1}, LFE1;-><init>(LyB0;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LnA3;->h:Z

    iput-boolean p1, p0, LnA3;->i:Z

    iput-boolean p1, p0, LnA3;->j:Z

    iput-object p2, p0, LnA3;->f:LyB0;

    iput-boolean p3, p0, LnA3;->e:Z

    iput-object p5, p0, LnA3;->d:[LyB0;

    iput-object p4, p0, LnA3;->g:LqA3;

    return-void
.end method

.method public static r([LyB0;LqA3;Z)LnA3;
    .locals 9

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    aget-object v1, p0, v1

    aget-object v0, p0, v0

    move-object v5, v0

    move-object v4, v1

    goto :goto_0

    :cond_0
    array-length v1, p0

    sub-int/2addr v1, v0

    aget-object v2, p0, v1

    sub-int/2addr v1, v0

    aget-object v0, p0, v1

    move-object v5, v0

    move-object v4, v2

    :goto_0
    new-instance v0, LnA3;

    move-object v3, v0

    move v6, p2

    move-object v7, p1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, LnA3;-><init>(LyB0;LyB0;ZLqA3;[LyB0;)V

    return-object v0
.end method

.method public static s([LyB0;LqA3;)LnA3;
    .locals 2

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LnA3;->r([LyB0;LqA3;Z)LnA3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, LnA3;->r([LyB0;LqA3;Z)LnA3;

    move-result-object p0

    invoke-virtual {v0, p0}, LFE1;->k(LFE1;)V

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->h:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LnA3;->i:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->h:Z

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v0

    iget-boolean v0, v0, LnA3;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()Z
    .locals 1

    invoke-virtual {p0}, LnA3;->A()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v0

    invoke-virtual {v0}, LnA3;->A()Z

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
    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->i:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, LnA3;->k:LnA3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G()Z
    .locals 1

    iget-object v0, p0, LnA3;->n:LnA3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->j:Z

    return v0
.end method

.method public I()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LnA3;->h:Z

    return-void
.end method

.method public J()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LnA3;->i:Z

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v1

    iput-boolean v0, v1, LnA3;->i:Z

    return-void
.end method

.method public final K()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LnA3;->j:Z

    return-void
.end method

.method public L()V
    .locals 1

    invoke-virtual {p0}, LnA3;->K()V

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v0

    invoke-virtual {v0}, LnA3;->K()V

    return-void
.end method

.method public M()LnA3;
    .locals 1

    iget-object v0, p0, LnA3;->k:LnA3;

    return-object v0
.end method

.method public N()LnA3;
    .locals 1

    iget-object v0, p0, LnA3;->n:LnA3;

    return-object v0
.end method

.method public O()LnA3;
    .locals 1

    invoke-virtual {p0}, LFE1;->l()LFE1;

    move-result-object v0

    check-cast v0, LnA3;

    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, LnA3;->h:Z

    if-eqz v0, :cond_0

    const-string v0, " resA"

    return-object v0

    :cond_0
    iget-boolean v0, p0, LnA3;->i:Z

    if-eqz v0, :cond_1

    const-string v0, " resL"

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public Q(LoA3;)V
    .locals 0

    iput-object p1, p0, LnA3;->l:LoA3;

    return-void
.end method

.method public R(LfO2;)V
    .locals 0

    iput-object p1, p0, LnA3;->m:LfO2;

    return-void
.end method

.method public S(LnA3;)V
    .locals 0

    iput-object p1, p0, LnA3;->k:LnA3;

    return-void
.end method

.method public T(LnA3;)V
    .locals 0

    iput-object p1, p0, LnA3;->n:LnA3;

    return-void
.end method

.method public U()LnA3;
    .locals 1

    invoke-virtual {p0}, LFE1;->p()LFE1;

    move-result-object v0

    check-cast v0, LnA3;

    return-object v0
.end method

.method public V()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LnA3;->h:Z

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v1

    iput-boolean v0, v1, LnA3;->h:Z

    return-void
.end method

.method public e()LyB0;
    .locals 1

    iget-object v0, p0, LnA3;->f:LyB0;

    return-object v0
.end method

.method public q(LDB0;)V
    .locals 5

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-boolean v3, p0, LnA3;->e:Z

    if-eqz v3, :cond_1

    xor-int/2addr v0, v2

    :goto_1
    iget-object v2, p0, LnA3;->d:[LyB0;

    array-length v3, v2

    if-ge v0, v3, :cond_3

    aget-object v2, v2, v0

    invoke-virtual {p1, v2, v1}, LDB0;->f(LyB0;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v3, p0, LnA3;->d:[LyB0;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-eqz v0, :cond_2

    array-length v0, v3

    add-int/lit8 v4, v0, -0x1

    :cond_2
    :goto_2
    if-ltz v4, :cond_3

    iget-object v0, p0, LnA3;->d:[LyB0;

    aget-object v0, v0, v4

    invoke-virtual {p1, v0, v1}, LDB0;->f(LyB0;Z)V

    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public t()LyB0;
    .locals 1

    invoke-virtual {p0}, LFE1;->m()LyB0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, LFE1;->m()LyB0;

    move-result-object v0

    invoke-virtual {p0}, LFE1;->d()LyB0;

    move-result-object v1

    iget-object v2, p0, LnA3;->d:[LyB0;

    array-length v2, v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LnA3;->e()LyB0;

    move-result-object v3

    invoke-static {v3}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OE( "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " .. "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ) "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LnA3;->g:LqA3;

    iget-boolean v1, p0, LnA3;->e:Z

    invoke-virtual {v0, v1}, LqA3;->F(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LnA3;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " / Sym: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v0

    invoke-virtual {v0}, LnA3;->x()LqA3;

    move-result-object v0

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v1

    iget-boolean v1, v1, LnA3;->e:Z

    invoke-virtual {v0, v1}, LqA3;->F(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LnA3;->U()LnA3;

    move-result-object v0

    invoke-virtual {v0}, LnA3;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()[LyB0;
    .locals 1

    iget-boolean v0, p0, LnA3;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LnA3;->d:[LyB0;

    return-object v0

    :cond_0
    iget-object v0, p0, LnA3;->d:[LyB0;

    invoke-virtual {v0}, [LyB0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LyB0;

    invoke-static {v0}, LBB0;->h([LyB0;)V

    return-object v0
.end method

.method public v()LoA3;
    .locals 1

    iget-object v0, p0, LnA3;->l:LoA3;

    return-object v0
.end method

.method public w()LfO2;
    .locals 1

    iget-object v0, p0, LnA3;->m:LfO2;

    return-object v0
.end method

.method public x()LqA3;
    .locals 1

    iget-object v0, p0, LnA3;->g:LqA3;

    return-object v0
.end method

.method public y(II)I
    .locals 2

    iget-object v0, p0, LnA3;->g:LqA3;

    iget-boolean v1, p0, LnA3;->e:Z

    invoke-virtual {v0, p1, p2, v1}, LqA3;->d(IIZ)I

    move-result p1

    return p1
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, LnA3;->e:Z

    return v0
.end method
