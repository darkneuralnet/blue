.class public final LUl1;
.super LSl1;
.source "SourceFile"

# interfaces
.implements LZl1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LSl1<",
        "TK;TV;>;",
        "LZl1<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYv5;LIZ3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYv5<",
            "TK;TV;>;",
            "LIZ3<",
            "-",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LSl1;-><init>(LgX2;LIZ3;)V

    return-void
.end method


# virtual methods
.method public a()LYv5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LSl1;->g:LgX2;

    check-cast v0, LYv5;

    return-object v0
.end method

.method public bridge synthetic a()LgX2;
    .locals 1

    invoke-virtual {p0}, LUl1;->a()LYv5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LUl1;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-super {p0}, LX0;->b()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LUl1;->get(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Set<",
            "TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LSl1;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LUl1;->t()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public t()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, LUl1;->a()LYv5;

    move-result-object v0

    invoke-interface {v0}, LYv5;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, LSl1;->c()LIZ3;

    move-result-object v1

    invoke-static {v0, v1}, Ldw5;->b(Ljava/util/Set;LIZ3;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
