.class public final LX11;
.super LW11;
.source "SourceFile"


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Lw00;Z)V
    .locals 0

    invoke-direct {p0, p1}, LW11;-><init>(Lw00;)V

    iput-boolean p2, p0, LX11;->c:Z

    return-void
.end method


# virtual methods
.method public g(LSx;)V
    .locals 13

    invoke-virtual {p0}, LW11;->d()[LTl0;

    move-result-object v0

    invoke-virtual {p0}, LX11;->m()V

    invoke-virtual {p0, v0, p1}, LX11;->l([LTl0;LSx;)V

    invoke-virtual {p0}, LW11;->a()Lw00;

    move-result-object v1

    iget-boolean v2, p0, LX11;->c:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lw00;->h()LfN4;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lw00;->i()LfN4;

    move-result-object v2

    :goto_0
    iget-boolean v3, p0, LX11;->c:Z

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lw00;->b()LfN4;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lw00;->c()LfN4;

    move-result-object v1

    :goto_1
    invoke-virtual {v2}, LfN4;->d()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0, v2}, LW11;->e(I)I

    move-result v2

    invoke-virtual {v1}, LfN4;->d()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v1}, LW11;->e(I)I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    move v6, v3

    move v7, v4

    :goto_2
    if-ge v2, v1, :cond_c

    aget-object v8, v0, v2

    if-eqz v8, :cond_b

    invoke-virtual {v8}, LTl0;->c()I

    move-result v9

    sub-int/2addr v9, v5

    if-nez v9, :cond_2

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_2
    if-ne v9, v4, :cond_3

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v8}, LTl0;->c()I

    move-result v5

    :goto_3
    move v6, v4

    goto :goto_8

    :cond_3
    const/4 v10, 0x0

    if-ltz v9, :cond_a

    invoke-virtual {v8}, LTl0;->c()I

    move-result v11

    invoke-virtual {p1}, LSx;->c()I

    move-result v12

    if-ge v11, v12, :cond_a

    if-le v9, v2, :cond_4

    goto :goto_7

    :cond_4
    const/4 v11, 0x2

    if-le v7, v11, :cond_5

    add-int/lit8 v11, v7, -0x2

    mul-int/2addr v9, v11

    :cond_5
    if-lt v9, v2, :cond_6

    move v11, v4

    goto :goto_4

    :cond_6
    move v11, v3

    :goto_4
    move v12, v4

    :goto_5
    if-gt v12, v9, :cond_8

    if-nez v11, :cond_8

    sub-int v11, v2, v12

    aget-object v11, v0, v11

    if-eqz v11, :cond_7

    move v11, v4

    goto :goto_6

    :cond_7
    move v11, v3

    :goto_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_8
    if-eqz v11, :cond_9

    aput-object v10, v0, v2

    goto :goto_8

    :cond_9
    invoke-virtual {v8}, LTl0;->c()I

    move-result v5

    goto :goto_3

    :cond_a
    :goto_7
    aput-object v10, v0, v2

    :cond_b
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_c
    return-void
.end method

.method public final h(LSx;)V
    .locals 10

    invoke-virtual {p0}, LW11;->a()Lw00;

    move-result-object v0

    iget-boolean v1, p0, LX11;->c:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lw00;->h()LfN4;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lw00;->i()LfN4;

    move-result-object v1

    :goto_0
    iget-boolean v2, p0, LX11;->c:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lw00;->b()LfN4;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lw00;->c()LfN4;

    move-result-object v0

    :goto_1
    invoke-virtual {v1}, LfN4;->d()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v1}, LW11;->e(I)I

    move-result v1

    invoke-virtual {v0}, LfN4;->d()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, LW11;->e(I)I

    move-result v0

    invoke-virtual {p0}, LW11;->d()[LTl0;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    move v6, v3

    :goto_2
    if-ge v1, v0, :cond_6

    aget-object v7, v2, v1

    if-eqz v7, :cond_5

    invoke-virtual {v7}, LTl0;->j()V

    invoke-virtual {v7}, LTl0;->c()I

    move-result v8

    sub-int/2addr v8, v4

    if-nez v8, :cond_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_2
    if-ne v8, v3, :cond_3

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v7}, LTl0;->c()I

    move-result v4

    :goto_3
    move v5, v3

    goto :goto_4

    :cond_3
    invoke-virtual {v7}, LTl0;->c()I

    move-result v8

    invoke-virtual {p1}, LSx;->c()I

    move-result v9

    if-lt v8, v9, :cond_4

    const/4 v7, 0x0

    aput-object v7, v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, LTl0;->c()I

    move-result v4

    goto :goto_3

    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public i()LSx;
    .locals 12

    invoke-virtual {p0}, LW11;->d()[LTl0;

    move-result-object v0

    new-instance v1, Lyy;

    invoke-direct {v1}, Lyy;-><init>()V

    new-instance v2, Lyy;

    invoke-direct {v2}, Lyy;-><init>()V

    new-instance v3, Lyy;

    invoke-direct {v3}, Lyy;-><init>()V

    new-instance v4, Lyy;

    invoke-direct {v4}, Lyy;-><init>()V

    array-length v5, v0

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x3

    if-ge v7, v5, :cond_5

    aget-object v9, v0, v7

    if-eqz v9, :cond_4

    invoke-virtual {v9}, LTl0;->j()V

    invoke-virtual {v9}, LTl0;->e()I

    move-result v10

    rem-int/lit8 v10, v10, 0x1e

    invoke-virtual {v9}, LTl0;->c()I

    move-result v9

    iget-boolean v11, p0, LX11;->c:Z

    if-nez v11, :cond_0

    add-int/lit8 v9, v9, 0x2

    :cond_0
    rem-int/2addr v9, v8

    const/4 v8, 0x1

    if-eqz v9, :cond_3

    if-eq v9, v8, :cond_2

    const/4 v8, 0x2

    if-eq v9, v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v1, v10}, Lyy;->b(I)V

    goto :goto_1

    :cond_2
    div-int/lit8 v8, v10, 0x3

    invoke-virtual {v4, v8}, Lyy;->b(I)V

    rem-int/lit8 v10, v10, 0x3

    invoke-virtual {v3, v10}, Lyy;->b(I)V

    goto :goto_1

    :cond_3
    mul-int/lit8 v10, v10, 0x3

    add-int/2addr v10, v8

    invoke-virtual {v2, v10}, Lyy;->b(I)V

    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Lyy;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v2}, Lyy;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v3}, Lyy;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v4}, Lyy;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Lyy;->a()[I

    move-result-object v5

    aget v5, v5, v6

    if-lez v5, :cond_7

    invoke-virtual {v2}, Lyy;->a()[I

    move-result-object v5

    aget v5, v5, v6

    invoke-virtual {v3}, Lyy;->a()[I

    move-result-object v7

    aget v7, v7, v6

    add-int/2addr v5, v7

    if-lt v5, v8, :cond_7

    invoke-virtual {v2}, Lyy;->a()[I

    move-result-object v5

    aget v5, v5, v6

    invoke-virtual {v3}, Lyy;->a()[I

    move-result-object v7

    aget v7, v7, v6

    add-int/2addr v5, v7

    const/16 v7, 0x5a

    if-le v5, v7, :cond_6

    goto :goto_2

    :cond_6
    new-instance v5, LSx;

    invoke-virtual {v1}, Lyy;->a()[I

    move-result-object v1

    aget v1, v1, v6

    invoke-virtual {v2}, Lyy;->a()[I

    move-result-object v2

    aget v2, v2, v6

    invoke-virtual {v3}, Lyy;->a()[I

    move-result-object v3

    aget v3, v3, v6

    invoke-virtual {v4}, Lyy;->a()[I

    move-result-object v4

    aget v4, v4, v6

    invoke-direct {v5, v1, v2, v3, v4}, LSx;-><init>(IIII)V

    invoke-virtual {p0, v0, v5}, LX11;->l([LTl0;LSx;)V

    return-object v5

    :cond_7
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public j()[I
    .locals 7

    invoke-virtual {p0}, LX11;->i()LSx;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, LX11;->h(LSx;)V

    invoke-virtual {v0}, LSx;->c()I

    move-result v0

    new-array v1, v0, [I

    invoke-virtual {p0}, LW11;->d()[LTl0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LTl0;->c()I

    move-result v5

    if-ge v5, v0, :cond_1

    aget v6, v1, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v1, v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LX11;->c:Z

    return v0
.end method

.method public final l([LTl0;LSx;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_7

    aget-object v1, p1, v0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LTl0;->e()I

    move-result v2

    rem-int/lit8 v2, v2, 0x1e

    invoke-virtual {v1}, LTl0;->c()I

    move-result v1

    invoke-virtual {p2}, LSx;->c()I

    move-result v3

    const/4 v4, 0x0

    if-le v1, v3, :cond_0

    aput-object v4, p1, v0

    goto :goto_1

    :cond_0
    iget-boolean v3, p0, LX11;->c:Z

    if-nez v3, :cond_1

    add-int/lit8 v1, v1, 0x2

    :cond_1
    rem-int/lit8 v1, v1, 0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p2}, LSx;->a()I

    move-result v1

    if-eq v2, v1, :cond_6

    aput-object v4, p1, v0

    goto :goto_1

    :cond_3
    div-int/lit8 v1, v2, 0x3

    invoke-virtual {p2}, LSx;->b()I

    move-result v3

    if-ne v1, v3, :cond_4

    rem-int/lit8 v2, v2, 0x3

    invoke-virtual {p2}, LSx;->d()I

    move-result v1

    if-eq v2, v1, :cond_6

    :cond_4
    aput-object v4, p1, v0

    goto :goto_1

    :cond_5
    mul-int/lit8 v2, v2, 0x3

    add-int/2addr v2, v3

    invoke-virtual {p2}, LSx;->e()I

    move-result v1

    if-eq v2, v1, :cond_6

    aput-object v4, p1, v0

    :cond_6
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final m()V
    .locals 4

    invoke-virtual {p0}, LW11;->d()[LTl0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LTl0;->j()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IsLeft: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, LX11;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-super {p0}, LW11;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
