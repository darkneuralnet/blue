.class public final LWl1;
.super LVl1;
.source "SourceFile"

# interfaces
.implements LZl1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWl1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LVl1<",
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
            "-TK;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LVl1;-><init>(LgX2;LIZ3;)V

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

    iget-object v0, p0, LVl1;->g:LgX2;

    check-cast v0, LYv5;

    return-object v0
.end method

.method public bridge synthetic a()LgX2;
    .locals 1

    invoke-virtual {p0}, LWl1;->a()LYv5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LWl1;->b()Ljava/util/Set;

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

    invoke-virtual {p0, p1}, LWl1;->get(Ljava/lang/Object;)Ljava/util/Set;

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

    invoke-super {p0, p1}, LVl1;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LWl1;->p()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LWl1$a;

    invoke-direct {v0, p0}, LWl1$a;-><init>(LWl1;)V

    return-object v0
.end method
