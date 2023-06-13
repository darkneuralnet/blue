.class public Lcom/github/mikephil/charting/components/MarkerView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements LRO1;


# instance fields
.field public b:LPE2;

.field public c:LPE2;

.field public d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/github/mikephil/charting/charts/Chart;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a(Landroid/graphics/Canvas;FF)V
    .locals 3

    invoke-virtual {p0, p2, p3}, Lcom/github/mikephil/charting/components/MarkerView;->e(FF)LPE2;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    iget v2, v0, LPE2;->c:F

    add-float/2addr p2, v2

    iget v0, v0, LPE2;->d:F

    add-float/2addr p3, v0

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public b(Lcom/github/mikephil/charting/data/Entry;LOM1;)V
    .locals 1

    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, p2, v0}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, p1, p1, p2, v0}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public c()Lcom/github/mikephil/charting/charts/Chart;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/components/MarkerView;->d:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/Chart;

    :goto_0
    return-object v0
.end method

.method public d()LPE2;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/components/MarkerView;->b:LPE2;

    return-object v0
.end method

.method public e(FF)LPE2;
    .locals 7

    invoke-virtual {p0}, Lcom/github/mikephil/charting/components/MarkerView;->d()LPE2;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    iget v2, v0, LPE2;->c:F

    iput v2, v1, LPE2;->c:F

    iget v0, v0, LPE2;->d:F

    iput v0, v1, LPE2;->d:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/components/MarkerView;->c()Lcom/github/mikephil/charting/charts/Chart;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    iget v4, v3, LPE2;->c:F

    add-float v5, p1, v4

    const/4 v6, 0x0

    cmpg-float v5, v5, v6

    if-gez v5, :cond_0

    neg-float p1, p1

    iput p1, v3, LPE2;->c:F

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    add-float v3, p1, v1

    add-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    iget-object v3, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, p1

    sub-float/2addr v4, v1

    iput v4, v3, LPE2;->c:F

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    iget v1, p1, LPE2;->d:F

    add-float v3, p2, v1

    cmpg-float v3, v3, v6

    if-gez v3, :cond_2

    neg-float p2, p2

    iput p2, p1, LPE2;->d:F

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    add-float p1, p2, v2

    add-float/2addr p1, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_3

    iget-object p1, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, p2

    sub-float/2addr v0, v2

    iput v0, p1, LPE2;->d:F

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/github/mikephil/charting/components/MarkerView;->c:LPE2;

    return-object p1
.end method

.method public setChartView(Lcom/github/mikephil/charting/charts/Chart;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/components/MarkerView;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setOffset(FF)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/components/MarkerView;->b:LPE2;

    iput p1, v0, LPE2;->c:F

    iput p2, v0, LPE2;->d:F

    return-void
.end method

.method public setOffset(LPE2;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/components/MarkerView;->b:LPE2;

    if-nez p1, :cond_0

    new-instance p1, LPE2;

    invoke-direct {p1}, LPE2;-><init>()V

    iput-object p1, p0, Lcom/github/mikephil/charting/components/MarkerView;->b:LPE2;

    :cond_0
    return-void
.end method
