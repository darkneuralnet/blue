.class public Lf41;
.super Ld41;
.source "SourceFile"

# interfaces
.implements Lah2;


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    invoke-direct {p0, p1}, Ld41;-><init>(Ljavax/crypto/SecretKey;)V

    return-void
.end method

.method public constructor <init>(Lme3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    const-string v0, "AES"

    invoke-virtual {p1, v0}, Lme3;->r(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object p1

    invoke-direct {p0, p1}, Lf41;-><init>(Ljavax/crypto/SecretKey;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {p0, v0}, Lf41;-><init>(Ljavax/crypto/SecretKey;)V

    return-void
.end method


# virtual methods
.method public encrypt(Lbh2;[B)LYg2;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    invoke-virtual {p1}, Lbh2;->r()LXg2;

    move-result-object v0

    sget-object v1, LXg2;->m:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lbh2;->t()LUc1;

    move-result-object v0

    invoke-virtual {v0}, LUc1;->b()I

    move-result v1

    invoke-virtual {p0}, Ld41;->getKey()Ljavax/crypto/SecretKey;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-static {v2}, LN70;->f([B)I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Ld41;->getKey()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {p0}, Ld41;->getJCAContext()Lch2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v2, v1}, LhA0;->c(Lbh2;[BLjavax/crypto/SecretKey;LIy;Lch2;)LYg2;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    invoke-virtual {v0}, LUc1;->b()I

    move-result p2

    invoke-direct {p1, p2, v0}, Lcom/nimbusds/jose/KeyLengthException;-><init>(ILE9;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Ld41;->SUPPORTED_ALGORITHMS:Ljava/util/Set;

    invoke-static {v0, p2}, LJ9;->c(LXg2;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
