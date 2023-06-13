.class public final LFV0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lit4;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lit4;

    sget-object v1, LuB1;->l:LuB1;

    invoke-direct {v0, v1}, Lit4;-><init>(LuB1;)V

    iput-object v0, p0, LFV0;->a:Lit4;

    return-void
.end method


# virtual methods
.method public final a([BI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    array-length v0, p1

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, LFV0;->a:Lit4;

    array-length v3, p1

    sub-int/2addr v3, p2

    invoke-virtual {v0, v1, v3}, Lit4;->a([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-ge v2, p2, :cond_1

    aget v0, v1, v2

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :catch_0
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    move-result-object p1

    throw p1
.end method

.method public b(LET;Ljava/util/Map;)LHV0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LET;",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LHV0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    new-instance v0, LGT;

    invoke-direct {v0, p1}, LGT;-><init>(LET;)V

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p0, v0, p2}, LFV0;->c(LGT;Ljava/util/Map;)LHV0;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v3, v1

    move-object v1, p1

    move-object p1, v3

    :goto_0
    :try_start_1
    invoke-virtual {v0}, LGT;->f()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, LGT;->g(Z)V

    invoke-virtual {v0}, LGT;->e()LDo6;

    invoke-virtual {v0}, LGT;->d()Lux1;

    invoke-virtual {v0}, LGT;->b()V

    invoke-virtual {p0, v0, p2}, LFV0;->c(LGT;Ljava/util/Map;)LHV0;

    move-result-object p2

    new-instance v0, Lob4;

    invoke-direct {v0, v2}, Lob4;-><init>(Z)V

    invoke-virtual {p2, v0}, LHV0;->m(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/zxing/FormatException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/google/zxing/ChecksumException; {:try_start_1 .. :try_end_1} :catch_2

    return-object p2

    :catch_2
    if-eqz p1, :cond_0

    throw p1

    :cond_0
    throw v1
.end method

.method public final c(LGT;Ljava/util/Map;)LHV0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGT;",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LHV0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    invoke-virtual {p1}, LGT;->e()LDo6;

    move-result-object v0

    invoke-virtual {p1}, LGT;->d()Lux1;

    move-result-object v1

    invoke-virtual {v1}, Lux1;->d()Lfg1;

    move-result-object v1

    invoke-virtual {p1}, LGT;->c()[B

    move-result-object p1

    invoke-static {p1, v0, v1}, LzS0;->b([BLDo6;Lfg1;)[LzS0;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v6, p1, v4

    invoke-virtual {v6}, LzS0;->c()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-array v2, v5, [B

    array-length v4, p1

    move v5, v3

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v7, p1, v5

    invoke-virtual {v7}, LzS0;->a()[B

    move-result-object v8

    invoke-virtual {v7}, LzS0;->c()I

    move-result v7

    invoke-virtual {p0, v8, v7}, LFV0;->a([BI)V

    move v9, v3

    :goto_2
    if-ge v9, v7, :cond_1

    add-int/lit8 v10, v6, 0x1

    aget-byte v11, v8, v9

    aput-byte v11, v2, v6

    add-int/lit8 v9, v9, 0x1

    move v6, v10

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2, v0, v1, p2}, LxV0;->a([BLDo6;Lfg1;Ljava/util/Map;)LHV0;

    move-result-object p1

    return-object p1
.end method
