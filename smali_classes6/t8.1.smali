.class public final Lt8;
.super LXE2;
.source "SourceFile"


# instance fields
.field public final a:Lw8;

.field public final b:LLq5;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lw8;LLq5;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, LXE2;-><init>()V

    iput-object p1, p0, Lt8;->a:Lw8;

    iput-object p2, p0, Lt8;->b:LLq5;

    iput-object p3, p0, Lt8;->c:Ljava/lang/Integer;

    return-void
.end method

.method public static d(Lw8;LLq5;Ljava/lang/Integer;)Lt8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, LLq5;->b()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lw8;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Cannot create key without ID requirement with format with ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lw8;->e()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Cannot create key with ID requirement with format without ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    new-instance v0, Lt8;

    invoke-direct {v0, p0, p1, p2}, Lt8;-><init>(Lw8;LLq5;Ljava/lang/Integer;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Invalid key size"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic a()LJE3;
    .locals 1

    invoke-virtual {p0}, Lt8;->e()Lw8;

    move-result-object v0

    return-object v0
.end method

.method public b()LQ70;
    .locals 4

    iget-object v0, p0, Lt8;->a:Lw8;

    invoke-virtual {v0}, Lw8;->d()Lw8$a;

    move-result-object v0

    sget-object v1, Lw8$a;->e:Lw8$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-array v0, v2, [B

    invoke-static {v0}, LQ70;->a([B)LQ70;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lt8;->a:Lw8;

    invoke-virtual {v0}, Lw8;->d()Lw8$a;

    move-result-object v0

    sget-object v1, Lw8$a;->d:Lw8$a;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lt8;->a:Lw8;

    invoke-virtual {v0}, Lw8;->d()Lw8$a;

    move-result-object v0

    sget-object v1, Lw8$a;->c:Lw8$a;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lt8;->a:Lw8;

    invoke-virtual {v0}, Lw8;->d()Lw8$a;

    move-result-object v0

    sget-object v1, Lw8$a;->b:Lw8$a;

    if-ne v0, v1, :cond_2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lt8;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, LQ70;->a([B)LQ70;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown AesCmacParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lt8;->a:Lw8;

    invoke-virtual {v2}, Lw8;->d()Lw8$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lt8;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, LQ70;->a([B)LQ70;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()LYE2;
    .locals 1

    invoke-virtual {p0}, Lt8;->e()Lw8;

    move-result-object v0

    return-object v0
.end method

.method public e()Lw8;
    .locals 1

    iget-object v0, p0, Lt8;->a:Lw8;

    return-object v0
.end method
