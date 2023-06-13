.class public LOl2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LGl2;[BI[B)[B
    .locals 10

    invoke-virtual {p0}, LGl2;->b()LN;

    move-result-object v0

    invoke-static {v0}, LT31;->a(LN;)LP31;

    move-result-object v0

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v1

    invoke-virtual {v1, p1}, LGt0;->d([B)LGt0;

    move-result-object v1

    invoke-virtual {v1, p2}, LGt0;->i(I)LGt0;

    move-result-object v1

    const/16 v2, -0x7f80

    invoke-virtual {v1, v2}, LGt0;->h(I)LGt0;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x16

    invoke-virtual {v1, v2, v3}, LGt0;->g(II)LGt0;

    move-result-object v1

    invoke-virtual {v1}, LGt0;->b()[B

    move-result-object v1

    array-length v4, v1

    invoke-interface {v0, v1, v2, v4}, LP31;->f([BII)V

    invoke-virtual {p0}, LGl2;->b()LN;

    move-result-object v1

    invoke-static {v1}, LT31;->a(LN;)LP31;

    move-result-object v1

    invoke-static {}, LGt0;->f()LGt0;

    move-result-object v4

    invoke-virtual {v4, p1}, LGt0;->d([B)LGt0;

    move-result-object v4

    invoke-virtual {v4, p2}, LGt0;->i(I)LGt0;

    move-result-object v4

    invoke-interface {v1}, LP31;->e()I

    move-result v5

    const/16 v6, 0x17

    add-int/2addr v5, v6

    invoke-virtual {v4, v2, v5}, LGt0;->g(II)LGt0;

    move-result-object v4

    invoke-virtual {v4}, LGt0;->b()[B

    move-result-object v4

    new-instance v5, LSq5;

    invoke-virtual {p0}, LGl2;->b()LN;

    move-result-object v7

    invoke-static {v7}, LT31;->a(LN;)LP31;

    move-result-object v7

    invoke-direct {v5, p1, p3, v7}, LSq5;-><init>([B[BLP31;)V

    invoke-virtual {v5, p2}, LSq5;->d(I)V

    invoke-virtual {v5, v2}, LSq5;->c(I)V

    invoke-virtual {p0}, LGl2;->d()I

    move-result p1

    invoke-virtual {p0}, LGl2;->c()I

    move-result p2

    invoke-virtual {p0}, LGl2;->g()I

    move-result p0

    const/4 p3, 0x1

    shl-int p0, p3, p0

    sub-int/2addr p0, p3

    move v7, v2

    :goto_0
    if-ge v7, p1, :cond_2

    add-int/lit8 v8, p1, -0x1

    if-ge v7, v8, :cond_0

    move v8, p3

    goto :goto_1

    :cond_0
    move v8, v2

    :goto_1
    invoke-virtual {v5, v4, v8, v6}, LSq5;->a([BZI)V

    int-to-short v8, v7

    const/16 v9, 0x14

    invoke-static {v8, v4, v9}, LDD3;->m(S[BI)V

    move v8, v2

    :goto_2
    if-ge v8, p0, :cond_1

    int-to-byte v9, v8

    aput-byte v9, v4, v3

    array-length v9, v4

    invoke-interface {v1, v4, v2, v9}, LP31;->f([BII)V

    invoke-interface {v1, v4, v6}, LP31;->a([BI)I

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_1
    invoke-interface {v0, v4, v6, p2}, LP31;->f([BII)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, LP31;->e()I

    move-result p0

    new-array p0, p0, [B

    invoke-interface {v0, p0, v2}, LP31;->a([BI)I

    return-object p0
.end method
