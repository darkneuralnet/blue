.class public LEX3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LbC1;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoA3;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoA3;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;LbC1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnA3;",
            ">;",
            "LbC1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LEX3;-><init>(Ljava/util/List;LbC1;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;LbC1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnA3;",
            ">;",
            "LbC1;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LEX3;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LEX3;->c:Ljava/util/List;

    iput-object p2, p0, LEX3;->a:LbC1;

    iput-boolean p3, p0, LEX3;->d:Z

    invoke-virtual {p0, p1}, LEX3;->e(Ljava/util/List;)V

    return-void
.end method

.method public static a(LoA3;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoA3;",
            "Ljava/util/List<",
            "LoA3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoA3;

    invoke-virtual {v0}, LoA3;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, LoA3;->l(LoA3;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static c(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LnA3;",
            ">;)",
            "Ljava/util/List<",
            "LfO2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->B()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    invoke-virtual {v2}, LqA3;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LnA3;->w()LfO2;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, LfO2;

    invoke-direct {v2, v1}, LfO2;-><init>(LnA3;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LoA3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LEX3;->g(Ljava/util/List;)LoA3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LEX3;->a(LoA3;Ljava/util/List;)V

    iget-object p1, p0, LEX3;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LEX3;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_0
    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LfO2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfO2;

    iget-object v1, p0, LEX3;->a:LbC1;

    invoke-virtual {v0, v1}, LfO2;->b(LbC1;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LEX3;->b(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnA3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LEX3;->i(Ljava/util/List;)V

    invoke-static {p1}, LEX3;->c(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LEX3;->d(Ljava/util/List;)V

    iget-object p1, p0, LEX3;->b:Ljava/util/List;

    iget-object v0, p0, LEX3;->c:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, LEX3;->j(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public final f(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LoA3;",
            ">;)",
            "Ljava/util/List<",
            "LCX3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LoA3;

    iget-object v2, p0, LEX3;->a:LbC1;

    invoke-virtual {v1, v2}, LoA3;->m(LbC1;)LCX3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final g(Ljava/util/List;)LoA3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LoA3;",
            ">;)",
            "LoA3;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LoA3;

    invoke-virtual {v3}, LoA3;->j()Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    if-gt v2, p1, :cond_2

    move v0, p1

    :cond_2
    const-string p1, "found two shells in EdgeRing list"

    invoke-static {v0, p1}, LKo;->d(ZLjava/lang/String;)V

    return-object v1
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LCX3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LEX3;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, LEX3;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LnA3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnA3;

    invoke-static {v0}, LfO2;->h(LnA3;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LoA3;",
            ">;",
            "Ljava/util/List<",
            "LoA3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoA3;

    invoke-virtual {v0}, LoA3;->i()LoA3;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, LoA3;->d(Ljava/util/List;)LoA3;

    move-result-object v1

    iget-boolean v2, p0, LEX3;->d:Z

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    const-string p2, "unable to assign free hole to a shell"

    invoke-virtual {v0}, LoA3;->e()LyB0;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {v0, v1}, LoA3;->l(LoA3;)V

    goto :goto_0

    :cond_3
    return-void
.end method
