.class public LQv;
.super LZ;
.source "SourceFile"


# direct methods
.method public constructor <init>(ZILE;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LZ;-><init>(ZILE;)V

    return-void
.end method


# virtual methods
.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xa0

    iget v1, p0, LZ;->b:I

    invoke-virtual {p1, p2, v0, v1}, LQ;->v(ZII)V

    const/16 p2, 0x80

    invoke-virtual {p1, p2}, LQ;->f(I)V

    iget-boolean p2, p0, LZ;->c:Z

    if-nez p2, :cond_4

    iget-object p2, p0, LZ;->d:LE;

    instance-of v0, p2, LO;

    if-eqz v0, :cond_1

    instance-of v0, p2, LIv;

    if-eqz v0, :cond_0

    check-cast p2, LIv;

    invoke-virtual {p2}, LIv;->G()Ljava/util/Enumeration;

    move-result-object p2

    goto :goto_0

    :cond_0
    check-cast p2, LO;

    new-instance v0, LIv;

    invoke-virtual {p2}, LO;->C()[B

    move-result-object p2

    invoke-direct {v0, p2}, LIv;-><init>([B)V

    invoke-virtual {v0}, LIv;->G()Ljava/util/Enumeration;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of v0, p2, LU;

    if-eqz v0, :cond_2

    check-cast p2, LU;

    invoke-virtual {p2}, LU;->C()Ljava/util/Enumeration;

    move-result-object p2

    goto :goto_0

    :cond_2
    instance-of v0, p2, LW;

    if-eqz v0, :cond_3

    check-cast p2, LW;

    invoke-virtual {p2}, LW;->D()Ljava/util/Enumeration;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, LQ;->h(Ljava/util/Enumeration;)V

    goto :goto_1

    :cond_3
    new-instance p1, Lorg/bouncycastle/asn1/ASN1Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "not implemented: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LZ;->d:LE;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, p0, LZ;->d:LE;

    invoke-interface {p2}, LE;->c()LS;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, LQ;->u(LS;Z)V

    :goto_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LQ;->f(I)V

    invoke-virtual {p1, p2}, LQ;->f(I)V

    return-void
.end method

.method public s()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LZ;->d:LE;

    invoke-interface {v0}, LE;->c()LS;

    move-result-object v0

    invoke-virtual {v0}, LS;->s()I

    move-result v0

    iget-boolean v1, p0, LZ;->c:Z

    if-eqz v1, :cond_0

    iget v1, p0, LZ;->b:I

    invoke-static {v1}, LER5;->b(I)I

    move-result v1

    invoke-static {v0}, LER5;->a(I)I

    move-result v2

    add-int/2addr v1, v2

    :goto_0
    add-int/2addr v1, v0

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iget v1, p0, LZ;->b:I

    invoke-static {v1}, LER5;->b(I)I

    move-result v1

    goto :goto_0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, LZ;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LZ;->d:LE;

    invoke-interface {v0}, LE;->c()LS;

    move-result-object v0

    invoke-virtual {v0}, LS;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
