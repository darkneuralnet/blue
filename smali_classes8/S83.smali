.class public LS83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcr5;


# instance fields
.field public a:LYq5;

.field public b:[LyB0;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>([LyB0;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYq5;

    invoke-direct {v0, p0}, LYq5;-><init>(LS83;)V

    iput-object v0, p0, LS83;->a:LYq5;

    iput-object p1, p0, LS83;->b:[LyB0;

    iput-object p2, p0, LS83;->c:Ljava/lang/Object;

    return-void
.end method

.method public static g(Ljava/util/Collection;)Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, v0}, LS83;->i(Ljava/util/Collection;Ljava/util/Collection;)V

    return-object v0
.end method

.method public static i(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS83;

    invoke-virtual {v0}, LS83;->e()LYq5;

    move-result-object v0

    invoke-virtual {v0, p1}, LYq5;->e(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(LyB0;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LS83;->c(LyB0;I)LXq5;

    return-void
.end method

.method public b(Lsr2;III)V
    .locals 0

    new-instance p3, LyB0;

    invoke-virtual {p1, p4}, Lsr2;->f(I)LyB0;

    move-result-object p1

    invoke-direct {p3, p1}, LyB0;-><init>(LyB0;)V

    invoke-virtual {p0, p3, p2}, LS83;->a(LyB0;I)V

    return-void
.end method

.method public c(LyB0;I)LXq5;
    .locals 3

    add-int/lit8 v0, p2, 0x1

    iget-object v1, p0, LS83;->b:[LyB0;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, LyB0;->g(LyB0;)Z

    move-result v1

    if-eqz v1, :cond_0

    move p2, v0

    :cond_0
    iget-object v0, p0, LS83;->a:LYq5;

    invoke-virtual {v0, p1, p2}, LYq5;->a(LyB0;I)LXq5;

    move-result-object p1

    return-object p1
.end method

.method public d(Lsr2;II)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lsr2;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, p3, v0}, LS83;->b(Lsr2;III)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()LYq5;
    .locals 1

    iget-object v0, p0, LS83;->a:LYq5;

    return-object v0
.end method

.method public f()[LyB0;
    .locals 1

    iget-object v0, p0, LS83;->a:LYq5;

    invoke-virtual {v0}, LYq5;->k()[LyB0;

    move-result-object v0

    return-object v0
.end method

.method public getData()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS83;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public h()[LyB0;
    .locals 1

    iget-object v0, p0, LS83;->b:[LyB0;

    return-object v0
.end method

.method public isClosed()Z
    .locals 3

    iget-object v0, p0, LS83;->b:[LyB0;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public j(I)I
    .locals 1

    iget-object v0, p0, LS83;->b:[LyB0;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LS83;->u(I)LyB0;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LS83;->u(I)LyB0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LS83;->k(LyB0;LyB0;)I

    move-result p1

    return p1
.end method

.method public final k(LyB0;LyB0;)I
    .locals 1

    invoke-virtual {p1, p2}, LyB0;->g(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Lke3;->b(LyB0;LyB0;)I

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LS83;->b:[LyB0;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, LzB0;

    iget-object v1, p0, LS83;->b:[LyB0;

    invoke-direct {v0, v1}, LzB0;-><init>([LyB0;)V

    invoke-static {v0}, Lkw6;->B(LEB0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(I)LyB0;
    .locals 1

    iget-object v0, p0, LS83;->b:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method
