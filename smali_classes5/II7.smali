.class public final LII7;
.super LCy7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LCy7;-><init>()V

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->C:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->D:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->E:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->F:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->G:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->H:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->I:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->J0:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static c(LZG7;Ljava/util/Iterator;LXs7;)LXs7;
    .locals 3

    if-eqz p1, :cond_2

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-interface {p0, v0}, LZG7;->a(LXs7;)Lam8;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lvj7;

    invoke-virtual {v0, v1}, Lam8;->c(Lvj7;)LXs7;

    move-result-object v0

    instance-of v1, v0, Lnl7;

    if-eqz v1, :cond_0

    check-cast v0, Lnl7;

    invoke-virtual {v0}, Lnl7;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "break"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, LXs7;->h0:LXs7;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Lnl7;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "return"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_2
    sget-object p0, LXs7;->h0:LXs7;

    return-object p0
.end method

.method public static d(LZG7;LXs7;LXs7;)LXs7;
    .locals 0

    invoke-interface {p1}, LXs7;->j()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p0, p1, p2}, LII7;->c(LZG7;Ljava/util/Iterator;LXs7;)LXs7;

    move-result-object p0

    return-object p0
.end method

.method public static e(LZG7;LXs7;LXs7;)LXs7;
    .locals 1

    instance-of v0, p1, Ljava/lang/Iterable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p0, p1, p2}, LII7;->c(LZG7;Ljava/util/Iterator;LXs7;)LXs7;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Non-iterable type in for...of loop."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;
    .locals 10

    sget-object v0, LZK7;->c:LZK7;

    invoke-static {p1}, Lbt8;->e(Ljava/lang/String;)LZK7;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x41

    const/4 v2, 0x4

    const-string v3, "return"

    const-string v4, "break"

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v0, v1, :cond_c

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, LCy7;->b(Ljava/lang/String;)LXs7;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object p1, LZK7;->I:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_0

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LgG7;

    invoke-direct {v1, p2, p1}, LgG7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->e(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_OF_LET must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    sget-object p1, LZK7;->H:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_1

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LrF7;

    invoke-direct {v1, p2, p1}, LrF7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->e(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_OF_CONST must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    sget-object p1, LZK7;->G:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_2

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LQH7;

    invoke-direct {v1, p2, p1}, LQH7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->e(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_OF must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    sget-object p1, LZK7;->F:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    instance-of v0, p1, Lvj7;

    if-eqz v0, :cond_8

    check-cast p1, Lvj7;

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXs7;

    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    invoke-virtual {p2}, Lam8;->a()Lam8;

    move-result-object v2

    move v5, v8

    :goto_0
    invoke-virtual {p1}, Lvj7;->f()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-virtual {p1, v5}, Lvj7;->h(I)LXs7;

    move-result-object v6

    invoke-interface {v6}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Lam8;->d(Ljava/lang/String;)LXs7;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lam8;->g(Ljava/lang/String;LXs7;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v5

    invoke-interface {v5}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_7

    move-object v5, p3

    check-cast v5, Lvj7;

    invoke-virtual {p2, v5}, Lam8;->c(Lvj7;)LXs7;

    move-result-object v5

    instance-of v6, v5, Lnl7;

    if-eqz v6, :cond_5

    check-cast v5, Lnl7;

    invoke-virtual {v5}, Lnl7;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v5, LXs7;->h0:LXs7;

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lnl7;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lam8;->a()Lam8;

    move-result-object v5

    move v6, v8

    :goto_2
    invoke-virtual {p1}, Lvj7;->f()I

    move-result v7

    if-ge v6, v7, :cond_6

    invoke-virtual {p1, v6}, Lvj7;->h(I)LXs7;

    move-result-object v7

    invoke-interface {v7}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lam8;->d(Ljava/lang/String;)LXs7;

    move-result-object v9

    invoke-virtual {v5, v7, v9}, Lam8;->g(Ljava/lang/String;LXs7;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v5, v1}, Lam8;->b(LXs7;)LXs7;

    move-object v2, v5

    goto :goto_1

    :cond_7
    sget-object v5, LXs7;->h0:LXs7;

    :goto_3
    return-object v5

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Initializer variables in FOR_LET must be an ArrayList"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    sget-object p1, LZK7;->E:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_9

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LgG7;

    invoke-direct {v1, p2, p1}, LgG7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->d(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_IN_LET must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    sget-object p1, LZK7;->D:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_a

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LrF7;

    invoke-direct {v1, p2, p1}, LrF7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->d(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_IN_CONST must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    sget-object p1, LZK7;->C:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Liw7;

    if-eqz p1, :cond_b

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    new-instance v1, LQH7;

    invoke-direct {v1, p2, p1}, LQH7;-><init>(Lam8;Ljava/lang/String;)V

    invoke-static {v1, v0, p3}, LII7;->d(LZG7;LXs7;LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Variable name in FOR_IN must be a string"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    sget-object p1, LZK7;->J0:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXs7;

    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p3

    invoke-virtual {p2, v1}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    invoke-interface {v1}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_4

    :cond_d
    move-object v1, p3

    check-cast v1, Lvj7;

    invoke-virtual {p2, v1}, Lam8;->c(Lvj7;)LXs7;

    move-result-object v1

    instance-of v2, v1, Lnl7;

    if-eqz v2, :cond_f

    check-cast v1, Lnl7;

    invoke-virtual {v1}, Lnl7;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v1, LXs7;->h0:LXs7;

    goto :goto_5

    :cond_e
    invoke-virtual {v1}, Lnl7;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_5

    :cond_f
    :goto_4
    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    invoke-interface {v1}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_12

    move-object v1, p3

    check-cast v1, Lvj7;

    invoke-virtual {p2, v1}, Lam8;->c(Lvj7;)LXs7;

    move-result-object v1

    instance-of v2, v1, Lnl7;

    if-eqz v2, :cond_11

    check-cast v1, Lnl7;

    invoke-virtual {v1}, Lnl7;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v1, LXs7;->h0:LXs7;

    goto :goto_5

    :cond_10
    invoke-virtual {v1}, Lnl7;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_5

    :cond_11
    invoke-virtual {p2, v0}, Lam8;->b(LXs7;)LXs7;

    goto :goto_4

    :cond_12
    sget-object v1, LXs7;->h0:LXs7;

    :goto_5
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
