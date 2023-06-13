.class public interface abstract LYv5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgX2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LgX2<",
        "TK;TV;>;"
    }
.end annotation


# virtual methods
.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-interface {p0}, LYv5;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public abstract b()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    invoke-interface {p0, p1}, LYv5;->get(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Set<",
            "TV;>;"
        }
    .end annotation
.end method
