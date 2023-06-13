.class public Lm64;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcp;LW;)Ll64;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p0, Lsb4;

    if-eqz v0, :cond_0

    check-cast p0, Lsb4;

    invoke-virtual {p0}, Lsb4;->b()I

    move-result v0

    invoke-static {v0}, LHi6;->d(I)LG9;

    move-result-object v0

    new-instance v1, Ll64;

    new-instance v2, LVF0;

    invoke-virtual {p0}, Lsb4;->a()[B

    move-result-object p0

    invoke-direct {v2, p0}, LVF0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, Ll64;-><init>(LG9;LE;LW;)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lug5;

    if-eqz v0, :cond_1

    check-cast p0, Lug5;

    new-instance p1, LG9;

    sget-object v0, LBD3;->r:LN;

    new-instance v1, Lsg5;

    invoke-virtual {p0}, Ltg5;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LHi6;->f(Ljava/lang/String;)LG9;

    move-result-object v2

    invoke-direct {v1, v2}, Lsg5;-><init>(LG9;)V

    invoke-direct {p1, v0, v1}, LG9;-><init>(LN;LE;)V

    new-instance v0, Ll64;

    new-instance v1, LVF0;

    invoke-virtual {p0}, Lug5;->b()[B

    move-result-object p0

    invoke-direct {v1, p0}, LVF0;-><init>([B)V

    invoke-direct {v0, p1, v1}, Ll64;-><init>(LG9;LE;)V

    return-object v0

    :cond_1
    instance-of v0, p0, LfY2;

    if-eqz v0, :cond_3

    check-cast p0, LfY2;

    new-instance p1, LG9;

    sget-object v0, LBD3;->v:LN;

    invoke-direct {p1, v0}, LG9;-><init>(LN;)V

    invoke-virtual {p0}, LfY2;->a()[S

    move-result-object p0

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-eq v1, v2, :cond_2

    aget-short v2, p0, v1

    mul-int/lit8 v3, v1, 0x2

    invoke-static {v2, v0, v3}, LDD3;->n(S[BI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Ll64;

    new-instance v1, LVF0;

    invoke-direct {v1, v0}, LVF0;-><init>([B)V

    invoke-direct {p0, p1, v1}, Ll64;-><init>(LG9;LE;)V

    return-object p0

    :cond_3
    instance-of v0, p0, LKl2;

    if-eqz v0, :cond_4

    check-cast p0, LKl2;

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LGt0;->i(I)LGt0;

    move-result-object v0

    invoke-virtual {v0, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object v0

    invoke-virtual {v0}, LGt0;->b()[B

    move-result-object v0

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v2

    invoke-virtual {v2, v1}, LGt0;->i(I)LGt0;

    move-result-object v1

    invoke-virtual {p0}, LKl2;->i()LLl2;

    move-result-object p0

    invoke-virtual {v1, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object p0

    invoke-virtual {p0}, LGt0;->b()[B

    move-result-object p0

    new-instance v1, LG9;

    sget-object v2, LyD3;->I0:LN;

    invoke-direct {v1, v2}, LG9;-><init>(LN;)V

    new-instance v2, Ll64;

    new-instance v3, LVF0;

    invoke-direct {v3, v0}, LVF0;-><init>([B)V

    invoke-direct {v2, v1, v3, p1, p0}, Ll64;-><init>(LG9;LE;LW;[B)V

    return-object v2

    :cond_4
    instance-of v0, p0, LCE1;

    if-eqz v0, :cond_5

    check-cast p0, LCE1;

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v0

    invoke-virtual {p0}, LCE1;->c()I

    move-result v1

    invoke-virtual {v0, v1}, LGt0;->i(I)LGt0;

    move-result-object v0

    invoke-virtual {v0, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object v0

    invoke-virtual {v0}, LGt0;->b()[B

    move-result-object v0

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v1

    invoke-virtual {p0}, LCE1;->c()I

    move-result v2

    invoke-virtual {v1, v2}, LGt0;->i(I)LGt0;

    move-result-object v1

    invoke-virtual {p0}, LCE1;->d()LDE1;

    move-result-object p0

    invoke-virtual {p0}, LDE1;->c()LLl2;

    move-result-object p0

    invoke-virtual {v1, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object p0

    invoke-virtual {p0}, LGt0;->b()[B

    move-result-object p0

    new-instance v1, LG9;

    sget-object v2, LyD3;->I0:LN;

    invoke-direct {v1, v2}, LG9;-><init>(LN;)V

    new-instance v2, Ll64;

    new-instance v3, LVF0;

    invoke-direct {v3, v0}, LVF0;-><init>([B)V

    invoke-direct {v2, v1, v3, p1, p0}, Ll64;-><init>(LG9;LE;LW;[B)V

    return-object v2

    :cond_5
    instance-of v0, p0, LTH6;

    if-eqz v0, :cond_6

    check-cast p0, LTH6;

    new-instance v0, LG9;

    sget-object v1, LBD3;->w:LN;

    new-instance v2, LFH6;

    invoke-virtual {p0}, LTH6;->b()LRH6;

    move-result-object v3

    invoke-virtual {v3}, LRH6;->b()I

    move-result v3

    invoke-virtual {p0}, LEH6;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LHi6;->h(Ljava/lang/String;)LG9;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LFH6;-><init>(ILG9;)V

    invoke-direct {v0, v1, v2}, LG9;-><init>(LN;LE;)V

    new-instance v1, Ll64;

    invoke-static {p0}, Lm64;->b(LTH6;)LSH6;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, Ll64;-><init>(LG9;LE;LW;)V

    return-object v1

    :cond_6
    instance-of v0, p0, LLH6;

    if-eqz v0, :cond_7

    check-cast p0, LLH6;

    new-instance v0, LG9;

    sget-object v1, LBD3;->F:LN;

    new-instance v2, LIH6;

    invoke-virtual {p0}, LLH6;->b()LJH6;

    move-result-object v3

    invoke-virtual {v3}, LJH6;->a()I

    move-result v3

    invoke-virtual {p0}, LLH6;->b()LJH6;

    move-result-object v4

    invoke-virtual {v4}, LJH6;->b()I

    move-result v4

    invoke-virtual {p0}, LHH6;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LHi6;->h(Ljava/lang/String;)LG9;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, LIH6;-><init>(IILG9;)V

    invoke-direct {v0, v1, v2}, LG9;-><init>(LN;LE;)V

    new-instance v1, Ll64;

    invoke-static {p0}, Lm64;->c(LLH6;)LKH6;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, Ll64;-><init>(LG9;LE;LW;)V

    return-object v1

    :cond_7
    instance-of p1, p0, LkO2;

    if-eqz p1, :cond_8

    check-cast p0, LkO2;

    new-instance p1, LjO2;

    invoke-virtual {p0}, LkO2;->f()I

    move-result v1

    invoke-virtual {p0}, LkO2;->e()I

    move-result v2

    invoke-virtual {p0}, LkO2;->b()LPA1;

    move-result-object v3

    invoke-virtual {p0}, LkO2;->c()LTX3;

    move-result-object v4

    invoke-virtual {p0}, LkO2;->g()LhR3;

    move-result-object v5

    invoke-virtual {p0}, LiO2;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LHi6;->a(Ljava/lang/String;)LG9;

    move-result-object v6

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LjO2;-><init>(IILPA1;LTX3;LhR3;LG9;)V

    new-instance p0, LG9;

    sget-object v0, LBD3;->n:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    new-instance v0, Ll64;

    invoke-direct {v0, p0, p1}, Ll64;-><init>(LG9;LE;)V

    return-object v0

    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "key parameters not recognized"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LTH6;)LSH6;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LTH6;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p0}, LTH6;->b()LRH6;

    move-result-object v1

    invoke-virtual {v1}, LRH6;->h()I

    move-result v1

    invoke-virtual {p0}, LTH6;->b()LRH6;

    move-result-object p0

    invoke-virtual {p0}, LRH6;->b()I

    move-result p0

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v0, v2, v3}, LWH6;->a([BII)J

    move-result-wide v4

    long-to-int v7, v4

    int-to-long v4, v7

    invoke-static {p0, v4, v5}, LWH6;->l(IJ)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0, v3, v1}, LWH6;->g([BII)[B

    move-result-object v8

    add-int/2addr v3, v1

    invoke-static {v0, v3, v1}, LWH6;->g([BII)[B

    move-result-object v9

    add-int/2addr v3, v1

    invoke-static {v0, v3, v1}, LWH6;->g([BII)[B

    move-result-object v10

    add-int/2addr v3, v1

    invoke-static {v0, v3, v1}, LWH6;->g([BII)[B

    move-result-object v11

    add-int/2addr v3, v1

    array-length v1, v0

    sub-int/2addr v1, v3

    invoke-static {v0, v3, v1}, LWH6;->g([BII)[B

    move-result-object v12

    :try_start_0
    const-class v0, Lwv;

    invoke-static {v12, v0}, LWH6;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwv;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lwv;->c()I

    move-result v1

    const/4 v2, 0x1

    shl-int p0, v2, p0

    sub-int/2addr p0, v2

    if-eq v1, p0, :cond_0

    new-instance p0, LSH6;

    invoke-virtual {v0}, Lwv;->c()I

    move-result v13

    move-object v6, p0

    invoke-direct/range {v6 .. v13}, LSH6;-><init>(I[B[B[B[B[BI)V

    return-object p0

    :cond_0
    new-instance p0, LSH6;

    move-object v6, p0

    invoke-direct/range {v6 .. v12}, LSH6;-><init>(I[B[B[B[B[B)V

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot parse BDS: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "index out of bounds"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(LLH6;)LKH6;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LLH6;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p0}, LLH6;->b()LJH6;

    move-result-object v1

    invoke-virtual {v1}, LJH6;->f()I

    move-result v1

    invoke-virtual {p0}, LLH6;->b()LJH6;

    move-result-object p0

    invoke-virtual {p0}, LJH6;->a()I

    move-result p0

    add-int/lit8 v2, p0, 0x7

    div-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, LWH6;->a([BII)J

    move-result-wide v4

    long-to-int v4, v4

    int-to-long v6, v4

    invoke-static {p0, v6, v7}, LWH6;->l(IJ)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/2addr v2, v3

    invoke-static {v0, v2, v1}, LWH6;->g([BII)[B

    move-result-object v8

    add-int/2addr v2, v1

    invoke-static {v0, v2, v1}, LWH6;->g([BII)[B

    move-result-object v9

    add-int/2addr v2, v1

    invoke-static {v0, v2, v1}, LWH6;->g([BII)[B

    move-result-object v10

    add-int/2addr v2, v1

    invoke-static {v0, v2, v1}, LWH6;->g([BII)[B

    move-result-object v11

    add-int/2addr v2, v1

    array-length v1, v0

    sub-int/2addr v1, v2

    invoke-static {v0, v2, v1}, LWH6;->g([BII)[B

    move-result-object v12

    :try_start_0
    const-class v0, Lxv;

    invoke-static {v12, v0}, LWH6;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxv;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lxv;->b()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    shl-long v13, v3, p0

    sub-long/2addr v13, v3

    cmp-long p0, v1, v13

    if-eqz p0, :cond_0

    new-instance p0, LKH6;

    invoke-virtual {v0}, Lxv;->b()J

    move-result-wide v13

    move-object v5, p0

    invoke-direct/range {v5 .. v14}, LKH6;-><init>(J[B[B[B[B[BJ)V

    return-object p0

    :cond_0
    new-instance p0, LKH6;

    move-object v5, p0

    invoke-direct/range {v5 .. v12}, LKH6;-><init>(J[B[B[B[B[B)V

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot parse BDSStateMap: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "index out of bounds"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
