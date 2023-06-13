.class public LVl1;
.super LX0;
.source "SourceFile"

# interfaces
.implements LXl1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVl1$c;,
        LVl1$a;,
        LVl1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LX0<",
        "TK;TV;>;",
        "LXl1<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final g:LgX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgX2<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final h:LIZ3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LIZ3<",
            "-TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LgX2;LIZ3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgX2<",
            "TK;TV;>;",
            "LIZ3<",
            "-TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LX0;-><init>()V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LgX2;

    iput-object p1, p0, LVl1;->g:LgX2;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIZ3;

    iput-object p1, p0, LVl1;->h:LIZ3;

    return-void
.end method


# virtual methods
.method public a()LgX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LgX2<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->g:LgX2;

    return-object v0
.end method

.method public c()LIZ3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LIZ3<",
            "-",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->h:LIZ3;

    invoke-static {v0}, LaM2;->j(LIZ3;)LIZ3;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    invoke-virtual {p0}, LX0;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LVl1;->g:LgX2;

    invoke-interface {v0, p1}, LgX2;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LVl1;->h:LIZ3;

    invoke-interface {v0, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->h:LIZ3;

    invoke-interface {v0, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LVl1;->g:LgX2;

    invoke-interface {v0, p1}, LgX2;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LVl1;->g:LgX2;

    instance-of v0, v0, LYv5;

    if-eqz v0, :cond_1

    new-instance v0, LVl1$b;

    invoke-direct {v0, p1}, LVl1$b;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v0, LVl1$a;

    invoke-direct {v0, p1}, LVl1$a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public h()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->g:LgX2;

    invoke-interface {v0}, LgX2;->f()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LVl1;->h:LIZ3;

    invoke-static {v0, v1}, LaM2;->f(Ljava/util/Map;LIZ3;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LVl1$c;

    invoke-direct {v0, p0}, LVl1$c;-><init>(LVl1;)V

    return-object v0
.end method

.method public j()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->g:LgX2;

    invoke-interface {v0}, LgX2;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LVl1;->h:LIZ3;

    invoke-static {v0, v1}, Ldw5;->b(Ljava/util/Set;LIZ3;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public k()LmX2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LmX2<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LVl1;->g:LgX2;

    invoke-interface {v0}, LgX2;->d()LmX2;

    move-result-object v0

    iget-object v1, p0, LVl1;->h:LIZ3;

    invoke-static {v0, v1}, LoX2;->f(LmX2;LIZ3;)LmX2;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LYl1;

    invoke-direct {v0, p0}, LYl1;-><init>(LXl1;)V

    return-object v0
.end method

.method public m()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public size()I
    .locals 3

    invoke-virtual {p0}, LX0;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method
