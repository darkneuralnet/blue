.class public LdT5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcp;)LcT5;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p0, Ltb4;

    if-eqz v0, :cond_0

    check-cast p0, Ltb4;

    invoke-virtual {p0}, Ltb4;->b()I

    move-result v0

    invoke-static {v0}, LHi6;->d(I)LG9;

    move-result-object v0

    new-instance v1, LcT5;

    invoke-virtual {p0}, Ltb4;->a()[B

    move-result-object p0

    invoke-direct {v1, v0, p0}, LcT5;-><init>(LG9;[B)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lvg5;

    if-eqz v0, :cond_1

    check-cast p0, Lvg5;

    new-instance v0, LG9;

    sget-object v1, LBD3;->r:LN;

    new-instance v2, Lsg5;

    invoke-virtual {p0}, Ltg5;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LHi6;->f(Ljava/lang/String;)LG9;

    move-result-object v3

    invoke-direct {v2, v3}, Lsg5;-><init>(LG9;)V

    invoke-direct {v0, v1, v2}, LG9;-><init>(LN;LE;)V

    new-instance v1, LcT5;

    invoke-virtual {p0}, Lvg5;->b()[B

    move-result-object p0

    invoke-direct {v1, v0, p0}, LcT5;-><init>(LG9;[B)V

    return-object v1

    :cond_1
    instance-of v0, p0, LgY2;

    if-eqz v0, :cond_2

    check-cast p0, LgY2;

    new-instance v0, LG9;

    sget-object v1, LBD3;->v:LN;

    invoke-direct {v0, v1}, LG9;-><init>(LN;)V

    new-instance v1, LcT5;

    invoke-virtual {p0}, LgY2;->a()[B

    move-result-object p0

    invoke-direct {v1, v0, p0}, LcT5;-><init>(LG9;[B)V

    return-object v1

    :cond_2
    instance-of v0, p0, LLl2;

    if-eqz v0, :cond_3

    check-cast p0, LLl2;

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LGt0;->i(I)LGt0;

    move-result-object v0

    invoke-virtual {v0, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object p0

    invoke-virtual {p0}, LGt0;->b()[B

    move-result-object p0

    new-instance v0, LG9;

    sget-object v1, LyD3;->I0:LN;

    invoke-direct {v0, v1}, LG9;-><init>(LN;)V

    new-instance v1, LcT5;

    new-instance v2, LVF0;

    invoke-direct {v2, p0}, LVF0;-><init>([B)V

    invoke-direct {v1, v0, v2}, LcT5;-><init>(LG9;LE;)V

    return-object v1

    :cond_3
    instance-of v0, p0, LDE1;

    if-eqz v0, :cond_4

    check-cast p0, LDE1;

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v0

    invoke-virtual {p0}, LDE1;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LGt0;->i(I)LGt0;

    move-result-object v0

    invoke-virtual {p0}, LDE1;->c()LLl2;

    move-result-object p0

    invoke-virtual {v0, p0}, LGt0;->c(Lcb1;)LGt0;

    move-result-object p0

    invoke-virtual {p0}, LGt0;->b()[B

    move-result-object p0

    new-instance v0, LG9;

    sget-object v1, LyD3;->I0:LN;

    invoke-direct {v0, v1}, LG9;-><init>(LN;)V

    new-instance v1, LcT5;

    new-instance v2, LVF0;

    invoke-direct {v2, p0}, LVF0;-><init>([B)V

    invoke-direct {v1, v0, v2}, LcT5;-><init>(LG9;LE;)V

    return-object v1

    :cond_4
    instance-of v0, p0, LVH6;

    if-eqz v0, :cond_6

    check-cast p0, LVH6;

    invoke-virtual {p0}, LVH6;->c()[B

    move-result-object v0

    invoke-virtual {p0}, LVH6;->d()[B

    move-result-object v1

    invoke-virtual {p0}, LVH6;->getEncoded()[B

    move-result-object v2

    array-length v3, v2

    array-length v4, v0

    array-length v5, v1

    add-int/2addr v4, v5

    if-le v3, v4, :cond_5

    new-instance p0, LG9;

    sget-object v0, Lfa2;->a:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    new-instance v0, LcT5;

    new-instance v1, LVF0;

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-direct {v0, p0, v1}, LcT5;-><init>(LG9;LE;)V

    return-object v0

    :cond_5
    new-instance v2, LG9;

    sget-object v3, LBD3;->w:LN;

    new-instance v4, LFH6;

    invoke-virtual {p0}, LVH6;->b()LRH6;

    move-result-object v5

    invoke-virtual {v5}, LRH6;->b()I

    move-result v5

    invoke-virtual {p0}, LEH6;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LHi6;->h(Ljava/lang/String;)LG9;

    move-result-object p0

    invoke-direct {v4, v5, p0}, LFH6;-><init>(ILG9;)V

    invoke-direct {v2, v3, v4}, LG9;-><init>(LN;LE;)V

    new-instance p0, LcT5;

    new-instance v3, LUH6;

    invoke-direct {v3, v0, v1}, LUH6;-><init>([B[B)V

    invoke-direct {p0, v2, v3}, LcT5;-><init>(LG9;LE;)V

    return-object p0

    :cond_6
    instance-of v0, p0, LNH6;

    if-eqz v0, :cond_8

    check-cast p0, LNH6;

    invoke-virtual {p0}, LNH6;->c()[B

    move-result-object v0

    invoke-virtual {p0}, LNH6;->d()[B

    move-result-object v1

    invoke-virtual {p0}, LNH6;->getEncoded()[B

    move-result-object v2

    array-length v3, v2

    array-length v0, v0

    array-length v1, v1

    add-int/2addr v0, v1

    if-le v3, v0, :cond_7

    new-instance p0, LG9;

    sget-object v0, Lfa2;->b:LN;

    invoke-direct {p0, v0}, LG9;-><init>(LN;)V

    new-instance v0, LcT5;

    new-instance v1, LVF0;

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-direct {v0, p0, v1}, LcT5;-><init>(LG9;LE;)V

    return-object v0

    :cond_7
    new-instance v0, LG9;

    sget-object v1, LBD3;->F:LN;

    new-instance v2, LIH6;

    invoke-virtual {p0}, LNH6;->b()LJH6;

    move-result-object v3

    invoke-virtual {v3}, LJH6;->a()I

    move-result v3

    invoke-virtual {p0}, LNH6;->b()LJH6;

    move-result-object v4

    invoke-virtual {v4}, LJH6;->b()I

    move-result v4

    invoke-virtual {p0}, LHH6;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LHi6;->h(Ljava/lang/String;)LG9;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, LIH6;-><init>(IILG9;)V

    invoke-direct {v0, v1, v2}, LG9;-><init>(LN;LE;)V

    new-instance v1, LcT5;

    new-instance v2, LMH6;

    invoke-virtual {p0}, LNH6;->c()[B

    move-result-object v3

    invoke-virtual {p0}, LNH6;->d()[B

    move-result-object p0

    invoke-direct {v2, v3, p0}, LMH6;-><init>([B[B)V

    invoke-direct {v1, v0, v2}, LcT5;-><init>(LG9;LE;)V

    return-object v1

    :cond_8
    instance-of v0, p0, LmO2;

    if-eqz v0, :cond_9

    check-cast p0, LmO2;

    new-instance v0, LlO2;

    invoke-virtual {p0}, LmO2;->c()I

    move-result v1

    invoke-virtual {p0}, LmO2;->d()I

    move-result v2

    invoke-virtual {p0}, LmO2;->b()LOA1;

    move-result-object v3

    invoke-virtual {p0}, LiO2;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LHi6;->a(Ljava/lang/String;)LG9;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, LlO2;-><init>(IILOA1;LG9;)V

    new-instance p0, LG9;

    sget-object v1, LBD3;->n:LN;

    invoke-direct {p0, v1}, LG9;-><init>(LN;)V

    new-instance v1, LcT5;

    invoke-direct {v1, p0, v0}, LcT5;-><init>(LG9;LE;)V

    return-object v1

    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string v0, "key parameters not recognized"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
