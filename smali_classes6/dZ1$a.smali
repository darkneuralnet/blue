.class public final LdZ1$a;
.super LYY1$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdZ1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYY1$c<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYY1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-static {}, LuV3;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)LYY1$c;
    .locals 0

    invoke-virtual {p0, p1, p2}, LdZ1$a;->e(Ljava/lang/Object;Ljava/lang/Object;)LdZ1$a;

    move-result-object p1

    return-object p1
.end method

.method public d()LdZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LdZ1<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1$c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LYY1$c;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lzy3;->a(Ljava/util/Comparator;)Lzy3;

    move-result-object v1

    invoke-virtual {v1}, Lzy3;->d()Lzy3;

    move-result-object v1

    invoke-virtual {v1, v0}, Lzy3;->b(Ljava/lang/Iterable;)LVY1;

    move-result-object v0

    :cond_0
    iget-object v1, p0, LYY1$c;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, LdZ1;->D(Ljava/util/Collection;Ljava/util/Comparator;)LdZ1;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;)LdZ1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "LdZ1$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYY1$c;->b(Ljava/lang/Object;Ljava/lang/Object;)LYY1$c;

    return-object p0
.end method

.method public f(Ljava/util/Map$Entry;)LdZ1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "LdZ1$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, LYY1$c;->c(Ljava/util/Map$Entry;)LYY1$c;

    return-object p0
.end method
