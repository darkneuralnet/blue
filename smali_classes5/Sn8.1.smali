.class public final LSn8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final b:Ljava/util/ArrayDeque;

.field public c:LZW7;


# direct methods
.method public synthetic constructor <init>(LgZ7;LEn8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of p2, p1, Lro8;

    if-eqz p2, :cond_0

    check-cast p1, Lro8;

    new-instance p2, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Lro8;->h()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p2, p0, LSn8;->b:Ljava/util/ArrayDeque;

    invoke-virtual {p2, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-static {p1}, Lro8;->M(Lro8;)LgZ7;

    move-result-object p1

    invoke-virtual {p0, p1}, LSn8;->b(LgZ7;)LZW7;

    move-result-object p1

    iput-object p1, p0, LSn8;->c:LZW7;

    return-void

    :cond_0
    const/4 p2, 0x0

    iput-object p2, p0, LSn8;->b:Ljava/util/ArrayDeque;

    check-cast p1, LZW7;

    iput-object p1, p0, LSn8;->c:LZW7;

    return-void
.end method


# virtual methods
.method public final a()LZW7;
    .locals 3

    iget-object v0, p0, LSn8;->c:LZW7;

    if-eqz v0, :cond_3

    :cond_0
    iget-object v1, p0, LSn8;->b:Ljava/util/ArrayDeque;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LSn8;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lro8;

    invoke-static {v1}, Lro8;->N(Lro8;)LgZ7;

    move-result-object v1

    invoke-virtual {p0, v1}, LSn8;->b(LgZ7;)LZW7;

    move-result-object v2

    invoke-virtual {v2}, LgZ7;->e()I

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    :goto_0
    iput-object v2, p0, LSn8;->c:LZW7;

    return-object v0

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final b(LgZ7;)LZW7;
    .locals 1

    :goto_0
    instance-of v0, p1, Lro8;

    if-eqz v0, :cond_0

    check-cast p1, Lro8;

    iget-object v0, p0, LSn8;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-static {p1}, Lro8;->M(Lro8;)LgZ7;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, LZW7;

    return-object p1
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, LSn8;->c:LZW7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSn8;->a()LZW7;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
