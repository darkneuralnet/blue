.class public final Lcl7;
.super LwR7;
.source "SourceFile"


# instance fields
.field public final transient e:Ljava/util/Map;

.field public final synthetic f:LYr7;


# direct methods
.method public constructor <init>(LYr7;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcl7;->f:LYr7;

    invoke-direct {p0}, LwR7;-><init>()V

    iput-object p2, p0, Lcl7;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    new-instance v0, Llj7;

    invoke-direct {v0, p0}, Llj7;-><init>(Lcl7;)V

    return-object v0
.end method

.method public final clear()V
    .locals 3

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    iget-object v1, p0, Lcl7;->f:LYr7;

    invoke-static {v1}, LYr7;->k(LYr7;)Ljava/util/Map;

    move-result-object v2

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, LYr7;->n()V

    return-void

    :cond_0
    new-instance v0, Lfk7;

    invoke-direct {v0, p0}, Lfk7;-><init>(Lcl7;)V

    invoke-static {v0}, LJM7;->a(Ljava/util/Iterator;)V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-static {v0, p1}, LLR7;->b(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-static {v0, p1}, LLR7;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lcl7;->f:LYr7;

    invoke-virtual {v1, p1, v0}, LYr7;->g(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcl7;->f:LYr7;

    invoke-virtual {v0}, LTt7;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcl7;->f:LYr7;

    invoke-virtual {v0}, LYr7;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcl7;->f:LYr7;

    invoke-static {v1}, LYr7;->h(LYr7;)I

    move-result v2

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, LYr7;->l(LYr7;I)V

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcl7;->e:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
