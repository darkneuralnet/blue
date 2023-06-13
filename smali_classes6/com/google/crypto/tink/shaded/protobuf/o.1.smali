.class public final Lcom/google/crypto/tink/shaded/protobuf/o;
.super Lcom/google/crypto/tink/shaded/protobuf/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/n<",
        "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map$Entry;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result p1

    return p1
.end method

.method public b(Lcom/google/crypto/tink/shaded/protobuf/m;Lcom/google/crypto/tink/shaded/protobuf/F;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m;->a(Lcom/google/crypto/tink/shaded/protobuf/F;I)Lcom/google/crypto/tink/shaded/protobuf/t$e;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$c;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/t$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/q;

    return-object p1
.end method

.method public d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/t$c;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$c;->F()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/google/crypto/tink/shaded/protobuf/F;)Z
    .locals 0

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/t$c;

    return p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->s()V

    return-void
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/L;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/m;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/P;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/L;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;TUB;",
            "Lcom/google/crypto/tink/shaded/protobuf/P<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->c()I

    move-result v0

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isRepeated()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/o$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->a()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p3, p3, v1

    packed-switch p3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type cannot be packed: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getLiteType()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->z(Ljava/util/List;)V

    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->b()Lcom/google/crypto/tink/shaded/protobuf/v$d;

    move-result-object p1

    invoke-static {v0, p3, p1, p5, p6}, Lcom/google/crypto/tink/shaded/protobuf/N;->z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v$d;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/P;)Ljava/lang/Object;

    move-result-object p5

    goto/16 :goto_0

    :pswitch_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->a(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->i(Ljava/util/List;)V

    goto :goto_0

    :pswitch_3
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->k(Ljava/util/List;)V

    goto :goto_0

    :pswitch_4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->v(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->D(Ljava/util/List;)V

    goto :goto_0

    :pswitch_6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->g(Ljava/util/List;)V

    goto :goto_0

    :pswitch_7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->m(Ljava/util/List;)V

    goto :goto_0

    :pswitch_8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->C(Ljava/util/List;)V

    goto :goto_0

    :pswitch_9
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->l(Ljava/util/List;)V

    goto :goto_0

    :pswitch_a
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->x(Ljava/util/List;)V

    goto :goto_0

    :pswitch_b
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->y(Ljava/util/List;)V

    goto :goto_0

    :pswitch_c
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->p(Ljava/util/List;)V

    goto :goto_0

    :pswitch_d
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->s(Ljava/util/List;)V

    :goto_0
    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->w(Lcom/google/crypto/tink/shaded/protobuf/q$b;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->a()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v1

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/U$b;->q:Lcom/google/crypto/tink/shaded/protobuf/U$b;

    if-ne v1, v2, :cond_2

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->B()I

    move-result p1

    iget-object p3, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->b()Lcom/google/crypto/tink/shaded/protobuf/v$d;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/google/crypto/tink/shaded/protobuf/v$d;->findValueByNumber(I)Lcom/google/crypto/tink/shaded/protobuf/v$c;

    move-result-object p3

    if-nez p3, :cond_1

    invoke-static {v0, p1, p5, p6}, Lcom/google/crypto/tink/shaded/protobuf/N;->L(IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/P;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_1

    :cond_2
    sget-object p6, Lcom/google/crypto/tink/shaded/protobuf/o$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->a()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p6, p6, v0

    packed-switch p6, :pswitch_data_1

    const/4 p1, 0x0

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->O(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->K(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_10
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->G()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_11
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->h()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->F()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_14
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :pswitch_15
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :pswitch_16
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->H()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :pswitch_17
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :pswitch_18
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->w()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :pswitch_19
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->E()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :pswitch_1a
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :pswitch_1b
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->B()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :pswitch_1c
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :pswitch_1d
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :pswitch_1e
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :pswitch_1f
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->readDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->d()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->a(Lcom/google/crypto/tink/shaded/protobuf/q$b;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/o$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->a()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Enum;->ordinal()I

    move-result p6

    aget p3, p3, p6

    const/16 p6, 0x11

    if-eq p3, p6, :cond_4

    const/16 p6, 0x12

    if-eq p3, p6, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->i(Lcom/google/crypto/tink/shaded/protobuf/q$b;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-static {p3, p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_5
    :goto_2
    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->w(Lcom/google/crypto/tink/shaded/protobuf/q$b;Ljava/lang/Object;)V

    :goto_3
    return-object p5

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method public h(Lcom/google/crypto/tink/shaded/protobuf/L;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/m;Lcom/google/crypto/tink/shaded/protobuf/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/L;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/L;->O(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->w(Lcom/google/crypto/tink/shaded/protobuf/q$b;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Lcom/google/crypto/tink/shaded/protobuf/g;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/m;Lcom/google/crypto/tink/shaded/protobuf/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/g;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/m;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "Lcom/google/crypto/tink/shaded/protobuf/t$d;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/F;->newBuilderForType()Lcom/google/crypto/tink/shaded/protobuf/F$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/F$a;->E()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/e;->Q(Ljava/nio/ByteBuffer;Z)Lcom/google/crypto/tink/shaded/protobuf/e;

    move-result-object p1

    invoke-static {}, LM94;->a()LM94;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p3}, LM94;->b(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/L;Lcom/google/crypto/tink/shaded/protobuf/m;)V

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/t$e;->b:Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {p4, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/q;->w(Lcom/google/crypto/tink/shaded/protobuf/q$b;Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->n()I

    move-result p1

    const p2, 0x7fffffff

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->b()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public j(Lcom/google/crypto/tink/shaded/protobuf/V;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/V;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/t$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isRepeated()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/o$a;->a:[I

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getLiteType()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, LM94;->a()LM94;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/N;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/M;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, LM94;->a()LM94;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/N;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Lcom/google/crypto/tink/shaded/protobuf/M;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/N;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/N;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->e0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->isPacked()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/N;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/V;Z)V

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/o$a;->a:[I

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getLiteType()Lcom/google/crypto/tink/shaded/protobuf/U$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LM94;->a()LM94;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->M(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/M;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LM94;->a()LM94;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, LM94;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->K(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/M;)V

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->d(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->O(ILcom/google/crypto/tink/shaded/protobuf/g;)V

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->g(II)V

    goto/16 :goto_0

    :pswitch_17
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->j(IJ)V

    goto/16 :goto_0

    :pswitch_18
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->I(II)V

    goto/16 :goto_0

    :pswitch_19
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->w(IJ)V

    goto/16 :goto_0

    :pswitch_1a
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->o(II)V

    goto/16 :goto_0

    :pswitch_1b
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->k(II)V

    goto/16 :goto_0

    :pswitch_1c
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->n(IZ)V

    goto/16 :goto_0

    :pswitch_1d
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->c(II)V

    goto :goto_0

    :pswitch_1e
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->m(IJ)V

    goto :goto_0

    :pswitch_1f
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->g(II)V

    goto :goto_0

    :pswitch_20
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->e(IJ)V

    goto :goto_0

    :pswitch_21
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->C(IJ)V

    goto :goto_0

    :pswitch_22
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/V;->F(IF)V

    goto :goto_0

    :pswitch_23
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t$d;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V;->z(ID)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method
