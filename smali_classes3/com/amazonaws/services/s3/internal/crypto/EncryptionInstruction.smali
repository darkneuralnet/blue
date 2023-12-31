.class public Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final encryptedSymmetricKey:[B

.field private final materialsDescription:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final symmetricCipher:Ljavax/crypto/Cipher;

.field private final symmetricCipherFactory:Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;


# direct methods
.method public constructor <init>(Ljava/util/Map;[BLjavax/crypto/SecretKey;Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Ljavax/crypto/SecretKey;",
            "Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->materialsDescription:Ljava/util/Map;

    iput-object p2, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->encryptedSymmetricKey:[B

    iput-object p4, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipherFactory:Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;

    invoke-virtual {p4}, Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;->createCipher()Ljavax/crypto/Cipher;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipher:Ljavax/crypto/Cipher;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;[BLjavax/crypto/SecretKey;Ljavax/crypto/Cipher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Ljavax/crypto/SecretKey;",
            "Ljavax/crypto/Cipher;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->materialsDescription:Ljava/util/Map;

    iput-object p2, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->encryptedSymmetricKey:[B

    iput-object p4, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipher:Ljavax/crypto/Cipher;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipherFactory:Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;

    return-void
.end method


# virtual methods
.method public getCipherFactory()Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipherFactory:Lcom/amazonaws/services/s3/internal/crypto/CipherFactory;

    return-object v0
.end method

.method public getEncryptedSymmetricKey()[B
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->encryptedSymmetricKey:[B

    return-object v0
.end method

.method public getMaterialsDescription()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->materialsDescription:Ljava/util/Map;

    return-object v0
.end method

.method public getSymmetricCipher()Ljavax/crypto/Cipher;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/crypto/EncryptionInstruction;->symmetricCipher:Ljavax/crypto/Cipher;

    return-object v0
.end method
