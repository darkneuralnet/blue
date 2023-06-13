.class public final LXS7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsu9;

.field public b:Luu9;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lsu9;->D()Lsu9;

    move-result-object v0

    iput-object v0, p0, LXS7;->a:Lsu9;

    invoke-static {}, Lwu9;->w()Luu9;

    move-result-object v0

    iput-object v0, p0, LXS7;->b:Luu9;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Luu9;
    .locals 9

    iget-object v0, p0, LXS7;->a:Lsu9;

    invoke-virtual {v0}, Lsu9;->B()Lnh9;

    move-result-object v0

    invoke-virtual {v0}, Lnh9;->c()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LXS7;->b:Luu9;

    invoke-static {}, LqX8;->b()LLW8;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [[B

    iget-object v4, p0, LXS7;->a:Lsu9;

    invoke-virtual {v4}, Lsu9;->B()Lnh9;

    move-result-object v4

    invoke-virtual {v4}, Lnh9;->D()[B

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v3, v4

    move p1, v5

    move v4, p1

    :goto_0
    if-ge p1, v2, :cond_0

    aget-object v6, v3, p1

    array-length v6, v6

    add-int/2addr v4, v6

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v4, [B

    move v4, v5

    move v6, v4

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v7, v3, v4

    array-length v8, v7

    invoke-static {v7, v5, p1, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v6, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v1, p1}, LLW8;->b([B)LAW8;

    move-result-object p1

    invoke-virtual {p1}, LAW8;->e()[B

    move-result-object p1

    invoke-static {p1}, Lnh9;->x([B)Lnh9;

    move-result-object p1

    invoke-virtual {v0, p1}, Luu9;->y(Lnh9;)Luu9;

    return-object v0

    :cond_2
    iget-object p1, p0, LXS7;->b:Luu9;

    return-object p1
.end method

.method public final b(I)Luu9;
    .locals 2

    iget-object v0, p0, LXS7;->b:Luu9;

    iget-object v1, p0, LXS7;->a:Lsu9;

    invoke-virtual {v1}, Lsu9;->w()I

    move-result v1

    mul-int/2addr v1, p1

    iget-object p1, p0, LXS7;->a:Lsu9;

    invoke-virtual {p1}, Lsu9;->x()I

    move-result p1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Luu9;->A(I)Luu9;

    return-object v0
.end method

.method public final c(LRQ8;)Luu9;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRQ8<",
            "Ljava/lang/String;",
            ">;)",
            "Luu9;"
        }
    .end annotation

    iget-object v0, p0, LXS7;->a:Lsu9;

    invoke-virtual {v0}, Lsu9;->E()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    rem-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    add-int/2addr v1, v2

    new-array v1, v1, [B

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnh9;

    invoke-virtual {v2}, Lnh9;->D()[B

    move-result-object v2

    invoke-static {v2}, LAU7;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, LXO8;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    div-int/lit8 v2, v3, 0x8

    aget-byte v5, v1, v2

    rem-int/lit8 v6, v3, 0x8

    shl-int v6, v4, v6

    int-to-byte v6, v6

    or-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LXS7;->b:Luu9;

    invoke-static {v1}, Lnh9;->x([B)Lnh9;

    move-result-object v0

    invoke-virtual {p1, v0}, Luu9;->B(Lnh9;)Luu9;

    return-object p1
.end method

.method public final d(I)Luu9;
    .locals 3

    iget-object v0, p0, LXS7;->a:Lsu9;

    invoke-virtual {v0}, Lsu9;->A()I

    move-result v0

    if-eqz v0, :cond_0

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    iget-object v0, p0, LXS7;->a:Lsu9;

    invoke-virtual {v0}, Lsu9;->y()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, LXS7;->a:Lsu9;

    invoke-virtual {v1}, Lsu9;->A()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, LXS7;->b:Luu9;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Luu9;->C(I)Luu9;

    return-object v2

    :cond_0
    iget-object p1, p0, LXS7;->b:Luu9;

    return-object p1
.end method

.method public final e()Lwu9;
    .locals 1

    iget-object v0, p0, LXS7;->b:Luu9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, Lwu9;

    return-object v0
.end method

.method public final f(Lsu9;)V
    .locals 0

    iput-object p1, p0, LXS7;->a:Lsu9;

    invoke-static {}, Lwu9;->w()Luu9;

    move-result-object p1

    iput-object p1, p0, LXS7;->b:Luu9;

    return-void
.end method
