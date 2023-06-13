.class public Lsy5;
.super LoB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LoB<",
        "Lmy5;",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lmy5;

.field public final j:Landroid/graphics/Path;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Luy5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfl2<",
            "Lmy5;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, LoB;-><init>(Ljava/util/List;)V

    new-instance p1, Lmy5;

    invoke-direct {p1}, Lmy5;-><init>()V

    iput-object p1, p0, Lsy5;->i:Lmy5;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lsy5;->j:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lfl2;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsy5;->p(Lfl2;F)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method public p(Lfl2;F)Landroid/graphics/Path;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "Lmy5;",
            ">;F)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    iget-object v0, p1, Lfl2;->b:Ljava/lang/Object;

    check-cast v0, Lmy5;

    iget-object p1, p1, Lfl2;->c:Ljava/lang/Object;

    check-cast p1, Lmy5;

    iget-object v1, p0, Lsy5;->i:Lmy5;

    invoke-virtual {v1, v0, p1, p2}, Lmy5;->c(Lmy5;Lmy5;F)V

    iget-object p1, p0, Lsy5;->i:Lmy5;

    iget-object p2, p0, Lsy5;->k:Ljava/util/List;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-ltz p2, :cond_0

    iget-object v0, p0, Lsy5;->k:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luy5;

    invoke-interface {v0, p1}, Luy5;->g(Lmy5;)Lmy5;

    move-result-object p1

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lsy5;->j:Landroid/graphics/Path;

    invoke-static {p1, p2}, LrU2;->h(Lmy5;Landroid/graphics/Path;)V

    iget-object p1, p0, Lsy5;->j:Landroid/graphics/Path;

    return-object p1
.end method

.method public q(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Luy5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsy5;->k:Ljava/util/List;

    return-void
.end method
