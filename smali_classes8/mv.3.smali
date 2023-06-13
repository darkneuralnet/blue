.class public Lmv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivateKey;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public b:[[S

.field public c:[S

.field public d:[[S

.field public e:[S

.field public f:[Lgm2;

.field public g:[I


# direct methods
.method public constructor <init>(LZm4;)V
    .locals 7

    invoke-virtual {p1}, LZm4;->c()[[S

    move-result-object v1

    invoke-virtual {p1}, LZm4;->a()[S

    move-result-object v2

    invoke-virtual {p1}, LZm4;->d()[[S

    move-result-object v3

    invoke-virtual {p1}, LZm4;->b()[S

    move-result-object v4

    invoke-virtual {p1}, LZm4;->f()[I

    move-result-object v5

    invoke-virtual {p1}, LZm4;->e()[Lgm2;

    move-result-object v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lmv;-><init>([[S[S[[S[S[I[Lgm2;)V

    return-void
.end method

.method public constructor <init>([[S[S[[S[S[I[Lgm2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv;->b:[[S

    iput-object p2, p0, Lmv;->c:[S

    iput-object p3, p0, Lmv;->d:[[S

    iput-object p4, p0, Lmv;->e:[S

    iput-object p5, p0, Lmv;->g:[I

    iput-object p6, p0, Lmv;->f:[Lgm2;

    return-void
.end method


# virtual methods
.method public a()[S
    .locals 1

    iget-object v0, p0, Lmv;->c:[S

    return-object v0
.end method

.method public b()[S
    .locals 1

    iget-object v0, p0, Lmv;->e:[S

    return-object v0
.end method

.method public c()[[S
    .locals 1

    iget-object v0, p0, Lmv;->b:[[S

    return-object v0
.end method

.method public d()[[S
    .locals 1

    iget-object v0, p0, Lmv;->d:[[S

    return-object v0
.end method

.method public e()[Lgm2;
    .locals 1

    iget-object v0, p0, Lmv;->f:[Lgm2;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    instance-of v1, p1, Lmv;

    if-nez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    check-cast p1, Lmv;

    iget-object v1, p0, Lmv;->b:[[S

    invoke-virtual {p1}, Lmv;->c()[[S

    move-result-object v2

    invoke-static {v1, v2}, Lcn4;->j([[S[[S)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lmv;->d:[[S

    invoke-virtual {p1}, Lmv;->d()[[S

    move-result-object v3

    invoke-static {v1, v3}, Lcn4;->j([[S[[S)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v0

    :goto_1
    if-eqz v1, :cond_3

    iget-object v1, p0, Lmv;->c:[S

    invoke-virtual {p1}, Lmv;->a()[S

    move-result-object v3

    invoke-static {v1, v3}, Lcn4;->i([S[S)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    if-eqz v1, :cond_4

    iget-object v1, p0, Lmv;->e:[S

    invoke-virtual {p1}, Lmv;->b()[S

    move-result-object v3

    invoke-static {v1, v3}, Lcn4;->i([S[S)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    move v1, v0

    :goto_3
    if-eqz v1, :cond_5

    iget-object v1, p0, Lmv;->g:[I

    invoke-virtual {p1}, Lmv;->f()[I

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    move v1, v0

    :goto_4
    iget-object v3, p0, Lmv;->f:[Lgm2;

    array-length v3, v3

    invoke-virtual {p1}, Lmv;->e()[Lgm2;

    move-result-object v4

    array-length v4, v4

    if-eq v3, v4, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lmv;->f:[Lgm2;

    array-length v0, v0

    sub-int/2addr v0, v2

    :goto_5
    if-ltz v0, :cond_7

    iget-object v2, p0, Lmv;->f:[Lgm2;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Lmv;->e()[Lgm2;

    move-result-object v3

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lgm2;->equals(Ljava/lang/Object;)Z

    move-result v2

    and-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_5

    :cond_7
    return v1

    :cond_8
    :goto_6
    return v0
.end method

.method public f()[I
    .locals 1

    iget-object v0, p0, Lmv;->g:[I

    return-object v0
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "Rainbow"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 8

    new-instance v7, LYm4;

    iget-object v1, p0, Lmv;->b:[[S

    iget-object v2, p0, Lmv;->c:[S

    iget-object v3, p0, Lmv;->d:[[S

    iget-object v4, p0, Lmv;->e:[S

    iget-object v5, p0, Lmv;->g:[I

    iget-object v6, p0, Lmv;->f:[Lgm2;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LYm4;-><init>([[S[S[[S[S[I[Lgm2;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, LG9;

    sget-object v2, LBD3;->a:LN;

    sget-object v3, LTF0;->b:LTF0;

    invoke-direct {v1, v2, v3}, LG9;-><init>(LN;LE;)V

    new-instance v2, Ll64;

    invoke-direct {v2, v1, v7}, Ll64;-><init>(LG9;LE;)V
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
    .locals 3

    iget-object v0, p0, Lmv;->f:[Lgm2;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lmv;->b:[[S

    invoke-static {v1}, LAo;->p([[S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lmv;->c:[S

    invoke-static {v1}, LAo;->o([S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lmv;->d:[[S

    invoke-static {v1}, LAo;->p([[S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lmv;->e:[S

    invoke-static {v1}, LAo;->o([S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lmv;->g:[I

    invoke-static {v1}, LAo;->n([I)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lmv;->f:[Lgm2;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    mul-int/lit8 v0, v0, 0x25

    iget-object v2, p0, Lmv;->f:[Lgm2;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lgm2;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    return v0
.end method
