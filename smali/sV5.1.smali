.class public LsV5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LKb0;

.field public final b:Landroid/util/Rational;

.field public final c:Z

.field public final d:LtV5;


# direct methods
.method public constructor <init>(LKb0;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsV5;->a:LKb0;

    invoke-virtual {p0, p1}, LsV5;->a(LKb0;)Landroid/util/Rational;

    move-result-object v0

    iput-object v0, p0, LsV5;->b:Landroid/util/Rational;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/util/Rational;->getNumerator()I

    move-result v2

    invoke-virtual {v0}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    if-lt v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    iput-boolean v1, p0, LsV5;->c:Z

    new-instance v1, LtV5;

    invoke-direct {v1, p1, v0}, LtV5;-><init>(LKb0;Landroid/util/Rational;)V

    iput-object v1, p0, LsV5;->d:LtV5;

    return-void
.end method

.method public static b(Ljava/util/List;Landroidx/camera/core/m;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroidx/camera/core/m;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Landroidx/camera/core/m;->a()Landroid/util/Size;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-static {v1, p1}, LIB5;->b(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    return-object v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Resolution candidate list is empty after filtering out by the settings!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Rational;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LJo;->a:Landroid/util/Rational;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, LJo;->c:Landroid/util/Rational;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Rational;

    invoke-static {v1, v4}, LJo;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static g(IZ)Landroid/util/Rational;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_4

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Undefined target aspect ratio: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "SupportedOutputSizesCollector"

    invoke-static {p1, p0}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p0, LJo;->c:Landroid/util/Rational;

    goto :goto_1

    :cond_1
    sget-object p0, LJo;->d:Landroid/util/Rational;

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    sget-object p0, LJo;->a:Landroid/util/Rational;

    goto :goto_1

    :cond_3
    sget-object p0, LJo;->b:Landroid/util/Rational;

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static h(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/Map<",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, LsV5;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Rational;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Rational;

    invoke-static {v1, v3}, LJo;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static l(Ljava/util/List;Landroid/util/Size;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Size;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v5

    if-lt v4, v5, :cond_1

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v5

    if-lt v4, v5, :cond_1

    invoke-interface {v0, v1, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final a(LKb0;)Landroid/util/Rational;
    .locals 2

    const/16 v0, 0x100

    invoke-interface {p1, v0}, LKb0;->l(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, LTp0;

    invoke-direct {v0}, LTp0;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    new-instance v0, Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/util/Rational;-><init>(II)V

    return-object v0
.end method

.method public final c(ILandroidx/camera/core/impl/k;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/camera/core/impl/k;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroidx/camera/core/impl/k;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    iget-object p1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, [Landroid/util/Size;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final d(Landroidx/camera/core/impl/s;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/camera/core/impl/j;->l()I

    move-result v0

    check-cast p1, Landroidx/camera/core/impl/k;

    invoke-virtual {p0, v0, p1}, LsV5;->c(ILandroidx/camera/core/impl/k;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LsV5;->a:LKb0;

    invoke-interface {v1, v0}, LKb0;->l(I)Ljava/util/List;

    move-result-object v1

    :cond_0
    const/4 v2, 0x0

    invoke-interface {p1, v2}, Landroidx/camera/core/impl/k;->z(Landroidx/camera/core/m;)Landroidx/camera/core/m;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/impl/k;->A()Landroidx/camera/core/m;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/m;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, LsV5;->a:LKb0;

    invoke-interface {v1, v0}, LKb0;->j(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p1

    :cond_1
    return-object v1
.end method

.method public f(Landroidx/camera/core/impl/s;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Landroidx/camera/core/impl/k;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0, p1}, LsV5;->d(Landroidx/camera/core/impl/s;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->z(Landroidx/camera/core/m;)Landroidx/camera/core/m;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v0, p0, LsV5;->d:LtV5;

    invoke-virtual {v0, v2, p1}, LtV5;->f(Ljava/util/List;Landroidx/camera/core/impl/s;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v3}, Landroidx/camera/core/m;->c()Landroid/util/Size;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/k;->J(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    :cond_2
    invoke-virtual {p0, v2, v3, p1}, LsV5;->k(Ljava/util/List;Landroidx/camera/core/m;Landroid/util/Size;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/util/List;Landroidx/camera/core/m;Landroid/util/Size;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroidx/camera/core/m;",
            "Landroid/util/Size;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Landroidx/camera/core/m;->b()I

    move-result v0

    iget-boolean v1, p0, LsV5;->c:Z

    invoke-static {v0, v1}, LsV5;->g(IZ)Landroid/util/Rational;

    move-result-object v0

    const-string v1, "ResolutionSelector should also have aspect ratio value."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Landroidx/camera/core/m;->c()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, LsV5;->j(Ljava/util/List;Landroid/util/Rational;Landroid/util/Size;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 p3, 0x0

    invoke-interface {p1, p3, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public final j(Ljava/util/List;Landroid/util/Rational;Landroid/util/Size;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Rational;",
            "Landroid/util/Size;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, LsV5;->h(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Rational;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2, p3}, LsV5;->l(Ljava/util/List;Landroid/util/Size;)Ljava/util/List;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, LJo$a;

    iget-object v1, p0, LsV5;->b:Landroid/util/Rational;

    invoke-direct {v0, p2, v1}, LJo$a;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    invoke-static {p3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Rational;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object p2
.end method

.method public final k(Ljava/util/List;Landroidx/camera/core/m;Landroid/util/Size;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroidx/camera/core/m;",
            "Landroid/util/Size;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, LTp0;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, LTp0;-><init>(Z)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0, p2}, LsV5;->b(Ljava/util/List;Landroidx/camera/core/m;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, LsV5;->i(Ljava/util/List;Landroidx/camera/core/m;Landroid/util/Size;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
