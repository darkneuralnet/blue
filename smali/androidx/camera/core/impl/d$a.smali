.class public final Landroidx/camera/core/impl/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroidx/camera/core/impl/l;

.field public c:I

.field public d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public g:LJX2;

.field public h:Lxa0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/camera/core/impl/d$a;->c:I

    sget-object v0, LBR5;->a:Landroid/util/Range;

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/d$a;->f:Z

    invoke-static {}, LJX2;->f()LJX2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/camera/core/impl/d$a;->c:I

    sget-object v1, LBR5;->a:Landroid/util/Range;

    iput-object v1, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/camera/core/impl/d$a;->f:Z

    invoke-static {}, LJX2;->f()LJX2;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    iget-object v1, p1, Landroidx/camera/core/impl/d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Landroidx/camera/core/impl/d;->b:Landroidx/camera/core/impl/f;

    invoke-static {v0}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    iget v0, p1, Landroidx/camera/core/impl/d;->c:I

    iput v0, p0, Landroidx/camera/core/impl/d$a;->c:I

    iget-object v0, p1, Landroidx/camera/core/impl/d;->d:Landroid/util/Range;

    iput-object v0, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->i()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/camera/core/impl/d$a;->f:Z

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->g()LxY5;

    move-result-object p1

    invoke-static {p1}, LJX2;->g(LxY5;)LJX2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    return-void
.end method

.method public static j(Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/d$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
            "Landroidx/camera/core/impl/d$a;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/s;->o(Landroidx/camera/core/impl/d$b;)Landroidx/camera/core/impl/d$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/impl/d$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/d$a;-><init>()V

    invoke-interface {v0, p0, v1}, Landroidx/camera/core/impl/d$b;->a(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/d$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Implementation is missing option unpacker for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, LRY5;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/impl/d$a;-><init>(Landroidx/camera/core/impl/d;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lpa0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpa0;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(LxY5;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    invoke-virtual {v0, p1}, LJX2;->e(LxY5;)V

    return-void
.end method

.method public c(Lpa0;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/f$a<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    invoke-interface {v0, p1, p2}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Landroidx/camera/core/impl/f;)V
    .locals 5

    invoke-interface {p1}, Landroidx/camera/core/impl/f;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/f$a;

    iget-object v2, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v2, LYW2;

    if-eqz v4, :cond_0

    check-cast v2, LYW2;

    check-cast v3, LYW2;

    invoke-virtual {v3}, LYW2;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, LYW2;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    instance-of v2, v3, LYW2;

    if-eqz v2, :cond_1

    check-cast v3, LYW2;

    invoke-virtual {v3}, LYW2;->b()LYW2;

    move-result-object v3

    :cond_1
    iget-object v2, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/f;->h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;

    move-result-object v4

    invoke-interface {v2, v1, v4, v3}, Landroidx/camera/core/impl/l;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public f(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    invoke-virtual {v0, p1, p2}, LJX2;->h(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h()Landroidx/camera/core/impl/d;
    .locals 10

    new-instance v9, Landroidx/camera/core/impl/d;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    invoke-static {v0}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v2

    iget v3, p0, Landroidx/camera/core/impl/d$a;->c:I

    iget-object v4, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    iget-object v5, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    iget-boolean v6, p0, Landroidx/camera/core/impl/d$a;->f:Z

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->g:LJX2;

    invoke-static {v0}, LxY5;->b(LxY5;)LxY5;

    move-result-object v7

    iget-object v8, p0, Landroidx/camera/core/impl/d$a;->h:Lxa0;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroidx/camera/core/impl/d;-><init>(Ljava/util/List;Landroidx/camera/core/impl/f;ILandroid/util/Range;Ljava/util/List;ZLxY5;Lxa0;)V

    return-object v9
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public l()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    return-object v0
.end method

.method public m()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->a:Ljava/util/Set;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/d$a;->c:I

    return v0
.end method

.method public o(Lpa0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public p(Lxa0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/impl/d$a;->h:Lxa0;

    return-void
.end method

.method public q(Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/impl/d$a;->d:Landroid/util/Range;

    return-void
.end method

.method public r(Landroidx/camera/core/impl/f;)V
    .locals 0

    invoke-static {p1}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/d$a;->b:Landroidx/camera/core/impl/l;

    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/impl/d$a;->c:I

    return-void
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/d$a;->f:Z

    return-void
.end method
