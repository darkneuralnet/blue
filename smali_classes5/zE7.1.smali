.class public final LzE7;
.super LCy7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LCy7;-><init>()V

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->d:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->r0:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->u0:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;
    .locals 5

    sget-object v0, LZK7;->c:LZK7;

    invoke-static {p1}, Lbt8;->e(Ljava/lang/String;)LZK7;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    const/16 v4, 0x2f

    if-eq v0, v4, :cond_2

    const/16 v4, 0x32

    if-eq v0, v4, :cond_0

    invoke-super {p0, p1}, LCy7;->b(Ljava/lang/String;)LXs7;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, LZK7;->u0:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, LZK7;->r0:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    new-instance p2, Lsk7;

    invoke-interface {p1}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Lsk7;-><init>(Ljava/lang/Boolean;)V

    return-object p2

    :cond_3
    sget-object p1, LZK7;->d:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzg()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    return-object p1

    :cond_4
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    return-object p1
.end method
