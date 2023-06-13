.class public LbN1;
.super Lvx;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltx;)V
    .locals 0

    invoke-direct {p0, p1}, Lvx;-><init>(Ltx;)V

    return-void
.end method


# virtual methods
.method public a(FF)LOM1;
    .locals 4

    iget-object v0, p0, Lji0;->a:Lyx;

    check-cast v0, Ltx;

    invoke-interface {v0}, Ltx;->q()Lsx;

    move-result-object v0

    invoke-virtual {p0, p2, p1}, Lji0;->j(FF)LOE2;

    move-result-object v1

    iget-wide v2, v1, LOE2;->d:D

    double-to-float v2, v2

    invoke-virtual {p0, v2, p2, p1}, Lji0;->f(FFF)LOM1;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, LOM1;->d()I

    move-result p2

    invoke-virtual {v0, p2}, Lii0;->d(I)LoO1;

    move-result-object p2

    check-cast p2, LXN1;

    invoke-interface {p2}, LXN1;->M()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v2, v1, LOE2;->d:D

    double-to-float v0, v2

    iget-wide v1, v1, LOE2;->c:D

    double-to-float v1, v1

    invoke-virtual {p0, p1, p2, v0, v1}, Lvx;->l(LOM1;LXN1;FF)LOM1;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v1}, LOE2;->c(LOE2;)V

    return-object p1
.end method

.method public b(LoO1;IFLTS0$a;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoO1;",
            "IF",
            "LTS0$a;",
            ")",
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, LoO1;->q(F)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_0

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-interface {p1, p3, v2, p4}, LoO1;->D0(FFLTS0$a;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result p3

    invoke-interface {p1, p3}, LoO1;->q(F)Ljava/util/List;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p3

    if-nez p3, :cond_1

    return-object v0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/github/mikephil/charting/data/Entry;

    iget-object v1, p0, Lji0;->a:Lyx;

    check-cast v1, Ltx;

    invoke-interface {p1}, LoO1;->j0()LaI6$a;

    move-result-object v2

    invoke-interface {v1, v2}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v1

    invoke-virtual {p4}, LAA;->c()F

    move-result v2

    invoke-virtual {p4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v3

    invoke-virtual {v1, v2, v3}, LD96;->e(FF)LOE2;

    move-result-object v1

    new-instance v9, LOM1;

    invoke-virtual {p4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v3

    invoke-virtual {p4}, LAA;->c()F

    move-result v4

    iget-wide v5, v1, LOE2;->c:D

    double-to-float v5, v5

    iget-wide v1, v1, LOE2;->d:D

    double-to-float v6, v1

    invoke-interface {p1}, LoO1;->j0()LaI6$a;

    move-result-object v8

    move-object v2, v9

    move v7, p2

    invoke-direct/range {v2 .. v8}, LOM1;-><init>(FFFFILaI6$a;)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public e(FFFF)F
    .locals 0

    sub-float/2addr p2, p4

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1
.end method
