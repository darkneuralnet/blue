.class public LgC1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LWB1;

.field public b:LbC1;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LgC1;->b:LbC1;

    const/4 v0, 0x1

    iput-boolean v0, p0, LgC1;->c:Z

    iput-boolean v0, p0, LgC1;->d:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LgC1;->e:Z

    iput-boolean v0, p0, LgC1;->f:Z

    return-void
.end method


# virtual methods
.method public final a(LEB0;)LEB0;
    .locals 0

    invoke-interface {p1}, LEB0;->copy()LEB0;

    move-result-object p1

    return-object p1
.end method

.method public final b(LWB1;)LWB1;
    .locals 3

    iput-object p1, p0, LgC1;->a:LWB1;

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object v0

    iput-object v0, p0, LgC1;->b:LbC1;

    instance-of v0, p1, LFW3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LFW3;

    invoke-virtual {p0, p1, v1}, LgC1;->j(LFW3;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, LVW2;

    if-eqz v0, :cond_1

    check-cast p1, LVW2;

    invoke-virtual {p0, p1, v1}, LgC1;->h(LVW2;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, LKr2;

    if-eqz v0, :cond_2

    check-cast p1, LKr2;

    invoke-virtual {p0, p1, v1}, LgC1;->f(LKr2;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_3

    check-cast p1, LBr2;

    invoke-virtual {p0, p1, v1}, LgC1;->e(LBr2;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, LDW2;

    if-eqz v0, :cond_4

    check-cast p1, LDW2;

    invoke-virtual {p0, p1, v1}, LgC1;->g(LDW2;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_5

    check-cast p1, LCX3;

    invoke-virtual {p0, p1, v1}, LgC1;->k(LCX3;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v0, p1, LWW2;

    if-eqz v0, :cond_6

    check-cast p1, LWW2;

    invoke-virtual {p0, p1, v1}, LgC1;->i(LWW2;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_7

    check-cast p1, LXB1;

    invoke-virtual {p0, p1, v1}, LgC1;->d(LXB1;LWB1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown Geometry subtype: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(LEB0;LWB1;)LEB0;
    .locals 0

    invoke-virtual {p0, p1}, LgC1;->a(LEB0;)LEB0;

    move-result-object p1

    return-object p1
.end method

.method public d(LXB1;LWB1;)LWB1;
    .locals 3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {p0, v1}, LgC1;->b(LWB1;)LWB1;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v2, p0, LgC1;->c:Z

    if-eqz v2, :cond_1

    invoke-virtual {v1}, LWB1;->r0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p1, p0, LgC1;->d:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-static {p2}, LbC1;->D(Ljava/util/Collection;)[LWB1;

    move-result-object p2

    invoke-virtual {p1, p2}, LbC1;->d([LWB1;)LXB1;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1, p2}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public e(LBr2;LWB1;)LWB1;
    .locals 1

    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LgC1;->c(LEB0;LWB1;)LEB0;

    move-result-object p1

    invoke-virtual {p2, p1}, LbC1;->f(LEB0;)LBr2;

    move-result-object p1

    return-object p1
.end method

.method public f(LKr2;LWB1;)LWB1;
    .locals 1

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LgC1;->c(LEB0;LWB1;)LEB0;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, LgC1;->b:LbC1;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LbC1;->i(LEB0;)LKr2;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LEB0;->size()I

    move-result p2

    if-lez p2, :cond_1

    const/4 v0, 0x4

    if-ge p2, v0, :cond_1

    iget-boolean p2, p0, LgC1;->f:Z

    if-nez p2, :cond_1

    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p2, p1}, LbC1;->f(LEB0;)LBr2;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p2, p1}, LbC1;->i(LEB0;)LKr2;

    move-result-object p1

    return-object p1
.end method

.method public g(LDW2;LWB1;)LWB1;
    .locals 3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    check-cast v1, LBr2;

    invoke-virtual {p0, v1, p1}, LgC1;->e(LBr2;LWB1;)LWB1;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LWB1;->r0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LbC1;->k()LDW2;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1, p2}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public h(LVW2;LWB1;)LWB1;
    .locals 3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    check-cast v1, LFW3;

    invoke-virtual {p0, v1, p1}, LgC1;->j(LFW3;LWB1;)LWB1;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LWB1;->r0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LbC1;->m()LVW2;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1, p2}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public i(LWW2;LWB1;)LWB1;
    .locals 3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    check-cast v1, LCX3;

    invoke-virtual {p0, v1, p1}, LgC1;->k(LCX3;LWB1;)LWB1;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LWB1;->r0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LbC1;->q()LWW2;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1, p2}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public j(LFW3;LWB1;)LWB1;
    .locals 1

    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LFW3;->L0()LEB0;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LgC1;->c(LEB0;LWB1;)LEB0;

    move-result-object p1

    invoke-virtual {p2, p1}, LbC1;->u(LEB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public k(LCX3;LWB1;)LWB1;
    .locals 6

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LgC1;->f(LKr2;LWB1;)LWB1;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LWB1;->r0()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-virtual {p1}, LCX3;->r0()Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    iget-object p1, p0, LgC1;->b:LbC1;

    invoke-virtual {p1}, LbC1;->v()LCX3;

    move-result-object p1

    return-object p1

    :cond_2
    if-nez v2, :cond_3

    instance-of v2, p2, LKr2;

    if-nez v2, :cond_4

    :cond_3
    move v1, v0

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v3, v0

    :goto_2
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v4

    if-ge v3, v4, :cond_8

    invoke-virtual {p1, v3}, LCX3;->M0(I)LKr2;

    move-result-object v4

    invoke-virtual {p0, v4, p1}, LgC1;->f(LKr2;LWB1;)LWB1;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, LWB1;->r0()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    instance-of v5, v4, LKr2;

    if-nez v5, :cond_6

    move v1, v0

    :cond_6
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_8
    if-eqz v1, :cond_9

    iget-object p1, p0, LgC1;->b:LbC1;

    check-cast p2, LKr2;

    new-array v0, v0, [LKr2;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKr2;

    invoke-virtual {p1, p2, v0}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_a

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p2, p1}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method
