.class public final Lk09;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[C

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[C)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lk09;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lk09;->b:[C

    :try_start_0
    array-length p1, p2

    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p1, v0}, LI19;->b(ILjava/math/RoundingMode;)I

    move-result v0

    iput v0, p0, Lk09;->d:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {v0}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :try_start_1
    div-int/2addr v2, v1

    iput v2, p0, Lk09;->e:I

    div-int/2addr v0, v1

    iput v0, p0, Lk09;->f:I
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, -0x1

    add-int/2addr p1, v0

    iput p1, p0, Lk09;->c:I

    const/16 p1, 0x80

    new-array v1, p1, [B

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([BB)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_2

    aget-char v4, p2, v3

    if-ge v4, p1, :cond_0

    move v6, v5

    goto :goto_1

    :cond_0
    move v6, v2

    :goto_1
    const-string v7, "Non-ASCII character: %s"

    invoke-static {v6, v7, v4}, LyK8;->f(ZLjava/lang/String;C)V

    aget-byte v6, v1, v4

    if-ne v6, v0, :cond_1

    goto :goto_2

    :cond_1
    move v5, v2

    :goto_2
    const-string v6, "Duplicate character: %s"

    invoke-static {v5, v6, v4}, LyK8;->f(ZLjava/lang/String;C)V

    int-to-byte v5, v3

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lk09;->g:[B

    iget p1, p0, Lk09;->e:I

    new-array p1, p1, [Z

    :goto_3
    iget p2, p0, Lk09;->f:I

    if-ge v2, p2, :cond_3

    mul-int/lit8 p2, v2, 0x8

    iget v0, p0, Lk09;->d:I

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p2, v0, v1}, LI19;->a(IILjava/math/RoundingMode;)I

    move-result p2

    aput-boolean v5, p1, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p2

    const-string v2, "Illegal alphabet "

    if-eqz p2, :cond_4

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_4
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    array-length p2, p2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x23

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Illegal alphabet length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic d(Lk09;)[C
    .locals 0

    iget-object p0, p0, Lk09;->b:[C

    return-object p0
.end method


# virtual methods
.method public final a(I)C
    .locals 1

    iget-object v0, p0, Lk09;->b:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final b()Lk09;
    .locals 7

    iget-object v0, p0, Lk09;->b:[C

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-char v4, v0, v3

    invoke-static {v4}, LMF8;->a(C)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v0, p0, Lk09;->b:[C

    array-length v1, v0

    move v3, v2

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-char v5, v0, v3

    const/16 v6, 0x61

    if-lt v5, v6, :cond_0

    const/16 v6, 0x7a

    if-gt v5, v6, :cond_0

    move v0, v4

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_2
    xor-int/2addr v0, v4

    const-string v1, "Cannot call lowerCase() on a mixed-case alphabet"

    invoke-static {v0, v1}, LyK8;->j(ZLjava/lang/Object;)V

    iget-object v0, p0, Lk09;->b:[C

    array-length v0, v0

    new-array v0, v0, [C

    :goto_3
    iget-object v1, p0, Lk09;->b:[C

    array-length v3, v1

    if-ge v2, v3, :cond_3

    aget-char v1, v1, v2

    invoke-static {v1}, LMF8;->a(C)Z

    move-result v3

    if-eqz v3, :cond_2

    xor-int/lit8 v1, v1, 0x20

    :cond_2
    int-to-char v1, v1

    aput-char v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    new-instance v1, Lk09;

    iget-object v2, p0, Lk09;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".lowerCase()"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lk09;-><init>(Ljava/lang/String;[C)V

    return-object v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method public final c(C)Z
    .locals 1

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lk09;->g:[B

    aget-byte p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lk09;

    if-eqz v0, :cond_0

    check-cast p1, Lk09;

    iget-object v0, p0, Lk09;->b:[C

    iget-object p1, p1, Lk09;->b:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lk09;->b:[C

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk09;->a:Ljava/lang/String;

    return-object v0
.end method
