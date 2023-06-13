.class public LSm0;
.super LRS0;
.source "SourceFile"


# instance fields
.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LRS0;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/github/mikephil/charting/charts/Chart;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p2, p3}, LRS0;-><init>(Lhi0;LFs6;)V

    new-instance p2, Ljava/util/ArrayList;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, LSm0;->g:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LSm0;->i:Ljava/util/List;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LSm0;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, LSm0;->h()V

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRS0;

    invoke-virtual {v1, p1}, LRS0;->b(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRS0;

    invoke-virtual {v1, p1}, LRS0;->c(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[LOM1;)V
    .locals 9

    iget-object v0, p0, LSm0;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/Chart;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRS0;

    instance-of v3, v2, Lrx;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Lrx;

    iget-object v3, v3, Lrx;->h:Ltx;

    invoke-interface {v3}, Ltx;->q()Lsx;

    move-result-object v3

    goto :goto_1

    :cond_1
    instance-of v3, v2, Ljr2;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ljr2;

    iget-object v3, v3, Ljr2;->i:Llr2;

    invoke-interface {v3}, Llr2;->k()Lkr2;

    move-result-object v3

    goto :goto_1

    :cond_2
    instance-of v3, v2, Lhd0;

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, Lhd0;

    iget-object v3, v3, Lhd0;->i:Lgd0;

    invoke-interface {v3}, Lgd0;->n()Lfd0;

    move-result-object v3

    goto :goto_1

    :cond_3
    instance-of v3, v2, Lmm5;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Lmm5;

    iget-object v3, v3, Lmm5;->i:Lom5;

    invoke-interface {v3}, Lom5;->b()Lnm5;

    move-result-object v3

    goto :goto_1

    :cond_4
    instance-of v3, v2, Ld30;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Ld30;

    iget-object v3, v3, Ld30;->h:Lf30;

    invoke-interface {v3}, Lf30;->a()Le30;

    move-result-object v3

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    const/4 v4, -0x1

    if-nez v3, :cond_6

    move v3, v4

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v5

    check-cast v5, LTm0;

    invoke-virtual {v5}, LTm0;->s()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    :goto_2
    iget-object v5, p0, LSm0;->i:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->clear()V

    array-length v5, p2

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_9

    aget-object v7, p2, v6

    invoke-virtual {v7}, LOM1;->c()I

    move-result v8

    if-eq v8, v3, :cond_7

    invoke-virtual {v7}, LOM1;->c()I

    move-result v8

    if-ne v8, v4, :cond_8

    :cond_7
    iget-object v8, p0, LSm0;->i:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_9
    iget-object v3, p0, LSm0;->i:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [LOM1;

    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [LOM1;

    invoke-virtual {v2, p1, v3}, LRS0;->d(Landroid/graphics/Canvas;[LOM1;)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRS0;

    invoke-virtual {v1, p1}, LRS0;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRS0;

    invoke-virtual {v1}, LRS0;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h()V
    .locals 8

    iget-object v0, p0, LSm0;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LSm0;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/CombinedChart;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->w0()[Lcom/github/mikephil/charting/charts/CombinedChart$a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_7

    aget-object v4, v1, v3

    sget-object v5, LSm0$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_5

    const/4 v5, 0x2

    if-eq v4, v5, :cond_4

    const/4 v5, 0x3

    if-eq v4, v5, :cond_3

    const/4 v5, 0x4

    if-eq v4, v5, :cond_2

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->b()Lnm5;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, LSm0;->g:Ljava/util/List;

    new-instance v5, Lmm5;

    iget-object v6, p0, LRS0;->b:Lhi0;

    iget-object v7, p0, Lqx4;->a:LFs6;

    invoke-direct {v5, v0, v6, v7}, Lmm5;-><init>(Lom5;Lhi0;LFs6;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->n()Lfd0;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, LSm0;->g:Ljava/util/List;

    new-instance v5, Lhd0;

    iget-object v6, p0, LRS0;->b:Lhi0;

    iget-object v7, p0, Lqx4;->a:LFs6;

    invoke-direct {v5, v0, v6, v7}, Lhd0;-><init>(Lgd0;Lhi0;LFs6;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->k()Lkr2;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, LSm0;->g:Ljava/util/List;

    new-instance v5, Ljr2;

    iget-object v6, p0, LRS0;->b:Lhi0;

    iget-object v7, p0, Lqx4;->a:LFs6;

    invoke-direct {v5, v0, v6, v7}, Ljr2;-><init>(Llr2;Lhi0;LFs6;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->a()Le30;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, LSm0;->g:Ljava/util/List;

    new-instance v5, Ld30;

    iget-object v6, p0, LRS0;->b:Lhi0;

    iget-object v7, p0, Lqx4;->a:LFs6;

    invoke-direct {v5, v0, v6, v7}, Ld30;-><init>(Lf30;Lhi0;LFs6;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/CombinedChart;->q()Lsx;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, LSm0;->g:Ljava/util/List;

    new-instance v5, Lrx;

    iget-object v6, p0, LRS0;->b:Lhi0;

    iget-object v7, p0, Lqx4;->a:LFs6;

    invoke-direct {v5, v0, v6, v7}, Lrx;-><init>(Ltx;Lhi0;LFs6;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method
