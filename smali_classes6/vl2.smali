.class public final Lvl2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8;


# static fields
.field public static final c:[B


# instance fields
.field public final a:LKk2;

.field public final b:Lp8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lvl2;->c:[B

    return-void
.end method

.method public constructor <init>(LKk2;Lp8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl2;->a:LKk2;

    iput-object p2, p0, Lvl2;->b:Lp8;

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, Lvl2;->a:LKk2;

    invoke-static {v0}, LNt4;->i(LKk2;)Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/F;->e()[B

    move-result-object v0

    iget-object v1, p0, Lvl2;->b:Lp8;

    sget-object v2, Lvl2;->c:[B

    invoke-interface {v1, v0, v2}, Lp8;->a([B[B)[B

    move-result-object v1

    iget-object v2, p0, Lvl2;->a:LKk2;

    invoke-virtual {v2}, LKk2;->L()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lp8;

    invoke-static {v2, v0, v3}, LNt4;->f(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp8;

    invoke-interface {v0, p1, p2}, Lp8;->a([B[B)[B

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lvl2;->c([B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const-string v0, "invalid ciphertext"

    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    if-lez v2, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    if-gt v2, p1, :cond_0

    new-array p1, v2, [B

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lvl2;->b:Lp8;

    sget-object v3, Lvl2;->c:[B

    invoke-interface {v1, p1, v3}, Lp8;->b([B[B)[B

    move-result-object p1

    iget-object v1, p0, Lvl2;->a:LKk2;

    invoke-virtual {v1}, LKk2;->L()Ljava/lang/String;

    move-result-object v1

    const-class v3, Lp8;

    invoke-static {v1, p1, v3}, LNt4;->f(Ljava/lang/String;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8;

    invoke-interface {p1, v2, p2}, Lp8;->b([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-direct {p2, v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final c([B[B)[B
    .locals 2

    array-length v0, p1

    add-int/lit8 v0, v0, 0x4

    array-length v1, p2

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method
