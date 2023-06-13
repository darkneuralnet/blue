.class public Lqv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivateKey;


# static fields
.field private static final serialVersionUID:J = 0x6a9c720efa7851b3L


# instance fields
.field public transient b:LN;

.field public transient c:LLH6;

.field public transient d:LW;


# direct methods
.method public constructor <init>(Ll64;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lqv;->a(Ll64;)V

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

    invoke-static {p1}, Ll64;->o(Ljava/lang/Object;)Ll64;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqv;->a(Ll64;)V

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

    invoke-virtual {p0}, Lqv;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Ll64;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ll64;->j()LW;

    move-result-object v0

    iput-object v0, p0, Lqv;->d:LW;

    invoke-virtual {p1}, Ll64;->s()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->s()LE;

    move-result-object v0

    invoke-static {v0}, LIH6;->o(Ljava/lang/Object;)LIH6;

    move-result-object v0

    invoke-virtual {v0}, LIH6;->u()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v0

    iput-object v0, p0, Lqv;->b:LN;

    invoke-static {p1}, Lk64;->b(Ll64;)Lcp;

    move-result-object p1

    check-cast p1, LLH6;

    iput-object p1, p0, Lqv;->c:LLH6;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqv;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lqv;

    iget-object v1, p0, Lqv;->b:LN;

    iget-object v3, p1, Lqv;->b:LN;

    invoke-virtual {v1, v3}, LS;->u(LS;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lqv;->c:LLH6;

    invoke-virtual {v1}, LLH6;->c()[B

    move-result-object v1

    iget-object p1, p1, Lqv;->c:LLH6;

    invoke-virtual {p1}, LLH6;->c()[B

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

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "XMSSMT"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqv;->c:LLH6;

    iget-object v1, p0, Lqv;->d:LW;

    invoke-static {v0, v1}, Lm64;->a(Lcp;LW;)Ll64;

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

    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lqv;->b:LN;

    invoke-virtual {v0}, LN;->hashCode()I

    move-result v0

    iget-object v1, p0, Lqv;->c:LLH6;

    invoke-virtual {v1}, LLH6;->c()[B

    move-result-object v1

    invoke-static {v1}, LAo;->k([B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method
