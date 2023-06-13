.class public final LMx7;
.super LCy7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LCy7;-><init>()V

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->g:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->h:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->i:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->j:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->k:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->l:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LCy7;->a:Ljava/util/List;

    sget-object v1, LZK7;->m:LZK7;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lam8;Ljava/util/List;)LXs7;
    .locals 7

    sget-object v0, LZK7;->c:LZK7;

    invoke-static {p1}, Lbt8;->e(Ljava/lang/String;)LZK7;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-wide/16 v1, 0x1f

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, LCy7;->b(Ljava/lang/String;)LXs7;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object p1, LZK7;->m:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lbt8;->b(D)I

    move-result p1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lbt8;->b(D)I

    move-result p2

    xor-int/2addr p1, p2

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_1
    sget-object p1, LZK7;->l:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Lbt8;->d(D)J

    move-result-wide v5

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Lbt8;->d(D)J

    move-result-wide p1

    and-long/2addr p1, v1

    long-to-int p1, p1

    ushr-long p1, v5, p1

    long-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_2
    sget-object p1, LZK7;->k:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Lbt8;->b(D)I

    move-result p1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lbt8;->d(D)J

    move-result-wide p2

    and-long/2addr p2, v1

    long-to-int p2, p2

    shr-int/2addr p1, p2

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_3
    sget-object p1, LZK7;->j:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lbt8;->b(D)I

    move-result p1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lbt8;->b(D)I

    move-result p2

    or-int/2addr p1, p2

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_4
    sget-object p1, LZK7;->i:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Lbt8;->b(D)I

    move-result p1

    not-int p1, p1

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_5
    sget-object p1, LZK7;->h:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Lbt8;->b(D)I

    move-result p1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lbt8;->d(D)J

    move-result-wide p2

    and-long/2addr p2, v1

    long-to-int p2, p2

    shl-int/2addr p1, p2

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    :pswitch_6
    sget-object p1, LZK7;->g:LZK7;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, p3}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXs7;

    invoke-virtual {p2, p1}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lbt8;->b(D)I

    move-result p1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LXs7;

    invoke-virtual {p2, p3}, Lam8;->b(LXs7;)LXs7;

    move-result-object p2

    invoke-interface {p2}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lbt8;->b(D)I

    move-result p2

    and-int/2addr p1, p2

    int-to-double p1, p1

    new-instance p3, Lkm7;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p3, p1}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p3

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
