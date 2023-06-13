.class public final Ld21;
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


# static fields
.field public static final v:Lru1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lru1<",
            "Ld21;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public q:Lq71;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq71<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final r:LgO5;

.field public final s:LeO5;

.field public t:F

.field public u:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld21$a;

    const-string v1, "indicatorLevel"

    invoke-direct {v0, v1}, Ld21$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld21;->v:Lru1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LyC;Lq71;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LyC;",
            "Lq71<",
            "TS;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lg71;-><init>(Landroid/content/Context;LyC;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld21;->u:Z

    invoke-virtual {p0, p3}, Ld21;->z(Lq71;)V

    new-instance p1, LgO5;

    invoke-direct {p1}, LgO5;-><init>()V

    iput-object p1, p0, Ld21;->r:LgO5;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, LgO5;->d(F)LgO5;

    const/high16 p3, 0x42480000    # 50.0f

    invoke-virtual {p1, p3}, LgO5;->f(F)LgO5;

    new-instance p3, LeO5;

    sget-object v0, Ld21;->v:Lru1;

    invoke-direct {p3, p0, v0}, LeO5;-><init>(Ljava/lang/Object;Lru1;)V

    iput-object p3, p0, Ld21;->s:LeO5;

    invoke-virtual {p3, p1}, LeO5;->p(LgO5;)LeO5;

    invoke-virtual {p0, p2}, Lg71;->n(F)V

    return-void
.end method

.method public static synthetic t(Ld21;)F
    .locals 0

    invoke-virtual {p0}, Ld21;->y()F

    move-result p0

    return p0
.end method

.method public static synthetic u(Ld21;F)V
    .locals 0

    invoke-virtual {p0, p1}, Ld21;->A(F)V

    return-void
.end method

.method public static v(Landroid/content/Context;Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)Ld21;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ")",
            "Ld21<",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld21;

    new-instance v1, LBj0;

    invoke-direct {v1, p1}, LBj0;-><init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V

    invoke-direct {v0, p0, p1, v1}, Ld21;-><init>(Landroid/content/Context;LyC;Lq71;)V

    return-object v0
.end method

.method public static w(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)Ld21;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ")",
            "Ld21<",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld21;

    new-instance v1, LFr2;

    invoke-direct {v1, p1}, LFr2;-><init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V

    invoke-direct {v0, p0, p1, v1}, Ld21;-><init>(Landroid/content/Context;LyC;Lq71;)V

    return-object v0
.end method


# virtual methods
.method public final A(F)V
    .locals 0

    iput p1, p0, Ld21;->t:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public B(F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Ld21;->q:Lq71;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p0}, Lg71;->h()F

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lq71;->g(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V

    iget-object v0, p0, Ld21;->q:Lq71;

    iget-object v1, p0, Lg71;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1}, Lq71;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lg71;->c:LyC;

    iget-object v0, v0, LyC;->c:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-virtual {p0}, Ld21;->getAlpha()I

    move-result v1

    invoke-static {v0, v1}, LHM2;->a(II)I

    move-result v7

    iget-object v2, p0, Ld21;->q:Lq71;

    iget-object v4, p0, Lg71;->n:Landroid/graphics/Paint;

    const/4 v5, 0x0

    invoke-virtual {p0}, Ld21;->y()F

    move-result v6

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lq71;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_1
    :goto_0
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

    iget-object v0, p0, Ld21;->q:Lq71;

    invoke-virtual {v0}, Lq71;->d()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Ld21;->q:Lq71;

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

.method public jumpToCurrentState()V
    .locals 2

    iget-object v0, p0, Ld21;->s:LeO5;

    invoke-virtual {v0}, LeO5;->q()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Ld21;->A(F)V

    return-void
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

.method public onLevelChange(I)Z
    .locals 3

    iget-boolean v0, p0, Ld21;->u:Z

    const v1, 0x461c4000    # 10000.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld21;->s:LeO5;

    invoke-virtual {v0}, LeO5;->q()V

    int-to-float p1, p1

    div-float/2addr p1, v1

    invoke-virtual {p0, p1}, Ld21;->A(F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld21;->s:LeO5;

    invoke-virtual {p0}, Ld21;->y()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {v0, v2}, Lp81;->h(F)Lp81;

    iget-object v0, p0, Ld21;->s:LeO5;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, LeO5;->l(F)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic q(ZZZ)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lg71;->q(ZZZ)Z

    move-result p1

    return p1
.end method

.method public r(ZZZ)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lg71;->r(ZZZ)Z

    move-result p1

    iget-object p2, p0, Lg71;->d:Lyf;

    iget-object p3, p0, Lg71;->b:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p2, p3}, Lyf;->a(Landroid/content/ContentResolver;)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Ld21;->u:Z

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Ld21;->u:Z

    iget-object p3, p0, Ld21;->r:LgO5;

    const/high16 v0, 0x42480000    # 50.0f

    div-float/2addr v0, p2

    invoke-virtual {p3, v0}, LgO5;->f(F)LgO5;

    :goto_0
    return p1
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

.method public x()Lq71;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq71<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Ld21;->q:Lq71;

    return-object v0
.end method

.method public final y()F
    .locals 1

    iget v0, p0, Ld21;->t:F

    return v0
.end method

.method public z(Lq71;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq71<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ld21;->q:Lq71;

    invoke-virtual {p1, p0}, Lq71;->f(Lg71;)V

    return-void
.end method
