.class public Lv00;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LWB1;

.field public b:LbC1;

.field public c:Lu00;

.field public d:Ljava/util/Map;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 1

    sget-object v0, Lu00;->a:Lu00;

    invoke-direct {p0, p1, v0}, Lv00;-><init>(LWB1;Lu00;)V

    return-void
.end method

.method public constructor <init>(LWB1;Lu00;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv00;->a:LWB1;

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object p1

    iput-object p1, p0, Lv00;->b:LbC1;

    iput-object p2, p0, Lv00;->c:Lu00;

    return-void
.end method

.method public static f(LWB1;Lu00;)LWB1;
    .locals 1

    new-instance v0, Lv00;

    invoke-direct {v0, p0, p1}, Lv00;-><init>(LWB1;Lu00;)V

    invoke-virtual {v0}, Lv00;->e()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static h(LWB1;Lu00;)Z
    .locals 2

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LWB1;->F()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return v1

    :cond_1
    invoke-static {p0, p1}, Lv00;->f(LWB1;Lu00;)LWB1;

    move-result-object p0

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result p0

    xor-int/2addr p0, v1

    return p0

    :cond_2
    return v1
.end method


# virtual methods
.method public final a(LyB0;)V
    .locals 2

    iget-object v0, p0, Lv00;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqD0;

    if-nez v0, :cond_0

    new-instance v0, LqD0;

    invoke-direct {v0}, LqD0;-><init>()V

    iget-object v1, p0, Lv00;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, LqD0;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, LqD0;->a:I

    return-void
.end method

.method public final b(LBr2;)LWB1;
    .locals 4

    iget-object v0, p0, Lv00;->a:LWB1;

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lv00;->g()LVW2;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, LBr2;->T0()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv00;->c:Lu00;

    invoke-interface {v0, v1}, Lu00;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LBr2;->R0()LFW3;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lv00;->b:LbC1;

    invoke-virtual {p1}, LbC1;->m()LVW2;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Lv00;->b:LbC1;

    new-array v1, v1, [LFW3;

    const/4 v2, 0x0

    invoke-virtual {p1}, LBr2;->R0()LFW3;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p1}, LBr2;->O0()LFW3;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public final c(LDW2;)LWB1;
    .locals 2

    iget-object v0, p0, Lv00;->a:LWB1;

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lv00;->g()LVW2;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lv00;->d(LDW2;)[LyB0;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lv00;->b:LbC1;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, LbC1;->t(LyB0;)LFW3;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lv00;->b:LbC1;

    invoke-virtual {v0, p1}, LbC1;->p([LyB0;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public final d(LDW2;)[LyB0;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Lv00;->d:Ljava/util/Map;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p1, v2}, LXB1;->d0(I)LWB1;

    move-result-object v3

    check-cast v3, LBr2;

    invoke-virtual {v3}, LBr2;->g0()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3, v1}, LBr2;->L0(I)LyB0;

    move-result-object v4

    invoke-virtual {p0, v4}, Lv00;->a(LyB0;)V

    invoke-virtual {v3}, LBr2;->g0()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, LBr2;->L0(I)LyB0;

    move-result-object v3

    invoke-virtual {p0, v3}, Lv00;->a(LyB0;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lv00;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LqD0;

    iget v2, v2, LqD0;->a:I

    iget-object v3, p0, Lv00;->c:Lu00;

    invoke-interface {v3, v2}, Lu00;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v0}, LBB0;->i(Ljava/util/Collection;)[LyB0;

    move-result-object p1

    return-object p1
.end method

.method public e()LWB1;
    .locals 2

    iget-object v0, p0, Lv00;->a:LWB1;

    instance-of v1, v0, LBr2;

    if-eqz v1, :cond_0

    check-cast v0, LBr2;

    invoke-virtual {p0, v0}, Lv00;->b(LBr2;)LWB1;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, LDW2;

    if-eqz v1, :cond_1

    check-cast v0, LDW2;

    invoke-virtual {p0, v0}, Lv00;->c(LDW2;)LWB1;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v0}, LWB1;->N()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public final g()LVW2;
    .locals 1

    iget-object v0, p0, Lv00;->b:LbC1;

    invoke-virtual {v0}, LbC1;->m()LVW2;

    move-result-object v0

    return-object v0
.end method
