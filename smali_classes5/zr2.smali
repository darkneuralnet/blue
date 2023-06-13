.class public abstract Lzr2;
.super LAx;
.source "SourceFile"


# instance fields
.field public h:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LAx;-><init>(Lhi0;LFs6;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lzr2;->h:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public j(Landroid/graphics/Canvas;FFLOO1;)V
    .locals 2

    iget-object v0, p0, LRS0;->d:Landroid/graphics/Paint;

    invoke-interface {p4}, LYN1;->K0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LRS0;->d:Landroid/graphics/Paint;

    invoke-interface {p4}, LOO1;->r0()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LRS0;->d:Landroid/graphics/Paint;

    invoke-interface {p4}, LOO1;->E0()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    invoke-interface {p4}, LOO1;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzr2;->h:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->f()F

    move-result v1

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object v0, p0, LRS0;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    invoke-interface {p4}, LOO1;->O0()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lzr2;->h:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    iget-object p2, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object p4, p0, Lqx4;->a:LFs6;

    invoke-virtual {p4}, LFs6;->h()F

    move-result p4

    invoke-virtual {p2, p4, p3}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p2, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object p4, p0, Lqx4;->a:LFs6;

    invoke-virtual {p4}, LFs6;->i()F

    move-result p4

    invoke-virtual {p2, p4, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lzr2;->h:Landroid/graphics/Path;

    iget-object p3, p0, LRS0;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    return-void
.end method
