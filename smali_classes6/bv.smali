.class public final Lbv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWr4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LTG;Ljava/util/Map;)LbN4;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTG;",
            "Ljava/util/Map<",
            "LqV0;",
            "*>;)",
            "LbN4;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    new-instance v0, LY11;

    invoke-virtual {p1}, LTG;->a()LET;

    move-result-object p1

    invoke-direct {v0, p1}, LY11;-><init>(LET;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1}, LY11;->a(Z)Lav;

    move-result-object v2

    invoke-virtual {v2}, Lc21;->b()[LfN4;

    move-result-object v3
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v4, LCV0;

    invoke-direct {v4}, LCV0;-><init>()V

    invoke-virtual {v4, v2}, LCV0;->c(Lav;)LHV0;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/zxing/FormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    move-object v3, v1

    :goto_0
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_2

    :catch_3
    move-exception v2

    move-object v3, v1

    :goto_1
    move-object v4, v3

    move-object v3, v1

    :goto_2
    if-nez v1, :cond_2

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, LY11;->a(Z)Lav;

    move-result-object v0

    invoke-virtual {v0}, Lc21;->b()[LfN4;

    move-result-object v4

    new-instance v1, LCV0;

    invoke-direct {v1}, LCV0;-><init>()V

    invoke-virtual {v1, v0}, LCV0;->c(Lav;)LHV0;

    move-result-object v1
    :try_end_2
    .catch Lcom/google/zxing/NotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/google/zxing/FormatException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_3

    :catch_5
    move-exception p1

    :goto_3
    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    throw v3

    :cond_0
    throw p1

    :cond_1
    throw v2

    :cond_2
    :goto_4
    move-object v6, v4

    if-eqz p2, :cond_3

    sget-object v0, LqV0;->l:LqV0;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LgN4;

    if-eqz p2, :cond_3

    array-length v0, v6

    :goto_5
    if-ge p1, v0, :cond_3

    aget-object v2, v6, p1

    invoke-interface {p2, v2}, LgN4;->a(LfN4;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_3
    new-instance p1, LbN4;

    invoke-virtual {v1}, LHV0;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LHV0;->e()[B

    move-result-object v4

    invoke-virtual {v1}, LHV0;->c()I

    move-result v5

    sget-object v7, LQx;->b:LQx;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, LbN4;-><init>(Ljava/lang/String;[BI[LfN4;LQx;J)V

    invoke-virtual {v1}, LHV0;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v0, LdN4;->d:LdN4;

    invoke-virtual {p1, v0, p2}, LbN4;->h(LdN4;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v1}, LHV0;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    sget-object v0, LdN4;->e:LdN4;

    invoke-virtual {p1, v0, p2}, LbN4;->h(LdN4;Ljava/lang/Object;)V

    :cond_5
    return-object p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method
