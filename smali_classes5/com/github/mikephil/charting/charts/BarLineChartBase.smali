.class public abstract Lcom/github/mikephil/charting/charts/BarLineChartBase;
.super Lcom/github/mikephil/charting/charts/Chart;
.source "SourceFile"

# interfaces
.implements Lyx;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RtlHardcoded"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lxx<",
        "+",
        "LYN1<",
        "+",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;>;>",
        "Lcom/github/mikephil/charting/charts/Chart<",
        "TT;>;",
        "Lyx;"
    }
.end annotation


# instance fields
.field public A0:J

.field public B0:Landroid/graphics/RectF;

.field public C0:Landroid/graphics/Matrix;

.field public D0:Landroid/graphics/Matrix;

.field public E0:Z

.field public F:I

.field public F0:[F

.field public G:Z

.field public G0:LOE2;

.field public H:Z

.field public H0:LOE2;

.field public I:Z

.field public I0:[F

.field public J:Z

.field public K:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Landroid/graphics/Paint;

.field public T:Landroid/graphics/Paint;

.field public U:Z

.field public W:Z

.field public p0:Z

.field public q0:F

.field public r0:Z

.field public s0:LaI6;

.field public t0:LaI6;

.field public u0:LbI6;

.field public v0:LbI6;

.field public w0:LD96;

.field public x0:LD96;

.field public y0:LuH6;

.field public z0:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x64

    iput p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->J:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->U:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->W:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0:Z

    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->z0:J

    iput-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->B0:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->C0:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->D0:Landroid/graphics/Matrix;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->E0:Z

    const/4 p1, 0x2

    new-array v0, p1, [F

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F0:[F

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v0, v1}, LOE2;->b(DD)LOE2;

    move-result-object v2

    iput-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    invoke-static {v0, v1, v0, v1}, LOE2;->b(DD)LOE2;

    move-result-object v0

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x64

    iput p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->J:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->U:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->W:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0:Z

    const/high16 p2, 0x41700000    # 15.0f

    iput p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->z0:J

    iput-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->B0:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/Matrix;

    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->C0:Landroid/graphics/Matrix;

    new-instance p2, Landroid/graphics/Matrix;

    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->D0:Landroid/graphics/Matrix;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->E0:Z

    const/4 p1, 0x2

    new-array p2, p1, [F

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F0:[F

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v0, v1}, LOE2;->b(DD)LOE2;

    move-result-object p2

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    invoke-static {v0, v1, v0, v1}, LOE2;->b(DD)LOE2;

    move-result-object p2

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x64

    iput p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->J:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->U:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->W:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0:Z

    const/high16 p2, 0x41700000    # 15.0f

    iput p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->z0:J

    iput-wide p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->B0:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/Matrix;

    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->C0:Landroid/graphics/Matrix;

    new-instance p2, Landroid/graphics/Matrix;

    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->D0:Landroid/graphics/Matrix;

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->E0:Z

    const/4 p1, 0x2

    new-array p2, p1, [F

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F0:[F

    const-wide/16 p2, 0x0

    invoke-static {p2, p3, p2, p3}, LOE2;->b(DD)LOE2;

    move-result-object v0

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    invoke-static {p2, p3, p2, p3}, LOE2;->b(DD)LOE2;

    move-result-object p2

    iput-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    return-void
.end method


# virtual methods
.method public O()V
    .locals 4

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/Chart;->O()V

    new-instance v0, LaI6;

    sget-object v1, LaI6$a;->b:LaI6$a;

    invoke-direct {v0, v1}, LaI6;-><init>(LaI6$a;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    new-instance v0, LaI6;

    sget-object v1, LaI6$a;->c:LaI6$a;

    invoke-direct {v0, v1}, LaI6;-><init>(LaI6$a;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    new-instance v0, LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, v1}, LD96;-><init>(LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    new-instance v0, LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, v1}, LD96;-><init>(LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    new-instance v0, LbI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    invoke-direct {v0, v1, v2, v3}, LbI6;-><init>(LFs6;LaI6;LD96;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    new-instance v0, LbI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    invoke-direct {v0, v1, v2, v3}, LbI6;-><init>(LFs6;LaI6;LD96;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    new-instance v0, LuH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    invoke-direct {v0, v1, v2, v3}, LuH6;-><init>(LFs6;LtH6;LD96;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    new-instance v0, Lji0;

    invoke-direct {v0, p0}, Lji0;-><init>(Lyx;)V

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/Chart;->setHighlighter(Lji0;)V

    new-instance v0, Lwx;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->p()Landroid/graphics/Matrix;

    move-result-object v1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-direct {v0, p0, v1, v2}, Lwx;-><init>(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/graphics/Matrix;F)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->S:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->S:Landroid/graphics/Paint;

    const/16 v1, 0xf0

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, LOi6;->e(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public T()V
    .locals 4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    const-string v1, "MPAndroidChart"

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "Preparing... DATA NOT SET."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v0, :cond_2

    const-string v0, "Preparing..."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LRS0;->f()V

    :cond_3
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Z()V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v2, v1, LXu;->H:F

    iget v3, v1, LXu;->G:F

    invoke-virtual {v1}, LaI6;->c0()Z

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, LYu;->a(FFZ)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v2, v1, LXu;->H:F

    iget v3, v1, LXu;->G:F

    invoke-virtual {v1}, LaI6;->c0()Z

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, LYu;->a(FFZ)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->G:F

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, LuH6;->a(FFZ)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v0, v1}, Lhq2;->a(Lii0;)V

    :cond_4
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r()V

    return-void
.end method

.method public Y()V
    .locals 4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->c()F

    move-result v0

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->o()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lxx;

    invoke-virtual {v2, v0, v1}, Lii0;->c(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    invoke-virtual {v1}, Lii0;->m()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lxx;

    invoke-virtual {v2}, Lii0;->l()F

    move-result v2

    invoke-virtual {v0, v1, v2}, LXu;->j(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    sget-object v2, LaI6$a;->b:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lxx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    sget-object v2, LaI6$a;->c:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lxx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r()V

    return-void
.end method

.method public Z()V
    .locals 4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    invoke-virtual {v1}, Lii0;->m()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lxx;

    invoke-virtual {v2}, Lii0;->l()F

    move-result v2

    invoke-virtual {v0, v1, v2}, LXu;->j(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    sget-object v2, LaI6$a;->b:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lxx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lxx;

    sget-object v2, LaI6$a;->c:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lxx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    return-void
.end method

.method public a0(Landroid/graphics/RectF;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/RectF;->left:F

    iput v0, p1, Landroid/graphics/RectF;->right:F

    iput v0, p1, Landroid/graphics/RectF;->top:F

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v0}, Lfq2;->D()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/github/mikephil/charting/charts/BarLineChartBase$b;->c:[I

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v1}, Lfq2;->y()Lfq2$e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/github/mikephil/charting/charts/BarLineChartBase$b;->a:[I

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->A()Lfq2$f;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    goto/16 :goto_0

    :cond_2
    iget v0, p1, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->top:F

    goto/16 :goto_0

    :cond_3
    sget-object v0, Lcom/github/mikephil/charting/charts/BarLineChartBase$b;->b:[I

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->u()Lfq2$d;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v2, :cond_8

    if-eq v0, v1, :cond_7

    const/4 v3, 0x3

    if-eq v0, v3, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object v0, Lcom/github/mikephil/charting/charts/BarLineChartBase$b;->a:[I

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->A()Lfq2$f;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v2, :cond_6

    if-eq v0, v1, :cond_5

    goto/16 :goto_0

    :cond_5
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    goto :goto_0

    :cond_6
    iget v0, p1, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->top:F

    goto :goto_0

    :cond_7
    iget v0, p1, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->x:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->m()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->d()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->right:F

    goto :goto_0

    :cond_8
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v1, v1, Lfq2;->x:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->m()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, LNs0;->d()F

    move-result v2

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->left:F

    :cond_9
    :goto_0
    return-void
.end method

.method public b0(Landroid/graphics/Canvas;)V
    .locals 2

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->U:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->S:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_0
    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->W:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public c()F
    .locals 4

    sget-object v0, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->h()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->f()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    invoke-virtual {v0, v1, v2, v3}, LD96;->h(FFLOE2;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->H:F

    float-to-double v0, v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    iget-wide v2, v2, LOE2;->c:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public c0(LaI6$a;)LaI6;
    .locals 1

    sget-object v0, LaI6$a;->b:LaI6$a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    return-object p1
.end method

.method public computeScroll()V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    instance-of v1, v0, Lwx;

    if-eqz v1, :cond_0

    check-cast v0, Lwx;

    invoke-virtual {v0}, Lwx;->f()V

    :cond_0
    return-void
.end method

.method public d(LaI6$a;)LD96;
    .locals 1

    sget-object v0, LaI6$a;->b:LaI6$a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    return-object p1
.end method

.method public d0()LaI6;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    return-object v0
.end method

.method public e0(LaI6$a;)F
    .locals 1

    sget-object v0, LaI6$a;->b:LaI6$a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget p1, p1, LXu;->I:F

    return p1

    :cond_0
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget p1, p1, LXu;->I:F

    return p1
.end method

.method public f0()LaI6;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    return-object v0
.end method

.method public g()F
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v0, v0, LXu;->H:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v1, v1, LXu;->H:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public g0(FF)LYN1;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/github/mikephil/charting/charts/Chart;->G(FF)LOM1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast p2, Lxx;

    invoke-virtual {p1}, LOM1;->d()I

    move-result p1

    invoke-virtual {p2, p1}, Lii0;->d(I)LoO1;

    move-result-object p1

    check-cast p1, LYN1;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getData()Lxx;
    .locals 1

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, Lxx;

    return-object v0
.end method

.method public getScaleX()F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    :cond_0
    invoke-virtual {v0}, LFs6;->q()F

    move-result v0

    return v0
.end method

.method public getScaleY()F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    :cond_0
    invoke-virtual {v0}, LFs6;->r()F

    move-result v0

    return v0
.end method

.method public h()F
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v0, v0, LXu;->G:F

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v1, v1, LXu;->G:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->t()Z

    move-result v0

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F:I

    return v0
.end method

.method public i0()Z
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v0}, LaI6;->c0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v0}, LaI6;->c0()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public j0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0:Z

    return v0
.end method

.method public k0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I:Z

    return v0
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    return v0
.end method

.method public n0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    return v0
.end method

.method public o()F
    .locals 4

    sget-object v0, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->i()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->f()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    invoke-virtual {v0, v1, v2, v3}, LD96;->h(FFLOE2;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->G:F

    float-to-double v0, v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    iget-wide v2, v2, LOE2;->c:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public o0()Z
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->u()Z

    move-result v0

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-super {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->b0(Landroid/graphics/Canvas;)V

    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Y()V

    :cond_1
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v4, v3, LXu;->H:F

    iget v5, v3, LXu;->G:F

    invoke-virtual {v3}, LaI6;->c0()Z

    move-result v3

    invoke-virtual {v2, v4, v5, v3}, LYu;->a(FFZ)V

    :cond_2
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v4, v3, LXu;->H:F

    iget v5, v3, LXu;->G:F

    invoke-virtual {v3}, LaI6;->c0()Z

    move-result v3

    invoke-virtual {v2, v4, v5, v3}, LYu;->a(FFZ)V

    :cond_3
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v4, v3, LXu;->H:F

    iget v3, v3, LXu;->G:F

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v3, v5}, LuH6;->a(FFZ)V

    :cond_4
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v2, p1}, LuH6;->j(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->j(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->j(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LXu;->y()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v2, p1}, LuH6;->k(Landroid/graphics/Canvas;)V

    :cond_5
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LXu;->y()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->k(Landroid/graphics/Canvas;)V

    :cond_6
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LXu;->y()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->k(Landroid/graphics/Canvas;)V

    :cond_7
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v2, p1}, LuH6;->n(Landroid/graphics/Canvas;)V

    :cond_8
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->l(Landroid/graphics/Canvas;)V

    :cond_9
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->l(Landroid/graphics/Canvas;)V

    :cond_a
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v3}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v3, p1}, LRS0;->b(Landroid/graphics/Canvas;)V

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v3}, LXu;->y()Z

    move-result v3

    if-nez v3, :cond_b

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v3, p1}, LuH6;->k(Landroid/graphics/Canvas;)V

    :cond_b
    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v3}, LXu;->y()Z

    move-result v3

    if-nez v3, :cond_c

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v3, p1}, LbI6;->k(Landroid/graphics/Canvas;)V

    :cond_c
    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v3}, LXu;->y()Z

    move-result v3

    if-nez v3, :cond_d

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v3, p1}, LbI6;->k(Landroid/graphics/Canvas;)V

    :cond_d
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->X()Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    iget-object v4, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    invoke-virtual {v3, p1, v4}, LRS0;->d(Landroid/graphics/Canvas;[LOM1;)V

    :cond_e
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v2, p1}, LRS0;->c(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-nez v2, :cond_f

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v2, p1}, LuH6;->n(Landroid/graphics/Canvas;)V

    :cond_f
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-nez v2, :cond_10

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->l(Landroid/graphics/Canvas;)V

    :cond_10
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LXu;->B()Z

    move-result v2

    if-nez v2, :cond_11

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->l(Landroid/graphics/Canvas;)V

    :cond_11
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    invoke-virtual {v2, p1}, LuH6;->i(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->i(Landroid/graphics/Canvas;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v2, p1}, LbI6;->i(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->j0()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v3}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v3, p1}, LRS0;->e(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_0

    :cond_12
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v2, p1}, LRS0;->e(Landroid/graphics/Canvas;)V

    :goto_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    invoke-virtual {v2, p1}, Lhq2;->e(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->u(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->v(Landroid/graphics/Canvas;)V

    iget-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz p1, :cond_13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iget-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->z0:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->z0:J

    iget-wide v4, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    div-long/2addr v0, v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Drawtime: "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ms, average: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms, cycles: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->A0:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MPAndroidChart"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    const/4 v3, 0x0

    aput v2, v0, v3

    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->h()F

    move-result v2

    aput v2, v0, v3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->j()F

    move-result v2

    aput v2, v0, v1

    sget-object v0, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    invoke-virtual {v0, v2}, LD96;->j([F)V

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/github/mikephil/charting/charts/Chart;->onSizeChanged(IIII)V

    iget-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    if-eqz p1, :cond_1

    sget-object p1, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object p1

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    invoke-virtual {p1, p2}, LD96;->k([F)V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I0:[F

    invoke-virtual {p1, p2, p0}, LFs6;->e([FLandroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1}, LFs6;->p()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p1, p2, p0, v1}, LFs6;->J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public p(LaI6$a;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->c0(LaI6$a;)LaI6;

    move-result-object p1

    invoke-virtual {p1}, LaI6;->c0()Z

    move-result p1

    return p1
.end method

.method public p0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->J:Z

    return v0
.end method

.method public q0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H:Z

    return v0
.end method

.method public r()V
    .locals 9

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->E0:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->B0:Landroid/graphics/RectF;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->a0(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->B0:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v2

    iget v4, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v4, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LaI6;->d0()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v5}, LYu;->c()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v2, v5}, LaI6;->U(Landroid/graphics/Paint;)F

    move-result v2

    add-float/2addr v1, v2

    :cond_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LaI6;->d0()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v5}, LYu;->c()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v2, v5}, LaI6;->U(Landroid/graphics/Paint;)F

    move-result v2

    add-float/2addr v4, v2

    :cond_1
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LXu;->A()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v5, v2, LtH6;->M:I

    int-to-float v5, v5

    invoke-virtual {v2}, LNs0;->e()F

    move-result v2

    add-float/2addr v5, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->c:LtH6$a;

    if-ne v2, v6, :cond_2

    add-float/2addr v0, v5

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->b:LtH6$a;

    if-ne v2, v6, :cond_3

    :goto_0
    add-float/2addr v3, v5

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->d:LtH6$a;

    if-ne v2, v6, :cond_4

    add-float/2addr v0, v5

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->F()F

    move-result v2

    add-float/2addr v3, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->E()F

    move-result v2

    add-float/2addr v4, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->C()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->D()F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    invoke-static {v2}, LOi6;->e(F)F

    move-result v2

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-virtual {v5, v6, v7, v8, v2}, LFs6;->K(FFFF)V

    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "offsetLeft: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetTop: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetRight: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetBottom: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MPAndroidChart"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0()V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0()V

    return-void
.end method

.method public r0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    return v0
.end method

.method public s0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    return v0
.end method

.method public setAutoScaleMinMaxEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G:Z

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->T:Landroid/graphics/Paint;

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setClipValuesToContent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0:Z

    return-void
.end method

.method public setDoubleTapToZoomEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->I:Z

    return-void
.end method

.method public setDragEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    return-void
.end method

.method public setDragOffsetX(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0, p1}, LFs6;->M(F)V

    return-void
.end method

.method public setDragOffsetY(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0, p1}, LFs6;->N(F)V

    return-void
.end method

.method public setDragXEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->K:Z

    return-void
.end method

.method public setDragYEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->P:Z

    return-void
.end method

.method public setDrawBorders(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->W:Z

    return-void
.end method

.method public setDrawGridBackground(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->U:Z

    return-void
.end method

.method public setGridBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->S:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setHighlightPerDragEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->J:Z

    return-void
.end method

.method public setKeepPositionOnRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0:Z

    return-void
.end method

.method public setMaxVisibleValueCount(I)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->F:I

    return-void
.end method

.method public setMinOffset(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    return-void
.end method

.method public setOnDrawListener(LNg3;)V
    .locals 0

    return-void
.end method

.method public setPaint(Landroid/graphics/Paint;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/github/mikephil/charting/charts/Chart;->setPaint(Landroid/graphics/Paint;I)V

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->S:Landroid/graphics/Paint;

    :goto_0
    return-void
.end method

.method public setPinchZoom(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H:Z

    return-void
.end method

.method public setRendererLeftYAxis(LbI6;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    return-void
.end method

.method public setRendererRightYAxis(LbI6;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    return-void
.end method

.method public setScaleEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    return-void
.end method

.method public setScaleMinima(FF)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0, p1}, LFs6;->S(F)V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, p2}, LFs6;->T(F)V

    return-void
.end method

.method public setScaleXEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->Q:Z

    return-void
.end method

.method public setScaleYEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->R:Z

    return-void
.end method

.method public setViewPortOffsets(FFFF)V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->E0:Z

    new-instance v0, Lcom/github/mikephil/charting/charts/BarLineChartBase$a;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/github/mikephil/charting/charts/BarLineChartBase$a;-><init>(Lcom/github/mikephil/charting/charts/BarLineChartBase;FFFF)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setVisibleXRange(FF)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float p1, v0, p1

    div-float/2addr v0, p2

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p2, p1, v0}, LFs6;->Q(FF)V

    return-void
.end method

.method public setVisibleXRangeMaximum(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float/2addr v0, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, v0}, LFs6;->S(F)V

    return-void
.end method

.method public setVisibleXRangeMinimum(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float/2addr v0, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, v0}, LFs6;->O(F)V

    return-void
.end method

.method public setVisibleYRange(FFLaI6$a;)V
    .locals 1

    invoke-virtual {p0, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result v0

    div-float/2addr v0, p1

    invoke-virtual {p0, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p1

    div-float/2addr p1, p2

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p2, v0, p1}, LFs6;->R(FF)V

    return-void
.end method

.method public setVisibleYRangeMaximum(FLaI6$a;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p2

    div-float/2addr p2, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, p2}, LFs6;->T(F)V

    return-void
.end method

.method public setVisibleYRangeMinimum(FLaI6$a;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p2

    div-float/2addr p2, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, p2}, LFs6;->P(F)V

    return-void
.end method

.method public setXAxisRenderer(LuH6;)V
    .locals 0

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    return-void
.end method

.method public t0()V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v1}, LaI6;->c0()Z

    move-result v1

    invoke-virtual {v0, v1}, LD96;->l(Z)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v1}, LaI6;->c0()Z

    move-result v1

    invoke-virtual {v0, v1}, LD96;->l(Z)V

    return-void
.end method

.method public u0()V
    .locals 5

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preparing Value-Px Matrix, xmin: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v1, v1, LXu;->H:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", xmax: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v1, v1, LXu;->G:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", xdelta: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v1, v1, LXu;->I:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MPAndroidChart"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->I:F

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v4, v3, LXu;->I:F

    iget v3, v3, LXu;->H:F

    invoke-virtual {v0, v2, v1, v4, v3}, LD96;->m(FFFF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->I:F

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v4, v3, LXu;->I:F

    iget v3, v3, LXu;->H:F

    invoke-virtual {v0, v2, v1, v4, v3}, LD96;->m(FFFF)V

    return-void
.end method

.method public v0(FFFF)V
    .locals 6

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    neg-float v4, p4

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->C0:Landroid/graphics/Matrix;

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, LFs6;->U(FFFFLandroid/graphics/Matrix;)V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->C0:Landroid/graphics/Matrix;

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, LFs6;->J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r()V

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
