.class public LYq5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;

.field public b:LS83;


# direct methods
.method public constructor <init>(LS83;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, LYq5;->a:Ljava/util/Map;

    iput-object p1, p0, LYq5;->b:LS83;

    return-void
.end method


# virtual methods
.method public a(LyB0;I)LXq5;
    .locals 3

    new-instance v0, LXq5;

    iget-object v1, p0, LYq5;->b:LS83;

    invoke-virtual {v1, p2}, LS83;->j(I)I

    move-result v2

    invoke-direct {v0, v1, p1, p2, v2}, LXq5;-><init>(LS83;LyB0;II)V

    iget-object p2, p0, LYq5;->a:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXq5;

    if-eqz p2, :cond_0

    iget-object v0, p2, LXq5;->c:LyB0;

    invoke-virtual {v0, p1}, LyB0;->g(LyB0;)Z

    move-result p1

    const-string v0, "Found equal nodes with different coordinates"

    invoke-static {p1, v0}, LKo;->d(ZLjava/lang/String;)V

    return-object p2

    :cond_0
    iget-object p1, p0, LYq5;->a:Ljava/util/Map;

    invoke-interface {p1, v0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, LYq5;->j(Ljava/util/List;)V

    invoke-virtual {p0, v0}, LYq5;->i(Ljava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, LYq5;->b:LS83;

    invoke-virtual {v2, v1}, LS83;->u(I)LyB0;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, LYq5;->a(LyB0;I)LXq5;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(LXq5;LXq5;LDB0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYq5;->g(LXq5;LXq5;)[LyB0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p2}, LDB0;->h([LyB0;Z)Z

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LYq5;->b:LS83;

    invoke-virtual {v0}, LS83;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LYq5;->b:LS83;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LS83;->u(I)LyB0;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, LYq5;->a(LyB0;I)LXq5;

    iget-object v1, p0, LYq5;->b:LS83;

    invoke-virtual {v1, v0}, LS83;->u(I)LyB0;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, LYq5;->a(LyB0;I)LXq5;

    return-void
.end method

.method public e(Ljava/util/Collection;)V
    .locals 3

    invoke-virtual {p0}, LYq5;->d()V

    invoke-virtual {p0}, LYq5;->b()V

    invoke-virtual {p0}, LYq5;->l()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXq5;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXq5;

    invoke-virtual {p0, v1, v2}, LYq5;->f(LXq5;LXq5;)Lcr5;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(LXq5;LXq5;)Lcr5;
    .locals 1

    invoke-virtual {p0, p1, p2}, LYq5;->g(LXq5;LXq5;)[LyB0;

    move-result-object p1

    new-instance p2, LS83;

    iget-object v0, p0, LYq5;->b:LS83;

    invoke-virtual {v0}, LS83;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p2, p1, v0}, LS83;-><init>([LyB0;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final g(LXq5;LXq5;)[LyB0;
    .locals 6

    iget v0, p2, LXq5;->d:I

    iget v1, p1, LXq5;->d:I

    sub-int v1, v0, v1

    const/4 v2, 0x2

    add-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    new-array v0, v2, [LyB0;

    new-instance v1, LyB0;

    iget-object p1, p1, LXq5;->c:LyB0;

    invoke-direct {v1, p1}, LyB0;-><init>(LyB0;)V

    aput-object v1, v0, v3

    new-instance p1, LyB0;

    iget-object p2, p2, LXq5;->c:LyB0;

    invoke-direct {p1, p2}, LyB0;-><init>(LyB0;)V

    aput-object p1, v0, v4

    return-object v0

    :cond_0
    iget-object v2, p0, LYq5;->b:LS83;

    invoke-virtual {v2, v0}, LS83;->u(I)LyB0;

    move-result-object v0

    invoke-virtual {p2}, LXq5;->a()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p2, LXq5;->c:LyB0;

    invoke-virtual {v2, v0}, LyB0;->g(LyB0;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v4

    :goto_1
    if-nez v0, :cond_3

    add-int/lit8 v1, v1, -0x1

    :cond_3
    new-array v1, v1, [LyB0;

    new-instance v2, LyB0;

    iget-object v5, p1, LXq5;->c:LyB0;

    invoke-direct {v2, v5}, LyB0;-><init>(LyB0;)V

    aput-object v2, v1, v3

    iget p1, p1, LXq5;->d:I

    add-int/2addr p1, v4

    :goto_2
    iget v2, p2, LXq5;->d:I

    if-gt p1, v2, :cond_4

    add-int/lit8 v2, v4, 0x1

    iget-object v3, p0, LYq5;->b:LS83;

    invoke-virtual {v3, p1}, LS83;->u(I)LyB0;

    move-result-object v3

    aput-object v3, v1, v4

    add-int/lit8 p1, p1, 0x1

    move v4, v2

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    new-instance p1, LyB0;

    iget-object p2, p2, LXq5;->c:LyB0;

    invoke-direct {p1, p2}, LyB0;-><init>(LyB0;)V

    aput-object p1, v1, v4

    :cond_5
    return-object v1
.end method

.method public final h(LXq5;LXq5;[I)Z
    .locals 3

    iget-object v0, p1, LXq5;->c:LyB0;

    iget-object v1, p2, LXq5;->c:LyB0;

    invoke-virtual {v0, v1}, LyB0;->g(LyB0;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p2, LXq5;->d:I

    iget v2, p1, LXq5;->d:I

    sub-int/2addr v0, v2

    invoke-virtual {p2}, LXq5;->a()Z

    move-result p2

    if-nez p2, :cond_1

    add-int/lit8 v0, v0, -0x1

    :cond_1
    const/4 p2, 0x1

    if-ne v0, p2, :cond_2

    iget p1, p1, LXq5;->d:I

    add-int/2addr p1, p2

    aput p1, p3, v1

    return p2

    :cond_2
    return v1
.end method

.method public final i(Ljava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYq5;->b:LS83;

    invoke-virtual {v1}, LS83;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYq5;->b:LS83;

    invoke-virtual {v1, v0}, LS83;->u(I)LyB0;

    move-result-object v1

    iget-object v2, p0, LYq5;->b:LS83;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, LS83;->u(I)LyB0;

    iget-object v2, p0, LYq5;->b:LS83;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v2, v0}, LS83;->u(I)LyB0;

    move-result-object v0

    invoke-virtual {v1, v0}, LyB0;->g(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    move v0, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [I

    invoke-virtual {p0}, LYq5;->l()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXq5;

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXq5;

    invoke-virtual {p0, v2, v3, v0}, LYq5;->h(LXq5;LXq5;[I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    aget v2, v0, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object v2, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public k()[LyB0;
    .locals 4

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    invoke-virtual {p0}, LYq5;->d()V

    invoke-virtual {p0}, LYq5;->l()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXq5;

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXq5;

    invoke-virtual {p0, v2, v3, v0}, LYq5;->c(LXq5;LXq5;LDB0;)V

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LYq5;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
