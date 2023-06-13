.class public final LoX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LoX2$g;,
        LoX2$f;,
        LoX2$c;,
        LoX2$b;,
        LoX2$a;,
        LoX2$d;,
        LoX2$e;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LmX2;LM0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;",
            "LM0<",
            "+TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, LY0;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1, p0}, LM0;->h(LmX2;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static b(LmX2;LmX2;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;",
            "LmX2<",
            "+TE;>;)Z"
        }
    .end annotation

    instance-of v0, p1, LM0;

    if-eqz v0, :cond_0

    check-cast p1, LM0;

    invoke-static {p0, p1}, LoX2;->a(LmX2;LM0;)Z

    move-result p0

    return p0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-interface {p1}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    invoke-interface {v0}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, LmX2$a;->getCount()I

    move-result v0

    invoke-interface {p0, v1, v0}, LmX2;->H0(Ljava/lang/Object;I)I

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static c(LmX2;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    invoke-static {p0}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, LmX2;

    if-eqz v0, :cond_0

    invoke-static {p1}, LoX2;->d(Ljava/lang/Iterable;)LmX2;

    move-result-object p1

    invoke-static {p0, p1}, LoX2;->b(LmX2;LmX2;)Z

    move-result p0

    return p0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p0, p1}, Lzg2;->a(Ljava/util/Collection;Ljava/util/Iterator;)Z

    move-result p0

    return p0
.end method

.method public static d(Ljava/lang/Iterable;)LmX2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "LmX2<",
            "TT;>;"
        }
    .end annotation

    check-cast p0, LmX2;

    return-object p0
.end method

.method public static e(LmX2;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LmX2;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, LmX2;

    invoke-interface {p0}, LmX2;->size()I

    move-result v1

    invoke-interface {p1}, LmX2;->size()I

    move-result v3

    if-ne v1, v3, :cond_4

    invoke-interface {p0}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LmX2$a;

    invoke-interface {v1}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p0, v3}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v3

    invoke-interface {v1}, LmX2$a;->getCount()I

    move-result v1

    if-eq v3, v1, :cond_2

    return v2

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v2
.end method

.method public static f(LmX2;LIZ3;)LmX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;",
            "LIZ3<",
            "-TE;>;)",
            "LmX2<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p0, LoX2$d;

    if-eqz v0, :cond_0

    check-cast p0, LoX2$d;

    iget-object v0, p0, LoX2$d;->e:LIZ3;

    invoke-static {v0, p1}, LJZ3;->b(LIZ3;LIZ3;)LIZ3;

    move-result-object p1

    new-instance v0, LoX2$d;

    iget-object p0, p0, LoX2$d;->d:LmX2;

    invoke-direct {v0, p0, p1}, LoX2$d;-><init>(LmX2;LIZ3;)V

    return-object v0

    :cond_0
    new-instance v0, LoX2$d;

    invoke-direct {v0, p0, p1}, LoX2$d;-><init>(LmX2;LIZ3;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Object;I)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;I)",
            "LmX2$a<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LoX2$e;

    invoke-direct {v0, p0, p1}, LoX2$e;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static h(LmX2;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;)",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LoX2$f;

    invoke-interface {p0}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LoX2$f;-><init>(LmX2;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public static i(LmX2;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p0}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LmX2$a;

    invoke-interface {v2}, LmX2$a;->getCount()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lg72;->b(J)I

    move-result p0

    return p0
.end method

.method public static j(LmX2;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "*>;",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    instance-of v0, p1, LmX2;

    if-eqz v0, :cond_0

    check-cast p1, LmX2;

    invoke-interface {p1}, LmX2;->F2()Ljava/util/Set;

    move-result-object p1

    :cond_0
    invoke-interface {p0}, LmX2;->F2()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static k(LmX2;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "*>;",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, LmX2;

    if-eqz v0, :cond_0

    check-cast p1, LmX2;

    invoke-interface {p1}, LmX2;->F2()Ljava/util/Set;

    move-result-object p1

    :cond_0
    invoke-interface {p0}, LmX2;->F2()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static l(LmX2;Ljava/lang/Object;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;TE;I)I"
        }
    .end annotation

    const-string v0, "count"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    invoke-interface {p0, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v0

    sub-int/2addr p2, v0

    if-lez p2, :cond_0

    invoke-interface {p0, p1, p2}, LmX2;->H0(Ljava/lang/Object;I)I

    goto :goto_0

    :cond_0
    if-gez p2, :cond_1

    neg-int p2, p2

    invoke-interface {p0, p1, p2}, LmX2;->A2(Ljava/lang/Object;I)I

    :cond_1
    :goto_0
    return v0
.end method

.method public static m(LmX2;Ljava/lang/Object;II)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LmX2<",
            "TE;>;TE;II)Z"
        }
    .end annotation

    const-string v0, "oldCount"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    const-string v0, "newCount"

    invoke-static {p3, v0}, Ldm0;->b(ILjava/lang/String;)I

    invoke-interface {p0, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, p2, :cond_0

    invoke-interface {p0, p1, p3}, LmX2;->Q1(Ljava/lang/Object;I)I

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
