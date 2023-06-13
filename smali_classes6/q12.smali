.class public final Lq12;
.super Lg71;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "LyC;",
        ">",
        "Lg71;"
    }
.end annotation


# instance fields
.field public q:Lq71;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq71<",
            "TS;>;"
        }
    .end annotation
.end field

.field public r:Lp12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp12<",
            "Landroid/animation/ObjectAnimator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LyC;Lq71;Lp12;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LyC;",
            "Lq71<",
            "TS;>;",
            "Lp12<",
            "Landroid/animation/ObjectAnimator;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lg71;-><init>(Landroid/content/Context;LyC;)V

    invoke-virtual {p0, p3}, Lq12;->y(Lq71;)V

    invoke-virtual {p0, p4}, Lq12;->x(Lp12;)V

    return-void
.end method

.method public static t(Landroid/content/Context;Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)Lq12;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ")",
            "Lq12<",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq12;

    new-instance v1, LBj0;

    invoke-direct {v1, p1}, LBj0;-><init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V

    new-instance v2, LCj0;

    invoke-direct {v2, p1}, LCj0;-><init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V

    invoke-direct {v0, p0, p1, v1, v2}, Lq12;-><init>(Landroid/content/Context;LyC;Lq71;Lp12;)V

    return-object v0
.end method

.method public static u(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)Lq12;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ")",
            "Lq12<",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq12;

    new-instance v1, LFr2;

    invoke-direct {v1, p1}, LFr2;-><init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V

    iget v2, p1, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;->g:I

    if-nez v2, :cond_0

    new-instance v2, LHr2;

    invoke-direct {v2, p1}, LHr2;-><init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V

    goto :goto_0

    :cond_0
    new-instance v2, LIr2;

    invoke-direct {v2, p0, p1}, LIr2;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V

    :goto_0
    invoke-direct {v0, p0, p1, v1, v2}, Lq12;-><init>(Landroid/content/Context;LyC;Lq71;Lp12;)V

    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 10

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lq12;->q:Lq71;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p0}, Lg71;->h()F

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lq71;->g(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V

    iget-object v0, p0, Lq12;->q:Lq71;

    iget-object v1, p0, Lg71;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1}, Lq71;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lq12;->r:Lp12;

    iget-object v2, v1, Lp12;->c:[I

    array-length v3, v2

    if-ge v0, v3, :cond_1

    iget-object v4, p0, Lq12;->q:Lq71;

    iget-object v6, p0, Lg71;->n:Landroid/graphics/Paint;

    iget-object v1, v1, Lp12;->b:[F

    mul-int/lit8 v3, v0, 0x2

    aget v7, v1, v3

    add-int/lit8 v3, v3, 0x1

    aget v8, v1, v3

    aget v9, v2, v0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Lq71;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    invoke-super {p0}, Lg71;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lq12;->q:Lq71;

    invoke-virtual {v0}, Lq71;->d()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lq12;->q:Lq71;

    invoke-virtual {v0}, Lq71;->e()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    invoke-super {p0}, Lg71;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Z
    .locals 1

    invoke-super {p0}, Lg71;->i()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    invoke-super {p0}, Lg71;->isRunning()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lg71;->j()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic k()Z
    .locals 1

    invoke-super {p0}, Lg71;->k()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Loe;)V
    .locals 0

    invoke-super {p0, p1}, Lg71;->m(Loe;)V

    return-void
.end method

.method public bridge synthetic q(ZZZ)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lg71;->q(ZZZ)Z

    move-result p1

    return p1
.end method

.method public r(ZZZ)Z
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lg71;->r(ZZZ)Z

    move-result p2

    invoke-virtual {p0}, Lq12;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq12;->r:Lp12;

    invoke-virtual {v0}, Lp12;->a()V

    :cond_0
    iget-object v0, p0, Lg71;->d:Lyf;

    iget-object v1, p0, Lg71;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyf;->a(Landroid/content/ContentResolver;)F

    if-eqz p1, :cond_2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lq12;->r:Lp12;

    invoke-virtual {p1}, Lp12;->g()V

    :cond_2
    :goto_0
    return p2
.end method

.method public bridge synthetic s(Loe;)Z
    .locals 0

    invoke-super {p0, p1}, Lg71;->s(Loe;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    invoke-super {p0, p1}, Lg71;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    invoke-super {p0, p1}, Lg71;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lg71;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Lg71;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Lg71;->stop()V

    return-void
.end method

.method public v()Lp12;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp12<",
            "Landroid/animation/ObjectAnimator;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq12;->r:Lp12;

    return-object v0
.end method

.method public w()Lq71;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq71<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lq12;->q:Lq71;

    return-object v0
.end method

.method public x(Lp12;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp12<",
            "Landroid/animation/ObjectAnimator;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lq12;->r:Lp12;

    invoke-virtual {p1, p0}, Lp12;->e(Lq12;)V

    return-void
.end method

.method public y(Lq71;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq71<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lq12;->q:Lq71;

    invoke-virtual {p1, p0}, Lq71;->f(Lg71;)V

    return-void
.end method
