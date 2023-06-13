.class public LhG4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp71;
.implements LhJ3;
.implements LaE1;
.implements LoB$b;
.implements LDk2;


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/Path;

.field public final c:LRD2;

.field public final d:LqB;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lm96;

.field public j:LjA0;


# direct methods
.method public constructor <init>(LRD2;LqB;LgG4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LhG4;->a:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LhG4;->b:Landroid/graphics/Path;

    iput-object p1, p0, LhG4;->c:LRD2;

    iput-object p2, p0, LhG4;->d:LqB;

    invoke-virtual {p3}, LgG4;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LhG4;->e:Ljava/lang/String;

    invoke-virtual {p3}, LgG4;->f()Z

    move-result p1

    iput-boolean p1, p0, LhG4;->f:Z

    invoke-virtual {p3}, LgG4;->b()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LhG4;->g:LoB;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p3}, LgG4;->d()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LhG4;->h:LoB;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p3}, LgG4;->e()LEe;

    move-result-object p1

    invoke-virtual {p1}, LEe;->b()Lm96;

    move-result-object p1

    iput-object p1, p0, LhG4;->i:Lm96;

    invoke-virtual {p1, p2}, Lm96;->a(LqB;)V

    invoke-virtual {p1, p0}, Lm96;->b(LoB$b;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    iget-object v0, p0, LhG4;->j:LjA0;

    invoke-virtual {v0, p1, p2, p3}, LjA0;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public b(Ljava/util/ListIterator;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LhG4;->j:LjA0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVz0;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    goto :goto_1

    :cond_2
    invoke-static {v6}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance p1, LjA0;

    iget-object v2, p0, LhG4;->c:LRD2;

    iget-object v3, p0, LhG4;->d:LqB;

    const-string v4, "Repeater"

    iget-boolean v5, p0, LhG4;->f:Z

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, LjA0;-><init>(LRD2;LqB;Ljava/lang/String;ZLjava/util/List;LEe;)V

    iput-object p1, p0, LhG4;->j:LjA0;

    return-void
.end method

.method public c(LBk2;ILjava/util/List;LBk2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p0}, LrU2;->k(LBk2;ILjava/util/List;LBk2;LDk2;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LhG4;->j:LjA0;

    invoke-virtual {v1}, LjA0;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LhG4;->j:LjA0;

    invoke-virtual {v1}, LjA0;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVz0;

    instance-of v2, v1, LDk2;

    if-eqz v2, :cond_0

    check-cast v1, LDk2;

    invoke-static {p1, p2, p3, p4, v1}, LrU2;->k(LBk2;ILjava/util/List;LBk2;LDk2;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 9

    iget-object v0, p0, LhG4;->g:LoB;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, LhG4;->h:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, LhG4;->i:Lm96;

    invoke-virtual {v2}, Lm96;->i()LoB;

    move-result-object v2

    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    iget-object v4, p0, LhG4;->i:Lm96;

    invoke-virtual {v4}, Lm96;->e()LoB;

    move-result-object v4

    invoke-virtual {v4}, LoB;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    div-float/2addr v4, v3

    float-to-int v3, v0

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ltz v3, :cond_0

    iget-object v5, p0, LhG4;->a:Landroid/graphics/Matrix;

    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v5, p0, LhG4;->a:Landroid/graphics/Matrix;

    iget-object v6, p0, LhG4;->i:Lm96;

    int-to-float v7, v3

    add-float v8, v7, v1

    invoke-virtual {v6, v8}, Lm96;->g(F)Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    int-to-float v5, p3

    div-float/2addr v7, v0

    invoke-static {v2, v4, v7}, LrU2;->i(FFF)F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, LhG4;->j:LjA0;

    iget-object v7, p0, LhG4;->a:Landroid/graphics/Matrix;

    float-to-int v5, v5

    invoke-virtual {v6, p1, v7, v5}, LjA0;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, LhG4;->c:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LhG4;->j:LjA0;

    invoke-virtual {v0, p1, p2}, LjA0;->f(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LhG4;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 6

    iget-object v0, p0, LhG4;->j:LjA0;

    invoke-virtual {v0}, LjA0;->getPath()Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, LhG4;->b:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, LhG4;->g:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, LhG4;->h:LoB;

    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-int v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    iget-object v3, p0, LhG4;->a:Landroid/graphics/Matrix;

    iget-object v4, p0, LhG4;->i:Lm96;

    int-to-float v5, v1

    add-float/2addr v5, v2

    invoke-virtual {v4, v5}, Lm96;->g(F)Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v3, p0, LhG4;->b:Landroid/graphics/Path;

    iget-object v4, p0, LhG4;->a:Landroid/graphics/Matrix;

    invoke-virtual {v3, v0, v4}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LhG4;->b:Landroid/graphics/Path;

    return-object v0
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LhG4;->i:Lm96;

    invoke-virtual {v0, p1, p2}, Lm96;->c(Ljava/lang/Object;LgE2;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LaE2;->u:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LhG4;->g:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_1
    sget-object v0, LaE2;->v:Ljava/lang/Float;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LhG4;->h:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    :cond_2
    :goto_0
    return-void
.end method
