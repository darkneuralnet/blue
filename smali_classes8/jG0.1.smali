.class public LjG0;
.super LH;
.source "SourceFile"


# direct methods
.method public constructor <init>(LF;)V
    .locals 0

    invoke-direct {p0, p1}, LH;-><init>(LF;)V

    return-void
.end method

.method public constructor <init>(LN;LK;LS;ILS;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LH;-><init>(LN;LK;LS;ILS;)V

    return-void
.end method


# virtual methods
.method public o(LQ;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v1, p0, LH;->b:LN;

    const-string v2, "DL"

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, LM;->h(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :cond_0
    iget-object v1, p0, LH;->c:LK;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, LM;->h(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :cond_1
    iget-object v1, p0, LH;->d:LS;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, LM;->h(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :cond_2
    new-instance v1, LrG0;

    iget v3, p0, LH;->e:I

    iget-object v4, p0, LH;->f:LS;

    const/4 v5, 0x1

    invoke-direct {v1, v5, v3, v4}, LrG0;-><init>(ZILE;)V

    invoke-virtual {v1, v2}, LM;->h(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    const/16 v1, 0x8

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/16 v2, 0x20

    invoke-virtual {p1, p2, v2, v1, v0}, LQ;->m(ZII[B)V

    return-void
.end method

.method public s()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LM;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public y()LS;
    .locals 0

    return-object p0
.end method
