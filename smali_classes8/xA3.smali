.class public LxA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:LWB1;

.field public c:LWB1;

.field public d:LeZ3;

.field public e:LbC1;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LFW3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILWB1;LWB1;LeZ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LxA3;->a:I

    iput-object p2, p0, LxA3;->b:LWB1;

    iput-object p3, p0, LxA3;->c:LWB1;

    iput-object p4, p0, LxA3;->d:LeZ3;

    invoke-virtual {p2}, LWB1;->c0()LbC1;

    move-result-object p1

    iput-object p1, p0, LxA3;->e:LbC1;

    return-void
.end method

.method public static g(ILWB1;LWB1;LeZ3;)LWB1;
    .locals 1

    new-instance v0, LxA3;

    invoke-direct {v0, p0, p1, p2, p3}, LxA3;-><init>(ILWB1;LWB1;LeZ3;)V

    invoke-virtual {v0}, LxA3;->f()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static h(LFW3;LeZ3;)LyB0;
    .locals 1

    invoke-virtual {p0}, LFW3;->W()LyB0;

    move-result-object p0

    invoke-static {p1}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LyB0;->e()LyB0;

    move-result-object p0

    invoke-virtual {p1, p0}, LeZ3;->f(LyB0;)V

    return-object p0
.end method


# virtual methods
.method public final a(LWB1;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB1;",
            ")",
            "Ljava/util/HashMap<",
            "LyB0;",
            "LFW3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, LWB1;->f0()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-virtual {p1, v1}, LWB1;->d0(I)LWB1;

    move-result-object v2

    instance-of v3, v2, LFW3;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, LWB1;->r0()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    check-cast v2, LFW3;

    iget-object v3, p0, LxA3;->d:LeZ3;

    invoke-static {v2, v3}, LxA3;->h(LFW3;LeZ3;)LyB0;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Non-point geometry input to point overlay"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-object v0
.end method

.method public final b(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/ArrayList<",
            "LFW3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFW3;

    invoke-virtual {p0, v0}, LxA3;->e(LFW3;)LFW3;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/ArrayList<",
            "LFW3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFW3;

    invoke-virtual {p0, v0}, LxA3;->e(LFW3;)LFW3;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/Map<",
            "LyB0;",
            "LFW3;",
            ">;",
            "Ljava/util/ArrayList<",
            "LFW3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFW3;

    invoke-virtual {p0, v1}, LxA3;->e(LFW3;)LFW3;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFW3;

    invoke-virtual {p0, v0}, LxA3;->e(LFW3;)LFW3;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final e(LFW3;)LFW3;
    .locals 5

    iget-object v0, p0, LxA3;->d:LeZ3;

    invoke-static {v0}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LWB1;->m()LWB1;

    move-result-object p1

    check-cast p1, LFW3;

    return-object p1

    :cond_0
    invoke-virtual {p1}, LFW3;->L0()LEB0;

    move-result-object p1

    invoke-interface {p1}, LEB0;->copy()LEB0;

    move-result-object v0

    iget-object v1, p0, LxA3;->d:LeZ3;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, LEB0;->n2(I)D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, LeZ3;->e(D)D

    move-result-wide v3

    invoke-interface {v0, v2, v2, v3, v4}, LEB0;->y1(IID)V

    iget-object v1, p0, LxA3;->d:LeZ3;

    invoke-interface {p1, v2}, LEB0;->N0(I)D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, LeZ3;->e(D)D

    move-result-wide v3

    const/4 p1, 0x1

    invoke-interface {v0, v2, p1, v3, v4}, LEB0;->y1(IID)V

    iget-object p1, p0, LxA3;->e:LbC1;

    invoke-virtual {p1, v0}, LbC1;->u(LEB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public f()LWB1;
    .locals 5

    iget-object v0, p0, LxA3;->b:LWB1;

    invoke-virtual {p0, v0}, LxA3;->a(LWB1;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LxA3;->c:LWB1;

    invoke-virtual {p0, v1}, LxA3;->a(LWB1;)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LxA3;->f:Ljava/util/ArrayList;

    iget v3, p0, LxA3;->a:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1, v2}, LxA3;->b(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V

    iget-object v2, p0, LxA3;->f:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v0, v2}, LxA3;->b(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, v1, v2}, LxA3;->b(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, v1, v2}, LxA3;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0, v1, v2}, LxA3;->c(Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;)V

    :goto_0
    iget-object v0, p0, LxA3;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iget-object v1, p0, LxA3;->e:LbC1;

    invoke-static {v0, v1}, LyA3;->b(ILbC1;)LWB1;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v0, p0, LxA3;->e:LbC1;

    iget-object v1, p0, LxA3;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object v0

    return-object v0
.end method
