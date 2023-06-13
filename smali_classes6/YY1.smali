.class public abstract LYY1;
.super LkB;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYY1$h;,
        LYY1$g;,
        LYY1$f;,
        LYY1$d;,
        LYY1$e;,
        LYY1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LkB<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final transient g:LXY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LXY1<",
            "TK;+",
            "LQY1<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public final transient h:I


# direct methods
.method public constructor <init>(LXY1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY1<",
            "TK;+",
            "LQY1<",
            "TV;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, LkB;-><init>()V

    iput-object p1, p0, LYY1;->g:LXY1;

    iput p2, p0, LYY1;->h:I

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LYY1;->t()LQY1;

    move-result-object v0

    return-object v0
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYY1;->g:LXY1;

    invoke-virtual {v0, p1}, LXY1;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-super {p0, p1}, LX0;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic d()LmX2;
    .locals 1

    invoke-virtual {p0}, LYY1;->x()LZY1;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable<",
            "+TV;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, LX0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, LYY1;->p()LXY1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1, p2}, LX0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LYY1;->v(Ljava/lang/Object;)LQY1;

    move-result-object p1

    return-object p1
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

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, LX0;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LYY1;->q()LQY1;

    move-result-object v0

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

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unreachable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic k()LmX2;
    .locals 1

    invoke-virtual {p0}, LYY1;->r()LZY1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LYY1;->w()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LYY1;->s()LQY1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LYY1;->u()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LYY1;->y()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public p()LXY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LXY1<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1;->g:LXY1;

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public q()LQY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQY1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LYY1$d;

    invoke-direct {v0, p0}, LYY1$d;-><init>(LYY1;)V

    return-object v0
.end method

.method public r()LZY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZY1<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, LYY1$f;

    invoke-direct {v0, p0}, LYY1$f;-><init>(LYY1;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public s()LQY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQY1<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LYY1$h;

    invoke-direct {v0, p0}, LYY1$h;-><init>(LYY1;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LYY1;->h:I

    return v0
.end method

.method public t()LQY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQY1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-super {p0}, LX0;->b()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, LQY1;

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LX0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LYY1$a;

    invoke-direct {v0, p0}, LYY1$a;-><init>(LYY1;)V

    return-object v0
.end method

.method public abstract v(Ljava/lang/Object;)LQY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "LQY1<",
            "TV;>;"
        }
    .end annotation
.end method

.method public w()LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1;->g:LXY1;

    invoke-virtual {v0}, LXY1;->g()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public x()LZY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZY1<",
            "TK;>;"
        }
    .end annotation

    invoke-super {p0}, LX0;->d()LmX2;

    move-result-object v0

    check-cast v0, LZY1;

    return-object v0
.end method

.method public y()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LYY1$b;

    invoke-direct {v0, p0}, LYY1$b;-><init>(LYY1;)V

    return-object v0
.end method

.method public z()LQY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQY1<",
            "TV;>;"
        }
    .end annotation

    invoke-super {p0}, LX0;->o()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, LQY1;

    return-object v0
.end method
