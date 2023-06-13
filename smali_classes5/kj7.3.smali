.class public final Lkj7;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic b:LMn7;


# direct methods
.method public constructor <init>(LMn7;)V
    .locals 0

    iput-object p1, p0, Lkj7;->b:LMn7;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->n()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, LMn7;->e(LMn7;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lkj7;->b:LMn7;

    invoke-static {v2, v0}, LMn7;->l(LMn7;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LQX7;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->n()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lwh7;

    invoke-direct {v1, v0}, Lwh7;-><init>(LMn7;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 10

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->n()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->s()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    invoke-static {v0}, LMn7;->f(LMn7;)I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-static {p1}, LMn7;->m(LMn7;)Ljava/lang/Object;

    move-result-object v6

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-static {p1}, LMn7;->t(LMn7;)[I

    move-result-object v7

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-static {p1}, LMn7;->u(LMn7;)[Ljava/lang/Object;

    move-result-object v8

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-static {p1}, LMn7;->v(LMn7;)[Ljava/lang/Object;

    move-result-object v9

    move v5, v0

    invoke-static/range {v3 .. v9}, LEo7;->b(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_2

    return v1

    :cond_2
    iget-object v1, p0, Lkj7;->b:LMn7;

    invoke-virtual {v1, p1, v0}, LMn7;->r(II)V

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-static {p1}, LMn7;->d(LMn7;)I

    iget-object p1, p0, Lkj7;->b:LMn7;

    invoke-virtual {p1}, LMn7;->p()V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lkj7;->b:LMn7;

    invoke-virtual {v0}, LMn7;->size()I

    move-result v0

    return v0
.end method
