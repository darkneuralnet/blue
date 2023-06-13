.class public Lnv2;
.super Lv1;
.source "SourceFile"


# static fields
.field public static final b:Lnv2;


# instance fields
.field public final transient a:LxX5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnv2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lnv2;

    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".messages"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;)Ljava/util/ResourceBundle;

    move-result-object v1

    invoke-static {v1}, LxX5;->g(Ljava/util/ResourceBundle;)LxX5;

    move-result-object v1

    invoke-direct {v0, v1}, Lnv2;-><init>(LxX5;)V

    sput-object v0, Lnv2;->b:Lnv2;

    return-void
.end method

.method public constructor <init>(LxX5;)V
    .locals 0

    invoke-direct {p0}, Lv1;-><init>()V

    iput-object p1, p0, Lnv2;->a:LxX5;

    return-void
.end method

.method public static f()Lnv2;
    .locals 1

    sget-object v0, Lnv2;->b:Lnv2;

    return-object v0
.end method


# virtual methods
.method public a(LSd6;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/Appendable;",
            ")",
            "Ljava/lang/Appendable;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lu1;

    if-nez v0, :cond_0

    invoke-interface {p1}, LSd6;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lnv2;->e(LSd6;Ljava/lang/Appendable;)I

    return-object p2
.end method

.method public final d(LSd6;IIZLjava/lang/Appendable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;IIZ",
            "Ljava/lang/Appendable;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p4, :cond_0

    const/16 p4, 0xb7

    invoke-interface {p5, p4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    new-instance p4, Ljava/lang/StringBuffer;

    invoke-direct {p4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0, p1, p4}, Lnv2;->e(LSd6;Ljava/lang/Appendable;)I

    move-result p1

    const/4 v0, 0x2

    const/16 v1, 0x29

    const/4 v2, 0x0

    if-ge p1, v0, :cond_1

    const/16 p1, 0x28

    invoke-virtual {p4, v2, p1}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_1
    invoke-interface {p5, p4}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/4 p1, 0x1

    if-ne p3, p1, :cond_2

    if-ne p2, p1, :cond_2

    goto/16 :goto_2

    :cond_2
    if-ne p3, p1, :cond_3

    if-le p2, p1, :cond_3

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v2, p2, :cond_5

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 p2, 0x2079

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_1
    const/16 p2, 0x2078

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_2
    const/16 p2, 0x2077

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_3
    const/16 p2, 0x2076

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_4
    const/16 p2, 0x2075

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_5
    const/16 p2, 0x2074

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_6
    const/16 p2, 0xb3

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_7
    const/16 p2, 0xb2

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_8
    const/16 p2, 0xb9

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :pswitch_9
    const/16 p2, 0x2070

    invoke-interface {p5, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-ne p3, p1, :cond_4

    const-string p1, "^"

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_4
    const-string p1, "^("

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/16 p1, 0x2f

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p5, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

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

.method public final e(LSd6;Ljava/lang/Appendable;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/Appendable;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, LFf;

    if-eqz v0, :cond_0

    check-cast p1, LFf;

    invoke-virtual {p1}, LFf;->L()LSd6;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lnv2;->a:LxX5;

    move-object v1, p1

    check-cast v1, Lu1;

    invoke-virtual {v0, v1}, LxX5;->d(LSd6;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return v1

    :cond_1
    instance-of v0, p1, Lq74;

    const/4 v2, 0x1

    if-eqz v0, :cond_9

    invoke-interface {p1}, LSd6;->l()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, LSd6;->l()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v3, v1

    move v4, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ltz v9, :cond_2

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, LSd6;

    const/4 v10, 0x1

    xor-int/lit8 v11, v4, 0x1

    move-object v7, p0

    move-object v12, p2

    invoke-virtual/range {v7 .. v12}, Lnv2;->d(LSd6;IIZLjava/lang/Appendable;)V

    move v4, v1

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-lez v3, :cond_8

    if-eqz v4, :cond_4

    const/16 v0, 0x31

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_4
    const/16 v0, 0x2f

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    if-le v3, v2, :cond_5

    const/16 v0, 0x28

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_5
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v0, v2

    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gez v5, :cond_6

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, LSd6;

    neg-int v8, v5

    const/4 v9, 0x1

    xor-int/lit8 v10, v0, 0x1

    move-object v6, p0

    move-object v11, p2

    invoke-virtual/range {v6 .. v11}, Lnv2;->d(LSd6;IIZLjava/lang/Appendable;)V

    move v0, v1

    goto :goto_1

    :cond_7
    if-le v3, v2, :cond_8

    const/16 p1, 0x29

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_8
    const/4 p1, 0x2

    return p1

    :cond_9
    instance-of v0, p1, LyE;

    if-eqz v0, :cond_a

    check-cast p1, LyE;

    invoke-virtual {p1}, Lu1;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return v1

    :cond_a
    instance-of v0, p1, LV9;

    if-eqz v0, :cond_b

    invoke-interface {p1}, LSd6;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return v1

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, LSd6;->G()LSd6;

    move-result-object v3

    move-object v4, p1

    check-cast v4, Lu1;

    invoke-interface {v4}, LRp0;->b0()Lae6;

    move-result-object v4

    sget-object v5, Lie6;->h:LSd6;

    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v3, Lie6;->l:LSd6;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object p1, p0, Lnv2;->a:LxX5;

    invoke-virtual {p1, v3}, LxX5;->d(LSd6;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return v1

    :cond_c
    instance-of v1, p1, LB96;

    if-eqz v1, :cond_d

    move-object v1, p1

    check-cast v1, LB96;

    invoke-virtual {v1}, LB96;->L()Lae6;

    move-result-object v4

    goto :goto_2

    :cond_d
    invoke-interface {p1, v3}, LSd6;->k(LSd6;)Lae6;

    move-result-object v4

    goto :goto_2

    :cond_e
    sget-object v1, Lie6;->L:LSd6;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v4, :cond_f

    sget-object v3, Lie6;->U:LSd6;

    :cond_f
    :goto_2
    instance-of v1, p1, LB96;

    if-eqz v1, :cond_11

    check-cast p1, LB96;

    if-nez v3, :cond_10

    invoke-virtual {p1}, LB96;->M()LSd6;

    move-result-object v1

    move-object v3, v1

    :cond_10
    invoke-virtual {p1}, LB96;->L()Lae6;

    move-result-object v4

    :cond_11
    invoke-virtual {p0, v3, v0}, Lnv2;->e(LSd6;Ljava/lang/Appendable;)I

    move-result p1

    sget-object v1, Lu1;->d:LSd6;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v2

    iget-object v2, p0, Lnv2;->a:LxX5;

    invoke-static {v4, v1, p1, v0, v2}, LuB0;->e(Lae6;ZILjava/lang/StringBuilder;LxX5;)I

    move-result p1

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
