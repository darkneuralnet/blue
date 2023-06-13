.class public LW71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoB$b;


# instance fields
.field public final a:LoB$b;

.field public final b:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z


# direct methods
.method public constructor <init>(LoB$b;LqB;LU71;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LW71;->g:Z

    iput-object p1, p0, LW71;->a:LoB$b;

    invoke-virtual {p3}, LU71;->a()Lpe;

    move-result-object p1

    invoke-virtual {p1}, Lpe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LW71;->b:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LU71;->d()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LW71;->c:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LU71;->b()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LW71;->d:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LU71;->c()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LW71;->e:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LU71;->e()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LW71;->f:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Paint;)V
    .locals 6

    iget-boolean v0, p0, LW71;->g:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LW71;->g:Z

    iget-object v0, p0, LW71;->d:LoB;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v0, v2

    iget-object v2, p0, LW71;->e:LoB;

    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v3, v2

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    add-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v2

    iget-object v1, p0, LW71;->b:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, LW71;->c:LoB;

    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {v2, v4, v5, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    iget-object v2, p0, LW71;->f:LoB;

    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-void
.end method

.method public b(LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LW71;->b:LoB;

    invoke-virtual {v0, p1}, LoB;->n(LgE2;)V

    return-void
.end method

.method public c(LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LW71;->d:LoB;

    invoke-virtual {v0, p1}, LoB;->n(LgE2;)V

    return-void
.end method

.method public d(LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LW71;->e:LoB;

    invoke-virtual {v0, p1}, LoB;->n(LgE2;)V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LW71;->g:Z

    iget-object v0, p0, LW71;->a:LoB$b;

    invoke-interface {v0}, LoB$b;->e()V

    return-void
.end method

.method public f(LgE2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, LW71;->c:LoB;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LoB;->n(LgE2;)V

    return-void

    :cond_0
    iget-object v0, p0, LW71;->c:LoB;

    new-instance v1, LW71$a;

    invoke-direct {v1, p0, p1}, LW71$a;-><init>(LW71;LgE2;)V

    invoke-virtual {v0, v1}, LoB;->n(LgE2;)V

    return-void
.end method

.method public g(LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LW71;->f:LoB;

    invoke-virtual {v0, p1}, LoB;->n(LgE2;)V

    return-void
.end method
