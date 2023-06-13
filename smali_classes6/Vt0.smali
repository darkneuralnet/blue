.class public final LVt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljavax/crypto/SecretKey;

.field public final b:Ljavax/crypto/SecretKey;

.field public final c:Ljavax/crypto/SecretKey;

.field public final d:I


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVt0;->a:Ljavax/crypto/SecretKey;

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    array-length v0, p1

    const-string v1, "AES"

    const/4 v2, 0x0

    const/16 v3, 0x20

    if-ne v0, v3, :cond_0

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "HMACSHA256"

    const/16 v4, 0x10

    invoke-direct {v0, p1, v2, v4, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->b:Ljavax/crypto/SecretKey;

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, p1, v4, v4, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->c:Ljavax/crypto/SecretKey;

    iput v4, p0, LVt0;->d:I

    goto :goto_0

    :cond_0
    array-length v0, p1

    const/16 v4, 0x30

    if-ne v0, v4, :cond_1

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "HMACSHA384"

    const/16 v4, 0x18

    invoke-direct {v0, p1, v2, v4, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->b:Ljavax/crypto/SecretKey;

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, p1, v4, v4, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->c:Ljavax/crypto/SecretKey;

    iput v4, p0, LVt0;->d:I

    goto :goto_0

    :cond_1
    array-length v0, p1

    const/16 v4, 0x40

    if-ne v0, v4, :cond_2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v4, "HMACSHA512"

    invoke-direct {v0, p1, v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->b:Ljavax/crypto/SecretKey;

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, p1, v3, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, LVt0;->c:Ljavax/crypto/SecretKey;

    iput v3, p0, LVt0;->d:I

    :goto_0
    return-void

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    const-string v0, "Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits"

    invoke-direct {p1, v0}, Lcom/nimbusds/jose/KeyLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljavax/crypto/SecretKey;
    .locals 1

    iget-object v0, p0, LVt0;->c:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method public b()Ljavax/crypto/SecretKey;
    .locals 1

    iget-object v0, p0, LVt0;->b:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LVt0;->d:I

    return v0
.end method
