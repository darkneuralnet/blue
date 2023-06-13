.class public final Lcx9;
.super LZv9;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LZv9;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(LVx9;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcx9;->d(LVx9;)LPv9;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b(LXx9;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, LPv9;

    invoke-virtual {p0, p1, p2}, Lcx9;->e(LXx9;LPv9;)V

    return-void
.end method

.method public final d(LVx9;)LPv9;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LVx9;->q()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LVx9;->k()V

    sget-object p1, LSv9;->b:LSv9;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, LXv9;

    invoke-virtual {p1}, LVx9;->p()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, LXv9;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_2
    invoke-virtual {p1}, LVx9;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LXv9;

    new-instance v1, Lcw9;

    invoke-direct {v1, p1}, Lcw9;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LXv9;-><init>(Ljava/lang/Number;)V

    return-object v0

    :cond_3
    new-instance v0, LXv9;

    invoke-virtual {p1}, LVx9;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LXv9;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v0, LUv9;

    invoke-direct {v0}, LUv9;-><init>()V

    invoke-virtual {p1}, LVx9;->f()V

    :goto_0
    invoke-virtual {p1}, LVx9;->m()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, LVx9;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcx9;->d(LVx9;)LPv9;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LUv9;->f(Ljava/lang/String;LPv9;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, LVx9;->i()V

    return-object v0

    :cond_6
    new-instance v0, LNv9;

    invoke-direct {v0}, LNv9;-><init>()V

    invoke-virtual {p1}, LVx9;->d()V

    :goto_1
    invoke-virtual {p1}, LVx9;->m()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, Lcx9;->d(LVx9;)LPv9;

    move-result-object v1

    invoke-virtual {v0, v1}, LNv9;->b(LPv9;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, LVx9;->g()V

    return-object v0
.end method

.method public final e(LXx9;LPv9;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_8

    instance-of v0, p2, LSv9;

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p2, LXv9;

    if-eqz v0, :cond_3

    check-cast p2, LXv9;

    invoke-virtual {p2}, LXv9;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LXv9;->c()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, LXx9;->i(Ljava/lang/Number;)LXx9;

    return-void

    :cond_1
    invoke-virtual {p2}, LXv9;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LXv9;->f()Z

    move-result p2

    invoke-virtual {p1, p2}, LXx9;->l(Z)LXx9;

    return-void

    :cond_2
    invoke-virtual {p2}, LXv9;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LXx9;->k(Ljava/lang/String;)LXx9;

    return-void

    :cond_3
    instance-of v0, p2, LNv9;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LXx9;->a()LXx9;

    check-cast p2, LNv9;

    invoke-virtual {p2}, LNv9;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv9;

    invoke-virtual {p0, p1, v0}, Lcx9;->e(LXx9;LPv9;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, LXx9;->c()LXx9;

    return-void

    :cond_5
    instance-of v0, p2, LUv9;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LXx9;->b()LXx9;

    invoke-virtual {p2}, LPv9;->a()LUv9;

    move-result-object p2

    invoke-virtual {p2}, LUv9;->e()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, LXx9;->f(Ljava/lang/String;)LXx9;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv9;

    invoke-virtual {p0, p1, v0}, Lcx9;->e(LXx9;LPv9;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, LXx9;->d()LXx9;

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Couldn\'t write "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, LXx9;->g()LXx9;

    return-void
.end method
