.class public Lhr2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LbC1;

.field public b:LpA3;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LBr2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf32;LpA3;ZILbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhr2;->f:Z

    iput-boolean v0, p0, Lhr2;->g:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhr2;->h:Ljava/util/List;

    iput-object p2, p0, Lhr2;->b:LpA3;

    iput p4, p0, Lhr2;->c:I

    iput-object p5, p0, Lhr2;->a:LbC1;

    iput-boolean p3, p0, Lhr2;->e:Z

    invoke-virtual {p1}, Lf32;->a()I

    move-result p1

    iput p1, p0, Lhr2;->d:I

    return-void
.end method

.method public static b(LqA3;I)I
    .locals 2

    invoke-virtual {p0, p1}, LqA3;->q(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LqA3;->w(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, p1}, LqA3;->c(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lhr2;->b:LpA3;

    invoke-virtual {v0}, LpA3;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->E()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LnA3;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lhr2;->h:Ljava/util/List;

    invoke-virtual {p0, v1}, Lhr2;->g(LnA3;)LBr2;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, LnA3;->L()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LBr2;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lhr2;->e()V

    invoke-virtual {p0}, Lhr2;->a()V

    iget-object v0, p0, Lhr2;->h:Ljava/util/List;

    return-object v0
.end method

.method public final d(LqA3;)Z
    .locals 3

    invoke-virtual {p1}, LqA3;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lhr2;->g:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, LqA3;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, LqA3;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget v0, p0, Lhr2;->c:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    invoke-virtual {p1}, LqA3;->r()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lhr2;->e:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lhr2;->d:I

    invoke-virtual {p1, v0}, LqA3;->x(I)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-boolean v0, p0, Lhr2;->f:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lhr2;->c:I

    if-ne v0, v2, :cond_5

    invoke-virtual {p1}, LqA3;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    :cond_5
    invoke-static {p1, v1}, Lhr2;->b(LqA3;I)I

    move-result v0

    invoke-static {p1, v2}, Lhr2;->b(LqA3;I)I

    move-result p1

    iget v1, p0, Lhr2;->c:I

    invoke-static {v1, v0, p1}, LtA3;->g(III)Z

    move-result p1

    return p1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lhr2;->b:LpA3;

    invoke-virtual {v0}, LpA3;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->D()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    invoke-virtual {p0, v2}, Lhr2;->d(LqA3;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LnA3;->J()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public f(Z)V
    .locals 1

    xor-int/lit8 v0, p1, 0x1

    iput-boolean v0, p0, Lhr2;->g:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lhr2;->f:Z

    return-void
.end method

.method public final g(LnA3;)LBr2;
    .locals 4

    invoke-virtual {p1}, LnA3;->z()Z

    move-result v0

    new-instance v1, LDB0;

    invoke-direct {v1}, LDB0;-><init>()V

    invoke-virtual {p1}, LFE1;->m()LyB0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, LDB0;->f(LyB0;Z)V

    invoke-virtual {p1, v1}, LnA3;->q(LDB0;)V

    invoke-virtual {v1, v0}, LDB0;->w(Z)[LyB0;

    move-result-object p1

    iget-object v0, p0, Lhr2;->a:LbC1;

    invoke-virtual {v0, p1}, LbC1;->g([LyB0;)LBr2;

    move-result-object p1

    return-object p1
.end method
