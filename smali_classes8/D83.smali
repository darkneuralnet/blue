.class public LD83;
.super LSD1;
.source "SourceFile"


# instance fields
.field public f:LyB0;

.field public g:Lz91;


# direct methods
.method public constructor <init>(LyB0;Lz91;)V
    .locals 1

    invoke-direct {p0}, LSD1;-><init>()V

    iput-object p1, p0, LD83;->f:LyB0;

    iput-object p2, p0, LD83;->g:Lz91;

    new-instance p1, LSl2;

    const/4 p2, 0x0

    const/4 v0, -0x1

    invoke-direct {p1, p2, v0}, LSl2;-><init>(II)V

    iput-object p1, p0, LSD1;->a:LSl2;

    return-void
.end method


# virtual methods
.method public a(LP62;)V
    .locals 0

    return-void
.end method

.method public i(Lv91;)V
    .locals 1

    iget-object v0, p0, LD83;->g:Lz91;

    invoke-virtual {v0, p1}, Lz91;->g(Lv91;)V

    invoke-virtual {p1, p0}, Lv91;->i(LD83;)V

    return-void
.end method

.method public j()LyB0;
    .locals 1

    iget-object v0, p0, LD83;->f:LyB0;

    return-object v0
.end method

.method public k()Lz91;
    .locals 1

    iget-object v0, p0, LD83;->g:Lz91;

    return-object v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, LD83;->k()Lz91;

    move-result-object v0

    invoke-virtual {v0}, Lz91;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->e()Lq91;

    move-result-object v1

    invoke-virtual {v1}, LSD1;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public m()Z
    .locals 2

    iget-object v0, p0, LSD1;->a:LSl2;

    invoke-virtual {v0}, LSl2;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n(II)V
    .locals 1

    iget-object v0, p0, LSD1;->a:LSl2;

    if-nez v0, :cond_0

    new-instance v0, LSl2;

    invoke-direct {v0, p1, p2}, LSl2;-><init>(II)V

    iput-object v0, p0, LSD1;->a:LSl2;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LSl2;->n(II)V

    :goto_0
    return-void
.end method

.method public o(I)V
    .locals 2

    iget-object v0, p0, LSD1;->a:LSl2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LSl2;->d(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    iget-object v0, p0, LSD1;->a:LSl2;

    invoke-virtual {v0, p1, v1}, LSl2;->n(II)V

    return-void
.end method
