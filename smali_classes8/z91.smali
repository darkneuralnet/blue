.class public abstract Lz91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;

.field public b:Ljava/util/List;

.field public c:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lz91;->a:Ljava/util/Map;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lz91;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method


# virtual methods
.method public final a(Lu00;)V
    .locals 2

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv91;

    invoke-virtual {v1, p1}, Lv91;->b(Lu00;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b([LcC1;)V
    .locals 8

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {v1}, LcC1;->x()Lu00;

    move-result-object v1

    invoke-virtual {p0, v1}, Lz91;->a(Lu00;)V

    invoke-virtual {p0, v0}, Lz91;->j(I)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lz91;->j(I)V

    const/4 v2, 0x2

    new-array v3, v2, [Z

    fill-array-data v3, :array_0

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv91;

    invoke-virtual {v5}, Lv91;->f()LSl2;

    move-result-object v5

    move v6, v0

    :goto_0
    if-ge v6, v2, :cond_0

    invoke-virtual {v5, v6}, LSl2;->i(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v5, v6}, LSl2;->d(I)I

    move-result v7

    if-ne v7, v1, :cond_1

    aput-boolean v1, v3, v6

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv91;

    invoke-virtual {v4}, Lv91;->f()LSl2;

    move-result-object v5

    move v6, v0

    :goto_1
    if-ge v6, v2, :cond_3

    invoke-virtual {v5, v6}, LSl2;->f(I)Z

    move-result v7

    if-eqz v7, :cond_5

    aget-boolean v7, v3, v6

    if-eqz v7, :cond_4

    move v7, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lv91;->c()LyB0;

    move-result-object v7

    invoke-virtual {p0, v6, v7, p1}, Lz91;->f(ILyB0;[LcC1;)I

    move-result v7

    :goto_2
    invoke-virtual {v5, v6, v7}, LSl2;->m(II)V

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public c()LyB0;
    .locals 2

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv91;

    invoke-virtual {v0}, Lv91;->c()LyB0;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lz91;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lz91;->b:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lz91;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lz91;->b:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lz91;->b:Ljava/util/List;

    return-object v0
.end method

.method public final f(ILyB0;[LcC1;)I
    .locals 3

    iget-object v0, p0, Lz91;->c:[I

    aget v1, v0, p1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    aget-object p3, p3, p1

    invoke-virtual {p3}, LcC1;->z()LWB1;

    move-result-object p3

    invoke-static {p2, p3}, LSA5;->c(LyB0;LWB1;)I

    move-result p2

    aput p2, v0, p1

    :cond_0
    iget-object p2, p0, Lz91;->c:[I

    aget p1, p2, p1

    return p1
.end method

.method public abstract g(Lv91;)V
.end method

.method public h(Lv91;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lz91;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lz91;->b:Ljava/util/List;

    return-void
.end method

.method public i()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lz91;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(I)V
    .locals 10

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, -0x1

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv91;

    invoke-virtual {v3}, Lv91;->f()LSl2;

    move-result-object v3

    invoke-virtual {v3, p1}, LSl2;->h(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, p1, v4}, LSl2;->e(II)I

    move-result v5

    if-eq v5, v1, :cond_0

    invoke-virtual {v3, p1, v4}, LSl2;->e(II)I

    move-result v2

    goto :goto_0

    :cond_1
    if-ne v2, v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv91;

    invoke-virtual {v3}, Lv91;->f()LSl2;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, p1, v6}, LSl2;->e(II)I

    move-result v7

    if-ne v7, v1, :cond_4

    invoke-virtual {v5, p1, v6, v2}, LSl2;->o(III)V

    :cond_4
    invoke-virtual {v5, p1}, LSl2;->h(I)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5, p1, v4}, LSl2;->e(II)I

    move-result v7

    const/4 v8, 0x2

    invoke-virtual {v5, p1, v8}, LSl2;->e(II)I

    move-result v9

    if-eq v9, v1, :cond_7

    if-ne v9, v2, :cond_6

    if-ne v7, v1, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "found single null side (at "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lv91;->c()LyB0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LKo;->f(Ljava/lang/String;)V

    :cond_5
    move v2, v7

    goto :goto_1

    :cond_6
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    const-string v0, "side location conflict"

    invoke-virtual {v3}, Lv91;->c()LyB0;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1

    :cond_7
    invoke-virtual {v5, p1, v4}, LSl2;->e(II)I

    move-result v3

    if-ne v3, v1, :cond_8

    move v6, v4

    :cond_8
    const-string v3, "found single null side"

    invoke-static {v6, v3}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v5, p1, v8, v2}, LSl2;->o(III)V

    invoke-virtual {v5, p1, v4, v2}, LSl2;->o(III)V

    goto :goto_1

    :cond_9
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EdgeEndStar:   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz91;->c()LyB0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lz91;->i()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv91;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
