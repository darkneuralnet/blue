.class public Luv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivateKey;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public transient b:Lsb4;

.field public transient c:LW;


# direct methods
.method public constructor <init>(Ll64;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Luv;->a(Ll64;)V

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

    invoke-virtual {p0, p1}, Luv;->a(Ll64;)V

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

    invoke-virtual {p0}, Luv;->getEncoded()[B

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

    iput-object v0, p0, Luv;->c:LW;

    invoke-static {p1}, Lk64;->b(Ll64;)Lcp;

    move-result-object p1

    check-cast p1, Lsb4;

    iput-object p1, p0, Luv;->b:Lsb4;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luv;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Luv;

    iget-object v1, p0, Luv;->b:Lsb4;

    invoke-virtual {v1}, Lsb4;->b()I

    move-result v1

    iget-object v3, p1, Luv;->b:Lsb4;

    invoke-virtual {v3}, Lsb4;->b()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Luv;->b:Lsb4;

    invoke-virtual {v1}, Lsb4;->a()[B

    move-result-object v1

    iget-object p1, p1, Luv;->b:Lsb4;

    invoke-virtual {p1}, Lsb4;->a()[B

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

    iget-object v0, p0, Luv;->b:Lsb4;

    invoke-virtual {v0}, Lsb4;->b()I

    move-result v0

    invoke-static {v0}, Lub4;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    :try_start_0
    iget-object v0, p0, Luv;->b:Lsb4;

    iget-object v1, p0, Luv;->c:LW;

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

    iget-object v0, p0, Luv;->b:Lsb4;

    invoke-virtual {v0}, Lsb4;->b()I

    move-result v0

    iget-object v1, p0, Luv;->b:Lsb4;

    invoke-virtual {v1}, Lsb4;->a()[B

    move-result-object v1

    invoke-static {v1}, LAo;->k([B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method
