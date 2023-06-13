.class public final Ln38;
.super LW28;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW28;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)I
    .locals 0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb78;

    iget p1, p1, Lb78;->b:I

    return p1
.end method

.method public final b(Ljava/lang/Object;)Ld48;
    .locals 0

    check-cast p1, LQ58;

    iget-object p1, p1, LQ58;->zza:Ld48;

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Ld48;
    .locals 0

    check-cast p1, LQ58;

    invoke-virtual {p1}, LQ58;->H()Ld48;

    move-result-object p1

    return-object p1
.end method

.method public final d(LJ28;Ldj8;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, LJ28;->b(Ldj8;I)Lq78;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LQ58;

    iget-object p1, p1, LQ58;->zza:Ld48;

    invoke-virtual {p1}, Ld48;->g()V

    return-void
.end method

.method public final f(LSx8;Ljava/util/Map$Entry;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb78;

    sget-object v1, Lvx8;->c:Lvx8;

    iget-object v1, v0, Lb78;->c:Lvx8;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    return-void

    :pswitch_0
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->t(IJ)V

    return-void

    :pswitch_1
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->u(II)V

    return-void

    :pswitch_2
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->F(IJ)V

    return-void

    :pswitch_3
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->D(II)V

    return-void

    :pswitch_4
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->o(II)V

    return-void

    :pswitch_5
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->w(II)V

    return-void

    :pswitch_6
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LgZ7;

    invoke-interface {p1, v0, p2}, LSx8;->J(ILgZ7;)V

    return-void

    :pswitch_7
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lrl8;->a()Lrl8;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lrl8;->b(Ljava/lang/Class;)LDo8;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, LSx8;->G(ILjava/lang/Object;LDo8;)V

    return-void

    :pswitch_8
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lrl8;->a()Lrl8;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lrl8;->b(Ljava/lang/Class;)LDo8;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, LSx8;->H(ILjava/lang/Object;LDo8;)V

    return-void

    :pswitch_9
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, LSx8;->r(ILjava/lang/String;)V

    return-void

    :pswitch_a
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->f(IZ)V

    return-void

    :pswitch_b
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->h(II)V

    return-void

    :pswitch_c
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->k(IJ)V

    return-void

    :pswitch_d
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->o(II)V

    return-void

    :pswitch_e
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->B(IJ)V

    return-void

    :pswitch_f
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->m(IJ)V

    return-void

    :pswitch_10
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, LSx8;->j(IF)V

    return-void

    :pswitch_11
    iget v0, v0, Lb78;->b:I

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LSx8;->g(ID)V

    return-void

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

.method public final g(Ldj8;)Z
    .locals 0

    instance-of p1, p1, LQ58;

    return p1
.end method
