.class public Lmr2;
.super Lwr2;
.source "SourceFile"

# interfaces
.implements LMO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmr2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwr2<",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;",
        "LMO1;"
    }
.end annotation


# instance fields
.field public H:Lmr2$a;

.field public I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public J:I

.field public K:F

.field public L:F

.field public M:F

.field public N:Landroid/graphics/DashPathEffect;

.field public O:LrO1;

.field public P:Z

.field public Q:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lwr2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    sget-object p1, Lmr2$a;->b:Lmr2$a;

    iput-object p1, p0, Lmr2;->H:Lmr2$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lmr2;->I:Ljava/util/List;

    const/4 p2, -0x1

    iput p2, p0, Lmr2;->J:I

    const/high16 p2, 0x41000000    # 8.0f

    iput p2, p0, Lmr2;->K:F

    const/high16 p2, 0x40800000    # 4.0f

    iput p2, p0, Lmr2;->L:F

    const p2, 0x3e4ccccd    # 0.2f

    iput p2, p0, Lmr2;->M:F

    iput-object p1, p0, Lmr2;->N:Landroid/graphics/DashPathEffect;

    new-instance p1, LcX0;

    invoke-direct {p1}, LcX0;-><init>()V

    iput-object p1, p0, Lmr2;->O:LrO1;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmr2;->P:Z

    iput-boolean p1, p0, Lmr2;->Q:Z

    iget-object p1, p0, Lmr2;->I:Ljava/util/List;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lmr2;->I:Ljava/util/List;

    :cond_0
    iget-object p1, p0, Lmr2;->I:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lmr2;->I:Ljava/util/List;

    const/16 p2, 0xea

    const/16 v0, 0xff

    const/16 v1, 0x8c

    invoke-static {v1, p2, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public B()LrO1;
    .locals 1

    iget-object v0, p0, Lmr2;->O:LrO1;

    return-object v0
.end method

.method public F()Landroid/graphics/DashPathEffect;
    .locals 1

    iget-object v0, p0, Lmr2;->N:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public O(I)I
    .locals 1

    iget-object v0, p0, Lmr2;->I:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lmr2;->P:Z

    return v0
.end method

.method public P0()Z
    .locals 1

    iget-boolean v0, p0, Lmr2;->Q:Z

    return v0
.end method

.method public R()F
    .locals 1

    iget v0, p0, Lmr2;->L:F

    return v0
.end method

.method public a0()F
    .locals 1

    iget v0, p0, Lmr2;->M:F

    return v0
.end method

.method public a1()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lmr2;->N:Landroid/graphics/DashPathEffect;

    return-void
.end method

.method public b1(FFF)V
    .locals 3

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    invoke-direct {v0, v1, p3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object v0, p0, Lmr2;->N:Landroid/graphics/DashPathEffect;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lmr2;->N:Landroid/graphics/DashPathEffect;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public c1(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    move p1, v0

    :cond_0
    const v0, 0x3d4ccccd    # 0.05f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    move p1, v0

    :cond_1
    iput p1, p0, Lmr2;->M:F

    return-void
.end method

.method public d1(Z)V
    .locals 0

    iput-boolean p1, p0, Lmr2;->P:Z

    return-void
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lmr2;->J:I

    return v0
.end method

.method public e1(Lmr2$a;)V
    .locals 0

    iput-object p1, p0, Lmr2;->H:Lmr2$a;

    return-void
.end method

.method public w0()F
    .locals 1

    iget v0, p0, Lmr2;->K:F

    return v0
.end method

.method public x()I
    .locals 1

    iget-object v0, p0, Lmr2;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public z0()Lmr2$a;
    .locals 1

    iget-object v0, p0, Lmr2;->H:Lmr2$a;

    return-object v0
.end method
