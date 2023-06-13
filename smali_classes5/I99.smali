.class public final LI99;
.super LU89;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LU89;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)I
    .locals 0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lab9;

    const p1, 0xc0b2142

    return p1
.end method

.method public final b(Ljava/lang/Object;)Lda9;
    .locals 0

    check-cast p1, LTa9;

    iget-object p1, p1, LTa9;->zzb:Lda9;

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Lda9;
    .locals 0

    check-cast p1, LTa9;

    invoke-virtual {p1}, LTa9;->u()Lda9;

    move-result-object p1

    return-object p1
.end method

.method public final d(LN89;Lpg9;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, LN89;->c(Lpg9;I)Lhb9;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LTa9;

    iget-object p1, p1, LTa9;->zzb:Lda9;

    invoke-virtual {p1}, Lda9;->h()V

    return-void
.end method

.method public final f(Lpg9;)Z
    .locals 0

    instance-of p1, p1, LTa9;

    return p1
.end method

.method public final g(Lh89;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab9;

    sget-object v1, Lfn9;->c:Lfn9;

    iget-object v0, v0, Lab9;->d:Lfn9;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0xc0b2142

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->x(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->w(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_2
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->v(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_3
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->u(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_4
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->r(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_5
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->z(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_6
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1}, LTi9;->k(ILjava/util/List;Lh89;)V

    return-void

    :pswitch_7
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object v0

    invoke-static {v2, p2, p1, v0}, LTi9;->t(ILjava/util/List;Lh89;LEi9;)V

    return-void

    :pswitch_8
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lhi9;->a()Lhi9;

    move-result-object v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Lhi9;->b(Ljava/lang/Class;)LEi9;

    move-result-object v0

    invoke-static {v2, p2, p1, v0}, LTi9;->q(ILjava/util/List;Lh89;LEi9;)V

    return-void

    :pswitch_9
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1}, LTi9;->y(ILjava/util/List;Lh89;)V

    return-void

    :pswitch_a
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->j(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_b
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->n(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_c
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->o(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_d
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->r(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_e
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->B(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_f
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->s(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_10
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->p(ILjava/util/List;Lh89;Z)V

    return-void

    :pswitch_11
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v2, p2, p1, v1}, LTi9;->l(ILjava/util/List;Lh89;Z)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
