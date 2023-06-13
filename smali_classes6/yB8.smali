.class public LyB8;
.super LOA8;
.source "SourceFile"


# instance fields
.field public final f:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, LOA8;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LyB8;->f:[B

    return-void
.end method


# virtual methods
.method public final E(Lzy8;II)Z
    .locals 5

    invoke-virtual {p1}, Lzy8;->b()I

    move-result p2

    if-gt p3, p2, :cond_4

    invoke-virtual {p1}, Lzy8;->b()I

    move-result p2

    if-gt p3, p2, :cond_3

    instance-of p2, p1, LyB8;

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    check-cast p1, LyB8;

    iget-object p2, p0, LyB8;->f:[B

    iget-object v1, p1, LyB8;->f:[B

    invoke-virtual {p0}, LyB8;->F()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {p0}, LyB8;->F()I

    move-result p3

    invoke-virtual {p1}, LyB8;->F()I

    move-result p1

    :goto_0
    if-ge p3, v2, :cond_1

    aget-byte v3, p2, p3

    aget-byte v4, v1, p1

    if-eq v3, v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 p3, p3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-virtual {p1, v0, p3}, Lzy8;->h(II)Lzy8;

    move-result-object p1

    invoke-virtual {p0, v0, p3}, Lzy8;->h(II)Lzy8;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzy8;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lzy8;->b()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3b

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Ran off end of other: 0, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lzy8;->b()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Length too large: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public F()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(I)B
    .locals 1

    iget-object v0, p0, LyB8;->f:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LyB8;->f:[B

    array-length v0, v0

    return v0
.end method

.method public final e(III)I
    .locals 1

    iget-object p2, p0, LyB8;->f:[B

    invoke-virtual {p0}, LyB8;->F()I

    move-result v0

    invoke-static {p1, p2, v0, p3}, LyI8;->a(I[BII)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzy8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lzy8;->b()I

    move-result v1

    move-object v3, p1

    check-cast v3, Lzy8;

    invoke-virtual {v3}, Lzy8;->b()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lzy8;->b()I

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    instance-of v0, p1, LyB8;

    if-eqz v0, :cond_5

    check-cast p1, LyB8;

    invoke-virtual {p0}, Lzy8;->D()I

    move-result v0

    invoke-virtual {p1}, Lzy8;->D()I

    move-result v1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eq v0, v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lzy8;->b()I

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, LOA8;->E(Lzy8;II)Z

    move-result p1

    return p1

    :cond_5
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, LyB8;->f:[B

    invoke-virtual {p0}, LyB8;->F()I

    move-result v2

    invoke-virtual {p0}, Lzy8;->b()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final h(II)Lzy8;
    .locals 2

    const/4 p1, 0x0

    invoke-virtual {p0}, Lzy8;->b()I

    move-result v0

    invoke-static {p1, p2, v0}, Lzy8;->y(III)I

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lzy8;->c:Lzy8;

    return-object p1

    :cond_0
    new-instance p2, Liz8;

    iget-object v0, p0, LyB8;->f:[B

    invoke-virtual {p0}, LyB8;->F()I

    move-result v1

    invoke-direct {p2, v0, v1, p1}, Liz8;-><init>([BII)V

    return-object p2
.end method

.method public final u(LQx8;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LyB8;->f:[B

    invoke-virtual {p0}, LyB8;->F()I

    move-result v1

    invoke-virtual {p0}, Lzy8;->b()I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, LQx8;->a([BII)V

    return-void
.end method

.method public v([BIII)V
    .locals 0

    iget-object p2, p0, LyB8;->f:[B

    const/4 p3, 0x0

    invoke-static {p2, p3, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public w(I)B
    .locals 1

    iget-object v0, p0, LyB8;->f:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final zzc()Z
    .locals 3

    invoke-virtual {p0}, LyB8;->F()I

    move-result v0

    iget-object v1, p0, LyB8;->f:[B

    invoke-virtual {p0}, Lzy8;->b()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v0, v2}, Lu09;->g([BII)Z

    move-result v0

    return v0
.end method
