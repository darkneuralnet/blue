.class public Lr01;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[[I


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    iput-object v1, p0, Lr01;->a:[[I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    move v3, v1

    :goto_1
    const/4 v4, 0x3

    if-ge v3, v4, :cond_0

    iget-object v4, p0, Lr01;->a:[[I

    aget-object v4, v4, v2

    const/4 v5, -0x1

    aput v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x3
    .end array-data
.end method

.method public static b(I)I
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public a(LSl2;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    const/4 v2, 0x1

    :goto_1
    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    invoke-virtual {p1, v0, v2}, LSl2;->e(II)I

    move-result v3

    if-eq v3, v1, :cond_0

    if-nez v3, :cond_2

    :cond_0
    invoke-virtual {p0, v0, v2}, Lr01;->g(II)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lr01;->a:[[I

    aget-object v4, v4, v0

    invoke-static {v3}, Lr01;->b(I)I

    move-result v3

    aput v3, v4, v2

    goto :goto_2

    :cond_1
    iget-object v4, p0, Lr01;->a:[[I

    aget-object v4, v4, v0

    aget v5, v4, v2

    invoke-static {v3}, Lr01;->b(I)I

    move-result v3

    add-int/2addr v5, v3

    aput v5, v4, v2

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public c(I)I
    .locals 2

    iget-object v0, p0, Lr01;->a:[[I

    aget-object p1, v0, p1

    const/4 v0, 0x2

    aget v0, p1, v0

    const/4 v1, 0x1

    aget p1, p1, v1

    sub-int/2addr v0, p1

    return v0
.end method

.method public d(II)I
    .locals 1

    iget-object v0, p0, Lr01;->a:[[I

    aget-object p1, v0, p1

    aget p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e()Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    move v2, v0

    :goto_1
    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lr01;->a:[[I

    aget-object v3, v3, v1

    aget v3, v3, v2

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public f(I)Z
    .locals 2

    iget-object v0, p0, Lr01;->a:[[I

    aget-object p1, v0, p1

    const/4 v0, 0x1

    aget p1, p1, v0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g(II)Z
    .locals 1

    iget-object v0, p0, Lr01;->a:[[I

    aget-object p1, v0, p1

    aget p1, p1, p2

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Lr01;->f(I)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lr01;->a:[[I

    aget-object v3, v3, v1

    const/4 v4, 0x1

    aget v5, v3, v4

    aget v2, v3, v2

    if-ge v2, v5, :cond_0

    move v5, v2

    :cond_0
    if-gez v5, :cond_1

    move v5, v0

    :cond_1
    move v2, v4

    :goto_1
    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lr01;->a:[[I

    aget-object v3, v3, v1

    aget v6, v3, v2

    if-le v6, v5, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v0

    :goto_2
    aput v6, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr01;->a:[[I

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr01;->a:[[I

    aget-object v2, v4, v2

    const/4 v4, 0x2

    aget v2, v2, v4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " B: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr01;->a:[[I

    aget-object v2, v2, v3

    aget v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr01;->a:[[I

    aget-object v1, v1, v3

    aget v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
