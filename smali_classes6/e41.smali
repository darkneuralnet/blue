.class public Le41;
.super Ld41;
.source "SourceFile"

# interfaces
.implements LZg2;


# instance fields
.field public final a:Z

.field public final b:LKE0;


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    invoke-direct {p0, p1}, Ld41;-><init>(Ljavax/crypto/SecretKey;)V

    new-instance p1, LKE0;

    invoke-direct {p1}, LKE0;-><init>()V

    iput-object p1, p0, Le41;->b:LKE0;

    iput-boolean p2, p0, Le41;->a:Z

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

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Le41;-><init>(Ljavax/crypto/SecretKey;Z)V

    return-void
.end method


# virtual methods
.method public a(Lbh2;LIy;LIy;LIy;LIy;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    iget-boolean v0, p0, Le41;->a:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lbh2;->r()LXg2;

    move-result-object v0

    sget-object v1, LXg2;->m:LXg2;

    invoke-virtual {v0, v1}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Unexpected present JWE encrypted key"

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Ld41;->SUPPORTED_ALGORITHMS:Ljava/util/Set;

    invoke-static {v0, p2}, LJ9;->c(LXg2;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p2, p0, Le41;->b:LKE0;

    invoke-virtual {p2, p1}, LKE0;->a(Lbh2;)V

    const/4 v1, 0x0

    invoke-virtual {p0}, Ld41;->getKey()Ljavax/crypto/SecretKey;

    move-result-object v5

    invoke-virtual {p0}, Ld41;->getJCAContext()Lch2;

    move-result-object v6

    move-object v0, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v6}, LhA0;->b(Lbh2;LIy;LIy;LIy;LIy;Ljavax/crypto/SecretKey;Lch2;)[B

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Missing JWE authentication tag"

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Unexpected present JWE initialization vector (IV)"

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
