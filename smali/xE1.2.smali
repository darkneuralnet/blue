.class public LxE1;
.super LgB6;
.source "SourceFile"


# direct methods
.method public constructor <init>(Liz0;)V
    .locals 1

    invoke-direct {p0, p1}, LgB6;-><init>(Liz0;)V

    iget-object v0, p1, Liz0;->e:LeN1;

    invoke-virtual {v0}, LeN1;->f()V

    iget-object v0, p1, Liz0;->f:LKo6;

    invoke-virtual {v0}, LKo6;->f()V

    check-cast p1, LwE1;

    invoke-virtual {p1}, LwE1;->w1()I

    move-result p1

    iput p1, p0, LgB6;->f:I

    return-void
.end method


# virtual methods
.method public a(Ll01;)V
    .locals 1

    iget-object p1, p0, LgB6;->h:Lp01;

    iget-boolean v0, p1, Lp01;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lp01;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp01;

    iget-object v0, p0, LgB6;->b:Liz0;

    check-cast v0, LwE1;

    iget p1, p1, Lp01;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, LwE1;->z1()F

    move-result v0

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {v0, p1}, Lp01;->d(I)V

    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, LgB6;->b:Liz0;

    check-cast v0, LwE1;

    invoke-virtual {v0}, LwE1;->x1()I

    move-result v1

    invoke-virtual {v0}, LwE1;->y1()I

    move-result v2

    invoke-virtual {v0}, LwE1;->z1()F

    invoke-virtual {v0}, LwE1;->w1()I

    move-result v0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    if-eq v1, v3, :cond_0

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->c0:Liz0;

    iget-object v2, v2, Liz0;->e:LeN1;

    iget-object v2, v2, LgB6;->h:Lp01;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v2, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->h:Lp01;

    iput v1, v0, Lp01;->f:I

    goto :goto_0

    :cond_0
    if-eq v2, v3, :cond_1

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->c0:Liz0;

    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->h:Lp01;

    neg-int v1, v2

    iput v1, v0, Lp01;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, LgB6;->h:Lp01;

    iput-boolean v4, v0, Lp01;->b:Z

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->c0:Liz0;

    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LxE1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LxE1;->q(Lp01;)V

    goto/16 :goto_2

    :cond_2
    if-eq v1, v3, :cond_3

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->c0:Liz0;

    iget-object v2, v2, Liz0;->f:LKo6;

    iget-object v2, v2, LgB6;->h:Lp01;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v2, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->h:Lp01;

    iput v1, v0, Lp01;->f:I

    goto :goto_1

    :cond_3
    if-eq v2, v3, :cond_4

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->c0:Liz0;

    iget-object v1, v1, Liz0;->f:LKo6;

    iget-object v1, v1, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->h:Lp01;

    neg-int v1, v2

    iput v1, v0, Lp01;->f:I

    goto :goto_1

    :cond_4
    iget-object v0, p0, LgB6;->h:Lp01;

    iput-boolean v4, v0, Lp01;->b:Z

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->c0:Liz0;

    iget-object v1, v1, Liz0;->f:LKo6;

    iget-object v1, v1, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    invoke-virtual {p0, v0}, LxE1;->q(Lp01;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    invoke-virtual {p0, v0}, LxE1;->q(Lp01;)V

    :goto_2
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LgB6;->b:Liz0;

    check-cast v0, LwE1;

    invoke-virtual {v0}, LwE1;->w1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->g:I

    invoke-virtual {v0, v1}, Liz0;->q1(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->g:I

    invoke-virtual {v0, v1}, Liz0;->r1(I)V

    :goto_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {v0}, Lp01;->c()V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q(Lp01;)V
    .locals 1

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
