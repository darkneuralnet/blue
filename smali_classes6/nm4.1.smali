.class public Lnm4;
.super Lmm4;
.source "SourceFile"

# interfaces
.implements Lah2;


# instance fields
.field public final c:Ljava/security/interfaces/RSAPublicKey;

.field public final d:Ljavax/crypto/SecretKey;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnm4;-><init>(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;)V
    .locals 2

    invoke-direct {p0}, Lmm4;-><init>()V

    if-eqz p1, :cond_2

    iput-object p1, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    new-instance p1, Ljava/util/HashSet;

    const-string v0, "AES"

    const-string v1, "ChaCha20"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object p2, p0, Lnm4;->d:Ljavax/crypto/SecretKey;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The algorithm of the content encryption key (CEK) must be AES or ChaCha20"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lnm4;->d:Ljavax/crypto/SecretKey;

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The public RSA key must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public encrypt(Lbh2;[B)LYg2;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    invoke-virtual {p1}, Lbh2;->r()LXg2;

    move-result-object v0

    invoke-virtual {p1}, Lbh2;->t()LUc1;

    move-result-object v1

    iget-object v2, p0, Lnm4;->d:Ljavax/crypto/SecretKey;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v2

    invoke-virtual {v2}, LBg2;->b()Ljava/security/SecureRandom;

    move-result-object v2

    invoke-static {v1, v2}, LhA0;->d(LUc1;Ljava/security/SecureRandom;)Ljavax/crypto/SecretKey;

    move-result-object v2

    :goto_0
    sget-object v1, LXg2;->e:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-virtual {v1}, Lch2;->e()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v2, v1}, Llm4;->a(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;Ljava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v1, LXg2;->f:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-virtual {v1}, Lch2;->e()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lsm4;->a(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;Ljava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    goto :goto_1

    :cond_2
    sget-object v1, LXg2;->g:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-virtual {v1}, Lch2;->e()Ljava/security/Provider;

    move-result-object v1

    const/16 v3, 0x100

    invoke-static {v0, v2, v3, v1}, Ltm4;->a(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILjava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    goto :goto_1

    :cond_3
    sget-object v1, LXg2;->h:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-virtual {v1}, Lch2;->e()Ljava/security/Provider;

    move-result-object v1

    const/16 v3, 0x180

    invoke-static {v0, v2, v3, v1}, Ltm4;->a(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILjava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v1, LXg2;->i:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v0, p0, Lnm4;->c:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-virtual {v1}, Lch2;->e()Ljava/security/Provider;

    move-result-object v1

    const/16 v3, 0x200

    invoke-static {v0, v2, v3, v1}, Ltm4;->a(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILjava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, LIy;->e([B)LIy;

    move-result-object v0

    :goto_1
    invoke-virtual {p0}, Lmm4;->getJCAContext()Lch2;

    move-result-object v1

    invoke-static {p1, p2, v2, v0, v1}, LhA0;->c(Lbh2;[BLjavax/crypto/SecretKey;LIy;Lch2;)LYg2;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Lmm4;->a:Ljava/util/Set;

    invoke-static {v0, p2}, LJ9;->c(LXg2;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
