.class public LDo9;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Object;

.field public c:Ljava/util/Collection;

.field public final d:LDo9;

.field public final e:Ljava/util/Collection;

.field public final synthetic f:LJt9;


# direct methods
.method public constructor <init>(LJt9;Ljava/lang/Object;Ljava/util/Collection;LDo9;)V
    .locals 0

    iput-object p1, p0, LDo9;->f:LJt9;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p2, p0, LDo9;->b:Ljava/lang/Object;

    iput-object p3, p0, LDo9;->c:Ljava/util/Collection;

    iput-object p4, p0, LDo9;->d:LDo9;

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p4, LDo9;->c:Ljava/util/Collection;

    :goto_0
    iput-object p1, p0, LDo9;->e:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method final a()V
    .locals 3

    iget-object v0, p0, LDo9;->d:LDo9;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDo9;->a()V

    return-void

    :cond_0
    iget-object v0, p0, LDo9;->f:LJt9;

    invoke-static {v0}, LJt9;->n(LJt9;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LDo9;->b:Ljava/lang/Object;

    iget-object v2, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LDo9;->f:LJt9;

    invoke-static {v1}, LJt9;->f(LJt9;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LDo9;->a()V

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 3

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, LDo9;->size()I

    move-result v0

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, LDo9;->f:LJt9;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, LJt9;->j(LJt9;I)I

    if-nez v0, :cond_1

    invoke-virtual {p0}, LDo9;->a()V

    const/4 p1, 0x1

    :cond_1
    return p1
.end method

.method final b()V
    .locals 2

    iget-object v0, p0, LDo9;->d:LDo9;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDo9;->b()V

    return-void

    :cond_0
    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LDo9;->f:LJt9;

    invoke-static {v0}, LJt9;->n(LJt9;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LDo9;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final clear()V
    .locals 2

    invoke-virtual {p0}, LDo9;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    iget-object v1, p0, LDo9;->f:LJt9;

    invoke-static {v1, v0}, LJt9;->k(LJt9;I)I

    invoke-virtual {p0}, LDo9;->b()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    new-instance v0, Lsl9;

    invoke-direct {v0, p0}, Lsl9;-><init>(LDo9;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LDo9;->f:LJt9;

    invoke-static {v0}, LJt9;->g(LJt9;)I

    invoke-virtual {p0}, LDo9;->b()V

    :cond_0
    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, LDo9;->size()I

    move-result v0

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, LDo9;->f:LJt9;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, LJt9;->j(LJt9;I)I

    invoke-virtual {p0}, LDo9;->b()V

    :cond_1
    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, LDo9;->size()I

    move-result v0

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, LDo9;->f:LJt9;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, LJt9;->j(LJt9;I)I

    invoke-virtual {p0}, LDo9;->b()V

    :cond_0
    return p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final zzb()V
    .locals 2

    iget-object v0, p0, LDo9;->d:LDo9;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDo9;->zzb()V

    iget-object v0, p0, LDo9;->d:LDo9;

    iget-object v0, v0, LDo9;->c:Ljava/util/Collection;

    iget-object v1, p0, LDo9;->e:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, LDo9;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LDo9;->f:LJt9;

    invoke-static {v0}, LJt9;->n(LJt9;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LDo9;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    iput-object v0, p0, LDo9;->c:Ljava/util/Collection;

    :cond_2
    :goto_0
    return-void
.end method
