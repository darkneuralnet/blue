.class public final Landroidx/camera/core/impl/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/r$b;,
        Landroidx/camera/core/impl/r$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/r$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    iput-object p1, p0, Landroidx/camera/core/impl/r;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/core/impl/r$b;)Z
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/impl/r;->m(Landroidx/camera/core/impl/r$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Landroidx/camera/core/impl/r$b;)Z
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/impl/r;->n(Landroidx/camera/core/impl/r$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/camera/core/impl/r$b;)Z
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/impl/r;->o(Landroidx/camera/core/impl/r$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m(Landroidx/camera/core/impl/r$b;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/impl/r$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic n(Landroidx/camera/core/impl/r$b;)Z
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Landroidx/camera/core/impl/r$b;)Z
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public d()Landroidx/camera/core/impl/q$g;
    .locals 6

    new-instance v0, Landroidx/camera/core/impl/q$g;

    invoke-direct {v0}, Landroidx/camera/core/impl/q$g;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/r$b;

    invoke-virtual {v4}, Landroidx/camera/core/impl/r$b;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4}, Landroidx/camera/core/impl/r$b;->c()Landroidx/camera/core/impl/q;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/impl/q$g;->a(Landroidx/camera/core/impl/q;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Active and attached use case: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for camera: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/r;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UseCaseAttachState"

    invoke-static {v2, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/q;",
            ">;"
        }
    .end annotation

    new-instance v0, LUf6;

    invoke-direct {v0}, LUf6;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/r;->j(Landroidx/camera/core/impl/r$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public f()Landroidx/camera/core/impl/q$g;
    .locals 6

    new-instance v0, Landroidx/camera/core/impl/q$g;

    invoke-direct {v0}, Landroidx/camera/core/impl/q$g;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/r$b;

    invoke-virtual {v4}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Landroidx/camera/core/impl/r$b;->c()Landroidx/camera/core/impl/q;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/impl/q$g;->a(Landroidx/camera/core/impl/q;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "All use case: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for camera: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/core/impl/r;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UseCaseAttachState"

    invoke-static {v2, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public g()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/q;",
            ">;"
        }
    .end annotation

    new-instance v0, LSf6;

    invoke-direct {v0}, LSf6;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/r;->j(Landroidx/camera/core/impl/r$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/s<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, LTf6;

    invoke-direct {v0}, LTf6;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/r;->k(Landroidx/camera/core/impl/r$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/r$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
            "Landroidx/camera/core/impl/r$b;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r$b;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/camera/core/impl/r$b;

    invoke-direct {v0, p2, p3}, Landroidx/camera/core/impl/r$b;-><init>(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    iget-object p2, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final j(Landroidx/camera/core/impl/r$a;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/r$a;",
            ")",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/q;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/r$b;

    invoke-interface {p1, v3}, Landroidx/camera/core/impl/r$a;->a(Landroidx/camera/core/impl/r$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/r$b;

    invoke-virtual {v2}, Landroidx/camera/core/impl/r$b;->c()Landroidx/camera/core/impl/q;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final k(Landroidx/camera/core/impl/r$a;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/r$a;",
            ")",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/s<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/r$b;

    invoke-interface {p1, v3}, Landroidx/camera/core/impl/r$a;->a(Landroidx/camera/core/impl/r$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/r$b;

    invoke-virtual {v2}, Landroidx/camera/core/impl/r$b;->d()Landroidx/camera/core/impl/s;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public l(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/r$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/impl/r;->i(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/r$b;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/r$b;->e(Z)V

    return-void
.end method

.method public r(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/impl/r;->i(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/r$b;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/r$b;->f(Z)V

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/r$b;->f(Z)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/r$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/r$b;->e(Z)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public u(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/camera/core/impl/r$b;

    invoke-direct {v0, p2, p3}, Landroidx/camera/core/impl/r$b;-><init>(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    iget-object p2, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/r$b;

    invoke-virtual {p2}, Landroidx/camera/core/impl/r$b;->b()Z

    move-result p3

    invoke-virtual {v0, p3}, Landroidx/camera/core/impl/r$b;->f(Z)V

    invoke-virtual {p2}, Landroidx/camera/core/impl/r$b;->a()Z

    move-result p2

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/r$b;->e(Z)V

    iget-object p2, p0, Landroidx/camera/core/impl/r;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
