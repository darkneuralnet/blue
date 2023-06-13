.class public LTm0;
.super Lxx;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lxx<",
        "LYN1<",
        "+",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;>;"
    }
.end annotation


# instance fields
.field public j:Lkr2;

.field public k:Lsx;

.field public l:Lnm5;

.field public m:Lfd0;

.field public n:Le30;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lxx;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lii0;->i:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lii0;->i:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lii0;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const v0, -0x800001

    iput v0, p0, Lii0;->a:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    iput v1, p0, Lii0;->b:F

    iput v0, p0, Lii0;->c:F

    iput v1, p0, Lii0;->d:F

    iput v0, p0, Lii0;->e:F

    iput v1, p0, Lii0;->f:F

    iput v0, p0, Lii0;->g:F

    iput v1, p0, Lii0;->h:F

    invoke-virtual {p0}, LTm0;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lii0;

    invoke-virtual {v1}, Lii0;->a()V

    invoke-virtual {v1}, Lii0;->f()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lii0;->i:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Lii0;->n()F

    move-result v2

    iget v3, p0, Lii0;->a:F

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    invoke-virtual {v1}, Lii0;->n()F

    move-result v2

    iput v2, p0, Lii0;->a:F

    :cond_2
    invoke-virtual {v1}, Lii0;->p()F

    move-result v2

    iget v3, p0, Lii0;->b:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_3

    invoke-virtual {v1}, Lii0;->p()F

    move-result v2

    iput v2, p0, Lii0;->b:F

    :cond_3
    invoke-virtual {v1}, Lii0;->l()F

    move-result v2

    iget v3, p0, Lii0;->c:F

    cmpl-float v2, v2, v3

    if-lez v2, :cond_4

    invoke-virtual {v1}, Lii0;->l()F

    move-result v2

    iput v2, p0, Lii0;->c:F

    :cond_4
    invoke-virtual {v1}, Lii0;->m()F

    move-result v2

    iget v3, p0, Lii0;->d:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_5

    invoke-virtual {v1}, Lii0;->m()F

    move-result v2

    iput v2, p0, Lii0;->d:F

    :cond_5
    iget v2, v1, Lii0;->e:F

    iget v3, p0, Lii0;->e:F

    cmpl-float v3, v2, v3

    if-lez v3, :cond_6

    iput v2, p0, Lii0;->e:F

    :cond_6
    iget v2, v1, Lii0;->f:F

    iget v3, p0, Lii0;->f:F

    cmpg-float v3, v2, v3

    if-gez v3, :cond_7

    iput v2, p0, Lii0;->f:F

    :cond_7
    iget v2, v1, Lii0;->g:F

    iget v3, p0, Lii0;->g:F

    cmpl-float v3, v2, v3

    if-lez v3, :cond_8

    iput v2, p0, Lii0;->g:F

    :cond_8
    iget v1, v1, Lii0;->h:F

    iget v2, p0, Lii0;->h:F

    cmpg-float v2, v1, v2

    if-gez v2, :cond_1

    iput v1, p0, Lii0;->h:F

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public h(LOM1;)Lcom/github/mikephil/charting/data/Entry;
    .locals 5

    invoke-virtual {p1}, LOM1;->c()I

    move-result v0

    invoke-virtual {p0}, LTm0;->s()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p1}, LOM1;->c()I

    move-result v0

    invoke-virtual {p0, v0}, LTm0;->w(I)Lxx;

    move-result-object v0

    invoke-virtual {p1}, LOM1;->d()I

    move-result v1

    invoke-virtual {v0}, Lii0;->e()I

    move-result v3

    if-lt v1, v3, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p1}, LOM1;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lii0;->d(I)LoO1;

    move-result-object v0

    invoke-virtual {p1}, LOM1;->h()F

    move-result v1

    invoke-interface {v0, v1}, LoO1;->q(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v1}, LAA;->c()F

    move-result v3

    invoke-virtual {p1}, LOM1;->j()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_3

    invoke-virtual {p1}, LOM1;->j()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_3
    return-object v1

    :cond_4
    return-object v2
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, LTm0;->j:Lkr2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lii0;->r()V

    :cond_0
    iget-object v0, p0, LTm0;->k:Lsx;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lii0;->r()V

    :cond_1
    iget-object v0, p0, LTm0;->m:Lfd0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lii0;->r()V

    :cond_2
    iget-object v0, p0, LTm0;->l:Lnm5;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lii0;->r()V

    :cond_3
    iget-object v0, p0, LTm0;->n:Le30;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lii0;->r()V

    :cond_4
    invoke-virtual {p0}, LTm0;->a()V

    return-void
.end method

.method public s()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxx;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LTm0;->j:Lkr2;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, LTm0;->k:Lsx;

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, LTm0;->l:Lnm5;

    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, LTm0;->m:Lfd0;

    if-eqz v1, :cond_3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v1, p0, LTm0;->n:Le30;

    if-eqz v1, :cond_4

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method public t()Lsx;
    .locals 1

    iget-object v0, p0, LTm0;->k:Lsx;

    return-object v0
.end method

.method public u()Le30;
    .locals 1

    iget-object v0, p0, LTm0;->n:Le30;

    return-object v0
.end method

.method public v()Lfd0;
    .locals 1

    iget-object v0, p0, LTm0;->m:Lfd0;

    return-object v0
.end method

.method public w(I)Lxx;
    .locals 1

    invoke-virtual {p0}, LTm0;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxx;

    return-object p1
.end method

.method public x(LOM1;)LYN1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOM1;",
            ")",
            "LYN1<",
            "+",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LOM1;->c()I

    move-result v0

    invoke-virtual {p0}, LTm0;->s()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p1}, LOM1;->c()I

    move-result v0

    invoke-virtual {p0, v0}, LTm0;->w(I)Lxx;

    move-result-object v0

    invoke-virtual {p1}, LOM1;->d()I

    move-result v1

    invoke-virtual {v0}, Lii0;->e()I

    move-result v3

    if-lt v1, v3, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LOM1;->d()I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYN1;

    return-object p1
.end method

.method public y()Lkr2;
    .locals 1

    iget-object v0, p0, LTm0;->j:Lkr2;

    return-object v0
.end method

.method public z()Lnm5;
    .locals 1

    iget-object v0, p0, LTm0;->l:Lnm5;

    return-object v0
.end method
