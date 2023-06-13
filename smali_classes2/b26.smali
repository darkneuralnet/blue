.class public Lb26;
.super Lgl2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgl2<",
        "LN51;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfl2<",
            "LN51;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lgl2;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lfl2;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb26;->p(Lfl2;F)LN51;

    move-result-object p1

    return-object p1
.end method

.method public p(Lfl2;F)LN51;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "LN51;",
            ">;F)",
            "LN51;"
        }
    .end annotation

    iget-object v0, p0, LoB;->e:LgE2;

    if-eqz v0, :cond_2

    iget v1, p1, Lfl2;->g:F

    iget-object v2, p1, Lfl2;->h:Ljava/lang/Float;

    if-nez v2, :cond_0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_0
    iget-object v3, p1, Lfl2;->b:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, LN51;

    iget-object p1, p1, Lfl2;->c:Ljava/lang/Object;

    if-nez p1, :cond_1

    check-cast v3, LN51;

    move-object p1, v3

    goto :goto_1

    :cond_1
    check-cast p1, LN51;

    :goto_1
    invoke-virtual {p0}, LoB;->d()F

    move-result v6

    invoke-virtual {p0}, LoB;->f()F

    move-result v7

    move-object v3, v4

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v7}, LgE2;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LN51;

    return-object p1

    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p2, p2, v0

    if-nez p2, :cond_4

    iget-object p2, p1, Lfl2;->c:Ljava/lang/Object;

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    check-cast p2, LN51;

    return-object p2

    :cond_4
    :goto_2
    iget-object p1, p1, Lfl2;->b:Ljava/lang/Object;

    check-cast p1, LN51;

    return-object p1
.end method

.method public q(LgE2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LTD2;

    invoke-direct {v0}, LTD2;-><init>()V

    new-instance v1, LN51;

    invoke-direct {v1}, LN51;-><init>()V

    new-instance v2, Lb26$a;

    invoke-direct {v2, p0, v0, p1, v1}, Lb26$a;-><init>(Lb26;LTD2;LgE2;LN51;)V

    invoke-super {p0, v2}, LoB;->n(LgE2;)V

    return-void
.end method
