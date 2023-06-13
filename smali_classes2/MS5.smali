.class public LMS5;
.super LsE;
.source "SourceFile"


# instance fields
.field public final r:LqB;

.field public final s:Ljava/lang/String;

.field public final t:Z

.field public final u:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public v:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRD2;LqB;Lyy5;)V
    .locals 11

    invoke-virtual {p3}, Lyy5;->b()Lyy5$b;

    move-result-object v0

    invoke-virtual {v0}, Lyy5$b;->b()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-virtual {p3}, Lyy5;->e()Lyy5$c;

    move-result-object v0

    invoke-virtual {v0}, Lyy5$c;->b()Landroid/graphics/Paint$Join;

    move-result-object v5

    invoke-virtual {p3}, Lyy5;->g()F

    move-result v6

    invoke-virtual {p3}, Lyy5;->i()Lse;

    move-result-object v7

    invoke-virtual {p3}, Lyy5;->j()Lqe;

    move-result-object v8

    invoke-virtual {p3}, Lyy5;->f()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p3}, Lyy5;->d()Lqe;

    move-result-object v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, LsE;-><init>(LRD2;LqB;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLse;Lqe;Ljava/util/List;Lqe;)V

    iput-object p2, p0, LMS5;->r:LqB;

    invoke-virtual {p3}, Lyy5;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LMS5;->s:Ljava/lang/String;

    invoke-virtual {p3}, Lyy5;->k()Z

    move-result p1

    iput-boolean p1, p0, LMS5;->t:Z

    invoke-virtual {p3}, Lyy5;->c()Lpe;

    move-result-object p1

    invoke-virtual {p1}, Lpe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LMS5;->u:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-boolean v0, p0, LMS5;->t:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LsE;->i:Landroid/graphics/Paint;

    iget-object v1, p0, LMS5;->u:LoB;

    check-cast v1, Ltm0;

    invoke-virtual {v1}, Ltm0;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LMS5;->v:LoB;

    if-eqz v0, :cond_1

    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-super {p0, p1, p2, p3}, LsE;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LMS5;->s:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LsE;->h(Ljava/lang/Object;LgE2;)V

    sget-object v0, LaE2;->b:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LMS5;->u:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_0
    sget-object v0, LaE2;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, LMS5;->v:LoB;

    if-eqz p1, :cond_1

    iget-object v0, p0, LMS5;->r:LqB;

    invoke-virtual {v0, p1}, LqB;->G(LoB;)V

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, LMS5;->v:LoB;

    goto :goto_0

    :cond_2
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LMS5;->v:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LMS5;->r:LqB;

    iget-object p2, p0, LMS5;->u:LoB;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    :cond_3
    :goto_0
    return-void
.end method
