.class public LKo6;
.super LgB6;
.source "SourceFile"


# instance fields
.field public k:Lp01;

.field public l:LY31;


# direct methods
.method public constructor <init>(Liz0;)V
    .locals 2

    invoke-direct {p0, p1}, LgB6;-><init>(Liz0;)V

    new-instance p1, Lp01;

    invoke-direct {p1, p0}, Lp01;-><init>(LgB6;)V

    iput-object p1, p0, LKo6;->k:Lp01;

    const/4 v0, 0x0

    iput-object v0, p0, LKo6;->l:LY31;

    iget-object v0, p0, LgB6;->h:Lp01;

    sget-object v1, Lp01$a;->g:Lp01$a;

    iput-object v1, v0, Lp01;->e:Lp01$a;

    iget-object v0, p0, LgB6;->i:Lp01;

    sget-object v1, Lp01$a;->h:Lp01$a;

    iput-object v1, v0, Lp01;->e:Lp01$a;

    sget-object v0, Lp01$a;->i:Lp01$a;

    iput-object v0, p1, Lp01;->e:Lp01$a;

    const/4 p1, 0x1

    iput p1, p0, LgB6;->f:I

    return-void
.end method


# virtual methods
.method public a(Ll01;)V
    .locals 6

    sget-object v0, LKo6$a;->a:[I

    iget-object v1, p0, LgB6;->j:LgB6$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, v0, Liz0;->R:LXy0;

    iget-object v0, v0, Liz0;->T:LXy0;

    invoke-virtual {p0, p1, v1, v0, v3}, LgB6;->n(Ll01;LXy0;LXy0;I)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LgB6;->o(Ll01;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, LgB6;->p(Ll01;)V

    :goto_0
    iget-object p1, p0, LgB6;->e:LY31;

    iget-boolean v0, p1, Lp01;->c:Z

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    if-eqz v0, :cond_8

    iget-boolean p1, p1, Lp01;->j:Z

    if-nez p1, :cond_8

    iget-object p1, p0, LgB6;->d:Liz0$b;

    sget-object v0, Liz0$b;->d:Liz0$b;

    if-ne p1, v0, :cond_8

    iget-object p1, p0, LgB6;->b:Liz0;

    iget v0, p1, Liz0;->x:I

    if-eq v0, v2, :cond_7

    if-eq v0, v1, :cond_3

    goto :goto_4

    :cond_3
    iget-object v0, p1, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->e:LY31;

    iget-boolean v0, v0, Lp01;->j:Z

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Liz0;->y()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_6

    if-eqz p1, :cond_5

    if-eq p1, v3, :cond_4

    move p1, v5

    goto :goto_3

    :cond_4
    iget-object p1, p0, LgB6;->b:Liz0;

    iget-object v0, p1, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->e:LY31;

    iget v0, v0, Lp01;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, Liz0;->x()F

    move-result p1

    goto :goto_1

    :cond_5
    iget-object p1, p0, LgB6;->b:Liz0;

    iget-object v0, p1, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->e:LY31;

    iget v0, v0, Lp01;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, Liz0;->x()F

    move-result p1

    mul-float/2addr v0, p1

    goto :goto_2

    :cond_6
    iget-object p1, p0, LgB6;->b:Liz0;

    iget-object v0, p1, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->e:LY31;

    iget v0, v0, Lp01;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, Liz0;->x()F

    move-result p1

    :goto_1
    div-float/2addr v0, p1

    :goto_2
    add-float/2addr v0, v4

    float-to-int p1, v0

    :goto_3
    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {v0, p1}, LY31;->d(I)V

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Liz0;->M()Liz0;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object p1, p1, Liz0;->f:LKo6;

    iget-object p1, p1, LgB6;->e:LY31;

    iget-boolean v0, p1, Lp01;->j:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, LgB6;->b:Liz0;

    iget v0, v0, Liz0;->E:F

    iget p1, p1, Lp01;->g:I

    int-to-float p1, p1

    mul-float/2addr p1, v0

    add-float/2addr p1, v4

    float-to-int p1, p1

    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {v0, p1}, LY31;->d(I)V

    :cond_8
    :goto_4
    iget-object p1, p0, LgB6;->h:Lp01;

    iget-boolean v0, p1, Lp01;->c:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-boolean v1, v0, Lp01;->c:Z

    if-nez v1, :cond_9

    goto/16 :goto_6

    :cond_9
    iget-boolean p1, p1, Lp01;->j:Z

    if-eqz p1, :cond_a

    iget-boolean p1, v0, Lp01;->j:Z

    if-eqz p1, :cond_a

    iget-object p1, p0, LgB6;->e:LY31;

    iget-boolean p1, p1, Lp01;->j:Z

    if-eqz p1, :cond_a

    return-void

    :cond_a
    iget-object p1, p0, LgB6;->e:LY31;

    iget-boolean p1, p1, Lp01;->j:Z

    if-nez p1, :cond_b

    iget-object p1, p0, LgB6;->d:Liz0$b;

    sget-object v0, Liz0$b;->d:Liz0$b;

    if-ne p1, v0, :cond_b

    iget-object p1, p0, LgB6;->b:Liz0;

    iget v0, p1, Liz0;->w:I

    if-nez v0, :cond_b

    invoke-virtual {p1}, Liz0;->m0()Z

    move-result p1

    if-nez p1, :cond_b

    iget-object p1, p0, LgB6;->h:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp01;

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp01;

    iget p1, p1, Lp01;->g:I

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v2, v1, Lp01;->f:I

    add-int/2addr p1, v2

    iget v0, v0, Lp01;->g:I

    iget-object v2, p0, LgB6;->i:Lp01;

    iget v2, v2, Lp01;->f:I

    add-int/2addr v0, v2

    sub-int v2, v0, p1

    invoke-virtual {v1, p1}, Lp01;->d(I)V

    iget-object p1, p0, LgB6;->i:Lp01;

    invoke-virtual {p1, v0}, Lp01;->d(I)V

    iget-object p1, p0, LgB6;->e:LY31;

    invoke-virtual {p1, v2}, LY31;->d(I)V

    return-void

    :cond_b
    iget-object p1, p0, LgB6;->e:LY31;

    iget-boolean p1, p1, Lp01;->j:Z

    if-nez p1, :cond_d

    iget-object p1, p0, LgB6;->d:Liz0$b;

    sget-object v0, Liz0$b;->d:Liz0$b;

    if-ne p1, v0, :cond_d

    iget p1, p0, LgB6;->a:I

    if-ne p1, v3, :cond_d

    iget-object p1, p0, LgB6;->h:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_d

    iget-object p1, p0, LgB6;->i:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_d

    iget-object p1, p0, LgB6;->h:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp01;

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp01;

    iget p1, p1, Lp01;->g:I

    iget-object v1, p0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->f:I

    add-int/2addr p1, v1

    iget v0, v0, Lp01;->g:I

    iget-object v1, p0, LgB6;->i:Lp01;

    iget v1, v1, Lp01;->f:I

    add-int/2addr v0, v1

    sub-int/2addr v0, p1

    iget-object p1, p0, LgB6;->e:LY31;

    iget v1, p1, LY31;->m:I

    if-ge v0, v1, :cond_c

    invoke-virtual {p1, v0}, LY31;->d(I)V

    goto :goto_5

    :cond_c
    invoke-virtual {p1, v1}, LY31;->d(I)V

    :cond_d
    :goto_5
    iget-object p1, p0, LgB6;->e:LY31;

    iget-boolean p1, p1, Lp01;->j:Z

    if-nez p1, :cond_e

    return-void

    :cond_e
    iget-object p1, p0, LgB6;->h:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_10

    iget-object p1, p0, LgB6;->i:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_10

    iget-object p1, p0, LgB6;->h:Lp01;

    iget-object p1, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp01;

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp01;

    iget v1, p1, Lp01;->g:I

    iget-object v2, p0, LgB6;->h:Lp01;

    iget v2, v2, Lp01;->f:I

    add-int/2addr v1, v2

    iget v2, v0, Lp01;->g:I

    iget-object v3, p0, LgB6;->i:Lp01;

    iget v3, v3, Lp01;->f:I

    add-int/2addr v2, v3

    iget-object v3, p0, LgB6;->b:Liz0;

    invoke-virtual {v3}, Liz0;->T()F

    move-result v3

    if-ne p1, v0, :cond_f

    iget v1, p1, Lp01;->g:I

    iget v2, v0, Lp01;->g:I

    move v3, v4

    :cond_f
    sub-int/2addr v2, v1

    iget-object p1, p0, LgB6;->e:LY31;

    iget p1, p1, Lp01;->g:I

    sub-int/2addr v2, p1

    iget-object p1, p0, LgB6;->h:Lp01;

    int-to-float v0, v1

    add-float/2addr v0, v4

    int-to-float v1, v2

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Lp01;->d(I)V

    iget-object p1, p0, LgB6;->i:Lp01;

    iget-object v0, p0, LgB6;->h:Lp01;

    iget v0, v0, Lp01;->g:I

    iget-object v1, p0, LgB6;->e:LY31;

    iget v1, v1, Lp01;->g:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lp01;->d(I)V

    :cond_10
    :goto_6
    return-void
.end method

.method public d()V
    .locals 10

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-boolean v1, v0, Liz0;->a:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-virtual {v0}, Liz0;->z()I

    move-result v0

    invoke-virtual {v1, v0}, LY31;->d(I)V

    :cond_0
    iget-object v0, p0, LgB6;->e:LY31;

    iget-boolean v0, v0, Lp01;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->V()Liz0$b;

    move-result-object v0

    iput-object v0, p0, LgB6;->d:Liz0$b;

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LGE;

    invoke-direct {v0, p0}, LGE;-><init>(LgB6;)V

    iput-object v0, p0, LKo6;->l:LY31;

    :cond_1
    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->d:Liz0$b;

    if-eq v0, v1, :cond_4

    sget-object v1, Liz0$b;->e:Liz0$b;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Liz0;->V()Liz0$b;

    move-result-object v1

    sget-object v2, Liz0$b;->b:Liz0$b;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Liz0;->z()I

    move-result v1

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->R:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->T:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LgB6;->h:Lp01;

    iget-object v3, v0, Liz0;->f:LKo6;

    iget-object v3, v3, LgB6;->h:Lp01;

    iget-object v4, p0, LgB6;->b:Liz0;

    iget-object v4, v4, Liz0;->R:LXy0;

    invoke-virtual {v4}, LXy0;->f()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v2, p0, LgB6;->i:Lp01;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v3, p0, LgB6;->b:Liz0;

    iget-object v3, v3, Liz0;->T:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {v0, v1}, LY31;->d(I)V

    return-void

    :cond_2
    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->b:Liz0$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v1, p0, LgB6;->b:Liz0;

    invoke-virtual {v1}, Liz0;->z()I

    move-result v1

    invoke-virtual {v0, v1}, LY31;->d(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->e:Liz0$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Liz0;->V()Liz0$b;

    move-result-object v1

    sget-object v2, Liz0$b;->b:Liz0$b;

    if-ne v1, v2, :cond_4

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, v0, Liz0;->f:LKo6;

    iget-object v2, v2, LgB6;->h:Lp01;

    iget-object v3, p0, LgB6;->b:Liz0;

    iget-object v3, v3, Liz0;->R:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->T:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, LgB6;->e:LY31;

    iget-boolean v1, v0, Lp01;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x3

    if-eqz v1, :cond_d

    iget-object v7, p0, LgB6;->b:Liz0;

    iget-boolean v8, v7, Liz0;->a:Z

    if-eqz v8, :cond_d

    iget-object v0, v7, Liz0;->Y:[LXy0;

    aget-object v1, v0, v4

    iget-object v8, v1, LXy0;->f:LXy0;

    if-eqz v8, :cond_8

    aget-object v9, v0, v6

    iget-object v9, v9, LXy0;->f:LXy0;

    if-eqz v9, :cond_8

    invoke-virtual {v7}, Liz0;->m0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->Y:[LXy0;

    aget-object v1, v1, v4

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    iput v1, v0, Lp01;->f:I

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->Y:[LXy0;

    aget-object v1, v1, v6

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lp01;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->Y:[LXy0;

    aget-object v0, v0, v4

    invoke-virtual {p0, v0}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v4

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    :cond_6
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->Y:[LXy0;

    aget-object v0, v0, v6

    invoke-virtual {p0, v0}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v6

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    :cond_7
    iget-object v0, p0, LgB6;->h:Lp01;

    iput-boolean v5, v0, Lp01;->b:Z

    iget-object v0, p0, LgB6;->i:Lp01;

    iput-boolean v5, v0, Lp01;->b:Z

    :goto_1
    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->r()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    goto/16 :goto_5

    :cond_8
    if-eqz v8, :cond_9

    invoke-virtual {p0, v1}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v4

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    iget v2, v2, Lp01;->g:I

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->r()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    goto/16 :goto_5

    :cond_9
    aget-object v1, v0, v6

    iget-object v4, v1, LXy0;->f:LXy0;

    if-eqz v4, :cond_b

    invoke-virtual {p0, v1}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v6

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    iget v2, v2, Lp01;->g:I

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    :cond_a
    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->r()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    goto/16 :goto_5

    :cond_b
    aget-object v0, v0, v3

    iget-object v1, v0, LXy0;->f:LXy0;

    if-eqz v1, :cond_c

    invoke-virtual {p0, v0}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v1, p0, LKo6;->k:Lp01;

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LKo6;->k:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->r()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    iget v2, v2, Lp01;->g:I

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    goto/16 :goto_5

    :cond_c
    instance-of v0, v7, LHL1;

    if-nez v0, :cond_1e

    invoke-virtual {v7}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LgB6;->b:Liz0;

    sget-object v1, LXy0$b;->h:LXy0$b;

    invoke-virtual {v0, v1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v0

    iget-object v0, v0, LXy0;->f:LXy0;

    if-nez v0, :cond_1e

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->a0()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    iget v2, v2, Lp01;->g:I

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->r()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LgB6;->b(Lp01;Lp01;I)V

    goto/16 :goto_5

    :cond_d
    if-nez v1, :cond_12

    iget-object v1, p0, LgB6;->d:Liz0$b;

    sget-object v7, Liz0$b;->d:Liz0$b;

    if-ne v1, v7, :cond_12

    iget-object v0, p0, LgB6;->b:Liz0;

    iget v1, v0, Liz0;->x:I

    if-eq v1, v4, :cond_10

    if-eq v1, v6, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v0}, Liz0;->m0()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, LgB6;->b:Liz0;

    iget v1, v0, Liz0;->w:I

    if-ne v1, v6, :cond_f

    goto :goto_2

    :cond_f
    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->e:LY31;

    iget-object v1, p0, LgB6;->e:LY31;

    iget-object v1, v1, Lp01;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iput-boolean v5, v0, Lp01;->b:Z

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_2

    :cond_11
    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->e:LY31;

    iget-object v1, p0, LgB6;->e:LY31;

    iget-object v1, v1, Lp01;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iput-boolean v5, v0, Lp01;->b:Z

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->i:Lp01;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-virtual {v0, p0}, Lp01;->b(Ll01;)V

    :cond_13
    :goto_2
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v1, v0, Liz0;->Y:[LXy0;

    aget-object v7, v1, v4

    iget-object v8, v7, LXy0;->f:LXy0;

    if-eqz v8, :cond_17

    aget-object v9, v1, v6

    iget-object v9, v9, LXy0;->f:LXy0;

    if-eqz v9, :cond_17

    invoke-virtual {v0}, Liz0;->m0()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->Y:[LXy0;

    aget-object v1, v1, v4

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    iput v1, v0, Lp01;->f:I

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->Y:[LXy0;

    aget-object v1, v1, v6

    invoke-virtual {v1}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Lp01;->f:I

    goto :goto_3

    :cond_14
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->Y:[LXy0;

    aget-object v0, v0, v4

    invoke-virtual {p0, v0}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->Y:[LXy0;

    aget-object v1, v1, v6

    invoke-virtual {p0, v1}, LgB6;->h(LXy0;)Lp01;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, Lp01;->b(Ll01;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, Lp01;->b(Ll01;)V

    :cond_16
    sget-object v0, LgB6$b;->e:LgB6$b;

    iput-object v0, p0, LgB6;->j:LgB6$b;

    :goto_3
    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LKo6;->l:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    goto/16 :goto_4

    :cond_17
    const/4 v9, 0x0

    if-eqz v8, :cond_19

    invoke-virtual {p0, v7}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v4

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LKo6;->l:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    :cond_18
    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->d:Liz0$b;

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->x()F

    move-result v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_1d

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v2, v0, LgB6;->d:Liz0$b;

    if-ne v2, v1, :cond_1d

    iget-object v0, v0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iput-object p0, v0, Lp01;->a:Ll01;

    goto/16 :goto_4

    :cond_19
    aget-object v4, v1, v6

    iget-object v7, v4, LXy0;->f:LXy0;

    const/4 v8, -0x1

    if-eqz v7, :cond_1a

    invoke-virtual {p0, v4}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    iget-object v2, v2, Liz0;->Y:[LXy0;

    aget-object v2, v2, v6

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->i:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    invoke-virtual {p0, v0, v1, v8, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LKo6;->l:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    goto/16 :goto_4

    :cond_1a
    aget-object v1, v1, v3

    iget-object v3, v1, LXy0;->f:LXy0;

    if-eqz v3, :cond_1b

    invoke-virtual {p0, v1}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, LKo6;->k:Lp01;

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-object v1, p0, LKo6;->k:Lp01;

    iget-object v2, p0, LKo6;->l:LY31;

    invoke-virtual {p0, v0, v1, v8, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    goto :goto_4

    :cond_1b
    instance-of v1, v0, LHL1;

    if-nez v1, :cond_1d

    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->M()Liz0;

    move-result-object v0

    iget-object v0, v0, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->b:Liz0;

    invoke-virtual {v2}, Liz0;->a0()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, LgB6;->b(Lp01;Lp01;I)V

    iget-object v0, p0, LgB6;->i:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LgB6;->e:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->b0()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, LKo6;->k:Lp01;

    iget-object v1, p0, LgB6;->h:Lp01;

    iget-object v2, p0, LKo6;->l:LY31;

    invoke-virtual {p0, v0, v1, v5, v2}, LgB6;->c(Lp01;Lp01;ILY31;)V

    :cond_1c
    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->d:Liz0$b;

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, LgB6;->b:Liz0;

    invoke-virtual {v0}, Liz0;->x()F

    move-result v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_1d

    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v0, v0, Liz0;->e:LeN1;

    iget-object v2, v0, LgB6;->d:Liz0$b;

    if-ne v2, v1, :cond_1d

    iget-object v0, v0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->k:Ljava/util/List;

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->b:Liz0;

    iget-object v1, v1, Liz0;->e:LeN1;

    iget-object v1, v1, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LgB6;->e:LY31;

    iput-object p0, v0, Lp01;->a:Ll01;

    :cond_1d
    :goto_4
    iget-object v0, p0, LgB6;->e:LY31;

    iget-object v0, v0, Lp01;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, LgB6;->e:LY31;

    iput-boolean v5, v0, Lp01;->c:Z

    :cond_1e
    :goto_5
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LgB6;->h:Lp01;

    iget-boolean v1, v0, Lp01;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LgB6;->b:Liz0;

    iget v0, v0, Lp01;->g:I

    invoke-virtual {v1, v0}, Liz0;->r1(I)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LgB6;->c:Led5;

    iget-object v0, p0, LgB6;->h:Lp01;

    invoke-virtual {v0}, Lp01;->c()V

    iget-object v0, p0, LgB6;->i:Lp01;

    invoke-virtual {v0}, Lp01;->c()V

    iget-object v0, p0, LKo6;->k:Lp01;

    invoke-virtual {v0}, Lp01;->c()V

    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {v0}, Lp01;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LgB6;->g:Z

    return-void
.end method

.method public m()Z
    .locals 3

    iget-object v0, p0, LgB6;->d:Liz0$b;

    sget-object v1, Liz0$b;->d:Liz0$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LgB6;->b:Liz0;

    iget v0, v0, Liz0;->x:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LgB6;->g:Z

    iget-object v1, p0, LgB6;->h:Lp01;

    invoke-virtual {v1}, Lp01;->c()V

    iget-object v1, p0, LgB6;->h:Lp01;

    iput-boolean v0, v1, Lp01;->j:Z

    iget-object v1, p0, LgB6;->i:Lp01;

    invoke-virtual {v1}, Lp01;->c()V

    iget-object v1, p0, LgB6;->i:Lp01;

    iput-boolean v0, v1, Lp01;->j:Z

    iget-object v1, p0, LKo6;->k:Lp01;

    invoke-virtual {v1}, Lp01;->c()V

    iget-object v1, p0, LKo6;->k:Lp01;

    iput-boolean v0, v1, Lp01;->j:Z

    iget-object v1, p0, LgB6;->e:LY31;

    iput-boolean v0, v1, Lp01;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VerticalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LgB6;->b:Liz0;

    invoke-virtual {v1}, Liz0;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
