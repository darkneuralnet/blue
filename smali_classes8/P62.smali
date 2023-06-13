.class public LP62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public b:[[I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, LP62;->b:[[I

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, LP62;->n(I)V

    return-void

    :array_0
    .array-data 4
        0x3
        0x3
    .end array-data
.end method

.method public static l(I)Z
    .locals 1

    if-gez p0, :cond_1

    const/4 v0, -0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public d()Z
    .locals 4

    iget-object v0, p0, LP62;->b:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    aget v0, v0, v1

    invoke-static {v0}, LP62;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP62;->b:[[I

    const/4 v2, 0x2

    aget-object v0, v0, v2

    aget v2, v0, v1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    aget v0, v0, v2

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public e()Z
    .locals 5

    iget-object v0, p0, LP62;->b:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    aget v0, v0, v1

    invoke-static {v0}, LP62;->l(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LP62;->b:[[I

    aget-object v0, v0, v1

    aget v0, v0, v2

    invoke-static {v0}, LP62;->l(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LP62;->b:[[I

    aget-object v0, v0, v2

    aget v0, v0, v1

    invoke-static {v0}, LP62;->l(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LP62;->b:[[I

    aget-object v0, v0, v2

    aget v0, v0, v2

    invoke-static {v0}, LP62;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    iget-object v0, p0, LP62;->b:[[I

    const/4 v3, 0x2

    aget-object v0, v0, v3

    aget v3, v0, v1

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    aget v0, v0, v2

    if-ne v0, v4, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public f(II)Z
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    if-eq p2, v1, :cond_2

    :cond_0
    if-nez p1, :cond_1

    if-eq p2, v0, :cond_2

    :cond_1
    if-ne p1, v1, :cond_4

    if-ne p2, v0, :cond_4

    :cond_2
    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v0

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1

    :cond_4
    if-ne p1, v1, :cond_5

    if-eqz p2, :cond_7

    :cond_5
    if-ne p1, v0, :cond_6

    if-eqz p2, :cond_7

    :cond_6
    if-ne p1, v0, :cond_9

    if-ne p2, v1, :cond_9

    :cond_7
    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v0

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    move v1, v2

    :goto_1
    return v1

    :cond_9
    if-ne p1, v1, :cond_b

    if-ne p2, v1, :cond_b

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v2

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    move v1, v2

    :goto_2
    return v1

    :cond_b
    return v2
.end method

.method public g()Z
    .locals 5

    iget-object v0, p0, LP62;->b:[[I

    const/4 v1, 0x0

    aget-object v2, v0, v1

    aget v3, v2, v1

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    aget v2, v2, v3

    if-ne v2, v4, :cond_0

    aget-object v0, v0, v3

    aget v2, v0, v1

    if-ne v2, v4, :cond_0

    aget v0, v0, v3

    if-ne v0, v4, :cond_0

    move v1, v3

    :cond_0
    return v1
.end method

.method public h()Z
    .locals 1

    invoke-virtual {p0}, LP62;->g()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j(II)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez p1, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    if-ne p1, v1, :cond_3

    if-ne p2, v1, :cond_3

    :cond_1
    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v1

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v1

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0

    :cond_3
    if-ne p1, v0, :cond_5

    if-ne p2, v0, :cond_5

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p2, p1, v2

    if-ne p2, v0, :cond_4

    aget p1, p1, v1

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v1

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    move v0, v2

    :goto_1
    return v0

    :cond_5
    return v2
.end method

.method public k(II)Z
    .locals 3

    if-le p1, p2, :cond_0

    invoke-virtual {p0, p2, p1}, LP62;->k(II)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    if-eq p2, v0, :cond_5

    :cond_1
    if-ne p1, v2, :cond_2

    if-eq p2, v2, :cond_5

    :cond_2
    if-ne p1, v2, :cond_3

    if-eq p2, v0, :cond_5

    :cond_3
    if-nez p1, :cond_4

    if-eq p2, v0, :cond_5

    :cond_4
    if-nez p1, :cond_7

    if-ne p2, v2, :cond_7

    :cond_5
    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v1

    aget p2, p1, v1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_7

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v1

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LP62;->b:[[I

    aget-object p1, p1, v2

    aget p1, p1, v2

    invoke-static {p1}, LP62;->l(I)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    move v1, v2

    :cond_7
    return v1
.end method

.method public m(III)V
    .locals 1

    iget-object v0, p0, LP62;->b:[[I

    aget-object p1, v0, p1

    aput p3, p1, p2

    return-void
.end method

.method public n(I)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_0

    iget-object v4, p0, LP62;->b:[[I

    aget-object v4, v4, v1

    aput p1, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public o(III)V
    .locals 1

    iget-object v0, p0, LP62;->b:[[I

    aget-object p1, v0, p1

    aget v0, p1, p2

    if-ge v0, p3, :cond_0

    aput p3, p1, p2

    :cond_0
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    div-int/lit8 v1, v0, 0x3

    rem-int/lit8 v2, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, LW31;->b(C)I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, LP62;->o(III)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(III)V
    .locals 0

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LP62;->o(III)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "123456789"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_0

    mul-int/lit8 v5, v2, 0x3

    add-int/2addr v5, v4

    iget-object v6, p0, LP62;->b:[[I

    aget-object v6, v6, v2

    aget v6, v6, v4

    invoke-static {v6}, LW31;->a(I)C

    move-result v6

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
