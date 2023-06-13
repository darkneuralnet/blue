.class public LY;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:I

.field public final c:[[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    invoke-static {p1}, LER5;->c(Ljava/io/InputStream;)I

    move-result v0

    invoke-direct {p0, p1, v0}, LY;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY;->a:Ljava/io/InputStream;

    iput p2, p0, LY;->b:I

    const/16 p1, 0xb

    new-array p1, p1, [[B

    iput-object p1, p0, LY;->c:[[B

    return-void
.end method


# virtual methods
.method public a(I)LE;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    new-instance p1, LPv;

    invoke-direct {p1, p0}, LPv;-><init>(LY;)V

    return-object p1

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown BER object encountered: 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, LNv;

    invoke-direct {p1, p0}, LNv;-><init>(LY;)V

    return-object p1

    :cond_2
    new-instance p1, LOF0;

    invoke-direct {p1, p0}, LOF0;-><init>(LY;)V

    return-object p1

    :cond_3
    new-instance p1, LJv;

    invoke-direct {p1, p0}, LJv;-><init>(LY;)V

    return-object p1
.end method

.method public b()LE;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LY;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LY;->e(Z)V

    iget-object v2, p0, LY;->a:Ljava/io/InputStream;

    invoke-static {v2, v0}, LJ;->l(Ljava/io/InputStream;I)I

    move-result v2

    and-int/lit8 v3, v0, 0x20

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    iget-object v5, p0, LY;->a:Ljava/io/InputStream;

    iget v6, p0, LY;->b:I

    const/16 v7, 0x8

    const/16 v8, 0x11

    const/16 v9, 0x10

    const/4 v10, 0x4

    if-eq v2, v10, :cond_2

    if-eq v2, v9, :cond_2

    if-eq v2, v8, :cond_2

    if-ne v2, v7, :cond_3

    :cond_2
    move v1, v4

    :cond_3
    invoke-static {v5, v6, v1}, LJ;->i(Ljava/io/InputStream;IZ)I

    move-result v1

    const/16 v5, 0xc0

    if-gez v1, :cond_8

    if-eqz v3, :cond_7

    new-instance v1, Ll12;

    iget-object v3, p0, LY;->a:Ljava/io/InputStream;

    iget v6, p0, LY;->b:I

    invoke-direct {v1, v3, v6}, Ll12;-><init>(Ljava/io/InputStream;I)V

    new-instance v3, LY;

    iget v6, p0, LY;->b:I

    invoke-direct {v3, v1, v6}, LY;-><init>(Ljava/io/InputStream;I)V

    and-int/lit16 v1, v0, 0xc0

    if-ne v1, v5, :cond_4

    new-instance v0, LLv;

    invoke-direct {v0, v2, v3}, LLv;-><init>(ILY;)V

    return-object v0

    :cond_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    new-instance v0, LGv;

    invoke-direct {v0, v2, v3}, LGv;-><init>(ILY;)V

    return-object v0

    :cond_5
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_6

    new-instance v0, LRv;

    invoke-direct {v0, v4, v2, v3}, LRv;-><init>(ZILY;)V

    return-object v0

    :cond_6
    invoke-virtual {v3, v2}, LY;->a(I)LE;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite-length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v4, LlZ0;

    iget-object v6, p0, LY;->a:Ljava/io/InputStream;

    iget v11, p0, LY;->b:I

    invoke-direct {v4, v6, v1, v11}, LlZ0;-><init>(Ljava/io/InputStream;II)V

    and-int/lit16 v1, v0, 0xc0

    if-ne v1, v5, :cond_9

    new-instance v0, LmG0;

    invoke-virtual {v4}, LlZ0;->f()[B

    move-result-object v1

    invoke-direct {v0, v3, v2, v1}, LmG0;-><init>(ZI[B)V

    return-object v0

    :cond_9
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_a

    new-instance v0, LhG0;

    invoke-virtual {v4}, LlZ0;->f()[B

    move-result-object v1

    invoke-direct {v0, v3, v2, v1}, LhG0;-><init>(ZI[B)V

    return-object v0

    :cond_a
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_b

    new-instance v0, LRv;

    new-instance v1, LY;

    invoke-direct {v1, v4}, LY;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v3, v2, v1}, LRv;-><init>(ZILY;)V

    return-object v0

    :cond_b
    if-eqz v3, :cond_10

    if-eq v2, v10, :cond_f

    if-eq v2, v7, :cond_e

    if-eq v2, v9, :cond_d

    if-ne v2, v8, :cond_c

    new-instance v0, LqG0;

    new-instance v1, LY;

    invoke-direct {v1, v4}, LY;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, LqG0;-><init>(LY;)V

    return-object v0

    :cond_c
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unknown tag "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " encountered"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, LoG0;

    new-instance v1, LY;

    invoke-direct {v1, v4}, LY;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, LoG0;-><init>(LY;)V

    return-object v0

    :cond_e
    new-instance v0, LOF0;

    new-instance v1, LY;

    invoke-direct {v1, v4}, LY;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, LOF0;-><init>(LY;)V

    return-object v0

    :cond_f
    new-instance v0, LJv;

    new-instance v1, LY;

    invoke-direct {v1, v4}, LY;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, LJv;-><init>(LY;)V

    return-object v0

    :cond_10
    if-eq v2, v10, :cond_11

    :try_start_0
    iget-object v0, p0, LY;->c:[[B

    invoke-static {v2, v4, v0}, LJ;->b(ILlZ0;[[B)LS;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1Exception;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_11
    new-instance v0, LWF0;

    invoke-direct {v0, v4}, LWF0;-><init>(LlZ0;)V

    return-object v0
.end method

.method public c(ZI)LS;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, LY;->a:Ljava/io/InputStream;

    check-cast p1, LlZ0;

    new-instance v1, LrG0;

    new-instance v2, LVF0;

    invoke-virtual {p1}, LlZ0;->f()[B

    move-result-object p1

    invoke-direct {v2, p1}, LVF0;-><init>([B)V

    invoke-direct {v1, v0, p2, v2}, LrG0;-><init>(ZILE;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, LY;->d()LF;

    move-result-object p1

    iget-object v1, p0, LY;->a:Ljava/io/InputStream;

    instance-of v1, v1, Ll12;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LF;->f()I

    move-result v1

    if-ne v1, v2, :cond_1

    new-instance v1, LQv;

    invoke-virtual {p1, v0}, LF;->d(I)LE;

    move-result-object p1

    invoke-direct {v1, v2, p2, p1}, LQv;-><init>(ZILE;)V

    goto :goto_0

    :cond_1
    new-instance v1, LQv;

    invoke-static {p1}, LHv;->a(LF;)LMv;

    move-result-object p1

    invoke-direct {v1, v0, p2, p1}, LQv;-><init>(ZILE;)V

    :goto_0
    return-object v1

    :cond_2
    invoke-virtual {p1}, LF;->f()I

    move-result v1

    if-ne v1, v2, :cond_3

    new-instance v1, LrG0;

    invoke-virtual {p1, v0}, LF;->d(I)LE;

    move-result-object p1

    invoke-direct {v1, v2, p2, p1}, LrG0;-><init>(ZILE;)V

    goto :goto_1

    :cond_3
    new-instance v1, LrG0;

    invoke-static {p1}, LkG0;->a(LF;)LU;

    move-result-object p1

    invoke-direct {v1, v0, p2, p1}, LrG0;-><init>(ZILE;)V

    :goto_1
    return-object v1
.end method

.method public d()LF;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LY;->b()LE;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LF;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v1, LF;

    invoke-direct {v1}, LF;-><init>()V

    :cond_1
    instance-of v2, v0, LSZ1;

    if-eqz v2, :cond_2

    check-cast v0, LSZ1;

    invoke-interface {v0}, LSZ1;->a()LS;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {v0}, LE;->c()LS;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, LF;->a(LE;)V

    invoke-virtual {p0}, LY;->b()LE;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1
.end method

.method public final e(Z)V
    .locals 2

    iget-object v0, p0, LY;->a:Ljava/io/InputStream;

    instance-of v1, v0, Ll12;

    if-eqz v1, :cond_0

    check-cast v0, Ll12;

    invoke-virtual {v0, p1}, Ll12;->d(Z)V

    :cond_0
    return-void
.end method
