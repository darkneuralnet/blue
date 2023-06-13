.class public abstract Lcom/github/mikephil/charting/charts/Chart;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lki0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lii0<",
        "+",
        "LoO1<",
        "+",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;>;>",
        "Landroid/view/ViewGroup;",
        "Lki0;"
    }
.end annotation


# instance fields
.field public A:F

.field public B:Z

.field public C:LRO1;

.field public D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public E:Z

.field public b:Z

.field public c:Lii0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z

.field public f:F

.field public g:LWY0;

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Paint;

.field public j:LtH6;

.field public k:Z

.field public l:Lx01;

.field public m:Lfq2;

.field public n:Lli0;

.field public o:Ljava/lang/String;

.field public p:Lhq2;

.field public q:LRS0;

.field public r:LuO1;

.field public s:LFs6;

.field public t:Lhi0;

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:Z

.field public z:[LOM1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->d:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->e:Z

    const v1, 0x3f666666    # 0.9f

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->f:F

    new-instance v1, LWY0;

    invoke-direct {v1, p1}, LWY0;-><init>(I)V

    iput-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    const-string v1, "No chart data available."

    iput-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    new-instance v1, LFs6;

    invoke-direct {v1}, LFs6;-><init>()V

    iput-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    const/4 v1, 0x0

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->u:F

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->v:F

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->w:F

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->x:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    iput v1, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->B:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->D:Ljava/util/ArrayList;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->E:Z

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->O()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->d:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->e:Z

    const v0, 0x3f666666    # 0.9f

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->f:F

    new-instance v0, LWY0;

    invoke-direct {v0, p1}, LWY0;-><init>(I)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    const-string v0, "No chart data available."

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    new-instance v0, LFs6;

    invoke-direct {v0}, LFs6;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    const/4 v0, 0x0

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->u:F

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->v:F

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->w:F

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->x:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->B:Z

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->D:Ljava/util/ArrayList;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->E:Z

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->O()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->d:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->e:Z

    const p3, 0x3f666666    # 0.9f

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->f:F

    new-instance p3, LWY0;

    invoke-direct {p3, p1}, LWY0;-><init>(I)V

    iput-object p3, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    const-string p3, "No chart data available."

    iput-object p3, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    new-instance p3, LFs6;

    invoke-direct {p3}, LFs6;-><init>()V

    iput-object p3, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    const/4 p3, 0x0

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->u:F

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->v:F

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->w:F

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->x:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    iput p3, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/Chart;->B:Z

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->D:Ljava/util/ArrayList;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->E:Z

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->O()V

    return-void
.end method


# virtual methods
.method public A()Lx01;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    return-object v0
.end method

.method public B()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->f:F

    return v0
.end method

.method public C()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->w:F

    return v0
.end method

.method public D()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->x:F

    return v0
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->v:F

    return v0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->u:F

    return v0
.end method

.method public G(FF)LOM1;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const-string p1, "MPAndroidChart"

    const-string p2, "Can\'t select by touch. No data set."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->H()LuO1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LuO1;->a(FF)LOM1;

    move-result-object p1

    return-object p1
.end method

.method public H()LuO1;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->r:LuO1;

    return-object v0
.end method

.method public I()Lfq2;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    return-object v0
.end method

.method public J(LOM1;)[F
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    invoke-virtual {p1}, LOM1;->e()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p1}, LOM1;->f()F

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public K()Lif3;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public L()LFs6;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    return-object v0
.end method

.method public M()LtH6;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    return-object v0
.end method

.method public N(LOM1;Z)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Highlighted: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LOM1;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MPAndroidChart"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v1, p1}, Lii0;->h(LOM1;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    if-nez v1, :cond_2

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [LOM1;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    :goto_0
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->U([LOM1;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public O()V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v0, Lhi0;

    new-instance v1, Lcom/github/mikephil/charting/charts/Chart$a;

    invoke-direct {v1, p0}, Lcom/github/mikephil/charting/charts/Chart$a;-><init>(Lcom/github/mikephil/charting/charts/Chart;)V

    invoke-direct {v0, v1}, Lhi0;-><init>(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LOi6;->v(Landroid/content/Context;)V

    const/high16 v0, 0x43fa0000    # 500.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    new-instance v0, Lx01;

    invoke-direct {v0}, Lx01;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    new-instance v0, Lfq2;

    invoke-direct {v0}, Lfq2;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    new-instance v1, Lhq2;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v1, v2, v0}, Lhq2;-><init>(LFs6;Lfq2;)V

    iput-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    new-instance v0, LtH6;

    invoke-direct {v0}, LtH6;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    const/16 v1, 0xbd

    const/16 v2, 0x33

    const/16 v3, 0xf7

    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v1}, LOi6;->e(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    const-string v1, "Chart.init()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->e:Z

    return v0
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->B:Z

    return v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->d:Z

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    return v0
.end method

.method public abstract T()V
.end method

.method public U([LOM1;)V
    .locals 1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    invoke-virtual {v0, p1}, Lli0;->d(LOM1;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lli0;->d(LOM1;)V

    :goto_1
    return-void
.end method

.method public V(FF)V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lii0;->g()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    :goto_1
    invoke-static {p1}, LOi6;->i(F)I

    move-result p1

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    invoke-virtual {p2, p1}, LWY0;->j(I)V

    return-void
.end method

.method public final W(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/github/mikephil/charting/charts/Chart;->W(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_2
    return-void
.end method

.method public X()Z
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    if-lez v2, :cond_1

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public getData()Lii0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    return-object v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->E:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p0}, Lcom/github/mikephil/charting/charts/Chart;->W(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->y()LPE2;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    iget v2, v0, LPE2;->c:F

    iget v0, v0, LPE2;->d:F

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void

    :cond_1
    iget-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->r()V

    iput-boolean v1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    :cond_2
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    const/high16 v0, 0x42480000    # 50.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 4

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    const-string v1, "MPAndroidChart"

    if-eqz v0, :cond_0

    const-string v0, "OnSizeChanged()"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v0, ", height: "

    if-lez p1, :cond_2

    if-lez p2, :cond_2

    const/16 v2, 0x2710

    if-ge p1, v2, :cond_2

    if-ge p2, v2, :cond_2

    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Setting chart dimens, width: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    int-to-float v1, p1

    int-to-float v2, p2

    invoke-virtual {v0, v1, v2}, LFs6;->L(FF)V

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "*Avoiding* setting chart dimens! width: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->T()V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    return-void
.end method

.method public abstract r()V
.end method

.method public s()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    invoke-virtual {v1, v0}, Lli0;->d(LOM1;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setData(Lii0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->y:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lii0;->p()F

    move-result v0

    invoke-virtual {p1}, Lii0;->n()F

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->V(FF)V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {p1}, Lii0;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoO1;

    invoke-interface {v0}, LoO1;->C0()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, LoO1;->b0()LJj6;

    move-result-object v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    if-ne v1, v2, :cond_1

    :cond_2
    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->g:LWY0;

    invoke-interface {v0, v1}, LoO1;->c0(LJj6;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->T()V

    iget-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz p1, :cond_4

    const-string p1, "MPAndroidChart"

    const-string v0, "Data is set."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-void
.end method

.method public setDescription(Lx01;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    return-void
.end method

.method public setDragDecelerationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->e:Z

    return-void
.end method

.method public setDragDecelerationFrictionCoef(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    const p1, 0x3f7fbe77    # 0.999f

    :cond_1
    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->f:F

    return-void
.end method

.method public setDrawMarkerViews(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setDrawMarkers(Z)V

    return-void
.end method

.method public setDrawMarkers(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->B:Z

    return-void
.end method

.method public setExtraBottomOffset(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->w:F

    return-void
.end method

.method public setExtraLeftOffset(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->x:F

    return-void
.end method

.method public setExtraOffsets(FFFF)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setExtraLeftOffset(F)V

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/charts/Chart;->setExtraTopOffset(F)V

    invoke-virtual {p0, p3}, Lcom/github/mikephil/charting/charts/Chart;->setExtraRightOffset(F)V

    invoke-virtual {p0, p4}, Lcom/github/mikephil/charting/charts/Chart;->setExtraBottomOffset(F)V

    return-void
.end method

.method public setExtraRightOffset(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->v:F

    return-void
.end method

.method public setExtraTopOffset(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->u:F

    return-void
.end method

.method public setHardwareAccelerationEnabled(Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public setHighlightPerTapEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->d:Z

    return-void
.end method

.method public setHighlighter(Lji0;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->r:LuO1;

    return-void
.end method

.method public setLogEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    return-void
.end method

.method public setMarker(LRO1;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    return-void
.end method

.method public setMarkerView(LRO1;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setMarker(LRO1;)V

    return-void
.end method

.method public setMaxHighlightDistance(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/Chart;->A:F

    return-void
.end method

.method public setNoDataText(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->o:Ljava/lang/String;

    return-void
.end method

.method public setNoDataTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setNoDataTextTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public setOnChartGestureListener(Lif3;)V
    .locals 0

    return-void
.end method

.method public setOnChartValueSelectedListener(Ljf3;)V
    .locals 0

    return-void
.end method

.method public setOnTouchListener(Lli0;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    return-void
.end method

.method public setPaint(Landroid/graphics/Paint;I)V
    .locals 1

    const/4 v0, 0x7

    if-eq p2, v0, :cond_1

    const/16 v0, 0xb

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    goto :goto_0

    :cond_1
    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->i:Landroid/graphics/Paint;

    :goto_0
    return-void
.end method

.method public setRenderer(LRS0;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    :cond_0
    return-void
.end method

.method public setTouchEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    return-void
.end method

.method public setUnbindEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->E:Z

    return-void
.end method

.method public t()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public u(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v0}, Lx01;->i()LPE2;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, LNs0;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, LNs0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, Lx01;->k()Landroid/graphics/Paint$Align;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->H()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v1}, LNs0;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->F()F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    iget v1, v0, LPE2;->c:F

    iget v0, v0, LPE2;->d:F

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->l:Lx01;

    invoke-virtual {v2}, Lx01;->j()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public v(Landroid/graphics/Canvas;)V
    .locals 9

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->Q()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->X()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    array-length v3, v2

    if-ge v1, v3, :cond_4

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v2}, LOM1;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Lii0;->d(I)LoO1;

    move-result-object v3

    iget-object v4, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    aget-object v5, v5, v1

    invoke-virtual {v4, v5}, Lii0;->h(LOM1;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    invoke-interface {v3, v4}, LoO1;->b(Lcom/github/mikephil/charting/data/Entry;)I

    move-result v5

    if-eqz v4, :cond_3

    int-to-float v5, v5

    invoke-interface {v3}, LoO1;->L0()I

    move-result v3

    int-to-float v3, v3

    iget-object v6, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    invoke-virtual {v6}, Lhi0;->a()F

    move-result v6

    mul-float/2addr v3, v6

    cmpl-float v3, v5, v3

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2}, Lcom/github/mikephil/charting/charts/Chart;->J(LOM1;)[F

    move-result-object v3

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    aget v6, v3, v0

    const/4 v7, 0x1

    aget v8, v3, v7

    invoke-virtual {v5, v6, v8}, LFs6;->x(FF)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    invoke-interface {v5, v4, v2}, LRO1;->b(Lcom/github/mikephil/charting/data/Entry;LOM1;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    aget v4, v3, v0

    aget v3, v3, v7

    invoke-interface {v2, p1, v4, v3}, LRO1;->a(Landroid/graphics/Canvas;FF)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public w()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public x()Lhi0;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    return-object v0
.end method

.method public y()LPE2;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    invoke-static {v0, v2}, LPE2;->c(FF)LPE2;

    move-result-object v0

    return-object v0
.end method

.method public z()LPE2;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->n()LPE2;

    move-result-object v0

    return-object v0
.end method
