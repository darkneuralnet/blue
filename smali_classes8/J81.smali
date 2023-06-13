.class public LJ81;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LSd6;IIZLjava/lang/Appendable;LxX5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;IIZ",
            "Ljava/lang/Appendable;",
            "LxX5;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_0

    const/16 p3, 0xb7

    invoke-interface {p4, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p3, p5}, LJ81;->b(LSd6;Ljava/lang/Appendable;LxX5;)I

    move-result p0

    const/4 p5, 0x2

    const/16 v0, 0x29

    const/4 v1, 0x0

    if-ge p0, p5, :cond_1

    const/16 p0, 0x28

    invoke-virtual {p3, v1, p0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {p4, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/4 p0, 0x1

    if-ne p2, p0, :cond_2

    if-ne p1, p0, :cond_2

    goto/16 :goto_2

    :cond_2
    if-ne p2, p0, :cond_3

    if-le p1, p0, :cond_3

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-ge v1, p1, :cond_5

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 p1, 0x2079

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_1
    const/16 p1, 0x2078

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_2
    const/16 p1, 0x2077

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_3
    const/16 p1, 0x2076

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_4
    const/16 p1, 0x2075

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_5
    const/16 p1, 0x2074

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_6
    const/16 p1, 0xb3

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_7
    const/16 p1, 0xb2

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_8
    const/16 p1, 0xb9

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_9
    const/16 p1, 0x2070

    invoke-interface {p4, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-ne p2, p0, :cond_4

    const/16 p0, 0x5e

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_4
    const-string p0, "^("

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/16 p0, 0x2f

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p4, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p4, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x30
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

.method public static b(LSd6;Ljava/lang/Appendable;LxX5;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/Appendable;",
            "LxX5;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p0, LFf;

    if-eqz v0, :cond_0

    check-cast p0, LFf;

    invoke-virtual {p0}, LFf;->L()LSd6;

    move-result-object p0

    :cond_0
    invoke-virtual {p2, p0}, LxX5;->d(LSd6;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, LJ81;->c(Ljava/lang/Appendable;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    instance-of v0, p0, Lq74;

    if-eqz v0, :cond_2

    invoke-interface {p0}, LSd6;->l()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p2}, LJ81;->d(LSd6;Ljava/lang/Appendable;LxX5;)I

    move-result p0

    return p0

    :cond_2
    instance-of v0, p0, LyE;

    if-eqz v0, :cond_3

    check-cast p0, LyE;

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LJ81;->c(Ljava/lang/Appendable;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_3
    invoke-interface {p0}, LSd6;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, LSd6;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LJ81;->c(Ljava/lang/Appendable;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, LSd6;->G()LSd6;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Lu1;

    invoke-interface {v2}, LRp0;->b0()Lae6;

    move-result-object v2

    sget-object v3, Lie6;->h:LSd6;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v1, Lie6;->l:LSd6;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p2, v1}, LxX5;->d(LSd6;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const p0, 0x7fffffff

    return p0

    :cond_5
    instance-of v2, p0, LB96;

    if-eqz v2, :cond_6

    move-object v2, p0

    check-cast v2, LB96;

    invoke-virtual {v2}, LB96;->L()Lae6;

    move-result-object v2

    goto :goto_0

    :cond_6
    invoke-interface {p0, v1}, LSd6;->k(LSd6;)Lae6;

    move-result-object v2

    goto :goto_0

    :cond_7
    sget-object v3, Lie6;->L:LSd6;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v2, :cond_9

    sget-object v1, Lie6;->U:LSd6;

    goto :goto_0

    :cond_8
    sget-object v3, Lie6;->i:LSd6;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    :cond_9
    :goto_0
    instance-of v3, p0, LB96;

    if-eqz v3, :cond_b

    check-cast p0, LB96;

    if-nez v1, :cond_a

    invoke-virtual {p0}, Lu1;->G()LSd6;

    move-result-object v1

    :cond_a
    invoke-virtual {p0}, LB96;->L()Lae6;

    move-result-object v2

    :cond_b
    invoke-static {v1, v0, p2}, LJ81;->b(LSd6;Ljava/lang/Appendable;LxX5;)I

    move-result p0

    sget-object v3, Lu1;->d:LSd6;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v2, v1, p0, v0, p2}, LuB0;->d(Lae6;ZILjava/lang/StringBuilder;LxX5;)I

    move-result p0

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return p0
.end method

.method public static c(Ljava/lang/Appendable;Ljava/lang/String;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const p0, 0x7fffffff

    return p0
.end method

.method public static d(LSd6;Ljava/lang/Appendable;LxX5;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/Appendable;",
            "LxX5;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, LSd6;->l()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ltz v8, :cond_0

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, LSd6;

    const/4 v9, 0x1

    xor-int/lit8 v10, v4, 0x1

    move-object v11, p1

    move-object v12, p2

    invoke-static/range {v7 .. v12}, LJ81;->a(LSd6;IIZLjava/lang/Appendable;LxX5;)V

    move v4, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-lez v3, :cond_6

    if-eqz v4, :cond_2

    const/16 v0, 0x31

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    const/16 v0, 0x2f

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    if-le v3, v2, :cond_3

    const/16 v0, 0x28

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_3
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v0, v2

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gez v5, :cond_4

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, LSd6;

    neg-int v7, v5

    const/4 v8, 0x1

    xor-int/lit8 v9, v0, 0x1

    move-object v10, p1

    move-object v11, p2

    invoke-static/range {v6 .. v11}, LJ81;->a(LSd6;IIZLjava/lang/Appendable;LxX5;)V

    move v0, v1

    goto :goto_1

    :cond_5
    if-le v3, v2, :cond_6

    const/16 p0, 0x29

    invoke-interface {p1, p0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_6
    const/4 p0, 0x2

    return p0
.end method
