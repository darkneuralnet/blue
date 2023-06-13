.class public Ltv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PublicKey;


# static fields
.field private static final serialVersionUID:J = -0x4df536aca40a3826L


# instance fields
.field public transient b:LVH6;

.field public transient c:LN;


# direct methods
.method public constructor <init>(LcT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ltv;->a(LcT5;)V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-static {p1}, LcT5;->o(Ljava/lang/Object;)LcT5;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltv;->a(LcT5;)V

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    invoke-virtual {p0}, Ltv;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LcT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lja4;->a(LcT5;)Lcp;

    move-result-object p1

    check-cast p1, LVH6;

    iput-object p1, p0, Ltv;->b:LVH6;

    invoke-virtual {p1}, LEH6;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS31;->a(Ljava/lang/String;)LN;

    move-result-object p1

    iput-object p1, p0, Ltv;->c:LN;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltv;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ltv;

    :try_start_0
    iget-object v1, p0, Ltv;->c:LN;

    iget-object v3, p1, Ltv;->c:LN;

    invoke-virtual {v1, v3}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltv;->b:LVH6;

    invoke-virtual {v1}, LVH6;->getEncoded()[B

    move-result-object v1

    iget-object p1, p1, Ltv;->b:LVH6;

    invoke-virtual {p1}, LVH6;->getEncoded()[B

    move-result-object p1

    invoke-static {v1, p1}, LAo;->a([B[B)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :catch_0
    :cond_2
    return v2
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "XMSS"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    :try_start_0
    iget-object v0, p0, Ltv;->b:LVH6;

    invoke-static {v0}, LdT5;->a(Lcp;)LcT5;

    move-result-object v0

    invoke-virtual {v0}, LM;->getEncoded()[B

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

    const-string v0, "X.509"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltv;->c:LN;

    invoke-virtual {v0}, LN;->hashCode()I

    move-result v0

    iget-object v1, p0, Ltv;->b:LVH6;

    invoke-virtual {v1}, LVH6;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, LAo;->k([B)I

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0

    :catch_0
    iget-object v0, p0, Ltv;->c:LN;

    invoke-virtual {v0}, LN;->hashCode()I

    move-result v0

    return v0
.end method
