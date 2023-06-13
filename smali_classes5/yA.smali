.class public abstract LyA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoO1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">",
        "Ljava/lang/Object;",
        "LoO1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:LGD1;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGD1;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/String;

.field public f:LaI6$a;

.field public g:Z

.field public transient h:LJj6;

.field public i:Landroid/graphics/Typeface;

.field public j:Lfq2$c;

.field public k:F

.field public l:F

.field public m:Landroid/graphics/DashPathEffect;

.field public n:Z

.field public o:Z

.field public p:LPE2;

.field public q:F

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LyA;->a:Ljava/util/List;

    iput-object v0, p0, LyA;->b:LGD1;

    iput-object v0, p0, LyA;->c:Ljava/util/List;

    iput-object v0, p0, LyA;->d:Ljava/util/List;

    const-string v1, "DataSet"

    iput-object v1, p0, LyA;->e:Ljava/lang/String;

    sget-object v1, LaI6$a;->b:LaI6$a;

    iput-object v1, p0, LyA;->f:LaI6$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, LyA;->g:Z

    sget-object v2, Lfq2$c;->d:Lfq2$c;

    iput-object v2, p0, LyA;->j:Lfq2$c;

    const/high16 v2, 0x7fc00000    # Float.NaN

    iput v2, p0, LyA;->k:F

    iput v2, p0, LyA;->l:F

    iput-object v0, p0, LyA;->m:Landroid/graphics/DashPathEffect;

    iput-boolean v1, p0, LyA;->n:Z

    iput-boolean v1, p0, LyA;->o:Z

    new-instance v0, LPE2;

    invoke-direct {v0}, LPE2;-><init>()V

    iput-object v0, p0, LyA;->p:LPE2;

    const/high16 v0, 0x41880000    # 17.0f

    iput v0, p0, LyA;->q:F

    iput-boolean v1, p0, LyA;->r:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LyA;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LyA;->d:Ljava/util/List;

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    const/16 v1, 0xea

    const/16 v2, 0xff

    const/16 v3, 0x8c

    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LyA;->d:Ljava/util/List;

    const/high16 v1, -0x1000000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LyA;-><init>()V

    iput-object p1, p0, LyA;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A0(I)I
    .locals 2

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public C()Landroid/graphics/DashPathEffect;
    .locals 1

    iget-object v0, p0, LyA;->m:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public C0()Z
    .locals 1

    iget-object v0, p0, LyA;->h:LJj6;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, LyA;->o:Z

    return v0
.end method

.method public G()F
    .locals 1

    iget v0, p0, LyA;->l:F

    return v0
.end method

.method public M0()LPE2;
    .locals 1

    iget-object v0, p0, LyA;->p:LPE2;

    return-object v0
.end method

.method public N0(I)LGD1;
    .locals 2

    iget-object v0, p0, LyA;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGD1;

    return-object p1
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, LyA;->g:Z

    return v0
.end method

.method public Q0()V
    .locals 1

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LyA;->a:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LyA;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public R0(I)V
    .locals 1

    invoke-virtual {p0}, LyA;->Q0()V

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public S0(Z)V
    .locals 0

    iput-boolean p1, p0, LyA;->n:Z

    return-void
.end method

.method public b0()LJj6;
    .locals 1

    invoke-virtual {p0}, LyA;->C0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LOi6;->j()LJj6;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LyA;->h:LJj6;

    return-object v0
.end method

.method public c0(LJj6;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LyA;->h:LJj6;

    return-void
.end method

.method public d()Lfq2$c;
    .locals 1

    iget-object v0, p0, LyA;->j:Lfq2$c;

    return-object v0
.end method

.method public g0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    return-object v0
.end method

.method public getColor()I
    .locals 2

    iget-object v0, p0, LyA;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LyA;->e:Ljava/lang/String;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, LyA;->k:F

    return v0
.end method

.method public i0()Z
    .locals 1

    iget-boolean v0, p0, LyA;->n:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-boolean v0, p0, LyA;->r:Z

    return v0
.end method

.method public j0()LaI6$a;
    .locals 1

    iget-object v0, p0, LyA;->f:LaI6$a;

    return-object v0
.end method

.method public k()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, LyA;->i:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public m(I)I
    .locals 2

    iget-object v0, p0, LyA;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LGD1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LyA;->c:Ljava/util/List;

    return-object v0
.end method

.method public s0()LGD1;
    .locals 1

    iget-object v0, p0, LyA;->b:LGD1;

    return-object v0
.end method

.method public u0()F
    .locals 1

    iget v0, p0, LyA;->q:F

    return v0
.end method
