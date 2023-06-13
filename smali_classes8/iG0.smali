.class public LiG0;
.super LC;
.source "SourceFile"


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, LC;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public o(LQ;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LC;->c:I

    int-to-byte v0, v0

    iget-object v1, p0, LC;->b:[B

    const/4 v2, 0x3

    invoke-virtual {p1, p2, v2, v0, v1}, LQ;->k(ZIB[B)V

    return-void
.end method

.method public s()I
    .locals 2

    iget-object v0, p0, LC;->b:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LER5;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LC;->b:[B

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public y()LS;
    .locals 0

    return-object p0
.end method
