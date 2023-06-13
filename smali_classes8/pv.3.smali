.class public Lpv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PublicKey;
.implements Ljava/security/Key;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public transient b:LN;

.field public transient c:Lvg5;


# direct methods
.method public constructor <init>(LcT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lpv;->a(LcT5;)V

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

    invoke-virtual {p0, p1}, Lpv;->a(LcT5;)V

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

    invoke-virtual {p0}, Lpv;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LcT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LcT5;->j()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->s()LE;

    move-result-object v0

    invoke-static {v0}, Lsg5;->j(Ljava/lang/Object;)Lsg5;

    move-result-object v0

    invoke-virtual {v0}, Lsg5;->o()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v0

    iput-object v0, p0, Lpv;->b:LN;

    invoke-static {p1}, Lja4;->a(LcT5;)Lcp;

    move-result-object p1

    check-cast p1, Lvg5;

    iput-object p1, p0, Lpv;->c:Lvg5;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpv;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lpv;

    iget-object v1, p0, Lpv;->b:LN;

    iget-object v3, p1, Lpv;->b:LN;

    invoke-virtual {v1, v3}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lpv;->c:Lvg5;

    invoke-virtual {v1}, Lvg5;->b()[B

    move-result-object v1

    iget-object p1, p1, Lpv;->c:Lvg5;

    invoke-virtual {p1}, Lvg5;->b()[B

    move-result-object p1

    invoke-static {v1, p1}, LAo;->a([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "SPHINCS-256"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 5

    :try_start_0
    iget-object v0, p0, Lpv;->c:Lvg5;

    invoke-virtual {v0}, Ltg5;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpv;->c:Lvg5;

    invoke-static {v0}, LdT5;->a(Lcp;)LcT5;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, LG9;

    sget-object v1, LBD3;->r:LN;

    new-instance v2, Lsg5;

    new-instance v3, LG9;

    iget-object v4, p0, Lpv;->b:LN;

    invoke-direct {v3, v4}, LG9;-><init>(LN;)V

    invoke-direct {v2, v3}, Lsg5;-><init>(LG9;)V

    invoke-direct {v0, v1, v2}, LG9;-><init>(LN;LE;)V

    new-instance v1, LcT5;

    iget-object v2, p0, Lpv;->c:Lvg5;

    invoke-virtual {v2}, Lvg5;->b()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, LcT5;-><init>(LG9;[B)V

    move-object v0, v1

    :goto_0
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

    iget-object v0, p0, Lpv;->b:LN;

    invoke-virtual {v0}, LN;->hashCode()I

    move-result v0

    iget-object v1, p0, Lpv;->c:Lvg5;

    invoke-virtual {v1}, Lvg5;->b()[B

    move-result-object v1

    invoke-static {v1}, LAo;->k([B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method
