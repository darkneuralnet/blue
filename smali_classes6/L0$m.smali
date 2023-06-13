.class public LL0$m;
.super LL0$j;
.source "SourceFile"

# interfaces
.implements Ljava/util/SortedSet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LL0<",
        "TK;TV;>.j;",
        "Ljava/util/SortedSet<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic g:LL0;


# direct methods
.method public constructor <init>(LL0;Ljava/lang/Object;Ljava/util/SortedSet;LL0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/SortedSet<",
            "TV;>;",
            "LL0<",
            "TK;TV;>.j;)V"
        }
    .end annotation

    iput-object p1, p0, LL0$m;->g:LL0;

    invoke-direct {p0, p1, p2, p3, p4}, LL0$j;-><init>(LL0;Ljava/lang/Object;Ljava/util/Collection;LL0$j;)V

    return-void
.end method


# virtual methods
.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->f()V

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Ljava/util/SortedSet<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->f()V

    new-instance v0, LL0$m;

    iget-object v1, p0, LL0$m;->g:LL0;

    invoke-virtual {p0}, LL0$j;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->headSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object v3

    :goto_0
    invoke-direct {v0, v1, v2, p1, v3}, LL0$m;-><init>(LL0;Ljava/lang/Object;Ljava/util/SortedSet;LL0$j;)V

    return-object v0
.end method

.method public j()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->c()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/SortedSet;

    return-object v0
.end method

.method public last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->f()V

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TV;)",
            "Ljava/util/SortedSet<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->f()V

    new-instance v0, LL0$m;

    iget-object v1, p0, LL0$m;->g:LL0;

    invoke-virtual {p0}, LL0$j;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object p2

    if-nez p2, :cond_0

    move-object p2, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object p2

    :goto_0
    invoke-direct {v0, v1, v2, p1, p2}, LL0$m;-><init>(LL0;Ljava/lang/Object;Ljava/util/SortedSet;LL0$j;)V

    return-object v0
.end method

.method public tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Ljava/util/SortedSet<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j;->f()V

    new-instance v0, LL0$m;

    iget-object v1, p0, LL0$m;->g:LL0;

    invoke-virtual {p0}, LL0$j;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LL0$m;->j()Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/SortedSet;->tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LL0$j;->b()LL0$j;

    move-result-object v3

    :goto_0
    invoke-direct {v0, v1, v2, p1, v3}, LL0$m;-><init>(LL0;Ljava/lang/Object;Ljava/util/SortedSet;LL0$j;)V

    return-object v0
.end method
