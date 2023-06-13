.class public LgO2;
.super LH91;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lk41;LbC1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LH91;-><init>(Lk41;LbC1;)V

    return-void
.end method


# virtual methods
.method public i(Lk41;)Lk41;
    .locals 0

    invoke-virtual {p1}, Lk41;->m()Lk41;

    move-result-object p1

    return-object p1
.end method

.method public n(Lk41;LH91;)V
    .locals 0

    invoke-virtual {p1, p2}, Lk41;->u(LH91;)V

    return-void
.end method

.method public r()Ljava/util/List;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LH91;->a:Lk41;

    :cond_0
    invoke-virtual {v1}, Lk41;->l()LH91;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, LpU2;

    iget-object v3, p0, LH91;->j:LbC1;

    invoke-direct {v2, v1, v3}, LpU2;-><init>(Lk41;LbC1;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Lk41;->m()Lk41;

    move-result-object v1

    iget-object v2, p0, LH91;->a:Lk41;

    if-ne v1, v2, :cond_0

    return-object v0
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, LH91;->a:Lk41;

    :cond_0
    invoke-virtual {v0}, Lv91;->g()LD83;

    move-result-object v1

    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v1

    check-cast v1, Ll41;

    invoke-virtual {v1, p0}, Ll41;->o(LH91;)V

    invoke-virtual {v0}, Lk41;->m()Lk41;

    move-result-object v0

    iget-object v1, p0, LH91;->a:Lk41;

    if-ne v0, v1, :cond_0

    return-void
.end method
