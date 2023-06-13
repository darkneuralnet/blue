.class public LQ62;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LbC1;

.field public b:LpA3;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LFW3;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(LpA3;LbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LQ62;->c:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, LQ62;->d:Z

    iput-object p1, p0, LQ62;->b:LpA3;

    iput-object p2, p0, LQ62;->a:LbC1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LQ62;->b:LpA3;

    invoke-virtual {v0}, LpA3;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {p0, v1}, LQ62;->d(LnA3;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LQ62;->a:LbC1;

    invoke-virtual {v1}, LnA3;->t()LyB0;

    move-result-object v1

    invoke-virtual {v1}, LyB0;->e()LyB0;

    move-result-object v1

    invoke-virtual {v2, v1}, LbC1;->t(LyB0;)LFW3;

    move-result-object v1

    iget-object v2, p0, LQ62;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LFW3;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LQ62;->a()V

    iget-object v0, p0, LQ62;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c(LqA3;I)Z
    .locals 2

    iget-boolean v0, p0, LQ62;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LqA3;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1, p2}, LqA3;->k(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1, p2}, LqA3;->w(I)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final d(LnA3;)Z
    .locals 6

    const/4 v0, 0x0

    move-object v1, p1

    move v2, v0

    move v3, v2

    :cond_0
    invoke-virtual {v1}, LnA3;->A()Z

    move-result v4

    if-eqz v4, :cond_1

    return v0

    :cond_1
    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v4

    invoke-virtual {p0, v4, v0}, LQ62;->c(LqA3;I)Z

    move-result v5

    or-int/2addr v2, v5

    const/4 v5, 0x1

    invoke-virtual {p0, v4, v5}, LQ62;->c(LqA3;I)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v1}, LFE1;->l()LFE1;

    move-result-object v1

    check-cast v1, LnA3;

    if-ne v1, p1, :cond_0

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    move v0, v5

    :cond_2
    return v0
.end method

.method public e(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, LQ62;->d:Z

    return-void
.end method
