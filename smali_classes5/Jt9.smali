.class public abstract LJt9;
.super Lqw9;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public transient d:Ljava/util/Map;

.field public transient e:I


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Lqw9;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LJt9;->d:Ljava/util/Map;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static synthetic f(LJt9;)I
    .locals 2

    iget v0, p0, LJt9;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LJt9;->e:I

    return v0
.end method

.method public static synthetic g(LJt9;)I
    .locals 2

    iget v0, p0, LJt9;->e:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, LJt9;->e:I

    return v0
.end method

.method public static synthetic j(LJt9;I)I
    .locals 1

    iget v0, p0, LJt9;->e:I

    add-int/2addr v0, p1

    iput v0, p0, LJt9;->e:I

    return v0
.end method

.method public static synthetic k(LJt9;I)I
    .locals 1

    iget v0, p0, LJt9;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, LJt9;->e:I

    return v0
.end method

.method public static synthetic n(LJt9;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LJt9;->d:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic o(LJt9;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LJt9;->d:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    iget p1, p0, LJt9;->e:I

    sub-int/2addr p1, v0

    iput p1, p0, LJt9;->e:I

    :cond_0
    return-void
.end method


# virtual methods
.method final a()Ljava/util/Map;
    .locals 2

    new-instance v0, LI49;

    iget-object v1, p0, LJt9;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, LI49;-><init>(LJt9;Ljava/util/Map;)V

    return-object v0
.end method

.method final b()Ljava/util/Set;
    .locals 2

    new-instance v0, Lfd9;

    iget-object v1, p0, LJt9;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lfd9;-><init>(LJt9;Ljava/util/Map;)V

    return-object v0
.end method

.method abstract c()Ljava/util/Collection;
.end method

.method e(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, LJt9;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, LJt9;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, LJt9;->e:I

    add-int/2addr p2, v1

    iput p2, p0, LJt9;->e:I

    iget-object p2, p0, LJt9;->d:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "New Collection violated the Collection spec"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, LJt9;->e:I

    add-int/2addr p1, v1

    iput p1, p0, LJt9;->e:I

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LJt9;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LJt9;->c()Ljava/util/Collection;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, p1, v0}, LJt9;->e(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/Object;Ljava/util/List;LDo9;)Ljava/util/List;
    .locals 1

    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Lzh9;

    invoke-direct {v0, p0, p1, p2, p3}, Lzh9;-><init>(LJt9;Ljava/lang/Object;Ljava/util/List;LDo9;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lgs9;

    invoke-direct {v0, p0, p1, p2, p3}, Lgs9;-><init>(LJt9;Ljava/lang/Object;Ljava/util/List;LDo9;)V

    :goto_0
    return-object v0
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, LJt9;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJt9;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput v0, p0, LJt9;->e:I

    return-void
.end method
