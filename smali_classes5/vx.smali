.class public Lvx;
.super Lji0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lji0<",
        "Ltx;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ltx;)V
    .locals 0

    invoke-direct {p0, p1}, Lji0;-><init>(Lyx;)V

    return-void
.end method


# virtual methods
.method public a(FF)LOM1;
    .locals 4

    invoke-super {p0, p1, p2}, Lji0;->a(FF)LOM1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lji0;->j(FF)LOE2;

    move-result-object p1

    iget-object p2, p0, Lji0;->a:Lyx;

    check-cast p2, Ltx;

    invoke-interface {p2}, Ltx;->q()Lsx;

    move-result-object p2

    invoke-virtual {v0}, LOM1;->d()I

    move-result v1

    invoke-virtual {p2, v1}, Lii0;->d(I)LoO1;

    move-result-object p2

    check-cast p2, LXN1;

    invoke-interface {p2}, LXN1;->M()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, p1, LOE2;->c:D

    double-to-float v1, v1

    iget-wide v2, p1, LOE2;->d:D

    double-to-float p1, v2

    invoke-virtual {p0, v0, p2, v1, p1}, Lvx;->l(LOM1;LXN1;FF)LOM1;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, LOE2;->c(LOE2;)V

    return-object v0
.end method

.method public d()Lxx;
    .locals 1

    iget-object v0, p0, Lji0;->a:Lyx;

    check-cast v0, Ltx;

    invoke-interface {v0}, Ltx;->q()Lsx;

    move-result-object v0

    return-object v0
.end method

.method public e(FFFF)F
    .locals 0

    sub-float/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1
.end method

.method public k([Lfn4;F)I
    .locals 2

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_1

    aget-object p1, p1, p2

    throw v1

    :cond_1
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    aget-object p1, p1, p2

    throw v1

    :cond_2
    :goto_0
    return p2
.end method

.method public l(LOM1;LXN1;FF)LOM1;
    .locals 2

    invoke-interface {p2, p3, p4}, LoO1;->p0(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p3

    check-cast p3, Lcom/github/mikephil/charting/data/BarEntry;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p3}, Lcom/github/mikephil/charting/data/BarEntry;->k()[F

    move-result-object v1

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p3}, Lcom/github/mikephil/charting/data/BarEntry;->j()[Lfn4;

    move-result-object p3

    array-length v1, p3

    if-gtz v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p0, p3, p4}, Lvx;->k([Lfn4;F)I

    move-result p4

    iget-object v1, p0, Lji0;->a:Lyx;

    check-cast v1, Ltx;

    invoke-interface {p2}, LoO1;->j0()LaI6$a;

    move-result-object p2

    invoke-interface {v1, p2}, Lyx;->d(LaI6$a;)LD96;

    invoke-virtual {p1}, LOM1;->h()F

    aget-object p1, p3, p4

    throw v0
.end method
