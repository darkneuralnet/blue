.class public LyX1;
.super LqB;
.source "SourceFile"


# instance fields
.field public final D:Landroid/graphics/Paint;

.field public final E:Landroid/graphics/Rect;

.field public final F:Landroid/graphics/Rect;

.field public final G:LUD2;

.field public H:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public I:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRD2;Lfm2;)V
    .locals 2

    invoke-direct {p0, p1, p2}, LqB;-><init>(LRD2;Lfm2;)V

    new-instance v0, LPl2;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LPl2;-><init>(I)V

    iput-object v0, p0, LyX1;->D:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LyX1;->E:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LyX1;->F:Landroid/graphics/Rect;

    invoke-virtual {p2}, Lfm2;->m()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LRD2;->O(Ljava/lang/String;)LUD2;

    move-result-object p1

    iput-object p1, p0, LyX1;->G:LUD2;

    return-void
.end method


# virtual methods
.method public final O()Landroid/graphics/Bitmap;
    .locals 2

    iget-object v0, p0, LyX1;->I:LoB;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->m()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LqB;->p:LRD2;

    invoke-virtual {v1, v0}, LRD2;->H(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LyX1;->G:LUD2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LUD2;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, LyX1;->G:LUD2;

    if-eqz p2, :cond_0

    invoke-static {}, LGi6;->e()F

    move-result p2

    iget-object p3, p0, LyX1;->G:LUD2;

    invoke-virtual {p3}, LUD2;->e()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, p2

    iget-object v0, p0, LyX1;->G:LUD2;

    invoke-virtual {v0}, LUD2;->c()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, LqB;->o:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LqB;->h(Ljava/lang/Object;LgE2;)V

    sget-object v0, LaE2;->K:Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iput-object v1, p0, LyX1;->H:LoB;

    goto :goto_0

    :cond_0
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LyX1;->H:LoB;

    goto :goto_0

    :cond_1
    sget-object v0, LaE2;->N:Landroid/graphics/Bitmap;

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_2

    iput-object v1, p0, LyX1;->I:LoB;

    goto :goto_0

    :cond_2
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LyX1;->I:LoB;

    :cond_3
    :goto_0
    return-void
.end method

.method public t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 4

    invoke-virtual {p0}, LyX1;->O()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LyX1;->G:LUD2;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, LGi6;->e()F

    move-result v1

    iget-object v2, p0, LyX1;->D:Landroid/graphics/Paint;

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p3, p0, LyX1;->H:LoB;

    if-eqz p3, :cond_1

    iget-object v2, p0, LyX1;->D:Landroid/graphics/Paint;

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorFilter;

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LyX1;->E:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v3, p3, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p2, p0, LqB;->p:LRD2;

    invoke-virtual {p2}, LRD2;->P()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LyX1;->F:Landroid/graphics/Rect;

    iget-object p3, p0, LyX1;->G:LUD2;

    invoke-virtual {p3}, LUD2;->e()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, v1

    float-to-int p3, p3

    iget-object v2, p0, LyX1;->G:LUD2;

    invoke-virtual {v2}, LUD2;->c()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    float-to-int v1, v2

    invoke-virtual {p2, v3, v3, p3, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, LyX1;->F:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, v1

    float-to-int p3, p3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    float-to-int v1, v2

    invoke-virtual {p2, v3, v3, p3, v1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object p2, p0, LyX1;->E:Landroid/graphics/Rect;

    iget-object p3, p0, LyX1;->F:Landroid/graphics/Rect;

    iget-object v1, p0, LyX1;->D:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_3
    :goto_1
    return-void
.end method
