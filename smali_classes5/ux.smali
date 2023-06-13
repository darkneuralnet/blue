.class public Lux;
.super Lzx;
.source "SourceFile"

# interfaces
.implements LXN1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzx<",
        "Lcom/github/mikephil/charting/data/BarEntry;",
        ">;",
        "LXN1;"
    }
.end annotation


# instance fields
.field public A:F

.field public B:I

.field public C:I

.field public D:I

.field public E:[Ljava/lang/String;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lzx;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 p2, 0x1

    iput p2, p0, Lux;->y:I

    const/16 p2, 0xd7

    invoke-static {p2, p2, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    iput p2, p0, Lux;->z:I

    const/4 p2, 0x0

    iput p2, p0, Lux;->A:F

    const/high16 p2, -0x1000000

    iput p2, p0, Lux;->B:I

    const/16 p2, 0x78

    iput p2, p0, Lux;->C:I

    const/4 p2, 0x0

    iput p2, p0, Lux;->D:I

    const-string v0, "Stack"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lux;->E:[Ljava/lang/String;

    invoke-static {p2, p2, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    iput p2, p0, Lzx;->x:I

    invoke-virtual {p0, p1}, Lux;->b1(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lux;->Z0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public B0()I
    .locals 1

    iget v0, p0, Lux;->z:I

    return v0
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lux;->A:F

    return v0
.end method

.method public I0()I
    .locals 1

    iget v0, p0, Lux;->C:I

    return v0
.end method

.method public M()Z
    .locals 2

    iget v0, p0, Lux;->y:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public N()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lux;->E:[Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic U0(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 0

    check-cast p1, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p0, p1}, Lux;->a1(Lcom/github/mikephil/charting/data/BarEntry;)V

    return-void
.end method

.method public X()I
    .locals 1

    iget v0, p0, Lux;->B:I

    return v0
.end method

.method public final Z0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lux;->D:I

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/BarEntry;->k()[F

    move-result-object v1

    if-nez v1, :cond_0

    iget v1, p0, Lux;->D:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lux;->D:I

    goto :goto_1

    :cond_0
    iget v2, p0, Lux;->D:I

    array-length v1, v1

    add-int/2addr v2, v1

    iput v2, p0, Lux;->D:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a1(Lcom/github/mikephil/charting/data/BarEntry;)V
    .locals 2

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->k()[F

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v0

    iget v1, p0, LTS0;->u:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v0

    iput v0, p0, LTS0;->u:F

    :cond_0
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v0

    iget v1, p0, LTS0;->t:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v0

    iput v0, p0, LTS0;->t:F

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->h()F

    move-result v0

    neg-float v0, v0

    iget v1, p0, LTS0;->u:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->h()F

    move-result v0

    neg-float v0, v0

    iput v0, p0, LTS0;->u:F

    :cond_2
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->i()F

    move-result v0

    iget v1, p0, LTS0;->t:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->i()F

    move-result v0

    iput v0, p0, LTS0;->t:F

    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, LTS0;->V0(Lcom/github/mikephil/charting/data/Entry;)V

    :cond_4
    return-void
.end method

.method public final b1(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/BarEntry;->k()[F

    move-result-object v1

    if-eqz v1, :cond_0

    array-length v2, v1

    iget v3, p0, Lux;->y:I

    if-le v2, v3, :cond_0

    array-length v1, v1

    iput v1, p0, Lux;->y:I

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lux;->y:I

    return v0
.end method
