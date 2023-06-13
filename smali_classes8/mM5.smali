.class public LmM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT83;


# instance fields
.field public final a:LeZ3;

.field public final b:LiN1;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LeZ3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmM5;->a:LeZ3;

    new-instance v0, LiN1;

    invoke-direct {v0, p1}, LiN1;-><init>(LeZ3;)V

    iput-object v0, p0, LmM5;->b:LiN1;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 0

    invoke-virtual {p0, p1}, LmM5;->j(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LmM5;->c:Ljava/util/List;

    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LmM5;->c:Ljava/util/List;

    invoke-static {v0}, LS83;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LS83;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LmM5;->a:LeZ3;

    invoke-virtual {v0}, LeZ3;->b()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double/2addr v2, v0

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v0

    new-instance v0, LlM5;

    invoke-direct {v0, v2, v3}, LlM5;-><init>(D)V

    new-instance v1, LEE2;

    invoke-direct {v1, v0, v2, v3}, LEE2;-><init>(LVq5;D)V

    invoke-virtual {v1, p1}, LEE2;->a(Ljava/util/Collection;)V

    invoke-virtual {v0}, LlM5;->b()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LmM5;->b:LiN1;

    invoke-virtual {v0, p1}, LiN1;->c(Ljava/util/List;)V

    return-void
.end method

.method public final d(LS83;)V
    .locals 4

    invoke-virtual {p1}, LS83;->h()[LyB0;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    array-length v3, v0

    sub-int/2addr v3, v1

    if-ge v2, v3, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {p0, v3, p1, v2}, LmM5;->l(LyB0;LS83;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LS83;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcr5;

    invoke-interface {v0}, Lcr5;->h()[LyB0;

    move-result-object v0

    iget-object v1, p0, LmM5;->b:LiN1;

    invoke-virtual {v1, v0}, LiN1;->b([LyB0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(LS83;)LS83;
    .locals 8

    invoke-virtual {p1}, LS83;->f()[LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LmM5;->i([LyB0;)[LyB0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x1

    if-gt v2, v3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v2, LS83;

    invoke-virtual {p1}, LS83;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, v1, p1}, LS83;-><init>([LyB0;Ljava/lang/Object;)V

    const/4 p1, 0x0

    move v1, p1

    :goto_0
    array-length v4, v0

    sub-int/2addr v4, v3

    if-ge p1, v4, :cond_2

    invoke-virtual {v2, v1}, LS83;->u(I)LyB0;

    move-result-object v4

    add-int/lit8 v5, p1, 0x1

    aget-object v6, v0, v5

    invoke-virtual {p0, v6}, LmM5;->h(LyB0;)LyB0;

    move-result-object v7

    invoke-virtual {v7, v4}, LyB0;->g(LyB0;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    aget-object p1, v0, p1

    invoke-virtual {p0, p1, v6, v2, v1}, LmM5;->k(LyB0;LyB0;LS83;I)V

    add-int/lit8 v1, v1, 0x1

    :goto_1
    move p1, v5

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public final g(Ljava/util/Collection;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LS83;",
            ">;)",
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS83;

    invoke-virtual {p0, v1}, LmM5;->f(LS83;)LS83;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS83;

    invoke-virtual {p0, v1}, LmM5;->d(LS83;)V

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public final h(LyB0;)LyB0;
    .locals 1

    invoke-virtual {p1}, LyB0;->e()LyB0;

    move-result-object p1

    iget-object v0, p0, LmM5;->a:LeZ3;

    invoke-virtual {v0, p1}, LeZ3;->f(LyB0;)V

    return-object p1
.end method

.method public final i([LyB0;)[LyB0;
    .locals 4

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {p0, v3}, LmM5;->h(LyB0;)LyB0;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, LDB0;->f(LyB0;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/util/Collection;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LS83;",
            ">;)",
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LmM5;->c(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, LmM5;->e(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, LmM5;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k(LyB0;LyB0;LS83;I)V
    .locals 8

    iget-object v0, p0, LmM5;->b:LiN1;

    new-instance v7, LmM5$a;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, LmM5$a;-><init>(LmM5;LyB0;LyB0;LS83;I)V

    invoke-virtual {v0, p1, p2, v7}, LiN1;->e(LyB0;LyB0;LTj2;)V

    return-void
.end method

.method public final l(LyB0;LS83;I)V
    .locals 2

    iget-object v0, p0, LmM5;->b:LiN1;

    new-instance v1, LmM5$b;

    invoke-direct {v1, p0, p1, p2, p3}, LmM5$b;-><init>(LmM5;LyB0;LS83;I)V

    invoke-virtual {v0, p1, p1, v1}, LiN1;->e(LyB0;LyB0;LTj2;)V

    return-void
.end method
