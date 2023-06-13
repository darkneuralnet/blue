.class public LrD2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LoQ3;

.field public final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lfm2;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LUD2;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lfw1;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LhM2;",
            ">;"
        }
    .end annotation
.end field

.field public g:LLN5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLN5<",
            "Liw1;",
            ">;"
        }
    .end annotation
.end field

.field public h:Loz2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loz2<",
            "Lfm2;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfm2;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroid/graphics/Rect;

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LoQ3;

    invoke-direct {v0}, LoQ3;-><init>()V

    iput-object v0, p0, LrD2;->a:LoQ3;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LrD2;->b:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, LrD2;->o:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, LDx2;->c(Ljava/lang/String;)V

    iget-object v0, p0, LrD2;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LrD2;->j:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()LLN5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LLN5<",
            "Liw1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD2;->g:LLN5;

    return-object v0
.end method

.method public d()F
    .locals 2

    invoke-virtual {p0}, LrD2;->e()F

    move-result v0

    iget v1, p0, LrD2;->m:F

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    long-to-float v0, v0

    return v0
.end method

.method public e()F
    .locals 2

    iget v0, p0, LrD2;->l:F

    iget v1, p0, LrD2;->k:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, LrD2;->l:F

    return v0
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lfw1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD2;->e:Ljava/util/Map;

    return-object v0
.end method

.method public h(F)F
    .locals 2

    iget v0, p0, LrD2;->k:F

    iget v1, p0, LrD2;->l:F

    invoke-static {v0, v1, p1}, LrU2;->i(FFF)F

    move-result p1

    return p1
.end method

.method public i()F
    .locals 1

    iget v0, p0, LrD2;->m:F

    return v0
.end method

.method public j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LUD2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD2;->d:Ljava/util/Map;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfm2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD2;->i:Ljava/util/List;

    return-object v0
.end method

.method public l(Ljava/lang/String;)LhM2;
    .locals 4

    iget-object v0, p0, LrD2;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LrD2;->f:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LhM2;

    invoke-virtual {v2, p1}, LhM2;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public m()I
    .locals 1

    iget v0, p0, LrD2;->o:I

    return v0
.end method

.method public n()LoQ3;
    .locals 1

    iget-object v0, p0, LrD2;->a:LoQ3;

    return-object v0
.end method

.method public o(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lfm2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LrD2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public p()F
    .locals 1

    iget v0, p0, LrD2;->k:F

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, LrD2;->n:Z

    return v0
.end method

.method public r(I)V
    .locals 1

    iget v0, p0, LrD2;->o:I

    add-int/2addr v0, p1

    iput v0, p0, LrD2;->o:I

    return-void
.end method

.method public s(Landroid/graphics/Rect;FFFLjava/util/List;Loz2;Ljava/util/Map;Ljava/util/Map;LLN5;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "FFF",
            "Ljava/util/List<",
            "Lfm2;",
            ">;",
            "Loz2<",
            "Lfm2;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lfm2;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LUD2;",
            ">;",
            "LLN5<",
            "Liw1;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lfw1;",
            ">;",
            "Ljava/util/List<",
            "LhM2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LrD2;->j:Landroid/graphics/Rect;

    iput p2, p0, LrD2;->k:F

    iput p3, p0, LrD2;->l:F

    iput p4, p0, LrD2;->m:F

    iput-object p5, p0, LrD2;->i:Ljava/util/List;

    iput-object p6, p0, LrD2;->h:Loz2;

    iput-object p7, p0, LrD2;->c:Ljava/util/Map;

    iput-object p8, p0, LrD2;->d:Ljava/util/Map;

    iput-object p9, p0, LrD2;->g:LLN5;

    iput-object p10, p0, LrD2;->e:Ljava/util/Map;

    iput-object p11, p0, LrD2;->f:Ljava/util/List;

    return-void
.end method

.method public t(J)Lfm2;
    .locals 1

    iget-object v0, p0, LrD2;->h:Loz2;

    invoke-virtual {v0, p1, p2}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfm2;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LottieComposition:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LrD2;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfm2;

    const-string v3, "\t"

    invoke-virtual {v2, v3}, Lfm2;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, LrD2;->n:Z

    return-void
.end method

.method public v(Z)V
    .locals 1

    iget-object v0, p0, LrD2;->a:LoQ3;

    invoke-virtual {v0, p1}, LoQ3;->b(Z)V

    return-void
.end method
