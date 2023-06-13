.class public Lhv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwj0;
.implements Ljava/security/PrivateKey;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public b:LrO2;


# direct methods
.method public constructor <init>(LrO2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhv;->b:LrO2;

    return-void
.end method


# virtual methods
.method public a()LPA1;
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->a()LPA1;

    move-result-object v0

    return-object v0
.end method

.method public b()LTX3;
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->b()LTX3;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->c()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->d()I

    move-result v0

    return v0
.end method

.method public e()LhR3;
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->e()LhR3;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lhv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lhv;

    invoke-virtual {p0}, Lhv;->d()I

    move-result v0

    invoke-virtual {p1}, Lhv;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lhv;->c()I

    move-result v0

    invoke-virtual {p1}, Lhv;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lhv;->a()LPA1;

    move-result-object v0

    invoke-virtual {p1}, Lhv;->a()LPA1;

    move-result-object v2

    invoke-virtual {v0, v2}, LPA1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lhv;->b()LTX3;

    move-result-object v0

    invoke-virtual {p1}, Lhv;->b()LTX3;

    move-result-object v2

    invoke-virtual {v0, v2}, LTX3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lhv;->g()LOA1;

    move-result-object v0

    invoke-virtual {p1}, Lhv;->g()LOA1;

    move-result-object v2

    invoke-virtual {v0, v2}, LOA1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lhv;->e()LhR3;

    move-result-object v0

    invoke-virtual {p1}, Lhv;->e()LhR3;

    move-result-object v2

    invoke-virtual {v0, v2}, LhR3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lhv;->f()LhR3;

    move-result-object v0

    invoke-virtual {p1}, Lhv;->f()LhR3;

    move-result-object p1

    invoke-virtual {v0, p1}, LhR3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()LhR3;
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->f()LhR3;

    move-result-object v0

    return-object v0
.end method

.method public g()LOA1;
    .locals 1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->g()LOA1;

    move-result-object v0

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "McEliece"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 9

    new-instance v8, LqO2;

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->d()I

    move-result v1

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->c()I

    move-result v2

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->a()LPA1;

    move-result-object v3

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->b()LTX3;

    move-result-object v4

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->e()LhR3;

    move-result-object v5

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->f()LhR3;

    move-result-object v6

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->g()LOA1;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LqO2;-><init>(IILPA1;LTX3;LhR3;LhR3;LOA1;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, LG9;

    sget-object v2, LBD3;->m:LN;

    invoke-direct {v1, v2}, LG9;-><init>(LN;)V

    new-instance v2, Ll64;

    invoke-direct {v2, v1, v8}, Ll64;-><init>(LG9;LE;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v2}, LM;->getEncoded()[B

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhv;->b:LrO2;

    invoke-virtual {v0}, LrO2;->c()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->d()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->a()LPA1;

    move-result-object v1

    invoke-virtual {v1}, LPA1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->b()LTX3;

    move-result-object v1

    invoke-virtual {v1}, LTX3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->e()LhR3;

    move-result-object v1

    invoke-virtual {v1}, LhR3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->f()LhR3;

    move-result-object v1

    invoke-virtual {v1}, LhR3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lhv;->b:LrO2;

    invoke-virtual {v1}, LrO2;->g()LOA1;

    move-result-object v1

    invoke-virtual {v1}, LOA1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
