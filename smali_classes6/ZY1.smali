.class public abstract LZY1;
.super LaZ1;
.source "SourceFile"

# interfaces
.implements LmX2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZY1$c;,
        LZY1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LaZ1<",
        "TE;>;",
        "LmX2<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public transient c:LVY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVY1<",
            "TE;>;"
        }
    .end annotation
.end field

.field public transient d:LbZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbZ1<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LaZ1;-><init>()V

    return-void
.end method


# virtual methods
.method public final A2(Ljava/lang/Object;I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic F2()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LZY1;->s()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public final H0(Ljava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final P0(Ljava/lang/Object;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;II)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final Q1(Ljava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public a()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LZY1;->c:LVY1;

    if-nez v0, :cond_0

    invoke-super {p0}, LQY1;->a()LVY1;

    move-result-object v0

    iput-object v0, p0, LZY1;->c:LVY1;

    :cond_0
    return-object v0
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 4

    invoke-virtual {p0}, LZY1;->u()LbZ1;

    move-result-object v0

    invoke-virtual {v0}, LbZ1;->j()Lre6;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LmX2$a;

    invoke-interface {v1}, LmX2$a;->getCount()I

    move-result v2

    add-int/2addr v2, p2

    invoke-interface {v1}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, p2, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-interface {v1}, LmX2$a;->getCount()I

    move-result v1

    add-int/2addr p2, v1

    goto :goto_0

    :cond_0
    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LZY1;->u()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LoX2;->e(LmX2;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LZY1;->u()LbZ1;

    move-result-object v0

    invoke-static {v0}, Ldw5;->d(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LZY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public j()Lre6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LZY1;->u()LbZ1;

    move-result-object v0

    invoke-virtual {v0}, LbZ1;->j()Lre6;

    move-result-object v0

    new-instance v1, LZY1$a;

    invoke-direct {v1, p0, v0}, LZY1$a;-><init>(LZY1;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final o()LbZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LbZ1;->A()LbZ1;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, LZY1$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZY1$b;-><init>(LZY1;LZY1$a;)V

    :goto_0
    return-object v0
.end method

.method public abstract s()LbZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LZY1;->u()LbZ1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, LZY1;->d:LbZ1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LZY1;->o()LbZ1;

    move-result-object v0

    iput-object v0, p0, LZY1;->d:LbZ1;

    :cond_0
    return-object v0
.end method

.method public abstract v(I)LmX2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LmX2$a<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract writeReplace()Ljava/lang/Object;
.end method
