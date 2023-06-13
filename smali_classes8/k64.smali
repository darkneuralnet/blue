.class public Lk64;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)[S
    .locals 4

    array-length v0, p0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [S

    const/4 v2, 0x0

    :goto_0
    if-eq v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-static {p0, v3}, LDD3;->h([BI)S

    move-result v3

    aput-short v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static b(Ll64;)Lcp;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ll64;->s()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v0

    sget-object v1, Llv;->W:LN;

    invoke-virtual {v0, v1}, LN;->J(LN;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object v0

    invoke-static {v0}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v0

    new-instance v1, Lsb4;

    invoke-virtual {p0}, Ll64;->s()LG9;

    move-result-object p0

    invoke-static {p0}, LHi6;->e(LG9;)I

    move-result p0

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lsb4;-><init>(I[B)V

    return-object v1

    :cond_0
    sget-object v1, Llv;->s:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lug5;

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object v1

    invoke-static {v1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v1

    invoke-virtual {v1}, LO;->C()[B

    move-result-object v1

    invoke-virtual {p0}, Ll64;->s()LG9;

    move-result-object p0

    invoke-virtual {p0}, LG9;->s()LE;

    move-result-object p0

    invoke-static {p0}, Lsg5;->j(Ljava/lang/Object;)Lsg5;

    move-result-object p0

    invoke-static {p0}, LHi6;->g(Lsg5;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lug5;-><init>([BLjava/lang/String;)V

    return-object v0

    :cond_1
    sget-object v1, Llv;->f0:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, LfY2;

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object p0

    invoke-static {p0}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object p0

    invoke-virtual {p0}, LO;->C()[B

    move-result-object p0

    invoke-static {p0}, Lk64;->a([B)[S

    move-result-object p0

    invoke-direct {v0, p0}, LfY2;-><init>([S)V

    return-object v0

    :cond_2
    sget-object v1, LyD3;->I0:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object v0

    invoke-static {v0}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v0

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    invoke-virtual {p0}, Ll64;->u()LC;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LDD3;->a([BI)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-ne v1, v2, :cond_4

    if-eqz p0, :cond_3

    invoke-virtual {p0}, LC;->C()[B

    move-result-object p0

    array-length v1, v0

    invoke-static {v0, v3, v1}, LAo;->h([BII)[B

    move-result-object v0

    array-length v1, p0

    invoke-static {p0, v3, v1}, LAo;->h([BII)[B

    move-result-object p0

    invoke-static {v0, p0}, LKl2;->f([B[B)LKl2;

    move-result-object p0

    return-object p0

    :cond_3
    array-length p0, v0

    invoke-static {v0, v3, p0}, LAo;->h([BII)[B

    move-result-object p0

    invoke-static {p0}, LKl2;->e(Ljava/lang/Object;)LKl2;

    move-result-object p0

    return-object p0

    :cond_4
    if-eqz p0, :cond_5

    invoke-virtual {p0}, LC;->C()[B

    move-result-object p0

    array-length v1, v0

    invoke-static {v0, v3, v1}, LAo;->h([BII)[B

    move-result-object v0

    invoke-static {v0, p0}, LCE1;->b([B[B)LCE1;

    move-result-object p0

    return-object p0

    :cond_5
    array-length p0, v0

    invoke-static {v0, v3, p0}, LAo;->h([BII)[B

    move-result-object p0

    invoke-static {p0}, LCE1;->a(Ljava/lang/Object;)LCE1;

    move-result-object p0

    return-object p0

    :cond_6
    sget-object v1, Llv;->w:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v1

    const-string v2, "ClassNotFoundException processing BDS state: "

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Ll64;->s()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->s()LE;

    move-result-object v0

    invoke-static {v0}, LFH6;->o(Ljava/lang/Object;)LFH6;

    move-result-object v0

    invoke-virtual {v0}, LFH6;->s()LG9;

    move-result-object v1

    invoke-virtual {v1}, LG9;->j()LN;

    move-result-object v1

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object p0

    invoke-static {p0}, LSH6;->s(Ljava/lang/Object;)LSH6;

    move-result-object p0

    :try_start_0
    new-instance v3, LTH6$b;

    new-instance v4, LRH6;

    invoke-virtual {v0}, LFH6;->j()I

    move-result v0

    invoke-static {v1}, LHi6;->b(LN;)LP31;

    move-result-object v5

    invoke-direct {v4, v0, v5}, LRH6;-><init>(ILP31;)V

    invoke-direct {v3, v4}, LTH6$b;-><init>(LRH6;)V

    invoke-virtual {p0}, LSH6;->o()I

    move-result v0

    invoke-virtual {v3, v0}, LTH6$b;->l(I)LTH6$b;

    move-result-object v0

    invoke-virtual {p0}, LSH6;->y()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LTH6$b;->q([B)LTH6$b;

    move-result-object v0

    invoke-virtual {p0}, LSH6;->x()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LTH6$b;->p([B)LTH6$b;

    move-result-object v0

    invoke-virtual {p0}, LSH6;->v()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LTH6$b;->n([B)LTH6$b;

    move-result-object v0

    invoke-virtual {p0}, LSH6;->w()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LTH6$b;->o([B)LTH6$b;

    move-result-object v0

    invoke-virtual {p0}, LSH6;->z()I

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, LSH6;->u()I

    move-result v3

    invoke-virtual {v0, v3}, LTH6$b;->m(I)LTH6$b;

    :cond_7
    invoke-virtual {p0}, LSH6;->j()[B

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, LSH6;->j()[B

    move-result-object p0

    const-class v3, Lwv;

    invoke-static {p0, v3}, LWH6;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwv;

    invoke-virtual {p0, v1}, Lwv;->h(LN;)Lwv;

    move-result-object p0

    invoke-virtual {v0, p0}, LTH6$b;->k(Lwv;)LTH6$b;

    :cond_8
    invoke-virtual {v0}, LTH6$b;->j()LTH6;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    sget-object v1, LBD3;->F:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Ll64;->s()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->s()LE;

    move-result-object v0

    invoke-static {v0}, LIH6;->o(Ljava/lang/Object;)LIH6;

    move-result-object v0

    invoke-virtual {v0}, LIH6;->u()LG9;

    move-result-object v1

    invoke-virtual {v1}, LG9;->j()LN;

    move-result-object v1

    :try_start_1
    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object p0

    invoke-static {p0}, LKH6;->s(Ljava/lang/Object;)LKH6;

    move-result-object p0

    new-instance v3, LLH6$b;

    new-instance v4, LJH6;

    invoke-virtual {v0}, LIH6;->j()I

    move-result v5

    invoke-virtual {v0}, LIH6;->s()I

    move-result v0

    invoke-static {v1}, LHi6;->b(LN;)LP31;

    move-result-object v6

    invoke-direct {v4, v5, v0, v6}, LJH6;-><init>(IILP31;)V

    invoke-direct {v3, v4}, LLH6$b;-><init>(LJH6;)V

    invoke-virtual {p0}, LKH6;->o()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LLH6$b;->m(J)LLH6$b;

    move-result-object v0

    invoke-virtual {p0}, LKH6;->y()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LLH6$b;->r([B)LLH6$b;

    move-result-object v0

    invoke-virtual {p0}, LKH6;->x()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LLH6$b;->q([B)LLH6$b;

    move-result-object v0

    invoke-virtual {p0}, LKH6;->v()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LLH6$b;->o([B)LLH6$b;

    move-result-object v0

    invoke-virtual {p0}, LKH6;->w()[B

    move-result-object v3

    invoke-virtual {v0, v3}, LLH6$b;->p([B)LLH6$b;

    move-result-object v0

    invoke-virtual {p0}, LKH6;->z()I

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p0}, LKH6;->u()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LLH6$b;->n(J)LLH6$b;

    :cond_a
    invoke-virtual {p0}, LKH6;->j()[B

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {p0}, LKH6;->j()[B

    move-result-object p0

    const-class v3, Lxv;

    invoke-static {p0, v3}, LWH6;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxv;

    invoke-virtual {p0, v1}, Lxv;->f(LN;)Lxv;

    move-result-object p0

    invoke-virtual {v0, p0}, LLH6$b;->l(Lxv;)LLH6$b;

    :cond_b
    invoke-virtual {v0}, LLH6$b;->k()LLH6;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    sget-object v1, LBD3;->n:LN;

    invoke-virtual {v0, v1}, LS;->u(LS;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Ll64;->w()LE;

    move-result-object p0

    invoke-static {p0}, LjO2;->u(Ljava/lang/Object;)LjO2;

    move-result-object p0

    new-instance v7, LkO2;

    invoke-virtual {p0}, LjO2;->w()I

    move-result v1

    invoke-virtual {p0}, LjO2;->v()I

    move-result v2

    invoke-virtual {p0}, LjO2;->o()LPA1;

    move-result-object v3

    invoke-virtual {p0}, LjO2;->s()LTX3;

    move-result-object v4

    invoke-virtual {p0}, LjO2;->x()LhR3;

    move-result-object v5

    invoke-virtual {p0}, LjO2;->j()LG9;

    move-result-object p0

    invoke-virtual {p0}, LG9;->j()LN;

    move-result-object p0

    invoke-static {p0}, LHi6;->c(LN;)Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LkO2;-><init>(IILPA1;LTX3;LhR3;Ljava/lang/String;)V

    return-object v7

    :cond_d
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "algorithm identifier in private key not recognised"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
