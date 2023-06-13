.class public Lfv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivateKey;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public b:LkO2;


# direct methods
.method public constructor <init>(LkO2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv;->b:LkO2;

    return-void
.end method


# virtual methods
.method public a()LPA1;
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->b()LPA1;

    move-result-object v0

    return-object v0
.end method

.method public b()LTX3;
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->c()LTX3;

    move-result-object v0

    return-object v0
.end method

.method public c()LOA1;
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->d()LOA1;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->e()I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->f()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Lfv;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lfv;

    invoke-virtual {p0}, Lfv;->e()I

    move-result v1

    invoke-virtual {p1}, Lfv;->e()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lfv;->d()I

    move-result v1

    invoke-virtual {p1}, Lfv;->d()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lfv;->a()LPA1;

    move-result-object v1

    invoke-virtual {p1}, Lfv;->a()LPA1;

    move-result-object v2

    invoke-virtual {v1, v2}, LPA1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lfv;->b()LTX3;

    move-result-object v1

    invoke-virtual {p1}, Lfv;->b()LTX3;

    move-result-object v2

    invoke-virtual {v1, v2}, LTX3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lfv;->f()LhR3;

    move-result-object v1

    invoke-virtual {p1}, Lfv;->f()LhR3;

    move-result-object v2

    invoke-virtual {v1, v2}, LhR3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lfv;->c()LOA1;

    move-result-object v1

    invoke-virtual {p1}, Lfv;->c()LOA1;

    move-result-object p1

    invoke-virtual {v1, p1}, LOA1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public f()LhR3;
    .locals 1

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->g()LhR3;

    move-result-object v0

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "McEliece-CCA2"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 8

    :try_start_0
    new-instance v7, LjO2;

    invoke-virtual {p0}, Lfv;->e()I

    move-result v1

    invoke-virtual {p0}, Lfv;->d()I

    move-result v2

    invoke-virtual {p0}, Lfv;->a()LPA1;

    move-result-object v3

    invoke-virtual {p0}, Lfv;->b()LTX3;

    move-result-object v4

    invoke-virtual {p0}, Lfv;->f()LhR3;

    move-result-object v5

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LiO2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LIi6;->a(Ljava/lang/String;)LG9;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LjO2;-><init>(IILPA1;LTX3;LhR3;LG9;)V

    new-instance v0, LG9;

    sget-object v1, LBD3;->n:LN;

    invoke-direct {v0, v1}, LG9;-><init>(LN;)V

    new-instance v1, Ll64;

    invoke-direct {v1, v0, v7}, Ll64;-><init>(LG9;LE;)V

    invoke-virtual {v1}, LM;->getEncoded()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lfv;->b:LkO2;

    invoke-virtual {v0}, LkO2;->e()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lfv;->b:LkO2;

    invoke-virtual {v1}, LkO2;->f()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lfv;->b:LkO2;

    invoke-virtual {v1}, LkO2;->b()LPA1;

    move-result-object v1

    invoke-virtual {v1}, LPA1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lfv;->b:LkO2;

    invoke-virtual {v1}, LkO2;->c()LTX3;

    move-result-object v1

    invoke-virtual {v1}, LTX3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lfv;->b:LkO2;

    invoke-virtual {v1}, LkO2;->g()LhR3;

    move-result-object v1

    invoke-virtual {v1}, LhR3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lfv;->b:LkO2;

    invoke-virtual {v1}, LkO2;->d()LOA1;

    move-result-object v1

    invoke-virtual {v1}, LOA1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
