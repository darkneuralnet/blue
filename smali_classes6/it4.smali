.class public final Lit4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LuB1;


# direct methods
.method public constructor <init>(LuB1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lit4;->a:LuB1;

    return-void
.end method


# virtual methods
.method public a([II)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/common/reedsolomon/ReedSolomonException;
        }
    .end annotation

    new-instance v0, LvB1;

    iget-object v1, p0, Lit4;->a:LuB1;

    invoke-direct {v0, v1, p1}, LvB1;-><init>(LuB1;[I)V

    new-array v1, p2, [I

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    :goto_0
    if-ge v4, p2, :cond_1

    iget-object v6, p0, Lit4;->a:LuB1;

    invoke-virtual {v6}, LuB1;->d()I

    move-result v7

    add-int/2addr v7, v4

    invoke-virtual {v6, v7}, LuB1;->c(I)I

    move-result v6

    invoke-virtual {v0, v6}, LvB1;->c(I)I

    move-result v6

    add-int/lit8 v7, p2, -0x1

    sub-int/2addr v7, v4

    aput v6, v1, v7

    if-eqz v6, :cond_0

    move v5, v3

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    return-void

    :cond_2
    new-instance v0, LvB1;

    iget-object v4, p0, Lit4;->a:LuB1;

    invoke-direct {v0, v4, v1}, LvB1;-><init>(LuB1;[I)V

    iget-object v1, p0, Lit4;->a:LuB1;

    invoke-virtual {v1, p2, v2}, LuB1;->b(II)LvB1;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p2}, Lit4;->d(LvB1;LvB1;I)[LvB1;

    move-result-object p2

    aget-object v0, p2, v3

    aget-object p2, p2, v2

    invoke-virtual {p0, v0}, Lit4;->b(LvB1;)[I

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lit4;->c(LvB1;[I)[I

    move-result-object p2

    :goto_1
    array-length v1, v0

    if-ge v3, v1, :cond_4

    array-length v1, p1

    sub-int/2addr v1, v2

    iget-object v4, p0, Lit4;->a:LuB1;

    aget v5, v0, v3

    invoke-virtual {v4, v5}, LuB1;->i(I)I

    move-result v4

    sub-int/2addr v1, v4

    if-ltz v1, :cond_3

    aget v4, p1, v1

    aget v5, p2, v3

    invoke-static {v4, v5}, LuB1;->a(II)I

    move-result v4

    aput v4, p1, v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;

    const-string p2, "Bad error location"

    invoke-direct {p1, p2}, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final b(LvB1;)[I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/common/reedsolomon/ReedSolomonException;
        }
    .end annotation

    invoke-virtual {p1}, LvB1;->f()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    new-array v0, v2, [I

    invoke-virtual {p1, v2}, LvB1;->d(I)I

    move-result p1

    aput p1, v0, v1

    return-object v0

    :cond_0
    new-array v3, v0, [I

    :goto_0
    iget-object v4, p0, Lit4;->a:LuB1;

    invoke-virtual {v4}, LuB1;->f()I

    move-result v4

    if-ge v2, v4, :cond_2

    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v2}, LvB1;->c(I)I

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lit4;->a:LuB1;

    invoke-virtual {v4, v2}, LuB1;->h(I)I

    move-result v4

    aput v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-ne v1, v0, :cond_3

    return-object v3

    :cond_3
    new-instance p1, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;

    const-string v0, "Error locator degree does not match number of roots"

    invoke-direct {p1, v0}, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(LvB1;[I)[I
    .locals 9

    array-length v0, p2

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    iget-object v4, p0, Lit4;->a:LuB1;

    aget v5, p2, v3

    invoke-virtual {v4, v5}, LuB1;->h(I)I

    move-result v4

    const/4 v5, 0x1

    move v6, v2

    :goto_1
    if-ge v6, v0, :cond_2

    if-eq v3, v6, :cond_1

    iget-object v7, p0, Lit4;->a:LuB1;

    aget v8, p2, v6

    invoke-virtual {v7, v8, v4}, LuB1;->j(II)I

    move-result v7

    and-int/lit8 v8, v7, 0x1

    if-nez v8, :cond_0

    or-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_0
    and-int/lit8 v7, v7, -0x2

    :goto_2
    iget-object v8, p0, Lit4;->a:LuB1;

    invoke-virtual {v8, v5, v7}, LuB1;->j(II)I

    move-result v5

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    iget-object v6, p0, Lit4;->a:LuB1;

    invoke-virtual {p1, v4}, LvB1;->c(I)I

    move-result v7

    iget-object v8, p0, Lit4;->a:LuB1;

    invoke-virtual {v8, v5}, LuB1;->h(I)I

    move-result v5

    invoke-virtual {v6, v7, v5}, LuB1;->j(II)I

    move-result v5

    aput v5, v1, v3

    iget-object v5, p0, Lit4;->a:LuB1;

    invoke-virtual {v5}, LuB1;->d()I

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Lit4;->a:LuB1;

    aget v6, v1, v3

    invoke-virtual {v5, v6, v4}, LuB1;->j(II)I

    move-result v4

    aput v4, v1, v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method public final d(LvB1;LvB1;I)[LvB1;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/common/reedsolomon/ReedSolomonException;
        }
    .end annotation

    invoke-virtual {p1}, LvB1;->f()I

    move-result v0

    invoke-virtual {p2}, LvB1;->f()I

    move-result v1

    if-ge v0, v1, :cond_0

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :cond_0
    iget-object v0, p0, Lit4;->a:LuB1;

    invoke-virtual {v0}, LuB1;->g()LvB1;

    move-result-object v0

    iget-object v1, p0, Lit4;->a:LuB1;

    invoke-virtual {v1}, LuB1;->e()LvB1;

    move-result-object v1

    :goto_0
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    invoke-virtual {p1}, LvB1;->f()I

    move-result v2

    const/4 v3, 0x2

    div-int/lit8 v4, p3, 0x2

    if-lt v2, v4, :cond_4

    invoke-virtual {p1}, LvB1;->g()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lit4;->a:LuB1;

    invoke-virtual {v2}, LuB1;->g()LvB1;

    move-result-object v2

    invoke-virtual {p1}, LvB1;->f()I

    move-result v3

    invoke-virtual {p1, v3}, LvB1;->d(I)I

    move-result v3

    iget-object v4, p0, Lit4;->a:LuB1;

    invoke-virtual {v4, v3}, LuB1;->h(I)I

    move-result v3

    :goto_1
    invoke-virtual {p2}, LvB1;->f()I

    move-result v4

    invoke-virtual {p1}, LvB1;->f()I

    move-result v5

    if-lt v4, v5, :cond_1

    invoke-virtual {p2}, LvB1;->g()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p2}, LvB1;->f()I

    move-result v4

    invoke-virtual {p1}, LvB1;->f()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Lit4;->a:LuB1;

    invoke-virtual {p2}, LvB1;->f()I

    move-result v6

    invoke-virtual {p2, v6}, LvB1;->d(I)I

    move-result v6

    invoke-virtual {v5, v6, v3}, LuB1;->j(II)I

    move-result v5

    iget-object v6, p0, Lit4;->a:LuB1;

    invoke-virtual {v6, v4, v5}, LuB1;->b(II)LvB1;

    move-result-object v6

    invoke-virtual {v2, v6}, LvB1;->a(LvB1;)LvB1;

    move-result-object v2

    invoke-virtual {p1, v4, v5}, LvB1;->j(II)LvB1;

    move-result-object v4

    invoke-virtual {p2, v4}, LvB1;->a(LvB1;)LvB1;

    move-result-object p2

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, LvB1;->i(LvB1;)LvB1;

    move-result-object v2

    invoke-virtual {v2, v1}, LvB1;->a(LvB1;)LvB1;

    move-result-object v1

    invoke-virtual {p2}, LvB1;->f()I

    move-result v2

    invoke-virtual {p1}, LvB1;->f()I

    move-result v3

    if-ge v2, v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Division algorithm failed to reduce polynomial?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;

    const-string p2, "r_{i-1} was zero"

    invoke-direct {p1, p2}, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 p2, 0x0

    invoke-virtual {v0, p2}, LvB1;->d(I)I

    move-result p3

    if-eqz p3, :cond_5

    iget-object v1, p0, Lit4;->a:LuB1;

    invoke-virtual {v1, p3}, LuB1;->h(I)I

    move-result p3

    invoke-virtual {v0, p3}, LvB1;->h(I)LvB1;

    move-result-object v0

    invoke-virtual {p1, p3}, LvB1;->h(I)LvB1;

    move-result-object p1

    new-array p3, v3, [LvB1;

    aput-object v0, p3, p2

    const/4 p2, 0x1

    aput-object p1, p3, p2

    return-object p3

    :cond_5
    new-instance p1, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;

    const-string p2, "sigmaTilde(0) was zero"

    invoke-direct {p1, p2}, Lcom/google/zxing/common/reedsolomon/ReedSolomonException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
