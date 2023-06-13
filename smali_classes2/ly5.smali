.class public Lly5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhJ3;
.implements LoB$b;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:LRD2;

.field public final e:Lsy5;

.field public f:Z

.field public final g:Luu0;


# direct methods
.method public constructor <init>(LRD2;LqB;Lwy5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    new-instance v0, Luu0;

    invoke-direct {v0}, Luu0;-><init>()V

    iput-object v0, p0, Lly5;->g:Luu0;

    invoke-virtual {p3}, Lwy5;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lly5;->b:Ljava/lang/String;

    invoke-virtual {p3}, Lwy5;->d()Z

    move-result v0

    iput-boolean v0, p0, Lly5;->c:Z

    iput-object p1, p0, Lly5;->d:LRD2;

    invoke-virtual {p3}, Lwy5;->c()Lze;

    move-result-object p1

    invoke-virtual {p1}, Lze;->c()Lsy5;

    move-result-object p1

    iput-object p1, p0, Lly5;->e:Lsy5;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lly5;->f:Z

    iget-object v0, p0, Lly5;->d:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, Lly5;->b()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVz0;

    instance-of v2, v1, Lxa6;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxa6;

    invoke-virtual {v2}, Lxa6;->j()LAy5$a;

    move-result-object v3

    sget-object v4, LAy5$a;->b:LAy5$a;

    if-ne v3, v4, :cond_0

    iget-object v1, p0, Lly5;->g:Luu0;

    invoke-virtual {v1, v2}, Luu0;->a(Lxa6;)V

    invoke-virtual {v2, p0}, Lxa6;->b(LoB$b;)V

    goto :goto_1

    :cond_0
    instance-of v2, v1, Luy5;

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    check-cast v1, Luy5;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lly5;->e:Lsy5;

    invoke-virtual {p1, p2}, Lsy5;->q(Ljava/util/List;)V

    return-void
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 3

    iget-boolean v0, p0, Lly5;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    return-object v0

    :cond_0
    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-boolean v0, p0, Lly5;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lly5;->f:Z

    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    return-object v0

    :cond_1
    iget-object v0, p0, Lly5;->e:Lsy5;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    if-nez v0, :cond_2

    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    return-object v0

    :cond_2
    iget-object v2, p0, Lly5;->a:Landroid/graphics/Path;

    invoke-virtual {v2, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object v0, p0, Lly5;->g:Luu0;

    iget-object v2, p0, Lly5;->a:Landroid/graphics/Path;

    invoke-virtual {v0, v2}, Luu0;->b(Landroid/graphics/Path;)V

    iput-boolean v1, p0, Lly5;->f:Z

    iget-object v0, p0, Lly5;->a:Landroid/graphics/Path;

    return-object v0
.end method
