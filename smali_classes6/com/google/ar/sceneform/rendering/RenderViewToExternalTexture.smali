.class public Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:LQi1;

.field public final d:Landroid/graphics/Picture;

.field public e:Z

.field public f:LFp6;

.field public final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a(Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public b(LFp6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->f:LFp6;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot use the same ViewRenderable with multiple SceneViews."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->f:LFp6;

    invoke-virtual {p1, p0}, LFp6;->b(Landroid/view/View;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->f:LFp6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LFp6;->h(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->f:LFp6;

    :cond_0
    return-void
.end method

.method public d()LQi1;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->c:LQi1;

    return-object v0
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->c:LQi1;

    invoke-virtual {p1}, LQi1;->c()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isDirty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->d:Landroid/graphics/Picture;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-super {p0, v0}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->d:Landroid/graphics/Picture;

    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->d:Landroid/graphics/Picture;

    invoke-virtual {v1, v0}, Landroid/graphics/Picture;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->e:Z

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->e:Z

    return v0
.end method

.method public f()Z
    .locals 4

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->c:LQi1;

    invoke-virtual {v0}, LQi1;->a()Lcom/google/android/filament/Stream;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Stream;->getTimestamp()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->c:LQi1;

    invoke-virtual {p1}, LQi1;->d()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object p2, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p2

    iget-object p3, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    iget-object p3, p0, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->g:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;

    invoke-interface {p4, p1, p2}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;->a(II)V

    goto :goto_0

    :cond_0
    return-void
.end method
