.class public Lty5;
.super LqB;
.source "SourceFile"


# instance fields
.field public final D:LjA0;

.field public final E:Leu0;


# direct methods
.method public constructor <init>(LRD2;Lfm2;Leu0;LrD2;)V
    .locals 2

    invoke-direct {p0, p1, p2}, LqB;-><init>(LRD2;Lfm2;)V

    iput-object p3, p0, Lty5;->E:Leu0;

    new-instance p3, Lqy5;

    invoke-virtual {p2}, Lfm2;->n()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    const-string v1, "__container"

    invoke-direct {p3, v1, p2, v0}, Lqy5;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    new-instance p2, LjA0;

    invoke-direct {p2, p1, p0, p3, p4}, LjA0;-><init>(LRD2;LqB;Lqy5;LrD2;)V

    iput-object p2, p0, Lty5;->D:LjA0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, LjA0;->f(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public H(LBk2;ILjava/util/List;LBk2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lty5;->D:LjA0;

    invoke-virtual {v0, p1, p2, p3, p4}, LjA0;->c(LBk2;ILjava/util/List;LBk2;)V

    return-void
.end method

.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lty5;->D:LjA0;

    iget-object v0, p0, LqB;->o:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1, v0, p3}, LjA0;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 1

    iget-object v0, p0, Lty5;->D:LjA0;

    invoke-virtual {v0, p1, p2, p3}, LjA0;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    return-void
.end method

.method public v()LMY;
    .locals 1

    invoke-super {p0}, LqB;->v()LMY;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lty5;->E:Leu0;

    invoke-virtual {v0}, LqB;->v()LMY;

    move-result-object v0

    return-object v0
.end method

.method public x()LU71;
    .locals 1

    invoke-super {p0}, LqB;->x()LU71;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lty5;->E:Leu0;

    invoke-virtual {v0}, LqB;->x()LU71;

    move-result-object v0

    return-object v0
.end method
