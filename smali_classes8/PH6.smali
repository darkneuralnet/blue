.class public LPH6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Llw6;Low6;LQl2;)LOH6;
    .locals 8

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Llw6;->d()Lnw6;

    move-result-object v0

    invoke-virtual {v0}, Lnw6;->a()I

    move-result v0

    invoke-virtual {p1}, Low6;->a()[[B

    move-result-object p1

    array-length v1, p1

    new-array v1, v1, [LOH6;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    new-instance v4, LOH6;

    aget-object v5, p1, v3

    invoke-direct {v4, v2, v5}, LOH6;-><init>(I[B)V

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, LQl2$b;

    invoke-direct {p1}, LQl2$b;-><init>()V

    invoke-virtual {p2}, LCH6;->b()I

    move-result v3

    invoke-virtual {p1, v3}, LCH6$a;->g(I)LCH6$a;

    move-result-object p1

    check-cast p1, LQl2$b;

    invoke-virtual {p2}, LCH6;->c()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, LCH6$a;->h(J)LCH6$a;

    move-result-object p1

    check-cast p1, LQl2$b;

    invoke-virtual {p2}, LQl2;->e()I

    move-result v3

    invoke-virtual {p1, v3}, LQl2$b;->n(I)LQl2$b;

    move-result-object p1

    invoke-virtual {p1, v2}, LQl2$b;->o(I)LQl2$b;

    move-result-object p1

    invoke-virtual {p2}, LQl2;->g()I

    move-result v3

    invoke-virtual {p1, v3}, LQl2$b;->p(I)LQl2$b;

    move-result-object p1

    invoke-virtual {p2}, LCH6;->a()I

    move-result p2

    invoke-virtual {p1, p2}, LCH6$a;->f(I)LCH6$a;

    move-result-object p1

    :goto_1
    check-cast p1, LQl2$b;

    invoke-virtual {p1}, LQl2$b;->l()LCH6;

    move-result-object p1

    check-cast p1, LQl2;

    const/4 p2, 0x1

    if-le v0, p2, :cond_3

    move v3, v2

    :goto_2
    div-int/lit8 v4, v0, 0x2

    int-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v6, v6

    if-ge v3, v6, :cond_1

    new-instance v4, LQl2$b;

    invoke-direct {v4}, LQl2$b;-><init>()V

    invoke-virtual {p1}, LCH6;->b()I

    move-result v5

    invoke-virtual {v4, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v4

    check-cast v4, LQl2$b;

    invoke-virtual {p1}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v4

    check-cast v4, LQl2$b;

    invoke-virtual {p1}, LQl2;->e()I

    move-result v5

    invoke-virtual {v4, v5}, LQl2$b;->n(I)LQl2$b;

    move-result-object v4

    invoke-virtual {p1}, LQl2;->f()I

    move-result v5

    invoke-virtual {v4, v5}, LQl2$b;->o(I)LQl2$b;

    move-result-object v4

    invoke-virtual {v4, v3}, LQl2$b;->p(I)LQl2$b;

    move-result-object v4

    invoke-virtual {p1}, LCH6;->a()I

    move-result p1

    invoke-virtual {v4, p1}, LCH6$a;->f(I)LCH6$a;

    move-result-object p1

    check-cast p1, LQl2$b;

    invoke-virtual {p1}, LQl2$b;->l()LCH6;

    move-result-object p1

    check-cast p1, LQl2;

    mul-int/lit8 v4, v3, 0x2

    aget-object v5, v1, v4

    add-int/2addr v4, p2

    aget-object v4, v1, v4

    invoke-static {p0, v5, v4, p1}, LPH6;->b(Llw6;LOH6;LOH6;LCH6;)LOH6;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    rem-int/lit8 v3, v0, 0x2

    if-ne v3, p2, :cond_2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    add-int/lit8 v4, v0, -0x1

    aget-object v4, v1, v4

    aput-object v4, v1, v3

    :cond_2
    int-to-double v3, v0

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    new-instance v3, LQl2$b;

    invoke-direct {v3}, LQl2$b;-><init>()V

    invoke-virtual {p1}, LCH6;->b()I

    move-result v4

    invoke-virtual {v3, v4}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    invoke-virtual {p1}, LCH6;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    invoke-virtual {p1}, LQl2;->e()I

    move-result v4

    invoke-virtual {v3, v4}, LQl2$b;->n(I)LQl2$b;

    move-result-object v3

    invoke-virtual {p1}, LQl2;->f()I

    move-result v4

    add-int/2addr v4, p2

    invoke-virtual {v3, v4}, LQl2$b;->o(I)LQl2$b;

    move-result-object p2

    invoke-virtual {p1}, LQl2;->g()I

    move-result v3

    invoke-virtual {p2, v3}, LQl2$b;->p(I)LQl2$b;

    move-result-object p2

    invoke-virtual {p1}, LCH6;->a()I

    move-result p1

    invoke-virtual {p2, p1}, LCH6$a;->f(I)LCH6$a;

    move-result-object p1

    goto/16 :goto_1

    :cond_3
    aget-object p0, v1, v2

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "address == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "publicKey == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Llw6;LOH6;LOH6;LCH6;)LOH6;
    .locals 8

    if-eqz p1, :cond_b

    if-eqz p2, :cond_a

    invoke-virtual {p1}, LOH6;->a()I

    move-result v0

    invoke-virtual {p2}, LOH6;->a()I

    move-result v1

    if-ne v0, v1, :cond_9

    if-eqz p3, :cond_8

    invoke-virtual {p0}, Llw6;->f()[B

    move-result-object v0

    instance-of v1, p3, LQl2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p3, LQl2;

    new-instance v1, LQl2$b;

    invoke-direct {v1}, LQl2$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v3

    invoke-virtual {v1, v3}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LQl2$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LQl2$b;

    invoke-virtual {p3}, LQl2;->e()I

    move-result v3

    invoke-virtual {v1, v3}, LQl2$b;->n(I)LQl2$b;

    move-result-object v1

    invoke-virtual {p3}, LQl2;->f()I

    move-result v3

    invoke-virtual {v1, v3}, LQl2$b;->o(I)LQl2$b;

    move-result-object v1

    invoke-virtual {p3}, LQl2;->g()I

    move-result p3

    invoke-virtual {v1, p3}, LQl2$b;->p(I)LQl2$b;

    move-result-object p3

    invoke-virtual {p3, v2}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LQl2$b;

    invoke-virtual {p3}, LQl2$b;->l()LCH6;

    move-result-object p3

    check-cast p3, LQl2;

    goto :goto_0

    :cond_0
    instance-of v1, p3, LtH1;

    if-eqz v1, :cond_1

    check-cast p3, LtH1;

    new-instance v1, LtH1$b;

    invoke-direct {v1}, LtH1$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v3

    invoke-virtual {v1, v3}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {p3}, LtH1;->e()I

    move-result v3

    invoke-virtual {v1, v3}, LtH1$b;->m(I)LtH1$b;

    move-result-object v1

    invoke-virtual {p3}, LtH1;->f()I

    move-result p3

    invoke-virtual {v1, p3}, LtH1$b;->n(I)LtH1$b;

    move-result-object p3

    invoke-virtual {p3, v2}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p3}, LtH1$b;->k()LCH6;

    move-result-object p3

    check-cast p3, LtH1;

    :cond_1
    :goto_0
    invoke-virtual {p0}, Llw6;->c()Lel2;

    move-result-object v1

    invoke-virtual {p3}, LCH6;->d()[B

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lel2;->c([B[B)[B

    move-result-object v1

    instance-of v3, p3, LQl2;

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    check-cast p3, LQl2;

    new-instance v3, LQl2$b;

    invoke-direct {v3}, LQl2$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v5

    invoke-virtual {v3, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    invoke-virtual {p3}, LQl2;->e()I

    move-result v5

    invoke-virtual {v3, v5}, LQl2$b;->n(I)LQl2$b;

    move-result-object v3

    invoke-virtual {p3}, LQl2;->f()I

    move-result v5

    invoke-virtual {v3, v5}, LQl2$b;->o(I)LQl2$b;

    move-result-object v3

    invoke-virtual {p3}, LQl2;->g()I

    move-result p3

    invoke-virtual {v3, p3}, LQl2$b;->p(I)LQl2$b;

    move-result-object p3

    invoke-virtual {p3, v4}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LQl2$b;

    invoke-virtual {p3}, LQl2$b;->l()LCH6;

    move-result-object p3

    check-cast p3, LQl2;

    goto :goto_1

    :cond_2
    instance-of v3, p3, LtH1;

    if-eqz v3, :cond_3

    check-cast p3, LtH1;

    new-instance v3, LtH1$b;

    invoke-direct {v3}, LtH1$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v5

    invoke-virtual {v3, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {p3}, LtH1;->e()I

    move-result v5

    invoke-virtual {v3, v5}, LtH1$b;->m(I)LtH1$b;

    move-result-object v3

    invoke-virtual {p3}, LtH1;->f()I

    move-result p3

    invoke-virtual {v3, p3}, LtH1$b;->n(I)LtH1$b;

    move-result-object p3

    invoke-virtual {p3, v4}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p3}, LtH1$b;->k()LCH6;

    move-result-object p3

    check-cast p3, LtH1;

    :cond_3
    :goto_1
    invoke-virtual {p0}, Llw6;->c()Lel2;

    move-result-object v3

    invoke-virtual {p3}, LCH6;->d()[B

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lel2;->c([B[B)[B

    move-result-object v3

    instance-of v4, p3, LQl2;

    const/4 v5, 0x2

    if-eqz v4, :cond_4

    check-cast p3, LQl2;

    new-instance v4, LQl2$b;

    invoke-direct {v4}, LQl2$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v6

    invoke-virtual {v4, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v4

    check-cast v4, LQl2$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v4

    check-cast v4, LQl2$b;

    invoke-virtual {p3}, LQl2;->e()I

    move-result v6

    invoke-virtual {v4, v6}, LQl2$b;->n(I)LQl2$b;

    move-result-object v4

    invoke-virtual {p3}, LQl2;->f()I

    move-result v6

    invoke-virtual {v4, v6}, LQl2$b;->o(I)LQl2$b;

    move-result-object v4

    invoke-virtual {p3}, LQl2;->g()I

    move-result p3

    invoke-virtual {v4, p3}, LQl2$b;->p(I)LQl2$b;

    move-result-object p3

    invoke-virtual {p3, v5}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LQl2$b;

    invoke-virtual {p3}, LQl2$b;->l()LCH6;

    move-result-object p3

    check-cast p3, LQl2;

    goto :goto_2

    :cond_4
    instance-of v4, p3, LtH1;

    if-eqz v4, :cond_5

    check-cast p3, LtH1;

    new-instance v4, LtH1$b;

    invoke-direct {v4}, LtH1$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v6

    invoke-virtual {v4, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v4

    check-cast v4, LtH1$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v4

    check-cast v4, LtH1$b;

    invoke-virtual {p3}, LtH1;->e()I

    move-result v6

    invoke-virtual {v4, v6}, LtH1$b;->m(I)LtH1$b;

    move-result-object v4

    invoke-virtual {p3}, LtH1;->f()I

    move-result p3

    invoke-virtual {v4, p3}, LtH1$b;->n(I)LtH1$b;

    move-result-object p3

    invoke-virtual {p3, v5}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LtH1$b;

    invoke-virtual {p3}, LtH1$b;->k()LCH6;

    move-result-object p3

    check-cast p3, LtH1;

    :cond_5
    :goto_2
    invoke-virtual {p0}, Llw6;->c()Lel2;

    move-result-object v4

    invoke-virtual {p3}, LCH6;->d()[B

    move-result-object p3

    invoke-virtual {v4, v0, p3}, Lel2;->c([B[B)[B

    move-result-object p3

    invoke-virtual {p0}, Llw6;->d()Lnw6;

    move-result-object v0

    invoke-virtual {v0}, Lnw6;->c()I

    move-result v0

    mul-int/lit8 v4, v0, 0x2

    new-array v4, v4, [B

    move v5, v2

    :goto_3
    if-ge v5, v0, :cond_6

    invoke-virtual {p1}, LOH6;->b()[B

    move-result-object v6

    aget-byte v6, v6, v5

    aget-byte v7, v3, v5

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-ge v2, v0, :cond_7

    add-int v3, v2, v0

    invoke-virtual {p2}, LOH6;->b()[B

    move-result-object v5

    aget-byte v5, v5, v2

    aget-byte v6, p3, v2

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Llw6;->c()Lel2;

    move-result-object p0

    invoke-virtual {p0, v1, v4}, Lel2;->b([B[B)[B

    move-result-object p0

    new-instance p2, LOH6;

    invoke-virtual {p1}, LOH6;->a()I

    move-result p1

    invoke-direct {p2, p1, p0}, LOH6;-><init>(I[B)V

    return-object p2

    :cond_8
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "address == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "height of both nodes must be equal"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "right == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "left == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
