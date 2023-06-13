.class public interface abstract LOs0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lyb4;)LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)",
            "LX94<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public b(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lyb4;->b(Ljava/lang/Class;)Lyb4;

    move-result-object p1

    invoke-interface {p0, p1}, LOs0;->g(Lyb4;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public c(Lyb4;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0, p1}, LOs0;->f(Lyb4;)LX94;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, LX94;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Class;)LX94;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LX94<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lyb4;->b(Ljava/lang/Class;)Lyb4;

    move-result-object p1

    invoke-interface {p0, p1}, LOs0;->f(Lyb4;)LX94;

    move-result-object p1

    return-object p1
.end method

.method public abstract e(Lyb4;)LgZ0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)",
            "LgZ0<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract f(Lyb4;)LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)",
            "LX94<",
            "TT;>;"
        }
    .end annotation
.end method

.method public g(Lyb4;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0, p1}, LOs0;->a(Lyb4;)LX94;

    move-result-object p1

    invoke-interface {p1}, LX94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p1}, Lyb4;->b(Ljava/lang/Class;)Lyb4;

    move-result-object p1

    invoke-interface {p0, p1}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Class;)LgZ0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LgZ0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lyb4;->b(Ljava/lang/Class;)Lyb4;

    move-result-object p1

    invoke-interface {p0, p1}, LOs0;->e(Lyb4;)LgZ0;

    move-result-object p1

    return-object p1
.end method
