.class public Lnv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PublicKey;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public b:[[S

.field public c:[[S

.field public d:[S

.field public e:I


# direct methods
.method public constructor <init>(I[[S[[S[S)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnv;->e:I

    iput-object p2, p0, Lnv;->b:[[S

    iput-object p3, p0, Lnv;->c:[[S

    iput-object p4, p0, Lnv;->d:[S

    return-void
.end method

.method public constructor <init>(Lbn4;)V
    .locals 3

    invoke-virtual {p1}, Lbn4;->d()I

    move-result v0

    invoke-virtual {p1}, Lbn4;->a()[[S

    move-result-object v1

    invoke-virtual {p1}, Lbn4;->c()[[S

    move-result-object v2

    invoke-virtual {p1}, Lbn4;->b()[S

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lnv;-><init>(I[[S[[S[S)V

    return-void
.end method


# virtual methods
.method public a()[[S
    .locals 1

    iget-object v0, p0, Lnv;->b:[[S

    return-object v0
.end method

.method public b()[S
    .locals 1

    iget-object v0, p0, Lnv;->d:[S

    invoke-static {v0}, LAo;->e([S)[S

    move-result-object v0

    return-object v0
.end method

.method public c()[[S
    .locals 4

    iget-object v0, p0, Lnv;->c:[[S

    array-length v0, v0

    new-array v0, v0, [[S

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lnv;->c:[[S

    array-length v3, v2

    if-eq v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-static {v2}, LAo;->e([S)[S

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lnv;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Lnv;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lnv;

    iget v1, p0, Lnv;->e:I

    invoke-virtual {p1}, Lnv;->d()I

    move-result v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lnv;->b:[[S

    invoke-virtual {p1}, Lnv;->a()[[S

    move-result-object v2

    invoke-static {v1, v2}, Lcn4;->j([[S[[S)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnv;->c:[[S

    invoke-virtual {p1}, Lnv;->c()[[S

    move-result-object v2

    invoke-static {v1, v2}, Lcn4;->j([[S[[S)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnv;->d:[S

    invoke-virtual {p1}, Lnv;->b()[S

    move-result-object p1

    invoke-static {v1, p1}, Lcn4;->i([S[S)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "Rainbow"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 5

    new-instance v0, Lan4;

    iget v1, p0, Lnv;->e:I

    iget-object v2, p0, Lnv;->b:[[S

    iget-object v3, p0, Lnv;->c:[[S

    iget-object v4, p0, Lnv;->d:[S

    invoke-direct {v0, v1, v2, v3, v4}, Lan4;-><init>(I[[S[[S[S)V

    new-instance v1, LG9;

    sget-object v2, LBD3;->a:LN;

    sget-object v3, LTF0;->b:LTF0;

    invoke-direct {v1, v2, v3}, LG9;-><init>(LN;LE;)V

    invoke-static {v1, v0}, LTk2;->a(LG9;LE;)[B

    move-result-object v0

    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "X.509"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lnv;->e:I

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lnv;->b:[[S

    invoke-static {v1}, LAo;->p([[S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lnv;->c:[[S

    invoke-static {v1}, LAo;->p([[S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lnv;->d:[S

    invoke-static {v1}, LAo;->o([S)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
