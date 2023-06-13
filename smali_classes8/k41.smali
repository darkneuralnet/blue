.class public Lk41;
.super Lv91;
.source "SourceFile"


# instance fields
.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Lk41;

.field public n:Lk41;

.field public o:Lk41;

.field public p:LH91;

.field public q:LH91;

.field public r:[I


# direct methods
.method public constructor <init>(Lq91;Z)V
    .locals 2

    invoke-direct {p0, p1}, Lv91;-><init>(Lq91;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk41;->k:Z

    iput-boolean v0, p0, Lk41;->l:Z

    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, Lk41;->r:[I

    iput-boolean p2, p0, Lk41;->j:Z

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p1, v0}, Lq91;->m(I)LyB0;

    move-result-object p2

    invoke-virtual {p1, v1}, Lq91;->m(I)LyB0;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lv91;->h(LyB0;LyB0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lq91;->r()I

    move-result p2

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Lq91;->m(I)LyB0;

    move-result-object v0

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Lq91;->m(I)LyB0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lv91;->h(LyB0;LyB0;)V

    :goto_0
    invoke-virtual {p0}, Lk41;->j()V

    return-void

    :array_0
    .array-data 4
        0x0
        -0x3e7
        -0x3e7
    .end array-data
.end method


# virtual methods
.method public E(Lk41;)V
    .locals 0

    iput-object p1, p0, Lk41;->n:Lk41;

    return-void
.end method

.method public F(Lk41;)V
    .locals 0

    iput-object p1, p0, Lk41;->o:Lk41;

    return-void
.end method

.method public H(Lk41;)V
    .locals 0

    iput-object p1, p0, Lk41;->m:Lk41;

    return-void
.end method

.method public J(Z)V
    .locals 0

    iput-boolean p1, p0, Lk41;->l:Z

    return-void
.end method

.method public K(Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lk41;->J(Z)V

    iget-object v0, p0, Lk41;->m:Lk41;

    invoke-virtual {v0, p1}, Lk41;->J(Z)V

    return-void
.end method

.method public e()Lq91;
    .locals 1

    iget-object v0, p0, Lv91;->b:Lq91;

    return-object v0
.end method

.method public final j()V
    .locals 2

    new-instance v0, LSl2;

    iget-object v1, p0, Lv91;->b:Lq91;

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v1

    invoke-direct {v0, v1}, LSl2;-><init>(LSl2;)V

    iput-object v0, p0, Lv91;->c:LSl2;

    iget-boolean v1, p0, Lk41;->j:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LSl2;->b()V

    :cond_0
    return-void
.end method

.method public k()LH91;
    .locals 1

    iget-object v0, p0, Lk41;->p:LH91;

    return-object v0
.end method

.method public l()LH91;
    .locals 1

    iget-object v0, p0, Lk41;->q:LH91;

    return-object v0
.end method

.method public m()Lk41;
    .locals 1

    iget-object v0, p0, Lk41;->n:Lk41;

    return-object v0
.end method

.method public n()Lk41;
    .locals 1

    iget-object v0, p0, Lk41;->o:Lk41;

    return-object v0
.end method

.method public o()Lk41;
    .locals 1

    iget-object v0, p0, Lk41;->m:Lk41;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lk41;->j:Z

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lk41;->k:Z

    return v0
.end method

.method public r()Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    :goto_0
    const/4 v4, 0x2

    if-ge v2, v4, :cond_2

    iget-object v5, p0, Lv91;->c:LSl2;

    invoke-virtual {v5, v2}, LSl2;->h(I)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lv91;->c:LSl2;

    invoke-virtual {v5, v2, v0}, LSl2;->e(II)I

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Lv91;->c:LSl2;

    invoke-virtual {v5, v2, v4}, LSl2;->e(II)I

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    move v3, v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method

.method public s()Z
    .locals 6

    iget-object v0, p0, Lv91;->c:LSl2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LSl2;->i(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lv91;->c:LSl2;

    invoke-virtual {v0, v2}, LSl2;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    iget-object v3, p0, Lv91;->c:LSl2;

    invoke-virtual {v3, v1}, LSl2;->h(I)Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    iget-object v3, p0, Lv91;->c:LSl2;

    invoke-virtual {v3, v1, v4}, LSl2;->a(II)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v3, v1

    goto :goto_3

    :cond_3
    :goto_2
    move v3, v2

    :goto_3
    iget-object v5, p0, Lv91;->c:LSl2;

    invoke-virtual {v5, v2}, LSl2;->h(I)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, p0, Lv91;->c:LSl2;

    invoke-virtual {v5, v2, v4}, LSl2;->a(II)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    move v4, v1

    goto :goto_5

    :cond_5
    :goto_4
    move v4, v2

    :goto_5
    if-eqz v0, :cond_6

    if-eqz v3, :cond_6

    if-eqz v4, :cond_6

    move v1, v2

    :cond_6
    return v1
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lk41;->l:Z

    return v0
.end method

.method public u(LH91;)V
    .locals 0

    iput-object p1, p0, Lk41;->p:LH91;

    return-void
.end method

.method public v(Z)V
    .locals 0

    iput-boolean p1, p0, Lk41;->k:Z

    return-void
.end method

.method public w(LH91;)V
    .locals 0

    iput-object p1, p0, Lk41;->q:LH91;

    return-void
.end method
