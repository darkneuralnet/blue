.class public Lji0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LuO1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lyx;",
        ">",
        "Ljava/lang/Object;",
        "LuO1;"
    }
.end annotation


# instance fields
.field public a:Lyx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lji0;->b:Ljava/util/List;

    iput-object p1, p0, Lji0;->a:Lyx;

    return-void
.end method


# virtual methods
.method public a(FF)LOM1;
    .locals 3

    invoke-virtual {p0, p1, p2}, Lji0;->j(FF)LOE2;

    move-result-object v0

    iget-wide v1, v0, LOE2;->c:D

    double-to-float v1, v1

    invoke-static {v0}, LOE2;->c(LOE2;)V

    invoke-virtual {p0, v1, p1, p2}, Lji0;->f(FFF)LOM1;

    move-result-object p1

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

    invoke-interface {p1}, LoO1;->j0()LaI6$a;

    move-result-object v2

    invoke-interface {v1, v2}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v1

    invoke-virtual {p4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v2

    invoke-virtual {p4}, LAA;->c()F

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

.method public c(Ljava/util/List;FFLaI6$a;F)LOM1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LOM1;",
            ">;FF",
            "LaI6$a;",
            "F)",
            "LOM1;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LOM1;

    if-eqz p4, :cond_0

    invoke-virtual {v2}, LOM1;->b()LaI6$a;

    move-result-object v3

    if-ne v3, p4, :cond_1

    :cond_0
    invoke-virtual {v2}, LOM1;->i()F

    move-result v3

    invoke-virtual {v2}, LOM1;->k()F

    move-result v4

    invoke-virtual {p0, p2, p3, v3, v4}, Lji0;->e(FFFF)F

    move-result v3

    cmpg-float v4, v3, p5

    if-gez v4, :cond_1

    move-object v0, v2

    move p5, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public d()Lxx;
    .locals 1

    iget-object v0, p0, Lji0;->a:Lyx;

    invoke-interface {v0}, Lyx;->getData()Lxx;

    move-result-object v0

    return-object v0
.end method

.method public e(FFFF)F
    .locals 2

    sub-float/2addr p1, p3

    float-to-double v0, p1

    sub-float/2addr p2, p4

    float-to-double p1, p2

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method public f(FFF)LOM1;
    .locals 6

    invoke-virtual {p0, p1, p2, p3}, Lji0;->h(FFF)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v1, p3, p1}, Lji0;->i(Ljava/util/List;FLaI6$a;)F

    move-result v0

    sget-object v2, LaI6$a;->c:LaI6$a;

    invoke-virtual {p0, v1, p3, v2}, Lji0;->i(Ljava/util/List;FLaI6$a;)F

    move-result v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    move-object v4, p1

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    iget-object p1, p0, Lji0;->a:Lyx;

    invoke-interface {p1}, Lki0;->j()F

    move-result v5

    move-object v0, p0

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lji0;->c(Ljava/util/List;FFLaI6$a;F)LOM1;

    move-result-object p1

    return-object p1
.end method

.method public g(LOM1;)F
    .locals 0

    invoke-virtual {p1}, LOM1;->k()F

    move-result p1

    return p1
.end method

.method public h(FFF)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lji0;->b:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lji0;->d()Lxx;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p1, p0, Lji0;->b:Ljava/util/List;

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lii0;->e()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_2

    invoke-virtual {p2, v0}, Lii0;->d(I)LoO1;

    move-result-object v1

    invoke-interface {v1}, LoO1;->Q()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lji0;->b:Ljava/util/List;

    sget-object v3, LTS0$a;->d:LTS0$a;

    invoke-virtual {p0, v1, v0, p1, v3}, Lji0;->b(LoO1;IFLTS0$a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lji0;->b:Ljava/util/List;

    return-object p1
.end method

.method public i(Ljava/util/List;FLaI6$a;)F
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LOM1;",
            ">;F",
            "LaI6$a;",
            ")F"
        }
    .end annotation

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LOM1;

    invoke-virtual {v2}, LOM1;->b()LaI6$a;

    move-result-object v3

    if-ne v3, p3, :cond_0

    invoke-virtual {p0, v2}, Lji0;->g(LOM1;)F

    move-result v2

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v3, v2, v0

    if-gez v3, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public j(FF)LOE2;
    .locals 2

    iget-object v0, p0, Lji0;->a:Lyx;

    sget-object v1, LaI6$a;->b:LaI6$a;

    invoke-interface {v0, v1}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LD96;->g(FF)LOE2;

    move-result-object p1

    return-object p1
.end method
