.class public final Lt32;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LV46$b;

.field public static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljavax/crypto/SecretKey;

.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LV46$b;->c:LV46$b;

    sput-object v0, Lt32;->c:LV46$b;

    new-instance v0, Lt32$a;

    invoke-direct {v0}, Lt32$a;-><init>()V

    sput-object v0, Lt32;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lt32;->c:LV46$b;

    invoke-virtual {v0}, LV46$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    array-length v0, p1

    invoke-static {v0}, LAj6;->a(I)V

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lt32;->a:Ljavax/crypto/SecretKey;

    iput-boolean p2, p0, Lt32;->b:Z

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lt32;->d([BII)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static d([BII)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LvT5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LvT5;->a()I

    move-result v0

    const/16 v1, 0x13

    if-gt v0, v1, :cond_0

    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, p0, p1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    return-object v0

    :cond_0
    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v1, 0x80

    invoke-direct {v0, v1, p0, p1, p2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    return-object v0
.end method


# virtual methods
.method public a([B[B[B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    array-length v0, p1

    const/16 v1, 0xc

    if-ne v0, v1, :cond_7

    iget-boolean v0, p0, Lt32;->b:Z

    if-eqz v0, :cond_0

    const/16 v2, 0x1c

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    array-length v3, p2

    if-lt v3, v2, :cond_6

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {p2, v2, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "iv does not match prepended iv"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p1}, Lt32;->c([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    sget-object v0, Lt32;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljavax/crypto/Cipher;

    const/4 v4, 0x2

    iget-object v5, p0, Lt32;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v3, v4, v5, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p3, :cond_3

    array-length p1, p3

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/crypto/Cipher;

    invoke-virtual {p1, p3}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_3
    iget-boolean p1, p0, Lt32;->b:Z

    if-eqz p1, :cond_4

    move v2, v1

    :cond_4
    if-eqz p1, :cond_5

    array-length p1, p2

    sub-int/2addr p1, v1

    goto :goto_2

    :cond_5
    array-length p1, p2

    :goto_2
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljavax/crypto/Cipher;

    invoke-virtual {p3, p2, v2, p1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "iv is wrong size"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B[B[B)[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    array-length v0, p1

    const/16 v1, 0xc

    if-ne v0, v1, :cond_6

    array-length v0, p2

    const v2, 0x7fffffe3

    if-gt v0, v2, :cond_5

    iget-boolean v0, p0, Lt32;->b:Z

    const/16 v2, 0x10

    if-eqz v0, :cond_0

    array-length v3, p2

    add-int/2addr v3, v1

    goto :goto_0

    :cond_0
    array-length v3, p2

    :goto_0
    add-int/2addr v3, v2

    new-array v3, v3, [B

    const/4 v10, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1, v10, v3, v10, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    invoke-static {p1}, Lt32;->c([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    sget-object v0, Lt32;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljavax/crypto/Cipher;

    iget-object v5, p0, Lt32;->a:Ljavax/crypto/SecretKey;

    const/4 v11, 0x1

    invoke-virtual {v4, v11, v5, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p3, :cond_2

    array-length p1, p3

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/crypto/Cipher;

    invoke-virtual {p1, p3}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_2
    iget-boolean p1, p0, Lt32;->b:Z

    if-eqz p1, :cond_3

    move v9, v1

    goto :goto_1

    :cond_3
    move v9, v10

    :goto_1
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljavax/crypto/Cipher;

    const/4 v6, 0x0

    array-length v7, p2

    move-object v5, p2

    move-object v8, v3

    invoke-virtual/range {v4 .. v9}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    array-length p3, p2

    add-int/2addr p3, v2

    if-ne p1, p3, :cond_4

    return-object v3

    :cond_4
    array-length p2, p2

    sub-int/2addr p1, p2

    new-instance p2, Ljava/security/GeneralSecurityException;

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p3, v10

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, v11

    const-string p1, "encryption failed; GCM tag must be %s bytes, but got only %s bytes"

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "iv is wrong size"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
