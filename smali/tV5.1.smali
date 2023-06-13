.class public LtV5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/util/Rational;

.field public final d:Z


# direct methods
.method public constructor <init>(LKb0;Landroid/util/Rational;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, LJb0;->i()I

    move-result v0

    iput v0, p0, LtV5;->a:I

    invoke-interface {p1}, LJb0;->b()I

    move-result p1

    iput p1, p0, LtV5;->b:I

    iput-object p2, p0, LtV5;->c:Landroid/util/Rational;

    const/4 p1, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/util/Rational;->getNumerator()I

    move-result v0

    invoke-virtual {p2}, Landroid/util/Rational;->getDenominator()I

    move-result p2

    if-lt v0, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    iput-boolean p1, p0, LtV5;->d:Z

    return-void
.end method

.method public static a(Landroid/util/Size;III)Landroid/util/Size;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1, p2, p3}, LtV5;->e(III)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result p0

    invoke-direct {p1, p2, p0}, Landroid/util/Size;-><init>(II)V

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method public static b(Landroid/util/Size;Ljava/util/List;)Landroid/util/Rational;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Landroid/util/Rational;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1}, LsV5;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Rational;

    invoke-static {p0, v0}, LJo;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_2
    new-instance p1, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    invoke-direct {p1, v0, p0}, Landroid/util/Rational;-><init>(II)V

    return-object p1
.end method

.method public static e(III)Z
    .locals 2

    invoke-static {p0}, Lac0;->b(I)I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne v1, p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-static {p0, p2, p1}, Lac0;->a(IIZ)I

    move-result p0

    const/16 p1, 0x5a

    if-eq p0, p1, :cond_1

    const/16 p1, 0x10e

    if-ne p0, p1, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    return v0
.end method


# virtual methods
.method public final c(Landroidx/camera/core/impl/k;Ljava/util/List;)Landroid/util/Rational;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Landroid/util/Rational;"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/camera/core/impl/k;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/impl/k;->I()I

    move-result p1

    iget-boolean p2, p0, LtV5;->d:Z

    invoke-static {p1, p2}, LsV5;->g(IZ)Landroid/util/Rational;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LtV5;->d(Landroidx/camera/core/impl/k;)Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1, p2}, LtV5;->b(Landroid/util/Size;Ljava/util/List;)Landroid/util/Rational;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final d(Landroidx/camera/core/impl/k;)Landroid/util/Size;
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/k;->s(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/k;->u(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    iget v1, p0, LtV5;->b:I

    iget v2, p0, LtV5;->a:I

    invoke-static {p1, v0, v1, v2}, LtV5;->a(Landroid/util/Size;III)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;Landroidx/camera/core/impl/s;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroidx/camera/core/impl/s<",
            "*>;)",
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

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Landroidx/camera/core/impl/k;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Landroidx/camera/core/impl/k;->i(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    if-eqz v2, :cond_1

    invoke-static {v3}, LIB5;->a(Landroid/util/Size;)I

    move-result v4

    invoke-static {v2}, LIB5;->a(Landroid/util/Size;)I

    move-result v5

    if-ge v4, v5, :cond_2

    :cond_1
    move-object v2, v3

    :cond_2
    invoke-virtual {p0, p2}, LtV5;->d(Landroidx/camera/core/impl/k;)Landroid/util/Size;

    move-result-object v3

    sget-object v4, LIB5;->c:Landroid/util/Size;

    invoke-static {v4}, LIB5;->a(Landroid/util/Size;)I

    move-result v5

    invoke-static {v2}, LIB5;->a(Landroid/util/Size;)I

    move-result v6

    if-ge v6, v5, :cond_3

    sget-object v4, LIB5;->a:Landroid/util/Size;

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    invoke-static {v3}, LIB5;->a(Landroid/util/Size;)I

    move-result v6

    if-ge v6, v5, :cond_4

    move-object v4, v3

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Size;

    invoke-static {v5}, LIB5;->a(Landroid/util/Size;)I

    move-result v6

    invoke-static {v2}, LIB5;->a(Landroid/util/Size;)I

    move-result v7

    if-gt v6, v7, :cond_5

    invoke-static {v5}, LIB5;->a(Landroid/util/Size;)I

    move-result v6

    invoke-static {v4}, LIB5;->a(Landroid/util/Size;)I

    move-result v7

    if-lt v6, v7, :cond_5

    invoke-interface {p1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0, p2, p1}, LtV5;->c(Landroidx/camera/core/impl/k;Ljava/util/List;)Landroid/util/Rational;

    move-result-object v0

    if-nez v3, :cond_7

    invoke-interface {p2, v1}, Landroidx/camera/core/impl/k;->J(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v3

    :cond_7
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    if-nez v0, :cond_8

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eqz v3, :cond_c

    invoke-static {p2, v3}, LsV5;->l(Ljava/util/List;Landroid/util/Size;)Ljava/util/List;

    move-result-object p2

    goto :goto_4

    :cond_8
    invoke-static {p1}, LsV5;->h(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Rational;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4, v3}, LsV5;->l(Ljava/util/List;Landroid/util/Size;)Ljava/util/List;

    move-result-object v4

    invoke-interface {p1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, LJo$a;

    iget-object v3, p0, LtV5;->c:Landroid/util/Rational;

    invoke-direct {v2, v0, v3}, LJo$a;-><init>(Landroid/util/Rational;Landroid/util/Rational;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Rational;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    :goto_4
    return-object p2

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "All supported output sizes are filtered out according to current resolution selection settings."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
